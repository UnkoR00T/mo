package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class tk extends az implements i00 {
    private static final tk zzf;
    private static volatile p00 zzg;
    private iz zzb = az.z();
    private iz zze = az.z();

    static {
        tk tkVar = new tk();
        zzf = tkVar;
        az.r(tk.class, tkVar);
    }

    private tk() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzf, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"zzb", "zze", se.class});
        }
        if (i16 == 3) {
            return new tk();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new sk(bArr);
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
        synchronized (tk.class) {
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
