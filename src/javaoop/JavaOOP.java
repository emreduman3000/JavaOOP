/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaoop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emreduman
 */

//Each Package can have just 1 public class
//If I want to create public class, I should creat another package in the same project folder
public class JavaOOP extends KalitimliOrnek//main method var bu methodda onu kullanmak için inheritance yaptım
{
    //public class'ın adı ile .java uzantılı class dosyası ile aynı olmalı
    Scanner scan=new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        //kendi sınıfındaki static methodlar direk cagrılabilir.
        //baska sınıftaki static method ya o sınıfın nesnesi ile ya da o sınıfın adıyla cagrılır.

        JavaOOP obje1=new JavaOOP();
        //studentClass();
        //student2Class();
        //obje1.student3();
        //OkulSistemiGiris.main();
        //television();
        //personnel();
        //obje1.computer();  //static yani class a özgü method olmadığı için nesneye bağlı method olduğu için static main methodun içinde nesne üretmek zorundayz       
        //calculator();//main ile JavaOOP sınıfının methodları
        //obje1.calculator();
        //JavaOOP.calculator();     
        //thisClasss();
        //car();
        //cocuk n=new cocuk(1);
        //cocuk2 n=new cocuk2(1);
        //Circle_Cylinder();
        //override();
        //Square_Rectangle();
        //main();////Kisi-Personal-Ogrenci-MezunOgrenci baska classtan nesne olusturmadım cünkü inheritance kullanım
        //polymorphism();
        //PolymorphismKavrami();
        //mainU.main();  
        //binding();
        //KonuyuToparlayalim.main();//main static olmasaydı nesne olusturmak zorunda kalacaktım
        //methodsOfObjectClass();
        //finalKeyword();
       
         
        //<editor-fold defaultstate="collapsed" desc=" QUESTIONS ">

         
        //stackArea.main();
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-1 ">
       

       // System.out.println("------Q1------");
        //        a obj=new b();//bu  constructor methodu calıstırır, BLOKLARI CALISTIRIR
        //        System.out.println(obj.a);//10//bclassındaki a calısıcak, olmasaydı a daki calısırdı, aclass dan miras alınmıs bclass de override edilmiş bi a variable yok
        //        System.out.println(obj.b);//1//b variable'ı bclass'ta method içinde islendi
        //        obj.method();//2//b variable'ı bclass'ta method içinde islendi- void method hiç bie suretle sout içine yazılamaz
        // </editor-fold>       
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-2 ">
         //System.out.println("------Q2------");
         //CSinifi c = new CSinifi();//nesne olusturunca constructor cagrılır,İNSTANCE BLOKLAR calsıır
        //ASinifi ac=new CSinifi();//ykardaki ile aynı
        //ASinifi ac2=new CSinifi(12);//AYNI YOLU İZLER A VE B NİN DEFAULT CONSTR. CALISIR, C NIN İSE 1PARAM CONSTR. CALISIR


        // </editor-fold>


        //<editor-fold defaultstate="collapsed" desc=" QUESTION-3 ">
        /*
        System.out.println("------Q3------");  
        CSinif c1 = new CSinif();
            //Asınıf            
            //Sınıf A
            //BSınıf
            //Sınıf B
            System.out.println(c1.metin);
            //Sınıf C
            
            BSinif b1=new BSinif();
            /*
                Asınıf
                Sınıf A
                Bsınıf
            */
            
        // </editor-fold> 
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-4 ">
            //          System.out.println("------Q4------");
        //CSinifii c2 = new CSinifii();
        /*
            333
            222
            111
            3
            A Kurucusu
            2
            B Kurucusu
            1
            C Kurucusu
        */

        // </editor-fold> 
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-5 ">
       //        System.out.println("------Q5------");

        //Bb.staticMethod();//BbSinifi

        // </editor-fold> 
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-6 ">
       // System.out.println("------Q6------");
        //N n = new N(10);//11

        // </editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-7 ">
        //System.out.println("------Q7------");
       //X x = new Y(15);
        /*
        21
        75
        150
        */
//        System.out.println(x.i);//21
  //              X x2 = new X(20);
    //            System.out.println(x2.i);

        
                // </editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-8 ">
        //System.out.println("------Q8------");

       // L l = new L();
        /*
            222
            442
        */

        // </editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-9 ">
               /*
                            System.out.println("------Q9------");


        R r= new R();//
        T t= new T();
        
           // m22
            //x3
            //x33
        
        System.out.println(T.metin);//AAABBB
        System.out.println(R.metin);//AAABBB
        
        System.out.println(r.m2);//m222
        System.out.println(r.x3);//x3
        System.out.println(t.m2);//m22
        System.out.println(t.x3);//x3
*/

        // </editor-fold> 

        //<editor-fold defaultstate="collapsed" desc=" QUESTION-10 ">
                   //   System.out.println("------Q10------");
                 //    Q10_Main.main();

        // </editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-11 ">
 //System.out.println("------Q11------");
           //         Q11_Main.main();
    // </editor-fold>   
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-12 ">
      //  System.out.println("------Q12------");
                             //  Q12_Main.main();
            // </editor-fold>           
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-13 ">
 //System.out.println("------Q13------");
                              // Q13_Main.main();
    // </editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-14 ">
 //System.out.println("------Q14------");
                         //     Q14_Main.main();
    // </editor-fold>
        //<editor-fold defaultstate="collapsed" desc=" QUESTION-15 ">
 //System.out.println("------Q15------");
                        //       Q15_Main.main();
    // </editor-fold>
        //TV_Main.main();
        

    
//<editor-fold defaultstate="collapsed" desc=" QUESTION-16 ">
// System.out.println("------Q16------");
 //Q16_Main.main();
 
    // </editor-fold>


//<editor-fold defaultstate="collapsed" desc=" QUESTION-18 ">
 //System.out.println("------Q18------");
                             //  Q18_Main.main();
    // </editor-fold>
//<editor-fold defaultstate="collapsed" desc=" QUESTION-19 ">
 //System.out.println("------Q19------");
//Q19_Main.main();  
// </editor-fold>
//<editor-fold defaultstate="collapsed" desc=" QUESTION-20 ">
 //System.out.println("------Q12------");
   //                            Q12_Main.main();
    // </editor-fold>
    
    //QUESTIONS.main();
    //JavaReviewQuestions.main();
        

    //</editor-fold>


        //Abstract class is just for learning the logics
        //Abstract2.main();
        //MainClasstr.main();
        //abs_int.main();
        //Interface01.main();
        //MultipleInheritance.main();
        //Duman d =new Duman();        d.eat();
        //superclass s=new subsubclass(); s.naber();
        //MainClasst.main();
        //MainClasstr.main();
        //ComparableUsage.main();
        //nestedClassUsage.main();
        //main_innerClass.main();
        //Main_Local.main();
        //AnonymousInnerClass.main();
        //Generic_Main.main();
        //generic_ArrayList.main();
        //GenericMethod.main();
        //Animal_Main.main();
        //IfPractice.main();
        //OyunaGiris.main();
        RationalNumbers rationalNumbers=new RationalNumbers(1,2);
        RationalNumbers rationalNumbers2=new RationalNumbers(1,3);
        RationalNumbers sum=rationalNumbers.add(rationalNumbers2);
        System.out.println(sum);//5/6
        RationalNumbers o=new RationalNumbers();        o.main();

        //PerfectNumber.main();
    }
    
    //<editor-fold defaultstate="collapsed" desc=" METHODS ">


    
    //to reach static methods , dont need to product an object
    //<editor-fold defaultstate="collapsed" desc=" Student ">
        static public void studentClass()
        {    
            Student nesne= new Student(); System.out.println(nesne);//student{name=Emre, number=1234}
            System.out.println(nesne.getName()+nesne.d);//Emre final
            nesne=null; //nesne adı bir alana sahip değil!!!           
            System.out.println(nesne);//null
            //System.out.println(nesne.getName());//NESNENIN ICI yok yani VARIABLE Or METHODS da YOK, Nesne null yani . ERROR alırız.
            //System.out.println(nesne.b);//nesne null
            
            nesne=new Student();//nesne --> bir alan tesis ettik
            System.out.println(nesne.getName());//Emre
            
            Student nesne2= new Student();System.out.println(nesne2);//student{name=Emre, number=1234}
            nesne=nesne2;                 System.out.println(nesne);//student{name=Emre, number=1234}
            System.out.println(nesne.getName()+nesne.d);//Emre final

            
                  
            
            Student std=new Student();//std object tir ve referans eder heapten bilgileri cagırmak için.
            //toString();
            System.out.println(std);//student{name=Emre, number=1234}
            
            //toString methodu olduğu için object direk referans olur 
            //ve toString methodunun in içini yazar 
            //toString yazılmasaydı javaoop.Student@549f1da print edilecekti
            //new demek heap belekte yeni alan demektir
            //objectlerin isimleri ve referansları stack bellekte tutulur
      

            Student std2=new Student();//std ile aynı constructor kullanır.
            //baska yeni bir alan olusturuldu 2intlik. bellek adresi de std2ye atanıyor.
            System.out.println(std2);//student{name=Emre, number=1234}
            System.out.println(std.equals(std2));//True  
            System.out.println(std==std2);//false TASIDIKLARI DEĞERLER AYNI BİLE OLSA FALSE YAZAR REFERENSLARI FARKLI
            //IF I TYPE std=std2;        System.out.println(std==std2);//TRUE OLUCAKTIR


            System.out.println(std.getName());//Emre
            System.out.println(std.hashCode());//88732122
            System.out.println(std.toString());//student{name=Emre, number=1234}
            
            
            std.setName("private1234");     System.out.println(std.getName());//private1234
            std.b="publicc";                System.out.println(std.b);//publicc 
            std.c="protectedd";             System.out.println(std.c);//protectedd 
            /*std.d="finall"; error */      System.out.println(std.d);//final yazılır ama değiştirilmez 
            std.e="staticc";                System.out.println(std.e);/*staticc*/   
                                            System.out.println(std2.e);//staticc
            //static variable or method is special to class /not to object. So any changes done by using an object is permanetly.
            std.f="defaultt";               System.out.println(std.f);//defaultt  
            
            //STD OBJESİ ILE NAME'I (STD ALANINDAKİ) YENIDEN SET ETTİM.
            System.out.println(std);//student{name=private1234, number=1234}
            
            System.out.println(std2.b);//public yazar çünkü std2 nin heapteki alanı 
                                       //farklı heapindeki b si clasın içindeki değer
            System.out.println(std2.c);//protected yazar
            System.out.println(std2);//student{name=Emre, number=1234}
 
            std.defaultValues();
            /*  default values:
                String:null
                byte:0
                short:0
                int:0
                long:0
                float:0.0
                double:0.0
                boolean:false
                char: 
            */
            
            
            Student std3=new Student("DUMAN",Integer.parseInt("3000"));
            System.out.println(std3.toString());//student{name=DUMAN, number=3000}
            System.out.println(std3);//student{name=DUMAN, number=3000} toString methodu sayesinde object direk toString içini yazdırır
        
            //std3 variable'ı artık baska  alana referans ediyor. yukardaki alan heap bellekte duruyor 
            std3=new Student(3146,"EMRE");
            System.out.println(std3);//student{name=EMRE, number=3146} toString in içinde ilk isim yazar
            
            Student std4=new Student("KOMANDO",Integer.valueOf("170"));
            System.out.println(std4);//student{name=KOMANDO, number=170}
            
            std3=std4;//std3 artık std4 ile aynı alana refer ederler - yukardaki 2 alan da referanssız kaldılar 
            //JAVA GARBAGE COLLECTOR std3 içindeki EMRE 3146 kullanılmayan eski bilgileri silecektir!!! 
            System.out.println(std3);//student{name=KOMANDO, number=170}
            
            //aynı alanı refer eden nesneler aynı alanda degisiklik yaparlar
            
            System.out.println(std3==std4);//true deger aynı ve numara aynı
            std3.setName("EMREEE");System.out.println(std4);//student{name=EMREEE, number=170} std3 std4 ü etkiler çünkü numaraları da aynı
            std4.setName("EMREE2");System.out.println(std3);//student{name=EMREE2, number=170} std4 std3 ü etkiler çünkü numaraları da aynı
            
            
            //equals()
            Student std5 =new Student();System.out.println(std5);//student{name=Emre, number=1234}
            Student std6 =new Student();System.out.println(std6);//student{name=Emre, number=1234}
            System.out.println(std5==std6);//false because numaraları farklı alanların
            System.out.println(std5.equals(std6));//true-iiçndeki degerler aynı olsun true dur
            System.out.println(std5.hashCode()==std6.hashCode());//true - referans numaraları farklı
            
            std5.setName("eeee");System.out.println(std5);//student{name=eeee, number=1234}
            System.out.println(std5.hashCode()==std6.hashCode());//false
            std5.setName("Emre");System.out.println(std5);//student{name=Emre, number=1234}
            System.out.println(std5.hashCode()==std6.hashCode());//true

            std5.setName("eeee");
            std5=std6;//esitledik hem içeriğini hem numarasını numaraları std5 degiskenini ilk refer ettiği alan artık boş 
            System.out.println(std5); //student{name=Emre, number=1234}!!!!!!
            System.out.println(std5==std6);//true
            
            //hashCode() - Returns a hash code value for the object.
            System.out.println(std5.hashCode());//88732122
            System.out.println(std6.hashCode());//88732122
            System.out.println(std5.hashCode()==std6.hashCode());//true
            

        
        }

    
        
          // </editor-fold>    
        
    //<editor-fold defaultstate="collapsed" desc=" Student2 ">
    static public void student2Class()
    {
        
        Student2 std =new Student2(); 
        System.out.println(std);//THIS STUDENT IS INACTIVE
        std.activity=true;  System.out.println(std);//Student2{name=isimsiz, number=0, Program=no Program , activity=true}

        
        Student2 std1 =new Student2("tuba"); 
        System.out.println(std1);//THIS STUDENT IS INACTIVE
        std1.activity=true;  System.out.println(std1);//Student2{name=tuba, number=0, Program=no Program , activity=true}

        
        Student2 std2 =new Student2("emre",1);
        System.out.println(std2);//THIS STUDENT IS INACTIVE
        std2.activity=true;  System.out.println(std2);//Student2{name=emre, number=1, Program=no Program , activity=true}

        
        Student2 std3 =new Student2("asel",2,"veteriner");
        System.out.println(std3);//THIS STUDENT IS INACTIVE
        std3.activity=true;  System.out.println(std3);//Student2{name=asel, number=2, Program=veteriner, activity=true}

        
        Student2  std4=new Student2("duman",3,"komando",true);
        System.out.println(std4);//Student2{name=duman, number=3, Program=komando, activity=true}

        
        
        
        Student2[] allStudents=new Student2[10];//class array ile sınıfın içindeki degerlere ulasılır
        
        allStudents[0]=std;//heap teki kutu adresine  std reference olur
        System.out.println(allStudents[0].hashCode());//788117692
        System.out.println(std.hashCode());//788117692
        
        allStudents[1]=std1;//heap teki kutu adresine std1 reference olur        
        System.out.println(std1.hashCode());//1566723494
        System.out.println(allStudents[1].hashCode());//1566723494
        System.out.println(allStudents[1].Program.hashCode());//920244667 classtaki variable'ın da hashcode'u vardır
        System.out.println(allStudents[1].Program);//no Program 
        
        allStudents[2]=std2;//heap teki kutu adresine std2 reference olur
        allStudents[3]=std3;//heap teki kutu adresine std3 reference olur
        allStudents[4]=std4;//heap teki kutu adresine std4 reference olur
        allStudents[5]=new Student2();//burada direk HEAPteki alanın adresi allStudents[5] e esit olur./bu alana nesne ile ulasılmaz
        allStudents[6]=new Student2("maviBere",6,"pilot",true);////burada direk HEAPteki alanın adresi allStudents[6] e esit olur.
         
        //allStudents[7]=std.Program;// std.Program Stringtir. Student2 type degildir.
        allStudents[8]=std.classaOZGU;// std.classaOZGU Student2 type tır ve bir nesnedir.bu nesne null'dır
        
        //static instance variables and methos can also  be called by an object but manuaelly
        
        //allStudents[2].activity=true; olursa  //Student2{name=emre, number=1, Program=no Program , activity=true} yazar
        System.out.println(allStudents[2]);// Student2{name=emre, number=1, Program=no Program , activity=true}
        //NESNE GİBİ KULLANILIR VE YAZDIRILIR.
        
        System.out.println(allStudents[3].toString());//Student2{name=asel, number=2, Program=veteriner, activity=true}
        System.out.println(allStudents[3]);//Student2{name=asel, number=2, Program=veteriner, activity=true}
        allStudents[3].classMETHOD();//obje gibi kullanırız
        
        System.out.println(allStudents[5]);//THIS STUDENT IS INACTIVE
        System.out.println(allStudents[6]);//Student2{name=maviBere, number=6, Program=pilot, activity=true}
        System.out.println(allStudents[8]);//null Student2 type data
        
        
        Object obj[]=new Object[10];//Object İLE sadece object sınıf içi methodlara ulasılır
        obj[0]=std;     System.out.println(obj[0]);//Student2{name=isimsiz, number=0, Program=no Program , activity=true}
        obj[1]=std1;    System.out.println(obj[1]);//Student2{name=tuba, number=0, Program=no Program , activity=true}    
        obj[2]=std2;     System.out.println(obj[2]);//Student2{name=emre, number=1, Program=no Program , activity=true}
        
        Array array[]= new Array[10];
        //array[0]=std;//ERROR!!!- std is Student2 type can not be converted to Array type
        array[1]=std.bbb;//Student classına std ile ulastım. Array tipli bbb variable ını cagırdım.
        //array[2]=std.classMETHOD();//void can not be converted to Array
    }
    // </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="student3- class Array ">
    public void student3()//non static
    {       
        //static int a=0; //method içine static değer initialized adilemez
        student3 n=new student3();System.out.println(n);//default values is assigned to each variable
        System.out.print("How many Student are there in the system:");
        student3[] stdList= new student3[scan.nextInt()];//3 student dedim
        student3 std = null;//method içinde primitive ya da reference type degerler initialized edilmek zorunda
        
        ArrayList <Object> arraylist =new ArrayList<>();
        for(int i=0; i< stdList.length;i++)
        {
            int id=(int) (100 * Math.random());
            int grade=(int) (100 * Math.random());
            std =new student3(id,grade);//her defasında yeni bir alan olusucak heapte ve std eski alanı bırakıp yeni alanı refer etmeye baslıcak
            stdList[i]=std;
        }
        
        System.out.println(stdList);//student3 type array ve reference'ı icinde 3 tane nesne barındırır - [Ljavaoop.student3;@7946e1f4
        System.out.println(Arrays.toString(stdList));//3 farklı referanslı obje - [student3{id=4, grade=95}, student3{id=48, grade=97}, student3{id=85, grade=16}]
        System.out.println(Arrays.deepToString(stdList));//3 farklı referanslı obje - [student3{id=4, grade=95}, student3{id=48, grade=97}, student3{id=85, grade=16}]
       
        System.out.println(std);
        stdList[2].setGrade(100);//stdList[] obje gibidir obje ile aynı alanı refer eder deişim yapar
        System.out.println(std);
        
        student3 std2 =new student3(); //yeni obje
        //student3 [] sortedList=stdList;//yeni bir class arrayi bilerek olustrudm aynı alanı temsil ederler
        //sortedlist ile normal list 2 si de sorted olur
        //student3 [] sortedList;//olmaz method iiçinde primitive yada reference type datalar must be initiaaized 
        //student3 [] sortedList=null;//dersem alan olusmamız olur, alanyoksa bilgiler nasıl copyalancak 2 satır altta hata verir
      
        
        
        
        student3 [] sortedList=new student3[stdList.length];//in a method reference type or primitive types must be initialized
        System.arraycopy(stdList, 0, sortedList, 0, stdList.length);//loop ile de elemanlarını atayabilirim
        
        System.out.println(Arrays.toString(sortedList));//aynısı
        System.out.println(stdList==sortedList);//false - farklı alanda farklı reference numaralı
        //sadece olusturudm kullanmadım
        
        /*
        for(int i=0; i<stdList.length ;i++)
        {
            System.out.println(sortedList[i]) ;//student3{id=0, grade=0} such values will be printed
            //System.out.println(sortedList[i].showInfos());//student3{id=0, grade=0}
        }
        */
         
         
         
         
         
        List<student3> sortedArrayList=new ArrayList<>(Arrays.asList(sortedList));
                      System.out.println(sortedArrayList);

        //System.arrayCopy yapmama gerek yok aslında bilerek yaptım
        std2.sort_StdList(sortedArrayList);//grade e göre sort ettim
        System.out.println(std2);//student3{id=0, grade=0}
              System.out.println(sortedArrayList);

        for(student3 i:sortedArrayList){
            System.out.println(i);//toString methodu var ondan yazdırıyor
        }
       
    
        System.out.println(std.showInfos());//en son refer ettigi alanı yazırıcak student3 nesnesi stdList in son elemanı ile aynı
        //stdList[2] ile std aynı kutuyu refer ederler.biri eğşirse diğeri de değişir
        
    
    }

    // </editor-fold> 
    
    //okulSistemi

    //<editor-fold defaultstate="collapsed" desc=" television ">
    static public void television()
    {
        television tv = new television();
        System.out.println(tv);//toString();  - television{channel=1, volumeLevel=5, button=true}
        tv.turnON();//Television is Turning On
        tv.turnOff();//Television is Turning Off
        
        tv.setChannel(5);//5th channnel  Television is turned off! 5 is not assigned
        System.out.println(tv.getChannel());//1
        tv.setVolumeLevel(10);//Television is turned off!
        
        tv.turnON();//Television is Turning On
        tv.setChannel(5); 
        tv.setVolumeLevel(10); 
        System.out.println(tv);//television{channel=5, volumeLevel=10, button=true}
        
        //buradaki tüm değerler heapteki tv alanında değişmektedir.
        
        
        System.out.println(tv.objectInfos(tv));// return "television{" + "channel=" + channel + ", volumeLevel=" + volumeLevel + ", button=" + button + '}';        
        //Object return eden ut.println(television.classmethodun içine tv object ini koydum tv object ide toString methodu sayesinde degerleri yazdırır
        System.out.println(television.class);// class javaoop.television
        
        
        
        
        television tv1 =new television(2,12,true);
        System.out.println(tv1);//television{channel=2, volumeLevel=12, button=true}
        //javaoop.television@1d251891
        
        Object obj[]=new Object[5];//5 tane obje alan array
        //obj ya da obj[] ile sadece object classını içindeki methodlar çagrılır.
        //television classında object sınıfından üretilmiş method var ama cağıramam
        //yani obj[].objectInfos(); diyemem
        
        obj[0]=tv;//tv is an object of television class
        //obj[0] sadece kendi Object classının içndeki methodlara ulaşır.
     
        obj[1]=tv1; //tv1 is an object of television class
        obj[2]=tv1.getChannel(); //2 - private int variable degil 2 objecttir
        obj[3]=tv1.classInfos2(tv).getChannel(); //5 objectir
        //int sd=obj[3];   object can not be converted to int -ERRORR
        //tv1 nesnesi ile class içindeki class methoda gittim
        //içine classa ait nesne koydum,elimde bu nesne var.
        //nesne ile class içindeki başka methodu cagırdım.
        obj[4]=4;
    
        System.out.println(obj[0]);//television{channel=5, volumeLevel=10, button=true}
        System.out.println(obj[1]);//television{channel=2, volumeLevel=12, button=true}
        //toString() olmasaydı javaoop.television@1d251891 yzardı
        System.out.println(obj[2]);//2
        System.out.println(obj[3]);//5
        System.out.println(obj[4]);//5
        
        System.out.println(obj);// [Ljava.lang.Object;@14acaea5 - heapteki arrayın alanının reference numarsı
        System.out.println(Arrays.toString(obj));//[television{channel=5, volumeLevel=10, button=true}, television{channel=2, volumeLevel=12, button=true}, 2, 5, null, null, null, null, null, null]
            
        //toString() olmasaydı
        //[javaoop.television@e580929, javaoop.television@1d251891, 2, null, null, null, null, null, null, null]
        
        television[] TV=new television[3];
        //TV[0]=tv.getChannel();//int type cannot be converted in television type -ERROR
        TV[0]=tv.classInfos2(tv);//television type
        
    }
    // </editor-fold>    
   
    //<editor-fold defaultstate="collapsed" desc=" personnel ">
    public static void personnel()
    {
        //static int a; methodun içine static deger yazılmaz
        int a;//bu olur
        personnel p=new personnel();//clasın içinde default construvtor method olmasa da bu satır calısır.varmış gibi calısır.
        p.setName("Emre");p.setSalary(5000);      p.showInfos();//non-static:1  static:1
        
        personnel p1=new personnel();
        p1.setName("zeko");p1.setSalary(10000);   p1.showInfos();//non-static:1  static:2
        
        personnel p2=new personnel();
        p2.setName("duman");p2.setSalary(7000);   p2.showInfos();//non-static:1  static:3



        System.out.println(p.personnelNum);// 3   static public deger            object.variable
        System.out.println(personnel.personnelNum);//3    static public deger    class.variable
        personnel.personnelNum=10;
        System.out.println(p.personnelNum);//10
        //ATTENTION! only for static values
        p.law();//seceneklerde cıkmaz ama manuel olarak yazarsan compile error almazsın
        personnel.laww();//static method
        
        
       
        //class ismiyle sadece static methods and variableslar cagırılabilir.
    }// </editor-fold>   
    
    //<editor-fold defaultstate="collapsed" desc=" computer ">

  
    public void computer()//nesneye özgü non-static
    {
        //HER NESNE CLASS ICINDEKI INSTANCE YA DA REFERENCE TYPE VARIABLELARI BARINDIRIR.
        String productorFirms []={"HP","LENOVA","MICROSOFT"};
        computer pc=new computer(productorFirms,8,16);
        computer pc1=new computer(new String []{"DELL","ASUS","GOOGLE"},10,12);

        //toString()methodu override edildi.
        System.out.println(pc);//  computer{productors=[HP, LENOVA, MICROSOFT], productorItem=item, coreNumber=8, Ram=16}
        System.out.println(pc1);// computer{productors=[DELL, ASUS, GOOGLE], productorItem=item, coreNumber=10, Ram=12}

        //"HP" IS STRING type - productorFirms[0] is String type      
        pc1=new computer(productorFirms[0],10,11);//2. CONSTRUCTOR
        System.out.println(pc1);//computer{productors(array)=null, productorItem=HP, coreNumber=10, Ram=11, info=null}
        //nesneye String array atanmadı
       
        pc1=new computer(productorFirms,productorFirms[0],10,11);//3. CONSTRUCTOR - pc1 variable'ı artık yeni nesneyi refer ediyor
        System.out.println(pc1);//computer{productors=[HP, LENOVA, MICROSOFT], productorItem=HP, coreNumber=10, Ram=11}

        computer pc2=pc; //pc variable'ının refr etttiği alanı refer edecek
        computer pc3=pc.info;//yeni bir class nesne degiskeni pc3, class içinde olusturulan info değişkenin temsil ettiği seyi temsil eder.
        //info variable 'ı ile nesne olusturulmadı bos null dendi.
        
        //param computer
        printPC(pc,pc.info,pc2,pc3);//nesne class type bir degerdir.oyuzden methodun içine param olarak koyabiliriz. 
        
        //param object
        printtPC(pc);//computer{productors=[Ljava.lang.String;@68be2bc2, productorItem=item, coreNumber=8, Ram=16, info=null}
        printtPC(javaoop.computer.info);//class ile,  class içindeki objecte ulatık - null
        
        ///info class iiçndekki initialized edimiş bir STATIC object'tir
        pc.info=pc;//object ile ile class içindeki objecte ulatık - null dı şimdi pc ile aynı değerleri tasıyor
        System.out.println(computer.info);//computer{productors=[Ljava.lang.String;@7823a2f9, productorItem=item, coreNumber=8, Ram=16}
        
        
        //dizilerin numaraları aynı olmaması için, ve herhangi bir dizideki değişim diğerini otomatik olarak
        //etkilemsin diye,bunun sonunca immutable nesneler meydana gelmesi için getProductors2() methodunu kullanıcaz
        String [] manufacturer=pc.getProductors2();  //yeni arrayın referansını tasır
        System.out.println(Arrays.toString(manufacturer));//[HP, LENOVA, MICROSOFT]
        manufacturer[0]="apple";
        System.out.println(Arrays.toString(manufacturer));//[apple, LENOVA, MICROSOFT]
        System.out.println(Arrays.toString(pc.getProductorsList()));
        
        //yeni dizinin numarası class içindeki dizi ile aynı
        //oyuzden burdaki bir değişiklik class içindeki diziyide etkilicek.
        //Class içindeki bir dizi de
        printPC(pc,0);//FIRMS:HP   CoreNum:8   Ram:16

        
        
        //immutable değil-(SHALLOW COPY) denir.
        String [] manufacturer2=pc.getProductorsList();//classın içindeki array ile aynı referansa sahip olur
        //class içinde private productor dizisi var
        // bu diziye productorFirms diye diziyi yolladım.deger atamak için
        //daha sonra productor dizinin reference numarasına nesne.get methodu ile ulasıp yeni manufacturer dizisine yolladım.
        //YANI 1.DİZİNİN NUMARASI = 2. DİZİNİN NUMARASI
        manufacturer2[0]="orange";
        //yeni dizinin numarası class içindeki dizi ile aynı
        //oyuzden burdaki bir değişiklik class içindeki diziyide etkilicek.
        //Class içindeki bir dizi de
        printPC(pc,0);//FIRMS:orange   CoreNum:8   Ram:16



    }
    
    public static void printPC(computer print,int a)//sınıfa özgü
    {
        System.out.println("FIRMS:"+print.getProductorsList()[a]+
                "   CoreNum:"+print.getCoreNumber()+
                "   Ram:"+print.getRam());
        //FIRMS:apple   CoreNum:8   Ram:16
    }
    
    public static void printPC(computer print,computer print2,computer print3,computer print4)//sınıfa özgü
    {
        
        System.out.println("FIRMS:"+Arrays.toString(print.getProductorsList())+
                "   CoreNum:"+print.getCoreNumber()+
                "   Ram:"+print.getRam());
    //FIRMS:[HP, LENOVA, MICROSOFT]   CoreNum:8   Ram:16        //objenin alanına girdik.dizi var orda onun numarasını yazdırır 
        
        System.out.println("FIRMS:"+print.getProductorsList()[0]+
                "   CoreNum:"+print.getCoreNumber()+
                "   Ram:"+print.getRam());
        //FIRMS:HP   CoreNum:8   Ram:16
        
        System.out.println("print2:"+print2);//print2:null
        System.out.println("print3:"+print3);//print3:computer{productors=[Ljava.lang.String;@68be2bc2, productorItem=item, coreNumber=8, Ram=16, info=null}
        System.out.println("print4:"+print4);//print4:null
    }
    
    
    public static void printtPC(Object print)//static-sınıfa özgü
    {
        System.out.println(print); //computer{productors=[Ljava.lang.String;@68be2bc2, productorItem=item, coreNumber=8, Ram=16, info=null}
        //buraya yolladığım object computer classının 
        //computer classı toString() methodu içeriyor
        //bu yüzden bu nesneyi neasıl cağırırsam cağıram içi yazılır
    }
   
     

// </editor-fold>  
    
    //<editor-fold defaultstate="collapsed" desc=" calculator ">

    public static void calculator()////method ismi ile class ismi aynı olunca exceptionruntime alırız, compile error olmaz ama
    {              
        Calculator01 nesne =new Calculator01(); 
        System.out.println(nesne);
        System.out.println(nesne.add(10,20,30));//60 nesne.add() cıkmaz ben yazdım calısıyor
                 
        System.out.println(Calculator01.add(10,20,30));//10+20+30=60
        System.out.println(Calculator01.substitute(20,10,5));//20-10-5=5
        System.out.println(Calculator01.multiply(1,2,3,4));//1*2*3*4=24
        System.out.println(Calculator01.divide(20,2));//20/2/2/5=1
    }
  // </editor-fold>  
    
    //<editor-fold defaultstate="collapsed" desc="thisClass  ">

    static void thisClasss()
    {
        List<thisClass> studentList = new ArrayList<>(); //I created an arrayList
        thisClass o1=new thisClass("EMRE","DUMAN");
        thisClass o2=new thisClass("ZEKO","ALIEVSKI");
        
        studentList.add(o1);
        studentList.add(o2);
        System.out.println(studentList);//[thisClass{name=EMRE, surname=DUMAN}, thisClass{name=ZEKO, surname=ALIEVSKI}]
        
        o1.addd(studentList);//I put studentList(arrayList) as a parameter
        o2.addd(studentList);//I put studentList(arrayList) as a parameter
        
        //classımın içinde toString() methodu olmasaydı
        System.out.println(studentList);//[javaoop.thisClass@e580929, javaoop.thisClass@1cd072a9, javaoop.thisClass@1cd072123, javaoop.thisClass@1cd07234]
        System.out.println(studentList.get(0));//javaoop.thisClass@e580929
        System.out.println(studentList.get(0).name);//EMRE
        System.out.println(studentList.get(1).surname);//ALIEVSKI
        System.out.println(studentList.get(1).toString());//javaoop.thisClass@1cd072a9
        
        /*classımın içine toString() yazdıktan sonra
        [thisClass{name=EMRE, surname=DUMAN}, thisClass{name=ZEKO, surname=ALIEVSKI},thisClass{name=EMRE, surname=DUMAN}, thisClass{name=ZEKO, surname=ALIEVSKI}]
        thisClass{name=EMRE, surname=DUMAN}
        EMRE
        ALIEVSKI
        thisClass{name=ZEKO, surname=ALIEVSKI}
        */
    }
      // </editor-fold>  
       
    //<editor-fold defaultstate="collapsed" desc="car - composition  ">

    static void car()
    {
        Car car1=new Car();
        /*
            Honda isimli ve 135 beygirgüçlü motor oluşturuldu
            Seats{cover=leather, color=white}
            Electronics{gear=automatic gear, airConditioner=4*4 Air Conditionar}
            innerDesign{seat=Seats{cover=leather, color=white}, electronic=Electronics{gear=automatic gear, airConditioner=4*4 Air Conditionar}}
            innerDesign{seat=Seats{cover=leather, color=white}, electronic=Electronics{gear=automatic gear, airConditioner=4*4 Air Conditionar}}
            Seats{cover=leather, color=white}
            Motor çalıştırıldı
            Kırmızı renkli 2019 model Toyota marka araba oluşturuldu
        */
        
        System.out.println(Car.innerDesign.electronic.airConditioner);//4*4 Air Conditionar - innerDesign nesnesi statictir
        //innerDesign electronic HER 2 Sİ DE STATIC NESNE AMA NESNELER İLE CAGRILMALILAR
        ////classın adı da ve nesnesinin adı da --> innerDesign 
        //toString ile alakası yok çünkü primitive data yazdırıyorum
        System.out.println(car1.innerDesign.electronic);//Electronics{gear=automatic gear, airConditioner=4*4 Air Conditionar}
        //toString olmasaydı - javaoop.Electronics@6fb554cc
        car1.hareketeGec();//Araba harekete geçiyor
        //car1.durmayaBasla();//Araba durmaya başladı
        Car.durmayaBasla();//Araba durmaya başladı
        
        InnerDesign i=new InnerDesign();
        //composition ile Car nesnesi>inerDesign nesnesi>Electronics ya da Seats nesnesi
        Electronics electronic01 =new Electronics();//direk heapte nesne
        Electronics electronic02 =i.electronic;//HEAP InnerDesign nesnesi icinde Electronics nesnesi
        Electronics electronic03 =car1.innerDesign.electronic;//HEAP Car nesnesinde InnerDesign nesnesi icinde Electronics nesnesi
    }
      // </editor-fold>  
    
    //<editor-fold defaultstate="collapsed" desc="Circle and Cylinder (Inheritance-override-super-null-toString())">
        public static void Circle_Cylinder()
        {
            Scanner input=new Scanner(System.in);
            Circle c = new Circle();
            System.out.println(c);//radius = 5.0 area of circle = 75.0
            System.out.println(c.getRadius()+ " " +c.areaCircle());//5.0 75.0
           
            Cylinder cy1=new Cylinder(); //to call no argument constructore
            System.out.println(cy1);//radius = 5.0 area of circle = 75.0 height=10.0 area of cylinder= 464.0
            //toString method in Cylinder is overrided(super().toString+......)

            System.out.println("radius = "+cy1.getRadius());   //radius = 5.0  - CYLINDER Classı superClassından method ve variable çekebilir
            System.out.println("height = "+cy1.getHeight());   //height = 10.0 
            System.out.println("area of cylinder = "+cy1.areaCylinder());//area of cylinder = 464.0
            System.out.println("area of circle = "+cy1.areaCircle());//area of cylinder = 75.0 parentin özelliğine erişebilir

            //child parenttan radius özelliğini inherit etti.
            //yine parenttan inherit etttiği setRadius() ile radius u değistirdi.
            //parent radius2u yazdırırsa değişmiş OLMAZ.PARENT'IN ÖZELLİĞİ KENDİSİ DEGISTIRIR
            cy1.setRadius(20);
            System.out.println(cy1.getRadius());//20 cy1 alanı baska
            System.out.println(c.getRadius());//5 c alanı baska yine 5 kalır
            c.setRadius(30);
            System.out.println(c.getRadius());//30
            System.out.println(cy1.getRadius());//20 cy1 alanı baska

            Cylinder cy3 =new Cylinder();
            System.out.println(cy3.getRadius());//5.0
            
            
            
            System.out.println("enter any value for radius");
            double r=input.nextDouble();//10
            System.out.println("enter any value for height");
            double h=input.nextDouble();//10

            Cylinder cy2=new Cylinder(r,h); //callilng argument constructore
            System.out.println(cy2.toString());//radius = 10.0 area of circle = 300.0 height=10.0 area of cylinder= 1228.0


        }
        
