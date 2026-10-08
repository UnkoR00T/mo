package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class lu extends az implements i00 {
    private static final lu zzf;
    private static volatile p00 zzg;
    private String zzb = "";
    private String zze = "";

    static {
        lu luVar = new lu();
        zzf = luVar;
        az.r(lu.class, luVar);
    }

    private lu() {
    }

    public final String I() {
        return this.zzb;
    }

    public final String J() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzb", "zze"});
        }
        if (i16 == 3) {
            return new lu();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ku(bArr);
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
        synchronized (lu.class) {
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
