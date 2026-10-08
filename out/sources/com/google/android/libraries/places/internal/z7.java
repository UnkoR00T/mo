package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class z7 extends az implements i00 {
    private static final z7 zzs;
    private static volatile p00 zzt;
    private int zzb;
    private long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private hz zzk = az.y();
    private long zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private int zzq;
    private long zzr;

    static {
        z7 z7Var = new z7();
        zzs = z7Var;
        az.r(z7.class, z7Var);
    }

    private z7() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            ez ezVar = w7.f34125a;
            ez ezVar2 = v7.f34051a;
            ez ezVar3 = t7.f33759a;
            return az.s(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006င\u0005\u0007\u0014\bဂ\u0006\t᠌\u0007\n᠌\b\u000b᠌\t\fဂ\n\rင\u000b\u000eဂ\f", new Object[]{"zzb", "zze", "zzf", "zzg", ezVar, "zzh", ezVar2, "zzi", ezVar3, "zzj", "zzk", "zzl", "zzm", ezVar, "zzn", ezVar2, "zzo", ezVar3, "zzp", "zzq", "zzr"});
        }
        if (i16 == 3) {
            return new z7();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new y7(bArr);
        }
        if (i16 == 5) {
            return zzs;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzt;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (z7.class) {
            try {
                vyVar = zzt;
                if (vyVar == null) {
                    vyVar = new vy(zzs);
                    zzt = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
