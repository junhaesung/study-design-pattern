package com.haeseong.pattern.factory;

import com.haeseong.pattern.model.*;
import com.haeseong.pattern.model.samsung.*;

public class SamsungFactory implements ElectronicsFactory {
    public Desktop createDesktop() {
        return new AllInOne();
    }

    public Notebook createNotebook() {
        return new Series();
    }

    public Tablet createTablet() {
        return new GalaxyTab();
    }

    public Phone createPhone() {
        return new GalaxyNote();
    }

    public Watch createWatch() {
        return new Gear();
    }
}
