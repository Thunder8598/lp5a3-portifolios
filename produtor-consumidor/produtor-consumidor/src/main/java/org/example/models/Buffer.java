package org.example.models;

import java.util.ArrayList;

public class Buffer {
    public final int maxLength = 10;
    private ArrayList items = new ArrayList<Integer>();

    public void addItem(int item) throws Exception {
        if (this.items.size() >= this.maxLength)
            throw new Exception("Buffer cheio.");

        this.items.add(item);
    }

    public void removeItem() throws Exception {
        try{
            this.items.remove(0);
        } catch (Exception exception){
            throw new Exception("Buffer vazio.");
        }
    }

    public int bufferLength() {
        return this.items.size();
    }
}
