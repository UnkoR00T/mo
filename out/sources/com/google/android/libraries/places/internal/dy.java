package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dy extends mx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f32107b = p10.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f32108c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f32109a;

    /* synthetic */ dy(byte[] bArr) {
    }

    public static dy c(byte[] bArr, int i15, int i16) {
        return new zx(bArr, i15, i16);
    }

    public static int d(int i15) {
        return (352 - (Integer.numberOfLeadingZeros(i15) * 9)) >>> 6;
    }

    public static int e(long j15) {
        return (640 - (Long.numberOfLeadingZeros(j15) * 9)) >>> 6;
    }

    public static int f(g00 g00Var) {
        int iJ = g00Var.j();
        return d(iJ) + iJ;
    }

    public abstract void A(long j15);

    public abstract void B(long j15);

    public abstract void C(String str);

    public abstract void D();

    public abstract int E();

    public final void g() {
        if (E() > 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
        if (E() < 0) {
            throw new IllegalStateException("Wrote more data than expected.");
        }
    }

    public abstract void i(int i15, int i16);

    public abstract void j(int i15, int i16);

    public abstract void k(int i15, int i16);

    public abstract void l(int i15, int i16);

    public abstract void m(int i15, long j15);

    public abstract void n(int i15, long j15);

    public abstract void o(int i15, boolean z15);

    public abstract void p(int i15, String str);

    public abstract void q(int i15, tx txVar);

    public abstract void r(tx txVar);

    abstract void s(byte[] bArr, int i15, int i16);

    public abstract void t(int i15, g00 g00Var);

    public abstract void u(int i15, tx txVar);

    public abstract void v(g00 g00Var);

    public abstract void w(byte b15);

    public abstract void x(int i15);

    public abstract void y(int i15);

    public abstract void z(int i15);
}
