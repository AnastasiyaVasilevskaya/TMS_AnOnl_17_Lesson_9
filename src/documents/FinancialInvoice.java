package documents;

import java.util.Date;

public class FinancialInvoice extends Document {
    private double totalSumMonth;
    private int departmentKod;

    public FinancialInvoice(String docNumber, Date docDate, double totalSumMonth, int departmentKod) {
        super(docNumber, docDate);
        this.totalSumMonth = totalSumMonth;
        this.departmentKod = departmentKod;
    }

    @Override
    void displayInfo() {
        System.out.println("Финансовая накладная : ");
        System.out.println("Номер документа и дата : " + docNumber + " " + docDate);
        System.out.println("Код департамента, итоговая сумма за месяц : " + departmentKod + ", " + totalSumMonth);
        System.out.println();
    }
}
