package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class r4 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator f31248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ p4 f31249c;

    private r4(p4 p4Var) {
        this.f31249c = p4Var;
        this.f31247a = p4Var.f31228b.size();
    }

    private final Iterator a() {
        if (this.f31248b == null) {
            this.f31248b = this.f31249c.f31232f.entrySet().iterator();
        }
        return this.f31248b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i15 = this.f31247a;
        return (i15 > 0 && i15 <= this.f31249c.f31228b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.f31249c.f31228b;
        int i15 = this.f31247a - 1;
        this.f31247a = i15;
        return (Map.Entry) list.get(i15);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ r4(p4 p4Var, o4 o4Var) {
        this(p4Var);
    }
}
