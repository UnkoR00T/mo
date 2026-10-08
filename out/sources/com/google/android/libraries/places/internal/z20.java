package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z20 extends xy implements i00 {
    private static final z20 zzf;
    private static volatile p00 zzg;
    private byte zze = 2;

    static {
        z20 z20Var = new z20();
        zzf = z20Var;
        az.r(z20.class, z20Var);
    }

    private z20() {
    }

    public static z20 I() {
        return zzf;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zze);
        }
        byte[] bArr = null;
        if (i16 == 2) {
            return az.s(zzf, "\u0003\u0000", null);
        }
        if (i16 == 3) {
            return new z20();
        }
        if (i16 == 4) {
            return new y20(bArr);
        }
        if (i16 == 5) {
            return zzf;
        }
        if (i16 != 6) {
            this.zze = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        p00 p00Var = zzg;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (z20.class) {
            try {
                vyVar = zzg;
                if (vyVar == null) {
                    vyVar = new vy(zzf);
                    zzg = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
