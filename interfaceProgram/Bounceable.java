interface Bounceable{
	int x =1;//bydefault public static final(interface variable are)
	static int y = 2;

	void bounce();//bydefault public abstract void bounce();
	void setBounceFactor();
	default int m1(){return 1};
}
