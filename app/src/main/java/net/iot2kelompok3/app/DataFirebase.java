package net.iot2kelompok3.app;

public class DataFirebase {
    String led;
    String suhu;
    String fan;
    String flame;
    String buzzer;
    String ldr;

    public DataFirebase() {
    }
    public String getLed(){
        return led;
    }

    public String getSuhu(){
        return suhu;
    }

    public String getFan(){
        return fan;
    }

    public String getFlame(){
        return flame;
    }

    public String getBuzzer(){return buzzer;}

    public String getLdr(){return ldr;}
}
