package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class k20 extends az implements i00 {
    private static final k20 zzf;
    private static volatile p00 zzg;
    private String zzb = "";
    private String zze = "";

    static {
        k20 k20Var = new k20();
        zzf = k20Var;
        az.r(k20.class, k20Var);
    }

    private k20() {
    }

    public static j20 I() {
        return (j20) zzf.o();
    }

    public static k20 J() {
        return zzf;
    }

    final /* synthetic */ void K(String str) {
        str.getClass();
        this.zze = str;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzb", "zze"});
        }
        if (i16 == 3) {
            return new k20();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new j20(bArr);
        }
        if (i16 == 5) {
            return zzf;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzg;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (k20.class) {
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
