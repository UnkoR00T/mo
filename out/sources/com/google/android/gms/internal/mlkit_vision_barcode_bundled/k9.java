package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class k9 extends l3 implements s4 {
    private static final k9 zzb;
    private int zzd;
    private e9 zzj;
    private byte zzk = 2;
    private r3 zze = l3.q();
    private q3 zzf = l3.o();
    private boolean zzg = true;
    private String zzh = "";
    private String zzi = "";

    static {
        k9 k9Var = new k9();
        zzb = k9Var;
        l3.C(k9.class, k9Var);
    }

    private k9() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return Byte.valueOf(this.zzk);
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0006\u0000\u0001\u0001\u000f\u0006\u0000\u0002\u0001\u0001\u0016\u0002\u0013\u0003ဇ\u0000\u0004ဈ\u0001\u0005ဈ\u0002\u000fᐉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i16 == 3) {
            return new k9();
        }
        i9 i9Var = null;
        if (i16 == 4) {
            return new j9(i9Var);
        }
        if (i16 == 5) {
            return zzb;
        }
        this.zzk = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
