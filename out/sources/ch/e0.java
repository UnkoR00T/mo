package ch;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class e0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator f25843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Collection f25844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ f0 f25845c;

    e0(f0 f0Var, Iterator it) {
        this.f25845c = f0Var;
        this.f25844b = f0Var.f25864b;
        this.f25843a = it;
    }

    final void a() {
        this.f25845c.zzb();
        if (this.f25845c.f25864b != this.f25844b) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.f25843a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        return this.f25843a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f25843a.remove();
        this.f25845c.f25867e.f25945d--;
        this.f25845c.f();
    }

    e0(f0 f0Var) {
        this.f25845c = f0Var;
        Collection collection = f0Var.f25864b;
        this.f25844b = collection;
        this.f25843a = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
