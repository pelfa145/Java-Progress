package abstracts;

public abstract class enemy {

    String name;

    public void response(){
        String[] afterHit = {"*galupad na", "wa na ga tuyok na", "BANG SUKARAT", "asa nmn ni sya ni lupad oi"};
    }

    public abstract void getResponse();
    public abstract String getRace();
}
