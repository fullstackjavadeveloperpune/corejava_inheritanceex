package com.fullstack.oops.inheritance;

class RBIBank {

	int rateOfInterest() {
		return 0;
	}
}

class SBIBank extends RBIBank {

	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
}

class HDFCBank extends RBIBank {
	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 11;
	}
}

class CBIBank extends RBIBank {
	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 9;
	}
}

class ICICBank extends RBIBank {
	@Override
	int rateOfInterest() {
		// TODO Auto-generated method stub
		return 10;
	}
}

public class HierarchicalInheritanceEx {

	public static void main(String[] args) {

		RBIBank sbiBank = new SBIBank();
		RBIBank hdfcBank = new HDFCBank();
		RBIBank cbiBank = new CBIBank();
		RBIBank icicBank = new ICICBank();

		System.out.println("SBI Bank ROI: " + sbiBank.rateOfInterest());
		System.out.println("HDFC Bank ROI: " + hdfcBank.rateOfInterest());
		System.out.println("CBI Bank ROI: " + cbiBank.rateOfInterest());
		System.out.println("ICIC Bank ROI: " + icicBank.rateOfInterest());
	}

}
