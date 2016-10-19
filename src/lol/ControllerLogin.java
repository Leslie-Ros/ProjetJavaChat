package lol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class ControllerLogin {
	  @FXML
	    private JFXTextField pseudoI;

	    @FXML
	    private JFXTextField mdpI;

	    @FXML
	    private JFXButton connexion;

	    @FXML
	    private JFXButton inscription;
	    
	    private String pseudo=null;
	    private String mdp=null;

	    @FXML
	    void fconnexion(ActionEvent event) {
				do{
				pseudo = pseudoI.getText();
				mdp = mdpI.getText();
				}while (!(this.dansFichier(pseudo, mdp)));
		}
	    

	    @FXML
	    void finscription(ActionEvent event) {
			pseudo = pseudoI.getText();
			mdp =  mdpI.getText();
			this.enregistrer(pseudo, mdp);
	    }
	    
	    public void enregistrer(String pseudo, String mdp) {
			BufferedWriter bufferedWriter;
			try {
				bufferedWriter = new BufferedWriter(new FileWriter("fichierLogMdp.txt", true));
				bufferedWriter.newLine();
				bufferedWriter.write(pseudo + " " + mdp);

				bufferedWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    public boolean dansFichier(String pseudo, String mdp) {
			FileReader fr;
			try {
				fr = new FileReader("fichierLogMdp.txt");

				BufferedReader br = new BufferedReader(fr);
				String ligne = br.readLine();
				while (ligne != null) {

					String[] pseudoMdp = ligne.split(" ");
					if (pseudo.equals(pseudoMdp[0]) && mdp.equals(pseudoMdp[1])) {
						return true;
					} else {
						ligne = br.readLine();
					}

				}
				br.close();

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return false;

		}
		
		


	}