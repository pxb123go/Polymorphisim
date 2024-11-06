class Hillstation{
    void location(){
        System.out.println("It is located in: ");
    }
    void Famous(){
        System.out.println("It is Famous for: ");
    }
}
class Manali extends Hillstation{
    void location(){
        System.out.println("It is located in: Himachal Pradesh");
    }
    void Famous(){
        System.out.println("It is Famous for: Hadimba temple and aventure sports");
    }
}
class Mushoorie extends Hillstation{
    void location(){
        System.out.println("It is located in: Uttharakhand");
    }
    void Famous(){
        System.out.println("It is Famous for: educational institutions and aventure sports");
    }
}class program{
    public static void main(String[] args) {
       Hillstation h=new Hillstation();
       Mushoorie M=new Mushoorie();
       Manali n=new Manali();

       h.Famous();
       h.location();
       M.Famous();
       M.location();
       n.Famous();
       n.location();
    }
}