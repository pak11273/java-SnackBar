public class VendingMachine
{

   int maxId = 0;
   int id;
   String name;

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


