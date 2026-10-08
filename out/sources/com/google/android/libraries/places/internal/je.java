package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class je extends az implements i00 {
    private static final je zzk;
    private static volatile p00 zzl;
    private int zzb;
    private int zze;
    private ge zzf;
    private ge zzg;
    private int zzh;
    private le zzi;
    private cd zzj;

    static {
        je jeVar = new je();
        zzk = jeVar;
        az.r(je.class, jeVar);
    }

    private je() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"zzb", "zze", he.f32464a, "zzf", "zzg", "zzh", ie.f32565a, "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new je();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new de(bArr);
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
        synchronized (je.class) {
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
