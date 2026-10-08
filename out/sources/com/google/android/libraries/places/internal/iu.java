package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class iu extends az implements i00 {
    private static final iu zzh;
    private static volatile p00 zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private hu zzg;

    static {
        iu iuVar = new iu();
        zzh = iuVar;
        az.r(iu.class, iuVar);
    }

    private iu() {
    }

    public static iu L() {
        return zzh;
    }

    public final String I() {
        return this.zze;
    }

    public final String J() {
        return this.zzf;
    }

    public final hu K() {
        hu huVar = this.zzg;
        return huVar == null ? hu.K() : huVar;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new iu();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new fu(bArr);
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
        synchronized (iu.class) {
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
