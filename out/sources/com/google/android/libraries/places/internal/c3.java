package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class c3 extends az implements i00 {
    private static final c3 zzi;
    private static volatile p00 zzj;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private float zzh;

    static {
        c3 c3Var = new c3();
        zzi = c3Var;
        az.r(c3.class, c3Var);
    }

    private c3() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004င\u0002\u0005ခ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new c3();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new b3(bArr);
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
        synchronized (c3.class) {
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
