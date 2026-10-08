package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class x8 extends az implements i00 {
    private static final x8 zzA;
    private static volatile p00 zzB;
    private int zzb;
    private long zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private x7 zzr;
    private long zzs;
    private w9 zzv;
    private w9 zzw;
    private n7 zzz;
    private iz zzf = az.z();
    private iz zzg = az.z();
    private iz zzt = az.z();
    private iz zzu = az.z();
    private iz zzx = az.z();
    private iz zzy = az.z();

    static {
        x8 x8Var = new x8();
        zzA = x8Var;
        az.r(x8.class, x8Var);
    }

    private x8() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzA, "\u0001\u0016\u0000\u0001\u0001\u0019\u0016\u0000\u0006\u0000\u0001စ\u0000\u0003\u001b\u0004\u001b\u0005ဂ\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bင\u0004\tင\u0005\nဂ\u0006\u000bဂ\u0007\fင\b\rင\t\u000eဂ\n\u000fဉ\u000b\u0010ဂ\f\u0011\u001b\u0012\u001b\u0013ဉ\r\u0014ဉ\u000e\u0015\u001b\u0016\u001b\u0019ဉ\u000f", new Object[]{"zzb", "zze", "zzf", e9.class, "zzg", g9.class, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", o9.class, "zzu", o9.class, "zzv", "zzw", "zzx", v8.class, "zzy", v8.class, "zzz"});
        }
        if (i16 == 3) {
            return new x8();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new w8(bArr);
        }
        if (i16 == 5) {
            return zzA;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzB;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (x8.class) {
            try {
                vyVar = zzB;
                if (vyVar == null) {
                    vyVar = new vy(zzA);
                    zzB = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
