package hl;

/* JADX INFO: loaded from: classes4.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f85198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f85199b;

    public Class<T> a() {
        return this.f85198a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f85198a, this.f85199b);
    }
}
