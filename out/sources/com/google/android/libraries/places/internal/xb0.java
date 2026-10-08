package com.google.android.libraries.places.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class xb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f34252a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b50 f34253b = b50.IDLE;

    xb0() {
    }

    final void a(b50 b50Var) {
        zj.p.r(b50Var, "newState");
        if (this.f34253b == b50Var || this.f34253b == b50.SHUTDOWN) {
            return;
        }
        this.f34253b = b50Var;
        if (this.f34252a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f34252a;
        this.f34252a = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
