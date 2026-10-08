package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class r1 extends l3 implements s4 {
    private static final r1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        r1 r1Var = new r1();
        zzb = r1Var;
        l3.C(r1.class, r1Var);
    }

    private r1() {
    }

    public static r1 K() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", p1.f30195a, "zzf"});
        }
        if (i16 == 3) {
            return new r1();
        }
        h1 h1Var = null;
        if (i16 == 4) {
            return new o1(h1Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }

    public final String L() {
        return this.zzf;
    }

    public final int M() {
        int iA = q1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
