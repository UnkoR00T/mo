package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public final class xq extends az implements i00 {
    private static final xq zzl;
    private static volatile p00 zzm;
    private int zzb;
    private h30 zzg;
    private int zzi;
    private float zzj;
    private float zzk;
    private String zze = "";
    private String zzf = "";
    private iz zzh = az.z();

    static {
        xq xqVar = new xq();
        zzl = xqVar;
        az.r(xq.class, xqVar);
    }

    private xq() {
    }

    public final String I() {
        return this.zze;
    }

    public final String J() {
        return this.zzf;
    }

    public final h30 K() {
        h30 h30Var = this.zzg;
        return h30Var == null ? h30.K() : h30Var;
    }

    public final float L() {
        return this.zzj;
    }

    public final boolean M() {
        return (this.zzb & 2) != 0;
    }

    public final float N() {
        return this.zzk;
    }

    public final int P() {
        int i15;
        switch (this.zzi) {
            case 0:
                i15 = 2;
                break;
            case 1:
                i15 = 3;
                break;
            case 2:
                i15 = 4;
                break;
            case 3:
                i15 = 5;
                break;
            case 4:
                i15 = 6;
                break;
            case 5:
                i15 = 7;
                break;
            case 6:
                i15 = 8;
                break;
            default:
                i15 = 0;
                break;
        }
        if (i15 == 0) {
            return 1;
        }
        return i15;
    }

    @Override // com.google.android.libraries.places.internal.az
    protected final Object h(int i15, Object obj, Object obj2) {
        p00 vyVar;
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return az.s(zzl, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ț\u0005\f\u0006\u0001\u0007ခ\u0001", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i16 == 3) {
            return new xq();
        }
        byte[] bArr = null;
        if (i16 == 4) {
            return new wq(bArr);
        }
        if (i16 == 5) {
            return zzl;
        }
        if (i16 != 6) {
            throw null;
        }
        p00 p00Var = zzm;
        if (p00Var != null) {
            return p00Var;
        }
        synchronized (xq.class) {
            try {
                vyVar = zzm;
                if (vyVar == null) {
                    vyVar = new vy(zzl);
                    zzm = vyVar;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return vyVar;
    }
}
