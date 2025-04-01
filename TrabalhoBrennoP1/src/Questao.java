import java.util.Scanner;

public class Questao {
    private String pergunta;
    private String[] alternativas;
    private String alternativaCorreta;

    public Questao(String pergunta, String[] alternativas, String alternativaCorreta) {
        this.pergunta = pergunta;
        this.alternativas = alternativas;
        this.alternativaCorreta = alternativaCorreta;
    }

    // Método para exibir a questão e as alternativas
    public void escrevaQuestao() {
        System.out.println(pergunta);
        for (int i = 0; i < alternativas.length; i++) {
            System.out.println((char)('A' + i) + ". " + alternativas[i]);
        }
    }

    // Método para ler a resposta do usuário
    public String leiaResposta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sua resposta: ");
        return scanner.nextLine().toUpperCase();
    }

    // Método para verificar se a resposta está correta
    public boolean isCorreta(String resposta) {
        if (resposta.equals(alternativaCorreta)) {
            System.out.println("Resposta correta!");
            return true;
        } else {
            System.out.println("Resposta incorreta. A resposta correta é " + alternativaCorreta);
            return false;
        }
    }
}