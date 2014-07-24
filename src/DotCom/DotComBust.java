package DotCom;


import java.util.ArrayList;

public class DotComBust {

    private GameHelper Helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame(){
        DotCom One = new DotCom();
        One.setName("Pets.com");
        DotCom Two = new DotCom();
        Two.setName("eToys.com");
        DotCom Three = new DotCom();
        Three.setName("Go2.com");
        dotComList.add(One);
        dotComList.add(Two);
        dotComList.add(Three);

        System.out.println("Ваша цель - потопить три сайта");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за минимальное количество ходов");

        for (DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = Helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying(){
        while(!dotComList.isEmpty()) {
            String userGuess = Helper.getUserInput("Сделайте ход");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "Мимо";
        for(DotCom dotComTest : dotComList) {
            result = dotComTest.checkYourself(userGuess);
            if(result.equals("Попал")) {
                break;
            }
            if(result.equals("Потопил")) {
                dotComList.remove(dotComTest);
                break;
            }
        }
        System.out.println(result);
    }

    private  void finishGame() {
        System.out.println("Все сайты ушли ко дну!");
        if (numOfGuesses <= 18) {
            System.out.println("Это заняло у вас всего " + numOfGuesses + "попыток");
        }else {
            System.out.println("Это заняло у вас довольно много времени " + numOfGuesses + "попыток");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
