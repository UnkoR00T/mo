package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class wu0 extends az implements i00 {
    private static final wu0 zzE;
    private static volatile p00 zzF;
    private float zzA;
    private float zzB;
    private boolean zzC;
    private int zzD;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private float zzn;
    private float zzo;
    private float zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private float zzw;
    private float zzx;
    private float zzy;
    private float zzz;

    static {
        wu0 wu0Var = new wu0();
        zzE = wu0Var;
        az.r(wu0.class, wu0Var);
    }

    private wu0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzE, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b\rင\f\u000eင\r\u000fင\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ခ\u0012\u0014ခ\u0013\u0015ခ\u0014\u0016ခ\u0015\u0017ခ\u0016\u0018ခ\u0017\u0019ဇ\u0018\u001aင\u0019", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD"});
        }
        if (i16 == 3) {
            return new wu0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new vu0(bArr);
        }
        if (i16 == 5) {
            return zzE;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzF;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (wu0.class) {
            try {
                vyVar = zzF;
                if (vyVar == null) {
                    vyVar = new vy(zzE);
                    zzF = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
