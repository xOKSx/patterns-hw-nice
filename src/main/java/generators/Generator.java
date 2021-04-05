package generators;

abstract class Generator<T> {

    public final T generate(int code) {
        generateParams(code);
        return buildResponse();
    }

    protected abstract void generateParams(int code);
    protected abstract T buildResponse();
}
