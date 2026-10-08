package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class s8 extends az implements i00 {
    private static final s8 zzn;
    private static volatile p00 zzo;
    private int zzb;
    private pt0 zze;
    private boolean zzf;
    private iz zzg = az.z();
    private iz zzh = az.z();
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;

    static {
        s8 s8Var = new s8();
        zzn = s8Var;
        az.r(s8.class, s8Var);
    }

    private s8() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဇ\u0001\u0003\u001b\u0004\u001b\u0005င\u0002\u0006င\u0003\u0007င\u0004\bင\u0005\tဂ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", hn.class, "zzh", hn.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i16 == 3) {
            return new s8();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new r7(bArr);
        }
        if (i16 == 5) {
            return zzn;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzo;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (s8.class) {
            try {
                vyVar = zzo;
                if (vyVar == null) {
                    vyVar = new vy(zzn);
                    zzo = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
