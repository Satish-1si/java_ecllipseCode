package rajesh_data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CommonEleOfFactorsNMultiples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int count=0;
		int[] a1 = new int[2];
		int[] a2 = new int[2];
		for(int i=0; i<a1.length;i++) {
			a1[i] = sc.nextInt();
		}
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		for(int i=0; i<a1.length;i++) {
				al1.add(a1[i]);
		}
		for(int i=0; i<a2.length;i++) {
			a2[i] = sc.nextInt();
		}
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int i=0; i<a1.length;i++) {
				al2.add(a2[i]);
		}
		System.out.println(al1);
		System.out.println(al2);
		
		al2.sort(Comparator.naturalOrder());
		int hightestEle = al2.get(al2.size()-1);
		ArrayList<Integer> multipleArr1 = new ArrayList<Integer>();
		ArrayList<Integer> multipleArr2 = new ArrayList<Integer>();
		for(int i=0; i<al1.size();i++) {
			for(int j=1; j<hightestEle/2;j++) {
				if(i==0) {
				int num1 = al1.get(i);
			int m1 = num1*j;
			multipleArr1.add(m1);
			
				}
				else if(i==1){
					int num2 = al1.get(i);
					int m2 = num2*j;
					multipleArr2.add(m2);
					
				}
		}
		}
		System.out.println(multipleArr1);
		System.out.println(multipleArr2);
		
		ArrayList<Integer> factorArr1 = new ArrayList<Integer>();
		ArrayList<Integer> factorArr2 = new ArrayList<Integer>();
		ArrayList<Integer> factorArr3 = new ArrayList<Integer>();
		for(int i=0; i<al2.size();i++) {
			int n=al2.get(i);
			for(int j=2; j<n;j++) {
				if(i==0) {
				int num1 = al2.get(i);
			if(num1% j ==0) {
				int m3 = j;
				factorArr1.add(m3);
				
			}	
				}
				else if(i==1){
					int num2 = al2.get(i);
					if(num2 % j ==0) {
						int m4 = j;
						factorArr2.add(m4);
					}
					
				}
				else if(i==2){
					int num3 = al2.get(i);
					if(num3 % j ==0) {
						int m5 = j;
						factorArr3.add(m5);
					}
					
				}
		}			
		}
		System.out.println(factorArr1);
		System.out.println(factorArr2);
		System.out.println(factorArr3);
		ArrayList<Integer> cl1 = new ArrayList<Integer>();
		for(int i=0; i<multipleArr1.size();i++) {
			for(int j=0; j<multipleArr2.size();j++) {
				if(multipleArr1.get(i)==multipleArr2.get(j)) {
					cl1.add(multipleArr2.get(j));
				}
			}		
		}
		ArrayList<Integer> cl2 = new ArrayList<Integer>();
		
		for(int i=0; i<factorArr1.size();i++) {
			for(int j=0; j<factorArr2.size();j++) {
				if(factorArr1.get(i)==factorArr2.get(j)) {
					cl2.add(factorArr2.get(j));
				}
			}		
		}
		ArrayList<Integer> commonEle = new ArrayList<Integer>();
		for(int i=0; i<cl1.size();i++) {
			for(int j=0; j<cl2.size();j++) {
				if(cl1.get(i)==cl2.get(j)) {
					commonEle.add(cl2.get(j));
				}
			}		
		}
		for(int i=0; i<commonEle.size();i++) {
			for(int j=0; j<factorArr2.size();j++) {
				if(commonEle.get(i)==factorArr2.get(j)) {
					count++;
				}
			}		
		}
		
		System.out.println(count);

	}

}
