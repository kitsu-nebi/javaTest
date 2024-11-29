package GuessGame;

public class Player {
    public Integer guess(){
        // Выбираем число от 1 до 9
        int numb = (int) (Math.random()*10);
        return numb;
    }
}
