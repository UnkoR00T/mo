package com.google.android.libraries.places.internal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
final class ar0 extends g70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f31710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f31711c;

    public ar0(List list, AtomicInteger atomicInteger) {
        zj.p.e(!list.isEmpty(), "empty list");
        this.f31709a = list;
        this.f31710b = (AtomicInteger) zj.p.r(atomicInteger, "index");
        Iterator it = list.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((g70) it.next()).hashCode();
        }
        this.f31711c = iHashCode;
    }

    @Override // com.google.android.libraries.places.internal.g70
    public final b70 a(c70 c70Var) {
        int andIncrement = this.f31710b.getAndIncrement() & Integer.MAX_VALUE;
        List list = this.f31709a;
        return ((g70) list.get(andIncrement % list.size())).a(c70Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ar0)) {
            return false;
        }
        ar0 ar0Var = (ar0) obj;
        if (ar0Var == this) {
            return true;
        }
        if (this.f31711c == ar0Var.f31711c && this.f31710b == ar0Var.f31710b) {
            List list = this.f31709a;
            int size = list.size();
            List list2 = ar0Var.f31709a;
            if (size == list2.size() && new HashSet(list).containsAll(list2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f31711c;
    }

    public final String toString() {
        return zj.j.b(ar0.class).d("subchannelPickers", this.f31709a).toString();
    }
}
