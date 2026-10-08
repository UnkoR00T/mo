package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class q20 extends az implements i00 {
    private static final q20 zzf;
    private static volatile p00 zzg;
    private int zzb;
    private String zze = "";

    static {
        q20 q20Var = new q20();
        zzf = q20Var;
        az.r(q20.class, q20Var);
    }

    private q20() {
    }

    public static p20 I() {
        return (p20) zzf.o();
    }

    public static q20 J() {
        return zzf;
    }

    final /* synthetic */ void K(String str) {
        str.getClass();
        this.zzb |= 1;
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
            return az.s(zzf, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i16 == 3) {
            return new q20();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new p20(bArr);
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
        synchronized (q20.class) {
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
