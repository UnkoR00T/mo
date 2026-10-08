package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class yt extends az implements i00 {
    private static final yt zzj;
    private static volatile p00 zzk;
    private int zzb;
    private h30 zze;
    private h30 zzf;
    private yv zzg;
    private iz zzh = az.z();
    private String zzi = "";

    static {
        yt ytVar = new yt();
        zzj = ytVar;
        az.r(yt.class, ytVar);
    }

    private yt() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0001\u0004\u001b\u0005Ȉ", new Object[]{"zzb", "zze", "zzg", "zzf", "zzh", cs.class, "zzi"});
        }
        if (i16 == 3) {
            return new yt();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new xt(bArr);
        }
        if (i16 == 5) {
            return zzj;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzk;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (yt.class) {
            try {
                vyVar = zzk;
                if (vyVar == null) {
                    vyVar = new vy(zzj);
                    zzk = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
