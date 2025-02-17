public class Client {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(2);

        vendingMachine.selectItem();
        vendingMachine.insertCoin(10);

        vendingMachine.selectItem();
        vendingMachine.insertCoin(5);

        vendingMachine.selectItem();
        vendingMachine.insertCoin(10);

        vendingMachine.setOutOfOrder();

        vendingMachine.selectItem();
        vendingMachine.insertCoin(10);
        vendingMachine.dispenseItem();
        vendingMachine.setOutOfOrder();
    }
}
