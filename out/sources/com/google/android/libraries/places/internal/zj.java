package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zj extends az implements i00 {
    private static final zj zzi;
    private static volatile p00 zzj;
    private int zzb;
    private int zzf;
    private boolean zzh;
    private iz zze = az.z();
    private String zzg = "";

    static {
        zj zjVar = new zj();
        zzi = zjVar;
        az.r(zj.class, zjVar);
    }

    private zj() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002᠌\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"zzb", "zze", "zzf", wj.f34166a, "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new zj();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new yj(bArr);
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
        synchronized (zj.class) {
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
