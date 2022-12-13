package ExercisesOopNTU.OnClasses;

public class TestAccount {

    public static void main(String[] args) {
        Account acc1 = new Account("1", "Account One");
        Account acc2 = new Account("2", "Account Two", 100);
        Account acc3 = new Account("3", "Account Three", 0);

        System.out.println(acc1);

        System.out.println("Saldo da sua conta: " + acc2.getBalance());

        acc2.credit(100);
        System.out.println("Saldo da sua conta atualizada após crédito: " + acc2.getBalance());

        acc2.debit(150);
        System.out.println("Saldo da sua conta atualizada após débito: " + acc2.getBalance());

        acc2.debit(100);
        System.out.println("Saldo da sua conta atualizada após tentativa de novo débito: " + acc2.getBalance());

        acc2.transferTo(acc3,50);
        System.out.println("Saldo da conta "+ acc3.getId() +" após transferencia: " + acc3.getBalance());

    }
}
