package Test;

import java.util.Scanner;

public class Exo {

	public static void mySum() {
		int a, b, c;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Nombre 1:");
		a = clavier.nextInt();
		System.out.println("Nombre 2:");
		b = clavier.nextInt();
		c = a + b;
		System.out.println("Résultat: " + c);
		clavier.close();
	}

	public static void mySwap() {
		int a, b, c;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Nombre 1:");
		a = clavier.nextInt();
		System.out.println("Nombre 2:");
		b = clavier.nextInt();
		c = a;
		a = b;
		b = c;
		System.out.println("Nombre 1 : " + a + " et Nombre 2 : " + b);
		clavier.close();
	}

	public static void myPrice() {
		float price;
		int age;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Age:");
		age = clavier.nextInt();
		System.out.println("Prix:");
		price = clavier.nextFloat();
		if(age < 2) {
			System.out.println("Prix = "+0);
		}
		else
		if(age < 10) {
			System.out.println("Prix = "+price/2);
		}
		else
		if(age < 27 || age > 70) {
			System.out.println("Prix = "+price*0.9);
		}
		clavier.close();
	}
	public static void myMin() {
		float min,tmp;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre:");
		min = clavier.nextFloat();
		for(int i=0; i < 9;i++) {
			System.out.println("Entrer un nombre:");
			tmp = clavier.nextFloat();
			if(tmp < min){
				min = tmp;
			}
		}
		System.out.println("Min :" + min);
		clavier.close();
	}
	public static void myBase() {
		int n,base,indice;
		int[] result = new int[8];
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre:");
		n = clavier.nextInt();
		System.out.println("Entrer la base:");
		base = clavier.nextInt();
		indice = 0;
		while (n != 0){
			result[indice] = n % base;
			n = n/base;
			indice +=1;
		}
		for (int i = indice-1; i >= 0  ;i-- ){
			System.out.println(result[i]);
		}
		clavier.close();
	}
	public static int myFactorial(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			n *= myFactorial(n - 1);
			System.out.println(n);
			return n;
		}
	}
	public static int mySyracuse(int n) {
		if(n == 1) {
			System.out.println(n);
			return n;
		}
		if(n%2 == 0){
			mySyracuse(n/2);
		}
		else {
			mySyracuse((3*n+1)/2);
		}
		System.out.println(n);
		return n;
	}
	public static void myMonnayeur() {
		int somme,i;
		i = 0;
		int[] money = {500,100,50,20,10,5,2,1};
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer une somme:");
		somme = clavier.nextInt();
		while (somme != 0){
			int nb = 0;
			if (somme >= money[i]){
				nb = somme/money[i];
				somme = somme % money[i];
				System.out.println(nb + "*" + money[i]);
				i+=1;
			}
			else {
				nb = somme / money[i];
				somme = somme % money[i];
				System.out.println(nb + "*" + money[i]);
				i += 1;
			}
		}
		clavier.close();
	}
	public static void myDiv11() {
		int nb;
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre:");
		nb = clavier.nextInt();
		int somme=0;

		if(somme == 0){
			System.out.println(somme);
			System.out.println("Le nombre " + nb + " est ivisible par 11");
		}
		else
			System.out.println(somme);
		System.out.println("Le nombre " + nb + " n'est ivisible par 11");

	}
	public static void myDichotonie() {
		int somme;
		int[] tab = new int[100];
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer la somme:");
		somme = clavier.nextInt();
		
		clavier.close();

	}
	public static void myTri() {
		int[] t = new int[5];
		Scanner clavier = new Scanner(System.in);
		System.out.println("Entrer un nombre:");
		t[0] = clavier.nextInt();
		for (int i = 1; i < t.length; i++)
		{
			System.out.println("Entrer un nombre:");
			t[i] = clavier.nextInt();
			if(t[i]< t[i-1]){
				int tmp;
				tmp = t[i];
				int j = i-1;

				while(j >= 0 && t[j] > tmp)
				{
					t[j+1] = t[j];
					j--;
				}
				t[j+1] = tmp;
			}
		}
		for(int i=0; i < t.length; i++)
		{
			System.out.print(t[i] + " ");
		}
		clavier.close();
	}
	public static void main(String[] args) {
		mySyracuse(10);
	}
}
