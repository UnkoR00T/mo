package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class hu0 extends az implements i00 {
    private static final hu0 zzg;
    private static volatile p00 zzh;
    private int zzb;
    private fu0 zze;
    private fu0 zzf;

    static {
        hu0 hu0Var = new hu0();
        zzg = hu0Var;
        az.r(hu0.class, hu0Var);
    }

    private hu0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new hu0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new gu0(bArr);
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
        synchronized (hu0.class) {
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
