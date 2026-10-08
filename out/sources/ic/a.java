package ic;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f90866c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f90864a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f90865b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f90867d = {87, -127};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f90868e = new byte[0];

    @Override // ic.q
    public final byte[] a() {
        return this.f90868e;
    }

    @Override // ic.q
    public final byte[] b() {
        return this.f90867d;
    }

    @Override // ic.p
    public final boolean c() {
        return this.f90866c;
    }

    @Override // ic.q
    public final void d(byte[] bArr) {
        for (byte b15 : bArr) {
            if (b15 != 0) {
                this.f90868e = bArr;
                return;
            }
        }
    }

    @Override // ic.q
    public final String getName() {
        return "Authentication";
    }
}
