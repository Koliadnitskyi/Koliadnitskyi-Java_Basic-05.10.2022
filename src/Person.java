public class Person {
    public String name;
    public String surname;
    public String city;
    public long telephone; /*Возможно было и через тип данных String, и число задачть как строку, к примеру "952181776"
                            и в методе personInfo указать парамитер не long а String */

    String personInfo(String ourName, String ourSurname, String ourCity, long ourTelephone) {
        return "Позвонить гражданину " + ourName + " " + ourSurname + " из города " + ourCity + " можно по номеру " + ourTelephone + ".";
    }
}