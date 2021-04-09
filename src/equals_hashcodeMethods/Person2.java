package equals_hashcodeMethods;

import java.util.*;

public class Person2 {
    private Long identityNumber;
    private String name;

    public Person2(long i,String n) {
        identityNumber=i;
        name=n;
    }



    public static void main(String[] args)
    {
        Person2 firstPerson = new Person2(1,"A");
        Person2 secondPerson= new Person2(1,"B");
        Person2 thirdPerson= new Person2(2,"C");
        Person2 fourthPerson= new Person2(1,"A");


        List<Person2> personList = new ArrayList<>();
        personList.add(firstPerson);
        personList.add(secondPerson);
        personList.add(thirdPerson);
        personList.add(fourthPerson);

        Set<Person2> personSet = new HashSet<Person2>();
        personSet.addAll(personList);

        System.out.println("list size: " + personList.size());
        System.out.println("hash set size: " + personSet.size());

        //equals metodunu da kullanarak eşitlik durumuna bakabiliyorum
        System.out.println("is firstPerson equals fourthPerson: " + firstPerson.equals(fourthPerson));//false
        System.out.println(firstPerson.hashCode()==fourthPerson.hashCode());//false

        System.out.println("is firstPerson equals secondPerson: " + firstPerson.equals(secondPerson));//false
        System.out.println(firstPerson.hashCode()==secondPerson.hashCode());//false

        /*Object Classındaki equals() and hashCode() methods
         public boolean equals(Object obj) {
            return (this == obj);
        }

        public native int hashCode();


         */

        //derleyici çıktısı
        //list size: 4
        //hash set size: 3
        //is firstPerson equals fourthPerson: true
        //is firstPerson equals secondPerson: false


        String s="string";
        System.out.println(s.hashCode());//-891985903


        int i=10;
        //System.out.println(i.hasCode());//error
    }
}

