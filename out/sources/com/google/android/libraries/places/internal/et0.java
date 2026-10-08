package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class et0 extends az implements i00 {
    private static final et0 zzh;
    private static volatile p00 zzi;
    private int zzb;
    private int zze = 0;
    private Object zzf;
    private wh0 zzg;

    static {
        et0 et0Var = new et0();
        zzh = et0Var;
        az.r(et0.class, et0Var);
    }

    private et0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzb", "zzg", bt0.class, dt0.class});
        }
        if (i16 == 3) {
            return new et0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new zs0(bArr);
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
        synchronized (et0.class) {
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
