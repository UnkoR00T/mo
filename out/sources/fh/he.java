package fh;

/* JADX INFO: loaded from: classes3.dex */
public enum he implements x1 {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f63086a;

    he(int i15) {
        this.f63086a = i15;
    }

    @Override // fh.x1
    public final int zza() {
        return this.f63086a;
    }
}
