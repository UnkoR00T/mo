package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class pt0 extends az implements i00 {
    private static final pt0 zzg;
    private static volatile p00 zzh;
    private int zzb;
    private double zze = 1.0d;
    private double zzf = 1.0d;

    static {
        pt0 pt0Var = new pt0();
        zzg = pt0Var;
        az.r(pt0.class, pt0Var);
    }

    private pt0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new pt0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ot0(bArr);
        }
        if (i16 == 5) {
            return zzg;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzh;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (pt0.class) {
            try {
                vyVar = zzh;
                if (vyVar == null) {
                    vyVar = new vy(zzg);
                    zzh = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
