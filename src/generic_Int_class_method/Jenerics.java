package generic_Int_class_method;



public class Jenerics
{
    public static void main(String args[])
    {
        Integer inums[] = { 3, 6, 2, 8, 6 };
        Character chs[] = { 'b', 'r', 'p', 'w' };

        MyClass<Integer> a = new MyClass<>(inums);
        MyClass<Character> b = new MyClass<>(chs);

        int i1 = a.max();
        System.out.println(i1);

        System.out.println(b.max());
    }
}



interface MinMax<T extends Comparable<T>> //Comparable Interface'ini implement eden
// bir Class Türü kullanmalıyım
{
    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T>
{
    private T[] vals;

    public MyClass(T[] o) {
        vals = o;
    }
    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}

