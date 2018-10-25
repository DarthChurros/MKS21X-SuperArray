public class Driver {
  public static void main(String[] args) {

    System.out.print("\n\n\n\n\n");

    /**************************************************************************/

    SuperArray SA = new SuperArray();
    System.out.println("Created an empty SuperArray \"SA\" with capacity 10\n\n");

    /**************************************************************************/

    System.out.println("SA's status:                       " + SA.toStringDebug());
    System.out.println("SA is empty (should return true):  " + SA.isEmpty());
    System.out.println("SA's size:                         " + SA.size());

    /**************************************************************************/

    SA.add("Fish");
    SA.add("45");
    SA.add("Fortnite");
    System.out.println("\nAdded \"Fish\", \"45\", \"Fortnite\" to SA");
    System.out.println("SA's current value':               " + SA.toString());
    System.out.println("Value with nulls:                  " + SA.toStringDebug() + "\n\n");
    System.out.println("SA is empty (should return false): " + SA.isEmpty());

    /**************************************************************************/

    SA.set(1, "38");
    System.out.println("Setting SA[1] to \"38\"...");
    System.out.println("\n");
    System.out.println("Checking set value:                " + SA.get(1) + "\n\n");

    /**************************************************************************/
  }
}
