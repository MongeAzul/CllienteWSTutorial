package com.clientews;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.tutorial.services.TutorialWS;
import com.tutorial.services.TutorialWSServiceLocator;

public class ClienteTutorialWS {

	public static void main(String[] args) {
		
		try {
			TutorialWS  tutorial = new TutorialWSServiceLocator().getTutorialWS();
			System.out.println("Saída WebService: " + tutorial.algo("FUNFAAA!"));
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
	}
	
}
