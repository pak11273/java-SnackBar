package snackApp;

public class VendingMachine
{

   private int maxId = 0;
   private int id;
   private String name;

   public VendingMachine(String name)
   {
      id = maxId++;
      this.name = name;
   }

   public int getId()
   {
      return this.id;
   }

   public String getName()
   {
      return this.name;
   }

   public void setName(String name)
   {
      this.name = name;
   }
}


