package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class du0 extends az implements i00 {
    private static final du0 zzv;
    private static volatile p00 zzw;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private float zzi;
    private int zzj;
    private int zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private float zzo;
    private int zzp;
    private float zzq;
    private int zzr;
    private int zzs;
    private float zzt;
    private int zzu;

    static {
        du0 du0Var = new du0();
        zzv = du0Var;
        az.r(du0.class, du0Var);
    }

    private du0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005ခ\u0004\u0006င\u0005\u0007င\u0006\bခ\u0007\tင\b\nင\t\u000bခ\n\fင\u000b\rခ\f\u000eင\r\u000fင\u000e\u0010ခ\u000f\u0011င\u0010", new Object[]{"zzb", "zze", rt0.a(), "zzf", tt0.a(), "zzg", b30.a(), "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i16 == 3) {
            return new du0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new cu0(bArr);
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
        synchronized (du0.class) {
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
