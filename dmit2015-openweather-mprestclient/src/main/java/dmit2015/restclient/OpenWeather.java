
package dmit2015.restclient;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jakarta.annotation.Generated;
import jakarta.json.bind.annotation.JsonbProperty;
import jakarta.json.bind.annotation.JsonbPropertyOrder;
import jakarta.json.bind.annotation.JsonbTransient;

@JsonbPropertyOrder({
    "coord",
    "weather",
    "base",
    "main",
    "visibility",
    "wind",
    "rain",
    "clouds",
    "dt",
    "sys",
    "timezone",
    "id",
    "name",
    "cod"
})
@Generated("jsonschema2pojo")
public class OpenWeather {

    @JsonbProperty("coord")
    private dmit2015.restclient.Coord coord;
    @JsonbProperty("weather")
    private List<dmit2015.restclient.Weather> weather;
    @JsonbProperty("base")
    private String base;
    @JsonbProperty("main")
    private Main main;
    @JsonbProperty("visibility")
    private Integer visibility;
    @JsonbProperty("wind")
    private dmit2015.restclient.Wind wind;
    @JsonbProperty("rain")
    private dmit2015.restclient.Rain rain;
    @JsonbProperty("clouds")
    private dmit2015.restclient.Clouds clouds;
    @JsonbProperty("dt")
    private Integer dt;
    @JsonbProperty("sys")
    private dmit2015.restclient.Sys sys;
    @JsonbProperty("timezone")
    private Integer timezone;
    @JsonbProperty("id")
    private Integer id;
    @JsonbProperty("name")
    private String name;
    @JsonbProperty("cod")
    private Integer cod;
    @JsonbTransient
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonbProperty("coord")
    public dmit2015.restclient.Coord getCoord() {
        return coord;
    }

    @JsonbProperty("coord")
    public void setCoord(dmit2015.restclient.Coord coord) {
        this.coord = coord;
    }

    @JsonbProperty("weather")
    public List<dmit2015.restclient.Weather> getWeather() {
        return weather;
    }

    @JsonbProperty("weather")
    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @JsonbProperty("base")
    public String getBase() {
        return base;
    }

    @JsonbProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    @JsonbProperty("main")
    public Main getMain() {
        return main;
    }

    @JsonbProperty("main")
    public void setMain(Main main) {
        this.main = main;
    }

    @JsonbProperty("visibility")
    public Integer getVisibility() {
        return visibility;
    }

    @JsonbProperty("visibility")
    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    @JsonbProperty("wind")
    public Wind getWind() {
        return wind;
    }

    @JsonbProperty("wind")
    public void setWind(Wind wind) {
        this.wind = wind;
    }

    @JsonbProperty("rain")
    public Rain getRain() {
        return rain;
    }

    @JsonbProperty("rain")
    public void setRain(Rain rain) {
        this.rain = rain;
    }

    @JsonbProperty("clouds")
    public Clouds getClouds() {
        return clouds;
    }

    @JsonbProperty("clouds")
    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    @JsonbProperty("dt")
    public Integer getDt() {
        return dt;
    }

    @JsonbProperty("dt")
    public void setDt(Integer dt) {
        this.dt = dt;
    }

    @JsonbProperty("sys")
    public Sys getSys() {
        return sys;
    }

    @JsonbProperty("sys")
    public void setSys(Sys sys) {
        this.sys = sys;
    }

    @JsonbProperty("timezone")
    public Integer getTimezone() {
        return timezone;
    }

    @JsonbProperty("timezone")
    public void setTimezone(Integer timezone) {
        this.timezone = timezone;
    }

    @JsonbProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonbProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonbProperty("name")
    public String getName() {
        return name;
    }

    @JsonbProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonbProperty("cod")
    public Integer getCod() {
        return cod;
    }

    @JsonbProperty("cod")
    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
