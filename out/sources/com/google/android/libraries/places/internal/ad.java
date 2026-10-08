package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ad extends az implements i00 {
    private static final ad zzn;
    private static volatile p00 zzo;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zd zzi;
    private id zzj;
    private wd zzk;
    private int zzl;
    private int zzm;

    static {
        ad adVar = new ad();
        zzn = adVar;
        az.r(ad.class, adVar);
    }

    private ad() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b᠌\u0007\t᠌\b", new Object[]{"zzb", "zze", xc.f34254a, "zzf", zc.f34490a, "zzg", "zzh", vc.f34055a, "zzi", "zzj", "zzk", "zzl", tc.f33780a, "zzm", yc.f34388a});
        }
        if (i16 == 3) {
            return new ad();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new uc(bArr);
        }
        if (i16 == 5) {
            return zzn;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzo;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ad.class) {
            try {
                vyVar = zzo;
                if (vyVar == null) {
                    vyVar = new vy(zzn);
                    zzo = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
