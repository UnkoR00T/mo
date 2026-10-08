package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class di extends az implements i00 {
    private static final di zzi;
    private static volatile p00 zzj;
    private int zzb;
    private s6 zzf;
    private kg zzg;
    private byte zzh = 2;
    private String zze = "";

    static {
        di diVar = new di();
        zzi = diVar;
        az.r(di.class, diVar);
    }

    private di() {
    }

    public static bi I() {
        return (bi) zzi.o();
    }

    final /* synthetic */ void J(kg kgVar) {
        this.zzg = kgVar;
        this.zzb |= 4;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i16 == 2) {
            return az.s(zzi, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new di();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new bi(bArr);
        }
        if (i16 == 5) {
            return zzi;
        }
        if (i16 != 6) {
            this.zzh = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        p00 p00Var = zzj;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (di.class) {
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
