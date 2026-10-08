package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gv extends ou {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f30433b = Logger.getLogger(gv.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f30434c = ry.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    hv f30435a;

    private gv() {
        throw null;
    }

    @Deprecated
    static int G(int i15, jx jxVar, ux uxVar) {
        int iD = d(i15 << 3);
        return iD + iD + ((eu) jxVar).a(uxVar);
    }

    public static int a(jx jxVar) {
        int iB = jxVar.b();
        return d(iB) + iB;
    }

    static int b(jx jxVar, ux uxVar) {
        int iA = ((eu) jxVar).a(uxVar);
        return d(iA) + iA;
    }

    public static int c(String str) {
        int length;
        try {
            length = uy.c(str);
        } catch (ty unused) {
            length = str.getBytes(kw.f30476a).length;
        }
        return d(length) + length;
    }

    public static int d(int i15) {
        return (352 - (Integer.numberOfLeadingZeros(i15) * 9)) >>> 6;
    }

    public static int e(long j15) {
        return (640 - (Long.numberOfLeadingZeros(j15) * 9)) >>> 6;
    }

    public abstract void A(String str);

    public abstract void B(int i15, int i16);

    public abstract void C(int i15, int i16);

    public abstract void D(int i15);

    public abstract void E(int i15, long j15);

    public abstract void F(long j15);

    public final void f() {
        if (i() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void g(String str, ty tyVar) throws ev {
        f30433b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) tyVar);
        byte[] bytes = str.getBytes(kw.f30476a);
        try {
            int length = bytes.length;
            D(length);
            u(bytes, 0, length);
        } catch (IndexOutOfBoundsException e15) {
            throw new ev(e15);
        }
    }

    public abstract int i();

    public abstract void j(byte b15);

    public abstract void k(int i15, boolean z15);

    abstract void l(byte[] bArr, int i15, int i16);

    public abstract void m(int i15, yu yuVar);

    public abstract void n(yu yuVar);

    public abstract void o(int i15, int i16);

    public abstract void p(int i15);

    public abstract void q(int i15, long j15);

    public abstract void r(long j15);

    public abstract void s(int i15, int i16);

    public abstract void t(int i15);

    public abstract void u(byte[] bArr, int i15, int i16);

    abstract void v(int i15, jx jxVar, ux uxVar);

    public abstract void w(jx jxVar);

    public abstract void x(int i15, jx jxVar);

    public abstract void y(int i15, yu yuVar);

    public abstract void z(int i15, String str);

    /* synthetic */ gv(fv fvVar) {
    }
}
