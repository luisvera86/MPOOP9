public class TresRetirosException extends Exception{
  public TresRetirosException(){
    super("No se pueden hacer mas de 3 retiros");
  }
}