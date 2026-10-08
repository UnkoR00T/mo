package yj;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends l3 implements s4 {
    private static final d0 zzb;

    static {
        d0 d0Var = new d0();
        zzb = d0Var;
        l3.C(d0.class, d0Var);
    }

    private d0() {
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        b0 b0Var = null;
        if (i16 == 2) {
            return l3.z(zzb, "\u0001\u0000", null);
        }
        if (i16 == 3) {
            return new d0();
        }
        if (i16 == 4) {
            return new c0(b0Var);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
