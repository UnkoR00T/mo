package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class b5 extends az implements i00 {
    private static final b5 zzo;
    private static volatile p00 zzp;
    private int zzb;
    private int zzf;
    private long zzg;
    private float zzh;
    private int zzi;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private String zze = "";
    private String zzj = "";
    private tx zzk = tx.f33820b;

    static {
        b5 b5Var = new b5();
        zzo = b5Var;
        az.r(b5.class, b5Var);
    }

    private b5() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ည\u0006\bဇ\u0007\tဇ\b\n᠌\t", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", d5.f31971a});
        }
        if (i16 == 3) {
            return new b5();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new a5(bArr);
        }
        if (i16 == 5) {
            return zzo;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzp;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (b5.class) {
            try {
                vyVar = zzp;
                if (vyVar == null) {
                    vyVar = new vy(zzo);
                    zzp = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
