package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class bn0 extends az implements i00 {
    private static final bn0 zzk;
    private static volatile p00 zzl;
    private int zzb;
    private int zze;
    private float zzf;
    private float zzg;
    private boolean zzh;
    private int zzi;
    private long zzj;

    static {
        bn0 bn0Var = new bn0();
        zzk = bn0Var;
        az.r(bn0.class, bn0Var);
    }

    private bn0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new bn0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new am0(bArr);
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
        synchronized (bn0.class) {
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
