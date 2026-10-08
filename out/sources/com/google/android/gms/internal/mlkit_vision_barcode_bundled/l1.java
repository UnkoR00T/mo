package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends l3 implements s4 {
    private static final l1 zzb;
    private int zzd;
    private int zze;
    private e4 zzg;
    private byte zzh = 2;
    private s3 zzf = l3.r();

    static {
        l1 l1Var = new l1();
        zzb = l1Var;
        l3.C(l1.class, l1Var);
    }

    private l1() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzh);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001᠌\u0000\u0002\u001a\u0003ᐉ\u0001", new Object[]{"zzd", "zze", j1.f29737a, "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new l1();
        }
        h1 h1Var = null;
        if (i16 == 4) {
            return new i1(h1Var);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzh = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final List K() {
        return this.zzf;
    }

    public final int L() {
        int iA = k1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
