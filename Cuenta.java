public class Cuenta{
  private double saldo;
  public Cuenta(){
    saldo=0;
  }

  public void depositar(double monto){
    System.out.println("Depositando...");
    saldo+=monto;
    if(monto<20000)
     throw new TresmilNoException();
   else 
   saldo+=monto;
  }

  public void retirar(double monto)throws SaldoInsuficienteException{
    System.out.println("Retirando...");
    if(saldo<monto)
     throw new SaldoInsuficienteException();
   else 
     saldo-=monto;
    if (saldo<monto)
     throw new TresRetirosException();
    else 
    monto=3;
  }
   
  public double consultaSaldo(){
    System.out.println("Tu saldo es: "+saldo);
    return saldo;
  }

}