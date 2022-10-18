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
                if(competition.getLandSymbols().indexOf("*")==-1){
                    System.out.println("All treasures were discovered!");
                    }else if(competition.getLandSymbols().contains("*")){
                    System.out.println("There are still treasures to discover...");}
                    else {System.out.println("Correu mal! Foram ambos desclassificados.");}
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
                /*else{
                    System.out.println(String.format("%s perdeu a licenca de escavacao"));
                }*/
            } else if(command.equals("merito")) {
                String name = scanner.nextLine();
                System.out.println(String.format("merit of %s: %s", name , competition.archeologistMerit(name)));
                /*if(!nameOne || !nameTwo){
                    System.out.println("Arqueologo inexistente");
                }else if(nameOne.equals("disqualified") || nameTwo.equals("disqualified")){
                    System.out.println("Arqueologo desclassificado");
                }*/
            } else {System.out.println("Invalid command");}
        }
    }
}