package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class k8 extends az implements i00 {
    private static final k8 zzj;
    private static volatile p00 zzk;
    private int zzb;
    private long zze;
    private s7 zzf;
    private long zzg;
    private int zzh;
    private boolean zzi;

    static {
        k8 k8Var = new k8();
        zzj = k8Var;
        az.r(k8.class, k8Var);
    }

    private k8() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001စ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i16 == 3) {
            return new k8();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new j8(bArr);
        }
        if (i16 == 5) {
            return zzj;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzk;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (k8.class) {
            try {
                vyVar = zzk;
                if (vyVar == null) {
                    vyVar = new vy(zzj);
                    zzk = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
