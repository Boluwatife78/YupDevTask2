package com.example.andriod.yupdevtask2;

import java.util.List;

/**
 * Created by Boluwatife on 7/17/2017.
 */

public class GameData {

    private String gameTitle, gameGenre, vendor;

    public GameData(String gameTitle, String gameGenre, String vendor) {
        this.gameTitle = gameTitle;
        this.gameGenre = gameGenre;
        this.vendor = vendor;
    }



    public String getGameTitle() {
        return gameTitle;
    }

    public void setGameTitle(String gameTitle) {
        this.gameTitle = gameTitle;
    }

    public String getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(String gameGenre) {
        this.gameGenre = gameGenre;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

}
