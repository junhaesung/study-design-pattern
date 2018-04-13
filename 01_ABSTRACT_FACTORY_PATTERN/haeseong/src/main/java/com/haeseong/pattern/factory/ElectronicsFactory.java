package com.haeseong.pattern.factory;

        import com.haeseong.pattern.model.*;

public interface ElectronicsFactory {
    Desktop createDesktop();
    Notebook createNotebook();
    Tablet createTablet();
    Phone createPhone();
    Watch createWatch();
}
