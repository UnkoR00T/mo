package fs;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f66804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f66806c;

    public d(int i15, int i16, int i17) {
        this.f66804a = i15;
        this.f66805b = i16;
        this.f66806c = i17;
    }

    public final int a() {
        return this.f66805b;
    }

    public final int b() {
        return this.f66804a;
    }

    public final int c() {
        return this.f66806c;
    }

    public final boolean d(int i15) {
        return ((i15 >>> this.f66804a) & ((1 << this.f66805b) - 1)) == this.f66806c;
    }

    public d(ws.b.d<?> dVar, int i15) {
        this(dVar.f214746a, dVar.f214747b, i15);
    }

    public d(ws.b.C5702b c5702b) {
        this(c5702b, 1);
    }
}
