package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

/* JADX INFO: loaded from: classes3.dex */
final class ax implements vx {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final hx f30360b = new yw();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hx f30361a;

    public ax() {
        uv uvVarC = uv.c();
        int i15 = rx.f30613d;
        zw zwVar = new zw(uvVarC, f30360b);
        byte[] bArr = kw.f30477b;
        this.f30361a = zwVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.vx
    public final ux a(Class cls) {
        int i15 = wx.f30689b;
        if (!bw.class.isAssignableFrom(cls)) {
            int i16 = rx.f30613d;
        }
        gx gxVarA = this.f30361a.a(cls);
        if (gxVarA.N()) {
            int i17 = rx.f30613d;
            return nx.i(wx.r(), ov.a(), gxVarA.m());
        }
        int i18 = rx.f30613d;
        return mx.A(cls, gxVarA, qx.a(), vw.a(), wx.r(), gxVarA.r() + (-1) != 1 ? ov.a() : null, fx.a());
    }
}
