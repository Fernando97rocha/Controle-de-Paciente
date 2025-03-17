package model;


public class Pacient {

    String alias;
    String pacientCase;
    String day;
    String hour;

    public String getApelido() {
        return alias;
    }

    public void setApelido(String apelido) {
        this.alias = apelido;
    }

    public String getPacientCase() {
        return pacientCase;
    }

    public void setPacientCase(String pacientCase) {
        this.pacientCase = pacientCase;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
