package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class wl extends az implements i00 {
    private static final wl zzi;
    private static volatile p00 zzj;
    private int zzb;
    private int zze;
    private iz zzf = az.z();
    private iz zzg = az.z();
    private iz zzh = az.z();

    static {
        wl wlVar = new wl();
        zzi = wlVar;
        az.r(wl.class, wlVar);
    }

    private wl() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001င\u0000\u0002\u001a\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", yl.class, "zzh", se.class});
        }
        if (i16 == 3) {
            return new wl();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new vl(bArr);
        }
        if (i16 == 5) {
            return zzi;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzj;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (wl.class) {
            try {
                vyVar = zzj;
                if (vyVar == null) {
                    vyVar = new vy(zzi);
                    zzj = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
