package com.example.usuario.test.com.test.beans;

import java.io.Serializable;

/**
 * Created by Usuario on 15/03/2018.
 */

public class DireccionDTO implements Serializable{

    private String calle;

    private String CP;

    public DireccionDTO() {
    }

    public DireccionDTO(String calle, String CP) {
        this.calle = calle;
        this.CP = CP;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCP() {
        return CP;
    }

    public void setCP(String CP) {
        this.CP = CP;
    }
}
