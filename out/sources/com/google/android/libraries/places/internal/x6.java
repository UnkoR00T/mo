package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class x6 extends az implements i00 {
    private static final x6 zzB;
    private static volatile p00 zzC;
    private int zzA;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private e7 zzt;
    private g7 zzu;
    private u6 zzv;
    private z6 zzw;
    private b7 zzx;
    private int zzy;
    private int zzz;

    static {
        x6 x6Var = new x6();
        zzB = x6Var;
        az.r(x6.class, x6Var);
    }

    private x6() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzB, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ဋ\u0001\u0002ဋ\u0002\u0003ဋ\u0003\u0004ဋ\u0004\u0005ဋ\u0005\u0006ဋ\u0006\u0007ဋ\u0007\bဋ\b\tဋ\t\nဋ\n\u000bဋ\u000b\fဋ\f\rဋ\r\u000eဋ\u000e\u000fဉ\u000f\u0010ဋ\u0000\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015᠌\u0014\u0016ဋ\u0015\u0017ဋ\u0016", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zze", "zzu", "zzv", "zzw", "zzx", "zzy", w6.f34116a, "zzz", "zzA"});
        }
        if (i16 == 3) {
            return new x6();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new v6(bArr);
        }
        if (i16 == 5) {
            return zzB;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzC;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (x6.class) {
            try {
                vyVar = zzC;
                if (vyVar == null) {
                    vyVar = new vy(zzB);
                    zzC = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
