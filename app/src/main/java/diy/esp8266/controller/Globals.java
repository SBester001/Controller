package diy.esp8266.controller;

public class Globals {

    private static Globals instance;

    private boolean dark;
    private boolean debug;
    private boolean gamepad;

    private Globals() {
        dark = false;
        debug = false;
        gamepad = false;
    }

    public void setDark(boolean dark) {
        this.dark = dark;
    }

    public boolean isDark() {
        return dark;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setGamepad(boolean gamepad) {
        this.gamepad = gamepad;
    }

    public boolean isGamepad() {
        return gamepad;
    }

    public static synchronized Globals getInstance(){
        if(instance==null){
            instance=new Globals();
        }
        return instance;
    }

    public void set
}