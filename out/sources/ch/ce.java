package ch;

/* JADX INFO: loaded from: classes3.dex */
public final class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private de f25820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f25821b;

    public final ce a(de deVar) {
        this.f25820a = deVar;
        return this;
    }

    public final ce b(Integer num) {
        this.f25821b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final fe d() {
        return new fe(this, null);
    }
}
