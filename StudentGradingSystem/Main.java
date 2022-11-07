package StudentGradingSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH" , "05067954323");
        Teacher t2 = new Teacher("Zehra Hoca", "FZK", "05348523214");
        Teacher t3 = new Teacher("Burak Hoca", "BIO", "05354567654");

        Course tarih= new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Esma", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Beyza", "321", "3", tarih, fizik, biyo);
        s2.addBulkExamNote(50,38,70);
        s2.isPass();
    }
}
