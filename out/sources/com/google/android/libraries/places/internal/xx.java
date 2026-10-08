package com.google.android.libraries.places.internal;

import java.io.InputStream;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xx {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f34315f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f34316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f34317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f34318c = f34315f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f34319d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f34320e;

    /* synthetic */ xx(byte[] bArr) {
    }

    public static xx e(InputStream inputStream, int i15) {
        return new wx(inputStream, PKIFailureInfo.certConfirmed, null);
    }

    public static xx f(byte[] bArr, int i15, int i16) {
        return g(bArr, 0, i16, false);
    }

    static xx g(byte[] bArr, int i15, int i16, boolean z15) {
        vx vxVar = new vx(bArr, 0, i16, z15, null);
        try {
            vxVar.a(i16);
            return vxVar;
        } catch (lz e15) {
            throw new IllegalArgumentException(e15);
        }
    }

    public static int l(int i15) {
        return (i15 >>> 1) ^ (-(i15 & 1));
    }

    public static long m(long j15) {
        return (j15 >>> 1) ^ (-(1 & j15));
    }

    public abstract tx A();

    public abstract int B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract int F();

    public abstract long G();

    public abstract int a(int i15);

    public abstract void b(int i15);

    public abstract boolean c();

    public abstract int d();

    public final void h() throws lz {
        if (this.f34316a + this.f34317b >= this.f34318c) {
            throw new lz("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }

    public final void i() {
        if (this.f34317b == 0) {
            o(0);
        }
    }

    public final void j() throws lz {
        boolean zP;
        do {
            int iN = n();
            if (iN == 0) {
                return;
            }
            h();
            this.f34317b++;
            zP = p(iN);
            this.f34317b--;
        } while (zP);
    }

    public final int k(int i15) {
        int i16 = this.f34319d;
        this.f34319d = Integer.MAX_VALUE;
        return i16;
    }

    public abstract int n();

    public abstract void o(int i15);

    public abstract boolean p(int i15);

    public abstract double q();

    public abstract float r();

    public abstract long s();

    public abstract long t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract boolean x();

    public abstract String y();

    public abstract String z();
}
