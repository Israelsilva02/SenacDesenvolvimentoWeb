package controller;



@PostMapping("/salvar")
public ModelAndView salvar(@ModelAttribute("dados") @Valid Dados dadosRecebidos,
BindingResult bindingResult, RedirectAttributes redirAttr) {
// Verifica se houve erros durante validação
if (bindingResult.hasErrors()) {
// Reapresenta formulário
return new ModelAndView("formulario");
} 	
// Gera resposta indicando redirecionamento para /resultado
ModelAndView mv = new ModelAndView("redirect:/resultado");
// Configura os dadosRecebidos como um atributo flash
// (mantido em sessão entre duas requisições consecutivas)
redirAttr.addFlashAttribute("dados", dadosRecebidos);
return mv;
}