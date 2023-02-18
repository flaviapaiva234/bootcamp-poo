package br.com.dio.desafio.dominio;

public abstract class Conteudo {  // Herança / A abstrada classe conteudo é mãe das classes curso e mentoria
    protected static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract double caucularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
