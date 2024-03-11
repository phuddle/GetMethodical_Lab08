 import java.util.Scanner;

    public class BirthDateTime {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int year = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015); //get birth year within range 1950 to 2015
            int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12); //get birth month within 1-12
            int day = getValidDay(in, month); //get user birth day
            int hours = SafeInput.getRangedInt(in, "Enter the hour of your birth (1 - 24)", 1, 24); //get hour within range
            int minutes = SafeInput.getRangedInt(in, "Enter the minute of your birth (1 - 59)", 1, 59); //get minute within range
            System.out.println("Date and Time of Birth:");
            System.out.println("Year: " + year);
            System.out.println("Month: " + month);
            System.out.println("Day: " + day);
            System.out.println("Hour: " + hours);
            System.out.println("Minute: " + minutes);
        }

        private static int getValidDay(Scanner in, int month) {
            int day;
            switch (month) {
                case 2: // February
                    day = SafeInput.getRangedInt(in, "Enter the day of your birth (1 - 29)", 1, 29); //changes date range if feb.
                    break;
                case 4: // April
                case 6: // June
                case 9: // September
                case 11: // November
                    day = SafeInput.getRangedInt(in, "Enter the day of your birth (1 - 30)", 1, 30); //change date range if month has 30 days
                    break;
                default: // January, March, May, July, August, October, December
                    day = SafeInput.getRangedInt(in, "Enter the day of your birth (1 - 31)", 1, 31); //change date range if month has 31 days
                    break;
            }
            return day;
        }
    }

