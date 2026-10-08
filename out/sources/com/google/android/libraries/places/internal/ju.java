package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ju extends az implements i00 {
    private static final ju zzh;
    private static volatile p00 zzi;
    private int zzb;
    private iu zzf;
    private String zze = "";
    private String zzg = "";

    static {
        ju juVar = new ju();
        zzh = juVar;
        az.r(ju.class, juVar);
    }

    private ju() {
    }

    public static ju M() {
        return zzh;
    }

    public final String I() {
        return this.zze;
    }

    public final boolean J() {
        return (this.zzb & 1) != 0;
    }

    public final iu K() {
        iu iuVar = this.zzf;
        return iuVar == null ? iu.L() : iuVar;
    }

    public final String L() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new ju();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new eu(bArr);
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
        synchronized (ju.class) {
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
