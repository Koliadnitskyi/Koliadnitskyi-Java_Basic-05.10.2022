public class Main {
    public static void main(String[] args) {
        PopMusic musicalGroupPop = new PopMusic();
        RockMusic musicalGroupRock = new RockMusic();
        ClassicMusic musicalClassic = new ClassicMusic();

        MusicStyles[] callFromMethodDescendantsPlayMusic = new MusicStyles[]{musicalGroupPop, musicalGroupRock, musicalClassic};
        for (MusicStyles i : callFromMethodDescendantsPlayMusic) {
            i.playMusic(); // Полиморфный вызов метода

        /* // Возможно и так:
        List<MusicStyles> callFromMethodDescendantsPlayMusic = Arrays.asList(musicalGroupPop, musicalGroupRock, musicalClassic);
        for (MusicStyles i : callFromMethodDescendantsPlayMusic) {
            if (musicalGroupPop.equals(i)) {
                musicalGroupPop.playMusic();
            } else if (musicalGroupRock.equals(i)) {
                musicalGroupRock.playMusic();
            } else if (musicalClassic.equals(i)) {
                musicalClassic.playMusic();
            }*/
        }
    }
}