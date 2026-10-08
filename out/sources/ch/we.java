package ch;

/* JADX INFO: loaded from: classes3.dex */
public enum we implements n2 {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26464a;

    we(int i15) {
        this.f26464a = i15;
    }

    @Override // ch.n2
    public final int zza() {
        return this.f26464a;
    }
}
