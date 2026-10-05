/**Problem #1: User programmer must remember 
mulitple names even though operation is same*/

  class HDFCBankCashier {		class HDFCBank {
    p s v main(S[] args) {			depositCash(Cash){ }
									depositCheque(Cheque){ }
	//here we need to				depositDD(DD){ }
	//invoke each method			depositNEFT(NEFT){ }
	//separately					depositRTGS(RTGS){ }
									depositIMPS(IMPS){ }
	bank.depositCash(cash);			depositUPI(UPI){ }										
    }					}
   }
		
/*Problem #2: User programmer can not develop one user class 
            common to all sub types of an object. 
	    He must develop separate user class 
	    for each sub type class of an object, 
	    then this kind of code becomes 
	    Tight Coupling and Static Binding  (TC and SB)
            (can not take other sub type objects of same super class)
	    
	== TC and SB user class(ATM) ==	*/   
	
	
	class HDFCATM {				     class HDFCBank extends Bank{
		void insertCard(HDFCBank b){	 	hdfcWithdraw(){ }
			b.hdfcWithdraw();	     }
		}		
	}

	class ICICIATM {			     class ICICIBank extends Bank{	
		void insertCard(ICICIBank b){		iciciWithdraw() { }
			b.iciciWithdraw();	     }
		}	
	}
	
	class SBIATM {				     class SBIBank extends Bank{ 
		void insertCard(SBIBank b) {		sbiWithdraw(){ }
			b.sbiWithdraw();	     }
		}
	}