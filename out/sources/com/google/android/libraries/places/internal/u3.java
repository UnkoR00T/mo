package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class u3 extends az implements i00 {
    private static volatile p00 zzA;
    private static final u3 zzz;
    private int zzb;
    private int zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private tx zzn;
    private long zzo;
    private tx zzp;
    private long zzq;
    private tx zzr;
    private long zzs;
    private tx zzt;
    private iz zzu;
    private iz zzv;
    private iz zzw;
    private boolean zzx;
    private int zzy;

    static {
        u3 u3Var = new u3();
        zzz = u3Var;
        az.r(u3.class, u3Var);
    }

    private u3() {
        tx txVar = tx.f33820b;
        this.zzn = txVar;
        this.zzp = txVar;
        this.zzr = txVar;
        this.zzt = txVar;
        this.zzu = az.z();
        this.zzv = az.z();
        this.zzw = az.z();
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            ez ezVar = p3.f33261a;
            ez ezVar2 = o3.f33123a;
            return az.s(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006\bင\u0007\tဂ\b\nည\t\u000bဂ\n\fည\u000b\rဂ\f\u000eည\r\u000fဂ\u000e\u0010ည\u000f\u0011\u001b\u0012\u001b\u0013\u001b\u0014ဇ\u0010\u0015င\u0011", new Object[]{"zzb", "zze", ezVar, "zzf", "zzg", "zzh", "zzi", ezVar2, "zzj", ezVar2, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", t3.class, "zzv", t3.class, "zzw", r3.class, "zzx", "zzy"});
        }
        if (i16 == 3) {
            return new u3();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new l3(bArr);
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
        synchronized (u3.class) {
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
