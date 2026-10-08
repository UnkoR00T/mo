package eh;

/* JADX INFO: loaded from: classes3.dex */
public enum i9 implements u1 {
    UNKNOWN_CONTOURS(0),
    NO_CONTOURS(1),
    ALL_CONTOURS(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f50676a;

    i9(int i15) {
        this.f50676a = i15;
    }

    @Override // eh.u1
    public final int zza() {
        return this.f50676a;
    }
}
