package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class br extends az implements i00 {
    private static final br zzg;
    private static volatile p00 zzh;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";

    static {
        br brVar = new br();
        zzg = brVar;
        az.r(br.class, brVar);
    }

    private br() {
    }

    public static br L() {
        return zzg;
    }

    public final String I() {
        return this.zzb;
    }

    public final String J() {
        return this.zze;
    }

    public final String K() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new br();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new ar(bArr);
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
        synchronized (br.class) {
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
