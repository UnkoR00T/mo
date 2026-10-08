package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class bu0 extends az implements i00 {
    private static final bu0 zzD;
    private static volatile p00 zzE;
    private int zzA;
    private float zzB;
    private float zzC;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private float zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private int zzu;
    private float zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private float zzz;

    static {
        bu0 bu0Var = new bu0();
        zzD = bu0Var;
        az.r(bu0.class, bu0Var);
    }

    private bu0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzD, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005င\u0004\u0006ခ\u0005\u0007င\u0006\bင\u0007\tခ\b\nင\t\u000bင\n\fင\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011င\u0010\u0012ခ\u0011\u0013င\u0012\u0014င\u0013\u0015င\u0014\u0016ခ\u0015\u0017င\u0016\u0018ခ\u0017\u0019ခ\u0018", new Object[]{"zzb", "zze", rt0.a(), "zzf", tt0.a(), "zzg", au0.f31715a, "zzh", yt0.f34434a, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
        }
        if (i16 == 3) {
            return new bu0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new xt0(bArr);
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
        synchronized (bu0.class) {
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
