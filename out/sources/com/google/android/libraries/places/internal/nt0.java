package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class nt0 extends az implements i00 {
    private static volatile p00 zzA;
    private static final nt0 zzz;
    private int zzb;
    private int zze;
    private int zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private float zzm;
    private int zzn;
    private int zzo;
    private float zzp;
    private int zzq;
    private float zzr;
    private float zzs;
    private double zzt;
    private int zzu;
    private boolean zzv;
    private int zzw;
    private boolean zzx;
    private int zzy;

    static {
        nt0 nt0Var = new nt0();
        zzz = nt0Var;
        az.r(nt0.class, nt0Var);
    }

    private nt0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006ခ\u0005\u0007င\u0006\bင\u0007\tခ\b\nင\t\u000bင\n\fခ\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010က\u000f\u0011᠌\u0010\u0012ဇ\u0011\u0013᠌\u0012\u0014ဇ\u0013\u0015᠌\u0014", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", mt0.f32991a, "zzv", "zzw", kt0.f32758a, "zzx", "zzy", lt0.f32883a});
        }
        if (i16 == 3) {
            return new nt0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new jt0(bArr);
        }
        if (i16 == 5) {
            return zzz;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzA;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (nt0.class) {
            try {
                vyVar = zzA;
                if (vyVar == null) {
                    vyVar = new vy(zzz);
                    zzA = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
