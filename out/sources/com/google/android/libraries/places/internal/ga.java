package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ga extends az implements i00 {
    private static final ga zzh;
    private static volatile p00 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        ga gaVar = new ga();
        zzh = gaVar;
        az.r(ga.class, gaVar);
    }

    private ga() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new ga();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new fa(bArr);
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
        synchronized (ga.class) {
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
