package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class uu0 extends az implements i00 {
    private static final uu0 zzD;
    private static volatile p00 zzE;
    private boolean zzA;
    private int zzB;
    private int zzC;
    private int zzb;
    private int zze;
    private int zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private float zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        uu0 uu0Var = new uu0();
        zzD = uu0Var;
        az.r(uu0.class, uu0Var);
    }

    private uu0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzD, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006ခ\u0005\u0007င\u0006\bင\u0007\tင\b\nခ\t\u000bင\n\fင\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ဇ\u0012\u0014င\u0013\u0015င\u0014\u0016᠌\u0015\u0017ဇ\u0016\u0018င\u0017\u0019᠌\u0018", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", su0.f33720a, "zzA", "zzB", "zzC", tu0.f33814a});
        }
        if (i16 == 3) {
            return new uu0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ru0(bArr);
        }
        if (i16 == 5) {
            return zzD;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzE;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (uu0.class) {
            try {
                vyVar = zzE;
                if (vyVar == null) {
                    vyVar = new vy(zzD);
                    zzE = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
