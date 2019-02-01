public class Igor
{
    public String name = "Igor";
    boolean IsOpSlot = true;


    public Igor(String newName)
    {
        name = newName;
    }

    public void RoepNaam()
    {
        System.out.println(name);
    }

    public void OpenDeur() {

        if (IsOpSlot == true) {

            System.out.println("The door is locked");
            System.out.println("Is the door locked? " + IsOpSlot + " answers Igor");
            System.out.println("Igor opens the door");
        } else {
            System.out.println("De deur is now open!");
            System.out.println("Controle: " + IsOpSlot);
        }}
}
