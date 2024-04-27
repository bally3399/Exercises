package exercise;

class Adder extends Arithmetic{
    public static void main(String []args){
        Adder a = new Adder();

        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        System.out.print(add(10,32) + " " + add(10,3) + " " + add(10,10) + "\n");
    }
}

