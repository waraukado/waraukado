public class Car{
    private String carName; // メーカー名
    private String carMaker; // 車種名
    private double fuelconsumption; // 燃費
    private double fueltank; // タンク容量（満タン）
    private double fuel; // ガソリン量
    private double mileage = 0; //　走行距離

    // 給油
    public void charge(double fuel){
        if(fuel + this.fuel <= fueltank){
            this.fuel += fuel;
        }else{
            this.fuel = this.fueltank;
        }
    }
    // 走行
    public void run(double mileage){
        // ガス欠判定
        if(this.fuel == 0){
            System.out.println("給油してください！！");
        }else{
            // 走行可能距離算出
            double distance = this.fuel * this.fuelconsumption;

            if(this.fuel >= (mileage / this.fuelconsumption)){
                this.setFuel(this.fuel - ( mileage / this.fuelconsumption));
                this.mileage += mileage;
            }else{
                this.mileage += distance;
                this.fuel=0.0;
                System.out.println(distance + "km走行してガソリンは0になりました");
            }
        }        
    }
    
    // setter getterメソッド
    public void setCarName(String carName){
        this.carName = carName;
    }
    public String getCarName(){
        return this.carName;
    }

    public void setCarMaker(String carMaker){
        this.carMaker = carMaker;
    }
    public String getCarMaker(){
        return this.carMaker;
    }

    public void setFuelconsumption(double fuelconsumption){
        this.fuelconsumption = fuelconsumption;
    }
    public double getFuelconsumption(){
        return this.fuelconsumption;
    }

    public void setFueltank(double fueltank){
        this.fueltank = fueltank;
    }
    public double getFueltank(){
        return this.fueltank;
    }

    public void setFuel(double fuel){
        this.fuel = fuel;
    }
    public double getFuel(){
        return this.fuel;
    }

    public void setMileage(double mileage){
        this.mileage = mileage;
    }
    public double getMileage(){
        return this.mileage;
    }
}