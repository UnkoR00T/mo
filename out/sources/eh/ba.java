package eh;

/* JADX INFO: loaded from: classes3.dex */
public enum ba implements u1 {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50286a;

    ba(int i15) {
        this.f50286a = i15;
    }

    @Override // eh.u1
    public final int zza() {
        return this.f50286a;
    }
}
