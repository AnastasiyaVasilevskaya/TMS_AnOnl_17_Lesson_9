package documents;

import exceptions.ContainsAcException;
import exceptions.EndsWith1a2bException;
import exceptions.StartsWith555Exception;

public class DocumentValidator {
    public static void validateDocumentNumber(String docNumber) throws ContainsAcException, StartsWith555Exception, EndsWith1a2bException {
        checkContainsAc(docNumber);
        checkStartsWith555(docNumber);
        checkEndsWith1a2b(docNumber);
    }

    private static void checkContainsAc(String docNumber) throws ContainsAcException {
        if (!docNumber.contains("ac")) {
            throw new ContainsAcException("Document number (" + docNumber + ") doesn't contain the sequence 'ac'. \n");
        }
    }

    private static void checkStartsWith555(String docNumber) throws StartsWith555Exception {
        if (!docNumber.startsWith("555")) {
            throw new StartsWith555Exception("Document number (" + docNumber + ") doesn't start with '555'. \n");
        }
    }

    private static void checkEndsWith1a2b(String docNumber) throws EndsWith1a2bException {
        if (!docNumber.endsWith("1a2b")) {
            throw new EndsWith1a2bException("Document number(" + docNumber + ")  doesn't end with '1a2b'. \n");
        }
    }
}
