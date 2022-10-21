public class Main {
    public static void main(String[] args) {
        int[] teamOneRugby = new int[25];
        int[] teamTwoRugby = new int[25];

        System.out.println("Возраст каждого играка первой команды регби:");
        int counterForNumbersGamerTeamsOne = 1;
        for (int i = 0; i < teamOneRugby.length; i++) {
            int a = (int) (18 + Math.random() * 22);
            teamOneRugby[i] = a;
            System.out.println("Возраст играка № " + counterForNumbersGamerTeamsOne++ + " = " + teamOneRugby[i] + " лет.");
        }
        System.out.println("Возраст каждого играка второй команды регби:");
        int counterForNumbersGamerTeamsTwo = 1;
        for (int g = 0; g < teamTwoRugby.length; g++) {
            int a = (int) (18 + Math.random() * 22);
            teamTwoRugby[g] = a;
            System.out.println("Возраст играка № " + counterForNumbersGamerTeamsTwo++ + " = " + teamTwoRugby[g] + " лет.");
        }
        double averageAgeTeamOneRugby = 0;
        for (int name : teamOneRugby) {
            averageAgeTeamOneRugby += name / (double) teamOneRugby.length;
        }
        double averageAgeTeamTwoRugby = 0;
        for (int name2 : teamTwoRugby) {
            averageAgeTeamTwoRugby += name2 / (double) teamTwoRugby.length;
        }
        System.out.println("Средний возраст играков команды 1 по регби: " + averageAgeTeamOneRugby);
        System.out.print("Средний возраст играков команды 2 по регби: " + averageAgeTeamTwoRugby);
    }
}