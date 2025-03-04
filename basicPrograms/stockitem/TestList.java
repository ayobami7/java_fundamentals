package basicPrograms.stockitem;

public class TestList {
    public static void main(String[] args) {
        StockList testList = new StockList();

        StockItem item1 = new StockItem("baked beans", 12, 34);
        StockItem item2 = new StockItem("beans", 6, 84);

        testList.addStockItem(item1);
        testList.addStockItem(item2);

        testList.removeItem(3);

        int a = testList.noOfStockItems();
        System.out.println(a);

//        testList.showAllItems();
//        System.out.println(testList.getAllItems());

//        System.out.println(testList.getItem(0));
        System.out.println(testList.getItem("damn"));
    }

}
