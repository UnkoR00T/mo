package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class i20 extends az implements i00 {
    private static final i20 zzh;
    private static volatile p00 zzi;
    private int zzb;
    private vb zze;
    private k40 zzf;
    private pt0 zzg;

    static {
        i20 i20Var = new i20();
        zzh = i20Var;
        az.r(i20.class, i20Var);
    }

    private i20() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new i20();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new i10(bArr);
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
        synchronized (i20.class) {
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
