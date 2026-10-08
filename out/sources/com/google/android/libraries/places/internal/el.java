package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class el extends az implements i00 {
    private static final el zzk;
    private static volatile p00 zzl;
    private int zzb;
    private s6 zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private byte zzj = 2;
    private String zzh = "";

    static {
        el elVar = new el();
        zzk = elVar;
        az.r(el.class, elVar);
    }

    private el() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005᠌\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", dl.f32056a});
        }
        if (i16 == 3) {
            return new el();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new cl(bArr);
        }
        if (i16 == 5) {
            return zzk;
        }
        if (i16 != 6) {
            this.zzj = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        p00 p00Var = zzl;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (el.class) {
            try {
                vyVar = zzl;
                if (vyVar == null) {
                    vyVar = new vy(zzk);
                    zzl = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
