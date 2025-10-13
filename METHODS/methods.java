
class Computer{

    public void playmusic(){
        System.out.println("Music Playing..");

    }
    public String getMeApen(int cost){
        if(cost>=10){
         return "Pen";
        }
        return "";

    }

}


public class methods {
    public static void main(String[] args) {
        Computer obj=new Computer();
        obj.playmusic();
        // String a=obj.getMeApen(10);
        System.out.println(obj.getMeApen(2));
}
}
 

