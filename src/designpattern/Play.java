package designpattern;

public class Play {
    public int leg = 2;
    private static Play play = null;
    private Play(){

    }

    public void Log(){
        System.out.println(""+leg);
    }
    public static Play getObject(){
        if (play==null){
            play = new Play();
            return play;
        }else
        {
            return play;
        }
    }
}
