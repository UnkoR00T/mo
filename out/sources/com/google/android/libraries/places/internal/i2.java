package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class i2 extends az implements i00 {
    private static final i2 zzh;
    private static volatile p00 zzi;
    private int zzb;
    private long zze;
    private int zzf;
    private int zzg;

    static {
        i2 i2Var = new i2();
        zzh = i2Var;
        az.r(i2.class, i2Var);
    }

    private i2() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zzb", "zze", "zzf", h2.f32429a, "zzg"});
        }
        if (i16 == 3) {
            return new i2();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new g2(bArr);
        }
        if (i16 == 5) {
            return zzh;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzi;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (i2.class) {
            try {
                vyVar = zzi;
                if (vyVar == null) {
                    vyVar = new vy(zzh);
                    zzi = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
