package com.java.phraseomatic;

public class Main {

    public static void main(String[] args) {
	String [] wordListOne = {"thrive","disturbed","desk","north","set","mindless","nervous","suggestion"};
	String [] wordListTwo = {"prison","obedient","avoid","functional","brothers","army","parallel","humorous","disastrous"};
	String [] wordListThree = {"careful","stale","bumpy","giants","statuesque","foretell","knot","goose","type","subsequent"};

	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;

	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);

	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

	System.out.println("What we need is a " + phrase);
    }
}
