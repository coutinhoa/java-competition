import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Competition competition = new Competition();

        String nameOne = scanner.nextLine();
        String nameTwo = scanner.nextLine();
        competition.addCompetitor(nameOne);
        competition.addCompetitor(nameTwo);
        int numberPlots= scanner.nextInt();

        for(int i=0; i<numberPlots;i++){
            int treasure = scanner.nextInt();
            Plot plot = new Plot(treasure);
            competition.addPlotToLand(plot);
        }

        scanner.nextLine();

        while(true) {
            String command = scanner.next();

            if(command.equals("logout")) {
                if(competition.allCompetitorsDisqualified()) {
                    System.out.println("Both are disqualified.");
                } else if(competition.getLandSymbols().indexOf("*")==-1){
                    System.out.println("All treasures were discovered!");
                } else if(competition.getLandSymbols().contains("*")){
                    System.out.println("There are still treasures to discover...");
                }
                scanner.close();
                return;
            } else if(command.equals("wealth")) {
                System.out.println(String.format("Buried wealth is: %s",competition.getBuriedWealth()));
                scanner.nextLine();
            } else if(command.equals("land")) {
                System.out.println(competition.getLandSymbols());
                scanner.nextLine();
            } else if(command.equals("dig")) {
                int direction = scanner.nextInt();
                String name = scanner.nextLine();
                try{
                    competition.dig(name, direction);
                }
                catch (Exception e){
                    System.out.println(e.getMessage());
                }
            } else if(command.equals("merit")) {
                String name = scanner.nextLine();
                System.out.println(String.format("merit of %s: %s", name.trim() , competition.getArcheologistMerit(name)));
            } else {System.out.println("Invalid command.");}
        }
    }
}