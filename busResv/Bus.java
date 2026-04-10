package busResv;

public class Bus {
  private int busNo;
  private boolean ac;
  private int capacity;
  
  Bus(int busNo,boolean ac,int capacity)
  {
	  this.busNo=busNo;
	  this.ac=ac;
	  this.capacity=capacity;
  }
  
  public int getCapacity()
  {
	  return capacity;
  }
  
  public void setCapacity(int cap)
  {
	  capacity=cap;
  }
  
  public boolean isAc()
  {
	  return ac;
  }
  
  public void setAc(boolean val)
  {
	  ac=val;
  }
  
  public int getBusNo()
  {
	  return busNo;
  }
  
  public void displayBusInfo()
  {
	  System.out.println("Bus No: "+busNo+" Ac: "+ac+" Total Capacity: "+capacity);
  }
}
