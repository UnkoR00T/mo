package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class uf0 extends az implements i00 {
    private static final uf0 zzm;
    private static volatile p00 zzn;
    private int zzb;
    private gt0 zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;

    static {
        uf0 uf0Var = new uf0();
        zzm = uf0Var;
        az.r(uf0.class, uf0Var);
    }

    private uf0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007င\u0007\bင\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzl", "zzk"});
        }
        if (i16 == 3) {
            return new uf0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new se0(bArr);
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
        synchronized (uf0.class) {
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
