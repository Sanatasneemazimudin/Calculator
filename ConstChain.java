class ConstChain {
    int balan, acno, widr;
    ConstChain() {
        this(1000, 5185, 500);
}
    ConstChain(int bal, int accno, int withdr) {
        balan = bal;
        acno = accno;
        widr = withdr;
}
    void display() {
        System.out.println("Account Number: " + acno);
        System.out.println("Balance: " + balan);
        System.out.println("Withdraw: " + widr);
}
    public static void main(String[] args) {
         System.out.println("Sana Tasneem Azimudin=2024503007");
        ConstChain ob = new ConstChain();
        ob.display();
}

}

