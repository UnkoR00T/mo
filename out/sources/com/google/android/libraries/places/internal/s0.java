package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 extends az implements i00 {
    private static final s0 zzi;
    private static volatile p00 zzj;
    private int zzb;
    private w0 zze;
    private u0 zzf;
    private o0 zzg;
    private m0 zzh;

    static {
        s0 s0Var = new s0();
        zzi = s0Var;
        az.r(s0.class, s0Var);
    }

    private s0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new s0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new r0(bArr);
        }
        if (i16 == 5) {
            return zzi;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzj;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (s0.class) {
            try {
                vyVar = zzj;
                if (vyVar == null) {
                    vyVar = new vy(zzi);
                    zzj = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
