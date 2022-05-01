package com.example.paleo;

public class GroundBeef {
    // based on 1 ounce portions
    private Food groundBeef;

    public GroundBeef(Food groundBeef) {
        this.groundBeef = groundBeef;
        groundBeef.setCalories((float) 54.4);
        groundBeef.setTotal_fat((float) 3.6);
        groundBeef.setSaturated_fat((float) 1.5);
        groundBeef.setMonounsaturated_fat((float) 1.4);
        groundBeef.setPolyunsaturated_fat((float) 0.2);
        groundBeef.setTransaturated_fat((float) 0.2);
        groundBeef.setCholesterol((float) 17.6);
        groundBeef.setCarbohydrates((float) 0);
        groundBeef.setNet_carbs((float) 0);
        groundBeef.setSugar((float) 0);
        groundBeef.setFiber((float) 0);
        groundBeef.setProtein((float) 5.5);
        groundBeef.setMagnesium((float) 5.4);
        groundBeef.setPhosphorous((float) 49.6);
        groundBeef.setPotassium((float) 81.8);
        groundBeef.setSulfur((float) 0); // TODO: FIND SULFUR COMPOSITION
        groundBeef.setChloride((float) 0);
        groundBeef.setSodium((float) 19.3);
        groundBeef.setCalcium((float) 3.4);
        groundBeef.setIron((float) 0.6);
        groundBeef.setSelenium((float) 4);
        groundBeef.setZinc((float) 1.3);
    }
}
