package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class m8 extends az implements i00 {
    private static final m8 zzk;
    private static volatile p00 zzl;
    private int zzb;
    private long zze;
    private int zzf;
    private float zzg;
    private int zzh;
    private float zzi;
    private float zzj;

    static {
        m8 m8Var = new m8();
        zzk = m8Var;
        az.r(m8.class, m8Var);
    }

    private m8() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001စ\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005ခ\u0004\u0006ခ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new m8();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new l8(bArr);
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
        synchronized (m8.class) {
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
