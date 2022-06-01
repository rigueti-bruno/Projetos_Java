package br.com.dio;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b));

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
    }

}

class Livro {
    private String nome;
    private Integer numpages;

    public Livro(String nome, Integer numpages) {
        this.nome = nome;
        this.numpages = numpages;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpages() {
        return numpages;
    }

    public void setNumpages(Integer numpages) {
        this.numpages = numpages;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpages=" + numpages +
                '}';
    }
}