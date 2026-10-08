package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 extends l3 implements s4 {
    private static final p0 zzb;
    private int zzd;
    private double zze;
    private double zzf;
    private byte zzg = 2;

    static {
        p0 p0Var = new p0();
        zzb = p0Var;
        l3.C(p0.class, p0Var);
    }

    private p0() {
    }

    public static p0 M() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔀ\u0000\u0002ᔀ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i16 == 3) {
            return new p0();
        }
        b bVar = null;
        if (i16 == 4) {
            return new o0(bVar);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final double J() {
        return this.zze;
    }

    public final double K() {
        return this.zzf;
    }
}
