package documents;

import exceptions.ContainsAcException;
import exceptions.EndsWith1a2bException;
import exceptions.StartsWith555Exception;

import java.util.Date;

abstract class Document {
    protected String docNumber;
    protected Date docDate;

    public Document(String docNumber, Date docDate) {
        this.docNumber = docNumber;
        this.docDate = docDate;
    }

    abstract void displayInfo();

    public void validateDocumentNumber() throws ContainsAcException, StartsWith555Exception, EndsWith1a2bException {
        DocumentValidator.validateDocumentNumber(docNumber);
    }
}
