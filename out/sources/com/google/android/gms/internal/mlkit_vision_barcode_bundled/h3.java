package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: loaded from: classes3.dex */
public class h3 extends g3 implements s4 {
    protected h3(i3 i3Var) {
        super(i3Var);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.g3
    protected final void n() {
        super.n();
        if (((i3) this.f29727b).zzb != b3.d()) {
            i3 i3Var = (i3) this.f29727b;
            i3Var.zzb = i3Var.zzb.clone();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.g3
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final i3 h() {
        if (!((i3) this.f29727b).F()) {
            return (i3) this.f29727b;
        }
        ((i3) this.f29727b).zzb.g();
        return (i3) super.h();
    }
}
