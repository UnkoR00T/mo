package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class qs extends az implements i00 {
    private static final qs zzi;
    private static volatile p00 zzj;
    private int zzb;
    private iz zze = az.z();
    private iz zzf = az.z();
    private iz zzg = az.z();
    private fs zzh;

    static {
        qs qsVar = new qs();
        zzi = qsVar;
        az.r(qs.class, qsVar);
    }

    private qs() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဉ\u0000", new Object[]{"zzb", "zze", aw.class, "zzf", qt.class, "zzg", ps.class, "zzh"});
        }
        if (i16 == 3) {
            return new qs();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ds(bArr);
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
        synchronized (qs.class) {
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
