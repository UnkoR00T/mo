package eh;

/* JADX INFO: loaded from: classes3.dex */
public enum l9 implements u1 {
    UNKNOWN_PERFORMANCE(0),
    FAST(1),
    ACCURATE(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50778a;

    l9(int i15) {
        this.f50778a = i15;
    }

    @Override // eh.u1
    public final int zza() {
        return this.f50778a;
    }
}
