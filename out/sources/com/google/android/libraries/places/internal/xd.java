package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class xd extends az implements i00 {
    private static final xd zzw;
    private static volatile p00 zzx;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private float zzi;
    private boolean zzj;
    private iz zzk = az.z();
    private iz zzl = az.z();
    private iz zzm = az.z();
    private iz zzn = az.z();
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private long zzv;

    static {
        xd xdVar = new xd();
        zzw = xdVar;
        az.r(xd.class, xdVar);
    }

    private xd() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzw, "\u0001\u0012\u0000\u0001\u0001\u0012\u0012\u0000\u0004\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006ဇ\u0005\u0007\u001a\b\u001b\t\u001b\nင\u0006\u000bဂ\r\fင\u000b\rင\u0007\u000eင\b\u000fင\t\u0010င\n\u0011\u001b\u0012င\f", new Object[]{"zzb", "zze", jo.f32668a, "zzf", "zzg", "zzh", "zzi", "zzj", "zzl", "zzm", hn.class, "zzn", hn.class, "zzo", "zzv", "zzt", "zzp", "zzq", "zzr", "zzs", "zzk", gt0.class, "zzu"});
        }
        if (i16 == 3) {
            return new xd();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new wc(bArr);
        }
        if (i16 == 5) {
            return zzw;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzx;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (xd.class) {
            try {
                vyVar = zzx;
                if (vyVar == null) {
                    vyVar = new vy(zzw);
                    zzx = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
