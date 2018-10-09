package com.tcpclient;

import android.support.annotation.Nullable;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TcpClient implements Runnable {

    private final String host;
    private final int port;
    private final String stringData;
    private final byte[] byteData;

    public TcpClient(String host, int port, @Nullable String stringData, @Nullable byte[] byteData) throws Exception {
        this.host = host;
        this.port = port;
        this.stringData = stringData;
        this.byteData = byteData;

        if(stringData == null && byteData == null){
            throw new Exception("Nenhum argunmento de dado foi informado");
        }
    }

    private Socket socket;

    @Override
    public void run() {
        if (this.stringData != null) {
            try {
                this.send(this.stringData);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            try {
                this.send(this.byteData);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private void send(String data) throws Exception {
        try {
            socket = new Socket(this.host, this.port);

            DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());

            dOut.writeUTF(data);
            dOut.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void send(byte[] data) throws Exception {
        try {
            socket = new Socket(this.host, this.port);

            DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());

            dOut.write(data);
            dOut.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