// </editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="A-B-C(inheritance-override-super-this-grandpa-dad-son)">
 
    public static void override() 
    {  
       AAA a=new AAA();//constructor-A
       a.publicMethod();//public method
       System.out.println(AAA.staticPublicV);//static public-a
       
       BBB b=new BBB();       //constructor-A        //constructor-B
       b.publicMethod();
       /*
            final public-a
            public method
       */
       
       CCC c=new CCC();//constructor-A      //constructor-B   //constructor-C
       c.publicMethod();
       /*
            final public-a
            public method
            b3
            b3
            b3
            b3
            b3
            default-a
       */
              CCC c2=new CCC();//constructor-A      //constructor-B   //constructor-C
              System.out.println(c2.protectedV);//protected-a

            
       
    }
        
        // </editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Squaree-Rectangle(inheritance-super-override-toString() )">
        static public void Square_Rectangle()
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter side value");
            double s=sc.nextDouble();//10
            System.out.println("enter height value");
            double he=sc.nextDouble();//10
            System.out.println("enter width value");
            double w=sc.nextDouble();//10
            Rectangle r1=new Rectangle(s,he,w);
            r1.area();//Rectangle classının area methodu Square classının area metodunu hem super eder hem override eder.
            System.out.println(r1.toString());//toString() methodunu override etmedim rectangle classında

            Squaree s1=new Squaree(5);
            s1.area(); //calles subclass version of method
            /*
                side = 5.0
                area of square = 25.0
            */
        }
// </editor-fold>
        
    //Kisi-Personal-Ogrenci-MezunOgrenci'nin methodu classın içinde-kalıtımlı ornek
        
    //<editor-fold defaultstate="collapsed" desc="overriding-overloading(static/dynamic Polymorphism">

    public static void polymorphism()
    {
        // Polymorphism => Coklu yapi 
        // Overloading ve Overriding ile bir method polymorphism haline getirilir.
        // Polymorphism'i Overloading ile yaparsaniz "Compile Time Polymorphism" denir.
        //                Diger adi static polymorphim'dir.
        // Polymorphism'i Overriding ile yaparsaniz "Run Time Polymorphism" denir.
        //                Diger adi dinamic polymorphism'dir.

        Polymorphism01 pol=new Polymorphism01();
        pol.eat();//Ye1!
        pol.eat("emre");//emreYe11!
        
        //static methods and variable'lara child ulasır
        pol.drink();//staticMethod
        Polymorphism01.drink();//staticMethod
        System.out.println(pol.word);//StaticVariable
        System.out.println(Polymorphism01.word);//StaticVariable
        
        poly02 pol2=new poly02();
        pol2.eat();
        poly02.drink();//child parent daki static methodlara variablara ulasır
        pol2.drink();
        System.out.println(poly02.word2);

        /*
            poly02 YE!
            StaticVariable
            staticMethod
            staticMethod
            StaticVariable
            StaticVariable
            StaticVariable
            StaticVariable
            stativWord'u degistirdim
        */     
        System.out.println(Polymorphism01.word);//stativWord'u degistirdim
        //static methods and variable'lara child ulasırdegişiklik YAPAR.
        System.out.println(Polymorphism01.word2);//null
        Polymorphism01.word2="staticVariable'a deger atadım";
        System.out.println(Polymorphism01.word2);//staticVariable'a deger atadım
        
        System.out.println(poly02.word2);//staticVariable'a deger atadım
        poly02.word2="parenttaki staticVariable'a child ulastı ve değiştirdi";
        System.out.println(Polymorphism01.word2);//parenttaki staticVariable'a child ulastı ve değiştirdi


    }
    

// </editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="hayvan-kopek-kedi(static/dynamic Polymorphism)(upcasting(explicit-dogrudan)-downcasting(implicit-dolaylı))--INSTANCEOF">
    
    public static void PolymorphismKavrami()
    {
        
        Hayvan h1=new Hayvan();   //hayvan class'ı default constructure
        Kopek kopek1=new Kopek("Golden");
        /*
        hayvan class'ı default constructure
        Kopek class'ı 1 param constructor
        */
            
        Kedi kedi1=new Kedi("Van Kedisi");//hayvan class'ı default constructure
       
        
        
        System.out.println(h1);    //Hayvan{ayakSayisi=0}
        System.out.println(kopek1);//Hayvan{ayakSayisi=0}Kopek{tur=Golden}
        System.out.println(kedi1);//Hayvan{ayakSayisi=4}Kedi{cinsi=Van Kedisi}

        yavruKopek yKopek=new yavruKopek();
        /*
        hayvan class'ı default constructure
        Kopek class'ı default constructor
        hayvan:dog-yavruKopek
        this.hayvan:dog-yavruKopek
        super.hayvan:hayvan-dog
        */
        
        System.out.println(yKopek);//Hayvan{ayakSayisi=0}Kopek{tur=null}
        
        System.out.println("yKopek.hayvan   "+yKopek.hayvan+
                        "\nyKopek.dog  "+yKopek.dog+
                        "\nyKopek.yavruKopek  "+yKopek.yavruKopek); 
        //yKopek.hayvan   dog-yavruKopek
        //yKopek.dog  dog
        //yKopek.yavruKopek  yavruKopek
        
        
        yavruKopek yKopek2=new yavruKopek("a");
        /*
            hayvan class'ı default constructure
            Kopek class'ı 1 param constructor
        */

        Hayvan ykopek03=yKopek2;
        adiniSoyle1(ykopek03);
        /*
        Ben bir yavru köpek nesnesiyim
        Ben bir yavru köpek nesnesiyim
        else if(hayvan instanceof Kopek)
        */
        
        Hayvan kopek11=kopek1;//bu olur
        //kopek11 variable'ı Hayvan Class'ının içeriğine ulasır
        adiniSoyle1(kopek11);//2*Ben bir köpek nesnesiyim+if(hayvan instanceof Hayvan) calıştı
        
        adiniSoyle1(h1);//2*Ben hayvan sınıfı nesneyim+if(hayvan instanceof Hayvan) calıştı -UPCASTING
        adiniSoyle1(kedi1);//2*Ben bir kedi nesnesiyim+if(hayvan instanceof Hayvan) calıştı -UPCASTING
        adiniSoyle1(kopek1);//2*Ben bir köpek nesnesiyim+if(hayvan instanceof Hayvan) calıştı -UPCASTING
        
        byte a=1; short b=a; int c=b;  long d=c; //UPCASTING
        long x=1; int y=(int)x; short z=(short)y; byte q=(byte)z; //DOWNCASTING
        
         
        System.out.println(kedi1.getCinsi());//Van Kedisi
        System.out.println(kopek1.getTur());//Golden
        
        //üst sınıf degiskeninin alt sınıflara nesnelerine referans edebilmesidir.
        Hayvan h2=new Hayvan();
        Hayvan kopek2=new Kopek("Golden2");//implicit(dolaylı)- kopek nesnesi var bunu hayvan sınıfından üretilmiş değişken ismi cagırıyor
        Hayvan kedi2=new Kedi("Van Kedisi2");//implicit(dolaylı)
        
        Kopek kopek22=(Kopek)kopek2;//Upcasting - explicit casting (dogrudan)
        //kopek2 Kopek sınıfının nesnesi olabilir ama veri tiipi olarak Hayvan classıdır
        //kopek22 variable'ı Kopek Class'ının içeriğine ulaşır( inherit ettiği classların içeriğini de barındırır)dolaylı olarak ulasmış olur
        adiniSoyle1(kopek22);//2*Ben bir köpek nesnesiyim+if(hayvan instanceof Hayvan) calıştı
               
        adiniSoyle1(h2);//2*Ben bir hayvan nesnesiyim+if(hayvan instanceof Hayvan) calıştı
        adiniSoyle1(kedi2);//2*Ben bir kedi nesnesiyim+if(hayvan instanceof Hayvan) calıştı
        adiniSoyle1(kopek2);//2*Ben bir köpek nesnesiyim+if(hayvan instanceof Hayvan) calıştı
        
        //System.out.println(kedi2.getCinsi());//Van Kedisi - error
        //System.out.println(kopek2.getTur());//Golden - error
        
        
        Object h3=new Hayvan();
        Object kopek3=new Kopek("Golden3");
        Object kedi3=new Kedi("Van Kedisi3");
        
        //bu methodda toString() methodu override edildi
        adiniSoyle2(h3);//Hayvan{ayakSayisi=0}+else(object instanceof Hayvan) calıştı - hayvan classının icinde toString override edilmiş olmasaydı javaoop.Hayvan@97e1986 yazıcaktı
        adiniSoyle2(kedi3);//Kedi{cinsi=Van Kedisi3}+else if(object instanceof Kedi)
        adiniSoyle2(kopek3);//Kopek{tur=Golden3}+else if(object instanceof Kopek)
        
        
        
        Object h4=new Hayvan();
        Hayvan kopek4=new Kopek("Golden4");
        Hayvan kedi4=new Kedi("Van Kedisi4");
        
        adiniSoyle2(h4);//Hayvan{ayakSayisi=0}+else(object instanceof Hayvan) calıştı - hayvan classının icinde toString override edilmiş olmasaydı javaoop.Hayvan@97e1986 yazıcaktı
        adiniSoyle2(kedi4);//Kedi{cinsi=Van Kedisi4}+else if(object instanceof Kedi)
        adiniSoyle2(kopek4);//Kopek{tur=Golden4}+else if(object instanceof Kopek)
      
        
        
        Hayvan yavruKopek1=new yavruKopek("yavru kopek");
        Kopek yavruKopek2=new yavruKopek("yavru kopek");
        Object yavruKopek3=new yavruKopek("yavru kopek");
        
        adiniSoyle2(yavruKopek1);//Kopek{tur=yavru kopek}+if(object instanceof yavruKopek) - eger if bulağa yavrukopeği yazmasaydım, else if(object instanceof Kopek) yazacaktı çünkü yavrukopek kopek classının cocugu yani yavru kopeknesnesi is instanceof kopek
        adiniSoyle2(yavruKopek2);//Kopek{tur=yavru kopek}+if(object instanceof yavruKopek)
        adiniSoyle2(yavruKopek3);//Kopek{tur=yavru kopek}+if(object instanceof yavruKopek)
        
        System.out.println(yavruKopek2.hayvan);
        System.out.println(yavruKopek1.hayvan);
        //System.out.println(yavruKopek3.hayvan);object classının instance compile olarak oyuzden hayvana ulasmaz
    }
    
    /*
    public static void adiniSoyle(Kedi hayvan)
    {
      //BU METHODA GEREK YOK  
    }
    
    public static void adiniSoyle(Kopek hayvan)
    {
        //BU METHODA DA GEREK YOK
    }
    */
    public static void adiniSoyle1(Hayvan hayvan)//UPCASTING OLUR polymorphism child'ın nesnesini parent kendi nesnesi gibi görebilir
    {
        //3 SINIF ICIN DE YETERLİDİR
        hayvan.adiniSoyle();//nesne üzerinden işlem yapar
        //BURADA LATE BINDING VARDIR-GEC BAGLAMA-RUNTIME 
        //Bir nesne örneğinin hangi nesneye bağlandığıve hangi nesneye ait olduğunun 
        // çalışma anında belirlenmesidir.(Runtime Binding)
       
        //hayvan.setCinsi("kedi");errror
        //hayvan.setTur("kopek");errror
        
        //burada da polimorphism var yani polimorphism olmasaydı bu kodu yazacaktık dememiz yanlış olur-dogru adiniSoyle2 methodunda
        if(hayvan instanceof Kedi)//cocuga ait olan sey babaya da ait oldugu için babayı basa yazma matık hatası yapmış lurum
        {
            Kedi nesne=(Kedi)hayvan;
            nesne.adiniSoyle();

            System.out.println("if(hayvan instanceof Kedi) calıştı" );
        }
        else if(hayvan instanceof Kopek)
        {
            Kopek nesne=(Kopek)hayvan;
            nesne.adiniSoyle();//buradaki compile binding -Ben bir köpek nesnesiyim
            
            hayvan.adiniSoyle();//buda yukardakiyle aynı calısır.cunkü dinamik late binding var
            //Ben bir köpek nesnesiyim
            System.out.println("else if(hayvan instanceof Kopek)" );

        }
        else if(hayvan instanceof yavruKopek)
        {
            System.out.println("hayvan is instanceof yavrukopek");
        }
        else
        {           
            hayvan.adiniSoyle();
            System.out.println("else (hayvan instanceof Hayvan)" );
        }
            
        
    } 
   
    public static void adiniSoyle2(Object object)//UPCASTING OLUR polymorphism child'ın nesnesini parent kendi nesnesi gibi görebilir
    {
         //object.adiniSoyle();//yapamayız cunku Object classında böyle bir metod yok
         System.out.println(object.toString());        //BURADA LATE BINDING VARDIR-GEC BAGLAMA-RUNTIME 
         //bu code ile asagıdaki kodlardan kurtuluruz,her ekleyeceğim alt sınıf ile else if bloğu eklemek zorunda kalacaktım
        
        //<editor-fold defaultstate="collapsed" desc="WHAT IF POLIMORPHISM HAD NOT BEEN, WE WOULD NEED TO WRITE THESE CODES ">

        if(object instanceof yavruKopek)//GRAND-GRANDCHILD OF OBJECT
        {
            yavruKopek nesne=(yavruKopek)object;
            nesne.toString();//System.out.println(); yazmadığım için yazmaz
            System.out.println("if(object instanceof yavruKopek)");
        }
        else if(object instanceof Kedi)//GRANDCHILD OF OBJECT
        {
            Kedi nesne=(Kedi)object ;
            nesne.toString();
            System.out.println("else if(object instanceof Kedi)");
            
        }
        else if(object instanceof Kopek)//GRANDCHILD OF OBJECT
        {
            Kopek nesne=(Kopek)object ;
            nesne.toString(); 
            System.out.println("else if(object instanceof Kopek)" );

        }
        else//object instanceof Hayvan - CHILD OF OBJECT
        {
            object.toString();
            System.out.println("else(object instanceof Hayvan) calıştı" );
        }
          // </editor-fold>
     }

// </editor-fold>
    
    //polimorphism03
    
    //<editor-fold defaultstate="collapsed" desc="early(compile time-static and final method)-late(run time-overrideable methods)binding">
    
    public static void binding()
    {
        //kısacası polimorphism olayında alt sınıflardan sadece override edilmiş methodlara eriilir
        /*
            Static veya Early Binding veya Erken Bağlama
            static ve final metotlar compile time da bind edilir. Çünkübu metotlar override edilemezler. 
            Bundan dolayıdaha kodu yazarken hangisinin çalıştırılacağıbellidir.
        */
       
        /*
            Dynamic Late Binding Geç Bağlama
            Her sınıf gizli bir kalıtımla Object sınıfından türetilebilir demiştik. Ve object sınıfının toString metotu bulunmaktaydı. Oluşturacağımız tüm sınıflar bu metotu override ederek kendi isteklerine göre değiştirebilirdi. Peki:
            Object obj=new GeometrikSekil();
            System.out.println(obj.toString());
            bu ifade de Object sınıfının mıyoksa GeometrikSekil sınıfının mıtoString metotu çağrılacak ? Gelin bu sorunu inceleyelim...
            Object obj=new GeometrikSekil();
            Object obj;
            obj=new Object();
            Her değişkenin mutlaka bir veri türüolmalıdır. Buna declared type denir.
            Değişken adımız obj, declared type : Object
            Bu değişken türüreferans tipli olduğu için ya null ya da declare edilmişveri türünden olan bir nesnenin referansınısaklar. Ayrıca declare edilmişsınıfın alt sınıflarının referanslarınıda saklayabilir.
            Geometrik şekil Object sınıfının alt sınıfıolduğu için sorun çıkmayacaktır. Ve obj değişkenin declared tipi Object bile olsa aslında GeometrikSekil türündeki nesneyi gösterir. Bundan dolayı;
            Değişken adımız obj, actual type : GeometrikSekil
            obj.toString() çağrıldığında hangi sınıftaki metotun tetikleneceği obj nesnesinin actual type'ına göre belirlenir. Yani obj.tostring çağrıldığında GeometrikSekil sınıfının toString metotu tetiklenir.
            Bu durumadinamik bağlama veya dynamic bindingdenir.Kısacasıkalıtım zincirinde bir metotun farklısınıflarca kullanılmasıdurumunda JVM'nin çalısma anında hangisini çalıstıracağına karar vermesi olayıdır.
            Birden fazla üst sınıf olduğunda cagrılan metot en alt sınıftan en üst sınıfa doğru aranır. Bulunmazsa bir üst sınıfa bakılır.
            Static binding compile zamanı, dinamik binding çalışma zamanında olur
            •
            Static bağlama static ve final metotlarda olur çünkü bunlar değiştirilemez. Dinamik binding çalışma anında değişkenin nesneye bağlandığızaman override edilmişmetotlar sayesinde olur.
            •
            Farkları
            Static binding compile zamanı, dinamik binding çalışma zamanında olur
            Static bağlama static ve final metotlarda olur çünkü bunlar değiştirilemez. 
            Dinamik binding çalışma anında değişkenin nesneye bağlandığızaman override edilmişmetotlar sayesinde olur.  
        */
        
        UstSinif.StaticMethod();//nesnesiz cagırdım static methodu
        //Üst sınıfın static adını söyle metotu çağrıldı
        AltSinif.StaticMethod();//nesnesiz cagırdım static methodu
        //Alt  sınıfın static adını söyle metotu çağrıldı

        UstSinif ustSinifNesnesi=new UstSinif();
        ustSinifNesnesi.StaticMethod();//nesneyle cagırdım statik metodu
        //Üst sınıfın static adını söyle metotu çağrıldı

        AltSinif altSinifNesnesi=new AltSinif();
        altSinifNesnesi.StaticMethod();//nesneyle cagırdım statik metodu
        //Alt  sınıfın static adını söyle metotu çağrıldı

        
        UstSinif ustSinif=new AltSinif();
        ustSinif.StaticMethod();//adiniSoyleStatic() bu method altsınıfta override edilemez.oyuzden üst sınftaki adiniSoyleStatic() cagrılır
        //Üst sınıfın static adını söyle metotu çağrıldı
        //STATIC - EARLY BINDING - COMPILE TIME BINDING - BECAUSE ustSinif object will not search for adiniSoyleStatic() method into other classes

        System.out.println(ustSinif.a);//UstSınıf
        //late binding olayı sadece overriding olayında olur
        //superclass'ta String a var subclass'ta da String a var ama overriding olayı yok.
        System.out.println(altSinifNesnesi.a);//AltSinif

        ustSinif.nonStaticMethod();//adiniSoyle() methodu static degil ve override edildi.als sınıftaki method cagrıldı.
        //Alt  sınıfın  1.non-static metotu çağrıldı       
        //DYNAMIC - LATE BINDING - RUN TIME BINDING

        /**/ustSinif.nonStaticMethod2();//Üst sınıfın  2.non-static metotu çağrıldı static değil ve belirtilen alt sıınıfta bakıcak.baktı yok bi üste cıktı üstte var ve yazdırdı.2 alt sınıfta var aslında  bu method ama oraya bakmaz
        
        UstSinif ustsınıf=new AltSinif2();
        //DYNAMIC - LATE BINDING - RUN TIME BINDING
        ustsınıf.nonStaticMethod();//2 Alt  sınıfın  non-static 1.metotu çağrıldı
        ustsınıf.nonStaticMethod2();//2 Alt sınıfın  non-static 2.metotu çağrıldı
        ustsınıf.nonStaticMethod3();//Alt sınıfın  non-static 3.metotu çağrıldı-bu method altsinif2 de yok,üst sınıfta var.AMA altsınıf2'den direk EN üst sınıfa atlamaz teker teker bakar.
        ustsınıf.methodOfustSinif();//üst sınıfın kendine has methodu-bu method altsinif2 de yok-altsinifta yok üst sınıfta var ve yazdırdı
        //STATIC - EARLY BINDING - COMPILE TIME BINDING
        ustsınıf.StaticMethod();//MANUEL YAZDIM-Üst sınıfın static  metotu çağrıldı
       
    }

// </editor-fold>
    
    //KonuyuToparlayalım(Canli-Kartal-Panda)Polimorphism / method classın içinde
    
    //<editor-fold defaultstate="collapsed" desc="methodsOfObjectClass()">

     static public void methodsOfObjectClass()
     {
        //methodsOfObjectClass.toStringMethodu();//Person{id=3000, name=EMRE}
        //methodsOfObjectClass.equalsMethodu();
        //methodsOfObjectClass.equals2Methodu();
        //methodsOfObjectClass.hashCodeMethodu();
        
        List<Person01> nesneListesi=new ArrayList<>(3);//3 ELEMANLI ARRAYLIST
        methodsOfObjectClass.finalizeMethodu(nesneListesi);
        
     }
    
// </editor-fold>
         

    //<editor-fold defaultstate="collapsed" desc="Final keyword">
     static public void finalKeyword()
     {
         grandChild o=new grandChild();
         o.callMethod2();
         o.callmethods3();

         grandChild o2=new grandChild();
         o2.callMethod2();

         Finalgrandchild obj=new Finalgrandchild();
         obj.method1();
         obj.method3();
         //obj.method4();//kendim yazdım static
         //obj.method4();
         //System.out.println(obj.a);
         Finalgrandchild.method4();
         Finalgrandchild.method2();
         System.out.println(Finalgrandchild.a);//3

         
         //polimorphism ve final method
        child c=new child();
        child c2=new grandChild();//final ve static methodlar alt snıfta override edilemez
        
        c.method1();//method1 final ve child'ındır /final method cannot be overrided
        c2.method1();//child'daki cagrılcak , zaten grandChild'da yoktu çünkü override edilememisti /final method cannot be overrided
         
     }

// </editor-fold>
// </editor-fold>
          
}


//<editor-fold defaultstate="collapsed" desc=" CLASSES ">


  //<editor-fold defaultstate="collapsed" desc=" Student(hashcode-equals-toString-get-set-const with/out params,this,default) ">
        

    
class Student
{
    private String name ="Emre";// 4 bit lik yer ayrildi Field Variable encapsulation kullan yani public method ile bu private variable a ulaş
    private int number  =1234;//objectsiz ulasılmaz    //heap bellekte 4byte(32bits) lık yer ayrıldı.

    
    private String a="private";//obje olustrulurken içine konur ve birdaha değiştirilemez
    public String b ="public";  
    protected String c="protected";  
    final String d="final";  
    static String e="Static";  
    String f="default"; //Default 
    
    
    byte by;
    short s;
    int i;
    long l;
    float fl;
    double dou;
    boolean bo;
    char ch;
    String str;
    
    public void defaultValues()
    {
        //System.out.println(by+s+i+l+fl+dou+bo+ch);//error because all primitive data types cant be merged
        System.out.println("default values:\nString:"+str+"\nbyte:"+by+"\nshort:"+s+"\nint:"+i+"\nlong:"+l+"\nfloat:"+fl+"\ndouble:"+dou+"\nboolean:"+bo+"\nchar:"+ch);//concanation
    }

    public void Student(){}//sıradan method  objectsiz cagıramazsın 
    
    //public double Student(){return 1;}//sıradan method  objectsiz cagıramazsın ama overloadiing olamaz
    //2 side params istemiyor. methodu cagırırken compiler sasırır.
    public int Student(int a) // yukardaki method overloading oldu objectsiz cagıramazsın
    {
        return a;    
    }
    
    
    public Student() //Constructor Method HEAP TE alan olusturur
    {
        //private name and number attributes convert into public format automatically  
        //due to public constructor can refactor private attr. in the class 
        //and public method can be used directly at outside of the class 
        //DEFAULT CONSTRUCTOR CAN BE USED WITHOUT BEING CREATED WITH CONDITION OF ANY CONSTRUCTOR WHICH HAS PARAMETERS DONT EXIST IN THE CLASS 
    }
    
    public Student(String name,int number) //Constructor Method HEAP TE alan olusturur overloading
    {
        name=name; 
        number=number;
        //this keyword unu kullanmazsam anlamaz ve değer atamaz.
        //çünkü aynı isme sahip, parametre ve field attribute
        //eski degerleri kullanır.
        
        this.name=name; 
        this.number=number;
        //student{name=DUMAN, number=3000}      
    }
    
    public Student(int numberr,String namee)//overloading constructor
    {
        number=numberr;
        name=namee;
    }

    public String getName() { return name;}
    public int getNumber() {return number; }
    
    public void setName(String name) { this.name = name;}
    public void setNumber(int number) {this.number = number;}

    
    
    
    
    @Override
    public String toString() 
    {
        return "student{" + "name=" + name + ", number=" + number + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + this.number;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.number != other.number) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    public boolean equals2(Object o)
    {       //let assume that,class has only 2 variables         
            Student e = (Student) o;
            //return this.getName() == e.getName();
            return	(this.name.equals(e.name) && this.number==e.number);
    }

    public boolean equals3(Student o)//bu override değil
    {
            //return this.getName() == e.getName();
            return	(this.name.equals(o.name) && this.number==o.number);
    }

} 
    // </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" Student2(constructions-this)/ classArray ">

class Student2
{
    String name;
    int number;
    String Program;
    boolean activity;//false
    static public int StaticINT;//INSTANCE DEGIL STATIC VARIABLE
    Student2 classaOZGU;//NESNE
    
  
    
    Object aaa;
    Random ccc;
    Array bbb;
    
    
    //THIS KEYWORD UNU TEST ETMEK İÇİN
    int a=10;//default calısır
    static int b=11;//static ifadesinde this calısmazz
    // static method does not need any object to be called, and this keyword
    //always point to a current object of a class. simply if there is no object
    //then how the keyword point to any current object so,we cannot use this keyword here.
    private int c=12;//calısır
    public int d=13;//calısır
    protected int e=14;//calısır
    final int f=15;//calısır
    
    
    public Student2()
    {
    //  INFO----const. without params is created automatically when we create an object
    //unless we did crate another constr.with params.
    //if we create a constr. with params. we need to write default constr. by hand.
    
        this.Program="no Program ";//işi girilmezse IT ci kabul et
        this.name="isimsiz";    
    }
    
    public Student2(String name) //girdiğim deger safdışı emre yazılacak
    {
        this(); //constructor method baska constr. method içine yazılabilir
        this.name=name;//isimsiz degeri değiştiriliyor
        
      
        
    }
     
    public Student2(String name, int number) 
    {
        //this.name = name;
        this(name);//yukardaki const.--  bu const. run edince ilk yukardaki run olucak sonra number run olucak
        this.number = number;


    }

    public Student2(String name, int number, String Program) {
        //this.name = name;
        //this.number = number;
        this(name,number);//(String,int) paramslı const. calısıcak
        this.Program = Program;
    }

    public Student2(String n, int num, String Pro, Boolean activity)
    {
        //this.name = name;
        //this.number = number;
        //this.Program = Program;
        this(n,num,Pro);//(String,int,String)paramslı constr. calısır.
        this.activity = activity;
    }
    
   
    @Override
    public String toString() 
    {
        if(!activity)
            return "THIS STUDENT IS INACTIVE";
        else
            return "Student2{" + "name=" + name + ", number=" + number + ", Program=" + Program + ", activity=" + activity + '}';
    }

            
    void classMETHOD()//INSTANCE METHOD
    {
        
    }
    Student2 classMETHOD2()
    {
        return null;
    } 
    
    static void classMETHOD3()//static METHOD
    {
        
    }
    
    
    
     

    
    
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" student3 -class Array ">

class student3
{
    private int id;
    private int grade;

    public student3()
    {
        
    }
    public student3(int id, int grade)
    {
        this.id = id;
        this.grade = grade;
    }
    
    public int getId() {return id; }
    public void setId(int id) { this.id = id;}    

    public int getGrade() {return grade;}
    public void setGrade(int grade) { this.grade = grade;}
 
    public String showInfos(){
        return "student3{" + "id=" + id + ", grade=" + grade + '}';
    }    

    @Override
    public String toString() {
        return "student3{" + "id=" + id + ", grade=" + grade + '}';
    }
    
    
    
    //ilk grade'e max dedim ve sonraki gradelerle kıyaslıyorum
    public void sort_StdList( List<student3>sortedArrayList)
    {
        for(int i=0; i< sortedArrayList.size()-1 ; i++)
        {
            int maxGrade=sortedArrayList.get(i).getGrade();//class array class objectleri barındırıyor,objecler variablesları barındırıyor
            //int indexOFmaxElement=i;
            
            for(int j=i+1; j< sortedArrayList.size()-1 ; j++)
            {
               if(maxGrade < sortedArrayList.get(j).getGrade())
               {
                   //maxGrade=sortedArrayList.get(j).getGrade();
                   //indexOFmaxElement=j;
                   sortedArrayList.set(i,sortedArrayList.get(j));
               }      
            }                  
        }
    }    
}
// </editor-fold>  

  //<editor-fold defaultstate="collapsed" desc="School Project ">


class OkulSistemiGiris 
{
	/*
	 * Öğretmen, öğrenci ve okul genel bilgilerinden oluşan JAVA programı yazınız.
	 * 
	 * 1. Adım : Okulun sabit bilgilerini içerisine ekleyeceğimiz SabitBilgiler adlı bir class oluşturalım
	 * 			 Buradaki verileri public static final olarak tutalım.
	 * 			 MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	 * 
	 * 2. Adım : Ogretmen adlı bir class oluşturalım.
	 * 			 Bu classta öğretmenin adı, branşı ve telefon numaralarını tutalım.
	 * 			 String isim, brans, telefon ;
	 * 			 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman öğretmenlerin bilgilerini yazdıralım
	 * 
	 * 3. Adım : Ogrenci adlı bir class oluşturalım.
	 * 			 Bu classta pgrencinin adı, okulnumarası bulunsun.
	 * 			 String isim;
	 *   		 int ogrenciNo;
	 *   		 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman ogrencilerin bilgilerini yazdıralım
	 * 
	 * 4. Adım : Ogretmenler adlı class oluşturalım.
	 * 			 Bu classta tüm öğretmenleri tutualım.
	 * 			 İçerisine List<Ogretmen> ogrentmenListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	 * 		     Bu class'ın içine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni öğretmen ekleyebilelim.
	 * 
	 * 5. Adım : Ogrenciler adlı class oluşturalım.
	 * 			 Bu classta tüm öğrenciler tutualım.
	 * 			 İçerisine List<Ogrenci> ogrenciListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	 * 		     Bu class'ın içine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni öğrenci ekleyebilelim.
	 * 	 
	 * 
	 * */
	public static void main() {
		System.out.println("****OKUL SİSTEMİNE HOŞGELDİNİZ****");
		/* Eğer nesne üreterek başka bir class'tan  bilgi almak istiyorsak ya da methodlara, değişkenlere
		 * erişmek istiyorsak, verilerimizi private yapabilir, onlara public methodlardan erişebiliriz.
		 * buna Encapsolution deniliyor. (getter ve setter methodları)
		 * */
		System.out.println("\nOkul İsmi : " + SabitBilgiler.OKUL_ISIM);
		System.out.println("Müdür Bey : " + SabitBilgiler.MUDUR);
		System.out.println("Telefon No : " + SabitBilgiler.TELEFON_NO);
		System.out.println("Website : " + SabitBilgiler.WEB_ADRES);
		System.out.println("Teknik Destek :" + SabitBilgiler.TEKNIK_DESTEK);
		System.out.println("Adres : " + SabitBilgiler.ADRES);
		
                Ogretmen ogretmenSuleymanBey = new Ogretmen();
		ogretmenSuleymanBey.setIsim("Süleyman Alptekin");
		ogretmenSuleymanBey.setBrans("JAVA");
		ogretmenSuleymanBey.setTelefon("0539999999");
		System.out.println("\nİsim : " + ogretmenSuleymanBey.getIsim());
		System.out.println("Branş : " + ogretmenSuleymanBey.getBrans());
		System.out.println("Tel : " + ogretmenSuleymanBey.getTelefon());		
                System.out.println(ogretmenSuleymanBey);
                
                
                Ogretmen ogretmenHamza = new Ogretmen();
		ogretmenHamza.setIsim("Hamza Yılmaz");
		ogretmenHamza.setBrans("Practice");
		ogretmenHamza.setTelefon("0536666666");
		System.out.println("\nİsim : " + ogretmenHamza.getIsim());
		System.out.println("Branş : " + ogretmenHamza.getBrans());
		System.out.println("Tel : " + ogretmenHamza.getTelefon());
                System.out.println(ogretmenHamza);
                
		Ogretmen1 ogretmenAyseHanim = new Ogretmen1("Ayşe Hanım","Selenium","0500000000");
		System.out.println("\nİsim : " + ogretmenAyseHanim.getIsim());
		System.out.println("Branş : " + ogretmenAyseHanim.getBrans());
		System.out.println("Tel : " + ogretmenAyseHanim.getTelefon());
                System.out.println(ogretmenAyseHanim);
                
                
                ogrenciii ogrenciEmreBey= new ogrenciii();
                ogrenciEmreBey.setIsim("Emre");
                ogrenciEmreBey.setNo(1);
                System.out.println(ogrenciEmreBey);
                System.out.println(String.valueOf(ogrenciEmreBey));//yukardaki ile aynı

                
                System.out.println("OGRETMEN SAYISINI BELIRLE VE BILGILERINI GIR, ARRAYLIST'i YAZDIR");
               
                Scanner scan=new Scanner(System.in);
                int GirilenOgretmenSayısı=scan.nextInt();
                List<Ogretmen> ogretmenListesi= new ArrayList<>(GirilenOgretmenSayısı);//3 student dedim
               //List generic class'tır
               //arraylist gibi güncelleme yapılmıyor çünkü List interfacedir,gettir settir yoktur
                Ogretmen ogretmenNesnesi = null;//NULL DEMEZSEM NESNE(BOS ALAN) OLUSMAMISTIR
                for(int i=0; i<GirilenOgretmenSayısı;i++)
                {
                    System.out.println("Please Enter the name of "+(i+1)+".Ogretmen");      String isim=scan.next();
                    System.out.println("Please Enter the brans of "+(i+1)+".Ogretmen");     String brans=scan.next();
                    System.out.println("Please Enter the telefon of "+(i+1)+".Ogretmen");   String telefon=scan.next();
                    ogretmenNesnesi=new Ogretmen(isim,brans,telefon);
                    ogretmenListesi.add(i,ogretmenNesnesi);
                }
                System.out.println(ogretmenListesi);
                System.out.println(ogretmenListesi.size());
                System.out.println(ogretmenNesnesi);//en sonki ögretmen_kutucuk
                
                OgretmenEkle(ogretmenHamza,ogretmenListesi);
                OgretmenEkle(ogretmenSuleymanBey,ogretmenListesi);
                
                System.out.println(ogretmenListesi);
                
                Object[] ogretmenArray=ogretmenListesi.toArray();//arraylistin için objectle dolu
                System.out.println(ogretmenArray[0]);//Ogretmen{isim=EMRE, brans=DUMAN, telefon=3000}
                //OGRETMEN SAYISINI 1 GIRDIM
                
                ogretmenNesnesi.setBrans("DUMANN");//ogretmen nesnesi oldugu için ve get set oldugu içiçn object ıcındeki belli bir dageri güncelleyebiliyoruz
                System.out.println(ogretmenArray[1]);//Ogretmen{isim=EMRE, brans=DUMANN, telefon=3000}

                System.out.println(ogretmenListesi.get(0));//Ogretmen{isim=emre, brans=DUMANN, telefon=3000}
                
                
                Ogretmen[] ogretmenArray2=new Ogretmen[2];
                System.arraycopy(ogretmenArray, 0, ogretmenArray2, 0, ogretmenArray2.length);//System.arraycopy() 2 dizi aynı kutuyu temsil eder
                
                System.out.println(ogretmenArray2);//[Ljavaoop.Ogretmen;@47c62251
                System.out.println(ogretmenArray2[0]);//Ogretmen{isim=1, brans=DUMANN, telefon=3}
                
                ogretmenArray2[0].setBrans("IT"); System.out.println(ogretmenArray[0]);//Ogretmen{isim=1, brans=IT, telefon=3}

                
                
                
                Ogretmen[] array2=new Ogretmen[2];
                array2[0]=ogretmenHamza;
                array2[1]=ogretmenSuleymanBey;
                System.out.println(Arrays.toString(array2));//[Ogretmen{isim=Hamza Yılmaz, brans=Practice, telefon=0536666666}, Ogretmen{isim=Süleyman Alptekin, brans=JAVA, telefon=0539999999}]
                array2[0].setIsim("hamzaa");
                array2[0].setBrans("practicee");
                ogretmenSuleymanBey.setIsim("süleymann");
                System.out.println(Arrays.toString(array2));//[Ogretmen{isim=hamzaa, brans=practicee, telefon=0536666666}, Ogretmen{isim=süleymann, brans=JAVA, telefon=0539999999}]

        }
        
