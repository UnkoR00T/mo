package yj;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.s4;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends l3<a, o> implements s4 {
    private static final a zzb;
    private int zzd;
    private m zze;
    private e zzf;
    private u zzg;

    static {
        a aVar = new a();
        zzb = aVar;
        l3.C(a.class, aVar);
    }

    private a() {
    }

    public static o J() {
        return (o) zzb.g();
    }

    static /* synthetic */ void L(a aVar, m mVar) {
        mVar.getClass();
        aVar.zze = mVar;
        aVar.zzd |= 1;
    }

    static /* synthetic */ void M(a aVar, e eVar) {
        eVar.getClass();
        aVar.zzf = eVar;
        aVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.l3
    protected final Object I(int i15, Object obj, Object obj2) {
        int i16 = i15 - 1;
        if (i16 == 0) {
            return (byte) 1;
        }
        if (i16 == 2) {
            return l3.z(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i16 == 3) {
            return new a();
        }
        n nVar = null;
        if (i16 == 4) {
            return new o(nVar);
        }
        if (i16 != 5) {
            return null;
        }
        return zzb;
    }
}
