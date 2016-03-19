package DZ_16.Clone.Clone_1.CloneRazbor;

public class MyData implements Cloneable{

        @Override
        public MyData clone() throws CloneNotSupportedException{
            MyData obj = (MyData)super.clone();
            return obj;
        }

    public static void main(String[] args) throws CloneNotSupportedException {

        MyData data1 = new MyData();
        MyData data2 = data1.clone();
        System.out.println("data2 = " + data1);
    }
    }

