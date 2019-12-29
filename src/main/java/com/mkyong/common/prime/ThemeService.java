package com.mkyong.common.prime;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ApplicationScoped
public class ThemeService implements Serializable {
    private List<Theme> themes = init();


//    @PostConstruct
    public List<Theme> init() {
        List<Theme> themeList = new ArrayList<>();
        themeList.add(new Theme(0, "Nova-Light", "nova-light"));
        themeList.add(new Theme(1, "Nova-Dark", "nova-dark"));
        themeList.add(new Theme(2, "Nova-Colored", "nova-colored"));
        themeList.add(new Theme(3, "Luna-Blue", "luna-blue"));
        themeList.add(new Theme(4, "Luna-Amber", "luna-amber"));
        themeList.add(new Theme(5, "Luna-Green", "luna-green"));
        themeList.add(new Theme(6, "Luna-Pink", "luna-pink"));
        themeList.add(new Theme(7, "Omega", "omega"));
        return themeList;
    }
     
    public List<Theme> getThemes() {
        return themes;
    } 
}