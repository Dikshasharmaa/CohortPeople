package zipcode.rocks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        String student_source = "FakeData.csv";

        // Load data file into an ArrayList<Person> of Person objects.
        Main programObject = new Main();

      List listOfStudents = programObject.handWrittenLoadOfData();

        int numberOfPersons = listOfStudents.size();
        for (int i = 0; i< numberOfPersons; i++){
            System.out.println(listOfStudents.get(i).toString());
        }
    }

    private List loadCSVFile(String student_source) {
        ArrayList<Person> records = new ArrayList<>();

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(student_source);

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                records.add(this.getRecordFromLine(scanner.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("File NOT FOUND.");
            e.printStackTrace();
        }
        return records;
    }

    private Person getRecordFromLine(String line) {
        // take the String of lastname,firstname and create a new Person object with it.
        String[] values = line.split(COMMA_DELIMITER);
        Person newPerson = new Person(values[0], values[1]);
        return newPerson;
    }
  private List handWrittenLoadOfData() {
      ArrayList<Person> students = new ArrayList<>();

      Person newPerson = new Person("Abukar", "Abukar");
      newPerson.setGithubHandle("abukarabukar");
      newPerson.setFavoriteColor("yellow");
      newPerson.setBirthMonth("April");
      newPerson.setHavePet(true);
      students.add(newPerson);
      Person newPerson1 = new Person("Adams", "Chaz");
      newPerson1.setGithubHandle("chaz_adams");
      newPerson1.setFavoriteColor("blue");
      newPerson1.setBirthMonth("February");
      newPerson1.setHavePet(true);
      students.add(newPerson1); 
      Person newPerson2 = new Person("Ahmadli", "Asan");
      newPerson2.setGithubHandle("asanahamdli");
      newPerson2.setFavoriteColor("dark blue");
      newPerson2.setBirthMonth("December");
      newPerson2.setHavePet(false);
      students.add(newPerson2);
      Person newPerson3 = new Person("Azer", "Jenn");
      newPerson3.setGithubHandle("cupofjavajenny");
      newPerson3.setFavoriteColor("purple");
      newPerson3.setBirthMonth("November");
      newPerson3.setHavePet(true);
      students.add(newPerson3);
      Person newPerson4 = new Person("Bangash", "Ali");
      newPerson4.setGithubHandle("ali-b14");
      newPerson4.setFavoriteColor("green");
      newPerson4.setBirthMonth("March");
      newPerson4.setHavePet(false);
      students.add(newPerson4);
      Person newPerson5 = new Person("Brennan", "Jake");
      newPerson5.setGithubHandle("jake-brennan714");
      newPerson5.setFavoriteColor("purple");
      newPerson5.setBirthMonth("April");
      newPerson5.setHavePet(true);
      students.add(newPerson5);
      Person newPerson6 = new Person("Bruton", "Trey");
      newPerson6.setGithubHandle("tb0902_");
      newPerson6.setFavoriteColor("orange");
      newPerson6.setBirthMonth("September");
      newPerson6.setHavePet(true);
      students.add(newPerson6);
      Person newPerson7 = new Person("Burton", "Asia");
      newPerson7.setGithubHandle("asiaburton");
      newPerson7.setFavoriteColor("pink");
      newPerson7.setBirthMonth("March");
      newPerson7.setHavePet(true);
      students.add(newPerson7);
      Person newPerson8 = new Person("Cao", "Danny");
      newPerson8.setGithubHandle("dannycao1997");
      newPerson8.setFavoriteColor("blue");
      newPerson8.setBirthMonth("September");
      newPerson8.setHavePet(false);
      students.add(newPerson8);
      Person newPerson9 = new Person("Eckel", "Nathan");
      newPerson9.setGithubHandle("nathaneckle");
      newPerson9.setFavoriteColor("green");
      newPerson9.setBirthMonth("February");
      newPerson9.setHavePet(true);
      students.add(newPerson9);
      Person newPerson10 = new Person("Ekoloko", "Jorris");
      newPerson10.setGithubHandle("reeseyverse");
      newPerson10.setFavoriteColor("black");
      newPerson10.setBirthMonth("August");
      newPerson10.setHavePet(false);
      students.add(newPerson10);
      Person newPerson11 = new Person("Gonzalez Plaza", "Alice");
      newPerson11.setGithubHandle("NEEDGITHUB");
      newPerson11.setFavoriteColor("blue");
      newPerson11.setBirthMonth("May");
      newPerson11.setHavePet(true);
      students.add(newPerson11);
      Person newPerson12 = new Person("Kakade", "Deepa");
      newPerson12.setGithubHandle("*NEEDGITHUB");
      newPerson12.setFavoriteColor("pink");
      newPerson12.setBirthMonth("June");
      newPerson12.setHavePet(false);
      students.add(newPerson12);
      Person newPerson13 = new Person("Katzarova", "Mariyana");
      newPerson13.setGithubHandle("mariyana-katz");
      newPerson13.setFavoriteColor("green");
      newPerson13.setBirthMonth("December");
      newPerson13.setHavePet(true);
      students.add(newPerson13);
      Person newPerson14 = new Person("Konstanski", "Lydia");
      newPerson14.setGithubHandle("lydiastonekonstanski");
      newPerson14.setFavoriteColor("mushroom");
      newPerson14.setBirthMonth("October");
      newPerson14.setHavePet(true);
      students.add(newPerson14);
      Person newPerson15 = new Person("Kramer", "Matt");
      newPerson15.setGithubHandle("NEEDGITHUB");
      newPerson15.setFavoriteColor("green");
      newPerson15.setBirthMonth("January");
      newPerson15.setHavePet(true);
      students.add(newPerson15);
      Person newPerson16 = new Person("Mathew", "Angelina");
      newPerson16.setGithubHandle("angelinamathew");
      newPerson16.setFavoriteColor("dark blue");
      newPerson16.setBirthMonth("May");
      newPerson16.setHavePet(false);
      students.add(newPerson16);
      Person newPerson17 = new Person("McCall", "Chris");
      newPerson17.setGithubHandle("christopher_mccall");
      newPerson17.setFavoriteColor("blue");
      newPerson17.setBirthMonth("May");
      newPerson17.setHavePet(false);
      students.add(newPerson17);

      Person newPerson18 = new Person("McNamara", "Nick");
      newPerson18.setGithubHandle("nicholasmacnamara");
      newPerson18.setFavoriteColor("green");
      newPerson18.setBirthMonth("January");
      newPerson18.setHavePet(true);
      students.add(newPerson18);
      Person newPerson19 = new Person("Modi", "Shaily");
      newPerson19.setGithubHandle("ShailyGH");
      newPerson19.setFavoriteColor("Purple");
      newPerson19.setBirthMonth("January");
      newPerson19.setHavePet(false);
      students.add(newPerson19);
  
      Person newPerson20 = new Person("Moffett-Conaway", "Dan");
      newPerson20.setGithubHandle("moffd234");
      newPerson20.setFavoriteColor("blue");
      newPerson20.setBirthMonth("June");
      newPerson20.setHavePet(true);
      students.add(newPerson20);
      Person newPerson21 = new Person("Palanikumar", "Lavanya");
      newPerson21.setGithubHandle("lavanyapalanikumar93");
      newPerson21.setFavoriteColor("blue");
      newPerson21.setBirthMonth("October");
      newPerson21.setHavePet(false);
      students.add(newPerson21);

  
      Person newPerson22 = new Person("Pearson", "Anthony");
      newPerson22.setGithubHandle("anthonyp365");
      newPerson22.setFavoriteColor("red");
      newPerson22.setBirthMonth("July");
      newPerson22.setHavePet(true);
      students.add(newPerson22);
      Person newPerson23 = new Person("Rieger", "Ethan");
      newPerson23.setGithubHandle("erieger11");
      newPerson23.setFavoriteColor("blue");
      newPerson23.setBirthMonth("May");
      newPerson23.setHavePet(true);
      students.add(newPerson23);
  
      Person newPerson24 = new Person("Ross", "Jorden");
      newPerson24.setGithubHandle("jross911");
      newPerson24.setFavoriteColor("green");
      newPerson24.setBirthMonth("December");
      newPerson24.setHavePet(false);
      students.add(newPerson24);
      Person newPerson25 = new Person("Scott", "Michael");
      newPerson25.setGithubHandle("michaelscott44");
      newPerson25.setFavoriteColor("orange");
      newPerson25.setBirthMonth("May");
      newPerson25.setHavePet(true);
      students.add(newPerson25);

      Person newPerson26 = new Person("Sharma", "Diksha");
      newPerson26.setGithubHandle("dikshasharmaa");
      newPerson26.setFavoriteColor("blue");
      newPerson26.setBirthMonth("March");
      newPerson26.setHavePet(false);
      students.add(newPerson26);
      Person newPerson27 = new Person("Zeng", "Shijin");
      newPerson27.setGithubHandle("szeng89");
      newPerson27.setFavoriteColor("yellow");
      newPerson27.setBirthMonth("July");
      newPerson27.setHavePet(false);
      students.add(newPerson27);
      Person newPerson28 = new Person("Zheng", "Andy");
      newPerson28.setGithubHandle("andyzheng679");
      newPerson28.setFavoriteColor("red");
      newPerson28.setBirthMonth("December");
      newPerson28.setHavePet(false);
      students.add(newPerson28);
    
    
      // and so on for EACH person in the cohort.
      return students;
  }

}
