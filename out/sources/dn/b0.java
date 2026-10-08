package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends l3 implements s4 {
    private static final b0 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    static {
        b0 b0Var = new b0();
        zzb = b0Var;
        l3.C(b0.class, b0Var);
    }

    private b0() {
    }

    public static b0 Q() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i16 == 3) {
            return new b0();
        }
        b bVar = null;
        if (i16 == 4) {
            return new a0(bVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }

    public final int J() {
        return this.zzg;
    }

    public final int K() {
        return this.zzh;
    }

    public final int L() {
        return this.zzi;
    }

    public final int M() {
        return this.zzf;
    }

    public final int N() {
        return this.zzj;
    }

    public final int O() {
        return this.zze;
    }

    public final boolean R() {
        return this.zzk;
    }
}
