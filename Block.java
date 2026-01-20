class Block {
    static int bankno;
    static {
        bankno = 890;
        System.out.println("The bank number is " + bankno);
}
    static void staticdisplay() {
        System.out.println("Bank Number: " + bankno);
}
    void display() {
        System.out.println("Bank Number: " + bankno);
}
    public static void main(String[] args) {
        System.out.println("Sana Tasneem Azimudin=2024503007");
        staticdisplay();}

}




