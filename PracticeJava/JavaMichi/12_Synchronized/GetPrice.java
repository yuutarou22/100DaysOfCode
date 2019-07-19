class GetPrice extends Thread {
    private CalculatePrice cp;
    public GetPrice(CalculatePrice cp) {
        this.cp = cp;
    }

    public void run() {
        for(int i = 0; i < 5; i++) {
            cp.priceGet();
        }
    }
}