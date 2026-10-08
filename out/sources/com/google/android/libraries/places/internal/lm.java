package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class lm extends az implements i00 {
    private static final lm zzh;
    private static volatile p00 zzi;
    private int zzb;
    private long zze;
    private long zzf;
    private long zzg;

    static {
        lm lmVar = new lm();
        zzh = lmVar;
        az.r(lm.class, lmVar);
    }

    private lm() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new lm();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new km(bArr);
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
        synchronized (lm.class) {
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
