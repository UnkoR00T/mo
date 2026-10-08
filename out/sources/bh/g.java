package bh;

/* JADX INFO: loaded from: classes3.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f19428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f19429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f19430c;

    g(Object obj, Object obj2, Object obj3) {
        this.f19428a = obj;
        this.f19429b = obj2;
        this.f19430c = obj3;
    }

    final IllegalArgumentException a() {
        Object obj = this.f19430c;
        Object obj2 = this.f19429b;
        Object obj3 = this.f19428a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
