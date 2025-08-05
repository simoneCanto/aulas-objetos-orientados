## Você precisa criar um Readme e realizar a descrição do seu Readme, aqui você explica porque você criou este repositório e o que tem nele.

public class Animal {
    // atributos da classe
    String tipoAnimal;
    String nomeAnimal;
    int numeroDePatas;
    boolean temRabo;
    String cor;
    int idade;
    double peso;
    String tipoAlimentacao;
    char genero;
    String somAnimal;
    // metódo para imprimir os atributos do Animal
    public void printStatus() {
        System.out.println("qual é o animal: " + tipoAnimal);
        System.out.println("nome: " + nomeAnimal);
        System.out.println("numero de patas: " + numeroDePatas);
        System.out.println("tem rabo? " + temRabo);
        System.out.println("cor: " + cor);
        System.out.println("idade: " + idade);
        System.out.println("peso: " + peso);
        System.out.println("tipo de alimentação: " + tipoAlimentacao);
        System.out.println("Gênero: " + genero);
        System.out.println("Som que ele emite: " + somAnimal);
        System.out.println("****************");
    }
    
    // método principal (main)
    public static void main(String[] args) {
        //criando o primeiro animal
        Animal cachorro = new Animal();
        cachorro.tipoAnimal = "cachorro";
        cachorro.nomeAnimal = "Euclides";
        cachorro.numeroDePatas = 4;
        cachorro.temRabo = true;
        cachorro.cor = "branco e preto";
        cachorro.idade = 3;
        cachorro.peso = 12.5;
        cachorro.tipoAlimentacao = "ração";
        cachorro.genero = 'm';
        cachorro.somAnimal = "auauau";
        
        
        // Criando o segundo animal
        Animal gato = new Animal ();
        gato.tipoAnimal = "gato";
        gato.nomeAnimal = "Fashion";
        gato.numeroDePatas = 4;
        gato.temRabo = true;
        gato.cor = "Cinza";
        gato.idade = 5;
        gato.peso = 5.1;
        gato.tipoAlimentacao = "ração e peixe";
        gato.genero = 'M';
        gato.somAnimal = "miau";
;        
        // Criando o terceiro animal
        Animal cavalo = new Animal ();
        cavalo.tipoAnimal = "cavalo";
        cavalo.nomeAnimal = "spaik";
        cavalo.numeroDePatas = 4;
        cavalo.temRabo = true;
        cavalo.cor = "black";
        cavalo.idade = 12;
        cavalo.peso = 8.5;
        cavalo.tipoAlimentacao = "cupim e ração";
        cavalo.genero = 'M';
        cavalo.somAnimal = "hiiiiii";
        //Chamando os métodos para imprimir os atributos
        cachorro.printStatus();
        gato.printStatus();
        cavalo.printStatus();
    }
    
}
    
    
        
        
        
        
    
