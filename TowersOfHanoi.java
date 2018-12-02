# Study_notes
/*
 * 递归算法 典型例题 
 * 汉诺塔 
 * 通过对题目的掌握，可知 每个塔可作为三种角色 即 目的塔、辅助塔、原塔
 * 
 */
public class TowersOfHanoi {
	static int time = 0;
	public static void function(int n, char souce, char assistant, char targe) {
		//若只剩下一个，直接移给 目的塔 就完成了 
		//此为该递归的出口  即基本情形
		if(n == 1) {
			time++;
			System.out.println("Time:\t" + time +"\t" +"Move " + souce + " to " + targe);
			return;
		}
		//此为递归情形
		else {
			//若不是剩下最后一个，我们要想将前面的（n-1）移给 辅助塔 
			function(n-1, souce, targe, assistant);//
			time++;
			System.out.println("Time:\t" + time +"\t" +"Move " + souce + " to " + targe);
			//然后将辅助（n-1）个移给 目标塔
			function(n-1, assistant, souce, targe);
		}
	}
	public static void main(String[] args) {
		function(8, 'A', 'B', 'C');
	}
}
