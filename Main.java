class Main{
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item item1 = new Item("Apples", 20);
        Item item2 = new Item("Sword",2);

        inventory.addItem(item1);
        inventory.addItem(item2);

        inventory.displayInventory();

    }
}