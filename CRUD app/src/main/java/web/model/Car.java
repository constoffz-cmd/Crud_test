package web.model;

public class Car {
    private String model;
    private int series;
    private int yearRelease;

    public Car(String model, int series, int yearRelease) {
        this.model = model;
        this.series = series;
        this.yearRelease = yearRelease;
    }

    public String getModel() {
        return model;
    }

    public int getSeries() {
        return series;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
