import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Assigning values
        Tuition mesra = new Tuition();
        mesra.setName("Mesra");
        Headmaster lenn = new Headmaster();
        lenn.setname("lenn", "Howard", "Bren");
        mesra.setHeadmaster(lenn);

        Batch cs2021 = new Batch();
        for(int i = 0 ; i < 10 ; i ++){
            Student student = new Student();
            student.setName("Student", "Number", "" + i);
            student.setAddress(""+ i , "Jalan lekor", "Batu Gajah", "31000", "Perak");
            //assigning marks
            for (int j = 0 ; j <5 ; j++){
                student.setMarks((float)Math.random() * 100, j);
            }

            School seriLangka = new School();
            seriLangka.setAddress("1", "Jalan Seri", "Seri Iskandar", "31200", "Perak");
            seriLangka.setName("SMK Seri Langka");

            student.setSchool(seriLangka);
            cs2021.add(student);
        }

        mesra.setBatch(cs2021);

        for(int i = 0; i < 5 ; i++){
            Teacher teacher = new Teacher();
            teacher.setName("Teacher", "Number", "" + i);
            teacher.setAddress("" + i, "Jalan " + i, "Batu Gajah", "31000", "Perak");
            Random random = new Random();
            teacher.setNumyearexp(random.nextInt(20));
            teacher.setQualification("Degree");
            mesra.addTeam(teacher);
        }

        //Getting performance
        mesra.getPerformance();

    }
}