package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends az implements i00 {
    private static final k zzx;
    private static volatile p00 zzy;
    private int zzb;
    private gt0 zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private float zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private iz zzr = az.z();
    private iz zzs = az.z();
    private int zzt;
    private int zzu;
    private int zzv;
    private long zzw;

    static {
        k kVar = new k();
        zzx = kVar;
        az.r(k.class, kVar);
    }

    private k() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzx, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0002\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tခ\b\nဂ\t\u000bင\n\fဇ\u000b\r᠌\f\u000e\u001b\u000f\u001b\u0010င\r\u0011င\u000e\u0012ဂ\u0010\u0013င\u000f", new Object[]{"zzb", "zze", "zzf", a.f31547a, "zzg", "zzh", jo.f32668a, "zzi", e71.f32169a, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", q6.f33391a, "zzr", hn.class, "zzs", hn.class, "zzt", "zzu", "zzw", "zzv"});
        }
        if (i16 == 3) {
            return new k();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new la1(bArr);
        }
        if (i16 == 5) {
            return zzx;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzy;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (k.class) {
            try {
                vyVar = zzy;
                if (vyVar == null) {
                    vyVar = new vy(zzx);
                    zzy = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
