package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class hn extends az implements i00 {
    private static final hn zzA;
    private static volatile p00 zzB;
    private int zzb;
    private boolean zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private float zzi;
    private float zzj;
    private boolean zzk;
    private float zzl;
    private double zzm;
    private int zzn;
    private long zzo;
    private float zzp;
    private float zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private float zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    static {
        hn hnVar = new hn();
        zzA = hnVar;
        az.r(hn.class, hnVar);
    }

    private hn() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            ez ezVar = gm.f32398a;
            return az.s(zzA, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဇ\u0006\bခ\u0007\tက\b\n᠌\t\u000bဂ\n\fခ\u000b\rခ\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ခ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", ezVar, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", ezVar, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i16 == 3) {
            return new hn();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new fl(bArr);
        }
        if (i16 == 5) {
            return zzA;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzB;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (hn.class) {
            try {
                vyVar = zzB;
                if (vyVar == null) {
                    vyVar = new vy(zzA);
                    zzB = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
