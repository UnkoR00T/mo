package yj;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends l3 implements s4 {
    private static final j zzb;
    private s3 zzd = l3.r();

    static {
        j jVar = new j();
        zzb = jVar;
        l3.C(j.class, jVar);
    }

    private j() {
    }

    public static i J() {
        return (i) zzb.g();
    }

    static /* synthetic */ void L(j jVar, g gVar) {
        gVar.getClass();
        s3 s3Var = jVar.zzd;
        if (!s3Var.a()) {
            jVar.zzd = l3.s(s3Var);
        }
        jVar.zzd.add(gVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", g.class});
        }
        if (i16 == 3) {
            return new j();
        }
        h hVar = null;
        if (i16 == 4) {
            return new i(hVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
