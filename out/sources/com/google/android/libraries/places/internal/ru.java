package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ru extends az implements i00 {
    private static final ru zzi;
    private static volatile p00 zzj;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        ru ruVar = new ru();
        zzi = ruVar;
        az.r(ru.class, ruVar);
    }

    private ru() {
    }

    public static ru N() {
        return zzi;
    }

    public final String I() {
        return this.zzb;
    }

    public final String J() {
        return this.zze;
    }

    public final String K() {
        return this.zzf;
    }

    public final String L() {
        return this.zzg;
    }

    public final String M() {
        return this.zzh;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new ru();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new qu(bArr);
        }
        if (i16 == 5) {
            return zzi;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzj;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ru.class) {
            try {
                vyVar = zzj;
                if (vyVar == null) {
                    vyVar = new vy(zzi);
                    zzj = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
