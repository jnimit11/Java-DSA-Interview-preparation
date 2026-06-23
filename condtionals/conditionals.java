public class conditionals {
    public static void main(String[] args) {
        int dailyPractice = 12;

        if (dailyPractice >= 10) {
            System.out.println("Good consistency!");
        }

        int score = 42;

        if (score >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        int accuracy = 78;

        if (accuracy >= 90) {
            System.out.println("Excellent");
        } else if (accuracy >= 75) {
            System.out.println("Good");
        } else if (accuracy >= 60) {
            System.out.println("Average");
        } else {
            System.out.println("Needs Improvement");
        }

        boolean hasSubscription = true;
        int solvedProblems = 220;

        if (hasSubscription) {

            if (solvedProblems >= 200) {
                System.out.println("Unlock Advanced Sheet");
            } else {
                System.out.println("Practice More Problems");
            }

        } else {
            System.out.println("Upgrade to Premium");
        }

        int streakDays = 35;

        String status = (streakDays >= 30) ? "Consistent" : "Irregular";

        System.out.println(status);

        int dayNumber = 4;

        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}