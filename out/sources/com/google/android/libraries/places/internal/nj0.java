package com.google.android.libraries.places.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class nj0 extends k70 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final boolean f33066b;

    static {
        w70 w70Var = ze0.f34495c;
        f33066b = k60.b("GRPC_EXPERIMENTAL_ENABLE_NEW_PICK_FIRST", false);
    }

    @Override // com.google.android.libraries.places.internal.x60
    public final i70 a(z60 z60Var) {
        return f33066b ? new hj0(z60Var) : new mj0(z60Var);
    }

    @Override // com.google.android.libraries.places.internal.k70
    public final boolean b() {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.k70
    public final int c() {
        return 5;
    }

    @Override // com.google.android.libraries.places.internal.k70
    public final String d() {
        return "pick_first";
    }

    @Override // com.google.android.libraries.places.internal.k70
    public final m80 e(Map map) {
        try {
            Boolean boolI = fg0.i(map, "shuffleAddressList");
            return m80.a(f33066b ? new cj0(boolI, null) : new jj0(boolI, null));
        } catch (RuntimeException e15) {
            return m80.b(l90.f32815m.d(e15).e("Failed parsing configuration for pick_first"));
        }
    }
}
