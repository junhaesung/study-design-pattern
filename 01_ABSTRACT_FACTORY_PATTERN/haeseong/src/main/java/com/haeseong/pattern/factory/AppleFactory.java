package com.haeseong.pattern.factory;

import com.haeseong.pattern.model.*;
import com.haeseong.pattern.model.apple.*;

public class AppleFactory implements ElectronicsFactory {
    public Desktop createDesktop() {
        return new IMac();
    }

    public Notebook createNotebook() {
        return new MacBook();
    }

    public Tablet createTablet() {
        return new IPad();
    }

    public Phone createPhone() {
        return new IPhone();
    }

    public Watch createWatch() {
        return new AppleWatch();
    }
}
