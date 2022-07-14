public class ServerNameGenerator {

    private static String[] teamCity = {"New England", "Seattle", "Los Angeles", "Las Vegas", "San Diego", "Denver", "San Francisco", "Arizona", "Dallas", "Philadelphia"};

    private static String[] teamName = {"Patriots", "Seahawks", "Rams", "Raiders", "Chargers", "Broncos", "49ers", "Cardinals", "Cowboys", "Eagles"};

    private static String randomElement(String[] strings){
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }

    public static String makeTeamName(String[] strings1, String[] strings2){
        String part1 = randomElement(strings1);
        String part2 = randomElement(strings2);
        String finalString = part1 + " " + part2;
        return finalString;
    }


    public static void main(String[] args) {
        System.out.println("Your team name is the:");
        System.out.println(makeTeamName(teamCity, teamName));
    }
}
