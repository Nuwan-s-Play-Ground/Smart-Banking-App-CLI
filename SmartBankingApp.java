import java.util.Scanner;

public class SmartBankingApp{
     private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        final String CLEAR = "\033[H\033[2J";
        final String COLOR_BLUE_BOLD = "\033[34;1m";
        final String COLOR_GREEN_BOLD = "\033[33;1m";
        final String COLOR_RED_BOLD = "\033[31;1m";
        final String COLOR_YELLO_BOLD = "\033[32;1m";
        final String RESET = "\033[0m";

        final String DASHBOARD = "Welcome to Smart Banking App";
        final String CREATE_ACCOUNT = "Create New Acount";
        final String DEPOSIT = "Deposit";
        final String WITHDRAWAL = "Withdrawal";
        final String TRANSFER = "Transfer";
        final String PRINT_STATEMENT = "Check Account Balance";
        final String DELETE_ACCOUNT = "Delete Account";

        
        final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
        final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

        String[] accountNumbers = new String[0];
        String[] customerNames = new String[0];
        Double[] accountBalance = new Double[0];

        String screen = DASHBOARD;
        int i = 1;

        loopOne: do {
            final String APP_TITLE = String.format("%s%s%s", COLOR_BLUE_BOLD, screen, RESET);

            System.out.println(CLEAR);
            System.out.printf("\t%s+%s+%s\n", COLOR_YELLO_BOLD, "-".repeat(APP_TITLE.length() - 11), RESET);
            System.out.print("\t|" + APP_TITLE + "|\n");
            System.out.printf("\t%s+%s+%s\n", COLOR_YELLO_BOLD, "-".repeat(APP_TITLE.length() - 11), RESET);
            
            switch (screen) {
                case DASHBOARD:
                    System.out.printf("\t[1]. %s\n", CREATE_ACCOUNT);
                    System.out.printf("\t[2]. %s\n", DEPOSIT);
                    System.out.printf("\t[3]. %s\n", WITHDRAWAL);
                    System.out.printf("\t[4]. %s\n", TRANSFER);
                    System.out.printf("\t[5]. %s\n", PRINT_STATEMENT);
                    System.out.printf("\t[6]. %s\n", DELETE_ACCOUNT);
                    System.out.printf("\t[7]. %s\n", "Exsit");
                    System.out.print("\tEnter an option to continue: ");
                    int option = SCANNER.nextInt();
                    SCANNER.nextLine();

                    switch (option) {
                        case 1:
                            screen = CREATE_ACCOUNT;
                            break;
                        case 2:
                            screen = DEPOSIT;
                            break;
                        case 3:
                            screen = WITHDRAWAL;
                            break;
                        case 4:
                            screen = TRANSFER;
                            break;
                        case 5:
                            screen = PRINT_STATEMENT;
                            break;
                        case 6:
                            screen = DELETE_ACCOUNT;
                            break;

                        case 7:
                            System.out.println(CLEAR);
                            System.exit(0);
                        default:
                            continue;
                    }
                    break;


    }
}