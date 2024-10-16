package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private String dipper;
    private String caterpillars;
    private int powerOfEngine;

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }

    public String getDipper() {
        return dipper;
    }

    public void setDipper(String dipper) {
        this.dipper = dipper;
    }

    public String getCaterpillars() {
        return caterpillars;
    }

    public void setCaterpillars(String caterpillars) {
        this.caterpillars = caterpillars;
    }

    public int getPowerOfEngine() {
        return powerOfEngine;
    }

    public void setPowerOfEngine(int powerOfEngine) {
        this.powerOfEngine = powerOfEngine;
    }
}
