package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class m20 extends az implements i00 {
    private static final m20 zzg;
    private static volatile p00 zzh;
    private int zzb;
    private int zze;
    private f10 zzf;

    static {
        m20 m20Var = new m20();
        zzg = m20Var;
        az.r(m20.class, m20Var);
    }

    private m20() {
    }

    public static m20 K() {
        return zzg;
    }

    public final int I() {
        return this.zze;
    }

    public final f10 J() {
        f10 f10Var = this.zzf;
        return f10Var == null ? f10.L() : f10Var;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new m20();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new l20(bArr);
        }
        if (i16 == 5) {
            return zzg;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzh;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (m20.class) {
            try {
                vyVar = zzh;
                if (vyVar == null) {
                    vyVar = new vy(zzg);
                    zzh = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
