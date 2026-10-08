package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ja extends az implements i00 {
    private static final ja zzm;
    private static volatile p00 zzn;
    private int zzb;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzl;
    private String zze = "";
    private iz zzk = az.z();

    static {
        ja jaVar = new ja();
        zzm = jaVar;
        az.r(ja.class, jaVar);
    }

    private ja() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007\u001b\bင\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", ga.class, "zzl"});
        }
        if (i16 == 3) {
            return new ja();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ia(bArr);
        }
        if (i16 == 5) {
            return zzm;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzn;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ja.class) {
            try {
                vyVar = zzn;
                if (vyVar == null) {
                    vyVar = new vy(zzm);
                    zzn = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
