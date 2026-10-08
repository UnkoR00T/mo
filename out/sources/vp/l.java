package vp;

import io.sentry.android.core.c2;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class l implements Iterable<j> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f207807a;

    private static final class b implements Iterator<j> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<j> f207808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<bp.d> f207809b;

        private void a(j jVar) {
            this.f207808a.add(jVar);
            this.f207809b.add(jVar.D1());
            if (jVar instanceof n) {
                for (j jVar2 : ((n) jVar).i()) {
                    if (this.f207809b.contains(jVar2.D1())) {
                        c2.e("PdfBox-Android", "Child of field '" + jVar.e() + "' already exists elsewhere, ignored to avoid recursion");
                    } else {
                        a(jVar2);
                    }
                }
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public j next() {
            if (hasNext()) {
                return this.f207808a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f207808a.isEmpty();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b(d dVar) {
            this.f207808a = new ArrayDeque();
            this.f207809b = Collections.newSetFromMap(new IdentityHashMap());
            Iterator<j> it = dVar.f().iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }

    public l(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("root cannot be null");
        }
        this.f207807a = dVar;
    }

    @Override // java.lang.Iterable
    public Iterator<j> iterator() {
        return new b(this.f207807a);
    }
}
