package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class h1 extends az implements i00 {
    private static final h1 zzj;
    private static volatile p00 zzk;
    private int zzb;
    private y0 zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        h1 h1Var = new h1();
        zzj = h1Var;
        az.r(h1.class, h1Var);
    }

    private h1() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i16 == 3) {
            return new h1();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new g1(bArr);
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
        synchronized (h1.class) {
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
