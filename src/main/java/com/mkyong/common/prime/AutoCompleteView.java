package com.mkyong.common.prime;

import org.primefaces.event.SelectEvent;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class AutoCompleteView {
     
    private String txt1;
    private String txt2;
    private String txt3;
    private String txt4;
    private String txt5;
    private String txt6;
    private String txt7;
    private String txt8;


    public List<String> completeText(String query) {
        List<String> results = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            results.add(query + i);
        }
         
        return results;
    }
     


    public void onItemSelect(SelectEvent event) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Item Selected", (String) event.getObject()));
    }
 
    public String getTxt1() {
        return txt1;
    }
 
    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }
 
    public String getTxt2() {
        return txt2;
    }
 
    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }
 
    public String getTxt3() {
        return txt3;
    }
 
    public void setTxt3(String txt3) {
        this.txt3 = txt3;
    }
 
    public String getTxt4() {
        return txt4;
    }
 
    public void setTxt4(String txt4) {
        this.txt4 = txt4;
    }
 
    public String getTxt5() {
        return txt5;
    }
 
    public void setTxt5(String txt5) {
        this.txt5 = txt5;
    }
 
    public String getTxt6() {
        return txt6;
    }
 
    public void setTxt6(String txt6) {
        this.txt6 = txt6;
    }
 
    public String getTxt7() {
        return txt7;
    }
 
    public void setTxt7(String txt7) {
        this.txt7 = txt7;
    }
 
    public String getTxt8() {
        return txt8;
    }
 
    public void setTxt8(String txt8) {
        this.txt8 = txt8;
    }
 
}