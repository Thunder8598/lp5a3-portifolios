package com.gildedrose;

public class WrapperItem {
    private final Item item;

    public WrapperItem(Item item) {
        this.item = item;
    }

    public void increaseQualityBy(int increaseBy) {
        this.item.quality += increaseBy;

        if (this.item.quality > 50)
            this.item.quality = 50;
    }

    public void decreaseQualityBy(int decreaseBy) {
        if (decreaseBy == 1 && this.item.sellIn <= 0)
            decreaseBy = 2;

        this.item.quality -= decreaseBy;

        if (this.item.quality < 0)
            this.item.quality = 0;
    }

    public void decreaseSellIn() {
        this.item.sellIn--;
    }

    public Item getItem() {
        return this.item;
    }
}