        public static void OgretmenEkle(Ogretmen nesne,List<Ogretmen> liste)
        {
            liste.add(nesne);
        }
       
}
class Ogretmen {
	private String isim, brans, telefon;
	public Ogretmen() {
	}	

    public Ogretmen(String isim, String brans, String telefon) {
        this.isim = isim;
        this.brans = brans;
        this.telefon = telefon;
    }
        
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getBrans() {
		return brans;
	}
	public void setBrans(String brans) {
		this.brans = brans;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
    @Override
    public String toString() {
        return "Ogretmen{" + "isim=" + isim + ", brans=" + brans + ", telefon=" + telefon + '}';
    }
              
}

class Ogretmen1 {
	private String isim, brans, telefon;
	public Ogretmen1(String isim, String brans, String telefon) {
		this.isim = isim;
		this.brans = brans;
		this.telefon = telefon;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getBrans() {
		return brans;
	}
	public void setBrans(String brans) {
		this.brans = brans;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

    @Override
    public String toString() {
        return "Ogretmen1{" + "isim=" + isim + ", brans=" + brans + ", telefon=" + telefon + '}';
    }
               
}

class ogrenciii
{
    private String isim;
    private int no;

    public ogrenciii() {
    }
    public ogrenciii(String isim, int no) {
        this.isim = isim;
        this.no = no;
    }
    
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "ogrenciii{" + "isim=" + isim + ", no=" + no + '}';
    }  
}

class SabitBilgiler 
{
	/* Programda heryerden erişmek istediğimiz ve değiştirilmesini istemediğimiz değişkenler için
	 * static final kelimelerini kullanırız. 
	 * 
	 * Adlandırma yaparken, mümkünse tum karakterleri büyük harf yapar, kelimelerin arasına da
	 * "_" (alt tire) ekleriz.
	 * 
	 * Bu değişkenlere herhangi bir nesne üretmeden ya da extend yapmadan direk erişebiliyoruz.
	 * 
	 * */
	public static final String OKUL_ISIM = "Techproed";
	public static final String MUDUR = "Mesut Bey";
	public static final long TELEFON_NO = 03122222222l;
	public static final String WEB_ADRES = "http://techproed.com";
	public static final String TEKNIK_DESTEK = "Nazmi Bey";
	public static final String ADRES = "Güneş Doğacak Sokak, 2020  / 7";
	/* Eğer bir class'tan nesne üretilmesini istemiyorsak,
	 * constructor'ı private yaparız (Singleton Class)
	 * */
	private SabitBilgiler() {
	}
}
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" ENCAPCULATION (television)">

        //Encapsulation data saklama (data-hiding) yontemidir. 
        // Encapsulation iki stepte yapilir:
        //  1) Data'yi(variable, method) private yapmalisiniz.
        //  2) public olan getter() ve setter() methodlar uretmeliyim.
	//Variable'a atanan degerin degistirilmesini istemiyorsaniz o variable ile 
	//alakali setter() olusturmamalisiniz
	
	//Variable'a atanan degerin okunmasini istemiyorsaniz, o variable ile alakali
	//getter() olusturmamalisiniz.
	
	//Sadece getter() kullanir ve hic setter() kullanmazsaniz, variable degerleri 
	//degistirilemez demektir. Bu tarz class'lara "Immutable Class" denir.
	
	//Sadece setter() kullanir ve hic getter() kullanmazsaniz, variable degerleri 
	//okunamaz demektir
    class television
    {
        private int channel;
        private int volumeLevel;
        private boolean button;

        public television() 
        {
            this(1,5,true);//the const. below is run
        }

        public television(int channel, int volumeLevel, boolean button)
        {
            this.channel = channel;
            this.volumeLevel = volumeLevel;
            this.button = button;
        }
        
        public void turnON()////INSTANCE METHOD
        {
            if(button==false){
                button=true; System.out.println("Television is Turning On"); }
            
            else{
            System.out.println("Television is already turned on");}
                
        }
        
        public void turnOff()//INSTANCE METHOD
        {
            if(button==true){
                button=false; System.out.println("Television is Turning Off"); }
            
            else{
            System.out.println("Television is already turned off");}
                
        }
        //Object tüm classların babasıdır
        public Object objectInfos(Object a)           {return a;} 
        
        public Object objectInfos2(television a)       {return a;} 
        
        public television classInfos(Object a)        {return (television)a;}
        
        public television classInfos2(television a)   {return a;}
        
        public int intInfos(String a)                 {return Integer.valueOf(a);}//  int methd int param return eder
        
        //public int intInfos(String a)               {return a;}//  Error!!! int methd  returns int valuable         
        
        
        public int getChannel() {
            return channel;
        }

        public void setChannel(int channel) 
        {
            if(button==true && channel>0 && channel<100)
            {
                this.channel=channel;
            }
            else if(button==false)
            {
                System.out.println("Television is turned off!");
            }
            else
            {
                System.out.println("Wrong tv channel!");
            }
        }

        public int getVolumeLevel() {
            return volumeLevel;
        }

        public void setVolumeLevel(int volumeLevel)
        {
            if(button==true && volumeLevel>0 && volumeLevel<50)
            {
                this.volumeLevel=volumeLevel;
            }
            else if(button==false)
            {
                System.out.println("Television is turned off!");
            }
            else
            {
                System.out.println("Wrong volume level!");
            }
        }
       
        
        @Override
        public String toString() {
            return "television{" + "channel=" + channel + ", volumeLevel=" + volumeLevel + ", button=" + button + '}';
        }
        
        
    }   
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" Static inClass Variable/Methods (personnel)">

    class personnel//üst class static olamaz
    {
        
        private String name;//İnclass variable - instance variable
        private int salary;//class variable lar default deger alırlar
        private int personnelNumber;//nesneye özgü
        public static int personnelNum;//sınıfa özgü nesneler ortak kullanır

        
        static int en =12;  {en=10;}// static degere tekrar deger atanabilir
        static int boy=10;
        static int alan;
        static double pi;
        
        //static block classın içinde methodların dısında olusturulmalı
        //static block deger genellikle deger atamak için kullanılır.
        //otomatik calıstırılır
        static{//ilk üstteki static calısır
            en=5; alan=en*boy; System.out.println(alan);//5*10 = 50
            int abc=10;//burada atadığım degerler anca yine bu blok icinde kullanılırlar - baska static blokta ve classtaki baska bir methodda işlem göremezler
            int abc2=10;//static local variable dır
        }

        //static block her nesne olustrulunca calısmaz
        //sadece 1kez calısır.
        //static degerler her nesnede ortaktır
        //staic blogun asıl amacı static variable method tanımlamaktır
        static{//her değer xtatic olmak zorunda
            //abc2++; error
            en=4;//deger degiştirmek için kullandık
            alan=en*boy;//3 u de static olmak zorunda 4*10
            pi=3.14;//deger atamak için kullandık
            System.out.println(alan);//print edebiliriz 40
            
            int abc2=15; //yeni bir local variable olusturdum

        }
        {
           //static yada initializer blok icine method tanımlanamz
        }
        
        public personnel() //constructor her cagrıldıgında both inside of constr. and insides of static and nonStatic blocks runs
        {
            personnelNumber++;
            personnelNum++;
        }

        public String getName() {return name;}
        public int getSalary() {return salary; }
      
        public void setName(String name) {this.name = name;}
        public void setSalary(int salary)
        {
            if(salary<0)
                this.salary = 0; 
            else
                this.salary=salary;
        }

        public void showInfos()//INSTANCE METHOD
        {
            laww();//sınıfa baglı bir method ama nesne ile de ulasılablir.
            System.out.println("non-static:"+personnelNumber);
            System.out.println("static:"+personnelNum);//static variable
            int a;//yazdırırsam error alırım compile değil runtime errror alırım
            //System.out.println("int abc:"+abc);errror int abc was initialized in static method
        }
        
        public static void law()//INSTANCE DEGIL STATIC METHOD
        {

            //showInfos();//nesneye özgü bir method / non-static can not be referenced from a static context
            //this.salary=10;//non-static variable cannot be referenced from a static context
            //personnel.showInfos();//olamaz çünkü sadece static method  class adıyla cagrılır
            personnel nesne =new personnel();
            //nesne.showInfos();//nesne ile cagırdım nonStatic methodu in static method
            System.out.println("all workers are equals");
        }
         
        public static void laww()
        {
            law();//static içinde statik çagrılır
        }
        
        
        //subclasses 
        
        static class subClass{} //subclass static DE  olabilir

        class subClass2{}
        private class subClass4{}
        public class subClass3{}      
        protected class subClass5{}
        final class subClass6{}
     
  
        
    }
// </editor-fold>    

  //<editor-fold defaultstate="collapsed" desc=" IMMUTABLE objects-refering object to methods(computer) ">

    class computer
    {
        //IMMUTABLE CLASS setter içermez, değer atamak için constructor kullanırız.
        /*
        Genellikle bir nesne oluşturur ve içeriğini değiştiririz. 
        Ama bazıdurumlarda bir nesneyi oluşturup, değerlerini atayıp sonrasında o değerlerin değiştirilmemesini isteyebiliriz.
        Böyle nesnelere immutable object ve bu nesnelerin sınıflarına da immutable class denir.
        */

        /*
        Immutable class means that once an object is created,
        we cannot change its content. In Java, all the wrapper
         classes (like Integer, Boolean, Byte, Short) and String class is immutable. ...
          The class must be declared as final (So that child classes can't be created)
         */

        /*
        primitive data type ları private yap  ve setter koyma , böylece immutable dır
        reference data type lar ise değiştrilebiliyor 
        */
        private String [] productorsList;//reference data type
        private String  productorItem="item";
        private int coreNumber;
        private int Ram;
        static computer info;//obje

   
        public computer(String[] productorsList, int coreNumber, int Ram) {
            this.productorsList = productorsList;
            this.coreNumber = coreNumber;
            this.Ram = Ram;
        }  

        public computer(String productorItem ,int coreNumber, int Ram) {
            this.productorItem = productorItem;
            this.coreNumber = coreNumber;
            this.Ram = Ram;
        }
        
        public computer(String[] productorsList,String productorItem , int coreNumber, int Ram) {
            this.productorsList = productorsList;
            this.productorItem=productorItem;
            this.coreNumber = coreNumber;
            this.Ram = Ram;
        } 
        public String getProductorItem() {return productorItem; }
                
        public String[] getProductorsList()  {return productorsList;    }
        
        public int getCoreNumber() { return coreNumber;}

        public int getRam() {return Ram;}    
        
        public String[] getProductors2() //immutable nesne için
        {
            String copyProductors[]=new String[productorsList.length];//yeni string olusturdum
            for(int i=0;i<productorsList.length;i++)
            {
                copyProductors[i]=productorsList[i];//burada adresler eşitlenmez sadece içlerindeki degerler atanır
            }
            return copyProductors;
        }

       

        @Override
        public String toString() {
            return "computer{" + "productorsList=" + Arrays.toString(productorsList) + ", productorItem=" + productorItem + ", coreNumber=" + coreNumber + ", Ram=" + Ram + '}';
        }
    }
// </editor-fold>    
 
  //<editor-fold defaultstate="collapsed" desc=" calculator-static methods">

    class Calculator01
    {
       
       public static int add(int ...parameters)
       {
           int  total=0;
           for(int i:parameters)
               total+=i;
           return total;                  
       }
        
       public static int substitute(int ...parameters)
       {
           int  substitute=parameters[0];
           for(int i=1 ; i<parameters.length-1 ; i++ )
               substitute-=parameters[i];
           return substitute;                  
       }
       public static int multiply(int ...parameters)
       {
           int multiply=1;
           for(int i:parameters)
               multiply*=i;
           return multiply;                  
       }
       public static double divide(int ...parameters)
       {
           int  divide=parameters[0];
            for(int i=1 ; i<parameters.length-1 ; i++ )
            {
               if(parameters[0]!=0)
                   divide/=parameters[0];
               else{
                   System.out.println("division is not done!");
                   return -1;
               }
           }
           return divide;
       }
    }

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" super - this ">


class superclass
{
    int hello=0;
    void nasılsın(){};
    void naber()
    {
        System.out.println("naber-superclass");

    }
}
class subclass extends superclass
{
    int hello=1;

    @Override
    void nasılsın(){};

    @Override
    void naber() {
        System.out.println("naber-subclass");
        super.naber();//naber-superclass
        super.naber();//naber-superclass
        //this.naber(); runtime error verir sonsuz dögüye sokar
        //2 super'a ve asagı yazılmasına runtime compile time errro vermez
        System.out.println(super.hello);//0
        System.out.println(this.hello);//1
        super.nasılsın();
        this.nasılsın();
    }



}
class subsubclass extends subclass
{
    void naber()
    {
        super.naber();
        //superclass.super.naber();normal inheritance da böylr bir sey yok
        System.out.println("naber-subsubclass");
    }

}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" different usage of this - thisClass">

    class thisClass
    {
        public String name ,surname;
        
        thisClass(String name,String surname)
        {
            this.name=name;
            this.surname=surname;
        }
        
        public void addd(List<thisClass> arraylist) 
        {
            arraylist.add(this);//buradaki this nesne yi temsil eder p1'i p2'i temsil eder
        }   //this=addd methodunu calıstıran nesne 

        @Override
        public String toString() {
            return "thisClass{" + "name=" + name + ", surname=" + surname + '}';
        }

     
        
    }
// </editor-fold>  

  //<editor-fold defaultstate="collapsed" desc="(Car has an Engine and innerDesign) composition has-a">

class Engine
{
    private String isim;
    private int beygirGucu;
    
    public Engine()
    {
        isim = "Honda";
        beygirGucu = 135;
        System.out.println(isim +" isimli ve "+beygirGucu+" beygirgüçlü motor oluşturuldu");//toString kullanmak yerine constructorın içine yazdım
    }
    
    public void calistir()
    {System.out.println("Motor çalıştırıldı");}
    
    public void durdur()
    {System.out.println("Motor durduruldu");}
}


class Seats
{
    private String cover="leather";
    private String color="white";
    
    
    public String getCover() {
        return cover;}

    public void setCover(String cover) {
        this.cover = cover;}

    public String getColor() {
        return color; }

    public void setColor(String color) {
        this.color = color;}
    
    //default constructor mevcut

    
    public Seats()
    {
        System.out.println("Seats{" + "cover=" + cover + ", color=" + color + '}');//toString kullanmak yerine constructorın içine yazdım
    }
    
    public Seats(String cover,String color)
    {
        this.cover=cover;
        this.color=color;
    }

    
    @Override
    public String toString() {
        return "Seats{" + "cover=" + cover + ", color=" + color + '}';
    }


}  

class Electronics
{
    String gear;
    String airConditioner;

    //constructor method without params
    public Electronics()
    {
        gear="automatic gear";
        airConditioner="4*4 Air Conditionar";
        System.out.println("Electronics{" + "gear=" + gear + ", airConditioner=" + airConditioner + '}');//toString kullanmak yerine constructorın içine yazdım

    }


}

class InnerDesign
{
    Seats seat;//composition
    static Electronics electronic;//composition

    public InnerDesign()
    {//nesney olustur diyince yazacak
        seat=new Seats();//Seats{cover=leather, color=white}
        electronic =new Electronics();//Electronics{gear=automatic gear, airConditioner=4*4 Air Conditionar}
        System.out.println("innerDesign{" + "seat=" + seat + ", electronic=" + electronic + '}');
        //innerDesign{seat=Seats{cover=leather, color=white}, electronic=Electronics{gear=automatic gear, airConditioner=4*4 Air Conditionar}}
    }

    @Override
    public String toString() {//nesneyi yazdırırsam devreye girer
        return "innerDesign{" + "seat=" + seat + ", electronic=" + electronic + '}';
        //innerDesign{seat=Seats{cover=leather, color=white}, electronic=Electronics{gear=automatic gear, airConditioner=4*4 Air Conditionar}}
    }
}

class Car
{
    public  Engine arabaMotoru;//arabanın motoru
    static InnerDesign innerDesign;//arabanın iç kısmı(Seats,Electronics)
    private String renk;
    private String marka;
    private int uretimYili;
    
    public Car()
    {
        
        arabaMotoru=new Engine();//Honda isimli ve 135 beygirgüçlü motor oluşturuldu
        //default constructor'ın içinde sout  ile print ettim.
        
        //calistir();//Engine sınıfını composition yaptım ama içinedki publi degeri nesnesiz cagıramam. extend etseydim cagırabillirdim.
        arabaMotoru.calistir(); // Motor çalıştırıldı
                //calıstır void type bir method


        innerDesign=new InnerDesign();
        /*
            Seats{cover=leather, color=white} - seats constr.
            Electronics{gear=automatic gear, airConditioner=4*4 Air Conditionar} - electronics constr.
            innerDesign{seat=Seats{cover=leather, color=white}, electronic=Electronics{gear=automatic gear, airConditioner=4*4 Air Conditionar}} - innerDesign constr.
        */
        
        System.out.println(innerDesign);//innerDesign.toString sayesinde yazdırır
        /*
            innerDesign{seat=Seats{cover=leather, color=white}, electronic=Electronics{gear=automatic gear, airConditioner=4*4 Air Conditionar}}
        */
        
        //object'i yazdırcam, innerDesign classsında toString method var
        //toString olmasydı innerDesign nesnesi - javaoop.innerDesign@79698539 - referansı yazılırdı.
        //seat classında toString olmasaydı -innerDesign{seat=javaoop.Seats@6fb554cc, electronic=Electronics{gear=automatic gear, airConditioner=4*4 Air Conditionar}}
        
        
        
        System.out.println(innerDesign.seat);//Seats{cover=leather, color=white}
        //seat classında toString olmasaydı - javaoop.Seats@79698539
        //car sınıfında innerDesign objesi olusturdum.innerclass'a gittim orada tanımladığım seat classına ait bir seat objesini çaırdım
        
        //System.out.println(seat);//Seat classının bir nesnesidir ama InnerDesign classının innerDesign nesnesinin içindebir nesnedir direk ulasilamaz
        renk="Kırmızı";
        marka="Toyota";
        uretimYili = 2019;
        System.out.println(renk+" renkli "+uretimYili+" model "+ marka +" marka araba oluşturuldu");
        //Kırmızı renkli 2019 model Toyota marka araba oluşturuldu
    }
    
    public void hareketeGec()
    {
        System.out.println("Araba harekete geçiyor");
    }
    
    public static void durmayaBasla()
    {
        System.out.println("Araba durmaya başladı");
    }

    
}

// </editor-fold>  

  //<editor-fold defaultstate="collapsed" desc="Circle and Cylinder (Inheritance-super-override)">

class Circle extends Object // her class object classını extends eder
{
    // Inheritance(Miras): Iki class ararsinda Parent - Child iliskisi varsa inheritance'dan
    //                     bahsedilebilir.

    //Inheritance Kurallari:
    //  1) Inheritance public ve protected data'lar icin problemsiz calisir
    //  2) Inheritance default data'lar icin child ile parent ayni package'da ise calisir.
    //  3) Inheritance private data'lar icin calismaz

    //Child ve Parent iliskisi nasil kurulur?
    //Class olustururken "extends" keyword kullaniriz.  
    // Child'in 1 den fazla parent'i olur mu?
    // Cevap: Olmaz. Java "multiple inheritance" i desteklemez. 
    //        Java "Single Inheritance" i destekler.

    //Parent'in 1 den fazla Child'i iolur mu?
    //Cevap: Olur. "Hiyerarsik Inheritance" denir.

    // child[a, b] --> parent[c, d, e] --> grandParent[f, g]
    // Child nelere sahip? a, b, c, d, e, f, g
    // Parent nelere sahip? c, d, e, f, g
    // grandParent nelere sahip? f, g

    private double radius;
    public Circle() //no argument constructore
    {
       this.radius=5; 
    }
    public Circle(double radius) //argument consstrucotore
    {
        this.radius=radius;
    }
    
    public double getRadius(){ return radius;}//get method to read private data member
    public void setRadius(int radius) {this.radius=radius; }
    
    public double areaCircle()
    {
        return 3*Math.pow(radius,2);//radius üzeri 2
    }
    @Override
    public String toString()
    {
        //return "radius = "+radius+" area of circle = "+areaCircle();//SAME THING
        return "radius = "+getRadius()+" area of circle = "+areaCircle();
        
    }
    
    public static void staticMethod()
    {
        System.out.println("staticMethod of Circle class");
    }
}

class Cylinder extends Circle  //Cylinder is subclass(child) and Circle is superclass(parent)
{
    private double height;
    
    public Cylinder() //no argument constructore
    {
        super(); //to call superclass no argument constructore
        height=10;
    }
    public Cylinder(double radius,double height)
    {
        super(radius); //calls super class argument constructore
        this.height=height;
    }

    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}

    public double areaCylinder()
    {
        return (3.14*2*getRadius()*height)+(2*areaCircle());
    }
    
    @Override
    public String toString() //to call super class method super.toString()
    {
        return super.toString()+" height="+height+" area of cylinder= "+areaCylinder();
    }
    
   
}

        // </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="SuperClass-SubClass CONSTRUCTOR RELATIONSHIP">


class dede
{
    //olay şu:
    //superclass'ta constuructor with param create edilirse
    //subclasslarda herhangi bir constructor uretmek istiyorsak hata alırız default constructor tekrardan create etmemiz gererkir
    int a=1;
    dede()
    {
        System.out.println("a default");
    }

    dede(int a)
    {
        System.out.println("a");
    }



}
class baba extends dede
{

    // when an object is created from subclass any constr of it will run superclass's default constr.
    public baba()//will inherit default constr of dede
    {
        System.out.println("a2 default");
    }

    public baba(int a)////will inherit default constr of dede
    {
        System.out.println("a2 ");
    }


}
class cocuk extends baba
{
    cocuk()//babadaki default xxonstructor olusturulmazsa error verir burası
    {
        System.out.println("cocuk-default");
    }
    cocuk(int a)//bunu cagırırsam bile baba ve dede default constructor methods will run
    {//bunu yazmak ıcın babada defalt constructor olması gerek
        System.out.println("cocuk");
    }
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="SuperClass-SubClass CONSTRUCTOR RELATIONSHIP2">


class dede2
{
    //olay şu:
    //superclass'ta constuructor with param create edilirse
    //subclasslarda herhangi bir constructor uretmek istiyorsak hata alırız default constructor tekrardan create etmemiz gererkir
    int a=1;

    dede2(int a)
    {
        System.out.println("a");
    }



}
class baba2 extends dede2
{

    // when an object is created from subclass any constr of it will run superclass's default constr.
    public baba2()//will inherit default constr of dede2 but default constructor is not initialized
    //so ı need to make this constr. method to inherit dede2's constr with param
    {
        super(1);
        System.out.println("a2 default");
    }

    public baba2(int a)////will inherit default constr of dede
    {
        super(a);
        System.out.println("a2 ");
    }


}
class cocuk2 extends baba2
{
    cocuk2()//babadaki default xxonstructor olusturulmazsa error verir burası
    {
        System.out.println("cocuk-default");
    }
    cocuk2(int a)//bunu cagırırsam bile baba ve dede default constructor methods will run
    {//bunu yazmak ıcın babada defalt constructor olması gerek
        System.out.println("cocuk");
    }
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="A-B-C(inheritance-override-super-this-grandpa-dad-son)">
 
 class AAA 
 {   

    //VARIABLES
    private String privateV="private-a";
    String defaultV="default-a";
    protected String protectedV="protected-a";
    public String publicV="public-a";
    final public String finalPublicV="final public-a";
    static public String staticPublicV="static public-a";
    public String aaa;


    public AAA() {
        System.out.println("constructor-A");
    }

    public AAA(String aaa) {//bu parametre  BBB VE CCC 'NİN 1 PARAMLI CONSTRUCTOR'I İLE CAGRILIR.
        this.aaa = aaa;
        System.out.println("constructor-A with one param");

    }
    
    
    
    //METHODS
    private void privateMethod(){System.out.println("private method");}
    void defaultMethod(){System.out.println("default method");}
    protected void protectedMethod(){System.out.println("protected method");}
    public void publicMethod(){System.out.println("public method");}
    final public void finalMethod(){System.out.println("final public method");}
    static public void staticPublic(){System.out.println("static public method");}
    
    
}

class BBB extends AAA
{
    /*böle error
    super.defaultV="b";//errror
    this.defaultV="b";//errror
    defaultV="b";
    */

 
    //STATIC PRIVATE FINAL METHODS CANNOT BE OVERRIDEN
    
    //PRIVATE VAR. CANNOT BE CALLED.
    //FINAL VAR. CAN BE CALLED BUT CANNOT BE OVERRIDEN
    //STATIC VARIABLE CAN BE BOTH CALLED MANUELLY AND OVERRIDEN
    
    
    public BBB()
    {
        System.out.println("constructor-B");
        publicV="public-a bbbb oldu";
    }

    public BBB(String a) {
        System.out.println("constructor-B with one param");
    }
    
    @Override
    public void publicMethod() 
    {
        //static variable or method does not show in searching.I typed them manuelly
        AAA.staticPublicV="b1";
        BBB.staticPublicV="b2";
        CCC.staticPublicV="bc";//c anın torunu yanı a ya direk ulasabilir static mal dedeninse cocuga ve toruna değiştirme izni verilir
        super.staticPublicV="b3";
        this.staticPublicV="b4";
        
        
         protectedV="protectedV-a b clasının methodunda degisti ";
        
        //this.finalPublicV="finalPublicV-B"; FINAL CANNOT BE OVERRIDEN
        System.out.println(this.finalPublicV);//final public-a
        System.out.println("staticPublicV: "+staticPublicV);//b4
        System.out.println("public method");
    }

}
class CCC extends BBB
{

    public CCC() {
        System.out.println("constructor-C");
    }
  
    public CCC(String a) {
        System.out.println("constructor-C with one param");
    }
    
    @Override
    public void publicMethod() 
    {
        super.publicMethod();
        /*
            final public-a
            staticPublicV: b4
            public method
        */
        
        System.out.println(AAA.staticPublicV);//b4 static deger ilk olarak A da tanımlandı B'de degisti ama static deger A-B-Cnin ortak malıdır
        System.out.println(BBB.staticPublicV);//b4 
        System.out.println(CCC.staticPublicV);//b4 
        System.out.println(super.staticPublicV);//b4
        System.out.println(this.staticPublicV);//b4
        System.out.println(staticPublicV);//b4
        
        System.out.println(publicV);//public-a bbbb oldu
        System.out.println(protectedV);//protectedV-a b clasının methodunda degisti 
        
        System.out.println(super.defaultV);//default-a   -bu variable ı B classda override etmedim ve direk kayıtlarda cıktı
        System.out.println(defaultV);//default-a  - bu variable ı B classda override etmedim ve direk kayıtlarda cıktı
    }

}


// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Square-Rectangle(inheritance-super-override)">
/*
  super() ve this() ayni constructor'in icinde ayni anda kullanilamaz.
  Cunku; ikisinin de ilk satirda olma zorunlulugu var.
*/

class Squaree 
{
    private double side;
    public Squaree()
    {
        
    }
    public Squaree(double side)
    {
        this.side=side;
    }

    public double getSide() {
        return side;
    }
    
    public void area()
    {
        double t=side*side;
        System.out.println("side = "+side);
        System.out.println("area of square = "+t);
    }
    public int getArea()
    {
        return (int)(side*side);
    }
    
}

 class Rectangle extends Squaree
{
    private double height,width;
    
    public Rectangle()
    {
        super();
    }
    public Rectangle(double side,double height,double width)
    {
       super(side); 
       this.height=height;
       this.width=width;
    }
   
    @Override
    public void area()
    {
       super.area(); //calles superclass area() method
       /*
            side = 10.0
            area of square = 100.0
       */       
       double t=height*width;
       System.out.println("heigth="+height+" width="+width);//heigth=10.0 width=10.0
       System.out.println("area of rectangle="+((4*t)+2*getArea()));//area of rectangle=100.0
    }
    
    
    
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Kisi-Personel-Öğrenci-MezunOgrenci(inheritance-super-override)">

  class KalitimliOrnek {//baska classtaki methodlar default yada publicse aynı packettteki diğer classlar ulasabilir.

    public static void main() 
    {
        Kisi insan=new Kisi("merve",2345,20);
        System.out.println(insan.showInfo("Kisi"));
        
        Personel mudur=new Personel("ahmet",123456,40,"müdür");
        System.out.println(mudur.showInfo("Personel"));//Personel{isim=ahmet, tcKimlik=123456, yas=40}{pozisyon=müdür}
        
        Personel teacher=new Personel();
        System.out.println(teacher);//Kisi{isim=Henüz atanmadı, tcKimlik=0, yas=18, name=emre}Personel{pozisyon=teacher, name=Emre2}


        Ogrenci emre=new Ogrenci("emre",147528,15,8526);
        System.out.println(emre.showInfo());//ıt belogs to Ogrenci

        MezunOgrenci mezun=new MezunOgrenci("hasan",85234,35,8522,"ankara");
        System.out.println(mezun);
        
        //insan.thissMethod();//parent cocugunun özelliğinin alamaz
        mudur.thissMethod();//void type method kendi methodu
        /*
        müdür
        müdür
        personel{isim=ahmet, tcKimlik=123456, yas=40}{pozisyon=müdür}
        personell{isim=ahmet, tcKimlik=123456, yas=40}{pozisyon=müdür}
        emre
        Emre2
        duman duman emre emre
        duman2 duman2 emre emre
        */
        mudur.superMethod();
        /*
        duman2
        emre
        Kisi{isim=ahmet, tcKimlik=123456, yas=40}
        */
        Personel2 per=new Personel2();
        System.out.println(per);//Kisi{isim=Henüz atanmadı, tcKimlik=0, yas=18, name=emre}Personel{pozisyon=teacher, name=emre2}
        //babanın default constr. kullanır babanın to Stringini kullanır
        
        per.superMethod();//personel classından geliyor
        /*
        Emre2
        emre
        Kisi{isim=Henüz atanmadı, tcKimlik=0, yas=18}
        */
        per.thissMethod();
        /*
        teacher
        teacher
        personel{isim=Henüz atanmadı, tcKimlik=0, yas=18}{pozisyon=teacher}
        personell{isim=Henüz atanmadı, tcKimlik=0, yas=18}{pozisyon=teacher}
        emre
        Emre2
        duman duman emre emre
        duman2 duman2 emre emre
        */
        System.out.println(per.getIsim());//Henüz atanmadı- grandchildren dedesinden method alabilir.
        System.out.println(per.name);//duman2
        
        System.out.println(per.number);//11 - direk babasından alır- dedesinde de var ama babadan alır
        System.out.println(per.number2);//30 dedede var ama babadan güncel halini alır
        System.out.println(teacher.number2);//30 dededen aldı ve baba bunu güncellledi kendi degeri kullanıcak
    }
}

    class Kisi{

    private String isim;
    private long tcKimlik;
    private int yas;
    
    int number=10;
    int number2=20;
    
    public String name="emre";
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public Kisi() {
        isim="Henüz atanmadı";
        tcKimlik = 0;
        yas = 18;
    }

    public Kisi(String isim, long tcKimlik, int yas) {
        this.isim = isim;
        this.tcKimlik = tcKimlik;
        setYas(yas);//sarta tabii tut
    }

    public String getIsim() { return isim; }
    public void setIsim(String isim) {this.isim = isim;}

    public long getTcKimlik() {return tcKimlik; }
    public void setTcKimlik(long tcKimlik) {this.tcKimlik = tcKimlik;}

    public int getYas() {return yas;}
    public void setYas(int yas) {
        if(yas >= 18)
            this.yas = yas;
        else this.yas = 18;
    }

    public String showInfo(String who) {
        return who + "{isim=" + isim + ", tcKimlik=" + tcKimlik + ", yas=" + yas + '}';
    }

    @Override
    public String toString() {
        return "Kisi{" + "isim=" + isim + ", tcKimlik=" + tcKimlik + ", yas=" + yas + ", name=" + name + '}';
    }
    
    


}

class Personel extends Kisi{//parentta 2 tane constructor var,bir tanesini eklemek gerek

    private String pozisyon;
    int number=11;
    
    public String name="emre2";
    public String isim="emre3";
    
    
    {
        number2=30;//dede'de 10 baba aldı özelliği ve 20 yaptı,dede'de hala10 cocuk ise direk babadan 20 olarak alır
    }
    //System.out.println(); yazılmaz buraya
    //method içinde yazdırılır.
  
 
    public Personel()
    {
        super();
        pozisyon="teacher";
    }
    
    public Personel(String isim, long tcKimlik, int yas, String pozisyon) 
    {
//      setYas(yas);
//      setIsim(isim);
//      setTcKimlik(tcKimlik);
        super(isim,tcKimlik,yas);
        this.pozisyon = pozisyon;
    }
    
    //super.methodName(); yapma methodu normal override yapıcakmıssın gibi yaz
    //methoda ulasmak istersen child'in nesnesi parentin nesnesini cagırır
    
    //this.methodName(); de aynı direk method override moduna gecer.
    public String getPozisyon() {return pozisyon;}
    public void setPozisyon(String pozisyon) {this.pozisyon = pozisyon;}

    
    @Override
    public String showInfo(String who) {
        return super.showInfo(who)+"{pozisyon=" + pozisyon + '}';
    }
    
    public void thissMethod()
    {
        /*this öncelikle class icini kasteder.
        eger class icersinde yoksa variable ya da method
        parent class'takini kaseder.*/
       
        System.out.println        
        (
            getPozisyon()+"\n"+       /*bu classda var parent'da yok*/
            this.getPozisyon()+"\n"+  /*aynı şey üstteki ile*/
        
            showInfo("personel")+"\n"+       /*personel{isim=ahmet, tcKimlik=123456, yas=40}{pozisyon=müdür}*/
            this.showInfo("personell")+"\n"+ /*personell{isim=ahmet, tcKimlik=123456, yas=40}{pozisyon=müdür}*/

            this.getName()+"\n"+             /* emre - this iile direk parenttan method cagırdım.*/
            this.name                        /*Emre2*/
        );
        this.name="duman";//parent class'da bu public String emre idi this ile ulastım ve ı changed the inside of it     
        System.out.println(name+" "+this.name+" "+getName()+" "+this.getName());//duman duman emre emre
        name="duman2";
        System.out.println(name+" "+this.name+" "+getName()+" "+this.getName());//duman2 duman2 emre emre
    }
    
    public void superMethod()
    {
        System.out.println
        (
            //variabler method icinde cagrılabiliyorlar
                //methodlar da öyle
                //this ya da super ile method dısında  method cagırırsak override edilir
            this.name+"\n"+         /*duman2 classtaki name*/
            super.name+"\n"+        /*emre - parent'taki name i alır*/
            super.showInfo("Kisi")  /*Kisi{isim=ahmet, tcKimlik=123456, yas=40}*/
        );
    }

    @Override
    public String toString() {
        return super.toString()+"Personel{" + "pozisyon=" + pozisyon + ", name=" + this.name+ '}';
    }
    
    
   
}

class Personel2 extends Personel//Personel2 classına personel classında kullanılan 1 constructorı yazmak zorundayım
{
    
    public Personel2() {
    //ben direk personel classını inherit ettigim için eger onun içinde default constr. yoksa ve ben personel2 classına constructor yazarsam error alırım
    ////personel classı kisi classını inherit eder ve kisi classında default constr. var!! ama yine erro alırız.
    
    super();//Kisi{isim=Henüz atanmadı, tcKimlik=0, yas=18} degerler bunlar 
    //mesela pozisyon değeri yok bende
    //super yazmama gerek yok default constructor will be inhereted by default
    }
    
