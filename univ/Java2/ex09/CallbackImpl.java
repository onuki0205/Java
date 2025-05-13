import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.RMISecurityManager;
import java.rmi.server.UnicastRemoteObject;

public class CallbackImpl extends UnicastRemoteObject implements Callback {

  public CallbackImpl() throws RemoteException {
    super();
  }

  public String greeting(String lang) throws RemoteException {
    CallbackServer server = new CallbackServer();
    return server.sayHello(this, lang);
  }
  public String speakJapanese(){
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    if(stackTraceElements[2].getMethodName().equals("sayHello")){
      return new String("Konnichiwa!");
    }else if(stackTraceElements[2].getMethodName().equals("sayThanks")){
      return new String("Arigatou gozaimasu!");
    }
    return null;
  }
  public String speakEnglish(){
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    if(stackTraceElements[2].getMethodName().equals("sayHello")){
      return new String("How are you!");
    }else if(stackTraceElements[2].getMethodName().equals("sayThanks")){
      return new String("Thank you!");
    }
    return null;
  }

  public String thanks(String lang) throws RemoteException {
    CallbackServer server = new CallbackServer();
    return server.sayThanks(this, lang);
  }
  public static void main(String args[]) {

    // Create and install a security manager
    if (System.getSecurityManager() == null) {
      System.setSecurityManager(new RMISecurityManager());
    }
    try {
      CallbackImpl obj = new CallbackImpl();
      // Bind this object instance to the name "MyCallbackServer"
      Naming.rebind("MyCallbackServer", obj);
      System.out.println("MyCallbackServer bound in registry");
    } catch (Exception e) {
      System.out.println("CallbackImpl err: " + e.getMessage());
      e.printStackTrace();
    }
  }
}