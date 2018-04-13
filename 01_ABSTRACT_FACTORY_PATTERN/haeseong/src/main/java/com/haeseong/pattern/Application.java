package com.haeseong.pattern;

import com.haeseong.pattern.factory.AppleFactory;
import com.haeseong.pattern.factory.ElectronicsFactory;
import com.haeseong.pattern.factory.SamsungFactory;
import com.haeseong.pattern.model.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        System.out.println("AppleFactory creates products :");
        List<Product> appleProducts = createProducts(new AppleFactory());
        printProducts(appleProducts);

        System.out.println("SamsungFactory creates products :");
        List<Product> samsungProducts = createProducts(new SamsungFactory());
        printProducts(samsungProducts);
    }

    private static List<Product> createProducts(ElectronicsFactory factory) {
        Desktop desktop = factory.createDesktop();
        Notebook notebook = factory.createNotebook();
        Tablet tablet = factory.createTablet();
        Phone phone = factory.createPhone();
        Watch watch = factory.createWatch();
        return Arrays.asList(desktop, notebook, tablet, phone, watch);
    }

    private static void printProducts(List<Product> products) {
        List<String> names = products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
