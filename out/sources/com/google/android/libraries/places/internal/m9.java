package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class m9 extends az implements i00 {
    private static final m9 zzo;
    private static volatile p00 zzp;
    private int zzb;
    private long zze;
    private long zzf;
    private iz zzg = az.z();
    private iz zzh = az.z();
    private iz zzi = az.z();
    private iz zzj = az.z();
    private w9 zzk;
    private w9 zzl;
    private w9 zzm;
    private w9 zzn;

    static {
        m9 m9Var = new m9();
        zzo = m9Var;
        az.r(m9.class, m9Var);
    }

    private m9() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", o9.class, "zzh", o9.class, "zzi", o9.class, "zzj", o9.class, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i16 == 3) {
            return new m9();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new l9(bArr);
        }
        if (i16 == 5) {
            return zzo;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzp;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (m9.class) {
            try {
                vyVar = zzp;
                if (vyVar == null) {
                    vyVar = new vy(zzo);
                    zzp = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
