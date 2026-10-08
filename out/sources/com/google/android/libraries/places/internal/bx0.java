package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class bx0 extends az implements i00 {
    private static final bx0 zzh;
    private static volatile p00 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private float zzg;

    static {
        bx0 bx0Var = new bx0();
        zzh = bx0Var;
        az.r(bx0.class, bx0Var);
    }

    private bx0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ခ\u0002", new Object[]{"zzb", "zze", bw0.f31823a, "zzf", av0.f31716a, "zzg"});
        }
        if (i16 == 3) {
            return new bx0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new zt0(bArr);
        }
        if (i16 == 5) {
            return zzh;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzi;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (bx0.class) {
            try {
                vyVar = zzi;
                if (vyVar == null) {
                    vyVar = new vy(zzh);
                    zzi = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
