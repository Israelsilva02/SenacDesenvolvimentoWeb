package instituicao;

public class TesteInstituicao {
	
	    public static void main(String[] args) {
	        Curso cursoPresencial = CursoFactory.criarCursoPresencial("Campus A");
	        Curso cursoEAD = CursoFactory.criarCursoEAD("Polo X");
	        Curso cursoPosGraduacao = CursoFactory.criarCursoPosGraduacao("Campus B");

	        System.out.println(cursoPresencial.obterModalidade() + " - Requisito de Diploma: " + cursoPresencial.obterRequisitoDiploma());
	        System.out.println(cursoEAD.obterModalidade() + " - Requisito de Diploma: " + cursoEAD.obterRequisitoDiploma());
	        System.out.println(cursoPosGraduacao.obterModalidade() + " - Requisito de Diploma: " + cursoPosGraduacao.obterRequisitoDiploma());
	    }
	}