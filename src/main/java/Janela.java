import javax.swing.JOptionPane;

public class Janela {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Olá  !  Tudo bem ? Benvindo ao Mundo JAVA");
        String name = JOptionPane.showInputDialog("Agora por favor insira seu nome:");

        String endereço = JOptionPane.showInputDialog("Ok ,"  , " Agora digite seu endereço :");
        String mensagem =
        String.format("Benvindo , %s " , name );
        JOptionPane.showMessageDialog(null , mensagem);
    }
}
