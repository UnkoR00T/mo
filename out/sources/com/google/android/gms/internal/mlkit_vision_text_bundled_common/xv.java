package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
public class xv extends vv implements kx {
    protected xv(yv yvVar) {
        super(yvVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.vv
    protected final void s() {
        super.s();
        if (((yv) this.f30655b).zbb != qv.e()) {
            yv yvVar = (yv) this.f30655b;
            yvVar.zbb = yvVar.zbb.clone();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.vv
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final yv S1() {
        if (!((yv) this.f30655b).o()) {
            return (yv) this.f30655b;
        }
        ((yv) this.f30655b).zbb.h();
        return (yv) super.S1();
    }
}
