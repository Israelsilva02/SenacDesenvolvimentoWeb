package instituicao;

class CursoFactory {
    public static Curso criarCursoPresencial(String local) {
        return new GraduacaoPresencial(local);
    }

    public static Curso criarCursoEAD(String polo) {
        return new GraduacaoEAD(polo);
    }

    public static Curso criarCursoPosGraduacao(String unidade) {
        return new PosGraduacao(unidade);
    }
}