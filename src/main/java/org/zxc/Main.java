package org.zxc;

import java.util.Map;

public class Main {

    private final static String CLEAR_CONSOLE = "\033[H\033[2J";

    public static void main(String[] args) throws InterruptedException {
        Map<Integer, String> zxcMap = CatCollection.getCatMap();
        String currentColor = getLabelByKey(args.length == 0 ? "p" :args[0]);
        for (int i = 0; true; i++) {
            System.out.println(CLEAR_CONSOLE);
            System.out.print(currentColor + zxcMap.get(i % zxcMap.size()));
            Thread.sleep(100L);
        }
    }

    public static String getLabelByKey(String key) {
        for (ConsoleColors color : ConsoleColors.values()) {
            if (color.key.equals(key)) {
                return color.label;
            }
        }
        return ConsoleColors.PURPLE.label;
    }

}
