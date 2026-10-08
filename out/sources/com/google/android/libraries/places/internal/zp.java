package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class zp extends az implements i00 {
    private static final zp zzu;
    private static volatile p00 zzv;
    private int zzb;
    private int zze;
    private ip zzf;
    private ip zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private ip zzn;
    private lp zzo;
    private pp zzp;
    private int zzq;
    private int zzr;
    private np zzs;
    private byte zzt = 2;
    private iz zzh = az.z();

    static {
        zp zpVar = new zp();
        zzu = zpVar;
        az.r(zp.class, zpVar);
    }

    private zp() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i16 == 2) {
            return az.s(zzu, "\u0001\u000f\u0000\u0001\u0002\u0010\u000f\u0000\u0001\u0001\u0002ᔄ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u001b\u0006င\u0003\u0007င\u0004\bင\u0005\tင\u0006\nင\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eင\u000b\u000fင\f\u0010ဉ\r", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", xp.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i16 == 3) {
            return new zp();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new yp(bArr);
        }
        if (i16 == 5) {
            return zzu;
        }
        if (i16 != 6) {
            this.zzt = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        p00 p00Var = zzv;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (zp.class) {
            try {
                vyVar = zzv;
                if (vyVar == null) {
                    vyVar = new vy(zzu);
                    zzv = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
