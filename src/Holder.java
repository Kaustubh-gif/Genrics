public class Holder {
    private int number;

    public Holder(){
        number = 20;
    }

    public Holder(int number){
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setData(Object data){
        System.out.println(data);
    }


}
