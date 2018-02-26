package oop0128;

class Sungjuk {
  String name;
  int kor,eng,mat;
  int aver;
  Sungjuk(){}
  public Sungjuk(String name, int kor, int eng, int mat) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.mat = mat;
    this.aver=(kor+eng+mat)/3;
  }
  
}

class Print {
  public void view(String name){
    System.out.println(name);
  }
  public void view2(int a,int b,int c){
    System.out.println(a+" "+b+" "+c);
  }
  public void disp(Sungjuk a){
    System.out.println(a.name);
    System.out.println(a.kor+" "+a.eng+" "+a.mat);
    System.out.println(a.hashCode());//��ü�� �����ϴ� ��
  }
}

public class CallByTest {

  public static void main(String[] args) {
    // �޼ҵ� ȣ�� ���
    Sungjuk sungjuk=new Sungjuk("����ȭ",10,20,30);
    
    Print print=new Print();
    print.view(sungjuk.name); // Call By Value
    print.view2(sungjuk.kor,sungjuk.eng,sungjuk.mat); // Call By Value
    System.out.println("============");
    print.disp(sungjuk); // Call By Reference �ּ� ����
    System.out.println(sungjuk.hashCode());
    System.out.println("============");
    Sungjuk kim=sungjuk;
    print.disp(kim);
    System.out.println(kim.hashCode());
    System.out.println("============");
    int a=3;
    int b=a;
    System.out.println("END");   

  }

}
