public class Mars {

    public Mars() throws InterruptedException {
    }

    public static void main(String[] args) {
        String colonyName = "MarsTown";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing = true;

        shipFood = shipFood - (shipPopulation * 0.75);
        shipFood = shipFood - (shipPopulation * 0.75);

        System.out.println(shipFood);

        shipFood = (shipFood*1.5);

        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Plain";

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        landing = landingCheck(100);
      }

//    boolean result = landingCheck(100);

//    finalLanding = landingCheck(100);

    private static boolean landingCheck(int loops) //throws InterruptedException
         {
        for (int i = 0; i <= loops; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Keep center");
            } else if ((i % 5) == 0) {
                System.out.println("Right");
            } else if ((i % 3) == 0) {
                System.out.println("Left");

            } else {
                System.out.println("Calculating");
            }
        //Thread.sleep(250);
        }
        System.out.println("Landed");
        new GuessingGame();
        return false;

    }
    }

