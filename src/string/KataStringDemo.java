package string;

public class KataStringDemo {

    static int ka = 0;

    public static void pigLaatin(String str){

        String sts[] = str.split(" ");
        String tr = "";
        for(String s : sts){
            int i   ;
            if(s.length() == 1){
                i = s.charAt(0);
                if(i < 65 || i > 90 ||  i < 97 || i > 122){
                    tr = tr + s + " ";
                }
            }else{
                tr = tr + s.substring(1, s.length()) + s.charAt(0) + "ay ";
            }

        }
        System.out.println(tr+":"+tr.length());
        tr = tr.substring(0, tr.length() - 1);
        System.out.println(tr+":"+tr.length());

    }


    public static void main(String[] agrs){
        String str = "Pig latin is cool";
        pigLaatin(str);
        K k = new K();
        k.t2();
    }

}

class K extends KataStringDemo{
    int i = 10;


    public void t2(){
        K.A ka = new K.A();
        new K(){

        };
    }


    public void t1(){
        //局部内部类，只能在方法中访问
        class T{

        }
    }





    //成员内部类，可以用private 、protected 、public 、 static修饰
    protected class A{
        int i = 0;

        public A(){
            System.out.println(i);
            System.out.println(K.this.i);
        }
    }

}

