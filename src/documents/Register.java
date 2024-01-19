package documents;

public class Register {
    private Document[] documents;
    private int size;
    private static final int MAX_SIZE = 10;

    public Register() {
        documents = new Document[MAX_SIZE];
        size = 0;
    }

    void saveDoc(Document document) {
        if (size < MAX_SIZE) {
            documents[size++] = document;
            System.out.println("Документ добавлен в регистр");
        } else {
            System.out.println("Регистр полон, нельзя сохранить документ");
        }
    }

    void getInfo(Document document) {
        document.displayInfo();
    }
}
