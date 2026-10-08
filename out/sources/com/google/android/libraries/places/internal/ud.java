package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ud extends az implements i00 {
    private static final ud zzx;
    private static volatile p00 zzy;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private fz zzj = az.w();
    private int zzk;
    private ad zzl;
    private qd zzm;
    private ac zzn;
    private kd zzo;
    private gd zzp;
    private md zzq;
    private dc zzr;
    private ic zzs;
    private ce zzt;
    private je zzu;
    private rc zzv;
    private nc zzw;

    static {
        ud udVar = new ud();
        zzx = udVar;
        az.r(ud.class, udVar);
    }

    private ud() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzx, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0001\u0000\u0001᠌\u0001\u0002᠌\u0002\u0003င\u0003\u0004ဉ\u0006\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\t\bဇ\u0004\tဉ\n\nဉ\u000b\u000b\u0016\fင\u0005\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011င\u0000\u0012ဉ\u0010\u0013ဉ\u0011", new Object[]{"zzb", "zzf", sd.f33677a, "zzg", td.f33782a, "zzh", "zzl", "zzm", "zzn", "zzo", "zzi", "zzp", "zzq", "zzj", "zzk", "zzr", "zzs", "zzt", "zzu", "zze", "zzv", "zzw"});
        }
        if (i16 == 3) {
            return new ud();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new rd(bArr);
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
        synchronized (ud.class) {
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
