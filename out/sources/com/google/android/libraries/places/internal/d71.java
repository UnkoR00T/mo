package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class d71 extends az implements i00 {
    private static final d71 zzj;
    private static volatile p00 zzk;
    private int zzb;
    private gt0 zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private hn zzi;

    static {
        d71 d71Var = new d71();
        zzj = d71Var;
        az.r(d71.class, d71Var);
    }

    private d71() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", e71.f32169a, "zzh", "zzi"});
        }
        if (i16 == 3) {
            return new d71();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new c71(bArr);
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
        synchronized (d71.class) {
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
