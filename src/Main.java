public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca","TRH","05642541258");
        Teacher t2 = new Teacher("Tim David","FZK","0000");
        Teacher t3 = new Teacher("Ali Demir","BIO","1111");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","101","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyolji","101","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Kemal Sunal","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(60,90,60,90,60,90);
        //s1.printNote();
        s1.isPass();

        Student s2 = new Student("Halit Akçatepe","444","4",tarih,fizik,biyo);
        s2.addBulkExamNote(100,0,100,0,100,0);
        s2.isPass();


    }
}


























