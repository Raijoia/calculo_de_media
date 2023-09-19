import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class CalculoDeMedia {
  public static void main(String[] args) {
    // professor vai informar o número de aluno que tem
    // ele não pode informar um valor menor ou igual a 0
    // para cada aluno, vamos calcular a media 
    int n;

    do {
      n = parseInt(showInputDialog("Quantos alunos você tem?"));
    } while (n <= 0);
    for (int cont = 1; cont <= n; cont++) {
      double a1, a2, a3;

      do {
        a1 = parseDouble(showInputDialog("Digite a nota da A1: "));
      } while (a1 < 0 || a1 > 30);
      do {
        a2 = parseDouble(showInputDialog("Digite a nota da A2: "));
      } while (a2 < 0 || a2 > 30);
      do {
        a3 = parseDouble(showInputDialog("Digite a nota da A3: "));
      } while (a3 < 0 || a3 > 40);
      double media = a1 + a2 + a3;

      showMessageDialog(null, "A media do Aluno é: " + media);
      
      if (media >= 70) {
        showMessageDialog(null, "Aluno Aprovado");
      } else {
        showMessageDialog(null, "Aluno Reprovado");
      }
    }
  }
}
