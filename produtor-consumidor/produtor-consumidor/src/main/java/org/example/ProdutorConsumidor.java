package org.example;

import org.example.helpers.Consumidor;
import org.example.helpers.Produtor;
import org.example.models.Buffer;

public class ProdutorConsumidor {
    private Buffer buffer = new Buffer();

    public void start() {
        Thread produtor = new Thread(new Produtor(this.buffer, 160));
        Thread consumidor = new Thread(new Consumidor(this.buffer, 160));

        produtor.start();
        consumidor.start();
    }
}
