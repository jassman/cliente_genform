/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean;

import com.google.gson.annotations.Expose;
import java.util.ArrayList;

/**
 *
 * @author rafa
 */
public class Form extends Element implements IElement {
    @Expose
    private String action;
    @Expose
    private String method;
    @Expose
    private ArrayList<Element> elements;


    public Form() {
        super.setTag("form");
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }

}
