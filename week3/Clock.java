package week3;

public class Clock{
    public static void main(String[] args){
        ClockDisplay n = new ClockDisplay(13,55);
        n.timeTick();
        System.out.println(n.getTime());
    }
}