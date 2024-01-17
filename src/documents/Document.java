package documents;

import java.util.Date;

abstract class Document {
    protected String docNumber;
    protected Date docDate;

    public Document(String docNumber, Date docDate) {
        this.docNumber = docNumber;
        this.docDate = docDate;
    }

    abstract void displayInfo();


}
