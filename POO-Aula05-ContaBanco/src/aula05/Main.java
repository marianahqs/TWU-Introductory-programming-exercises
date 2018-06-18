package aula05;

public class Main {
    public static void main(String[] args) {
        ContaBanco conta01 = new ContaBanco("Mari");

        conta01.abreConta("Corrente");

        conta01.status();

        conta01.deposito(53.2f);

        conta01.saque(10f);


        conta01.deposito(0f);

        conta01.saque(0f);

        conta01.fechaConta();

        conta01.saque(5f);
        conta01.deposito(3f);


        conta01.status();

    }

}
