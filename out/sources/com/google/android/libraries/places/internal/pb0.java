package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class pb0 extends az implements i00 {
    private static final pb0 zzk;
    private static volatile p00 zzl;
    private int zzb;
    private int zze = 1;
    private rd0 zzf;
    private m60 zzg;
    private pt0 zzh;
    private n80 zzi;
    private uf0 zzj;

    static {
        pb0 pb0Var = new pb0();
        zzk = pb0Var;
        az.r(pb0.class, pb0Var);
    }

    private pb0() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"zzb", "zze", oa0.f33167a, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new pb0();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new o90(bArr);
        }
        if (i16 == 5) {
            return zzk;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzl;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (pb0.class) {
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
