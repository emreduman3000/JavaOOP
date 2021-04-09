package interface_abstract;

interface Int04
{
    //protected interface Yes
    public interface Yes//interface's all instance methods have to be public
    {
        void show();
    }
}

class Testing3 implements Int04.Yes
{
    public void show()
    {
        System.out.println("show method of interface");
    }
}

class A
{
    public static void main(String[] args)
    {
        Int04.Yes obj;
        Testing t = new Testing();
        obj = t;
        obj.show();
    }
}