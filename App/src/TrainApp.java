public class TrainApp {

    public static void main(String[] args) {

        String[] bogieIds = {
                "BG101",
                "BG205",
                "BG309"
        };

        String searchKey = "BG205";

        try {
            boolean found = searchBogie(bogieIds, searchKey);

            if (found) {
                System.out.println("Bogie ID " + searchKey + " found.");
            } else {
                System.out.println("Bogie ID " + searchKey + " not found.");
            }

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean searchBogie(String[] bogieIds, String searchKey) {

        if (bogieIds.length == 0) {
            throw new IllegalStateException("Search operation failed: No bogies available in the train.");
        }

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                return true;
            }
        }

        return false;
    }
}