public class DispensingState implements VendingMachineState {
    @Override
    public void selectItem(VendingMachine machine) {
        System.out.println("Cannot select item while dispensing.");
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coins while dispensing.");
    }

    @Override
    public void dispenseItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            machine.reduceInventory();
            machine.setBalance(0);
            System.out.println("Item dispensed.");
            machine.setState(new IdleState());
        } else {
            System.out.println("Machine out of stock.");
            machine.setState(new OutOfOrderState());
        }
    }

    @Override
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine out of order.");
        machine.setState(new OutOfOrderState());
    }
}
