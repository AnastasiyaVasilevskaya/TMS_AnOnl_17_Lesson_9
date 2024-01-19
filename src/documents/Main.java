package documents;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Register register = new Register();

        Document contractEmployee = new ContractEmployee("CE001", new Date(), new Date(), "Steve Jobs");
        Document contractGoods = new ContractGoods("CG001", new Date(), "bananas", 200);
        Document financialInvoice = new FinancialInvoice("FIN001", new Date(), 2050.5, 228);

        register.saveDoc(contractEmployee);
        register.saveDoc(contractGoods);
        register.saveDoc(financialInvoice);

        register.getInfo(contractEmployee);
        register.getInfo(contractGoods);
        register.getInfo(financialInvoice);
    }
}
