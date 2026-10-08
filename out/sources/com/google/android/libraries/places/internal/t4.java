package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class t4 extends az implements i00 {
    private static volatile p00 zzA;
    private static final t4 zzz;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private float zzs;
    private float zzt;
    private int zzu;
    private tx zzv = tx.f33820b;
    private long zzw;
    private boolean zzx;
    private boolean zzy;

    static {
        t4 t4Var = new t4();
        zzz = t4Var;
        az.r(t4.class, t4Var);
    }

    private t4() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001င\u0002\u0002င\u0003\u0003င\u0004\u0004ဇ\u0005\u0005င\u0006\u0006င\u0007\u0007င\b\bင\t\tဇ\n\nင\u000b\u000bင\f\fင\r\rခ\u000e\u000eခ\u000f\u000fင\u0010\u0010᠌\u0000\u0011ဂ\u0001\u0012ည\u0011\u0013ဂ\u0012\u0014ဇ\u0013\u0015ဇ\u0014", new Object[]{"zzb", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zze", b4.f31732a, "zzf", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i16 == 3) {
            return new t4();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new s4(bArr);
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
        synchronized (t4.class) {
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
