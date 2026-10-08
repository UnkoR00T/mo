package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class k30 extends az implements i00 {
    private static final k30 zzg;
    private static volatile p00 zzh;
    private String zzb = "";
    private long zze;
    private int zzf;

    static {
        k30 k30Var = new k30();
        zzg = k30Var;
        az.r(k30.class, k30Var);
    }

    private k30() {
    }

    public static k30 L() {
        return zzg;
    }

    public final String I() {
        return this.zzb;
    }

    public final long J() {
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
            return az.s(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new k30();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new i30(bArr);
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
        synchronized (k30.class) {
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
