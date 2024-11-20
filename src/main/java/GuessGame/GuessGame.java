package GuessGame;

public class GuessGame {
    public void play(){
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        //Загадываем число от 0 до 9
        Integer res = (int)(Math.random()*10);
        System.out.println("Загаданное число"+ res);
        // Получаем результаты игроков
        Integer guess1 = p1.guess();
        Integer guess2 = p2.guess();
        Integer guess3 = p3.guess();
        //
        Boolean isRight1= false;
        Boolean isRight2= false;
        Boolean isRight3= false;

        if (guess1==res){isRight1=true;}
        if (guess2==res){isRight2=true;}
        if (guess3==res){isRight3=true;}

        if(isRight1||isRight2||isRight3){
            if (isRight1){System.out.println("Первый игрок выйграл");}
            if (isRight2){System.out.println("Второй игрок выйграл");}
            if (isRight3){System.out.println("Третий игрок выйграл");}
        } else {
            System.out.println("Никто не угадал");
        }
    }
}
