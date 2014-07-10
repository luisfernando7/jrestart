package com.br.huehue.jrestart;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Main {

	public static void main(String[] args) {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		        System.out.println(info.getName());
		    }
		} catch (Exception e) {
		    System.err.print("Erro: "+e);
		}
		
		JOptionPane.showMessageDialog(null, "Sepah");
		
	}

}
