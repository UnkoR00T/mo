package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class rm extends az implements i00 {
    private static final rm zzs;
    private static volatile p00 zzt;
    private int zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private tx zzn;
    private tx zzo;
    private float zzp;
    private int zzq;
    private int zzr;

    static {
        rm rmVar = new rm();
        zzs = rmVar;
        az.r(rm.class, rmVar);
    }

    private rm() {
        tx txVar = tx.f33820b;
        this.zzn = txVar;
        this.zzo = txVar;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0007\u0004င\b\u0005ဂ\u0002\u0006ည\t\u0007ဂ\u0003\bည\n\tင\u0004\nင\u0005\u000bခ\u000b\fင\f\rင\u0006\u000eင\r", new Object[]{"zzb", "zze", "zzf", "zzl", "zzm", "zzg", "zzn", "zzh", "zzo", "zzi", "zzj", "zzp", "zzq", "zzk", "zzr"});
        }
        if (i16 == 3) {
            return new rm();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new qm(bArr);
        }
        if (i16 == 5) {
            return zzs;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzt;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (rm.class) {
            try {
                vyVar = zzt;
                if (vyVar == null) {
                    vyVar = new vy(zzs);
                    zzt = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
