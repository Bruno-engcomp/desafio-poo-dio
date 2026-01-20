package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private double cargaHoraria;

    public Curso() {
    }

    public double calcularXp()
    {
        return XP_PADRAO * cargaHoraria;
    }

    public double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "cargaHoraria=" + cargaHoraria +
                ", titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                '}';
    }

}
