package controller;

public class QuickSort {

	public int[] quick(int[] vetor, int inicio, int fim) {
		if(fim > inicio) {
			int pivoFixo = dividir(vetor, inicio, fim);
			quick(vetor, inicio, pivoFixo - 1);
			quick(vetor, pivoFixo +1, fim);
		}
		return vetor;
	}
	
	public int dividir(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int ponteiroEsquerda = inicio + 1;
		int ponteiroDireita = fim;
		
		while(ponteiroDireita >= ponteiroEsquerda) {
			while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo) {
				ponteiroEsquerda++;
			}while(ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo) {
				ponteiroDireita--;
			}if(ponteiroDireita > ponteiroEsquerda) {
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		
		trocar(vetor, inicio, ponteiroDireita);
		return ponteiroDireita;
	}
	
	public void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
	
}
