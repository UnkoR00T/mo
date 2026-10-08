package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class kk extends az implements i00 {
    private static final kk zzh;
    private static volatile p00 zzi;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        kk kkVar = new kk();
        zzh = kkVar;
        az.r(kk.class, kkVar);
    }

    private kk() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\b᠌\u0002", new Object[]{"zzb", "zze", jk.f32662a, "zzf", "zzg", me.f32939a});
        }
        if (i16 == 3) {
            return new kk();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ik(bArr);
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
        synchronized (kk.class) {
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
