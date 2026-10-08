package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class w2 extends az implements i00 {
    private static final w2 zzu;
    private static volatile p00 zzv;
    private int zzb;
    private i3 zzf;
    private k3 zzg;
    private zp zzh;
    private t4 zzi;
    private e5 zzj;
    private v4 zzk;
    private y3 zzl;
    private g3 zzm;
    private l4 zzn;
    private n4 zzo;
    private e4 zzp;
    private a3 zzq;
    private z4 zzr;
    private w3 zzs;
    private byte zzt = 2;
    private int zze = 1;

    static {
        w2 w2Var = new w2();
        zzu = w2Var;
        az.r(w2.class, w2Var);
    }

    private w2() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i16 == 2) {
            return az.s(zzu, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0001\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e", new Object[]{"zzb", "zze", v2.f34019a, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i16 == 3) {
            return new w2();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new u2(bArr);
        }
        if (i16 == 5) {
            return zzu;
        }
        if (i16 != 6) {
            this.zzt = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        p00 p00Var = zzv;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (w2.class) {
            try {
                vyVar = zzv;
                if (vyVar == null) {
                    vyVar = new vy(zzu);
                    zzv = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
