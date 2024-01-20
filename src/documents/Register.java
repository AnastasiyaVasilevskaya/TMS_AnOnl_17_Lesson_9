package documents;

import exceptions.ContainsAcException;
import exceptions.EndsWith1a2bException;
import exceptions.StartsWith555Exception;

public class Register {
    private Document[] documents;
    private int size;
    private static final int MAX_SIZE = 10;

    public Register() {
        documents = new Document[MAX_SIZE];
        size = 0;
    }

    void saveDoc(Document document) {
        try {
            document.validateDocumentNumber();
            if (size < MAX_SIZE) {
                documents[size++] = document;
                System.out.println("Документ добавлен в регистр \n");
            } else {
                System.out.println("Регистр полон, нельзя сохранить документ");
            }
        } catch (ContainsAcException | StartsWith555Exception | EndsWith1a2bException e) {
            System.out.println("Неккоректное имя документа. Нельзя сохранить в регистр.");
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    void getInfo(Document document) {
        document.displayInfo();
    }

    public void displayAllDocuments() {
        System.out.println("Список документов в регистре:");
        for (int i = 0; i < size; i++) {
            documents[i].displayInfo();
            System.out.println("-------------");
        }
    }

}
