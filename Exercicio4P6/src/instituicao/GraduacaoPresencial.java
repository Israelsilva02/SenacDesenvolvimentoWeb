package instituicao;

class GraduacaoPresencial implements Curso {
    private String local;

    public GraduacaoPresencial(String local) {
        this.local = local;
    }

    @Override
    public String obterModalidade() {
        return "Presencial - Local: " + local;
    }

    @Override
    public String obterRequisitoDiploma() {
        return "Ensino médio";
    }
}