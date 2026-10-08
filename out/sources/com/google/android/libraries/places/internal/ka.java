package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ka extends az implements i00 {
    private static final ka zzv;
    private static volatile p00 zzw;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private iz zzj = az.z();
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;

    static {
        ka kaVar = new ka();
        zzv = kaVar;
        az.r(ka.class, kaVar);
    }

    private ka() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001b\u0007င\u0005\bင\u0006\tင\u0007\nင\b\u000bင\t\fင\n\rင\u000b\u000eင\f\u000fင\r\u0010င\u000e\u0011င\u000f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", ja.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i16 == 3) {
            return new ka();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ha(bArr);
        }
        if (i16 == 5) {
            return zzv;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzw;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ka.class) {
            try {
                vyVar = zzw;
                if (vyVar == null) {
                    vyVar = new vy(zzv);
                    zzw = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
