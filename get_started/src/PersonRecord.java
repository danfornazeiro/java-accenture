public record PersonRecord(String name, Integer age) {
    public PersonRecord{
        //posso usar para validações. De forma geral não é necessário
    }

    public PersonRecord(String name) {
        this(name, 1);
    }
}