    /*superMethod'u tekrardan override etmeme gerek yok aynı değeri line line 1560'da yazdırırım
    @Override
    public void superMethod() {
        super.superMethod(); //To change body of generated methods, choose Tools | Templates.
    }
    */
    @Override//bu methodu override etmme gere k yok
    public void thissMethod() {
        super.thissMethod(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
      
class Ogrenci extends Kisi{
    private int ogrenciNo;

    public Ogrenci(String isim, long tcKimlik, int yas, int ogrenciNo) {
//        setYas(yas);
//        setIsim(isim);
//        setTcKimlik(tcKimlik);
        super(isim,tcKimlik,yas);
        this.ogrenciNo = ogrenciNo;
    }

    public int getOgrenciNo() {return ogrenciNo;}
    public void setOgrenciNo(int ogrenciNo) {this.ogrenciNo = ogrenciNo;}

    
    public String showInfo() {//bu override değil because it has no parameter
        return super.showInfo("Student")+"{öğrenci no:"+ogrenciNo+"}";
    }
}

class MezunOgrenci extends Ogrenci{

    private String calismaYeri;

    public MezunOgrenci(String isim, long tcKimlik, int yas, int ogrenciNo, String calismaYeri) {
        super(isim, tcKimlik, yas, ogrenciNo);
        this.calismaYeri = calismaYeri;
    }

    public String getCalismaYeri() {
        return calismaYeri;
        
    }

    public void setCalismaYeri(String calismaYeri) {
        this.calismaYeri = calismaYeri;
    }

    @Override
    public String toString() {
        return super.showInfo("Mezun Ogrenci")+"{calismaYeri=" + calismaYeri + '}';
    }
    
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="overriding-overloading(static/dynamic Polymorphism)">    

class Polymorphism01 
{
    public void eat() 
    {      
        System.out.println("Ye1!");
    }
    
    public void eat(String name)//Overloading ile polymorphism
    {//overloading aynı classta olur
        System.out.println(name + "Ye11!");
    }
    
    public static String word="StaticVariable";//child'dan ulasılabilir
    public static void drink()//child'dan ulasılabiliyor
    {
        System.out.println("staticMethod-drink");
    }

    public static String word2;
}	

class poly02 extends Polymorphism01
{
    @Override
    public void eat()//static variables and methods can be called in non-static method
    {
        System.out.println("poly02 YE!"); //To change body of generated methods, choose Tools | Templates.
        super.drink();//staticMethod
        Polymorphism01.drink();//staticMethod
        this.drink();//staticMethod - this diyince cıkmıyor ama manuel yazınca oluyor
        System.out.println
        (
            word+"\n"+
            this.word+"\n"+/*kendisi cıkmaz ben kendim manuel yazdım bu kodu*/
            super.word+"\n"+/*kendisi cıkmaz ben kendim manuel yazdım bu kodu*/
            Polymorphism01.word/*static variable*/ 
                
            //4 kod da staticVariable yazar
        );
        
        super.word="stativWord'u degistirdim";
        System.out.println(word);//stativWord'u degistirdim
        System.out.println(Polymorphism01.word);//stativWord'u degistirdim
        
        /*
        public static void drink()
        {      
            System.out.println("staticMethod");  
        }
        
        Static methods can not be overridden because they are not part of the object's state. 
        Rather, they belongs to the class (i.e they are class methods). 
        It is ok to overload static (and final) methods
        */
    }

    @Override
    public void eat(String name)
    {
        super.eat(name); //To change body of generated methods, choose Tools | Templates.
    }    
}
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="hayvan-kopek-kedi(static/dynamic Polymorphism)">

class Hayvan extends Object
{
    private int ayakSayisi;
    public int getAyakSayisi()                {return ayakSayisi;}
    public void setAyakSayisi(int ayakSayisi) { this.ayakSayisi = ayakSayisi;}

    public String hayvan="hayvan";
    
    public Hayvan()
    {
        System.out.println("hayvan class'ı default constructure");
    }
    
    public Hayvan(String param)
    {
        System.out.println("hayvan class'ı 1 param constructure");
    }
    
    public void adiniSoyle()
    {
        System.out.println("Ben hayvan sınıfı nesneyim");
    }

    @Override
    public String toString() {
        return "Hayvan{" + "ayakSayisi=" + ayakSayisi + '}';
    }

  
    
}

class Kopek extends Hayvan
{
    public String dog="dog";
    public String hayvan="hayvan-dog";
    private String tur;
    public String getTur() { return tur;}
    public void setTur(String tur) {this.tur = tur;}

    public Kopek()
    {
        System.out.println("Kopek class'ı default constructor");
    }
    
    public Kopek(String tur){
        //setAyakSayisi(4);//super.setAyakSayisi(4);
        setTur(tur);     //this.setTur(tur);
        
        System.out.println("Kopek class'ı 1 param constructor");

    }
    
    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir köpek nesnesiyim");
    }

    @Override
    public String toString() {
        return super.toString()+"Kopek{" + "tur=" + tur + '}';
    }
    
    
}

class yavruKopek extends Kopek
{    
    public String yavruKopek="yavruKopek";
    public String hayvan="dog-yavruKopek";

   
    public yavruKopek()
    {
        //burada constructor olusturmak ıcın fatherda da default constructor olmalı
        System.out.println("hayvan:"+hayvan + 
                "\nthis.hayvan:"+this.hayvan+
                "\nsuper.hayvan:"+super.hayvan);
    }
    public yavruKopek(String tur) {
        
        super(tur);
        setAyakSayisi(5);
        super.setAyakSayisi(6);
        this.setAyakSayisi(7);
    }

    @Override
    public void adiniSoyle() {
        System.out.println("Ben bir yavru köpek nesnesiyim");
    }
    
    
    
}
class Kedi extends Hayvan
{
    private String cinsi;
    public String getCinsi()           {return cinsi; }
    public void setCinsi(String cinsi) { this.cinsi = cinsi;}
    
    public Kedi(String cins){
        setAyakSayisi(4);
        setCinsi(cins);
    }
    
    @Override
    public void adiniSoyle() 
    {
        System.out.println("Ben bir kedi nesnesiyim");
    }

    @Override
    public String toString() {
        return super.toString()+ "Kedi{" + "cinsi=" + cinsi + '}';
    }
    
}


// </editor-fold>
   
  //<editor-fold defaultstate="collapsed" desc=" polimorphism03 ">

class u
{
    void method(){System.out.println("u");}
    void method2(){System.out.println("uu");}
    void method3(){System.out.println("uuu");}
}

class u2 extends u
{
    @Override
    void method(){System.out.println("u2");}
    
    @Override
    void method2(){System.out.println("uu2");}
    
}

class u3 extends u2
{
    @Override
    void method()
    {
        System.out.println("u3");
    }
}

class mainU
{
    static public void main()
    {
        u3 a=new u3();
        a.method();//u3
        
        u2 a2=new u3();
        a2.method();//u3
        
        u a3=new u3();
        a3.method();//u3
        
        u a4=new u3();
        a4.method2();//uu2 - u3'te yok declared type u da olsa en alttan en yukarı cıkıcak ve u2de method2 var
        
        u a5=new u3();
        a5.method3();//uuu - u3 ve u2'de method3 yoktur
        
        u2 a6=new u3();
        a6.method3();//uuu - method3 u3 ve u2'de yoktur/ama u2 method3'ü u'dan miras alır atar a6nesne deposuna
        
        u3 a7=new u3();
        a7.method2();//uu2 - u3 method2 yi dededen degil babadan alır
        
        u3 a8=new u3();
        a8.method3();//uuu -u3te yok u2de de yok uya gidecek

    }
}
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="bindingTypes">
    
   

class UstSinif
{
    /*
    Bir nesne örneğinin hangi nesneye bağlandığıve hangi nesneye ait olduğunun 
    çalışma anında belirlenmesidir.(Runtime)
    k1.alanHesapla() --> bu ise derleme zamanında belirlenir(Compile time)
    */
    String a="UstSınıf";
    public static void StaticMethod()//üst-alt
    {
        System.out.println("Üst sınıfın static  metotu çağrıldı");
    }

    public void nonStaticMethod()//üst-alt-alt2
    {
        System.out.println("Üst sınıfın  1.non-static metotu çağrıldı");
    } 
    
    public void nonStaticMethod2()//üst-alt2
    {
        System.out.println("Üst sınıfın  2.non-static metotu çağrıldı");
    }
    public void nonStaticMethod3()//üst-alt
    {
        System.out.println("Üst sınıfın  3.non-static metotu çağrıldı");
    }
    public void methodOfustSinif()
    {
        System.out.println("üst sınıfın kendine has methodu");
    }
    
}

class AltSinif extends UstSinif
{
    String a="AltSinif",b="AltSinif";

    //static method override edilmemez
    public static void StaticMethod()
    {
        System.out.println("Alt  sınıfın static metotu çağrıldı");
    }
    

    @Override//stataic olmayan method override edildi
    public void nonStaticMethod() 
    {
        System.out.println("Alt  sınıfın  1.non-static metotu çağrıldı");
    }

    @Override
    public void nonStaticMethod3() {
        System.out.println("Alt  sınıfın  3.non-static metotu çağrıldı");
    }
    
}

class AltSinif2 extends AltSinif
{

    @Override//stataic olmayan method override edildi
    public void nonStaticMethod() 
    {
        System.out.println("2 Alt  sınıfın  non-static 1.metotu çağrıldı");
    }
    @Override
    public void nonStaticMethod2() {
        System.out.println("2 Alt sınıfın  non-static 2.metotu çağrıldı");
    }
    
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="polimorphism-Example(Canli-Kartal-Panda)">

class KonuyuToparlayalim {

    public static void main() {

        Canli canli=new Canli();//canlı constructor
        canli.adiniSoyle();//Ben bir canli sınıfı nesnesiyim

        Canli kartal=new Kartal();//canlı constructor + kartal constructor  / ilk superClassın sonra subClassın constructorı cagrıldı
        System.out.println(kartal.canli);
        System.out.println(kartal);//Kartal{kartal=kartal}//declared type: of the object named kartal is Canli, actual type: of it is Kartal
        kartal.adiniSoyle();//Ben bir kartal sınıfı nesnesiyim - calısma esnasında karar verdi runtime-dynamic Binding
        //crtl+ adiniSoyle ye basrsam beni Canl class'ının adini söyle methoduna yllucak.cunku kartal vaiable canlı sınıfına ait.işlevi ise Kartal sınıfındaki
        //kartal.uc(); ERROR Because kartal is Canli Class's variable, So kartal object cannot reach Kartal Class's properties
        ((Kartal)kartal).uc();//Ben uçabilirim - Canli Classına ait  değşkeni casting yaptık Kartal değişkenine dönüştürdük

        ((Kartal)kartal).kartal="kartal";//declared type'ı superclass ve actual type kendisi olan nesne,
        //kendi classına özgü attributelere ulasamaz.ulasması icin downcasting yapmak gerek.
        
        Canli panda=new Panda();//canlı constructor
        panda.adiniSoyle();//Ben bir panda sınıfı nesnesiyim
        //panda.oyna();//ERROR - CANLI CLASSINDA oyna() methodu yok PANDA İLE SADECE SUPER'DEN OVERRIDE EDİLMİŞ METHODLAR CAGRILABILIR
        ((Panda)panda).oyna();//Ben oyun oynamayı çok severim   YA DA CASTING YAPMAK GEREK

        /* ***** Exception in thread "main" java.lang.ClassCastException: class javaoop.Canli cannot be cast to class javaoop.Panda
         
        Panda pandanesnesi=(Panda)new Canli();//canlı classından nesne olustrudum.pandaya donusturdum.ve Pandaya esitledim
        pandanesnesi.oyna();
        pandanesnesi.Panda="panda";
        */
        //ERRROR ( java.lang.ClassCastException)- Because Canlı Classı oyna() methoduna sahip değil.
        //parent'in nesnesi child'in değişkenine dönüştürülemez.
        //compile esnasında sıkıntı cıkmaz ama run edileceği  zaman bakarki child parentta olmayan 
        //method ya da variableslara sahiptir ve errro verir.
        
        
        //Kurt classı sadece Canli classının içeriğine sahip ama yine de exception alırız
        KurtBaba kurtbaba=new KurtBaba();
        Kurt kurt=new Kurt();
        //Kurt kurt2=(Kurt)kurtbaba;//Exception in thread "main" java.lang.ClassCastException: class javaoop.KurtBaba cannot be cast to class javaoop.Kurt (javaoop.KurtBaba and javaoop.Kurt are in unnamed module of loader 'app')
        
        Panda p2 = (Panda)((Canli)((Panda) panda));//panda nesnesinin içeriği zaten Panda classının constructor ına baglı
        p2.oyna();//Ben oyun oynamayı çok severim

        javaoop.KonuyuToparlayalim.rastgeleSec();
        
    }

    public static Canli rastgeleSec(){

      int sec = (int)(Math.random() * 3);
      Canli canli;
      if(sec==0){
          canli = new Canli();
      }else if(sec == 1){
          canli = new Kartal();
      }else{
          canli = new Panda();
      }
      
        System.out.println(sec);
      return canli;

    }
}

class Canli
{
    String canli="canli";

    public Canli() {//ı directly write constr. without param due to canli has been assigned
        System.out.println("canlı constructor");
    }
    
    public void adiniSoyle()
    {
        System.out.println("Ben bir canli sınıfı nesnesiyim");
    }

    @Override
    public String toString() {
        return "Canli{" + "canli=" + canli + '}';
    }
    
}

class Kartal extends Canli
{
    String kartal="kartal";

    public Kartal() {
        System.out.println("kartal constructor");

    }
    
    @Override
    public void adiniSoyle() 
    {
        System.out.println("Ben bir kartal sınıfı nesnesiyim");
    }

    public void uc()
    {
        System.out.println("Ben uçabilirim");
    }

    @Override
    public String toString() {
        return super.toString()+"  Kartal{" + "kartal=" + kartal + '}';
    }
    
}

class Panda extends Canli
{
    String Panda="panda";
    @Override
    public void adiniSoyle() 
    {
        System.out.println("Ben bir panda sınıfı nesnesiyim");
    }

    public void oyna()
    {
        System.out.println("Ben oyun oynamayı çok severim");
    }
}

class KurtBaba
{
    
}
class Kurt extends KurtBaba
{
    String kurt="kurt";

    public Kurt() {
    }
     
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Methods of Object Class[toString-hashcode()-equals()-finalize()]">

class methodsOfObjectClass 
{
    static protected Person01 p1=new Person01(3000,"EMRE");//farklı bir kutu referansı 123 olsun
    static protected Person01 p2=new Person01(3000,"EMRE");//farklı bir kutu referansı 456 olsun
    
    static protected Person01 p3=null;
    static protected Person01 p4=null;
    
    static protected Person01 p5=new Person01(3000,"EMRE2");//farklı bir kutu referansı 789 olsun
    static protected Object p6=new Person01(3000,"EMRE");//farklı bir kutu referansı 100 olsun

    static protected Person2 P1=null;
    
    

    
    public static void toStringMethodu()
    {   //static degisken statik methodda direk işlem görebilir
        System.out.println(p1);//javaoop.Person@12843fce- toString sadece super etmek bi işe yaramaz-değişim yapmayacaksan override yapmayacaksan niye cagırıyosun alt sınıfta.zaten run ederken üst sınıfa erisebiliyorsun
        //Person{id=3000, name=EMRE}
    }
   
    public static void equalsMethodu()
    {
        
    //Person Classındaki commentledigim equals methodunu kullanırsam
        /*    
        @Override
        public boolean equals(Object obj)
        {
            return super.equals(obj); //object classındaki equals() methodu
        }
        *\
        /*object classındaki equals() methodu
            public boolean equals(Object obj) 
            {
                return (this == obj);
            }       
        */
    
        /*
        
            System.out.println(p1.equals(p2));//false - equals() method was inherited from  Object Class
            p1=p2;                            //p1 variable'ının reference ettiği kutuartık 1. kutu değil 2. kutu - Yani p1 ve p2 artık 456 referanslı kutuyu temsil etmekte
            System.out.println(p1.equals(p2));//true
        */
               
        
        //KIYASLANACAK NESNE NULL ISE
        /*
            2 tane null olan Person Class'ının nesneleri birbirine esit degildir.null onlar
            ERROR
            System.out.println(p3.equals(p4));//Exception in thread "main" java.lang.NullPointerException 	at javaoop.methodsOfObjectClass.equalsMethodu
        
            //System.out.println(p3.equals(p1));//null bir değer dolu bir degerle kıyaslanamaz -java.lang.NullPointerException
        */
        
        //equals() methodunu override ettim!!!
        System.out.println(p1.equals(p2));//4.return  runs - true
        System.out.println(p1.equals(p3));//2. return runs - false - içi dolu bir deger null bir nesne ile kıyaslanabilir
        
        
        
        //AMA STRING'LER VE WRAPPER CLASSLAR EXCEPTION'DIR.STRING CLASSINDA EQUALS METHODU OVERRIDE EDILMISTIR
        //VE DEGER AYNI REFERANSLAR FARKLI DA OLSA TRUE RETURN EDER
        /*
            public boolean equals(Object anObject) 
            {
                if (this == anObject) {
                    return true;
                }
                if (anObject instanceof String) {
                    String aString = (String)anObject;
                    if (coder() == aString.coder()) {
                        return isLatin1() ? StringLatin1.equals(value, aString.value)
                                          : StringUTF16.equals(value, aString.value);
                    }
                }
                return false;
            }
        */
        
        String s1=new String("EMRE");//farklı bir alan heapte referans 1 olsun
        String s2=new String("EMRE");//farklı bir alan heapte referansı 2 olsun
        String s3="EMRE";//ref:100 ise
        String s4="EMRE";//ref:100'dür
        
        //heap memoryde string pool vardır
        
        //hadhCode  referansa göre  code vermez  degere göre verir!!!!!!!!!!
        System.out.println(s1.hashCode());//2132187
        System.out.println(s2.hashCode());//2132187
        System.out.println(s3.hashCode());//2132187
        
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true HASHCODE'LARI FARKLI OLABILIR. String classdaki equals methodu override edilmiştir ve degerlere bakar
        
        s1="DUMAN";//string constant pool'da duman object'i olustu ve s1 artık o kutuyu refr eder
        System.out.println(s1);//DUMAN
        System.out.println(s1.hashCode());//65407753 - changed
        System.out.println(s2);//EMRE
        System.out.println(s2.hashCode());//2132187 - the same
     
        
        
        
        
        
        
        
        Integer int1=new Integer(200);//farklı alan - farklı nesne
        Integer int2=new Integer(200);//farklı alan - farklı nesne
        int int3=200;//-128 - 127 arasında degilse yeni bir ala olusur integer constant poolda
        System.out.println(int1.hashCode());//200 numarical statements' hashcode are same with their value
        System.out.println(int2.hashCode());//200
        //System.out.println(int3.hashCode());// referance type data olmayan data type'ların hashCode yoktur
        System.out.println(int1.equals(int2));//true 
        System.out.println("int1==int2: " + (int1==int2));//false
        System.out.println("(Objects.equals(int1, int2)): " + (Objects.equals(int1, int2)));//true     
        
        Integer int4=4 , int44=444;//2 declaration da aynıdır hiç bir farkı yoktur
        int int5=4     , int55=444;
        System.out.println(int4==int5);//true - deger -128-127 arasında oldugu icin aynı yeri gösteriler integer constant pool da
        System.out.println(int44==int55);//true
              
        int int6=666,int7=666;
        System.out.println(int6==int7);//true
        
        Integer int8=888,int9=888;
        Integer int88=-128,int99=-128;
        System.out.println("int8==int9 "+(int8==int9));//false
        System.out.println("int88==int99 "+(int88==int99));//true [-128 - 217]arasınd
        
        
        
        String[] array01=new String[1];  array01[0]="emre";
        String[] array02={"emre"};
        System.out.println(Objects.equals(array01, array02));//false - buradaki equals methodunun içinde Object.equals() cagrılır false
        System.out.println(Arrays.equals(array02, array02));//true - burada equals() override edilmşitir.
        System.out.println(array01.equals(array02));//        false - Object clasından alır
        System.out.println(array01[0].hashCode()==array02[0].hashCode());//false
        System.out.println(array01.hashCode()==array02.hashCode());//false
        
        asd nes=new asd();//String a ürettti  default constructor vardır
        asd nes1=new asd();//String a ürettti
        System.out.println("nes.a"+nes.a +" nes1.a"+ nes1.a);
        System.out.println(nes.equals(nes1));//false - asd classında equals() methodu override edimedi - byuradaki equals method came from Object class/ nesneler aynı alanı gösterirse true hem hashcodeları hem degerleri aynı olmmuş oluyor yani
        System.out.println(nes==nes1);//false 
        System.out.println(nes.hashCode()==nes1.hashCode());//false - normalde nesneler farklı  da olsa içeriği aynı ise hashcodeaynıdır cünkü hashcode override edilmiştir
        
        StringBuilder nx=new StringBuilder("a");
        StringBuilder nx1=new StringBuilder("a");
        System.out.println(nx.equals(nx1));//false - object clasındakini kullanır
        //equals override edilmemeiş
        
        String stringObject = new String("Rachel");
        String s44 = new String("Rachel"); // 
        System.out.println(stringObject.equals(s44)); // true
        System.out.println(stringObject==s44);//false

        Integer i=new Integer(1);
        Integer i1=new Integer(1);
        System.out.println(i.equals(i1));//true
        System.out.println(i==i1);//false
        
        String stringLiteral = "Rachel";
        String s22 = "Rachel";

        System.out.println(stringLiteral == s22); // true - 2 side aynı kutuyu refer eder string pool'daki
        System.out.println(stringLiteral == stringObject); // false
    }
    
    public static void equals2Methodu()
    {
        System.out.println(p1.equals2(p2));//true yazar sıkıntı yok, çünkü içi equals() methodu ile aynı görevi görür
        System.out.println(p1.equals(p6));//true
        //System.out.println(p1.equals2(p6));//error verir cünkü p6 Object Classına ait
        System.out.println(p1.equals2((Person01) p6));//true - casting from Object to Person
    }

    public static void hashCodeMethodu()
    {//hadhCode degere göre code verir referansa göre değil
        System.out.println(
                p1.hashCode()+"\n"+//2370392
                p2.hashCode()+"\n"+//2370392
                p5.hashCode()//66336052
                //p3.hashCode()//null nesnenin hashcode u olmaz                
                );
        System.out.println(p1.hashCode()==p2.hashCode());//true
          
    }
    
    public static void finalizeMethodu(List arrayList)
    {
        Person01 nesne2=new Person01(3000,"emree");
        for(int i=0;i<3;i++)
        {
            nesne2=new Person01(3000,"emree");
            //HEAP MEMORY'DE,Person classından nesne2 adında bir alan olusturdum.
            //her defasında nesne variable'ı yeni yaratılan alanı temsil etti.
            //ilk 2 alan içi dolu çöp olarak kaldı ve nesne variable'ı 3. alanı temsil etmeye basladı.
            arrayList.add(nesne2);//arraylist aynı degerlerle dolmaya basladı.
            //zaten calısıcak ama biz şimdi tetikliyoruz.
            System.gc();//garbage collector calıstı         çöpleri temizlesin diye
        }
       for(Object j : arrayList)
                System.out.println(j);//Person{id=3000, name=emree}
        
    }       

  
}


class asd
{
    String a="a";
}



class Person01 extends Object
{
    int id;
    String name;
    
    public Person01(int id,String name)
    {
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString()
    {
        return "Person{" + "id=" + id + ", name=" + name + '}';
    }
    
    @Override
    public boolean equals(Object obj) 
    {
        /*
            //BU BENIM ISIME YARAMAZ DEGERLER AYNI BILE OLSA FALSE YAZDIRIYOR,CUNKU SUPER ETTIGIMIZ equals() METHODUNUN ICINDE == IFADESI VAR
            //YANI DEGERELER AYNI OLSA DA REFERANSLARI FARKLI OLD. ICIN FALSE DEGER ALIYORUM
            @Override
            public boolean equals(Object obj)
            {
                return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
            }

                //SUPER ETTIGI METHOD
            //    public boolean equals(Object obj) {
            //    return (this == obj);
            //    }              
        */
        if (this == obj) {//equals() methodunu kullanan,cagıran nense=this(p1 diyelim), parametre olarak gelen nesneye(p2 diyelim) esitse true yaz
            return true;
        }
        if (obj == null) {//parametre olan nesne null ise false deger
            return false;
        }
        
        if(!(obj instanceof Person01))//obj Person2 sınıfın nesnesi ise false deger
            return false;
        
        //BUNLARI DAHA GORMEDIK
        /*
            if (getClass() != obj.getClass()) {
                return false;
            }
        */
            final Person01 other = (Person01) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
        
        
        Person01 PersonNesnesi=(Person01)obj;//DOWNCASTING
        return id==PersonNesnesi.id && name.equals(PersonNesnesi.name);//equals method in this line is overrided in String Class 
        //Person Class'ındaki id(primitive data type) and name(reference D.T.) variables
        //int variable'ların tuttugu degerleri kıyaslamak icin == yeterlidir
        //String variable'ların tuttugu degerleri kıyaslamak icin equals() methodu gereklidir 
     
    }
    
    public boolean equals2(Person01 o)//bu override değil
    {
        if(this==o)return true;//içi false 'tur oyuzden true  yazdırmaz
        return this.id==o.id && this.name.equals(o.name);//String Classındaki overrided edilmiş equals() metodu
    }
   
    /*
        All three criteria in the contract of hashCode() mention in some ways the equals() method:

        internal consistency: the value of hashCode() may only change if a property that is in equals() changes
        equals consistency: objects that are equal to each other must return the same hashCode
        collisions: unequal objects may have the same hashCode
    */
    
    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.name);
        return hash;        
    
    //bu overrided method da calısır
    /*
        @Override
        public int hashCode() {
            return Objects.hash(id,name);
        }
    */
    }

    @Override
    protected void finalize() throws Throwable
    {
            //JDK9 VE SONRASINDA finalize() kullanılmıyor.
            //finalize()(method) ==> finalize() methodu, Garbage Collector'in imha edecegi
            //datalari imha edilecek hale getirir. 
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("finalize() tetiklendi");
    }
    
    
}
class Person2 extends Object//extends Object yazmak zornda degiilm the class inherit Object class automatically
{
    int id;
    String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" final variable initializing0final methods -final class ">


//Java program to demonstrate different
// ways of initializing a final variable 
  
class Gfg  
{ 
    // a final variable 
    // direct initialize 
    final int THRESHOLD = 5; 
      
    // a blank final variable 
    final int CAPACITY; 
      
    // another blank final variable 
    final int  MINIMUM; 
      
    // a final static variable PI 
    // direct initialize 
    static final double PI = 3.141592653589793; 
      
    // a  blank final static  variable 
    static final double EULERCONSTANT; 
      
    // instance initializer block for  
    // initializing CAPACITY 
    {
        CAPACITY = 25; 
    } 
      
    // static initializer block for  
    // initializing EULERCONSTANT 
    static{ 
        EULERCONSTANT = 2.3; 
    } 
      
    // constructor for initializing MINIMUM 
    // Note that if there are more than one 
    // constructor, you must initialize MINIMUM 
    // in them also 
    public Gfg()  
    { 
        MINIMUM = -1; 
    }
}



class Gfg2 
{ 
    // Java program to demonstrate 
    // local final variable 
    // The following program compiles and runs fine 
    public static void main(String args[]) 
    { 
        // local final variable 
        final int i; 
        i = 20;  
        System.out.println(i); 
    } 
} 

// Java program to demonstrate final 
// with for-each statement 
  
class Gfg3  
{ 
    public static void main(String[] args)  
    { 
        int arr[] = {1, 2, 3}; 
          
        // final with for-each statement 
        // legal statement 
        for (final int i : arr) 
            System.out.print(i + " ");
    }     
} 


//Final methods

//When a method is declared with final keyword, it is called a final method.
//A final method cannot be overridden. 
class A 
{
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
}

class B extends A 
{
    /*
        void m1()
        { 
            // COMPILE-ERROR! Can't override.
            System.out.println("Illegal!");
        }
    */
}

/*
    One is definitely to prevent inheritance, as final classes cannot be extended. 
    For example, all Wrapper Classes like Integer,Float etc. are final classes. 
    We can not extend them.
*/
/*
    The other use of final with classes is to create an immutable class like the predefined String class.
    You can not make a class immutable without making it final.
*/
final class Aj
{
     // methods and fields
}
// The following class is illegal.

//class B extends Aj 
//{ 
    // COMPILE-ERROR! Can't subclass A
//}
    



// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="final variable-method-class">

class FinalKeyword
{
    int a=1;
    static int b=2;
    /*final variable
        There are three ways to initialize a final variable :
        You can initialize a final variable when it is declared. This approach is the most common. ...
        A blank final variable can be initialized inside instance-initializer block or inside constructor. ...
        A blank final static variable can be initialized inside static block
    */
    
    /*
        Can a constructor be final?
        No, a constructor can't be made final. A final method cannot be overridden by any subclasses. 
        In other words, constructors cannot be inherited in Java therefore, there is no need to write final before constructors. 
        Therefore, java does not allow final keyword before a constructor
    */
    
    //final int num1=10; num1=15; //instance variable cannot be reassigned a new value
    static public void method()
    {
        int number=10;   number=15;
        
        //final int number2=10; number2=15; final variables are unchangeable
        
        final int number2; number2=15;//to create constant variable
        
    }
}
final class FinalParent extends FinalKeyword
{
    //final class cannot be extended - to prevent ınheritance

    static public void method()
    {
        System.out.println();
    }
}

//class  child extends FinalParent//error
//class  child extends Math//error - Math is public and final class - so it cannot be extended
class  child 
{
    static public int a=1;
    public int b=1;
    static final public int c=1;

    final public void method1(){ System.out.println("final method cannot be overrided");}
    final static public void method2(){ System.out.println("final static method cannot be overrided");}
    void method3(){System.out.println("not final and not static method can be overrrided");}
}

class grandChild extends child
{
    public void callMethod2()
    {
        //final static intance variable of superclass
        System.out.println(a++ + " "+ b++ + " " + c);

        //final-static methods
        method2();
        child.method2();
        child nesneChild=new child();  nesneChild.method2();
        this.method2();
        super.method2();//Superda static cıkmaz ben kendim yazdım
    }

    @Override
    void method3()
    {
        super.method3(); //To change body of generated methods, choose Tools | Templates.
    }
    
    void callmethods3()
    {
        super.method3();//child'dan gelir
        this.method3();//grandChild'dan gelir
        method3();//grandChil'dan gelir non-static method non-static methodun içinde direk cagrılır
    }
   
}

final class Finalgrandchild extends child//final class can extends a non-final class
{
    
    public static void method4()
    {
       child nesne=new child();
       nesne.method1();//final method cagrılabilir,static olmadıgı icin nesne kullandım
       child.method2();
       Finalgrandchild.method2();//static method cagrılabilir ve tüm ailenin malıdır
    }

    /*
        final public void method1()
        {
            System.out.println("final method cannot be overrided");
        }
    */
}
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="abstract classes-methods(grandpa-child-grandchild)">



class Abstract
{
    //abstractClass nesne = new abstractClass(1,2);//abstract class cannot be instantiated(somutlastırılamaz) even if it has constructor
    /*
    Her ne kadar new ile yeni nesne üretilmese de abstract sınıfların da
    constructorları vardır ve alt sınıftan bir nesne üretildiğinde bu kurucu
    metotlar sırasıyla calıstırılır.

     */
}
abstract class abstractClass//abstract class private ve final olamaz, çünkü final class cannot be extended
{
    int a,b;
    static int c;//bir classda static variable oluyorsa bunda da olur
    final int d=10;//final variables must be initialized in any class
    final int e;
    {
        e=10;//böyle de initialized edebilirim
    }

    //public abstractClass() {}//bunu yazarsam sub classlar hiç bir constructor(superclasstaki constructor tiplerşnden) method yazmak zorunda değilidir

    public abstractClass(int a) {//bunu inherit etmek zrunda degiller cünkü alttaki constructorı inherit ettiler
        this.a = a;
    }//    •Abstract sınıflarda hiç metot da olmayabilir. Alt sınıflarıbir üst sınıf tanımında toplamak için böyle bir durum olabilir.


    public abstractClass(int a, int b) {// If parent has a constructor with parameter(without parameter constr. is default constructor every class have it)
        this.a = a;
        this.b = b;
    }
    
    public abstract void method1();//cannot have body
    //private abstract void method1();//abstract method cannot be private - static - final private method cannot be overrided
    //public final abstract void method1();//abstract method cannot be final
    //public static abstract void method1();//abstract meethod static olamaz
    public abstract void method2();
    
    public void method3()//concrete method
    {
        System.out.println("non-abstract method");
    }
}
abstract class abstractClass2 extends abstractClass
{
    public abstractClass2(int a, int b) {
        super(a, b);
    }

    //super classdan bir tane constructor inherit edildi hepsini inherit etmek zorunda değiliz
    @Override
    public void method1() {}//babadaki abstract method override edildi - cocukta tekrardan override edilmek zorunda degil 

    @Override
    public abstract void method2();//babadaki abstract method yine abstract olarak override edildi - oyuzden cocukta tekrardan override edilmeli
    
    @Override
    public void method3() {//normal overriding
        super.method3(); 
    }
    
    abstract public void method4();//yeni bir abstract olusturdum
}

class abstractClass3 extends abstractClass2
{
    public abstractClass3(int a, int b) {
        super(a, b);
    }
    //@Override
    //public void method1() {} //override edilmese de olur - bu abstract method dedede initiliazed edildi babada normallestiridi

    @Override
    public void method2() {}//babadaki hala abstract olan methodu overide etmek zorunda

    @Override
    public void method4() {}//sadece babada var - dedede yok  - override etmek zorunda
   
}

class Class1 extends abstractClass
{


    public Class1(int a) {
        super(a);
    }

    @Override
    public void method1() {
    }

    @Override
    public void method2() {
    }
    
}
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="abstraction(geometricShape-square-rectangle-circle)">

class Abstract2
{
    /*
    Abstract Sınıf ?
    Abstract sınıf nesne üretilmeyen ve soyut metotlar barındıran bir yapıdır.
    Metotların sadece tanımlarıbulunur ve bu sınıftan türetilen alt sınıflar bu metotların içeriklerini kendilerine göre oluşturulmak zorundadır.
    Abstract class abstract method barındırmak zorunda değil.
    
    Abstract sınıflar diğer sınıf yapısına oldukça benzer. Ama bazıfarklılıkları bulunur.
    .Abstract sınıflardan new ile yeni bir nesne üretemezsiniz.
    .Abstract sınıflarda metotların tanımıolur, içerikleri olmaz. Bu içerikler abstract sınıftan türetilmişsınıflarca yazılır.
    •İçerikleri yazılmayan bu metotlar abstract metot olarak tanımlanır. Bir sınıfta bir tane abstract metotun olmasıo sınıfıabstract yapmaya yeterlidir.
    •Bir metot abstract ise o sınıf mutlaka abstract olmalı. Ve bu metotlar static olamazlar.
    •Her ne kadar new ile yeni nesne üretilmese de abstract sınıfların da constructorlarıvardır ve alt sınıftan bir nesne üretildiğinde bu kurucu metotlar sırasıyla calıstırılır.
    •Abstract sınıflarda hiç metot da olmayabilir. Alt sınıflarıbir üst sınıf tanımında toplamak için böyle bir durum olabilir.
    •Üst sınıf normal bir sınıf iken alt sınıf abstract olabilir. Object sınıfınormal iken olusturacagımız bir sınıf abstract olabilir.
    */
    public static void main() {

        //GeometricShape nesne = new GeometricShape();//abstract class cannot be initialized
        
        System.out.println("********** SQUARE **********");
        GeometricShape square = new Square(12);//square nesnesi geometricShape classına özgü methodlara erişir
        square.perimeter();
        square.area();
        square.sayObjectName();
        ((Square)square).adınıSoyle();//this method is special to Square Class - casting is required

        System.out.println("\n********** RECTANGLE **********");
        GeometricShape rectangle=new Rectanglee(10,12);
        rectangle.perimeter();
        rectangle.area();
        rectangle.sayObjectName();
        ((Rectanglee)rectangle).adınıSoyle();

        System.out.println("\n********** CIRCLE **********");
        GeometricShape circle=new Circlee(5);
        circle.perimeter();
        circle.area();
        circle.sayObjectName();

        System.out.println("\n*******COMPARE AREAS OF SHAPES********");
        compareAreas(square,rectangle);
        compareAreas(square,circle);
        compareAreas(rectangle,circle);
        
        System.out.println("\n*******COMPARE PERIMETERS OF SHAPES********");
        comparePerimeter(square,rectangle);
        comparePerimeter(square,circle);
        comparePerimeter(rectangle,circle);
        
        System.out.println("\n*******SHOW BOTH PERIMETERS AND AREAS********");
        show_Area_and_Perimeter(square);
        show_Area_and_Perimeter(rectangle);
        show_Area_and_Perimeter(circle);
        
        ArrayList <GeometricShape> shapeList= new ArrayList<>();//abstract class objeleri(declared typelar)
        shapeList.add(square);
        shapeList.add(rectangle);
        shapeList.add(circle);
        for(GeometricShape i: shapeList)
            System.out.println(i);
        shapeList.stream().forEach(t-> System.out.println(t));
    }

    public static void show_Area_and_Perimeter(GeometricShape gs1){//polimorphism
        //gs1.adınıSoyle();//olmaz compile error - because the parameter cannot foresee which object's method come
        gs1.perimeter();
        gs1.area();
    }

    public static void comparePerimeter(GeometricShape gs1,GeometricShape gs2)
    {
        if(gs1.getCalculatedPerimeter() < gs2.getCalculatedPerimeter()){
            System.out.println("Birinci parametredeki nesnenin cevresi ikinci parametredeki nesne cevresinden küçüktür.");
        }else if(gs1.getCalculatedPerimeter() > gs2.getCalculatedPerimeter()){
            System.out.println("Birinci parametredeki nesnenin cevresi ikinci parametredeki nesne cevresinden büyüktür.");
        }else{
            System.out.println("Cevreler birbirine eşittir");
        }
    }
    public static void compareAreas(GeometricShape gs1, GeometricShape gs2){
        if(gs1.getCalculatedArea() < gs2.getCalculatedArea()){
            System.out.println("Birinci parametredeki nesnenin alanı ikinci parametredeki nesne alanından küçüktür.");
        }else if(gs1.getCalculatedArea() > gs2.getCalculatedArea()){
            System.out.println("Birinci parametredeki nesnenin alanı ikinci parametredeki nesne alanından büyüktür.");
        }else{
            System.out.println("Alanlar birbirine eşittir");
        }

    }
//what if polimorphism doesnt exist
//    public static void compareAreas(Square gs1, Square gs2){}
//    public static void compareAreas(Circle gs1, Circle gs2){}
//    public static void compareAreas(Rectangle gs1, Rectangle gs2){}
//    public static void compareAreas(Rectangle gs1, Square gs2){}
    //ı would have to write such methods above
}



abstract class GeometricShape extends Object//abstract class bos ya da abstract method içermeyebilir
{   
     
    private int firstSide;
    
    private int calculatedPerimeter;//to compare the areas , ı need to return the values but ı dont want to write return type method

    private int calculatedArea;//to compare the areas , ı need to return the values but ı dont want to write return type method

    public GeometricShape(int firstSide) {//alt sınıflar nesne olurstururken sadee kenar degerini girecek
        this.firstSide = firstSide;
        
    }

    
    
     //bunu olusturayımki subclassların nesneleri güncellensin
   
    abstract public void perimeter();//ortak bir özellik oldugu için içi bos, her class kendisi dolduracak
    //astract yazmazsak  compile error alırız
    abstract public void area();
    
    abstract public void sayObjectName();

    public int getFirstSide() {return firstSide;}
    public void setFirstSide(int firstSide) {this.firstSide = firstSide;}
    
    public int getCalculatedPerimeter() { return calculatedPerimeter; }
    public void setCalculatedPerimeter(int calculatedPerimeter) { this.calculatedPerimeter = calculatedPerimeter;}  

    public int getCalculatedArea() {return calculatedArea;}//so ı use this method to return areas' value
    public void setCalculatedArea(int calculatedArea) {this.calculatedArea = calculatedArea;}// ı use this to make calculatedArea variable to refer new area's value  

   

    //normal toStringe gerek yok nesne üretmicem çünkü
   
}

class Square extends GeometricShape
{ 

    Square(int firstSide) {
        super(firstSide);
        this.setCalculatedPerimeter(4*this.getFirstSide());
        this.setCalculatedArea((int)Math.pow(this.getFirstSide(), 2));
    }
    
    @Override
    public void perimeter() {//if the class is not abstract, this method must be overrided in this class
        System.out.println("Perimeter of the Square:"+ this.getCalculatedPerimeter());
    }

    @Override
    public void area() {//if the class is not abstract, this method must be overrided in this class
        System.out.println("Area of the Square:"+getCalculatedArea());
    }

    @Override
    public void sayObjectName() {
        System.out.println("Ben bir kare nesnesiyim");
    }
    
    public void adınıSoyle() {//subClass'ın kendisine ait methodu
        System.out.println("Ben bir kare nesnesiyim");
    }


    @Override
    public String toString() {
        return "GeometricShape{ Square{ " + "firstSide=" + getFirstSide() + ", calculatedPerimeter=" + getCalculatedPerimeter() + ", calculatedArea=" + getCalculatedArea() + " } }" ;    }





}

class Rectanglee extends GeometricShape{

    private int secondSide;

    Rectanglee(int firstSide, int secondSide) {
        super(firstSide);
        this.secondSide=secondSide;
        setCalculatedPerimeter(2*(getFirstSide()*secondSide));
        setCalculatedArea(getFirstSide()*secondSide);

    }

    public int getSecondSide() {return secondSide; }
    public void setSecondSide(int secondSide) {this.secondSide = secondSide;}
    
   @Override
    public void perimeter() {
        System.out.println("Perimeter of the Rectangle:"+getCalculatedPerimeter());
    }

    @Override
    public void area() {
        System.out.println("Area of the Rectangle:"+getCalculatedArea());
    }

    @Override
    public void sayObjectName() {
        System.out.println("Ben bir dikdortgen nesnesiyim");
    }

    public void adınıSoyle() {//subClass'ın kendisine ait methodu
        System.out.println("Ben bir kare nesnesiyim");
    }

    @Override
    public String toString() {
        return "GeometricShape{ Rectangle{ " + "firstSide=" + getFirstSide() + " secondSide=" + secondSide +", calculatedPerimeter=" + getCalculatedPerimeter() + ", calculatedArea=" + getCalculatedArea() + " } }"  ;
    }

}

class Circlee extends GeometricShape{

    public Circlee(int radius) {
        super(radius);    
        this.setCalculatedPerimeter(  (int)(2*Math.PI*getFirstSide())  );
        this.setCalculatedArea((int)(Math.PI*Math.pow(2,getFirstSide())));
    }
  
    @Override
    public void perimeter() {
        System.out.println("Perimeter of the Circle:"+getCalculatedPerimeter());
    }

    @Override
    public void area() {
        System.out.println("Area of the Circle:"+getCalculatedArea());
    }

    @Override
    public void sayObjectName() {
        System.out.println("Ben bir Circle nesnesiyim"); 
    }


    @Override
    public String toString() {
        return "GeometricShape{ Circle{ " + "Radius=" + getFirstSide() + ", calculatedPerimeter=" + getCalculatedPerimeter() + ", calculatedArea=" + getCalculatedArea()  + " } }" ;    
    }

}

    // </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" abstract - polimorphism ">

abstract class Atr
{
    abstract void myMethod(Number N);
    public static void staticMethod(){}
}
 
abstract class Btr extends Atr
{
    abstract void myMethod(Object O);
}
 
class Ctr extends Btr
{
    @Override
    void myMethod(Number N)
    {
        System.out.println("Number");
    }
    
 
    @Override
    void myMethod(Object O)
    {
        System.out.println("Object");
    }
}
 
//Object>Number>Integer classes
class MainClasstr
{
    public static void main()
    {
        Atr aa= new Atr() {//abstract classından nesne üretilemez ama anonymous inner class olusturulabilir.
            @Override
            void myMethod(Number N) {

            }
        };
        Atr a = new Ctr();//declared type Atr ve Atr classındaki tüm field and methodlara ulasabilirim
        //eger Ctr de override edilmisse onlar yazar(late binding),
        //Ctr de yoksa Btr de override edilmişşse olar yazılır
        //Btrde de yoksa Atrdeki ler calısır.
        Atr.staticMethod();//abstract classta static method olusturulur ama biliyoruzki static methodlar childlerda override edilemez
 
        //a.myMethod(Number N);
        a.myMethod(new Integer(121));//Integer Number
        //a.myMethod(new String("String"));
 
        
        Btr b = new Ctr();//
        
        //b.myMethod(Number N);
        //b.myMethod(Object O);
        //2 SİDE VARDIR- Integer geldi yok number oldu baktı numbar olan ethod nerde Atrden geliyor onu calıstırı
        b.myMethod(new Integer(121));//number
 
        Ctr c = new Ctr();
 
        c.myMethod(new Integer(121));//ınteger number

    }
}






// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" abstract - interface - polimorphism ">

abstract class A2
{
    abstract void myMethod(Number N);
}
 
interface B2
{
    abstract void myMethod(Object O);//abstract yazmaya gerek yok
}
 
class C2 extends A2 implements B2
{
    @Override
    void myMethod(Number N)
    {
        System.out.println("Number");
    }
 
    @Override
    public void myMethod(Object O)
    {
        System.out.println("Object");
    }
}
 
class abs_int
{
    public static void main()
    {
        A2 a = new C2();
 
        a.myMethod(new Integer(121));//number
 
        B2 b = new C2();
 
        b.myMethod(new Integer(121));//object
 
        C2 c = new C2();
 
        c.myMethod(new Integer(121));//number
    }
}
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="interface">

class Interface01
{
    static void main()
    {
        //Eidible e= new Eidible(); //interface'den nesne olusturulamaz

       Eidible e1= new Eidible()  //this is a anonymous class
       {
            @Override
            public void yenmeSekli() { }

            @Override
            public void taste() { }
        };

        ArrayList <Object> ObjectList = new ArrayList<>();
        
        Apple a=new Apple();
        a.yenmeSekli();//interface Eidible'dan
        a.appleMethod();//kendisinden
        a.ekle(ObjectList);//ekle()  superClass'tan
     
        Meat m=new Meat();
        m.yenmeSekli();//interface Eidible'dan
        m.meatVoid();//kendisinden
        m.ekle(ObjectList);//  superClass'tan
        
        System.out.println(ObjectList);//[javaoop.Apple@3532ec19, javaoop.Meat@68c4039c]
        
        
        
        Eidible apple=new Apple();
        apple.yenmeSekli();
        ((Apple)apple).appleMethod();//down casting
        
        Eidible meat=new Meat();
        meat.yenmeSekli();
        ((Meat)meat).meatVoid();//down casting
        
        ArrayList <Eidible> EidibleList = new ArrayList<>();
        EidibleList.add(apple);
        EidibleList.add(meat);
        System.out.println(EidibleList);//[javaoop.Apple@ae45eb6, javaoop.Meat@59f99ea]
    }
}

interface Eidible//interface'in içinde sadece gövdesiz method olabilir.
{
    
    static final public int a=10;//interface daki bir field static public ve finaldır.
    //protected private default olamaz

    //abstract classlarda ise concrete classlardaki gibidir durum
    
    /*constructor method olamaz interface'in
    public Eidible(int i)
    {
        a=i;
    }
    */
    
    void yenmeSekli();//interfacedeki her method abstract ve public'tir.
    abstract public void taste();

    //void yenmeSekli(){};//interface abstract method cannot have body

    default public void yenmeSekli2()
    {};//interface abstract method can have body with default keyword
    //private protected default olamaz , publictir.

}

class SuperClass
{
    void ekle(ArrayList<Object> liste)
    {
        liste.add(this);
    }
}

class Apple extends SuperClass implements Eidible
{
    
    void appleMethod()
    {
        System.out.println("Apple method");
    }
    
    @Override
    public void yenmeSekli() {
        System.out.println("direk ye");
    }

    @Override
    public void taste() {
        System.out.println("ekşi lezzetli");
    }   
    
}

class Meat extends SuperClass implements Eidible//extends implementden önce yazlır
{
    void meatVoid()
    {
        System.out.println("Meat method");
    }
    @Override
    public void yenmeSekli() {
        System.out.println("pisir ye");
    }

    @Override
    public void taste() {
        System.out.println("lezzetli tuzlu ");
    }   
}
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="why cant a class extends  2 class at the same time? and why should  interface required">

class MultipleInheritance
{
    public static void main()
    {
        Tarkan tarkan =new Tarkan();
        tarkan.doDancing();
        tarkan.playGuitar();
        
        
        Singer singer1=new PopSinger();//singer abstract classtır
        singer1.doSport();//interface Personn
        singer1.eatFood();//interface Personn
        singer1.signSong();//abstract class Singer implements Personn
        singer1.singerMethod2();//abstract class Singer implements Personn
        ((PopSinger)singer1).doDancing();


        Singer singer2=new RockSinger();
        singer2.doSport();//interface Personn
        singer2.eatFood();//interface Personn
        singer2.signSong();//abstract class Singer implements Personn
        singer2.singerMethod2();///abstract class Singer implements Personn
        ((RockSinger)singer2).playGuitar();
        
        PopSingerFeatures popcu1=new Tarkan();
        popcu1.doDancing();
        ((Tarkan)popcu1).playGuitar();
        ((Tarkan)popcu1).doDancing();//PopSingerFeature bu işleme gerek yok demek istiyor ( fate )
        ((Tarkan)popcu1).doSport();//interface personn
        ((Tarkan)popcu1).eatFood();//interface personn
        ((Tarkan)popcu1).signSong();//abstract Singer classtan


        RockSingerFeatures popcu01=new Tarkan();
        popcu01.playGuitar();
        ((Tarkan)popcu01).doDancing();

        PopSingerFeatures popcu2=new Hadise();

        Tarkan tarkann=new Tarkan();//class implements PopSingerFeatures

        PopSingerFeatures[] dizi=new PopSingerFeatures[5];//interface
        dizi[0]=popcu1;
        dizi[1]=popcu2;
        dizi[2]=tarkann;

        Singer[] dizi2=new Singer[5];//abstract class
        dizi2[0]=tarkann;
        System.out.println( dizi2);


        ArrayList<PopSingerFeatures> arraylist=new ArrayList<>();
        arraylist.add(popcu1);
        arraylist.add(popcu2);
        arraylist.add(tarkan);//declared type: Tarkan

        ArrayList<Personn> arraylist2=new ArrayList<>();
        arraylist2.add(tarkan);//Tarkan classından
        arraylist2.add(singer1);//Singer singer1=new PopSinger();//singer abstract classtır
        arraylist2.add(singer2);//Singer singer2=new RockSinger();



        popcu1.doDancing();//playGuitar() cıkmaz
        popcu2.doDancing();
        
                
        RockSingerFeatures rockcı1=new Tarkan();
        RockSingerFeatures rockcı2=new Teoman();
        rockcı1.playGuitar();//doDancing() cıkmaz
        rockcı2.playGuitar();
        
    }
}
abstract class person2
{
    abstract void sleep();
}
interface person3 //extends person2// - interface class ya da abstract class extends yapamaz
{
    /*
    Java interfaces cannot extend classes, which makes sense since classes contain implementation details 
    that cannot be specified within an interface.. ... If you want to share code among all Vehicle instances, 
    then you can use a (possibly abstract) class as a parent for any classes that need to implement that interface
    */
}
interface person4 extends person3//interface can extends another interface
{
    /*
    Only interfaces can extends other interfaces. 
    You can actually extend interfaces in Java, but it would still be called an interface.
    */
}
interface Personn // implements person3 - interface cannot implements an interface
{
    /*
    An interface cannot implement another interface in Java. ...
    An interface is defined just like a class except for the keyword interface in place of a class, 
    the variables are declared in an interface are static and final ,public and
    the methods are defined in an interface are public abstract methods
    */
    void eatFood();//public,abstract
    public abstract void doSport();
}
abstract class Singer implements Personn //abstrac class nesne üretmediği için extends ve implement ettiği methodları override etmek zorunda degildir
{
   abstract void signSong();
   
   private final static void singerMehod()//private final static olabilr
   {//concrete claslardaki gibi
       System.out.println("singer methodu");
   }
   
   void singerMethod2()
   {
       singerMehod();
   }
}

interface PopSingerFeatures
{
    static final public int age=20;//static final public ve initialized olmak zorunda
    int age2=22;//public static final dır.protected da olamaz
    //interfacelerde nesne olusturulmaz - constructor olusturulmaz.
    //instance variable'a interface adıyla ulasabilmek icin static olmalıdır.
    //interfacedeiki attributeler ortaktır ve variabler icin degerler de aynı olmalı.
    //bu interface'ı implements eden sarkıcılar 20 yasındadırlar
    //public olmalı ki ulasabilsin.zaten final degerler hep aynı
    
    public abstract void doDancing();//public ve abstract yazmasam da public ve abstracttır
    //private static final olamaz bir method -override edilebilmesi için
    //protected da olamaz
}

interface RockSingerFeatures
{
   public abstract void playGuitar();//abstract yazmasam da abstracttır
}

class PopSinger extends Singer implements PopSingerFeatures
{
    @Override
    void signSong() {
        System.out.println("Pop singer sings POP Music");
    }
    
    //void doDancing(){
       // System.out.println("Pop singer do dancing");}

    @Override
    public void eatFood() {//singer abstract classı personn interface ini implement ettiği için ve popsinger da singer ı extends ettiği için personn interfaceindeki methoları override etmek zorundadır
    }

    @Override
    public void doSport() {
    }

    @Override
    public void doDancing() {
        System.out.println("pop singer do dancing");
    }
}

class RockSinger extends Singer implements RockSingerFeatures
{
    @Override
    void signSong() {
        System.out.println("Rock singer sings ROCK Music");
    }   
    
   // void playGuitar(){
    //System.out.println("Rock singer plays guitar");}

    @Override
    public void eatFood() {
    }

    @Override
    public void doSport() {
    }

    @Override
    public void playGuitar() {
        System.out.println("rock singer play guitar");
    }
}

//class Tarkan extends PopSinger,RockSinger{  }// olmaz cünkü aynı methodlara sahipler,olmasalar bile olabilme ihtimallerinden dolayı 2 class extends edilemez JAVADA

class Tarkan extends Singer implements PopSingerFeatures,RockSingerFeatures
{//tarkanı hem popcu hem rock olarak dusun

    @Override
    public void doDancing() {
        System.out.println("tarkan do dancing");
    }

    @Override
    public void playGuitar() {
        System.out.println("tarkan play guitar");
    }

    @Override
    public void eatFood() {

    }

    @Override
    public void doSport() {

    }

    @Override
    void signSong() {

    }
}

class Hadise implements PopSingerFeatures
{
    @Override
    public void doDancing() {
    }   
}

class Teoman implements RockSingerFeatures
{

    @Override
    public void playGuitar() {
    }
    
}
        // </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" interface-super-this ">

interface I01
{
    public static final int INSTANCE=0;
    void method1();
    default void method2(){
        System.out.println("I01 - default - method2");
    };
}
interface I02 extends I01
{
    public static final int INSTANCE=1;

    public default void method()
    {
        System.out.println("I02 - default - method");
        //I01.super.method1();//bodysiz oyuzden compile error verir
        I01.super.method2();
    }
}

//1-interfacelerde biri birini kapsıyorsa kapsıyan interface(child)ile super keywordunu kuullan
//2-super keywordu interfaceName.super.MethodName olarak kullanulır
class Run implements I01,I02{//hata vermez

    public static final int INSTANCE=2;


    @Override
    public void method()//public yazmak zorundayım cünkü override ediyorum ve interfacelerde her method publictir
    {
        System.out.println("Run class - method");
    }

    void main() {
        //I01.super.method2();//normal sartlarda calısır ama burda mantık hatası var
                                //I02 Interface'i I01'i kapsasdıgı için I02 yi kullanmamızı istiyor javac
        I02.super.method2();//method2() I01 in asıl malı ama I02 I01'in cocugu inheritance var yani
        I02.super.method();
        this.method();
        System.out.println(I01.INSTANCE);//0 - INTERFACE LERDEN VARİABLE CAGIRMANIN TEK BUDUR
        System.out.println(I02.INSTANCE);//1
        System.out.println(this.INSTANCE);//2
        System.out.println(Run.INSTANCE);//2
        System.out.println(INSTANCE);//2

    }

    @Override
    public void method1() { }
}

class Run2 implements I01{

    void main()
    {
        I01.super.method2();//burada calsıır
        this.method2();
    }

    @Override
    public void method2()//override yok I02 implements edilmedi çünkü
    {
        System.out.println("Run class - method2");
    }

    @Override
    public void method1() { }
}
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" interface2 ">

class run
{
    boolean check=kisii.emailControl("duman@gmail.com");

    {
        System.out.println(check);
    }
}


abstract interface kisii //static final olamaz sadece defaulttur(package icinden erisilir,default olarak abstract tır
{
    interface kisi02
    {

    }

    //Java 8 ile beraber default ve static metot tanımları yapabiliyoruz.

    //bir interface'in icinde constructor olmaz, static ve normal instance initializng block olmaz
    /*
    kisii()
    {
        
    }
    
    static
    {
        
    }
    
    {
        
    }
    */
    abstract public void eat();
    void drink();
    
    default void sayYourName()//default koyarak concrete method yazılabilir
    {//extends eden subclasslarda bu methodu yazmak zorunda değilim
        System.out.println("I'm kisii interface");
    }
    
    default public void sayYourName2()//default koyarak concrete method yazılabilir - bu method publictir by default
    {//extends eden subclasslarda bu methodu yazmak zorunda değilim
        System.out.println("I'm kisii interface");
    }
    
    default void sayYourSurname()//ı dont have to override this in Duman class - ıt is optional
    {
        System.out.println("mt surname is interface2");
    }
       
    
    static void staticMethod()//bunu override edemezsin /sadece interface adı ile acgırabilirsin
    {
        System.out.println("static method in interface");
    }
    
    static boolean emailControl(String email)
    {
        if(email.contains("@"))
            return true;
        else
            return false;    
    }
    
    static public final int Age=20;//İNSTANCE VARİABLE - Static Final Public'tir
    int age=21;//İNSTANCE VARİABLE - Static Final Public'tir
}

interface ogrencii extends kisii
{
    void study();
    void gotoSchool();

    @Override
    public void sayYourName();//istersem override edebiirim
    //override eder ve abstracr bir sekilde bırakırsam ogrencii'yi implements eden 
    //duman classında override edip body eklemeliyim

    @Override
    void drink();//kisii interface'inde tanımladım ve sadece void drink yazdım(default olarak public ve abstract'tır)default olarak hala abstract ve public
//istersem override edebiirim
    //override eder ve abstracr bir sekilde bırakırsam ogrencii'yi implements eden 
    //duman classında override edip body eklemeliyim
    
    
    
}
interface employeee extends kisii
{
    void work();

    default void work2(){
        System.out.println("work2- employee");
    };
}
interface uniOgrencii extends ogrencii,employeee//bu 2 interface'de de aynı methodlar var ama abstract'lar concrete bodyli değilller sorun teskil etmez
{
    void studyForFinals();
}

class Duman implements uniOgrencii, kisii {//kisii hem ogrencii hem employee hem de uniOgrencii de var

    @Override
    public void studyForFinals() {
    }

    @Override
    public void study() {
    }

    @Override
    public void gotoSchool() {
    }

    @Override
    public void eat() {
        //employeee.super.work2();//employeee interface'i uniOgrencii interface tarafından implememtn edildiği icin uniOgrenccii yi kullan
        uniOgrencii.super.work2();//work2- employee
        uniOgrencii.super.work2();//work2- employee
//2tane super runtime error vermedi
    }

    @Override
    public void drink() {//kisii de default ogrencide de default - ama class icinde public olmak zorunda cünkğü artık abstract degıl concrete
    //kisii.super.drink();//drink() abstract tır
       // kisii.super.sayYourSurname();//kisii uniOgrencii tarafından extended edildi oyuzden direk kisiden bunu super etmek yanlıs
    uniOgrencii.super.sayYourSurname();//bu olur
    }

    @Override
    public void work() {
        //uniOgrencii.super.studyForFinals();//this method has no body
        uniOgrencii.super.sayYourSurname();//thsi method has body
    }

    @Override
    public void sayYourName() {
        uniOgrencii.super.sayYourName2();
        System.out.println("ı am duman");
    }

    @Override
    public void sayYourSurname() {
        uniOgrencii.super.sayYourSurname(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(uniOgrencii.Age);

    }
}

    // </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" interface3 ">

interface vbn//abstract and default by default
{
void a();
void b();
void c();
}

interface v extends vbn
{

@Override
public default void a() {
}

@Override
public void b();

void c();

}

abstract class absClass implements v
{

    @Override
    public void c()//interface v den
    {
        System.out.println("");
    }
    
}





// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" interface4 ">

abstract class At
{
    abstract void myMethod(Number N);
}

interface Bt//interface public olabilir ama pakettte baska public class yada interface olmamalı
{
abstract void myMethod(Object O);
}

class Ct extends At implements Bt
{
@Override
void myMethod(Number N)
{
    System.out.println("Number");
}

@Override
public void myMethod(Object O)
{
    System.out.println("Object");
}
}

//Object>Number>Integer classes
class MainClasst
{
public static void main()
{
    At a = new Ct();

    //a.myMethod(Number N);
    a.myMethod(new Integer(121));//Integer Number


    Bt b = new Ct();//b nesnesinde a dan method yoktur

    //b.myMethod(Object b);
    b.myMethod(new Integer(121));//Object

    Ct c = new Ct();

    c.myMethod(new Integer(121));//ınteger number
}
}






// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" interface5 ">

class Ar{ }
 
class Br extends Ar { }
 
class Cr extends Br { }
 
interface ABCr
{
    void method(Ar a);
}
 
interface PQRr
{
    void method(Br b);
}
 
class Mr implements ABCr, PQRr
{
    @Override
    public void method(Ar a)
    {
        System.out.println(2);
    }
 
    @Override
    public void method(Br b)
    {
        System.out.println(3);
    }

}
 
class MainClassr
{
    public static void main(String[] args)
    {
        Mr m = new Mr();
 
        m.method(new Ar());//2
 
        m.method(new Br());//3
 
        m.method(new Cr());//3 - Cr Br - Ar ye gelmeden Br'deki methodu uygular
    }
}




interface InterfaceAa
{
    void metotA();
}

class SinifBb
{
    public void metotA()
    {
        System.out.println("B Sınıfındaki metot");
    }
}

class SinifCc extends SinifBb implements InterfaceAa
{

}

class MainClass01
{
    public static void main(String[] args)
    {
        InterfaceAa a = new SinifCc();

        a.metotA();//B Sınıfındaki metot  - SinifCc de override edilmedi ama SinifBb de override edikmiştir ve o yazar
        // SinifBb nin implements interface yapmasına gerek yok
    }
}


// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" interface practice(comparableKullanımı) ">

class ComparableUsage
{
    static public void main()
    {
        String[] a1={"a","c","b"};
        Arrays.sort(a1);
        for(String obj :  a1)
            System.out.println(obj);// a b c yazdırcak
        
        ///String sınıfında compare() methodu olduğu için hata vermiyor
        //cünkü String ifadelerin ilk harfine göre sıralama yapar
        
        Studentt std1=new Studentt(1,"Pilot");
        Studentt std2=new Studentt(2,"Teğmen");
        Studentt std3=new Studentt(2,"Teğmen");
        Studentt std4=new Studentt(3,"Emre");
        
        Studentt[] StudentList={std1,std2,std3,std4};
        System.out.println("*******Before Sorting Out StudentList********");
        for(Studentt obj :  StudentList)
            System.out.println(obj);
       
        Arrays.sort(StudentList);//burada id'ye göre mi name'e göre mi sıralanacak bilemiyoruz
        //Studentt classımda compare() methodu bulunmuyor
        
        System.out.println("*******After Sorting Out StudentList********");
        for(Studentt obj :  StudentList)
            System.out.println(obj);
        /*
            *******After Sorting Out StudentList********
            Studentt{id=3, name=Emre}
            Studentt{id=2, name=Teğmen}
            Studentt{id=2, name=Teğmen}
            Studentt{id=1, name=Pilot}
        */
        
        //to understand compareTo() method
        System.out.println("a".compareTo("c"));// a is less than c / -2

        System.out.println("a".compareTo("a"));//equal / 0
        System.out.println("b".compareTo("aaaa"));//b is greater than a / 1
        System.out.println("bb".compareTo("aa"));//b is greater than a / 1
        System.out.println("ab".compareTo("ac"));//b is greater than a / -1 ilk harfler esitse yana gecilir
    }
}

class Studentt implements Comparable<Studentt>//bu interface'in içinde sadece bir abstract method var
{
    int id;
    String name;

    public Studentt(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studentt{" + "id=" + id + ", name=" + name + '}';
    }

    @Override
    public int compareTo(Studentt o) {

        if(this.id < o.id)
            return 1;
        else if(this.id > o.id)
            return -1;
        else
            return 0;

        /*
        if(this.name.compareTo(o.name)<0)//bu name in ilk harfinin ascii kodu bir sonraki name'inkinden küçükse
            return 1;//nesne diğerinden küçükse - deger cıkar , sart saglanır
        else if(this.name.compareTo(o.name) > 0)
            return -1;//büyükse sart sasglanır
        else
            return 0;
*/
    }


    
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" access modifier ">

//public class'ın adı ile .java uzantılı class dosyası ile aynı olmalı

//private class class1{} içindeki attributes and methods lara erişim olmayan sınıf olamaz

//protected class class1{} class protected olamaz
 
class main_accessModifier
{
    //class1 nesne=new class1();//nesne olusturulamaz - bu constructor private
    class1 nesne2=new class1(1);//default consructor-default class
    class1 nesne3=new class1(1,2);//protected consructor-default class
    class1 nesne4=new class1(1,2,3);//public consructor-default class   
}

class class1//default class
{
    private int id;//class içinde
    int id2;//class ve palet içinde
    protected int id3;//class-paket-baska paketlerde eger bu vlass kalıtılmıssa  erisilir
    public int id4;//class-packet-baska packets- erisilebilir
    
    private class1(){    }// private constructor'dan nesne olusturulamaz   ama private constructor yazılabilir

    class1(int id) {//Default contructor
        this.id = id;
    }
    
    protected class1(int id, int id2) {
        this.id = id;
        this.id2 = id2;
    }

    public class1(int id, int id2, int id3) {
        this.id = id;
        this.id2 = id2;
        this.id3 = id3;
    }
    
    //bir class'ın içinde her türlü inner class olusturulabilir
     //subclasses 

    static class subClass{} //subclass static DE  olabilir
    class subClass2{}
    private class subClass4{}
    public class subClass3{}      
    protected class subClass5{}
    final class subClass6{}
}

class class2//baska
{
    private class2()
    {
        
    }
}
//class class3 extends class2 {} //super class private default constructor içeriyorsa onu baska classlar extends edemez





// </editor-fold>// non-access modifier(static abstract final...)

  //<editor-fold defaultstate="collapsed" desc=" member innerClass ">

class nestedClassUsage {

    interface I01{}//inner interface olabilir

    public static void main ()
    {
        String[] cities={"istanbul","toronto","köln"};
        
        outerClass.innerClass nesne=new outerClass().new innerClass();
        System.out.println(
                //nesne.privateInnerClassVar erişilemez
                nesne.defaultInnerClassVar+"\n"+//0
                nesne.protectedInnerClassVar+"\n"+//0
                nesne.publicInnerClassVar//0 
                
                //nesne ile outerClass'ın attribute and methoslarına erişilemez
                //inner/member class can reach directly to fields or methods of outerclass
        );
        
        
        nesne.printStringArray(cities);
        
        outerClass nesneOuterClass=new outerClass();//outerClass nesnesi
        nesneOuterClass.new innerClass().printStringArray(cities);//outerClass nesnesi.innerClass nesnesi.innerClass'ın methodu
                
        outerClass.innerClass innerClassNesne=nesneOuterClass.new innerClass();
        System.out.println(innerClassNesne.defaultInnerClassVar);        
        
        
        class11.class22.class33 nesnee=new class11().new class22().new class33(); 
        nesnee.methodclass33();

        {
            System.out.println(class11.class22.class33.staticFinalClass33Var);
        }

        class11.class22 nesnee2=new class11().new class22();
        nesnee2.meethodclass22();
        nesnee2.new class33().methodclass33();
        
    }
}


class outerClass
{
    private int privateVar;
    int defaultVar;
    protected int protectedVar;
    public int publicVar;
    static int staticVar;
    final int finalVar=10;

    /*
    An inner class is a nested class that is not explicitly or implicitly declared static.
    Inner classes may not declare static initializers (§8.7) or member interfaces.
    Inner classes may not declare static members, unless they are compile-time constant fields
     */
    private void privateVar()
    {   
        innerClass nesne=new innerClass();//inerclass da olsa nesne üretilmeli
        System.out.println(nesne.privateInnerClassVar);
        System.out.println(nesne.defaultInnerClassVar);
        System.out.println(nesne.protectedInnerClassVar);
        System.out.println(nesne.publicInnerClassVar);
        System.out.println(nesne.finalInnerClassVar);
        nesne.innerclassMethod();
    }
    void defaultVar(){}
    protected void protectedVar(){}
    public void publicVar(){};
    final void finalVar(){};
    static void staticVar(){};


    
    private class privateInnerClass{}
    
    /*default*/class innerClass//outerClassın tüm attribute and methodslarına erişir
    {
        private int privateInnerClassVar;
        int defaultInnerClassVar;
        protected int protectedInnerClassVar;
        public int publicInnerClassVar;
        //static int staticVar;static Var - stataic method olamaz - static block olamaz
        final int finalInnerClassVar=10;
        static final int staticFinalVar=10;//static final olabilir

        {//static variable = method = block tanımlanamaz ama cagırılabilir
            System.out.println(staticVar);
            staticVar();
        }
        private void innerclassMethod()
        {
            //outer classın variables and methods are accessible from inner class
            System.out.println(privateVar);
            System.out.println(defaultVar);
            System.out.println(protectedVar);
            System.out.println(publicVar);
            System.out.println(staticVar);
            System.out.println(finalVar);
            
            privateVar();
            defaultVar();
            protectedVar();
            publicVar();
            finalVar();
            staticVar();//static method cagırılabilir
            
        }

        void defaultVar2(){}
        protected void protectedVar2(){}
        public void publicVar2(){};
        final void finalVar2(){};
        //static final void staticVar2(){};error

        void printStringArray(String[] array)
        {
            for(String i : array)
            {
                System.out.println(i);
            }
        }
       
    }
   
    protected class protectedInnerClass{ }///static final var olabilir ama static final method olamaz
    public class publicInnerClass
    {
        //interface I01{}//inner inner interface olamaz
        abstract class A01 {}
    }
    final class finalInnerClass{}
    abstract class abstractInnerClass{}
    static class staticInnerClass{}//inner classlar static olabilir
    static final class staticFinalClass{}
    interface InnerInterface{}
    /*
Inner sınıfı statik olarak belirleyebiliriz. Bu sınıflarda hem statik hem
statik olmayan metot ve değişkenler bulunabilir.
Statik inner sınıftan dışardaki sınıfın statik alanlarına erişilebilir, ama
statik olmayan alanlara erişemeyiz.
Bir static inner sınıf abstract olabilir, ama statik metotlar abstract olamaz.
 */

}





class class11
{
    static int sttaicInstanceVar;
    int i=sttaicInstanceVar+new class22().finaLInnerClassVar;//inner classlara onların nesneleri ile ulasırız

    {
        System.out.println(class22.staticFinalInnerClassVar);
        System.out.println(class22.class33.staticFinalClass33Var);
        //className.innerClassName olur
        //className.StaticMethod or StaticVariable olur

        class22.class33 nesneOfClass33= new class22().new class33();
        nesneOfClass33.methodclass33();

        //class22.class33.methodclass33();olamaz method static değil

        new class22().new class33().methodclass33();

    }

    protected void method(){
        System.out.println("class11");
    };

    class class22
    {
        //@Override İŞLEMİ SADECE SUPERCLASS-SUBCLASS ILISKILERINDE OLUR
        protected void method(){
            System.out.println("class22");
        };

    //  static int staticInnerVar;//static sadeece constant variablelar iindir
        
    //  static{
    //      static blok innerclasslarda kullanılaz        
    //  }

        {
        //instance initializg block can be typed in a innerclass
        }
        
        void meethodclass22(){System.out.println("merhaba class22");}

        static final int staticFinalInnerClassVar=10;// static final olabilir
        final int finaLInnerClassVar=11;

        {
            new class33().methodclass33();
            System.out.println(class33.staticFinalClass33Var);

            class33 nesne =new class33();
            nesne.methodclass33();
        }

        class class33
        {
            void methodclass33() { System.out.println("merhaba class33"); }
            static final int staticFinalClass33Var=10;
        }
    }
}
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" member innerClass practice">

class main_innerClass
{
    static public void main()
    {
        System.out.println("Member Inner Classes");
        Calculator c=new Calculator();
        
        Calculator.Addition nesne= new Calculator().new Addition();
        System.out.println(nesne.add(1, 2));//3
        
        //private innerclass
        //Calculator.Substition nesne2= new Calculator().new Substition();
        //nesne2.substitute(2, 1);
        
        //private innerclass
        //Calculator.Multiplication nesne3=c.new Multiplication();
        //nesne3.multiply(1, 2);
        
        int multiplication=Calculator.multiply(2, 3);// 6 - bu methodun içinde class Multiplication var
        System.out.println(multiplication);
        
        System.out.println(c.new Division().divide(1, 0));//1 0 ile bölünemez
        System.out.println(c.new Division().divide(2, 1));//2
        
        System.out.println(new Calculator().new Division().divide(1, 1));//1
    }
    
}
        
class Calculator
{
    static int i=10;
    static private void methodx(){}
    
    
    public static int multiply(int a,int b)//static methodun içinde static olmayan deger yazılamaz
    {
        int a1=1;
        //static int a2=2; herhangi bir method içinde static deger yazılamaz
        //static sınıfa özgü demektir


        Multiplication nesne=new Multiplication();
        return nesne.multiply(a, b);
    }
    
    
    public class Addition
    {
        static final int i=10;//sabit oldugu için olur
        //static int i2; errror
        //static final void method(){}//errror
                      
        public  int add(int n1,int n2 )
        {
            return n1+n2;
        }
    }
    
    private class Substition
    {
        public int substitute(int n1,int n2 )
        {
            return n1-n2;
        }
    }
    private static class Multiplication
    {
        public int multiply(int n1,int n2 )
        {
            return n1*n2;
        }
    }
    
    public class Division
    {
        public String divide(int n1,int n2 )
        {
            if(n2==0)
            {
                System.out.println(n1+" "+n2+" ile bölünemez");
                return "";
            }
            else
                return String.valueOf(n1/n2);
        }
    }
    
    
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" local innerClass ">

class Main_Local
{
    static public void main()
    {
        System.out.println("*********Local Inner Class******");
        local_innerClass nesne=new local_innerClass();
       
        String result=nesne.divide(10, 2);
        if(!result.equals(""))
            System.out.println("Result:"+result);
        
    }
}

class local_innerClass
{
    class asdsaf
    {
        {

        }
    }
    //Local inner class static olmayan inner classların bir diğer türüdür. Bir metot
    //veya bir blogun içinde tanımlanan sınıflara denir.

    /*
    Local inner sınıflar statik olamaz. Local değişken olarak düşünülürse, local
    değişkenler statik olamaz. Ayrıca bu sınıflar static metot veya değişkene de
    sahip olamazlar. Ama istisna olarak static final değerleri saklayabilirler.
     */

    static
    {
        class Division//static  inner member class
        {
            public String divide(int n1,int n2 )
            {
                if(n2==0)
                {
                    System.out.println(n1+" "+n2+" ile bölünemez");
                    return "";
                }
                else
                    return String.valueOf(n1/n2);
            }
        }
    }

    {
        class Division
        {
            public String divide(int n1,int n2 )
            {
                if(n2==0)
                {
                    System.out.println(n1+" "+n2+" ile bölünemez");
                    return "";
                }
                else
                    return String.valueOf(n1/n2);
            }
        }
    }
    
    
    public static String divide(int n1,int n2)//methodun icinde olustruulan class sadece onun icinde kullanılır
    {    
        int a=1;
        //static int w=10;// method static bile olsa, bir methodun içinde static deger atanamz
        //static final int aa=10; //olamaz
        //localda static olamaz yani local class da static olamaz
        //static sınıfa ait demektir.
        {
            //methodda blok olablir
        }
        
        //static{
            //methodda static blok olamaz static classa özgü demektir
        //}
        class Division//static private public protected olamaz çünkü methodun içinde  kullanılacak okadar,final ya da abstract olabilir 
        {
            /*
            Bu sınıflar sadece tanımlandıkları yerde geçerlidir.Bu sınıflar
            tanımlandıkları metotun içinde bulunan değişkenleri kullanabilir.
            Bu sınıfları belirtirken erişim belirleyici kullanılmaz, ama bu sınıfın içinde
            tüm erişim belirleyicilere sahip değişken ve metotlar olabilir.
            Bu sınıflar abstract veya final olabilir, ikisi aynı anda olamaz.
             */

            //static block , member  and local inner classlarda olamaz
            {
                System.out.println(a);//methodun malını class kullanabilir
            }
          
            //static variable and method barındıramaz
            static final int staticFinalVar_of_localInnerClass=10;
            
            public String divide(int n1,int n2 )
            {
                class class_method_localclass_divideMethod_class{}
                
                if(n2==0)
                {
                    System.out.println(n1+" "+n2+" ile bölünemez");
                    return "";
                }
                else
                    return String.valueOf(n1/n2);
                
                //class local_local{} sınıf method sınıf method sınıf olmaz
            }
            
            class class_method_localclass_class
            {
                public void class_method_localclass_class_method ()
                {
                    class class_method_class_class_method_class
                    {
                        public void class_method_class_class_method_class_method ()
                        {
                            class class_method_class_class_method_class_method_class
                            {
                                public void main (){};//bu böyle içiçe devam eder
                            }
                        }
                    }
                }
            }


        }//end of local class
        
        System.out.println("staticFinalVar_of_localInnerClass:"+Division.staticFinalVar_of_localInnerClass);
                
        Division nesne =new Division();
        return nesne.divide(n1, n2);
        
    }//end of method
    

}//end of class

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" Anonymous Inner Class ">

class AnonymousInnerClass
{
    static void AnonymousInnerClass_Method()
    {
        System.out.println("AnonymousInnerClass_Method");
    }
    public void methoddd() { System.out.println("lbfsvlbsjv"); }

    static public void main()
    {
        System.out.println("*****AnonymousInnerClass********");
        calculator2 nesne=new calculator2();
        System.out.println(nesne.add(1, 2));//3
        
        calculator3 nesne2=new calculator3();
        System.out.println(nesne2.add(1, 2));//total:3
        
        calculator2 nesne3=new calculator3();
        System.out.println(nesne2.add(1, 2));//total:3

        /*
         üst sınıfı GeometrikSekil olan bir alt sınıf ve bunun
        nesnesi oluştuurlur ve bu nesne üst sınıf tipindeki değişkene bağlanmış olur.
        Burda da polimorfizm kullanmış oluruz aslında.
        GeometrikSekil nesne = new IsimsizInnerClass() gibi bir durum oldu.
         */

        //AnonymousInnerClass - isimsiz local class superclass'ı calculator2
        calculator2 nesne4=new calculator2()///AnonymousInnerClass LUSTURDUM VE İSTEDİĞİM METHODU OVERRİDE ETTİM
        {
            @Override
            int add(int i, int i2) {
                System.out.print("TOTAL:");
                return super.add(i, i2); //To change body of generated methods, choose Tools | Templates.
            }          
        };
        System.out.println(nesne4.add(1, 4));//AnonymousInnerClass nesnesi ile içindeki add methodunu cagırdım/polimorphism varmış gibi
    
        calculator2 nesne44=new calculator2()///AnonymousInnerClass LUSTURDUM VE İSTEDİĞİM METHODU OVERRİDE ETTİM
        {//buradaki AnonymousInnerClass yukarıdakinden farklıdır.yani her AnonymousInnerClass sadece 1 nesneye sahip olabilir

            @Override
            int add(int i, int i2) {
                return super.add(i, i2); //To change body of generated methods, choose Tools | Templates.
            }
            
        };
        System.out.println(nesne44.add(1, 4));//AnonymousInnerClass nesnesi ile içindeki add methodunu cagırdım/polimorphism varmış gibi




        AbstractClass nesne5=new AbstractClass()
        {
            @Override
            void abstractMethod() {
                System.out.println("AnonymousInnerClass extends AbstractClass and overrode the abstractMethod() into AbstractClass");
            }   

            @Override
            void voidMethod() {
                super.voidMethod(); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public String toString() {
                return super.toString(); //To change body of generated methods, choose Tools | Templates.
            }
            
            void anonymousClassMethod()
            {
                AnonymousInnerClass_Method();
            }
            //inner class static Var static Method ve static final Method içeremez
            static final int i=10;
            
            
        };
        nesne5.abstractMethod();//bu degisikilik nesneye özgüdür
    
        InterfaceStructure nesne6=new InterfaceStructure()
        {
            @Override
            public void interfacePublicAbstractMethod() {
                System.out.println("interfacePublicAbstractMethod");
            }            
        };
        nesne6.interfacePublicAbstractMethod();
    
        AnonymousInnerClass nesne7=new AnonymousInnerClass()//local class yazdım
        {
            @Override
            public String toString() {
                return super.toString(); //To change body of generated methods, choose Tools | Templates.
            }  

            @Override
            public int hashCode() {
                return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
            }
            void method()
            {
                AnonymousInnerClass_Method();          
            }

            
        };
        System.out.println(nesne7.hashCode());//146611050
        System.out.println(nesne7.toString());//javaoop.AnonymousInnerClass$3@8bd1b6a
    }
    

}

//ANONYMOUS CLASS OLMASAYDI YENI BİR SUBCLASS OLUSTURMAK ZORUNDA KALACAKTIM
class InnerClassOFAnonymousClass extends AnonymousInnerClass
{
    @Override
    public void methoddd() {
        System.out.println("overide edildi");
    }
}

/*
Bir sınıf düşünün ve bu sınıftaki bir metotu küçük bir değişiklikle kullanmak istiyoruz.
Böyle bir durumda bu sınıftan kalıtılan bir sınıf yapıp burda metotu override edip,
sonrasında bu yeni sınıf nesnesini kullanmamız gerekirdi.
*/
class calculator2
{
    int add(int i,int i2)
    {
        return i+i2;
    }
    
    interface InnerInterface
    {
        
    }
    
    abstract class InnerAbstractClass
    {
        
    }
}

class calculator3 extends calculator2
{
    @Override
    int add(int i, int i2) {
        System.out.print("total:");
        return super.add(i, i2); //To change body of generated methods, choose Tools | Templates.
    } 
}

abstract class AbstractClass
{
    abstract void abstractMethod();
    void voidMethod(){System.out.println("non-abstract method");}
    
}

interface InterfaceStructure
{
    void interfacePublicAbstractMethod();
}
//Bu sınıflar isimsiz iç sınıf veya statik olmayan iç sınıf olarak adlandırılır.

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" static Inner Class ">

class Main_StaticInnerClass
{
    static public void main()
    {
        outerClasss nesne=new outerClasss();
        nesne.number=11;
        nesne.Method();
        nesne.staticMethod();          
        outerClasss.staticMethod();
        nesne.StaticInstanceNumber=2;  
        outerClasss.StaticInstanceNumber=3;
        
        
        //outerClasss.staticInnerClass nesne=new outerClasss().new staticInnerClass(); errror
        outerClasss.staticInnerClass staticInnerClassNesnesi=new outerClasss.staticInnerClass();//class.staticMethod gibi class.staticClass()
        staticInnerClassNesnesi.InnerClassVar=1;
        staticInnerClassNesnesi.staticInnerClassMethod();
        
        staticInnerClassNesnesi.staticInnerClassStaticVar=6;//kendim yazdım
        staticInnerClassNesnesi.staticInnerClassStaticMethod();//kendim yazdım
        
        
        outerClasss.staticInnerClass.staticInnerClassStaticVar=5;//nesne olusturmaya gerek yok 
        outerClasss.staticInnerClass.staticInnerClassStaticMethod();//class.class.staticVar yada static method

        //bu olay non-static inner classlardaki sitatic attributelericin de ggecerlidir.
        //ClassName.InnerClassName olur
        //ClassName.staticVariable or staticMethod

    }
    
    
}

class outerClasss
{
    int number=10;
    static int StaticInstanceNumber=20;
    
    public void Method(){System.out.println("method");}
    public static void staticMethod(){System.out.println("staticMethod");}

    final class qas{}
    static final class qwer{
        static int a=1;
        static class InnerInnerClass{static int a=2;}
        class dafav{}
    }
    static abstract public class asdf
    {
        //static public inner class olabilir
        //abstract public inner class olabilir
        //aynı anda static abstract public inner class da olabilir
    }
    static public class staticInnerClass
    {
       int InnerClassVar;
       static int staticInnerClassStaticVar;
       
       static public void staticInnerClassStaticMethod(){System.out.println("staticInnerClassMethod");}
       
       static{
           staticInnerClassStaticVar=1;
           //InnerClassVar=1; error
           //number++; static değil direk dış classın field ına ersemez

           outerClasss nesne=new outerClasss();
           nesne.number++;
       }
       void staticInnerClassMethod(){
           //kendi attributelerine ulasır 
            InnerClassVar++;
            staticInnerClassStaticVar++;
            staticInnerClassStaticMethod();
            
            //outerClass'ın sadece static Var ve methodlarına ulasır
            StaticInstanceNumber++;
            staticMethod();
            outerClasss.StaticInstanceNumber++;

            this.InnerClassVar++;
            staticInnerClass.staticInnerClassStaticMethod();

            
            //number++; //errror because it is not static
            //Method(); errror
            outerClasss nesne=new outerClasss();nesne.number++;
            nesne.Method();


            /*
            Inner sınıfı statik olarak belirleyebiliriz. Bu sınıflarda hem statik hem
            statik olmayan metot ve değişkenler bulunabilir.
            Statik inner sınıftan dışardaki sınıfın statik alanlarına erişilebilir, ama
            statik olmayan alanlara erişemeyiz.
            Bir static inner sınıf abstract olabilir, ama statik metotlar abstract olamaz.
            Statik inner sınıflar final olabilir.
             */
       }
    }
    
    void method()
    {
        outerClasss outerClasssNesne=new outerClasss();//bit sınıf kendi içinde kendi nesnesini olusturabilir
        outerClasssNesne.Method();//ama sacmaca gereksiz


       staticInnerClass staticInnerClassnesne=new staticInnerClass();
      
       staticInnerClassnesne.InnerClassVar++;
       staticInnerClassnesne.staticInnerClassStaticVar++;
      
       staticInnerClassnesne.staticInnerClassMethod();
       staticInnerClassnesne.staticInnerClassStaticMethod();
      
       staticInnerClass.staticInnerClassStaticVar++;
       staticInnerClass.staticInnerClassStaticMethod();
       
    }
    
}
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" InnerStaticClassPractice ">


class InnerStaticClassPractice
{
    {
        System.out.println(OuterrClass.StaticInnerClass.ClassA.sfa);
        System.out.println(new OuterrClass.StaticInnerClass().new ClassA().a);

        OuterrClass.StaticInnerClass.ClassA nesneA=new OuterrClass.StaticInnerClass().new ClassA();
        System.out.println(nesneA.a);


        System.out.println(OuterrClass.StaticInnerClass.ClassB.sb);
        System.out.println(new OuterrClass.StaticInnerClass.ClassB().b);

        OuterrClass.StaticInnerClass.ClassB nesneB=new OuterrClass.StaticInnerClass.ClassB();
        System.out.println(nesneB.b);
    }
}
class OuterrClass
{
    static class StaticInnerClass
    {
        class ClassA
        {
            int a=1;
            static final int sfa=2;
        }

        static class ClassB
        {
            int b=3;
            static int sb=4;
        }
    }
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" Generic Class ">

class Generic_Main
{
    static public void main()
    {
        
        System.out.println("*****GENERIC CONSEPT*******");
        String[] names={"emre","duman","komando"};
        Integer[] numbers={1,2,3};
        Character[] chars={'a','b','c'};
        
        PrintStringArray nesnee=new PrintStringArray();
        nesnee.print(names);//buradaki print static deildir
        PrintIntArray.print(numbers);      
        PrintCharArray.print(chars);        
        
        //ANONYMOUS CLASS super classın YINE AYNI tarz  özellikleri tasır,sadece method içleri falan değişir  pratik değil
        PrintStringArray nesne=new PrintStringArray()//ANONYMOUS CLASS'ın nesnesi
        {
            @Override//anonymousda override yapabilmek için methodun non-static olması gerek
                     //override olabilmesi icin yine (String[] array) demek zorundayız ozaman
                     //anonymous class ise yaramıyor
            public void print(String[] array) {
                Arrays.stream(array).forEach(t-> System.out.println(t));
            }
        };
        nesne.print(names);
        
        //SO GENERIC CLASS CONCEPT ARE REQUIRED TO BE USED not to create classes which have diferent data type
        Generic_Main.GenericClass<String> nesne2=new Generic_Main().new GenericClass<String>();
        nesne2.print(names);//type:String'tir
        //nesne2.print(numbers);error
        Generic_Main.GenericClass<Integer> nesne3=new Generic_Main().new GenericClass<>();
        nesne3.print(numbers);//type:Integer'tir
        Generic_Main.GenericClass<Character> nesne4=new Generic_Main().new GenericClass<Character>();
        nesne4.print(chars);//type:Char'tir
        
       
        //static generic inner member class da olustur
        
    }
    

    class GenericClass<wishedClass> //static generic member inner class
    {
       // we can't have static method in a nested inner class
       // because an inner class is implicitly associated with an object
       // of its outer class so it cannot define any static method for itself.
       public void print(wishedClass[] array)
        {
            for(wishedClass i : array)
                System.out.print(i+" ");
        }     
    }
    

    static class PrintStringArray 
    {
        public void print(String[] array)
        {
            for(String i : array)
                System.out.print(i+" ");
            System.out.println("");
        }
        

    }
    
    static class PrintIntArray
    {
        static public void print(Integer[] array)
        {
            for(int i : array)
                System.out.print(i+" ");
            System.out.println("");
        }
    }
    
    static class PrintCharArray
    {
        static public void print(Character[] array)
        {
            for(char i : array)
                System.out.print(i+" ");
            System.out.println("");
        }
    }
}

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Generic Method ">

class GenericMethod
{
    //NOTE: INTERFACES CAN ALSO BE GENERIC.FOR EXP. Comparable<T> interface can take any class as parameter and commit it into its compare(T) method
    public static void main()
    {
        System.out.println("*****GENERIC method CONSEPT*******");
        String[] names={"emre","duman","komando"};
        Integer[] numbers={1,2,3};
        Double[] doubles={1.1,2.2,3.3};
        Character[] chars={'a','b','c'};

        //4 different method by overloading
        print(names);////emre duman komando
        print(numbers);//
        print(chars);//a b c
        print(doubles);
        
        
        genericMethod(names);//emre duman komando 
        genericMethod(numbers);//1 2 3 
        genericMethod(chars);//a b c 
        genericMethod(doubles);//1.1,2.2,3.3

        //classType extends Number dedik
        //genericMethod2(chars);//errror
        genericMethod2(numbers);//1 2 3 
       // genericMethod2(doubles);//Double Numberın altıdır, ama intValue metodu işi bozar
        
       
       genericMethod3(names);
       //genericMethod3(chars);
       
        printt(1);//bunlarda casting problemi cıkmaz
        printt("e");
        printt('e');
       
        /*
        printt2(names);//burada string integer!ın alt sınıfı falan deil oyuzden castingte exception alırız
        printt2(numbers);
        printt2(chars);
        */


        ArrayList<Integer> intArrayList= new ArrayList<Integer>();
        Integer[] intArray={6,7,8};
        for(Object i : intArray)//Integer deseydim casting yapmama gerek yoktu
        {
            intArrayList.add((Integer)i);//i Object olarak geliyor ama intArrayList int degerler tutar
        }
        GenericMethod.NestedInnerStaticGenericClass.genericMethod(intArrayList);
    }
    
    static public void printt(Object i)//polimorphism olayı methodlarda işimizi kolaylastırır
    {
        System.out.println(i);
    }
    
    static public void printOBJECT(Object[] array)//polimorphism olayı methodlarda işimizi kolaylastırır
    {
        for(Object i : array)
            System.out.print(i+" ");
        System.out.println("");    }
    
    static public <classType> void genericMethod(classType[] array)
    {
        for(classType i : array)
             System.out.print(i+" ");
        System.out.println("");
    }
    
    static public <classType extends Number> void genericMethod2(classType[] array)//Number Class is SuperClass of Float Integer Double
    {//farklı farklı sınıflar bu methodu kullansın ama belli bir katagoridekiler kulansın diyorsak extends .... dicez
        for(classType i : array)
             //System.out.print(((Float)i).floatValue()+" ");//java.lang.ClassCastException:
            System.out.println((Integer)i.intValue()+ " ");
        System.out.println("");
    } 
    
    static public <classType extends CharSequence> void genericMethod3(classType[] array)//Number Class is SuperClass of Float Integer Double
    {//String classındaki lenght() methodu CharSequence interface'inden geliyor
     //farklı farklı sınıflar bu methodu kullansın ama belli bir katagoridekiler kulansın diyorsak extends .... dicez

        for(classType i : array)
             System.out.print(i+" ");
        System.out.println("");
    }
    
    
    
    
    

    static public void printt2(Object[] array)//polimorphism olayı methodlarda işimizi kolaylastırır
    {
        for(Object i : array){
            System.out.print(((String)i).length()+" ");//(casting)olamaz der exception verir
            System.out.print(((String)i).contains("1")+" ");///casting)olamaz der exception verir
        }
        //İnteger deger yollarsak patlar polimorphism sistemi
        System.out.println("");
    }  

    
    static public void print(String[] array)
    {
        for(String i : array)
            System.out.print(i+" ");
        System.out.println("");
    }  
    
    static public void print(Integer[] array)
    {
        for(Integer i : array)
            System.out.print(i+" ");
        System.out.println("");
    }

    static public void print(Character[] array)
    {
        for(Character i : array)
            System.out.print(i+" ");
        System.out.println("");
    }
    static public void print(Double[] array)
    {
        for(Double i : array)
            System.out.print(i+" ");
        System.out.println("");
    }

    static public class NestedInnerStaticGenericClass<classType1>
    {
        static public <classType>void genericMethod(List<classType> list)
        {
            list.stream().forEach(t-> System.out.println(t) );
        }
    }

}
// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="ArrayList Generic ">

        class generic_ArrayList
        {
            static public void main()
            {
                ArrayList arraylist=new ArrayList();//public class ArrayList<E> extends AbstractList<E>
                arraylist.add("emre");
                arraylist.add("duman");
                arraylist.add("komando");
                arraylist.add(1);
                arraylist.add(1.1d);
                arraylist.add(1.1f);
                arraylist.add(true);
                System.out.println(arraylist);//[emre, duman, komando, 1, 1.1, 1.1, true]

                for(Object i: arraylist)
                    System.out.println(String.valueOf(i).length());
                /*
                4
                5
                7
                1
                3
                3
                4
                */

                ArrayList<String> arraylist2=new ArrayList <>();//public class ArrayList<E> extends AbstractList<E>
                arraylist2.add("emre");
                arraylist2.add("duman");
                arraylist2.add("komando");

                System.out.println(arraylist2);//[emre, duman, komando]

                arraylist2.stream().forEach(t-> System.out.println(t));
            }
        }


    // </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Veteriner Application ">

        class Animal_Main
        {
            static ANIMAL cat,dog;
            static CUSTOMER customer;
            static VETERINARIAN veterinarian;
            static CITY_VETERINARY city;

            public static void main()
            {
                System.out.println("\n-----------------------------------------CREATE OBJECTS------------------------------------------------------");
                createObject();
                System.out.println("\n-----------------------------------------ADD and SHOW Animals------------------------------------------------");
                addAndShowAnimals();
                System.out.println("\n-----------------------------------------ADD and SHOW Customers----------------------------------------------");
                addAndShowCustomers();
                System.out.println("\n-----------------------------------------ADD and SHOW Veterinarians----------------------------------------------");
                addAndShowVeterinarians();

                System.out.println("----GENERIC CLASS----");
                AllObjects <CITY_VETERINARY> o1 = new AllObjects<>();
                o1.showObject(city);

                AllObjects<CUSTOMER> o2 =new AllObjects<>();
                o2.showAnimals(customer);

            }

            private static void createObject()
            {
                cat=new CAT("Scottish","Dobi",2015,true);
                System.out.println(cat);// - CAT{Breed=cat, Species=Scottish}
                cat.showInformation();//CAT{Breed=cat, Species=Scottish} - Name:Dobi ,Date of birth:2015 ,Enrolled:true

                dog=new DOG("Golden","Scooby",2014,true);
                System.out.println(dog);// - DOG{Name:Scooby ,Date of birth:2014 ,Enrolled:true}
                dog.showInformation();//ANIMAL{Breed=Dog, Species=Golden}DOG{Name:Scooby ,Date of birth:2014 ,Enrolled:true}

                customer=new CUSTOMER("Emre",123456789,"41 Warrender Avenue",3146);
                System.out.println(customer);// - CUSTOMER{Address=41 Warrender Avenue, MemberID=3146}
                customer.introduceYourself();//PERSON{Name=Emre, ID=123456789} - CUSTOMER{Address=41 Warrender Avenue, MemberID=3146}

                veterinarian=new VETERINARIAN("Tubi",123456788,"Istanbul University",4);
                System.out.println(veterinarian);// - VETERINARIAN{Graduated-School=Istanbul University, WorkExperience=4}
                veterinarian.introduceYourself();//PERSON{Name=Tubi, ID=123456788}  - VETERINARIAN{Graduated-School=Istanbul University, WorkExperience=4}

                city= new CITY_VETERINARY("Toronto");

            }

            public static void addAndShowAnimals()
            {
                customer.addAnimalToCustomer(cat);
                customer.addAnimalToCustomer(dog);
                customer.listAnimalsOfCustomer();
            }

            public static void addAndShowCustomers()
            {
                veterinarian.addCustomerToVeterinarian(customer);
                veterinarian.listCustomersOfVeterinarian();
            }
            public static void addAndShowVeterinarians()
            {
                city.addVeterinarianToCity(veterinarian);
                city.listVeterinarians();
            }



        }

        abstract class PERSON
        {
            private String name;
            private int ID;

            public PERSON(String name, int ID) {
                this.name = name;
                this.ID = ID;
            }

            public String getName() {return name;}
            public void setName(String name) {this.name = name; }

            public int getID() { return ID; }
            public void setID(int ID) {this.ID = ID; }

            abstract void introduceYourself();

            @Override
            public String toString() {
                return "PERSON{" + "Name=" + name + ", ID=" + ID + '}';
            }
        }

        class CUSTOMER extends PERSON
        {
            private String address;
            private int memberID;
            private int animalNumber;
            private List<ANIMAL> animalsOfCustomer;

            public CUSTOMER(String name, int ID,String address,int memberID) {
                super(name, ID);
                this.address=address;
                this.memberID=memberID;
                animalsOfCustomer=new ArrayList<>();

            }

            public String getAddress() {return address;}
            public void setAddress(String address) { this.address = address;}

            public int getMemberID() { return memberID;}
            public void setMemberID(int memberID) {this.memberID = memberID; }

            void addAnimalToCustomer(ANIMAL animal)
            {
                System.out.println("***ADDING***");
                animalsOfCustomer.add(animal);animalNumber++;
                System.out.println(animal +" was added for the "+ this.getName()+" customer");
            }
            void listAnimalsOfCustomer()
            {
                System.out.println("***LISTING***");
                for(ANIMAL i: animalsOfCustomer )
                    i.showInformation();
                System.out.println("***Total Animal Number of "+getName()+" is "+ animalNumber);
            }

            @Override
            void introduceYourself() { System.out.println(super.toString()+ this.toString());}

            @Override
            public String toString() {
                return " - CUSTOMER{" + "Address=" + address + ", MemberID=" + memberID + '}';
            }




        }

        class VETERINARIAN extends PERSON
        {
            private String graduatedSchool;
            private int workExperience;
            private int customerNumber;
            private ArrayList<CUSTOMER> customersOfVeterinarians;

            public VETERINARIAN(String name, int ID, String graduatedSchool, int workExperience) {
                super(name, ID);
                this.graduatedSchool=graduatedSchool;
                this.workExperience=workExperience;
                customersOfVeterinarians=new ArrayList<>();
            }

            public String getGraduatedSchool() {return graduatedSchool;}
            public void setGraduatedSchool(String graduatedSchool) {}

            public int getWorkExperience() {return workExperience;}
            public void setWorkExperience(int workExperience) { this.workExperience = workExperience;}

            @Override
            void introduceYourself() {
                System.out.println(super.toString()+this.toString());
            }

            @Override
            public String toString() {
                return " - VETERINARIAN{" + "Graduated-School=" + graduatedSchool + ", WorkExperience=" + workExperience + '}';
            }

            void addCustomerToVeterinarian(CUSTOMER customer)
            {
                System.out.println("***ADDING***");
                customersOfVeterinarians.add(customer);customerNumber++;
                System.out.println(customer+" was added for "+ this.getName()+ " veterinarian!");
            }

            void listCustomersOfVeterinarian()
            {
                System.out.println("***LISTING***");
                for(CUSTOMER i:customersOfVeterinarians)
                    i.introduceYourself();
                System.out.println("***Total Customer Number of "+getName()+" is "+customerNumber);
            }


        }

        abstract class ANIMAL
        {
            private String breed,species,name;
            private int dateOfBirth;
            private boolean enrolled;

            public ANIMAL( String species, String name, int dateOfBirth, boolean enrolled) {
                this.species = species;
                this.name = name;
                this.dateOfBirth = dateOfBirth;
                this.enrolled = enrolled;
            }

            public String getBreed() { return breed; }
            public void setBreed(String breed) {this.breed = breed;}

            public String getSpecies() {return species; }
            public void setSpecies(String species) { this.species = species;}

            public String getName() {return name; }
            public void setName(String name) {this.name = name; }

            public int getDateOfBirth() {return dateOfBirth;}
            public void setDateOfBirth(int dateOfBirth) {   this.dateOfBirth = dateOfBirth;}

            public boolean isEnrolled() {  return enrolled;}
            public void setEnrolled(boolean enrolled) {this.enrolled = enrolled;  }

            abstract void showInformation();

            @Override
            public String toString() {
                return "ANIMAL{" + "Breed=" + breed + ", Species=" + species + '}';
            }
        }

        class CAT extends ANIMAL
        {
            public CAT(String species, String name, int dateOfBirth, boolean enrolled) {
                super(species, name, dateOfBirth, enrolled);
                setBreed("Cat");
            }

            @Override
            void showInformation() {
                System.out.println(super.toString()+this.toString() );
            }

            @Override
            public String toString() {
                return " - CAT{" + "Name:"+this.getName()+" ,Date of birth:"+this.getDateOfBirth()+" ,Enrolled:"+this.isEnrolled() + '}';
            }
        }

        class DOG extends ANIMAL
        {
            public DOG(String species, String name, int dateOfBirth, boolean enrolled) {
                super(species, name, dateOfBirth, enrolled);
                setBreed("Dog");
            }

            @Override
            void showInformation() {
                System.out.println(super.toString()+this.toString() );
            }

            @Override
            public String toString() {
                return " - DOG{" + "Name:"+this.getName()+" ,Date of birth:"+this.getDateOfBirth()+" ,Enrolled:"+this.isEnrolled() + '}';
            }
        }

        class CITY_VETERINARY
        {
            private String city;
            private int veterinarianNumber;
            private ArrayList<VETERINARIAN> veterinariansInCity;

            public CITY_VETERINARY(String city) {
                this.city = city;
                veterinariansInCity =new ArrayList<>();
            }

            public String getCity() { return city;}
            public void setCity(String city) {this.city = city;}

            public void addVeterinarianToCity(VETERINARIAN veterinarian)
            {
                System.out.println("***ADDING***");
                veterinariansInCity.add(veterinarian);veterinarianNumber++;
                System.out.println(veterinarian +" was added in the city of "+ getCity());
            }
            public void listVeterinarians()
            {
                System.out.println("***LISTING***");
                for(VETERINARIAN i : veterinariansInCity )
                    System.out.println(i);
                System.out.println("Total Veterinarian Number of the "+getCity()+" is "+veterinarianNumber);
            }

            @Override
            public String toString() {
                return "CITY_VETERINARY{" + "city=" + city  + '}';
            }


        }

        class AllObjects <T>
        {
            public void showObject(T object){
                System.out.println(object);
            }

            public <T extends CUSTOMER> void showAnimals(T customer)
            {
                customer.listAnimalsOfCustomer();
            }
        }

// </editor-fold>   //Im HERE  // Im Here!!!

  //<editor-fold defaultstate="collapsed" desc="Naming Convention ">

/*
9 - Naming Conventions
Naming conventions make programs more understandable by making them easier to read. They can also give information about the function of the identifier-for example, whether it's a constant, package, or class-which can be helpful in understanding the code.


Identifier Type	Rules for Naming

Packages
The prefix of a unique package name is always written in all-lowercase ASCII letters and should be one of the top-level domain names, currently com, edu, gov, mil, net, org, or one of the English two-letter codes identifying countries as specified in ISO Standard 3166, 1981.
Subsequent components of the package name vary according to an organization's own internal naming conventions. Such conventions might specify that certain directory name components be division, department, project, machine, or login names.

Examples
com.sun.eng
com.apple.quicktime.v2
edu.cmu.cs.bovik.cheese

Classes
Class names should be nouns, in mixed case with the first letter of each internal word capitalized. Try to keep your class names simple and descriptive. Use whole words-avoid acronyms and abbreviations (unless the abbreviation is much more widely used than the long form, such as URL or HTML).	

Examples
class Raster;
class ImageSprite;

Interfaces	
Interface names should be capitalized like class names.

Examples
interface RasterDelegate;
interface Storing;

Methods
Methods should be verbs, in mixed case with the first letter lowercase, with the first letter of each internal word capitalized.

Examples
run();
runFast();
getBackground();

Variables
Except for variables, all instance, class, and class constants are in mixed case with a lowercase first letter. Internal words start with capital letters. Variable names should not start with underscore _ or dollar sign $ characters, even though both are allowed.
Variable names should be short yet meaningful. The choice of a variable name should be mnemonic- that is, designed to indicate to the casual observer the intent of its use. One-character variable names should be avoided except for temporary "throwaway" variables. Common names for temporary variables are i, j, k, m, and n for integers; c, d, and e for characters.

COPY
Copied to ClipboardError: Could not Copy
int             i;
char            c;
float           myWidth;
int             i;
char            c;
float           myWidth;

Constants	
The names of variables declared class constants and of ANSI constants should be all uppercase with words separated by underscores ("_"). (ANSI constants should be avoided, for ease of debugging.)	static final int MIN_WIDTH = 4;

Examples
static final int MAX_WIDTH = 999;
static final int GET_THE_CPU = 1;
*/

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="UsageOfPackages  ">

//JDK 8 DE nODE CLASSLARI VAR
//com.emreduman package ına git


 
// </editor-fold>//watch again JDK 8

  //<editor-fold defaultstate="collapsed" desc="Rational Numbers - create jar file ">

//File>ProjectStructure>Artifacts> click + > JAR >from modules with dependecies>ok>apply>okay
//Build>Build Artifacts>Build
//out folder'ında artifacts diye sub-folder olustu
//yukardaki 3 line'ı projeyi yazdıgım workplacede artifact diye dosya içinde jar file olusturdum
//bu jar  JavaOOP workplace'imde kullanmak için libraries olarak eklemeliyim
//File>ProjectStructure>libraries> clck + > java > jar file'ın oldugu projeye git jarı şeç>apply>okay
//artık external librarieslerde jar file'ım var
//silmek için librarieslere git > click -


// ı creeated a class named RationalNumbers and copied-pasted the codes below into that class
//Then, I created a new RationalNumbersTest class to import RationalNumbers.jar file
class RationalNumbers implements Comparable<RationalNumbers>
{
    private int share,denominator;//pay payda
    List<RationalNumbers> rationalNumbers=new ArrayList<>();
    Scanner scan;
    int firstRNumber,secondRNumber;
    
    
    public RationalNumbers()
    {
        
    }
    public RationalNumbers(int share, int denominator)
    {
        int ebob=ebobBul(share,denominator);// burada her 2sini de positive yaptım
        this.share=(share/ebob);//sadelestirme
        this.denominator=denominator/ebob;//sadelestirme                
    }
        

    @Override
    public String toString() 
    {
        if(this.denominator==0)
            return this.share+"/"+this.denominator+" TANIMSIZDIR!";
        
        if(share/denominator==0)
        {
            if((share>0 && denominator>0) ||  (share<0 && denominator<0)  )
                return String.valueOf(Math.abs(this.share) + "/" +Math.abs(this.denominator) );   
            if((share>0 && denominator<0) ||  (share<0 && denominator>0)  )
                return String.valueOf(this.share + "/" +this.denominator  );           
            if(this.share == 0 && this.denominator != 0 )
                return "Result:0";

        }
        
        if(share/denominator>0)
        {
            if(Math.abs(this.share)> Math.abs(this.denominator) && Math.abs(this.denominator) == 1 )
                return String.valueOf(Math.abs(this.share));
           
            if(Math.abs(this.share)> Math.abs(this.denominator) && Math.abs(this.denominator) != 1 )
                return String.valueOf(Math.abs(this.share) +"/"+Math.abs(this.denominator));
            
            if(Math.abs(this.share)== Math.abs(this.denominator) )
                return "Result: 1";          
            
            
            
        }
   
        if(share/denominator<0)
        {
            
            if(Math.abs(this.share)==Math.abs(this.denominator))
                return "Result:1";
            if(this.denominator==1)
                return String.valueOf(this.share);              
            if(this.denominator==-1)
                return String.valueOf(-1*this.share);
                                
            return this.share + "/" + this.denominator ;

        }
        
       
        
        return "";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.share;
        hash = 71 * hash + this.denominator;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {//equals() methodunu kullanan,cagıran nense=this(p1 diyelim), parametre olarak gelen nesneye(p2 diyelim) esitse true yaz
            return true;
        }
        if (obj == null) {//parametre olan nesne null ise false deger
            return false;
        }
        
        if(!(obj instanceof RationalNumbers))//obj Person2 sınıfın nesnesi ise false deger
            return false;
        
       RationalNumbers nesne=(RationalNumbers)obj;//DOWNCASTING
       return (denominator==nesne.denominator && share==nesne.share);//equals method in this line is overrided in String Class 
    }
    
    private int ebobBul(int share,int denominator)
    {
        int shareAbsoluteValue=Math.abs(share);//ın case of share is negative
        int denominatorAbsoluteValue=Math.abs(denominator);//ın case of share is negative
        int ebob=1;
        
        for(int i=1; i<=shareAbsoluteValue && i<=denominatorAbsoluteValue ; i++)
        {
            if(shareAbsoluteValue % i == 0 && denominatorAbsoluteValue % i == 0)//2 sayıyı da tam bölen sayı ebobtur
            {
                ebob=i;
            }
        }
        
        return ebob;
    }
    
    public void enterNumbers()
    {
        System.out.print("Please Enter Share and Denominator one by one:\nShare:");
        share=scan.nextInt();System.out.print("Denominator:");
        denominator=scan.nextInt();
      
        RationalNumbers fraction=new RationalNumbers(share,denominator);        
        rationalNumbers.add(fraction);
        System.out.println(fraction);

    }
    
    public void showRationalNumbers()
    {
        System.out.println(rationalNumbers);     
    }
   
    public void sortedList(List<RationalNumbers> list)
    {
        List<RationalNumbers> sortedList=new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            sortedList.add(i, list.get(i));
        }
        Collections.sort(sortedList);
        //Collections.sort(sortedList,Collections.reverseOrder());//tamtersi sıralama yaparr
        System.out.println(sortedList);
        System.out.println("size:"+sortedList.size());
    }
    
    public RationalNumbers add(RationalNumbers number)
    {
        int newShare=(this.share*number.denominator)+(this.denominator*number.share);
        int newDeminator=this.denominator*number.denominator;
        
        RationalNumbers result=new RationalNumbers(newShare,newDeminator);
        rationalNumbers.add(result);
        return result;
    }   
    public RationalNumbers substract(RationalNumbers cikarilacakSayi)
    {
        int newShare=(this.share*cikarilacakSayi.denominator)-(this.denominator*cikarilacakSayi.share);
        int newDeminator=this.denominator*cikarilacakSayi.denominator;
        
        RationalNumbers result=new RationalNumbers(newShare,newDeminator);
        return result;
    }  
    public RationalNumbers multiply(RationalNumbers number)
    {
        int newShare=this.share*number.share;
        int newDeminator=this.denominator*number.denominator;
        
        RationalNumbers result=new RationalNumbers(newShare,newDeminator);
        return result;
    }
    public RationalNumbers divide(RationalNumbers number)
    {
        int newShare=this.share*number.denominator;
        int newDeminator=this.denominator*number.share;
        
        RationalNumbers result=new RationalNumbers(newShare,newDeminator);
        return result;
    }
    
    public void transaction(int i)
    {
         boolean goOn=true;
         while(goOn)
         {
            if(rationalNumbers.size()>=2)
            {
                 System.out.println("Total element number of the list is "+rationalNumbers.size()+" .\nWhich elements of list do you want to add?\nSelect first element:");
                 int number=scan.nextInt();System.out.println("\nSelect second element:");
                 int number2=scan.nextInt();

                 if(number>rationalNumbers.size() || number2>rationalNumbers.size())   
                 {
                     System.out.println("You entered wrong  numbers combination!!!\nIf you want to continue  for the transaction(Press 1)\nto quit(Press 0)");
                     goOn=(scan.nextInt()==1 ? true : false);
                 }
                 else
                 {
                     firstRNumber=number-1;
                     secondRNumber=number2-1;
                     switch(i)
                     {
                         case 1:RationalNumbers addition= rationalNumbers.get(firstRNumber).add(rationalNumbers.get(secondRNumber));
                                System.out.println("Result:"+addition);break;
                         case 2:RationalNumbers substraction= rationalNumbers.get(firstRNumber).substract(rationalNumbers.get(secondRNumber));
                                System.out.println("Result:"+substraction);break;
                         case 3:RationalNumbers multiplication= rationalNumbers.get(firstRNumber).multiply(rationalNumbers.get(secondRNumber));
                                System.out.println("Result:"+multiplication);break;
                         case 4:RationalNumbers division= rationalNumbers.get(firstRNumber).divide(rationalNumbers.get(secondRNumber));
                                System.out.println("Result:"+division);break;
                     }
                     
                     System.out.println("If you want to continue  for another transaction(Press 1)\nto quit(Press 0)");
                     goOn=(scan.nextInt()==1 ? true : false);
                 }             
             }

            else
            {
                System.out.println("Any list does not exist!!!");
                goOn=false;
            }
         }  
    }
    
    @Override
    public int compareTo(RationalNumbers o) {
        if(this.substract(o).share>0)//1/2 - 2/2 >0
            //this ilk sayıyı barındıran nesne, o ise 2.sayı
            return -1;//büyük sayı için 1 öne koy
        else if(this.substract(o).share<0)
            return 1;//küçük sayı için -1 al arkaya koy
        else
            return 0; //esitse bir aynı bırak
        
    }
    
    
    public void main()
    {
        scan=new Scanner(System.in);
        boolean goON=true;
        
        while(true)
        {
            System.out.println("-------------------------------------------------\n"
                    + "1. If you want to add a rational number into the list(Press 1)\n"
                    + "2. If you want to display the rational number list(Press 2)\n"
                    + "3. If you want to do transaction with rational numbers from list (Press 3)\n"
                    + "4. If you want to add rational numbers to practice (Press 4)\n"
                    + "5. If you want to display sortedList (Press 5)\n"
                    + "6. If you want to check if 2 numbers are equals to each other (Press 6)\n"
                    + "7. If you want to exit the system (Press 0)");


            switch(scan.nextInt())
            {
                case 0:
                    System.exit(0);break;//to exit

                case 1:
                    goON=true;
                    while(goON)
                    {
                        enterNumbers();
                        System.out.println("Do you wanna go on to enter numbers?(if yes, type true; if no ,type false");
                        goON=scan.nextBoolean();
                    }
                    break;

                case 2:
                    showRationalNumbers(); break;

                case 3:
                    try
                    {
                        System.out.println("1.For Addition - Press 1\n"
                                + "2.For Substraction - Press 2\n"
                                + "3.For Multiplication - Press 3\n"
                                + "4.For Addition - Press 4");
                        int option=scan.nextInt();

                        if(option>0 && option<5 )
                            transaction(option);
                        else
                            System.out.println("Wrong Transaction!!!");

                        break;

                    }
                    catch(Exception e)
                    {

                        System.out.println("Selection is wrong");
                    }

                case 4:
                    RationalNumbers obje=new RationalNumbers(2,4);
                    RationalNumbers obje2=new RationalNumbers(3,4);
                    System.out.println(obje.add(obje2));
                    break;
                
                case 5:
                    sortedList(rationalNumbers);break;
                    
                case 6:
                    if(rationalNumbers.size()>=2)
                    {
                        System.out.print("Please enter the sequence numbers of both rational numbers\nFirst one:");
                        int first=scan.nextInt()-1;System.out.print("\nSecond one:");
                        int second=scan.nextInt()-1;
                        System.out.println(rationalNumbers.get(first).equals(rationalNumbers.get(second)));
                    }
                    else
                        System.out.println("There is no enough number at the list, Back to main menu, add new numbers to compare them!");
                  
                    break;
                default:
                    System.out.println("Wrong Option!!!");break;       
            }
        }
    }
}

    

// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc="Collection">



// </editor-fold>

  //<editor-fold defaultstate="collapsed" desc=" QUESTIONS ">
  
    //<editor-fold defaultstate="collapsed" desc="create your own stack area with arrayList ">

            class stackArea
            {
            public static void main() {

                MyStack myStack = new MyStack();//arrayList olusturuldu.

                Pupil ogr1=new Pupil(10,"emre");    ogr1.setPupilName("dmn");
                Pupil ogr2=new Pupil(20,"hasan");
                Pupil ogr3=new Pupil(30,"ayşe");
                Pupil ogr4=new Pupil(40,"ali");
                Pupil ogr5=new Pupil(50,"duman");

                //ogr1.getPupilName()="emmmre";error - Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - unexpected type
                System.out.println(ogr1.getPupilName());//dmn

                myStack.push(ogr1);
                System.out.println(myStack.getListe().get(0).hashCode()==ogr1.hashCode());// true - aynı alanı temsil ederler//ogr1 ile liste.get(0) aynı referansa sahiptir
                myStack.push(ogr2);
                myStack.push(ogr3);
                myStack.push(ogr4);

                myStack.yazdir();
                /*
                    ************** YIGIN ICERIGI *******************
                    0 indekste :This Student is not Active!!!
                    1 indekste :This Student is not Active!!!
                    2 indekste :This Student is not Active!!!
                    3 indekste :This Student is not Active!!!
                */

                ogr1.setAktivity(true);//statictir değişim sadece nesne içinde değil class'a mal olmustur.yani tüm nesnelerin içi de değişir
                System.out.println(ogr1.getPupilClassroom());//0
                ogr1.setPupilName("EMRE");System.out.println(myStack.getListe().get(0));//pupil{pupilNumber=10, pupilName=EMRE, pupilClassroom=0, aktif=true}
                //myStack.getListe().get(0).setPupilName("qwe");                        //Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - Erroneous sym type: java.lang.Object.setPupilName
                //System.out.println(myStack.getListe().get(0).getPupilClassroom());    //Exception in thread "main" java.lang.RuntimeException: Uncompilable source code - Erroneous tree type: <any>
                //arrayList de arrayler gibi array[0] gibi ifade ile objeye ulasıp object içinden variable cagıramazsın

                myStack.yazdir();
                /*
                    ************** YIGIN ICERIGI *******************
                    0 indekste :pupil{pupilNumber=10, pupilName=EMRE, pupilClassroom=0, aktif=true}
                    1 indekste :pupil{pupilNumber=20, pupilName=hasan, pupilClassroom=0, aktif=true}
                    2 indekste :pupil{pupilNumber=30, pupilName=ayşe, pupilClassroom=0, aktif=true}
                    3 indekste :pupil{pupilNumber=40, pupilName=ali, pupilClassroom=0, aktif=true}
                */



                ArrayList<Pupil> liste2=myStack.getListe();//liste2 ile liste aynı araylist alanını temsil eder
                System.out.println(liste2);//aynısı liste ile
                liste2.set(0, ogr5);
                System.out.println(liste2);//degisti
                System.out.println(myStack.getListe());//degisti aynı  zamanda liste de desişir



                myStack.pop();
                System.out.println(myStack.kacElemanVar()+ " tane eleman var");//3 tane eleman var
                myStack.pop();
                System.out.println(myStack.kacElemanVar()+ " tane eleman var");//2 tane eleman var
                System.out.println(myStack.bosMu());
                System.out.println(myStack.SonelemanGoster());
                myStack.yazdir();
                myStack.pop();
                myStack.pop();
                myStack.pop();
                myStack.yazdir();
                myStack.pop();
                myStack.pop();
                myStack.pop();

            }
        }

        class Pupil extends Object
        {
            private int pupilNumber;
            private String pupilName;
            private byte pupilClassroom;
            static private boolean aktivity;

            public Pupil()
            {
                //1
            }

            public Pupil(int pupilNumber) {//2
                this.pupilNumber = pupilNumber;
            }

            public Pupil(int pupilNumber, String pupilName) {//3
                this(pupilNumber);
                this.pupilName = pupilName;
            }

            public Pupil(int pupilNumber, String pupilName, byte pupilClassroom) {//4
               this(pupilNumber,pupilName);
                this.pupilClassroom = pupilClassroom;
            }
            public Pupil(int pupilNumber, String pupilName, byte pupilClassroom, boolean a) {//5
                this(pupilNumber,pupilName,pupilClassroom);
                Pupil.aktivity = a;
            }


            public int getPupilNumber() {return pupilNumber;}
            public void setPupilNumber(int pupilNumber) {this.pupilNumber = pupilNumber;}

            public String getPupilName() {return pupilName;}
            public void setPupilName(String pupilName) {this.pupilName = pupilName;}

            public byte getPupilClassroom() { return pupilClassroom; }
            public void setPupilClassroom(byte pupilClassroom) { this.pupilClassroom = pupilClassroom; }

            public boolean getAktivity() { return aktivity;}
            public void setAktivity(boolean aktivity) {Pupil.aktivity = aktivity;}

            @Override
            public String toString() {
                if(aktivity==true)
                    return "pupil{" + "pupilNumber=" + pupilNumber + ", pupilName=" + pupilName + ", pupilClassroom=" + pupilClassroom + ", aktif=" + aktivity+ '}';
                else
                    return "This Student is not Active!!!";
            }


        }

        class MyStack
        {
            private ArrayList<Pupil> liste;


            public MyStack(){
                liste = new ArrayList<>();
            }

            public ArrayList<Pupil> getListe() {
                return liste;
            }

            public int kacElemanVar(){
                return liste.size();
            }

            public boolean bosMu(){
                if(liste.size()>0)
                    return false;
                else
                    return true;
                //return liste.isEmpty();
            }

            public Object SonelemanGoster(){
                return liste.get(kacElemanVar() - 1);
            }

            public Object pop(){
                if(kacElemanVar()>0){
                    Object geriyeDondurulecekEleman = liste.get(kacElemanVar() - 1 );
                    liste.remove(kacElemanVar() - 1);
                    return geriyeDondurulecekEleman;
                }else{
                    System.out.println("Yığın boş pop yapılamaz");
                    return null;
                }

            }

            public void push(Pupil eklenecekEleman){
                liste.add(eklenecekEleman);
            }

            public void yazdir(){

                System.out.println("************** YIGIN ICERIGI *******************");
                for(int i=0; i<liste.size() ; i++){

                    System.out.println(i+" indekste :"+ liste.get(i));

                }

            }



        }
    // </editor-fold>


    //<editor-fold defaultstate="collapsed" desc=" QUESTION-1 ">

    class a       
    {  
     
        int a=10,b=1;
        
        public void method()
        {
            
        }
        
    }
    class b extends a
    {
    
        //a=20; error
        int a=20;//zaten a direk class'a import edilemez method içine edilir
        @Override
        public void method()
        {
            b=2;System.out.println(b);//2
            System.out.println(super.b +" "+this.b +" "+ b);
            System.out.println(a);//20
            System.out.println(this.a);//20
            System.out.println(super.a);//10

        }
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-2 ">

        class ASinifi
        {

            public ASinifi()//DEFAULT CONSTRUCTOR
            {
                System.out.println("ASinifi");
            }//constructor en son bu yazdırılır

            public ASinifi(int a )//YAZDIRMAZ
            {
                System.out.println("ASinifi - int a ");
            }

            {//INSTANCE INITIALIZER BLOCK
                System.out.println(11);//Sonra bu
            }

            static {//STATIC INITIALIZER BLOCK - FIRSTLY, STATIC BLOCKS RUN
                System.out.println(1);//ilk bu
            }
        }

        class BSinifi extends ASinifi
        {
            public BSinifi()
            {
                System.out.println("BSinifi");
            }

            public BSinifi(int a )//YAZDIRMAZ
            {
                System.out.println("BSinifi - int a ");
            }

            {
                System.out.println(2);
            }
            static{
                System.out.println(222);
            }
        }

        class CSinifi extends BSinifi
        {
            public CSinifi()
            {
                System.out.println("CSinifi");
            }

            public CSinifi(int a )//YAZDIRMAZ
            {
                System.out.println("CSinifi - int a ");
            }

            static{
                System.out.println(444);
            }
            {
                System.out.println(3);
            }
            static{
                System.out.println(333);
            }
        }
    // </editor-fold>


    //<editor-fold defaultstate="collapsed" desc=" QUESTION-3 ">

class ASinif
{
    String metin = "Sınıf A";
    {
        System.out.println("Asınıf");
    }
}
 
class BSinif extends ASinif
{
    String metin = "Sınıf B";
 
    {
        System.out.println(super.metin);//Sınıf A
        System.out.println("Bsınıf");

    }
}
 
class CSinif extends BSinif
{
    String metin = "Sınıf C";
 
    {
        System.out.println(super.metin);//Sınıf B
        System.out.println("Csınıf");

    }
}
// </editor-fold>


    //<editor-fold defaultstate="collapsed" desc=" QUESTION-4 ">

        class ASinifii
        {
            {
                System.out.println("3");//4
            }
            static
            {
                System.out.println("333");//1
            }

            public ASinifii(){
                System.out.println("A Kurucusu");//5
            }
        }

        class BSinifii extends ASinifii
        {
            {
                System.out.println("2");//6
            }

            static
            {
                System.out.println("222");//2
            }


            public BSinifii(){
                System.out.println("B Kurucusu");//7
            }

        }

        class CSinifii extends BSinifii
        {
            {
                System.out.println("1");//8
            }
            static
            {
                System.out.println("111");//3
            }

            public CSinifii(){
                System.out.println("C Kurucusu");//9
            }
        }
    // </editor-fold> 

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-5 ">

    class Aa
    {
        static void staticMethod()
        {
            System.out.println("AaSinifi");
        }
    }

    class Bb extends Aa
    {
        static void staticMethod()//override edilemez ama yeni bir method atanır
        {
            System.out.println("BbSinifi");
        }
    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-6 ">

        class M
        {
            int i;

            public M(int i)
            {
                this.i = ++i;//11 DEN 12 OLAN PARAMETREDIR,INSTANCE VARIABLE DEGILDIR
            }
        }

        class N extends M
        {
            public N(int i)
            {
                super(++i);
                System.out.println(i);
                System.out.println(super.i);
            }
        }

    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-7 ">

            class X
            {
                int i = 21;

                public X(int j)//15
                {
                    System.out.println(i);//21

                    this.i = j * 5;//15*5=75
                }
            }

            class Y extends X
            {
                public Y(int j)
                {
                    super(j);

                    System.out.println(i);//75

                    this.i = j * 10;//15*10=150
                }
            }
 
            // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-8 ">

            class K
            {
                int m = 222;

                {
                    m = m++;//222

                    System.out.println(m);//222
                }
            }

            class L extends K
            {
                {
                    System.out.println(methodL());
                }

                int methodL()
                {
                    return m-- + --m;//222+220
                }
            }

            // </editor-fold>


    //<editor-fold defaultstate="collapsed" desc=" QUESTION-9 ">

                class T
                {
                    static String metin = "AAA";
                    String m2="m2";
                    String x3="x3";


                    static
                    {
                        metin = metin + "BBB";//AAABBB
                    }

                    {//static instance'lar default instance initializer'ıniçinde compie olurlar
                        metin = "AAABBBb";
                    }

                     {//kalıtımla alınanı sadece bu sınıf için değiştirmek
                        m2="m22";
                        System.out.println(m2);//m22
                        System.out.println(this.x3);//x3
                        String x3="x33"; System.out.println(x3);//x33
                    }
                }

                class R extends T
                {
                    static
                    {
                        metin = metin + "BBBAAA";//AAABBBb+BBBAAA
                    }

                    {
                        System.out.println(metin);//AAABBB
                    }

                    {
                        System.out.println(m2);//m22
                        m2="m222";System.out.println(m2);//m222
                    }
                }
                class J  extends R
                {
                    {
                        System.out.println(m2);//m222
                    }
                }


    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-10 ">

            class Q10
            {
                int i = 1010;

                public Q10()
                {
                    i = i++ + i-- - i;//1010 + 1011 - 1010 =1011
                }

                static int staticMethod(int i)//1011
                {
                    return --i;//1010
                }
            }

            class Q10_2 extends Q10
            {
                public Q10_2()
                {
                    System.out.println(staticMethod(i));//1010
                }
            }

            class Q10_Main
            {
                public static void main()
                {
                    Q10_2 b = new Q10_2();//1010 - Q10_2 den nesne olusturnca üst sınıflarından da olusturulur.
                }
            }

    // </editor-fold>


    //<editor-fold defaultstate="collapsed" desc=" QUESTION-11 ">

            class   Q11
            {
                int i = 1010;
            }

            class Q11_2 extends Q11
            {
                Q11 q;

                public Q11_2(Q11 a)
                {
                    this.q = a;
                }
            }

            class Q11_Main
            {
                public static void main()
                {
                    Q11 a = new Q11();//Q11 classın'da a nesnesi olustu ve i=1010 yazdı

                    Q11_2 b = new Q11_2(a);//Q11_2 de b nesnesi olustu ve i=1010 yazdı ve Q11 clasına ait a nesnesi refer eden q degişkenini a=123445667 barındıryor

                    System.out.println(a.i);//1010

                    System.out.println(b.i);//1010

                    System.out.println(b.q.i);//1010

                    b.q.i = 3232;//b nin  refer ettiği nesnesin  içindeki q nün refer ettiği nesnesi ile a'nın refer ettiği kutu aynı kutudur.

                    System.out.println("--------");

                    System.out.println(a.i);//3232 oldu kutu içi degiştiği için

                    System.out.println(b.i);//1010
                }
            }








    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-12 ">

            class Q12
            {
                static int a, b = 1414;//a=0;

                {//CALISMAYACAK
                    --a;
                }

                {//CALISMAYACAK
                    b++;
                }
            }

            class Q12_Main extends Q12
            {
                static
                {
                    a++;//1
                }

                static
                {
                    --b;//1413
                }

                public static void main()
                {
                    System.out.println(a);// 1 NESNE OLUSTURMA YOK O ZAMAN SUPERCLASS'DAKİ BLOKLAR CALISMAYACAK

                    System.out.println(b);//1413
                }
            }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-13 ">

class Q13
{
    int[] a = new int[5];//HEAP MEMORY'DE a REFERANSLI 5 KUTULU ARRAY OLUSTU
 
    {
        a[0] = 10;//1. KUTUNUN ICI 10 DIGERLERI 0 0 0 0 
    }
}
 
class Q13_Main extends Q13
{
    {
        a = new int[5];//a REFERENCE'I ARTIK YENİ BIR ARRAYI REFER ETMEYE BASLADI YUKARDAKI ÇÖP OLDU
    }
 
    {
        System.out.println(a[0]);//0
    }
 
    public static void main()
    {
        Q13_Main main = new Q13_Main();
    }
}



    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-14 ">

class Q14
{
    static int statikDegisken;//0
 
    static// 1- SUBCLASS NESNE OLUSTURDUGU ICIN BU STATIC BLOK CALISICAK
    {
        statikDegisken++;//1
    }
 
    {//3
        ++statikDegisken;//1
    }
}
 
class Q14_2 extends Q14
{
    static//2
    {
        --statikDegisken;//0
    }

    {//4
        statikDegisken++;//2
    }
}
 
class Q14_Main
{
    public static void main()
    {
        System.out.println(new Q14_2().statikDegisken);// 2 - REFERANSI OLMAYAN NESNE OLUSTURDUM
        System.out.println(Q14_2.statikDegisken);//2
        System.out.println(Q14.statikDegisken);//2
    }
}
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-15 ">

//Q15_2 sinifindan nesne üretilirse statikDegisken ve degisken değerleri sırasıyla ne olur
 
class Q15
{
    static int statikDegisken = 222;
 
    int degisken = 111;
 
    {
        statikDegisken = statikDegisken++ - ++degisken;//110=222-112
    }
}
 
class Q15_2 extends Q15
{
    {
        degisken = statikDegisken-- + --degisken;//221=110+111
    }
}
 
class Q15_Main{
    public static void main() {
        Q15_2 b=new Q15_2();
        System.out.println(b.degisken+" statik:"+Q15_2.statikDegisken);//221 STATIC:109
    }
}
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" TV ">

            class TV_Main
            {
                static Scanner scan =new Scanner(System.in);
                static TV tvObject;//null

                public static void  main()
                {
                    showMenu();
                    boolean systemExit=false;
                    while(systemExit==false)
                    {
                        System.out.println("Type Your Selection:(Return main menu press 8)");
                        int selection=scan.nextInt();
                        switch(selection)
                        {
                            case 1:setUpTV();           break;
                            case 2:turnOnTV();          break;
                            case 3:volumeUP();          break;
                            case 4:volumeDOWN();        break;
                            case 5:changeChannel();     break;
                            case 6:showChannelINFOs();  break;
                            case 7:turnOffTV();         break;
                            case 8:showMenu();          break;
                            case 9:addNewChannel();     break;
                            case 10:showAllTvChannels();break;
                            case 11:showTvInfos();      break;
                            case 0:systemExit=true;    System.out.println("Sistemden çıkılıyor");   break;
                            default: System.out.println("0 ile 9 arasında bir değer giriniz");      break;
                        }
                    }
                }

            //if(tvObject!=null) if a tv object was created


            private static void showTvInfos()
            {
                if(tvObject==null){
                    System.out.println("Firstly, set up TV and creat channels!");

                }
                else{
                    System.out.println(TV.tvObject);//toString()  method is overrided in TV Class
                }
            }

            private static void showAllTvChannels()
            {
                if(tvObject==null){
                    System.out.println("Firstly, set up TV and creat channels!");

                }
                else{
                    TV.ChannelList.stream().forEach(t-> System.out.println(t+" "));
                    System.out.println("");
                    System.out.println(TV.ChannelList);
                }

            }


            private static void showChannelINFOs() {
                if(tvObject!=null){
                    tvObject.showAactiveChannel();
                }else{
                    System.out.println("Firstly, set up TV and creat channels!");
                }
            }

            private static void changeChannel() {
                if(tvObject!=null){
                    System.out.println("Which Channel do you want to open?\n");
                    int desiredChannel = scan.nextInt();
                    tvObject.changeChannel(desiredChannel);
                }else{
                    System.out.println("Firstly, set up TV and creat channels!");
                }
            }

            private static void volumeUP() {
                if(tvObject!=null){
                    tvObject.volumeUP();
                }else{
                    System.out.println("Firstly, set up TV and creat channels!");
                }
            }

            private static void volumeDOWN() {
                if(tvObject!=null){
                    tvObject.volumeDOWN();
                }else{
                    System.out.println("Firstly, set up TV and creat channels!");
                }
            }

            private static void turnOffTV() {
                if(tvObject != null){
                    tvObject.TurnOffTV();
                }else{
                    System.out.println("Firstly, set up TV and creat channels!");
                }
            }

            private static void turnOnTV() {
                if(tvObject != null){
                    tvObject.TurnOnTV();
                }else{
                    System.out.println("Firstly, set up TV and creat channels!");
                }
            }

            private static void setUpTV() {
                if(tvObject==null){
                    scan.nextLine();
                    System.out.println("Enter Brand Name of the TV!");
                    String brand = scan.nextLine();
                    System.out.println("Enter inch size of the TV!");
                    int size = scan.nextInt();
                    tvObject=new TV(brand,size);//I SET UP A TV
                    System.out.println("TV is set up --> "+tvObject);
                }
                else
                {
                    System.out.println("TV is ALREADY set up! --> "+tvObject);
                }

            }

            private static void showMenu() {
                System.out.println("************ MENU ***************");
                System.out.println("0 -- Çıkış\n" +
                        "1 -- Televizyonu Kur \n" +
                        "2 -- Televizyonu Aç\n" +
                        "3 -- Sesini Arttır\n" +
                        "4 -- Sesi Azalt\n" +
                        "5 -- Kanal Değiştir\n" +
                        "6 -- Kanal Bilgisini Goster\n" +
                        "7 -- Televizyon Kapat\n" +
                        "8 -- Menüyü Göster\n"+
                        "9 -- addNewChannel\n"+
                        "10 - showAllTvChannels\n"+
                        "11 - showTvInfos\n"+
                        "0 -- systemExit"
                );
            }

            private static void addNewChannel()
            {
                 if(tvObject != null){
                    tvObject.addNewChannel();
                }else{
                    System.out.println("Firstly, set up TV and creat channels!");
                }
            }





            }


        class TV
        {
            Scanner scan=new Scanner(System.in);
            private String Brand;
            private int Size;
            public static List <Channel> ChannelList ;//composition - Channel data type polimorphism - baska sınıfın nesnesi

            private boolean turnOn;//false
            private int volume;//0
            int activeChannel;//0

            public static TV tvObject;



            public TV(String Brand, int Size) {
                this.Brand = Brand;
                this.Size = Size;
                volume=10;
                activeChannel=1;
                ChannelList=new ArrayList<>();//CHANNELSLIST
                setUpDefaultChannels();//CHANNELS
                tvObject=this;
            }

            public String getBrand() {return Brand;}
            public void setBrand(String Brand) { this.Brand = Brand;}

            public int getSize() {  return Size;}
            public void setSize(int Size) {this.Size = Size;}

            public Scanner getScan() {return scan; }
            public void setScan(Scanner scan) { this.scan = scan;}

            public List<Channel> getChannelList() { return ChannelList;}
            public void setChannelList(List<Channel> ChannelList) {this.ChannelList = ChannelList;}

            public boolean isTurnOn() { return turnOn;}
            public void setTurnOn(boolean turnOn) { this.turnOn = turnOn;}

            public int getActiveChannel() {return activeChannel;}
            public void setActiveChannel(int activeChannel) { this.activeChannel = activeChannel;}


            public void setUpDefaultChannels()
            {
                newsChannel cnn         =new newsChannel("cnn","news",1);         ChannelList.add(cnn);//name,type,no
                newsChannel trtWorld    =new newsChannel("trtWorld","news",2);    ChannelList.add(trtWorld);//name,type,no
                musicChannel powerTürk  =new musicChannel("powerTürk","music",3); ChannelList.add(powerTürk);
                musicChannel joyTürk    =new musicChannel("joyTürk","music",4);   ChannelList.add(joyTürk);
            }

            public void addNewChannel()
            {
                if(turnOn==true)
                {
                    System.out.println("What kind of channel do you want to add?\n(for news press 1)\n(for music press 2)");
                    int option=scan.nextInt();
                    if(option==1 )
                    {
                        Channel newChannel;
                        scan.nextLine();
                        System.out.println("Enter channel's name:");
                        String newChannelName=scan.nextLine();
                        System.out.println("Determine channel's no:");
                        int channelNo=scan.nextInt();

                        if(channelNo<ChannelList.size())
                        {
                            newChannel= new newsChannel(newChannelName,"news",channelNo);
                            ChannelList.add(channelNo-1, newChannel);
                        }
                        else if(channelNo>=ChannelList.size())
                        {
                            newChannel= new newsChannel(newChannelName,"news",channelNo);
                            ChannelList.add(newChannel);
                        }
                    }
                    else if(option==2 )
                    {
                        Channel newChannel;
                        scan.nextLine();
                        System.out.println("Enter channel's name:");
                        String newChannelName=scan.nextLine();
                        System.out.println("Determine channel's no:");
                        int channelNo=scan.nextInt();
                        if(channelNo<ChannelList.size())
                        {
                            newChannel= new newsChannel(newChannelName,"news",channelNo);
                            ChannelList.add(channelNo-1, newChannel);
                        }
                        else if(channelNo>=ChannelList.size())
                        {
                            newChannel= new newsChannel(newChannelName,"news",channelNo);
                            ChannelList.add(newChannel);
                        }
                    }
                }
                else
                    System.out.println("TV is turned off!!!");


            }

            public void TurnOnTV()
            {
                if(turnOn==false){
                    turnOn=true;
                    System.out.println("TV is Turned ON!");}
                else
                    System.out.println("TV is already Turned ON!");
            }

            public void TurnOffTV()
            {
                if(turnOn==true){
                    turnOn=false;
                    System.out.println("TV is Turn OFF!");}
                else
                    System.out.println("TV is already Turned OFF!");
            }

            public void volumeUP()
            {
                if(volume <20 && turnOn==true){
                    volume++;
                    System.out.println("Volume Level :"+volume);
                }
                else if(volume == 20 && turnOn==true){
                    System.out.println("Volume is at max. point, you cannot get it up any more!!!");

                }
                else if(turnOn==false){
                    System.out.println("TV is turned off!!!");
                }
            }

            public void volumeDOWN()
            {
                if(volume > 0 && turnOn==true){
                    volume--;
                    System.out.println("Volume Level :" + volume);
                }
                else if(volume == 0 && turnOn==true){
                    System.out.println("Volume is at min. point, you cannot get it down any more!!!");
                }
                else if(turnOn==false){
                    System.out.println("TV is turned off!!!");
                }

            }

            public void showAactiveChannel()
            {
                if(turnOn==true)
                    System.out.println("Active Channel:"+ChannelList.get(activeChannel-1));
                else
                    System.out.println("Firstly, turn on the TV!!!");
            }

            public void changeChannel(int DesiredChannel)
            {
                if(turnOn==true){
                    if(DesiredChannel != activeChannel){

                        if(DesiredChannel <= ChannelList.size() && DesiredChannel>=0){
                            activeChannel = DesiredChannel;
                            System.out.println("Channel :"+DesiredChannel+" INFO:"+ChannelList.get(activeChannel-1));
                        }else{
                            System.out.println("PLEASE TYPE A PRESENT TV CHANNEL NUMBER");
                        }

                    }else{
                        System.out.println("You are already at "+activeChannel+". channel, changing the channel was not done!");
                    }
                }else{
                    System.out.println("Firstly, turn on the TV!!!");
                }
            }



            @Override
            public String toString() {
                return "TV{" + "Brand=" + Brand + ", Size=" + Size + '}';
            }



        }

        class Channel
        {
            private String channel;
            private int no;

            public Channel(String channel, int no)
            {
                this.channel = channel;
                this.no = no;
            }

            public String getChannel() {return channel; }
            public void setChannel(String channel) {this.channel = channel;}
            public int getNo() {  return no; }
            public void setNo(int no) {  this.no = no;}

            @Override
            public String toString() {
                return "Channel{" + "channel=" + channel + ", no=" + no + '}';
            }



        }

        class newsChannel extends Channel
        {
            private String Type;

            public newsChannel(String channel, String Type, int no)
            {
                super(channel, no);
                this.Type = Type;
            }

            public String getNewsType() {return Type;}
            public void setNewsType(String NewsType) {this.Type = NewsType; }

            @Override
            public String toString() {
                return super.toString()+" newsChannel{" + "Type=" + Type + '}';
            }

        }

        class musicChannel extends Channel
        {
            private String Type;

            public musicChannel(String channel,String Type, int no )
            {
                super(channel, no);
                this.Type=Type;
            }

            public String getMusicType() { return Type;}
            public void setMusicType(String Type) {this.Type = Type;}

            @Override
            public String toString() {
                return super.toString()+" musicChannel{" + "type=" + Type + '}';
            }




        }

    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-16(static inner class) ">

    class Q16
    {
        static int x = 1212;

        static class BSinifi
        {
            static int y = x++;//1212 x:1213

            static class Z
            {
                static int z = y++;//1212 y:1213
            }
        }
    }

    class Q16_Main
    {
        public static void main()
        {
            System.out.println(Q16.x);//1212

            System.out.println(Q16.BSinifi.y);//1212

            System.out.println(Q16.BSinifi.Z.z);//1212
            System.out.println(Q16.x);//1213
        }
    }
        // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" QUESTION-17(LOCAL CLASS) ">
    class Q17
    {
        void metotA()
        {
            class B
            {
                void metotB()
                {
                    System.out.println("Metot B");
                }
            }
        }

        void method()
        {
            //new B().metotB(); ERROR VERIR LOCAL CLASS SADECE METHODA OZGUDUR
        }
    }



        // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-18 ">

    class Q18
    {
        int i = 102;

        {
            i--;//i=101

        }

        public Q18()
        {
            --i;//i=100
        }

        class XYZ
        {
            int i = this.i;//0 this.i demek XYZ içindeki i demek, i ye bir şey etanmamış, default value:0
            //int i=this.i(0);
            {
                i++;//1
            }

            public XYZ()
            {
                ++i;//2
            }
        }
    }

    class Q18_Main
    {
        public static void main()
        {
            Q18 abc = new Q18();

            System.out.println(abc.i);//100

            Q18.XYZ xyz = abc.new XYZ();

            System.out.println(xyz.i);//2

            Q18.XYZ xyz1 = new Q18().new XYZ();

            System.out.println(xyz1.i);//2
        }
    }
        // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-19 ">

    class Q19
    {
        {//2
            System.out.println(1);
        }

        static//1 ve once
        {
            System.out.println(2);
        }

        public Q19()//3
        {
            new Y();
        }

        static class Y
        {
            {//2
                System.out.println(3);
            }

            static
            {//1 and once
                System.out.println(4);
            }
        }
    }

    class Q19_Main
    {
        public static void main()
        {
            Q19 x = new Q19();// 2 1 4 3nesne olusturunca ils static sonra intance block en son constructor calsıır

            Q19.Y y = new Q19.Y();//3
        }
    }
        // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-20 =review questions">

        class IfPractice
        {
            public static void main()
            {
                System.out.println(" \n****QUESTION-20****");
                fibonacci();

                System.out.println("\n``````FACTORIAL````");
                Scanner scan = new Scanner(System.in);
                System.out.println("Sayı giriniz : ");
                long sayi = scan.nextLong();
                long faktoriel = getFaktoriel(sayi);
                System.out.println("Sonuç : " + faktoriel);
                // 5 * 4 * 3 * 2 * 1 = 120

                System.out.println("\n******NEW FACTORIAL****");
                long faktorielYeni = getFaktorielYeni(sayi);
                System.out.println("SonuçYeni : " + faktorielYeni);

                System.out.println("*****SUM OF DIGITS*****");
                System.out.println("bir sayi giriniz");
                int num=scan.nextInt();
                int sonuc=getSum(num);
                System.out.println(sonuc);

                System.out.println("*****GET THE GREATEST ELEMENT OF ARRAY*****");
                int[] array = {12,56,788,4,1,0,999,4};
                int enBuyukSayi = getEnBuyukSayi(array);
                System.out.println("En büyük sayı :" + enBuyukSayi);


                System.out.println("\n---REVERSE OF THE NUMBER----");
                System.out.println("Lütfen sayı giriniz : ");
                int sayi3 = scan.nextInt();
                int ters = getSayininTersi(sayi3);
                System.out.println("Sayının Tersi " + ters);

                System.out.println("\n---POLINDROM----");
                System.out.println(isPolindrom("EdipPide"));//FALSE

                System.out.println("\n---POLINDROM2----");
                System.out.println("Lütfen bir ifade yazınız : ");
                String ifade = scan.nextLine();
                if(getPolindrom(ifade.toLowerCase())) {
                        System.out.println("Polindrom");
                }else {
                        System.out.println("Polindrom Değil");
                }

                System.out.println("\n---POLINDROM NEW----");
                System.out.println("Lütfen bir ifade yazınız : ");
                String ifade2 = scan.nextLine();
                if(getPolindromYeni(ifade2.toLowerCase())) {
                        System.out.println("Polindrom");
                }else {
                        System.out.println("Polindrom Değil");
                }


                System.out.println("\n---GET REVERSE BY USING CHAR ARRAY----");
                System.out.println("Lütfen bir ifade yazınız : ");
                String ifade3 = scan.nextLine();
                char[] array3 = ifade.toCharArray();
                String ters3 = getTersiByArray(array3);
                System.out.println("Tersi : " + ters);

                System.out.println("\n******CHECK IF THE EMAIL ENTERED IS TRUE******");
                System.out.println("Lütfen bir e-mail yazınız : ");
                String email = scan.next();
                boolean dogruMu = getEmailDogruMu(email);
                System.out.println("Email : " +dogruMu);



            }

            private static void fibonacci()
            {
                System.out.println("\n````````FIBONACCI````");
                Scanner scan = new Scanner(System.in);
                System.out.println("Sayı giriniz : ");
                int sayi = scan.nextInt();
                int sayi1 = 0;
                int sayi2 = 1;
                int ilkIkiSayininToplami = 0;
                System.out.print(sayi1+" "+sayi2);
                for(int i = 2; i < sayi ; ++i )
                {
                    ilkIkiSayininToplami = sayi1 + sayi2;     // 0 + 1			1 + 1        1  + 2     2   +  3
                    sayi1 = sayi2 ;							  // sayi1 = 1;		sayi1 = 1    2          3
                    sayi2 = ilkIkiSayininToplami;			  // sayi2 = 1;     sayi2 = 2    3          5
                    System.out.print(" " + ilkIkiSayininToplami);

            }

            }

           private static long getFaktoriel(long sayi)
           {
                if(sayi == 0 || sayi == 1) {
                        return 1;
                }
                long faktoriyel = 1;
                for(int i = 1; i <= sayi ; i++ ) {   //  1  -  5
                        faktoriyel *= i;			//  1*1 = faktoriyel   2*2   2 * 3 = 6    4 * 6 = 24      24 * 5 = 120
                }
                return faktoriyel;
            }

             private static long getFaktorielYeni(long sayi)
           {
                if(sayi == 0 || sayi == 1) {
                        return 1;
                }else {
                        return sayi * getFaktorielYeni(sayi - 1 );
                }
           }

           public static int getSum(int num)
           {
                int sum=0;
                int sonbasamak=0;
                while (num>0){

                        sonbasamak=num%10;
                        sum=sum+sonbasamak;
                        num=num/10;

                }return sum;
            }


           private static int getEnBuyukSayi(int[] array)
           {
                int max = 0;
                for(int i = 0 ; i < array.length ; i++) {
                        if(array[i] > max) {   //  12 > 0       56 > 12      788 > 56    4 > 788   1 > 788    0 > 788    999 > 788   4 > 999
                                max = array[i];	   //  max = 12     max = 56    max  = 788   -------   -------    -------    max = 999   -------
                        }
                }
                return max;
           }

            private static int getSayininTersi(int n)
            {
                //      1654 - 456
                //	4000
                //	500
                //	60
                //      1
                int sonuc = 0;
                while(n>0) {
                        int sayi = n % 10;  	//  4				5		   6
                        n/=10;              	//  65				6		   0
                        sonuc = sonuc*10+sayi;	// 0*10 + 4 = 4;    45	      456
                }
                return sonuc;
            }

            private static String getTersiByArray(char[] array)
            {
                String ters = "";
                for(int i = array.length - 1 ; i >= 0; i--) {
                        ters += array[i];
                }
                return ters;
            }

            private static boolean isPolindrom(String str)
            {
                String ters = "";
                for (int i = str.length()-1; i >= 0; i--) {
                    ters +="" + str.charAt(i);
                }
                return (str.equals(ters));
            }

            private static boolean getPolindrom(String ifade)
            {
                int i = 0;
                int j = ifade.length()-1;
                while(i < j)
                {
                    if(ifade.charAt(i) != ifade.charAt(j)){
                            return false;
                    }

                    i++;
                    j--;
                }
                return true;
            }

            private static boolean getPolindromYeni(String word)
            {
                String wordTers = "";
                boolean ne = false;
                for(int i = word.length()-1; i>=0; i--) {
                        wordTers = wordTers + word.charAt(i);
                }

                if(wordTers.equalsIgnoreCase(word)) {
                    ne = true;
                }
                else {
                    ne = false;
                }
                return ne;
            }

            private static boolean getEmailDogruMu(String email) {

                if(!email.contains("@"))
                        return false;
                if(!email.contains("."))
                        return false;
                if(email.length()<=4)
                        return false;
                String[] array = email.split("@");
                if(array[0].length()<1)
                        return false;
                if(array[1].length()<3)
                        return false;
                if(array.length > 2)
                        return false;
                return true;
            }

        }



    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" var misin=uok musun">

        class OyunaGiris
        {
            /*
             * "Var Mısın Yok Musun ?" oyunu oluşturalım.
             *
             * Oyunun mantığı : 10 tane kutu vardır, ve her kutunun içinde para miktarını gösteren bir sayı vardır.
             * Oyunu oynayan kişinin sahip olduğu bir kutu vardır.
             * Kalan 9 kutuyu sırasıyla açtırır ve her 3 kutu açtığında, yarışmanın sahibi tarafından teklifte bulunulur.
             * Oyuncu isterse teklifi kabul eder, isterse de oyuna devam edip kendi kutusundaki miktarı kazanabilir.
             *
             * Örnek : 10 kutunun içinde rastgele olarak dizilmiş şu şekilde miktarlar olsun.
             *
             * 1. Kutu : 1 TL
             * 2. Kutu : 10 TL
             * 3. Kutu : 500 TL
             * 4. Kutu : 1000 TL
             * 5. Kutu : 5000 TL
             * 6. Kutu : 10000 TL
             * 7. Kutu : 50000 TL
             * 8. Kutu : 100000 TL
             * 9. Kutu : 250000 TL
             * 10. Kutu : 500000 TL
             *
             *
             * Bizim kutumuz 8. kutu olsun.
             *
             * Biz her seferinde kalan 9 kutudan birisini seçip açtıracağız, her üç kutu açtıktan sonra
             * yapımcıdan teklif alacağız. Diyelim ki ilk 3 kutu açıldıktan sonra yapımcı bize 10.000 TL teklif etti,
             * istersek bunu kabul edeceğiz, istemezsek devam edeceğiz.
             *
             * Son kutu kalana kadar devam edebiliyoruz.
             *
             *
             * 1. Adım : Önce 10 farklı para miktarını tutmak için List<Integer> paraListesi
             * 			adında ArrayList oluşturalım ve miktarları ekleyelim.
             *
             * 2. Adım : 10 Tane kutu oluşturalım ve her kutunun içine rastgele bir miktar atayalım.
             * 			 Bu miktarları paraListesi adlı arrayList'imizden alalım.
             * 			 Bunun için Kutu isimli bir class oluşturalım.
             * 			 içerisine kutuNumarasi ve paraMiktari diye iki tane integer oluşturalım.
             *
             *
             * 			 ayrıca paraMiktarını ve kutuNumarasini almak için
             * 			 "getter" methodlarımızı oluşturalım.
             *
             * 			 constructor ile de ayrıca bu iki değişkenin verilerini, obje oluştururken ekleyebilelim.
             *
             * 3. Adım : Kutuları ekleyebilmek, ve kutular üzerinde işlemler yapabilmek için Kutular classı oluşturulım
             * 			 Oluşturduğumuz tüm Kutu nesnelerini Kutular a ekleyelim.
             * 			 Bunun için Kutular class'ı içerisinde çeşitli methodlar oluşturalım.
             * 			 Ayrıca yapımcinin teklifini de bu class içerisinden alalım.
             *
             * 			 public void kutuEkle(Kutu kutu)
             * 			 kalanKutuSayisiniAl()
             * 			 kutulardakiToplamParaMiktari()
             * 			 secilenKutuyuKutularListesindenKaldir(int kutuNumarasi)
             * 			 public String acilmamisKutulariGoster()
             * 			 public void kutuActir(int kutuNumarasi)
             * 			 public int yapimcininTeklifAl(Kutular kutular , int kendiParaMiktarim)
             *
             * 5. Adım : Oyunu başlatalım, kullanıcıdan seçmek istediği kutu numarasını alalım.
             *
             * 6. Adım : Yapimci adında bir tane class class oluşturalım.
             * 			 Yapımcı classından bir tane nesne üretelim ve her 3 kutu açıldığnda
             * 			 kendisinin içerisindeki teklifVer() methodu ile teklif alalım.
             *
             */

            static List<Integer> paraListesi = new ArrayList<>();
            static Scanner scan = new Scanner(System.in);
            static int kutuNumaram , kutumdakiParaMiktari;
            static Kutular kutular = new Kutular();
            public static void main()
            {
                paraListesi.add(1);
                paraListesi.add(10);
                paraListesi.add(500);
                paraListesi.add(1000);
                paraListesi.add(5000);
                paraListesi.add(10000);
                paraListesi.add(50000);
                paraListesi.add(100000);
                paraListesi.add(250000);
                paraListesi.add(500000);
                Collections.shuffle(paraListesi);
                kutulariOlustur();
                System.out.println("     OYUNUMUZA HOŞGELDİNİZ     ");
                System.out.println("Lütfen Kutunuzu Seçiniz : ");
                kutuNumaram = scan.nextInt();     // 2
                kutumdakiParaMiktari = paraListesi.get(kutuNumaram-1);
                System.out.println("Kutu Numaranız : " + kutuNumaram);
                //System.out.println("Kutunuzdaki Para : " + kutumdakiParaMiktari);
                kutular.kendiKutumuKaldir(kutuNumaram);
                kutuSecmeActirma();
            }

            private static void kutuSecmeActirma()
            {
                System.out.println("\nKalan Kutular : " + kutular.acilmamisKutulariGoster());
                System.out.println("\nHangi kutuyu açtırmak istiyorsunuz ? : ");
                int secim = scan.nextInt();
                kutular.kutuActir(secim);
                if(kutular.kalanKutuSayisiniAl() == 7
                                || kutular.kalanKutuSayisiniAl() == 4
                                || kutular.kalanKutuSayisiniAl() == 1)
                {
                    System.out.println("Teklif :" + kutular.teklifAl());
                    System.out.println("*****Kabul Ediyor musun******\n1-Evet\n2-Hayır");
                    int kabul = scan.nextInt();
                    if(kabul == 1)
                    {
                        System.out.println("Oyun Bitti. Kazandığın Para : " + kutular.teklifAl());
                        System.out.println("Kutunda da " + kutumdakiParaMiktari + " TL vardı.");
                    }
                    else
                    {
                        kutuSecmeActirma();
                    }
                }

                else
                {
                    if(kutular.kalanKutuSayisiniAl() > 0 )
                    {
                        kutuSecmeActirma();
                    }

                    else
                    {
                        System.out.println("Oyun Bitti !\nKutundaki Para : "+ kutumdakiParaMiktari);
                    }
                }
            }

            private static void kutulariOlustur()
            {
                for(int i = 0 ; i < 10 ; i++)
                {
                    Kutu kutu = new Kutu();
                    kutu.setKutuNumarasi(i + 1); /// 1 2 3 4 5 6 7 8 9 10
                    kutu.setKutudakiParaMiktari(paraListesi.get(i));
                    // Oluşturduğumuz kutu nesnelerini kutular classın içindeki arrayliste ekledik.
                    kutular.kutuEkle(kutu);
                    //System.out.println("Kutu No : " + ( i + 1 ) + " Para Miktarı : " + paraListesi.get(i));
                }
            }
        }

        class Kutu
        {
            private int kutuNumarasi, kutudakiParaMiktari ;
            public int getKutuNumarasi() {
                    return kutuNumarasi;
            }
            public void setKutuNumarasi(int kutuNumarasi) {
                    this.kutuNumarasi = kutuNumarasi;
            }
            public int getKutudakiParaMiktari() {
                    return kutudakiParaMiktari;
            }
            public void setKutudakiParaMiktari(int kutudakiParaMiktari) {
                    this.kutudakiParaMiktari = kutudakiParaMiktari;
            }
        }

        class Kutular
        {
            private List<Kutu> kutuListesi = new ArrayList<>();  // 10 kutu vardı. 9 8 7 6 5 4 3 2 1
            //    10  9 8 7 6 5 4 3 2 1
            //	bizim
            //    9 8 7 6 5 4 3 2 1
            //    9   7 6 5 4 3 2 1
            //    9   7 6   4 3 2 1
            //        7 6   4 3 2 1
            // 1 2 3 4 5 6 7 8 9 10
            // remove(5-1);
            // 1 2 3 4 6 7 8 9 10
            // remove(7-1)
            public void kutuEkle(Kutu gelenKutu)
            {
                kutuListesi.add(gelenKutu);
            }
            public int kalanKutuSayisiniAl()
            {
                return kutuListesi.size();
            }

            public int kutulardakiToplamPara()
            {
                int toplamPara = 0;
                for(Kutu kutu : kutuListesi)
                {
                    toplamPara +=  kutu.getKutudakiParaMiktari();
                }
                return toplamPara;
            }

            public String acilmamisKutulariGoster()
            {
                String acilmamislar = "";
                for(Kutu kutu : kutuListesi)
                {
                    acilmamislar += " " + kutu.getKutuNumarasi();
                }
                return acilmamislar;
            }

            public void kendiKutumuKaldir(int kutuNumarasi)
            {
                for(Kutu kutu : kutuListesi)
                {
                    if(kutu.getKutuNumarasi() == kutuNumarasi)
                    {
                        kutuListesi.remove(kutu);
                        break;
                    }
                }
            }

            public void kutuActir(int kutuNumarasi)
            {
                for(Kutu kutu : kutuListesi)
                {
                    if(kutu.getKutuNumarasi() == kutuNumarasi) {
                            System.out.println("Kutudaki Para Miktarı : " + kutu.getKutudakiParaMiktari());
                            kutuListesi.remove(kutu);
                            break;
                    }
                }
            }

            public int teklifAl()
            {
                    return kutulardakiToplamPara() / 7;
            }
        }




    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-21 ">

    class PerfectNumber
    {
        /* Perfect Number (Mükemmel sayı)
         * Bir sayının mükemmel olup olmadığını bulan method yazınız.
         * getMukemmelMi(int sayi)
         *  return true/false
         *
         * Mükemmel sayı : bir sayının kendisi hariç bölenlerinin toplamı, kendisine eşitse
         * 		o sayı mükemmeldir.
         * 		örnek :  6 -> 1,2,3 	1+2+3 = 6 = 6 (Mükemmel)
         *
         * süre 3 dk.
         *
         * */
        public static void main()
            {
                Scanner scan = new Scanner(System.in);
                System.out.println("Bir Sayı giriniz: ");
                int num = scan.nextInt();
                System.out.println(getMukemmelMi(num));
        }
        private static boolean getMukemmelMi(int num) {
            int i;
            int count = 0;
            for (i = 1; i <= num/2; i++) {
                if (num % i == 0) {
                    count += i;
                }
            }
            return count == num;
        }
    }

    // </editor-fold>



    //<editor-fold defaultstate="collapsed" desc=" QUESTION-22 ">

        class QUESTIONS
        {
            static public void main()
            {
                Q1.main();
                Q2.main();
                Q3.main();
                Q4.main();
                Q5.main();
            }
            static class Q1
            {
            /* İki farklı Array'i birleştiren ve oluşturduğu yeni Array'i return eden
             * bir method yazınız.
             *
             * getBirlestirilmisArray(int[] array1, int[] array2)
             * 	return yeniArray;
             *
             * [1,2,3] ve [5,6,7]
             *
             * [1,2,3,5,6,7]
             *
             * 3 dk süre verelim.
             *
             * */
            public static void main()
                {
                    int[] array1 = {1,2,3};
                    int[] array2 = {5,6,7};
                    int[] yeniArray = getBirlestirilmisArray(array1,array2);
                    System.out.println(Arrays.toString(yeniArray));
            }

            private static int[] getBirlestirilmisArray(int[] array1, int[] array2)
                {
                    int uzunluk = array1.length + array2.length;
                    int[] yeniArray = Arrays.copyOf(array1, uzunluk);
                    for(int i = 0; i < array2.length ; i++) {
                            yeniArray[array1.length+i] = array2[i];
                    }
                    return yeniArray;
            }
            }

            static class Q2
            {
            /* int ahmetinOkulNumarasi
             *
             * örnek : merhaba java nasilsin
             * çıktı : merhabaJavaNasilsin
             *
             *
             * 5 dk verelim
             * 30 geçe başlayalım.
             *
             * */
            public static void main()
                {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Lütfen method ismini giriniz : ");
                    String isim = scan.nextLine(); // MERHABA java
                    String methodIsmi = getFormataUygunIsim(isim);
                    System.out.println("Normal İsim : " + methodIsmi);
                    System.out.println("Gherkin İsim : " + getGherkinLanguageMethodIsmi(isim));
            }
            private static String getFormataUygunIsim (String isim)
                {
                    String yeniMethodIsmi = "";
                    String[] kelimeler = isim.split(" ");  // [" MERHABA", " java"];
                    System.out.println(Arrays.toString(kelimeler));
                    for(int i = 0; i < kelimeler.length; i++)
                    {
                        String kelime = kelimeler[i].replace(" ", "");
                        if(kelime.length() > 0)
                        {
                            if(i == 0)
                            {
                                yeniMethodIsmi += kelime.toLowerCase(); // "merhaba"
                            }
                            else
                            {
                                String ilkHarf = kelime.substring(0, 1).toUpperCase(); // j J
                                String kalanHarfler = kelime.substring(1,kelime.length()).toLowerCase(); // ava   ava
                                yeniMethodIsmi += ilkHarf;
                                yeniMethodIsmi += kalanHarfler;
                            }
                        }
                    }
                    return yeniMethodIsmi;
            }
            // Kullanıcı elma kelimesini arar -> kullanici_elma_kelimesini_arar
            private static String getGherkinLanguageMethodIsmi(String isim)
                {
                return isim.toLowerCase().replace(" ", "_");
            }
            }

            static public class Q3
            {
            /* Kullanıcının yazmış olduğu kelimenin içerisindeki harfleri, alfabeye göre bir sonraki
             * harf ile değiştiriniz.
             *
             * araba
             * bsbcb
             *
             * arabaz
             * bsbcba
             *
             * 5 dk
             * 9 geçe başlayacağız.
             * */
            public static void main()
                {
                Scanner scan = new Scanner(System.in);
                System.out.println("Lütfen kelimeyi yazınız :");
                String kelime = scan.next();
                String yeniKelime = getYeniKelime(kelime);
                System.out.println(yeniKelime);
            }
            private static String getYeniKelime(String kelime)
                {
                    String yeniKelime = "";
                    for(int i = 0 ; i < kelime.length() ; i++)
                    {
                        char harf = kelime.charAt(i);   /// araba  charAt(0) > a     charAt(1) > b
                        if(harf == 'z')
                                harf = 'a';
                        else if(harf == 'Z')
                                harf = 'A';
                        else
                                harf += 1;
                        yeniKelime += harf;
                    }
                    return yeniKelime;
            }
            }

            static private class Q4
            {
            /* araba -> a 		(String)
             * bebek -> b  e    (String)
             * klavye ->
             *
             * 4 dk
             *
             * 43 geçe başlayalım.
             *
             * */
            public static void main()
                {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Lütfen kelimeyi yazınız :");
                    String kelime = scan.next();
                    String kopyaHarfler = getKopyaHarflerBirinciYol(kelime);
                    System.out.println(kopyaHarfler);
                    String kopyaHarfler2 = getKopyaHarflerIkinciYol(kelime);
                    System.out.println(kopyaHarfler2);
            }
            private static String getKopyaHarflerIkinciYol(String kelime)
                {
                    String kopyaHarfler = "";
                    char[] charArray = kelime.toCharArray();
                    Arrays.sort(charArray);
                    for(int i = 0 ; i < charArray.length - 1 ; i++) {   // aaabr
                            if( charArray[i] == charArray[i+1] ) {
                                    if(!kopyaHarfler.contains(""+charArray[i]))
                                            kopyaHarfler += charArray[i];   // a
                            }
                    }
                    return kopyaHarfler;
            }

            private static String getKopyaHarflerBirinciYol(String kelime)
                {
                    // iki tane bos String olusturalim.
                    String bosString = "";
                    String kopyaHarfler = "";
                    for(int i = 0 ; i < kelime.length() ; i++)
                    {   // araba
                        String harf = ""+kelime.charAt(i);
                        if( !bosString.contains(harf) )
                        {  // false
                            bosString+=harf;			  // arb
                        }
                        else
                        {
                            if(!kopyaHarfler.contains(harf))
                            {
                                kopyaHarfler+=harf;
                            }
                        }
                    }
                    return kopyaHarfler;
            }
            }

            static class Q5
            {
            /* "ab" -> "aba" -> "kaba" -> "kabak" ->
             *
             * 5 dk
             *
             * */
            public static void main()
                {
                    List<String> kelimeler = new ArrayList<>();
                    Scanner scan = new Scanner(System.in);
                    boolean devamMi = true;
                    int siraKimde = 0;
                    int oyunSayisi = 0;
                    while(devamMi) {
                            siraKimde = oyunSayisi % 2 + 1;  // 2.kullanıcı
                            System.out.println(siraKimde +" Kullanıcı kelime yazınız : ");
                            String kelime = scan.next();
                            kelimeler.add(kelime);
                            devamMi = getDevamMi(kelimeler); // false
                            oyunSayisi++; // 1 2 3 4 5 6
                    }
                    int siraBelirle = siraKimde == 1 ? 2 : 1;
                    System.out.println(siraBelirle + ". kullanıcı kazandı.");
                    System.out.println(kelimeler);
            }
            private static boolean getDevamMi(List<String> kelimeler)
                {
                    // yazılan kelime, bir önceki yazılan kelimeyi kapsıyor mu (kaba - kabak)
                    // yazılan kelimenin uzunluğu ile bir önceki kelimenin uzunluğu farkı 1 mi
                    if(kelimeler.size() < 2)
                        return true;

                    String sonKelime = kelimeler.get(kelimeler.size() - 1);
                    String birOncekiKelime = kelimeler.get(kelimeler.size() - 2);

                    if(sonKelime.length() - birOncekiKelime.length() != 1)
                        return false;
                    if(!sonKelime.contains(birOncekiKelime))
                        return false;
                    return true;
            }
            }

        }

    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" java practice questions ">

    class JavaReviewQuestions
    {
        public static void main()
        {
            int input=6;
            faktoryel(input);

            getSubString();
            squareRoot();
            multiplicationTable();

            String input2="AAABBCDD";
            frekans(input2);

            String input3[][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
            printList(input3);

            varargAddition(1,2,3,4);

            String input4 = "ade1r4d3a2";
            numbersInString(input4);


            int input5=65;
            asalCarpan(input5);


        }

        public static void faktoryel(int input)
        {
              /*
             * Pozitif bir tamsayıyı input kabul edip, faktöryelini hesaplayan
             * ve ornekte istenildigi şekilde konsola yazdıran bir METHOD yazınız
             *
             * Ör: Input : 6
             * Output: 6!=6*5*4*3*2*1=720
            */

            System.out.print(input+"!=");
            int sonuc=1;
            for (int i = input; i >1; i--)
            {
                sonuc*=i;
                System.out.print(i+"*");
            }
            System.out.println("1=" + sonuc);
        }


        public static void getSubString()
        {
            /*
             * Kullanıcıdan bir cümle ve bir String isteyin
             * Stringin cümlede kaç defa kullanıldığını bulan
             * ve örnekteki gibi sonuç yazdıran bir program yazın
             * (Büyük harf küçük harf olması önemli değil)
             *
             * Cümle =“Hasan sanayiye gitti” String=“san”
             * output = cümlede 2 tane “san” var.
             *
             *
             */


            Scanner scan= new Scanner(System.in);
            System.out.println("Lutfen bir cumle giriniz");
            String input= scan.nextLine();
            System.out.println("Lutfen bulmak istediginiz String'i yaziniz");
            String arananStr=scan.next();

            int count=0;
            for (int i = 0; i < input.length()-arananStr.length(); i++)
            {
                if (input.substring(i, i+arananStr.length()).equalsIgnoreCase(arananStr))
                {
                    count++;
                }
            }
            System.out.println("Cumlede " + count + " tane " + arananStr + " var.");
        }

        public static void squareRoot()
        {
            /*
             * Kullanıcıdan bir tamsayı isteyip,
             * sayının karekökünü bulan bir program yazınız.
             * Sonuçta, virgülden sonra 3 rakam olmalıdır.
             *
             * Ör : Input =2 Output=1,415
             *      Input =9 Output=3,000
             */
            Scanner scan=new Scanner(System.in);
            System.out.println("Bir sayı giriniz: ");
            int input = scan.nextInt();

            double count = 0;
            for(double i=1; i*i<input; i+=0.001) { // i++==> i=i+1 i=i+0.001==>i+=0.001
                    count=i;

                    }
            System.out.println("karekok= " + count);

            System.out.printf("girdiginiz sayi=%-10d, karekoku %.3f", input,count);


        }


        public static void multiplicationTable()
        {

            /*
             * Kullanıcıdan bir tamsayı isteyip, çarpım tablosu oluşturan bir program yazın
             *
             * Ör : Input =3
             *      Output= 1 2 3
             *              2 4 6
             *              3 6 9
             * Ipucu : printf(%4d) kullanın
             */

            Scanner scan = new Scanner(System.in);
            System.out.println("Bir sayı giriniz: ");

            int input = scan.nextInt();

            for(int i=1;i<=input;i++)
            {
                for(int j=1;j<=input;j++)
                {
                     System.out.printf("%4d", i*j);
            }
                System.out.println("");
            }

        }

        public static void frekans(String input)
        {
            /*
             * Interview sorusu
             * Verilen bir metindeki harflerin frekansını bulup yazdıran bir METHOD yazınız.
             * (Büyük harf-küçük harf ayrımına dikkat edilecek)
             *
             *
             * Input = AAABBCDD
             * output = A3B2C1D2
             */

            int count=0;
            String sonuc="";

            for (int i = 0; i < input.length(); i++)
            {
                for (int j = i; j < input.length(); j++)
                {
                    if (input.substring(i, i+1).equals(input.substring(j, j+1)))
                    {
                        count++;
                    }
                }
                if (sonuc.contains(input.substring(i, i+1)))
                {}
                else
                    sonuc+=input.substring(i, i+1)+count;

                count=0;
            }

            System.out.println(sonuc);
        }


        public static void printList(String input[][])
        {
            /*
            * 2 Boyutlu bir Multidimensional array'i input kabul edip,
            * arraydeki tüm elemanları bir listeye kopyalayan ve
            * harf sırasına göre yazdıran bir METHOD yazınız.
            *
            * Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
            * Output:[Ali, Ayse, Can,Hasan, Suzan, Veli]
            */

            List<String> list = new ArrayList<>();

            for(int i=0;i<input.length;i++)
            {
                for(int j=0;j<input[i].length;j++)
                {
                    list.add(input[i][j]);
                }
            }

            Collections.sort(list);
            System.out.println(list);

        }

        public static void varargAddition(int ...a)
        {
            int sum=0;
             for (int i: a)
                sum+=i;
            System.out.print("sum:"+sum );
        }

        public static void numbersInString(String input)
        {

            /*
             * Bir Stringi input olarak alıp,
             * String içindeki sayıların toplamını veren bir METHOD yazınız
             *
             * Ör: input : ade1r4d3
             *     output : 8
             *     İpucu :     Character.isDigit()
             *                 Integer.valueOf()
             */
            int sum=0;
            for (int i = 0; i < input.length(); i++)
            {
                if(Character.isDigit(input.charAt(i)))
                {
                    sum+= Integer.valueOf(""+input.charAt(i));//"" koyfduk ki charların ascıı degerlerini almasın
                    //Stringe dönustursun
                }
            }
            System.out.println("string icindeki rakamlarin toplami= " + sum);
        }



        static int bolen=0;
        static boolean isAsal=true;

        public static void asalCarpan(int input)
        {
            /*
            Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir METHOD yazınız
            Ör:       Input    : 50
            Bolenler : 2,5,10,20,50
            Asal Bolenler: 2,5
            En buyuk asal carpan: 5
            */
        int asalCarpan=2;
            for (int i = 2; i <= input ; i++)
            {
                if (input%i==0)
                {
                    bolen=i;
                    asalKontrol(bolen);
                    if (isAsal)
                    {
                            asalCarpan=bolen;
                    }
                }
            }
            System.out.println(asalCarpan);
        }

        public static boolean asalKontrol(int bolen) {

            for (int i = 2; i < bolen; i++) {
                if(bolen%i==0) {
                    isAsal=false;
                    break;
                }
            }

        return isAsal;

        }

    }


    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" QUESTION-21 ">


    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" QUESTION-21 ">


    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" QUESTION-21 ">


    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" QUESTION-21 ">


    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc=" QUESTION-21 ">


    // </editor-fold>






// </editor-fold>

// </editor-fold>

//<editor-fold defaultstate="collapsed" desc=" JAVA INTERVIEW QUESTIONS ">

//1) Java "Platform Independent" programlama dilidir.
	//   Yani; herhangi bir platformda yazilan Java kodu diger platformlarda da calisir.
	//   Mesela kodu Mac'de yazdiniz, Windowsda da calisir.
	
	//2) IDE ==> Integrated Development Environment demektir. Eclipse ve IntelliJ piyasada 
	//           kullanilan meshur iki IDE dir.
	
	//3) Constructor ==> Yeni bir object uretilirken Constructor aktive olur ve object'i uretir
	//                   Return type'i yoltur
	//                   Ismi class ismi ile ayni olmalidir
	//                   Object uretmek icin Constructor uretmek zorunda degiliz. Cunku Java 
	//                   her class icin default bir constructor uretmistir.
	//                   Default constructor'lar parametresizdir.
	//                   Biz herhangi constructor urettigimizde default constructor'lar yok olur.
	//                   Constructor'lar overload edilebilir.
	//                   Constructor'lar child class'lardan cagrilabilirler, ama override 
	//                   edilemezler.
	
	
	//4) OOP Concept nedir?
	//                  OOP concept a)Inheritance b)Encapsulation c) Polymorhism
	//                              d)Abstraction e)Interface icerir.
	
	//5) Inheritance nedir?
	//                  Inheritance parent(super class)-child(sub class) iliskisidir.
	//                  A class'i B class'ina extends ederse A child olur, B parent olur
	//                  A class'i B interface'ine implements ederse A child olur, B parent olur
	//                  A interface'i B interface'ina extends ederse A child olur, B parent olur
	//                  Child parent'taki kodlarin public ve protected olanlarini kullanabilir.
	//                  Reusability(Tekrar kullanabilme), short coding(Kodu kisa yazma), 
	//                  maintenance(tamir) faydalari vardir.
	
	//6) Encapsulation nedir?
	//                 Data hiding(Data gizleme) demektir. Data'lar private yapilarak gizlenir.
	//                 Gizlenen data'lar getter() ile okunur, setter() ile update edilir.
	//                 Degistirilmesini istemedigimiz kodlari koruma altina almak icin 
	//                 kullanilir. Maintenance faydasi da vardir.
	//                 Kodun hic degistirilmesini istemiyor sadece okunmasini istiyorsaniz o zaman
	//                 setter() olusturmayiniz.(Immutable class)
    //                 Kodun ne degistirilmesini ne de okunmasini istiyorsaniz o zaman
    //                 getter() da setter() da olusturmayiniz.
	
	//7) Polymorphis nedir?
	//                Polymorphism(Coklu yapi) overloading ve overriding'dir,
	
	//8) Abstract Class nedir?
	//                Abstract class uretmek icin abstract keyword kullanmaliyiz
	//                Abstract class'lardan object uretilemez. (instantiate yapilamaz)
	//                Abstract class'larda hem abstract hem de concrete methodlar bulunabilir
	//                Abstract method'un oldugu class kesinlikle abstract olmalidir.
	//                Abstract methodlarin(body'siz) concrete child'lar tarafindan override
	//                edilme zorunlulugu vardir. Concrete'ler override edilmese de olur.
	//Mutlaka soyle ==> Abstract class'i child class'lari bazi gorevleri yapmak zorunda
	//                  birakmak icin olustururuz.
	
	//
	
	//9) Interface nedir?
	//               Java normalde multiple inheritance'a musaade etmez bu yuzden Abstract
	//               class kullandigimizda multiple inheritance yapamayiz. Fkat bazi projelerde
	//               multiple inheritance kullanmak zorunda kaliriz. Bunu Java bize interface
	//               kullanma hakki vererek halletmistir. Cunku; interface'lere multiple
	//               implements/extends yapilabilir.
	//               Detayleri Eclipse'den bakin
	
	//10) Overloading nedir?
	//               Method ismi ayni tutularak parametreler in sayilari, yerleri veya 
	//               data type'leri degistirilerek methodlar olusturmadir.
	//               Overloading Compile Time'dir yani overloading'de yaptiginiz hata
	//               code yazarken belli olur.
	//               Ayni isme sahip methodlarla farkli islemler yapabilmek icin.
	//               Mesela; substring(4) ve substring(4,7) methodlarinin fonksiyonlari 
	//               esasinda aynidir. Ikisi de bir String'in belli bir bolumunu almaya
	//               yarar. Fakat bazi durumlarda bitis indexini soylemek gerekir bazi durumlarda
	//               gerekmez. Bunun icin parametreleri farklilastiririz. Bu da 
	//               overloading'i dogurur.
	
	//11) Overriding nedir?
	//              Method Signature'a(Method ismi + Parametreler) dokunmuyoruz, sadece body'i
	//              degistiriyoruz. Overriding inheritance olunca olur.
	//              Ayni method'un farkli kullanimlari icin overriding gereklidir.
	//              Animal da ses(){Ses cikarir} ==> Dog(){Havlama} ==> Kedi(){Miyavlama}
	//              Overriding Run Time Error verir.
	
	//12) Array ile ArrayList arasindaki farklar nelerdir?
	                // Array olusturulurken uzunlugu belli edilmek zorundadir 
	                // ve daha sonra uzunluk degistirilemez. Fakat ArrayList'lerde
	                // baslangucta uzunlugu belirtme zorunlulugumuz yok, eleman ekledikce
	                // uzunluk artar, eleman sildikce uzunluk azalir.
	
	//13) String ile StringBuilder arasindaki fark nedir?
	                // String'ler immutable'dir, StringBuilder is mutable'dir.
	                // StringBuilder class'i daha fazla kullanisli methodlara sahiptir.
	                // Mesela; bir String'i tersten yazdirmak icin kullanilan reverse() gibi
        /*
	 * 14) Access Modifier nedir aciklar misiniz?
	 *        Bir class'a, variable'a veya method'a ulasimi dizenler.
	 *        4 tane access modifier vardir. Bunlar;
	 *        1)Public: Herkes ulasabilir
	 *        2)Protected: Ayni package icinden ve farkli package'lerdeki child class'lardan
	 *        ulasilabilinir.
	 *        3)Default(Package Private): Sadece ayni package'den ulasilabilinir
	 *        4)Private: Sadece class icinden ulasilabilinir.
	 *        
	 * 15) Pass by Value ve Pass by Reference ne demektir?
			  	Bir method'a variable yollandiginda Java o variable'in
				kopyasini olusturur ve method'a kopyayi yollar bu yuzden variable'in
				orjinal degeri method calistiktan sonra da ayni kalir.
				//Buna Pass By Value denir.
				
				Pass by Reference'da ise reference'in kopyasi olusturulur ve methoda yollanir
				fakat reference'in kopyasi da kendisi gibi ayni object'i gosterdigi icin orjinal
				deger degisir.
	 * 
	 * 16) *** Abstract Class ile Interface farklari nedir?
	 *         Abstract class'lar multiple inheritance'a musaade etmez, Interface'ler eder.
	 *         Interface'de abstract methodlar olur, concrete methodlar static ve default
	 *         keywordleri ile olusturulur, halbuki abstract class'larda normal concrete
	 *         methodlar bulunabilir.
	 *         Interface'lerin variable'lari public, static, final olmak zorundadir ve initialize
	 *         edilmelidirler. Halbuki abstract class'larda bu zorunluluklarin hicbirisi yoktur
	 *         Bir interface'in parent'i class olamaz, child'i class da olur interface de olur,
	 *         ama abstractlarin child'i da parent'i hem abstract class hem concrete class olur.
​
	 */

    // </editor-fold>


