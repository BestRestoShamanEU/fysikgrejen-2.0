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
                    System.out.println("Ordet kan endast innehålla bokstäver!");
                }
            }
			// TAR IN INPUT FRÅN SCANNERN OCH GÖR TILL EN STRING, SIFFROR KOMMER FÅ DEN ATT GE ETT FELMEDDELANDE OCH SEDAN BEGÄRA INPUT IGEN
            
			for (int i = 0; i < 40; i++) {
				System.out.println();
			}

			String visibleword = "";

			for (int i = 0; i < secretword.length(); i++) {
				visibleword += '-';
			}

			// LOOPEN ÄR TILL FÖR ATT LÄGGA TILL EN UNDERSCORE FÖR VARJE
			// BOKSTAV I SECRETWORD

			int lives = 5;

			while (lives > 0 && !visibleword.equals(secretword)) {

				// LOOPAR SÅ LÄNGE DU HAR LIV ÖVER 0 ELLER FRAM TILL DET
				// ATT ORDET BLIR FÄRDIGT

				System.out.println(visibleword + ". liv: " + lives);

				char guess = hej.next().toLowerCase().charAt(0);

				// DETTA TAR IN EN BOKSTAV OCH GÖR DEN TILL EN LITEN
				// BOKSTAV FÖR ATT DET INTE SKA SPELA NÅGON ROLL OM DU
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

				// TESTAR BOKSTAV FÖR BOKSTAV OM GISSNINGEN ÄR SAMMA SOM BOKSTAVEN VID
				// NUVARANDE INDEX

				visibleword = newvisible;

				//HÄR BLIR VISIBLEWORD OMVANDLAT TILL DET NYA AKA NEWVISIBLE
				
				if (!right) {
					lives--;
				}

			}

			if (lives == 0) {
				System.out.println("förlust , rätt ord var " + secretword);
			} else {
				System.out.println("vinst");
			}
			//NÄR SPELET ÄR ÖVER SÅ KOMMER DET ATT PRINTA VINST ELLER FÖRLUST BEROENDE PÅ HUR DET GICK FÖR SPELAREN
		}

	}


