public class HolderNew2 <KEY,VALUE>{
    private KEY data;
    private VALUE sdata;

    public HolderNew2(){
        data = null;
        sdata = null;
    }

    public HolderNew2(KEY data,VALUE sdata){
        this.data = data;
        this.sdata = sdata;
    }

    public KEY getData() {

        return data;
    }

    public void setData(KEY data) {
        this.data = data;
    }

    public VALUE getSdata() {
        return sdata;
    }

    public void setSdata(VALUE sdata) {
        this.sdata =sdata;
    }
}
