package equals_hashcodeMethods;

import java.util.*;

public class Person {

    private Long identityNumber;
    private String name;

    public Person(long i,String n) {
        identityNumber=i;
        name=n;
    }

    public Long getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(Long identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(identityNumber, person.identityNumber) &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityNumber, name);
    }



    public static void main(String[] args)
    {
        Person firstPerson = new Person(1,"A");
        Person secondPerson= new Person(1,"B");
        Person thirdPerson= new Person(2,"C");
        Person fourthPerson= new Person(1,"A");


        List<Person> personList = new ArrayList<Person>();
        personList.add(firstPerson);
        personList.add(secondPerson);
        personList.add(thirdPerson);
        personList.add(fourthPerson);

        Set<Person> personSet = new HashSet<Person>();
        personSet.addAll(personList);

        System.out.println("list size: " + personList.size());
        System.out.println("hash set size: " + personSet.size());

        //equals metodunu da kullanarak eşitlik durumuna bakabiliyorum
        System.out.println(firstPerson==fourthPerson);//false

        System.out.println("is firstPerson equals fourthPerson: " + firstPerson.equals(fourthPerson));//true
        System.out.println(firstPerson.hashCode()==fourthPerson.hashCode());//true

        System.out.println("is firstPerson equals secondPerson: " + firstPerson.equals(secondPerson));
        System.out.println(firstPerson.hashCode()==secondPerson.hashCode());

        //derleyici çıktısı
        //list size: 4
        //hash set size: 3
        //is firstPerson equals fourthPerson: true
        //is firstPerson equals secondPerson: false

        array();
    }

    public static void array()
    {
        //Let us create different integers arrays
        int[] arr1 = new int [] {1, 2, 3, 4};
        int[] arr2 = new int [] {1, 2, 3, 4};
        int[] arr3 = new int [] {1, 2, 4, 3};

        System.out.println("is arr1 equals to arr2 : " +
                Arrays.equals(arr1, arr2)); //is arr1 equals to arr2 : true
        System.out.println(Arrays.hashCode(arr1)==Arrays.hashCode(arr2));//true

        System.out.println(arr1.equals(arr2));//false
        System.out.println(arr1.hashCode()==arr2.hashCode());//false
    }
}
