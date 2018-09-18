public class Population {
    private double population;
    private double growthRate;
    private double diff;

    Population(){}

    Population(double p, double g){
        this.population = p;
        this.growthRate = g;
    }

    public double getPopulation() {
        return population;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public double getDiff() {
        return diff;
    }

    public void setGrowthRate(double growthRate) {
        this.growthRate = growthRate;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setDiff(double d){
        this.diff = d;
    }

    public void advance(){
        this.diff = this.population * this.growthRate - this.population;
        this.population = this.population * this.growthRate;
    }
}
