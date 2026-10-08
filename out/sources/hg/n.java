package hg;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends UnsupportedOperationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final gg.c f84318a;

    public n(gg.c cVar) {
        this.f84318a = cVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Missing ".concat(String.valueOf(this.f84318a));
    }
}
