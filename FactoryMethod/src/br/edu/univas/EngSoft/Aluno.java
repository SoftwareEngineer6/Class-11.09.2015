package br.edu.univas.EngSoft;

public class Aluno {

	private String nome;
	private int mat;
	public static int APROVADO = 1;
	public static int EM_EXAME = 2;
	public static int REPROVADO = 3;

	public int verificarSituação(){
		double media = getCalculadorMedia().calcularMedia();
	}
	
	public abstract CalculardorMedia getCalculadorMedia();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public static int getAPROVADO() {
		return APROVADO;
	}
	public static void setAPROVADO(int aPROVADO) {
		APROVADO = aPROVADO;
	}
	public static int getEM_EXAME() {
		return EM_EXAME;
	}
	public static void setEM_EXAME(int eM_EXAME) {
		EM_EXAME = eM_EXAME;
	}
	public static int getREPROVADO() {
		return REPROVADO;
	}
	public static void setREPROVADO(int rEPROVADO) {
		REPROVADO = rEPROVADO;
	}
	
	
}
