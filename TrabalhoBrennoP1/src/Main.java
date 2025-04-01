import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cabeçalho
        System.out.println("Faculdade: UNIFAN - Centro Universitário Alfredo Nasser");
        System.out.println("Aluno: Samuel Vasconcelos da Silva");
        System.out.println("Curso: Segurança da Informação");
        System.out.println("Professor: Brenno Pimenta");
        System.out.println("Matéria: Algoritmo e Programação II");
        System.out.println("Bem-vindo ao quiz sobre Futebol! Você responderá 15 perguntas de múltipla escolha.");

        Questao[] questoes = new Questao[15];
        // Definição das perguntas sobre carros
        questoes[0] = new Questao("1- Quem é o maior artilheiro da história da Seleção Brasileira?",
                new String[]{"Romário", "Ronaldo Fenômeno", "Pelé", "Neymar", "Zico"}, "D");
        questoes[1] = new Questao("2- Qual país venceu a Copa do Mundo de 2018?",
                new String[]{"Alemanha", "França", "Brasil", "Argentina", "Espanha"}, "B");
        questoes[2] = new Questao("3- Qual é o clube com mais títulos da Liga dos Campeões da UEFA?",
                new String[]{"Barcelona", "Bayern de Munique", "Real Madrid", "Milan", "Liverpool"}, "C");
        questoes[3] = new Questao("4- Em que ano o Brasil venceu a Copa do Mundo pela primeira vez?",
                new String[]{"1950", "1958", "1962", "1970", "1982"}, "B");
        questoes[4] = new Questao("5- Quem é o jogador com mais gols na história da Liga Brasileira (Brasileirão)?",
                new String[]{"Zico", "Edson Arantes do Nascimento", "Romário", "Fred", "Neymar"}, "C");
        questoes[5] = new Questao("6- Qual foi o time vencedor da Copa do Mundo de 2002?",
                new String[]{"Alemanha", "Brasil", "Itália", "França", "Argentina"}, "B");
        questoes[6] = new Questao("7- Qual é o estádio mais famoso da Inglaterra, casa do Manchester United?",
                new String[]{"Stamford Bridge", "Wembley", "Old Trafford", "Anfield", "Etihad Stadium"}, "C");
        questoes[7] = new Questao("8- Quem foi o técnico da seleção brasileira na conquista da Copa do Mundo de 1994?",
                new String[]{"Tite", "Dunga", "Zagallo", "Parreira", "Telê Santana"}, "D");
        questoes[8] = new Questao("9- Quem é conhecido como o Rei do Futebol?",
                new String[]{"Romário", "Zico", "Pelé", "Ronaldo Fenômeno", "Garrincha"}, "C");
        questoes[9] = new Questao("10- Qual jogador foi o vencedor da Bola de Ouro de 2021?",
                new String[]{"Neymar", "Cristiano Ronaldo", "Lionel Messi", "Robert Lewandowski", "Kylian Mbappé"}, "C");
        questoes[10] = new Questao("11- Qual é o país com mais títulos de Copa do Mundo de Futebol?",
                new String[]{"Brasil", "Alemanha", "Itália", "Argentina", "França"}, "A");
        questoes[11] = new Questao("12- Em que ano o Maracanã foi inaugurado?",
                new String[]{"1948", "1950", "1955", "1960", "1965"}, "B");
        questoes[12] = new Questao("13- Qual jogador é conhecido como Fenômeno?",
                new String[]{"Rivaldo", "Ronaldo Fenômeno", "Ronaldinho Gaúcho", "Kaka", "Cafu"}, "B");
        questoes[13] = new Questao("14- Quem é o maior artilheiro da história da Liga Inglesa?",
                new String[]{"Thierry Henry", "Sergio Agüero", "Alan Shearer", "Frank Lampard", "Cristiano Ronaldo"}, "C");
        questoes[14] = new Questao("15- Qual jogador é o maior ídolo da história do Barcelona?",
                new String[]{"Xavi Hernández", "Lionel Messi", "Andrés Iniesta", "Ronaldinho Gaúcho", " Carles Puyol"}, "B");

        int pontuacao = 0;

        // Loop para fazer as perguntas
        for (Questao questao : questoes) {
            questao.escrevaQuestao();
            String resposta = questao.leiaResposta();

            // Verificando se a resposta está correta
            if (questao.isCorreta(resposta)) {
                pontuacao++;
            }
        }

        // Exibindo a pontuação final
        System.out.println("Sua pontuação final é: " + pontuacao + "/15");
    }
}