package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class k3 extends az implements i00 {
    private static final k3 zzm;
    private static volatile p00 zzn;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        k3 k3Var = new k3();
        zzm = k3Var;
        az.r(k3.class, k3Var);
    }

    private k3() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i16 == 3) {
            return new k3();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new j3(bArr);
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
        synchronized (k3.class) {
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
