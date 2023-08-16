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
    }
}