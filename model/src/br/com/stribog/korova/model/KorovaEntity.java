package br.com.stribog.korova.model;

/**
 * Created by Aloysio on 21/12/2014.
 */
public abstract class KorovaEntity {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
