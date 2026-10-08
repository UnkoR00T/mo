package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class f2 extends az implements i00 {
    private static final f2 zzh;
    private static volatile p00 zzi;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        f2 f2Var = new f2();
        zzh = f2Var;
        az.r(f2.class, f2Var);
    }

    private f2() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003င\u0002", new Object[]{"zzb", "zze", e2.f32126a, "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new f2();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new d2(bArr);
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
        synchronized (f2.class) {
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
