package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class vm extends az implements i00 {
    private static final vm zzo;
    private static volatile p00 zzp;
    private int zzb;
    private long zze;
    private int zzf;
    private long zzg;
    private tx zzh = tx.f33820b;
    private long zzi;
    private long zzj;
    private long zzk;
    private float zzl;
    private boolean zzm;
    private int zzn;

    static {
        vm vmVar = new vm();
        zzo = vmVar;
        az.r(vm.class, vmVar);
    }

    private vm() {
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ည\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bခ\u0007\tဇ\b\nင\t", new Object[]{"zzb", "zze", "zzf", um.f33948a, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i16 == 3) {
            return new vm();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new tm(bArr);
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
        synchronized (vm.class) {
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
