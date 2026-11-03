import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        ContaCorrente c = new ContaCorrente();
        System.out.println(c.saldo);
        c.depositar(5);
        System.out.println(c.saldo);
        c.sacar(2);
        c.sacar(2);
        c.sacar(1);
        System.out.println(c.saldo);
        c.abrirRegistroDatasSaques();

        LocalDateTime data = c.dataHoraHoje();
        System.out.println(data);
        System.out.println("Funcionando");
    }
}
