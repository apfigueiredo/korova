package br.com.stribog.korova.model;

/**
 * Created by Aloysio on 21/12/2014.
 */
public class Currency extends KorovaEntity {
    private int fraction;

    public int getFraction() {
        return fraction;
    }

    public Currency(String code, String name, int fraction) {
        this.setCode(code);
        this.setName(name);
        this.fraction = fraction;
    }

    public void setFraction(int fraction) {
        this.fraction = fraction;
    }
}
