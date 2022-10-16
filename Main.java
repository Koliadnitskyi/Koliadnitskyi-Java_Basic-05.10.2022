public class Main {
    public static void main(String[] args) {
        String team1 = "Мужчины";
        int playerOfTeam1DimaNumberOfFrags = 34;
        int playerOfTeam1VictorNumberOfFrags = 12;
        int playerOfTeam1ValeryNumberOfFrags = 7;
        int playerOfTeam1KirilNumberOfFrags = 22;
        int playerOfTeam1VladNumberOfFrags = 14;

        String team2 = "Женщины";
        int playerOfTeam2TatianaNumberOfFrags = 35;
        int playerOfTeam2IrinaNumberOfFrags = 14;
        int playerOfTeam2KaterinaNumberOfFrags = 4;
        int playerOfTeam2VitaNumberOfFrags = 24;
        int playerOfTeam2OlgaNumberOfFrags = 16;

        double NumberOfPlayersPeTeam = 5;

        double arithmeticMeanPointsteam1 = (playerOfTeam1DimaNumberOfFrags + playerOfTeam1VictorNumberOfFrags +
                playerOfTeam1ValeryNumberOfFrags + playerOfTeam1KirilNumberOfFrags + playerOfTeam1VladNumberOfFrags)
                / NumberOfPlayersPeTeam;
        double arithmeticMeanPointsteam2 = (playerOfTeam2TatianaNumberOfFrags + playerOfTeam2IrinaNumberOfFrags +
                playerOfTeam2KaterinaNumberOfFrags + playerOfTeam2VitaNumberOfFrags + playerOfTeam2OlgaNumberOfFrags)
                / NumberOfPlayersPeTeam;

        if (arithmeticMeanPointsteam1 > arithmeticMeanPointsteam2) {
            System.out.println("Победила команда " + team1 + " набравшая " + arithmeticMeanPointsteam1 + " очков.");
        } else if (arithmeticMeanPointsteam1 < arithmeticMeanPointsteam2) {
            System.out.println("Победила команда " + team2 + " набравшая " + arithmeticMeanPointsteam2 + " очков.");
        } else {
            System.out.println("Команда " + team1 + " и команда " + team2 + " набрали одинаковое количество очков. Ничья");
        } // Вареант ничьи некто не отбрасывал, добавел его сюда, так как в случае ничьи вообще нечего не вывело в консоль

        /*
        возможно это ещё и так представить (вариант) черет тернарную операциювместо вместо цикла if else if:
        String winner = arithmeticMeanPointsteam1 > arithmeticMeanPointsteam2? "team1" : "team2";
        double comparisonOfResults = arithmeticMeanPointsteam1 > arithmeticMeanPointsteam2? "arithmeticMeanPointsteam1" : "arithmeticMeanPointsteam2";
        System.out.println("Победила команда " + winner + " набравшая " + comparisonOfResults + " очков.");
        */
    }
}