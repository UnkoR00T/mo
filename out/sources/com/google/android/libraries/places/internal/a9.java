package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class a9 extends az implements i00 {
    private static final a9 zzv;
    private static volatile p00 zzw;
    private int zzb;
    private x8 zze;
    private i8 zzg;
    private i8 zzh;
    private k2 zzi;
    private int zzj;
    private k8 zzk;
    private g8 zzl;
    private d8 zzm;
    private m8 zzn;
    private b8 zzp;
    private o8 zzq;
    private p7 zzr;
    private r9 zzs;
    private u9 zzt;
    private i9 zzu;
    private iz zzf = az.z();
    private iz zzo = az.z();

    static {
        a9 a9Var = new a9();
        zzv = a9Var;
        az.r(a9.class, a9Var);
    }

    private a9() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006᠌\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000b\u001b\fဉ\t\rဉ\n\u000eဉ\u000b\u000fဉ\f\u0010ဉ\r\u0011ဉ\u000e", new Object[]{"zzb", "zze", "zzf", c9.class, "zzg", "zzh", "zzi", "zzj", z8.f34476a, "zzk", "zzl", "zzm", "zzn", "zzo", t8.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i16 == 3) {
            return new a9();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new y8(bArr);
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
        synchronized (a9.class) {
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
