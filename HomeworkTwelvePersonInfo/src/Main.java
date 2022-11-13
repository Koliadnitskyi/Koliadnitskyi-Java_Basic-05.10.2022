public class Main {
    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.name = "Valerii";
        personOne.surname = "Koliadnitskyi";
        personOne.city = "Kyiv";
        personOne.telephone = 952181776;
        String personInfoOne = personOne.personInfo(personOne.name, personOne.surname, personOne.city, personOne.telephone);
        System.out.println(personInfoOne);

        Person personTwo = new Person();
        personTwo.name = "Karl";
        personTwo.surname = "Vilhelm";
        personTwo.city = "London";
        personTwo.telephone = 911743490;
        String personInfoTwo = personTwo.personInfo(personTwo.name, personTwo.surname, personTwo.city, personTwo.telephone);
        System.out.println(personInfoTwo);

        Person personTree = new Person();
        personTree.name = "Mykola";
        personTree.surname = "Mykytiuk";
        personTree.city = "Kharkiv";
        personTree.telephone = 664621274;
        String personInfoTree = personTree.personInfo(personTree.name, personTree.surname, personTree.city, personTree.telephone);
        System.out.print(personInfoTree);

    }
}