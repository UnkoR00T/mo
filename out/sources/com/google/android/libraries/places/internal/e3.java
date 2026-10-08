package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class e3 extends az implements i00 {
    private static final e3 zzv;
    private static volatile p00 zzw;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private tx zzo;
    private tx zzp;
    private tx zzq;
    private long zzr;
    private double zzs;
    private tx zzt;
    private tx zzu;

    static {
        e3 e3Var = new e3();
        zzv = e3Var;
        az.r(e3.class, e3Var);
    }

    private e3() {
        tx txVar = tx.f33820b;
        this.zzo = txVar;
        this.zzp = txVar;
        this.zzq = txVar;
        this.zzt = txVar;
        this.zzu = txVar;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzv, "\u0001\u0011\u0000\u0001\u0001\u0012\u0011\u0000\u0000\u0000\u0001င\u0002\u0002င\u0003\u0003ဇ\u0004\u0004ဇ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bဂ\b\tင\t\nည\n\u000bည\u000b\fည\f\rဂ\r\u000eက\u000e\u000fည\u000f\u0010ည\u0010\u0011᠌\u0000\u0012ဂ\u0001", new Object[]{"zzb", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zze", b4.f31732a, "zzf"});
        }
        if (i16 == 3) {
            return new e3();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new d3(bArr);
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
        synchronized (e3.class) {
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
