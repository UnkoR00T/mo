package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class sb extends az implements i00 {
    private static final sb zzh;
    private static volatile p00 zzi;
    private int zzb;
    private String zze = "";
    private int zzf;
    private long zzg;

    static {
        sb sbVar = new sb();
        zzh = sbVar;
        az.r(sb.class, sbVar);
    }

    private sb() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zze", "zzf", rb.f33504a, "zzg"});
        }
        if (i16 == 3) {
            return new sb();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new qb(bArr);
        }
        if (i16 == 5) {
            return zzh;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzi;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (sb.class) {
            try {
                vyVar = zzi;
                if (vyVar == null) {
                    vyVar = new vy(zzh);
                    zzi = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
