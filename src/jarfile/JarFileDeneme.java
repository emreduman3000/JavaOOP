package jarfile;

import rationalnumber.RationalNumbers;

public class JarFileDeneme extends RationalNumbers{//JDK 8-11-14 DOES NT MATTER
    public static void main(String[] args) {//main + enter

        RationalNumbers rs01=new RationalNumbers(1,2);
        RationalNumbers rs02=new RationalNumbers(1,2);

        RationalNumbers sum=rs01.add(rs02);
        System.out.println(sum.toString());

    }

    @Override
    //bunun icin extends yaptım,otherwise ı dont have extend RationalNumber Class to use itself
    public RationalNumbers add(RationalNumbers number) {
        return super.add(number);
    }
}
