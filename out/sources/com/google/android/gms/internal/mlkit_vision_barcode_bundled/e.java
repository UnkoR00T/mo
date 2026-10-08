package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends l3 implements s4 {
    private static final e zzb;
    private int zzd;
    private int zze = 4369;
    private String zzf = "";

    static {
        e eVar = new e();
        zzb = eVar;
        l3.C(e.class, eVar);
    }

    private e() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", l9.f29760a, "zzf"});
        }
        if (i16 == 3) {
            return new e();
        }
        c cVar = null;
        if (i16 == 4) {
            return new d(cVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
