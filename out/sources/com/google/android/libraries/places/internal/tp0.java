package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes4.dex */
final class tp0 implements lp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final or0 f33808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final nr0 f33809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final op0 f33810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f33811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f33812e;

    tp0(or0 or0Var, boolean z15) {
        this.f33808a = or0Var;
        nr0 nr0Var = new nr0();
        this.f33809b = nr0Var;
        this.f33810c = new op0(PKIFailureInfo.certConfirmed, false, nr0Var);
        this.f33811d = 16384;
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final synchronized void A1(boolean z15, int i15, int i16) {
        if (this.f33812e) {
            throw new IOException("closed");
        }
        b(0, 8, (byte) 6, z15 ? (byte) 1 : (byte) 0);
        or0 or0Var = this.f33808a;
        or0Var.D2(i15);
        or0Var.D2(i16);
        or0Var.flush();
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final synchronized void G2(int i15, long j15) {
        if (this.f33812e) {
            throw new IOException("closed");
        }
        if (j15 == 0) {
            throw up0.c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{0L});
        }
        b(i15, 4, (byte) 8, (byte) 0);
        or0 or0Var = this.f33808a;
        or0Var.D2((int) j15);
        or0Var.flush();
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final synchronized void J2(xp0 xp0Var) {
        if (this.f33812e) {
            throw new IOException("closed");
        }
        this.f33811d = xp0Var.f(this.f33811d);
        b(0, 0, (byte) 4, (byte) 1);
        this.f33808a.flush();
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final synchronized void K0(xp0 xp0Var) {
        int i15;
        try {
            if (this.f33812e) {
                throw new IOException("closed");
            }
            int i16 = 0;
            b(0, xp0Var.d() * 6, (byte) 4, (byte) 0);
            while (i16 < 10) {
                if (xp0Var.b(i16)) {
                    if (i16 == 4) {
                        int i17 = i16;
                        i16 = 3;
                        i15 = i17;
                    } else {
                        i15 = 7;
                        if (i16 == 7) {
                            i16 = 4;
                        } else {
                            i15 = i16;
                        }
                    }
                    or0 or0Var = this.f33808a;
                    or0Var.x2(i16);
                    or0Var.D2(xp0Var.c(i15));
                    i16 = i15;
                }
                i16++;
            }
            this.f33808a.flush();
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final synchronized void S(int i15, ip0 ip0Var) {
        if (this.f33812e) {
            throw new IOException("closed");
        }
        int i16 = ip0Var.f32605a;
        if (i16 == -1) {
            throw new IllegalArgumentException();
        }
        b(i15, 4, (byte) 3, (byte) 0);
        or0 or0Var = this.f33808a;
        or0Var.D2(i16);
        or0Var.flush();
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final synchronized void V3(boolean z15, int i15, nr0 nr0Var, int i16) {
        if (this.f33812e) {
            throw new IOException("closed");
        }
        b(i15, i16, (byte) 0, z15 ? (byte) 1 : (byte) 0);
        if (i16 > 0) {
            this.f33808a.q1(nr0Var, i16);
        }
    }

    final void b(int i15, int i16, byte b15, byte b16) {
        Logger logger = up0.f33965a;
        Level level = Level.FINE;
        if (logger.isLoggable(level)) {
            up0.f33965a.logp(level, "io.grpc.okhttp.internal.framed.Http2$Writer", "frameHeader", rp0.a(false, i15, i16, b15, b16));
        }
        int i17 = this.f33811d;
        if (i16 > i17) {
            throw up0.c("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i17), Integer.valueOf(i16)});
        }
        if ((Integer.MIN_VALUE & i15) != 0) {
            throw up0.c("reserved bit set: %s", new Object[]{Integer.valueOf(i15)});
        }
        or0 or0Var = this.f33808a;
        or0Var.j3((i16 >>> 16) & GF2Field.MASK);
        or0Var.j3((i16 >>> 8) & GF2Field.MASK);
        or0Var.j3(i16 & GF2Field.MASK);
        or0Var.j3(b15);
        or0Var.j3(b16);
        or0Var.D2(i15 & Integer.MAX_VALUE);
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final synchronized void c() {
        try {
            if (this.f33812e) {
                throw new IOException("closed");
            }
            Logger logger = up0.f33965a;
            Level level = Level.FINE;
            if (logger.isLoggable(level)) {
                up0.f33965a.logp(level, "io.grpc.okhttp.internal.framed.Http2$Writer", "connectionPreface", String.format(">> CONNECTION %s", up0.f33966b.o()));
            }
            or0 or0Var = this.f33808a;
            or0Var.p2(up0.f33966b.t());
            or0Var.flush();
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f33812e = true;
        this.f33808a.close();
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final synchronized void d() {
        if (this.f33812e) {
            throw new IOException("closed");
        }
        this.f33808a.flush();
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final int i() {
        return this.f33811d;
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final synchronized void l1(boolean z15, boolean z16, int i15, int i16, List list) {
        boolean z17 = this.f33812e;
        if (z17) {
            throw new IOException("closed");
        }
        if (z17) {
            throw new IOException("closed");
        }
        this.f33810c.a(list);
        nr0 nr0Var = this.f33809b;
        long jK = nr0Var.K();
        int iMin = (int) Math.min(this.f33811d, jK);
        long j15 = iMin;
        b(i15, iMin, (byte) 1, jK == j15 ? (byte) 4 : (byte) 0);
        or0 or0Var = this.f33808a;
        or0Var.q1(nr0Var, j15);
        if (jK > j15) {
            long j16 = jK - j15;
            while (j16 > 0) {
                int iMin2 = (int) Math.min(this.f33811d, j16);
                long j17 = iMin2;
                j16 -= j17;
                b(i15, iMin2, (byte) 9, j16 == 0 ? (byte) 4 : (byte) 0);
                or0Var.q1(nr0Var, j17);
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.lp0
    public final synchronized void m2(int i15, ip0 ip0Var, byte[] bArr) {
        if (this.f33812e) {
            throw new IOException("closed");
        }
        int i16 = ip0Var.f32605a;
        if (i16 == -1) {
            throw up0.c("errorCode.httpCode == -1", new Object[0]);
        }
        b(0, 8, (byte) 7, (byte) 0);
        or0 or0Var = this.f33808a;
        or0Var.D2(0);
        or0Var.D2(i16);
        or0Var.flush();
    }
}
