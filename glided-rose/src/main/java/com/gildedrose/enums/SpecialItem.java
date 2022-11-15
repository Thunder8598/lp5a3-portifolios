package com.gildedrose.enums;

public enum SpecialItem {
    AGED_BRIE("Aged Brie"), BACKSTAGE("Backstage passes to a TAFKAL80ETC concert"), SULFURAS("Sulfuras, Hand of Ragnaros");

    private final String name;

    SpecialItem(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
