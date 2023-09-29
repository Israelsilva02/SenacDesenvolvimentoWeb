package instituicao;

class GraduacaoEAD implements Curso {
    private String polo;

    public GraduacaoEAD(String polo) {
        this.polo = polo;
    }

    @Override
    public String obterModalidade() {
        return "EAD - Polo: " + polo;
    }

    @Override
    public String obterRequisitoDiploma() {
        return "Ensino médio";
    }
}