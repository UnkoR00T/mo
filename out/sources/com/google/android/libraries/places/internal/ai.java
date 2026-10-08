package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class ai extends az implements i00 {
    private static final ai zzl;
    private static volatile p00 zzm;
    private int zzb;
    private p6 zzf;
    private byte zzk = 2;
    private String zze = "";
    private String zzg = "";
    private iz zzh = az.z();
    private String zzi = "";
    private String zzj = "";

    static {
        ai aiVar = new ai();
        zzl = aiVar;
        az.r(ai.class, aiVar);
    }

    private ai() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i16 == 2) {
            return az.s(zzl, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new zh(bArr);
        }
        if (i16 == 5) {
            return zzl;
        }
        if (i16 != 6) {
            this.zzk = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        p00 p00Var = zzm;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (ai.class) {
            try {
                vyVar = zzm;
                if (vyVar == null) {
                    vyVar = new vy(zzl);
                    zzm = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
