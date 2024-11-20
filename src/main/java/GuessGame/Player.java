package GuessGame;

public class Player {
    private Integer numb;

    public Integer guess(){
        // Выбираем число от 1 до 9
        Integer numb = (int) (Math.random()*10);
        return numb;
    }
}
