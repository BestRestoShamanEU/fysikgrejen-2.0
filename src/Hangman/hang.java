package Hangman;


	import java.util.Scanner;

	public class hang {

		public static void main(String[] args) {
			
          
            
            boolean CorrectInput = false;

           
            Scanner hej = new Scanner(System.in);
            String secretword = "";

            while (!CorrectInput) {
                System.out.println("Skriv ett ord");
                secretword = hej.next();

                boolean wrong = false;

               if(!secretword.matches("^[a-zA-Z]+$")){
                   wrong = true;
                   CorrectInput = false;
               }

                if(!wrong){
                    CorrectInput = true;
                }else{
                    System.out.println("Ordet kan endast inneh�lla bokst�ver!");
                }
            }
			// TAR IN INPUT FR�N SCANNERN OCH G�R TILL EN STRING, SIFFROR KOMMER F� DEN ATT GE ETT FELMEDDELANDE OCH SEDAN BEG�RA INPUT IGEN
            
			for (int i = 0; i < 40; i++) {
				System.out.println();
			}

			String visibleword = "";

			for (int i = 0; i < secretword.length(); i++) {
				visibleword += '-';
			}

			// LOOPEN �R TILL F�R ATT L�GGA TILL EN UNDERSCORE F�R VARJE
			// BOKSTAV I SECRETWORD

			int lives = 5;

			while (lives > 0 && !visibleword.equals(secretword)) {

				// LOOPAR S� L�NGE DU HAR LIV �VER 0 ELLER FRAM TILL DET
				// ATT ORDET BLIR F�RDIGT

				System.out.println(visibleword + ". liv: " + lives);

				char guess = hej.next().toLowerCase().charAt(0);

				// DETTA TAR IN EN BOKSTAV OCH G�R DEN TILL EN LITEN
				// BOKSTAV F�R ATT DET INTE SKA SPELA N�GON ROLL OM DU
				// SKRIVER LITEN ELLER STOR BOKSTAV I INPUT

				String newvisible = "";

				boolean right = false;

				// DETTA KOMMER BLI NYA ORDET EFTER GISSNINGEN

				for (int i = 0; i < secretword.length(); i++) {
					if (secretword.toLowerCase().charAt(i) == guess) {
						newvisible += secretword.charAt(i);
						right = true;
					} else {
						newvisible += visibleword.charAt(i);
					}
				}

				// TESTAR BOKSTAV F�R BOKSTAV OM GISSNINGEN �R SAMMA SOM BOKSTAVEN VID
				// NUVARANDE INDEX

				visibleword = newvisible;

				//H�R BLIR VISIBLEWORD OMVANDLAT TILL DET NYA AKA NEWVISIBLE
				
				if (!right) {
					lives--;
				}

			}

			if (lives == 0) {
				System.out.println("f�rlust , r�tt ord var " + secretword);
			} else {
				System.out.println("vinst");
			}
			//N�R SPELET �R �VER S� KOMMER DET ATT PRINTA VINST ELLER F�RLUST BEROENDE P� HUR DET GICK F�R SPELAREN
		}

	}


