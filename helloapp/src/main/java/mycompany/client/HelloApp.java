package mycompany.client;

import sharedlibrary.client.HappyFuture;

import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class HelloApp implements EntryPoint
{
  /**
   * This is the entry point method.
   */
  public void onModuleLoad() {
    helloWorld();
  }

  private native void helloWorld() /*-{
    $wnd.alert("Hello World Core in Maven");
  }-*/;
}
