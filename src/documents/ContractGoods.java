package documents;

import java.util.Date;

public class ContractGoods extends Document{

    private String goodType;
    private int goodAmount;

    public ContractGoods(String docNumber, Date docDate, String goodType, int goodAmount) {
        super(docNumber, docDate);
        this.goodType = goodType;
        this.goodAmount = goodAmount;
    }

    @Override
    void displayInfo() {
        System.out.println("Контракт на поставку товаров: ");
        System.out.println("Номер документа и дата : " + docNumber + " " + docDate);
        System.out.println("Название товара, количество : " + goodType + " " + goodAmount);
    }
}
