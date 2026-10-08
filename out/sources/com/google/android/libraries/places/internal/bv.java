package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class bv extends az implements i00 {
    private static final bv zzf;
    private static volatile p00 zzg;
    private int zzb;
    private d30 zze;

    static {
        bv bvVar = new bv();
        zzf = bvVar;
        az.r(bv.class, bvVar);
    }

    private bv() {
    }

    public final d30 I() {
        d30 d30Var = this.zze;
        return d30Var == null ? d30.L() : d30Var;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i16 == 3) {
            return new bv();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new av(bArr);
        }
        if (i16 == 5) {
            return zzf;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzg;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (bv.class) {
            try {
                vyVar = zzg;
                if (vyVar == null) {
                    vyVar = new vy(zzf);
                    zzg = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
