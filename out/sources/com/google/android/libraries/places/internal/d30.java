package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class d30 extends az implements i00 {
    private static final d30 zzg;
    private static volatile p00 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        d30 d30Var = new d30();
        zzg = d30Var;
        az.r(d30.class, d30Var);
    }

    private d30() {
    }

    public static d30 L() {
        return zzg;
    }

    public final int I() {
        return this.zzb;
    }

    public final int J() {
        return this.zze;
    }

    public final int K() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new d30();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new c30(bArr);
        }
        if (i16 == 5) {
            return zzg;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzh;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (d30.class) {
            try {
                vyVar = zzh;
                if (vyVar == null) {
                    vyVar = new vy(zzg);
                    zzh = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
