package com.epsilon.com;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsilon.com.entities.Candidat;
import com.epsilon.com.repositoty.CandidatRepository;


@Service
public class CandidatService {
	
	@Autowired
	private CandidatRepository candidatRepository;
	
	public List<Candidat> insererDepuisExel(String excelPath) throws EncryptedDocumentException,InvalidFormatException, IOException{
		
		Workbook workbook = WorkbookFactory.create(new File("file:///C:/Users/simplon/Downloads/attension%20(1).xlsx"));
		// Retrieving the number of sheets in the Workbook
		System.out.println("Ce feuille de calcul contient"+workbook.getNumberOfSheets()+"");
		System.err.println("Récupération de feuilles à l'aide de la boucle for-each");
	    
		for(Sheet sheet: workbook) {
			System.out.println("=>"+sheet.getSheetName());
			
			
			for(Row row : sheet) {
				
				String date=row.getCell(0).getStringCellValue();
				String email=row.getCell(1).getStringCellValue();
				String civilite=row.getCell(2).getStringCellValue();
				String prenom=row.getCell(3).getStringCellValue();
				String nom=row.getCell(4).getStringCellValue();
				String date_de_naissance=row.getCell(5).getStringCellValue();
				String lieu_de_naissance=row.getCell(6).getStringCellValue();
				String adresse_actuelle=row.getCell(7).getStringCellValue();
				String telephone=row.getCell(8).getStringCellValue();
				String telephone_fixe=row.getCell(9).getStringCellValue();
				String prenom_nom_tuteur=row.getCell(10).getStringCellValue();
				String telephone_tuteur=row.getCell(11).getStringCellValue();
			    String lien_de_parente=row.getCell(12).getStringCellValue();
				String status_actuelle=row.getCell(13).getStringCellValue();
				String niveau=row.getCell(14).getStringCellValue();
				String filiere=row.getCell(15).getStringCellValue();
				
				
				Candidat candidat=new Candidat();
				candidat.setDate(date);
				candidat.setEmail(email);
				candidat.setCivilite(civilite);
				candidat.setPrenom(prenom);
				candidat.setNom(nom);
				candidat.setDate_de_naissance(date_de_naissance);
				candidat.setLieu_de_naissance(lieu_de_naissance);
				candidat.setAdresse_actuelle(adresse_actuelle);
				candidat.setTelephone(telephone);
				candidat.setTelephone_fixe(telephone_fixe);
				candidat.setPrenom_nom_tuteur(prenom_nom_tuteur);
				candidat.setTelephone_tuteur(telephone_tuteur);
				candidat.setLien_de_parente(lien_de_parente);
				candidat.setStatus_actuelle(status_actuelle);
				candidat.setNiveau(niveau);
				candidat.setFiliere(filiere);
				
				candidatRepository.save(candidat);
				
				    System.out.println(row.getCell(0));
	                System.out.println(row.getCell(1));
	                System.out.println(row.getCell(2));
	                System.out.println(row.getCell(3));
	                System.out.println(row.getCell(4));
	                System.out.println(row.getCell(5));
			}
			
			
		}
		
		return null;
	}
	
	

}
