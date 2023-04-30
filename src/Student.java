public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes,Course c1, Course c2, Course c3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3 =c3;
        this.avarage = 0.0;
        this.isPass = false;

    }
    void addBulkExamNote(int note1, int noteS1, int note2,int noteS2,int note3, int noteS3){
        if (0<=note1 && note1<=100 &&0<=noteS1 && noteS1<=100){
            this.c1.note= (note1*80/100)+(noteS1*20/100);
        }
        if (0<=note2 && note2<=100 && 0<=noteS2 && noteS2<=100){
            this.c2.note=(note2*80/100)+(noteS2*20/100);
        }
        if (0<=note3 && note3<=100 && 0<=noteS3 && noteS3<=100){
            this.c3.note=(note3*80/100)+(noteS3*20/100);
        }
    }
    void isPass(){
        System.out.println("============");
        this.avarage = (this.c1.note+this.c2.note+this.c3.note)/3.0;
        if (this.avarage>55){
            System.out.println("Sınıfı Geçtiniz !");
            this.isPass=true;
        }else {
            System.out.println("Sınıfta Kaldınız.");
            this.isPass =false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(this.c1.name +"Notu\t:"+this.c1.note);
        System.out.println(this.c2.name +"Notu\t:"+this.c2.note);
        System.out.println(this.c3.name +"Notu\t:"+this.c3.note);
        System.out.println("Ortalamanız :" + this.avarage);
    }
}











