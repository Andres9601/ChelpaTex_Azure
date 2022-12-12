package com.bus.chelpaTex.Security;

import java.io.FileInputStream;

import org.springframework.stereotype.Service;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.auth.FirebaseAuthException;

@Service
public class FirebaseInit {
	
	private static FirebaseOptions firebaseOptions;
	private static FileInputStream serviceAccount; 
//	private static final String FIREBASE_DATABASEURL = "https://chelpa-tex-dev.firebaseio.com";
	private static final String FIREBASE_CONFIG = "firebase.json";

	public void inicializacion() throws FirebaseAuthException {
		
		
		try {
			serviceAccount = new FileInputStream(FIREBASE_CONFIG);
			firebaseOptions = new FirebaseOptions.Builder()
			.setCredentials(GoogleCredentials.fromStream(serviceAccount))
			.build();
			FirebaseApp.initializeApp(firebaseOptions);
		} catch (Exception e){
		}
		
		}
	
	
	

}

