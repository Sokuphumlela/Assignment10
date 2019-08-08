package payroll.sercvice;

public interface IServices<T, ID> {
    T create(T type);

    T update(T type);

    void delete(ID id);

    T read(ID id);
}
