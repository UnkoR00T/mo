package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class rk extends az implements i00 {
    private static final rk zze;
    private static volatile p00 zzf;
    private iz zzb = az.z();

    static {
        rk rkVar = new rk();
        zze = rkVar;
        az.r(rk.class, rkVar);
    }

    private rk() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i16 == 3) {
            return new rk();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new qk(bArr);
        }
        if (i16 == 5) {
            return zze;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzf;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (rk.class) {
            try {
                vyVar = zzf;
                if (vyVar == null) {
                    vyVar = new vy(zze);
                    zzf = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
