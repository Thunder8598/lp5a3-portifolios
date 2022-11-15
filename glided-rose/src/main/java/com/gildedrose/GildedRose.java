package com.gildedrose;

import com.gildedrose.enums.SpecialItem;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items)
            this.checkItem(new WrapperItem(item));
    }

    private void checkItem(WrapperItem item) {
        if (item.getItem().name.equals(SpecialItem.SULFURAS.toString()))
            return;

        if (item.getItem().name.equals(SpecialItem.AGED_BRIE.toString()))
            item.increaseQualityBy(1);
        else if (item.getItem().name.equals(SpecialItem.BACKSTAGE.toString()))
            this.setBackstageItemQuality(item);
        else
            item.decreaseQualityBy(1);

        item.decreaseSellIn();
    }

    private void setBackstageItemQuality(WrapperItem wrapper) {
        Item item = wrapper.getItem();

        if (item.sellIn <= 0)
            item.quality = 0;
        else if (item.sellIn <= 5)
            wrapper.increaseQualityBy(3);
        else if (item.sellIn <= 10)
            wrapper.increaseQualityBy(2);
        else
            wrapper.increaseQualityBy(1);
    }
}
