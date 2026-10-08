package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r2 extends a2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f30222b = Logger.getLogger(r2.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f30223c = f6.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    s2 f30224a;

    private r2() {
        throw null;
    }

    public static int A(r4 r4Var) {
        int iU = r4Var.u();
        return a(iU) + iU;
    }

    static int B(r4 r4Var, k5 k5Var) {
        int iD = ((t1) r4Var).d(k5Var);
        return a(iD) + iD;
    }

    public static int C(String str) {
        int length;
        try {
            length = l6.e(str);
        } catch (k6 unused) {
            length = str.getBytes(t3.f30241a).length;
        }
        return a(length) + length;
    }

    public static int a(int i15) {
        return (352 - (Integer.numberOfLeadingZeros(i15) * 9)) >>> 6;
    }

    public static int b(long j15) {
        return (640 - (Long.numberOfLeadingZeros(j15) * 9)) >>> 6;
    }

    @Deprecated
    static int z(int i15, r4 r4Var, k5 k5Var) {
        int iA = a(i15 << 3);
        return iA + iA + ((t1) r4Var).d(k5Var);
    }

    public final void c() {
        if (f() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void d(String str, k6 k6Var) throws p2 {
        f30222b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) k6Var);
        byte[] bytes = str.getBytes(t3.f30241a);
        try {
            int length = bytes.length;
            w(length);
            p(bytes, 0, length);
        } catch (IndexOutOfBoundsException e15) {
            throw new p2(e15);
        }
    }

    public abstract int f();

    public abstract void g(byte b15);

    public abstract void h(int i15, boolean z15);

    public abstract void i(int i15, j2 j2Var);

    public abstract void j(int i15, int i16);

    public abstract void k(int i15);

    public abstract void l(int i15, long j15);

    public abstract void m(long j15);

    public abstract void n(int i15, int i16);

    public abstract void o(int i15);

    public abstract void p(byte[] bArr, int i15, int i16);

    abstract void q(int i15, r4 r4Var, k5 k5Var);

    public abstract void r(int i15, r4 r4Var);

    public abstract void s(int i15, j2 j2Var);

    public abstract void t(int i15, String str);

    public abstract void u(int i15, int i16);

    public abstract void v(int i15, int i16);

    public abstract void w(int i15);

    public abstract void x(int i15, long j15);

    public abstract void y(long j15);

    /* synthetic */ r2(q2 q2Var) {
    }
}
