package Player;


public class Human extends Player{
    public Human(String playerName) {
        super(playerName);
    }

    @Override
    public void processResult(int result) {

    }

    @Override
    public String chooseWord() {
        return null;
    }

    @Override
    public char giveLetter() {
        return 0;
    }

    @Override
    public char putMark() {
        return 0;
    }



}
