package com.google.android.libraries.places.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
final class br0 extends wq0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicInteger f31819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private g70 f31820n;

    public br0(z60 z60Var) {
        super(z60Var);
        this.f31819m = new AtomicInteger(new Random().nextInt());
        this.f31820n = new y60(b70.d());
    }

    private final void l(b50 b50Var, g70 g70Var) {
        if (b50Var == this.f34199j && g70Var.equals(this.f31820n)) {
            return;
        }
        g().b(b50Var, g70Var);
        this.f34199j = b50Var;
        this.f31820n = g70Var;
    }

    private final g70 m(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((uq0) it.next()).e());
        }
        return new ar0(arrayList, this.f31819m);
    }

    @Override // com.google.android.libraries.places.internal.wq0
    protected final void e() {
        List listI = i();
        if (!listI.isEmpty()) {
            l(b50.READY, m(listI));
            return;
        }
        Iterator it = h().iterator();
        while (it.hasNext()) {
            b50 b50VarF = ((uq0) it.next()).f();
            b50 b50Var = b50.CONNECTING;
            if (b50VarF == b50Var || b50VarF == b50.IDLE) {
                l(b50Var, new y60(b70.d()));
                return;
            }
        }
        l(b50.TRANSIENT_FAILURE, m(h()));
    }

    @Override // com.google.android.libraries.places.internal.wq0
    protected final uq0 f(Object obj) {
        return new yq0(this, obj, this.f34198i);
    }
}
