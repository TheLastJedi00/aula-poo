import java.time.LocalDateTime;
import java.util.ArrayList;

public class ContaCorrente {
    double saldo;
    ArrayList<LocalDateTime> listaSaques;

    public ContaCorrente() {
        this.saldo = 0;
        this.listaSaques = new ArrayList<>();
    }

    void sacar(double valor){
        if(valor < this.saldo) {
            LocalDateTime agora = LocalDateTime.now();
            this.saldo = this.saldo - valor;
            this.listaSaques.add(agora);
            System.out.println("Saque efetuado");
            System.out.println("Valor: R$" + valor);
            System.out.println("Data: " + agora);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    void abrirRegistroDatasSaques(){
        for (int i = 0; i < this.listaSaques.size(); i++) {
            System.out.println((i + 1) + ". " + this.listaSaques.get(i));
        }
    }

    void depositar(double valor){
        this.saldo = this.saldo + valor;
    }

    LocalDateTime dataHoraHoje(){
        return LocalDateTime.now();
    }
}
