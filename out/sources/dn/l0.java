package dn;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends l3 implements s4 {
    private static final l0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        l0 l0Var = new l0();
        zzb = l0Var;
        l3.C(l0.class, l0Var);
    }

    private l0() {
    }

    public static l0 K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", j0.f43486a, "zzf", "zzg", "zzh"});
        }
        if (i16 == 3) {
            return new l0();
        }
        b bVar = null;
        if (i16 == 4) {
            return new i0(bVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }

    public final String L() {
        return this.zzf;
    }

    public final String M() {
        return this.zzh;
    }

    public final String N() {
        return this.zzg;
    }

    public final int O() {
        int iA = k0.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
