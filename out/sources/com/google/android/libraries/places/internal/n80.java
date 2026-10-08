package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class n80 extends az implements i00 {
    private static final n80 zzk;
    private static volatile p00 zzl;
    private int zzb;
    private gt0 zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        n80 n80Var = new n80();
        zzk = n80Var;
        az.r(n80.class, n80Var);
    }

    private n80() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new n80();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new n70(bArr);
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
        synchronized (n80.class) {
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
