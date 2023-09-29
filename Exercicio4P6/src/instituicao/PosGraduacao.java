package instituicao;

class PosGraduacao implements Curso {
    private String unidade;

    public PosGraduacao(String unidade) {
        this.unidade = unidade;
    }

    @Override
    public String obterModalidade() {
        return "Pós-graduação - Unidade: " + unidade;
    }

    @Override
    public String obterRequisitoDiploma() {
        return "Graduação";
    }
}
