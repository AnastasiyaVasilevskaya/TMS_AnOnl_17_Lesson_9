package documents;

import java.util.Date;

public class ContractEmployee extends Document {
    private Date docDateEnd;
    private String employeeName;

    public ContractEmployee(String docNumber, Date docDate, Date docDateEnd, String employeeName) {
        super(docNumber, docDate);
        this.docDateEnd = docDateEnd;
        this.employeeName = employeeName;
    }

    @Override
    void displayInfo() {
        System.out.println("Контракт c сотрудником: ");
        System.out.println("Номер документа и имя сотрудника : " + docNumber + " " + employeeName);
        System.out.println("Дата документа и дата окончания контракта : " + docDate + " " + docDateEnd);
    }
}
