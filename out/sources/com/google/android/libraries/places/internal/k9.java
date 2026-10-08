package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class k9 extends az implements i00 {
    private static final k9 zzi;
    private static volatile p00 zzj;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private long zzh;

    static {
        k9 k9Var = new k9();
        zzi = k9Var;
        az.r(k9.class, k9Var);
    }

    private k9() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new k9();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new j9(bArr);
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
        synchronized (k9.class) {
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
