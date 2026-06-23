public class operators {
    public static void main(String[] args) {
        // arithmetic operators: [+, -, *, /, %}
        int solvedThisWeek = 25;
        int solvedLastWeek = 15;

        int total = solvedThisWeek + solvedLastWeek;
        int difference = solvedThisWeek - solvedLastWeek;
        int projected = solvedThisWeek * 4;
        int average = solvedThisWeek / 7;
        int remainder = solvedThisWeek % 7;

        System.out.println(total);
        System.out.println(difference);
        System.out.println(projected);
        System.out.println(average);
        System.out.println(remainder);

        // retational operators: [==, !=, <, >, >=, <=]

        int currentStreak = 45;
        int targetStreak = 50;

        System.out.println(currentStreak == targetStreak);
        System.out.println(currentStreak != targetStreak);
        System.out.println(currentStreak > targetStreak);
        System.out.println(currentStreak < targetStreak);
        System.out.println(currentStreak >= targetStreak);
        System.out.println(currentStreak <= targetStreak);

        int activeUsers = 100;

        int prefix = ++activeUsers;
        int postfix = activeUsers++;

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeUsers);
    }
}