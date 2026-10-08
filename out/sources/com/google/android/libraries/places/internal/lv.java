package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class lv extends az implements i00 {
    private static final lv zzi;
    private static volatile p00 zzj;
    private int zzb;
    private h30 zze;
    private h30 zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        lv lvVar = new lv();
        zzi = lvVar;
        az.r(lv.class, lvVar);
    }

    private lv() {
    }

    public static lv M() {
        return zzi;
    }

    public final h30 I() {
        h30 h30Var = this.zze;
        return h30Var == null ? h30.K() : h30Var;
    }

    public final String J() {
        return this.zzf;
    }

    public final h30 K() {
        h30 h30Var = this.zzg;
        return h30Var == null ? h30.K() : h30Var;
    }

    public final String L() {
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
            return az.s(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new lv();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new kv(bArr);
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
        synchronized (lv.class) {
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
