package com.google.android.libraries.places.internal;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m30 extends az implements i00 {
    private static final m30 zzo;
    private static volatile p00 zzp;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private iz zzl = az.z();
    private iz zzm = az.z();
    private String zzn = "";

    static {
        m30 m30Var = new m30();
        zzo = m30Var;
        az.r(m30.class, m30Var);
    }

    private m30() {
    }

    public static m30 S() {
        return zzo;
    }

    public final String I() {
        return this.zze;
    }

    public final String J() {
        return this.zzf;
    }

    public final String K() {
        return this.zzg;
    }

    public final String L() {
        return this.zzh;
    }

    public final String M() {
        return this.zzi;
    }

    public final String N() {
        return this.zzj;
    }

    public final String O() {
        return this.zzk;
    }

    public final List P() {
        return this.zzl;
    }

    public final List Q() {
        return this.zzm;
    }

    public final String R() {
        return this.zzn;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzo, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0002\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȚ\nȚ\u000bȈ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i16 == 3) {
            return new m30();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new l30(bArr);
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
        synchronized (m30.class) {
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
