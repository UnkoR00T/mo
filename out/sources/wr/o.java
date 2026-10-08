package wr;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<h> f214554a;

    /* JADX WARN: Multi-variable type inference failed */
    public o(List<? extends h> list) {
        this.f214554a = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c g(zs.c cVar, h hVar) {
        return hVar.H(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final eu.h h(h hVar) {
        return v.a0(hVar);
    }

    @Override // wr.h
    public c H(zs.c cVar) {
        return (c) eu.k.B(eu.k.J(v.a0(this.f214554a), new m(cVar)));
    }

    @Override // wr.h
    public boolean d2(zs.c cVar) {
        Iterator it = v.a0(this.f214554a).iterator();
        while (it.hasNext()) {
            if (((h) it.next()).d2(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // wr.h
    public boolean isEmpty() {
        List<h> list = this.f214554a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((h) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        return eu.k.C(v.a0(this.f214554a), n.f214553a).iterator();
    }

    public o(h... hVarArr) {
        this((List<? extends h>) pq.n.n1(hVarArr));
    }
}
