package org.example.helpers;

import org.example.models.Buffer;

public class Produtor implements Runnable {
    private int itemsToProduce;
    private Buffer buffer;

    public Produtor(Buffer buffer, int itemsToProduce) {
        this.buffer = buffer;
        this.itemsToProduce = itemsToProduce;
    }

    public void run() {
        while (this.itemsToProduce > 0) {
            try {
                //Thread.sleep(1000);

                this.buffer.addItem(1);
                this.itemsToProduce--;

                System.out.println("Produzindo...");
                System.out.println("Buffer: " + this.buffer.bufferLength() + "/" + this.buffer.maxLength);
                System.out.println("Restam Produzir: " + this.itemsToProduce + "\n");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
        }
    }
}
