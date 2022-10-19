public class Main {
    public static void main(String[] args) {
        int[] teamOneRugby = new int[25];
        int[] teamTwoRugby = new int[25];

        System.out.print("Возраст каждого играка первой команды регби: ");
        for (int i = 0; i < teamOneRugby.length; i++) {
            int a = (int) (18 + Math.random() * 22);
            teamOneRugby[i] = a;
            System.out.print(teamOneRugby[i] + ", ");
        }
        System.out.println("\b\b" + ".");

        System.out.print("Возраст каждого играка второй команды регби: ");
        for (int g = 0; g < teamTwoRugby.length; g++) {
            int a = (int) (18 + Math.random() * 22);
            teamTwoRugby[g] = a;
            System.out.print(teamTwoRugby[g] + ", ");
        }
        System.out.println("\b\b" + ".");

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