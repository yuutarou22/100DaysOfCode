class ExClassStatic {
    /**
     * staticで定義すると、インスタンス間で値を共有したい時に使える。
     */
    private static int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }
}