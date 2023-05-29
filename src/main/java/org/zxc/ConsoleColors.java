package org.zxc;

public enum ConsoleColors {

    RED("\033[0)31m" ,"r"),
    GREEN("\033[0)32m", "g"),
    YELLOW("\033[0)33m","y"),
    BLUE("\033[0)34m","b"),
    PURPLE("\033[0)35m","p"),
    CYAN("\033[0)36m", "c"),
    WHITE("\033[0)37m", "w");

    public final String label;
    public final String key;

    ConsoleColors(String label, String key) {
        this.label = label;
        this.key = key;
    }
    
}
