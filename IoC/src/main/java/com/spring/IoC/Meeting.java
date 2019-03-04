package com.spring.IoC;

import java.util.List;

public class Meeting {
    private String theme;
    private List<Boss> boss;
    public Meeting(String theme, List<Boss> boss) {
        this.theme = theme;
        this.boss = boss;
    }

    public Meeting() {
        super();
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getBoss() {
        return boss;
    }

    public void setBoss(List<Boss> boss) {
        this.boss = boss;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", boss=" + boss +
                '}';
    }
}
