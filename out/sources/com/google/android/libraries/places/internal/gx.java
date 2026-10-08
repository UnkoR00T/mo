package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class gx extends az implements i00 {
    private static final gx zzk;
    private static volatile p00 zzl;
    private int zzb;
    private pt0 zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        gx gxVar = new gx();
        zzk = gxVar;
        az.r(gx.class, gxVar);
    }

    private gx() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဉ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzf", "zze", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new gx();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new fw(bArr);
        }
        if (i16 == 5) {
            return zzk;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzl;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (gx.class) {
            try {
                vyVar = zzl;
                if (vyVar == null) {
                    vyVar = new vy(zzk);
                    zzl = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
