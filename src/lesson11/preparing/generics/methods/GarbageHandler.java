package lesson11.preparing.generics.methods;

interface GarbageHandler<T, S> {
    void handle(T what, S how);

    <E> void transfer(E dangerousWaste);
}