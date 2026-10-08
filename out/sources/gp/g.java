package gp;

import io.sentry.android.core.c2;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class g implements hp.c, Iterable<e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bp.d f75809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f75810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<bp.d> f75811c = new HashSet();

    private final class b implements Iterator<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<bp.d> f75812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Set<bp.d> f75813b;

        private void a(bp.d dVar) {
            if (g.this.s(dVar)) {
                for (bp.d dVar2 : g.this.q(dVar)) {
                    if (this.f75813b.contains(dVar2)) {
                        c2.e("PdfBox-Android", "This page tree node has already been visited");
                    } else {
                        if (dVar2.J3(bp.i.Q4)) {
                            this.f75813b.add(dVar2);
                        }
                        a(dVar2);
                    }
                }
                return;
            }
            bp.i iVar = bp.i.B6;
            bp.i iVar2 = bp.i.f20732e9;
            if (iVar.equals(dVar.l4(iVar2))) {
                this.f75812a.add(dVar);
                return;
            }
            c2.e("PdfBox-Android", "Page skipped due to an invalid or missing type " + dVar.l4(iVar2));
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            bp.d dVarPoll = this.f75812a.poll();
            g.t(dVarPoll);
            return new e(dVarPoll, g.this.f75810b != null ? g.this.f75810b.O() : null);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f75812a.isEmpty();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b(bp.d dVar) {
            this.f75812a = new ArrayDeque();
            this.f75813b = new HashSet();
            a(dVar);
            this.f75813b = null;
        }
    }

    g(bp.d dVar, c cVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("page tree root cannot be null");
        }
        if (bp.i.B6.equals(dVar.l4(bp.i.f20732e9))) {
            bp.a aVar = new bp.a();
            aVar.A3(dVar);
            bp.d dVar2 = new bp.d();
            this.f75809a = dVar2;
            dVar2.Y4(bp.i.Q4, aVar);
            dVar2.W4(bp.i.P1, 1);
        } else {
            this.f75809a = dVar;
        }
        this.f75810b = cVar;
    }

    private bp.d j(int i15, bp.d dVar, int i16) {
        if (i15 < 1) {
            throw new IndexOutOfBoundsException("Index out of bounds: " + i15);
        }
        if (this.f75811c.contains(dVar)) {
            this.f75811c.clear();
            throw new IllegalStateException("Possible recursion found when searching for page " + i15);
        }
        this.f75811c.add(dVar);
        if (!s(dVar)) {
            if (i16 == i15) {
                this.f75811c.clear();
                return dVar;
            }
            throw new IllegalStateException("1-based index not found: " + i15);
        }
        if (i15 > dVar.y4(bp.i.P1, 0) + i16) {
            throw new IndexOutOfBoundsException("1-based index out of bounds: " + i15);
        }
        for (bp.d dVar2 : q(dVar)) {
            if (s(dVar2)) {
                int iY4 = dVar2.y4(bp.i.P1, 0) + i16;
                if (i15 <= iY4) {
                    return j(i15, dVar2, i16);
                }
                i16 = iY4;
            } else {
                i16++;
                if (i15 == i16) {
                    return j(i15, dVar2, i16);
                }
            }
        }
        throw new IllegalStateException("1-based index not found: " + i15);
    }

    public static bp.b o(bp.d dVar, bp.i iVar) {
        bp.b bVarP4 = dVar.p4(iVar);
        if (bVarP4 != null) {
            return bVarP4;
        }
        bp.b bVarQ4 = dVar.q4(bp.i.J6, bp.i.A6);
        if (!(bVarQ4 instanceof bp.d)) {
            return null;
        }
        bp.d dVar2 = (bp.d) bVarQ4;
        if (bp.i.F6.equals(dVar2.p4(bp.i.f20732e9))) {
            return o(dVar2, iVar);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<bp.d> q(bp.d dVar) {
        ArrayList arrayList = new ArrayList();
        bp.a aVarJ4 = dVar.j4(bp.i.Q4);
        if (aVarJ4 != null) {
            int size = aVarJ4.size();
            for (int i15 = 0; i15 < size; i15++) {
                bp.b bVarK4 = aVarJ4.k4(i15);
                if (bVarK4 instanceof bp.d) {
                    arrayList.add((bp.d) bVarK4);
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("COSDictionary expected, but got ");
                    sb5.append(bVarK4 == null ? "null" : bVarK4.getClass().getSimpleName());
                    c2.g("PdfBox-Android", sb5.toString());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s(bp.d dVar) {
        if (dVar != null) {
            return dVar.l4(bp.i.f20732e9) == bp.i.F6 || dVar.J3(bp.i.Q4);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(bp.d dVar) {
        bp.i iVar = bp.i.f20732e9;
        bp.i iVarL4 = dVar.l4(iVar);
        if (iVarL4 == null) {
            dVar.Y4(iVar, bp.i.B6);
        } else {
            if (bp.i.B6.equals(iVarL4)) {
                return;
            }
            throw new IllegalStateException("Expected 'Page' but found " + iVarL4);
        }
    }

    public void i(e eVar) {
        bp.d dVarD1 = eVar.D1();
        dVarD1.Y4(bp.i.J6, this.f75809a);
        ((bp.a) this.f75809a.p4(bp.i.Q4)).A3(dVarD1);
        do {
            dVarD1 = (bp.d) dVarD1.q4(bp.i.J6, bp.i.A6);
            if (dVarD1 != null) {
                bp.i iVar = bp.i.P1;
                dVarD1.W4(iVar, dVarD1.x4(iVar) + 1);
            }
        } while (dVarD1 != null);
    }

    @Override // java.lang.Iterable
    public Iterator<e> iterator() {
        return new b(this.f75809a);
    }

    public e k(int i15) {
        bp.d dVarJ = j(i15 + 1, this.f75809a, 0);
        t(dVarJ);
        c cVar = this.f75810b;
        return new e(dVarJ, cVar != null ? cVar.O() : null);
    }

    @Override // hp.c
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public bp.d D1() {
        return this.f75809a;
    }

    public int n() {
        return this.f75809a.y4(bp.i.P1, 0);
    }
}
