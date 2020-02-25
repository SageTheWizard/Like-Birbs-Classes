import java.util.ArrayList;

public class Enviorment {
    // Birb Population
    private ArrayList<Birb> birbs;
    // Death and Birth log
    private BirbLog log;
    // Environment information
    private int predatorTypes;
    private int landType;
    private int vegFoodAmount;
    private int meatFoodAmount;
    private boolean hasWater;
    private int temperature;
    // Generations Passed Counter
    private int generationNum;

    public Enviorment(ArrayList<Birb> initPopulation, int envType) {
        birbs = new ArrayList<>(initPopulation);
        log = new BirbLog();

        /*
         *   Enviorment type key :
         *         1. Standard
         *         2. Desert
         *         3. Snow
         *         4. Island
         */
        switch (envType) {
            case(1):
                predatorTypes    = 1;
                landType         = 1;
                vegFoodAmount    = 20;
                meatFoodAmount   = 20;
                hasWater         = false;
                temperature      = 20;
                generationNum    = 0;
                break;
            case(2):
                predatorTypes    = 2;
                landType         = 2;
                vegFoodAmount    = 5;
                meatFoodAmount   = 10;
                hasWater         = false;
                temperature      = 30;
                generationNum    = 0;
                break;
            case (3):
                predatorTypes    = 2;
                landType         = 3;
                vegFoodAmount    = 5;
                meatFoodAmount   = 20;
                hasWater         = false;
                temperature      = 5;
                generationNum    = 0;
            case (4):
                predatorTypes    = 3;
                landType         = 4;
                vegFoodAmount    = 30;
                meatFoodAmount   = 5;

        }
    }

    public void rabbitsEat() {

    }

    public void strongRabbitsTakeFood() {

    }

    public void rabbitsStarve() {

    }

    public void predatorsEat() {

    }

    public void rabbitsTemperature() {

    }

    public void rabbitsDrown() {

    }

    public boolean enoughToReproduce() {
        return true;
    }

    public void rabbitsReproduce() {

    }

    public boolean allDead() {
        return true;
    }

    public void rabbitShuffle() {

    }

    public void increaseAliveTime() {

    }

    public void /*Might need to be not void */ displayStats() {

    }

    public BirbLog getLogs() {
        return log;
    }

    public void clearLogs() {

    }


}
