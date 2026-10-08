package ic;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f90872c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90870a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90871b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f90873d = {87, -126};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f90874e = new byte[0];

    @Override // ic.q
    public final byte[] a() {
        return this.f90874e;
    }

    @Override // ic.q
    public final byte[] b() {
        return this.f90873d;
    }

    @Override // ic.p
    public final boolean c() {
        return this.f90872c;
    }

    @Override // ic.q
    public final void d(byte[] bArr) {
        for (byte b15 : bArr) {
            if (b15 != 0) {
                this.f90874e = bArr;
                return;
            }
        }
    }

    @Override // ic.q
    public final String getName() {
        return "Authorization";
    }
}
