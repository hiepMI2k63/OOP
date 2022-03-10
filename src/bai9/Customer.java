package bai9;


public class Customer {
    private String name;
    private String meterCode;
    private String address;
    public Customer(String name, String meterCode, String address) {
        this.name = name;
        this.meterCode = meterCode;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMeterCode() {
        return meterCode;
    }
    public void setMeterCode(String meterCode) {
        this.meterCode = meterCode;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Customer [address=" + address + ", meterCode=" + meterCode + ", name=" + name + "]";
    }
    
    
}
