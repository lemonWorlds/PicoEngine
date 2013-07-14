package main;

public class DataSet {
	private int median;
	private int deviation;
	private int mode;
	private int mean;
	public DataSet(int median,int deviation,int mode,int mean) {
		this.mean = mean;
		this.median = median;
		this.deviation = deviation;
		this.mode = mode;
	}
	public int getMode() {
		return mode;
	}
	public int getMean() {
		return mean;
	}
	
	public int getDeviation() {
		return deviation;
	}
	public int getMedian() {
		return median;
	}
}
