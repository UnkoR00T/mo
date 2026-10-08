package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public class wy extends uy implements i00 {
    protected wy(xy xyVar) {
        super(xyVar);
    }

    @Override // com.google.android.libraries.places.internal.uy, com.google.android.libraries.places.internal.f00
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final xy u() {
        if (!((xy) this.f33991b).C()) {
            return (xy) this.f33991b;
        }
        ((xy) this.f33991b).zzb.b();
        return (xy) super.u();
    }

    @Override // com.google.android.libraries.places.internal.uy
    protected final void z() {
        super.z();
        if (((xy) this.f33991b).zzb != qy.a()) {
            xy xyVar = (xy) this.f33991b;
            xyVar.zzb = xyVar.zzb.clone();
        }
    }
}
