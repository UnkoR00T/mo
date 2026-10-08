package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class y5 extends az implements i00 {
    private static final y5 zzm;
    private static volatile p00 zzn;
    private int zzb;
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private double zzl;
    private fz zze = az.w();
    private fz zzf = az.w();
    private iz zzk = az.z();

    static {
        y5 y5Var = new y5();
        zzm = y5Var;
        az.r(y5.class, y5Var);
    }

    private y5() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0016\u0002\u0016\u0003င\u0000\u0004င\u0001\u0005ဂ\u0002\u0006င\u0003\u0007\u001b\bက\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", x5.class, "zzl"});
        }
        if (i16 == 3) {
            return new y5();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new j5(bArr);
        }
        if (i16 == 5) {
            return zzm;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzn;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (y5.class) {
            try {
                vyVar = zzn;
                if (vyVar == null) {
                    vyVar = new vy(zzm);
                    zzn = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
