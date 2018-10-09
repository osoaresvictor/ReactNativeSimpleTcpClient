
package com.soaresvictor;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.tcpclient.TcpClient;

public class RNSocketTcpClientModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNSocketTcpClientModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNSocketTcpClient";
  }

  @ReactMethod
  public void sendData(String host, int port, String stringData) {
      try {
          new Thread(new TcpClient(host, port, stringData,null)).start();
      } catch (Exception e) {
          e.printStackTrace();
      }
  }
}