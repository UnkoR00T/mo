package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class x4 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f31329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f31330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ p4 f31331d;

    private x4(p4 p4Var) {
        this.f31331d = p4Var;
        this.f31328a = -1;
    }

    private final Iterator a() {
        if (this.f31330c == null) {
            this.f31330c = this.f31331d.f31229c.entrySet().iterator();
        }
        return this.f31330c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31328a + 1 < this.f31331d.f31228b.size() || (!this.f31331d.f31229c.isEmpty() && a().hasNext());
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.f31329b = true;
        int i15 = this.f31328a + 1;
        this.f31328a = i15;
        return i15 < this.f31331d.f31228b.size() ? (Map.Entry) this.f31331d.f31228b.get(this.f31328a) : (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f31329b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f31329b = false;
        this.f31331d.q();
        if (this.f31328a >= this.f31331d.f31228b.size()) {
            a().remove();
            return;
        }
        p4 p4Var = this.f31331d;
        int i15 = this.f31328a;
        this.f31328a = i15 - 1;
        p4Var.l(i15);
    }

    /* synthetic */ x4(p4 p4Var, o4 o4Var) {
        this(p4Var);
    }
}
