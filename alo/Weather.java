package alo;

public class Weather {
    private int temperature;
    private int fells_like;
    private int humidity;
    private int pressurel;
    private String cloud;
    private int visibility;
    private double percipitation;
    private String weather;
    private String lastupdate;

    private String city[];
    private String wind[];

    public Weather(int temperature, int fells_like, int humidity, int pressurel, String cloud, int visibility, double percipitation, String weather, String lastupdate, String[] city, String[] wind) {
        this.temperature = temperature;
        this.fells_like = fells_like;
        this.humidity = humidity;
        this.pressurel = pressurel;
        this.cloud = cloud;
        this.visibility = visibility;
        this.percipitation = percipitation;
        this.weather = weather;
        this.lastupdate = lastupdate;
        this.city = city;
        this.wind = wind;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getFells_like() {
        return fells_like;
    }

    public void setFells_like(int fells_like) {
        this.fells_like = fells_like;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressurel() {
        return pressurel;
    }

    public void setPressurel(int pressurel) {
        this.pressurel = pressurel;
    }

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public int getVisibility() {
        return visibility;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public double getPercipitation() {
        return percipitation;
    }

    public void setPercipitation(double percipitation) {
        this.percipitation = percipitation;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }
    public String[] getCity() {
        return city;
    }

    public void setCity(String[] city) {
        this.city = city;
    }

    public String[] getWind() {
        return wind;
    }

    public void setWind(String[] wind) {
        this.wind = wind;
    }
}
