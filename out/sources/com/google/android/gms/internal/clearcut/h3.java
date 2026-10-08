package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class h3 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f29355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Iterator f29356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ f3 f29357c;

    private h3(f3 f3Var) {
        this.f29357c = f3Var;
        this.f29355a = f3Var.f29337b.size();
    }

    private final Iterator a() {
        if (this.f29356b == null) {
            this.f29356b = this.f29357c.f29341f.entrySet().iterator();
        }
        return this.f29356b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i15 = this.f29355a;
        return (i15 > 0 && i15 <= this.f29357c.f29337b.size()) || a().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object next;
        if (a().hasNext()) {
            next = a().next();
        } else {
            List list = this.f29357c.f29337b;
            int i15 = this.f29355a - 1;
            this.f29355a = i15;
            next = list.get(i15);
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ h3(f3 f3Var, g3 g3Var) {
        this(f3Var);
    }
}
