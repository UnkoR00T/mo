package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class o20 extends az implements i00 {
    private static final o20 zzg;
    private static volatile p00 zzh;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";

    static {
        o20 o20Var = new o20();
        zzg = o20Var;
        az.r(o20.class, o20Var);
    }

    private o20() {
    }

    public static o20 J() {
        return zzg;
    }

    public final String I() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new o20();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new n20(bArr);
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
        synchronized (o20.class) {
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
