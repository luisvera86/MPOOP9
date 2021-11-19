/*class Main {
  public static void main(String[] args) {
    System.out.println("####Exception####");
    try{
     String mensajes[]={"uno,dos,tres"};
     for(int i=0;i<=3;i++)
     System.out.println(mensajes[i]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error"+e);
      System.out.println("Error"+e.getMessage());
    }
    System.out.println("Esta linea esta cool");
    System.out.println("####Exception Anidada####");
    try{
      Integer denominador=null;
     float equis = 5/denominador;
     System.out.println(equis);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: "+e.getMessage());
    }
     catch(ArithmeticException e){
      System.out.println("Error: "+e.getMessage());
    }
     catch(NullPointerException e){
      System.out.println("Error: "+e.getMessage());
     }
    System.out.println("####Propagacion de    Exception####");
    try {
     imprimirArreglo();
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error->"+e.getMessage());
    }finally{
       System.out.println("Cualquier cosa que suceda entra en el finally");
      }
  }
  public static void imprimirArreglo() throws ArrayIndexOutOfBoundsException {
       String mensajes[]={"uno","dos","tres"};
       for(int i=0;i<=3;i++)
       System.out.println(mensajes[i]);
       }
    //System.out.println("####Creacion de Exception####");
    Cuenta cuenta=new Cuenta();
    try{
     cuenta.depositar(2000);
     cuenta.consultaSaldo();
     cuenta.retirar(800);
     cuenta.consultaSaldo();
     cuenta.retirar(1100);
     cuenta.consultaSaldo();
     cuenta.retirar(500);
     cuenta.consultaSaldo();
    }catch(SaldoInsuficienteException e){
      System.out.println("Error: "+e.getMessage());
      ofreceTarjetaCredito();
    }
  public static void ofreceTarjetaCredito(){
  System.out.println("Te interesa sacar una tarjeta de credito"); 
   } 
 }
*/ 
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    try{
    String mensajes[]={"uno","dos","tres"};
    for(int i=0;i<=3;i++)
    System.out.println(mensajes[i]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: "+e);
      System.out.println("Error: "+e.getMessage());
    }
    System.out.println("Esta linea esra cool");
    System.out.println("#######Excepciones Anidadas######");
    Integer denominador = 0;
    try{
    float equis=5/denominador;
    System.out.println(equis);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: "+e.getMessage());
    }catch(ArithmeticException e){
     System.out.println("Error: "+e.getMessage());
    }catch(Exception e){
      System.out.println("Error: "+e.getMessage());
    }
    System.out.println("#######Propagación de Excepciones######");
    try{
      imprimirArreglo();
    }catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Error-> "+e.getMessage());
    }finally{
      System.out.println("Cualquier cosa que suceda, entra en el finally");
    }

    System.out.println("#######Creación de Excepciones######");
    Cuenta cuenta = new Cuenta();
    try{
    cuenta.depositar(20000);
    cuenta.consultaSaldo();
    cuenta.retirar(800);
    cuenta.consultaSaldo();
    cuenta.retirar(1100);
    cuenta.consultaSaldo();
    cuenta.retirar(500);
    cuenta.consultaSaldo();
    }catch(TresmilNoException e){
    System.out.println("Error: " + e.getMessage());
    NoDeposito();
    } 
    public static void NoDeposito(){
    System.out.println("No puedes depositarmas de 20000");
  }
    }catch(TresRetirosException i){
    System.out.println("Error: " + i.getMessage());
    NotresRetiros();
    } 
    public static void NotresRetiros(){
    System.out.println("¿Te interesa  una tarjeta de credito?");
  }
    }catch(SaldoInsuficienteException e){
    System.out.println("Error: " + e.getMessage());
    ofrecerTarjetaCredito();
    }   
  }
  public static void ofrecerTarjetaCredito(){
    System.out.println("¿Te interesa  una tarjeta de credito?");
  }
  public static void imprimirArreglo()throws ArrayIndexOutOfBoundsException{
    String mensajes[]={"uno","dos","tres"};
    for(int i=0;i<3;i++)
    System.out.println(mensajes[i]);
  }
}
