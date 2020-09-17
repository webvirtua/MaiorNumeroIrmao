package com.biggest.biggest;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 * <b>AbstractServiceGeneral</b>
 * @package com.biggest.biggest
 * @autor Luiz Rodrigues <atende@webvirtua.com.br>
 * @copyrigth © 09/2020, Luiz Rodrigues Web Virtua
 * @version 1.0
 */
public class BiggestNumberBrother {
	private int number = 0;
	
	/**
     * BiggestNumberBrother constructor.
     */
	public BiggestNumberBrother() {
		super();
		this.uiBiggestNumberBrother();
	}

	/** 
	 * Método cria a interface gráfica do usuário e valida o tipo de dado recebido no input.
	 * @autor Luiz Rodrigues
     * @return int
	 */
	public int uiBiggestNumberBrother() {
		try {
			String numberString = JOptionPane.showInputDialog("Digite um número inteiro positivo:");
			
			try {
				this.number = Integer.parseInt(numberString);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Entrada não corresponde a um número inteiro positivo.", "Mensagem de erro", JOptionPane.INFORMATION_MESSAGE);
				return 0;
			}

		    if (this.number < 0) {
		    	JOptionPane.showMessageDialog(null, this.number + " não corresponde a um número inteiro positivo!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		    	return 0;
		    }
		    
		    int result = this.biggestNumberBrother(this.number);
		    
		    if (result == -1) {
		    	JOptionPane.showMessageDialog(null, "O resultado do maior número irmão não pode ser superior a 100.000.000!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		    	return 0;
			}
		    
		    JOptionPane.showMessageDialog(null, "O maior número irmão de " + this.number + " é: " + result, "Mensagem", JOptionPane.INFORMATION_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro: " + e, "Mensagem de erro", JOptionPane.INFORMATION_MESSAGE);
		}
		
		return 1;
	}
	
	/** 
	 * Método recebe um valor inteiro e retorna o mair número irmão.
	 * @autor Luiz Rodrigues
	 * @param number int
     * @return int - Maior número irmão
	 */
	public int biggestNumberBrother(int number) {
		try {
			String numberString = Integer.toString(number);
			
			String[] numberArray = numberString.split("", -1); 
			
			Arrays.sort(numberArray, Collections.reverseOrder());
		
			String newNumberString = "";
			
			for (int i = 0; i < numberString.length(); i++) {
				newNumberString += numberArray[i];
			}
	
			number = Integer.parseInt(newNumberString);
			
			if (number > 100000000) {
				return -1;
			}
			
			return Integer.parseInt(newNumberString);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Não foi possível executar corretamente! Erro: " + e, "Mensagem de erro", JOptionPane.INFORMATION_MESSAGE);
		}
		
		return 0;
	}
}
