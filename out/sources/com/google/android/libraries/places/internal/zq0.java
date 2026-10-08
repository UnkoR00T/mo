package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zq0 extends az implements i00 {
    private static final zq0 zzh;
    private static volatile p00 zzi;
    private int zzb;
    private pt0 zze;
    private ps0 zzf;
    private iz zzg = az.z();

    static {
        zq0 zq0Var = new zq0();
        zzh = zq0Var;
        az.r(zq0.class, zq0Var);
    }

    private zq0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", vs0.class});
        }
        if (i16 == 3) {
            return new zq0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new eq0(bArr);
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
        synchronized (zq0.class) {
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
