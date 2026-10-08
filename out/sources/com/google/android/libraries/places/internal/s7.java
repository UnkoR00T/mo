package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class s7 extends az implements i00 {
    private static final s7 zzi;
    private static volatile p00 zzj;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private int zzh;

    static {
        s7 s7Var = new s7();
        zzi = s7Var;
        az.r(s7.class, s7Var);
    }

    private s7() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new s7();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new q7(bArr);
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
        synchronized (s7.class) {
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
