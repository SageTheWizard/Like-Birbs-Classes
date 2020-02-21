public class Birb {
    // DNA Arrays
    private int[] strength;
    private int[] speed;
    private int[] feathers;
    private int[] color;
    private int[] swimming;

    // Decimal representation of Binary Array
    private int strengthDecimal;
    private int speedDecimal;
    private int feathersDecimal;
    private int colorDecimal;
    private int swimmingDecimal;



    // Traits
    private boolean nocturnal;
    private boolean carniverous;
    private boolean cannibalistic;

    // Food Status
    private boolean hasMeatFood;
    private boolean hasPlantFood;

    // Birb name
    private String name;

    // Generation alive count
    private int generationsAlive;

    public Birb() {
        // I don't think we will use this
    }

    // Customize Birb Constructor (only use on game begin)
    public Birb(int strength, int speed, int feathers, int color, int swimming, boolean[] traits, String name) {

    }
    // Reproduction Constructor (used on each generation)
    public Birb(Birb parent1, Birb parent2) {

    }

    public void incrementGenerationAlive() {
        generationsAlive++;
    }

    // Food Setters / Getters
    public boolean isHasPlantFood() {
        return hasPlantFood;
    }

    public boolean isHasMeatFood() {
        return hasMeatFood;
    }

    public void setHasMeatFood(boolean hasMeatFood) {
        this.hasMeatFood = hasMeatFood;
    }
    public void setHasPlantFood(boolean hasPlantFood) {
        this.hasPlantFood = hasPlantFood;
    }

    // Getters for DNA used in parents for reproduction
    public int[] getStrength() {
        return strength;
    }

    public int[] getSpeed() {
        return speed;
    }

    public int[] getFeathers() {
        return feathers;
    }

    public int[] getColor() {
        return color;
    }

    public int[] getSwimming() {
        return swimming;
    }

    // Getters for Traits for easy calculations / parent reproduction
    public boolean isNocturnal() {
        return nocturnal;
    }

    public boolean isCarniverous() {
        return carniverous;
    }

    public boolean isCannibalistic() {
        return cannibalistic;
    }

    // Getters to easily run calculations from Decimal
    public int getStrengthDecimal() {
        return strengthDecimal;
    }

    public int getSpeedDecimal() {
        return speedDecimal;
    }

    public int getFeathersDecimal() {
        return feathersDecimal;
    }

    public int getColorDecimal() {
        return colorDecimal;
    }

    public int getSwimmingDecimal() {
        return swimmingDecimal;
    }
}
