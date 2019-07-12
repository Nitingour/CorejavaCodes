interface Bank1
{
 void deposit();	
  void showBalance() ; //public abstract
	
}
interface Bank2
{
 void transaction();	
  void showBalance();
}
public   class Customer  implements Bank1,Bank2
{
   public  void deposit() { }
   public  void transaction() { }
  public  void showBalance() { }
	public static void main(String[] args) 
	{
		
	}

}
