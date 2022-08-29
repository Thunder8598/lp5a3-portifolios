package org.example.helpers;

import org.example.models.Buffer;

public class Consumidor implements Runnable {
    private int itemsToConsume;
    private Buffer buffer;

    public Consumidor(Buffer buffer, int itemsToConsume) {
        this.buffer = buffer;
        this.itemsToConsume = itemsToConsume;
    }

    public void run() {
        while (this.itemsToConsume > 0) {
            try {
                //Thread.sleep(1000);

                this.buffer.removeItem();
                this.itemsToConsume--;

                System.out.println("Consumindo...");
                System.out.println("Buffer: " + this.buffer.bufferLength() + "/" + this.buffer.maxLength);
                System.out.println("Restam consumir: " + this.itemsToConsume + "\n");
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
