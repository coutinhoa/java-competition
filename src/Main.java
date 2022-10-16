import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
            String command = scanner.nextLine();

            if(command.equals("logout")) {
                /*if(){
                    System.out.println("Correu mal! Foram ambos desclassificados.");
                }else if(){
                    System.out.println("Ainda havia tesouros por descobrir...");
                }else (){
                    System.out.println("Todos os tesouros foram descobertos!");
                }*/
                scanner.close();
                return;
            } else if(command.equals("wealth")) {
                System.out.println(String.format("Burried wealth is: %s",competition.getBurriedWealth()));
            } else if(command.equals("land")) {
                System.out.println("land");
            } else if(command.equals("merito")) {
                /*if(!nameOne || !nameTwo){
                    System.out.println("Arqueologo inexistente");
                }else if(nameOne.equals("disqualified") || nameTwo.equals("disqualified")){
                    System.out.println("Arqueologo desclassificado");
                }else {
                    System.out.println(String.format("merito de : %s"));
                }*/;
            } else if(command.equals("escavacao")) {
                /*if (jump==0){
                    System.out.println(Salto invalido);
                }else if (jump>0 && (!nameOne || !nameTwo)){
                    System.out.println("Arqueologo inexistente");
                }else if (jump>0 && (nameOne.equals("disqualified") || nameTwo.equals("disqualified")){
                    System.out.println("Arqueologo desclassificado");
                }else if (""){
                    System.out.println(String.format("%s perdeu a licenca de escavacao"));
                }*/;
            } else {System.out.println("Invalid command");}
        }
    }
}