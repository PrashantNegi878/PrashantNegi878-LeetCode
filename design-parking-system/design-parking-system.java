class ParkingSystem {
    int b,m,s;
    public ParkingSystem(int big, int medium, int small) {
        b=big;
        m=medium;
        s=small;
    }
    
    public boolean addCar(int carType) {
        int temp;
        if(carType==1)  temp=--b;
        else if(carType==2) temp=--m;
        else temp=--s;
        System.out.println(temp);
        if(temp>=0)  return true;
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */