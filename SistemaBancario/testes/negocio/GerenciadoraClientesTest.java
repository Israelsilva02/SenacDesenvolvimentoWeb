package negocio;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;

public class GerenciadoraClientesTest {
	
	
	private GerenciadoraClientes gerClientes;
	private int idCliente01 = 1;
	private int idCliente02 = 2;
	
	@Before
	public void setUp() {
		Cliente cliente01 = new Cliente(idCliente01, "João", 31, "joao@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(idCliente02, "Maria", 34, "maria@gmail.com", 1, true);
		
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		gerClientes = new GerenciadoraClientes(clientesDoBanco);
	}
	
	@After
	public void tearDown() {
		gerClientes.limpa();
	}
	
	public void testPesquisaCliente() {
		Cliente cliente = gerClientes.pesquisaCliente(idCliente01);
		
		assertThat(cliente.getId(), is(idCliente01));
	}
	
	public void testRemoveCliente() {
		
		boolean clienteRemovido = gerClientes.removeCliente(idCliente02);
		assertThat(clienteRemovido, is(true));
		assertThat(gerClientes.getClientesDoBanco().size(), is(1));
		assertNull(gerClientes.pesquisaCliente(idCliente02));
		
		
	}
}
