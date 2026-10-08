package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ew extends az implements i00 {
    private static final ew zzi;
    private static volatile p00 zzj;
    private int zzb;
    private f30 zze;
    private int zzf;
    private cw zzg;
    private int zzh;

    static {
        ew ewVar = new ew();
        zzi = ewVar;
        az.r(ew.class, ewVar);
    }

    private ew() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new ew();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new dw(bArr);
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
        synchronized (ew.class) {
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
