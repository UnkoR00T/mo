package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ss extends az implements i00 {
    private static final ss zzn;
    private static volatile p00 zzo;
    private int zzb;
    private int zze;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private iz zzf = az.z();
    private iz zzm = az.z();

    static {
        ss ssVar = new ss();
        zzn = ssVar;
        az.r(ss.class, ssVar);
    }

    private ss() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzn, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001\f\u0002\u001b\u0003\u0007\u0004င\u0000\u0005င\u0001\u0006င\u0002\u0007င\u0003\b\f\t\u001b", new Object[]{"zzb", "zze", "zzf", mt.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", mt.class});
        }
        if (i16 == 3) {
            return new ss();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new rs(bArr);
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
        synchronized (ss.class) {
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
