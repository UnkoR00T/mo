package st;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements x1, wt.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t0 f184120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet<t0> f184121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f184122c;

    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f184123a;

        public a(er.l lVar) {
            this.f184123a = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e(this.f184123a.b((t0) t15).toString(), this.f184123a.b((t0) t16).toString());
        }
    }

    public s0(Collection<? extends t0> collection) {
        collection.isEmpty();
        LinkedHashSet<t0> linkedHashSet = new LinkedHashSet<>(collection);
        this.f184121b = linkedHashSet;
        this.f184122c = linkedHashSet.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e1 k(s0 s0Var, tt.g gVar) {
        return s0Var.a(gVar).j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String n(s0 s0Var, er.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            lVar = q0.f184117a;
        }
        return s0Var.m(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(t0 t0Var) {
        return t0Var.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence p(er.l lVar, t0 t0Var) {
        return lVar.b(t0Var).toString();
    }

    @Override // st.x1
    public vr.h c() {
        return null;
    }

    @Override // st.x1
    public boolean d() {
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s0) {
            return fr.t.c(this.f184121b, ((s0) obj).f184121b);
        }
        return false;
    }

    @Override // st.x1
    public List<vr.m1> getParameters() {
        return pq.v.n();
    }

    public final lt.k h() {
        return lt.x.f120150d.a("member scope for intersection type", this.f184121b);
    }

    public int hashCode() {
        return this.f184122c;
    }

    @Override // st.x1
    public sr.j i() {
        return this.f184121b.iterator().next().T0().i();
    }

    public final e1 j() {
        return w0.n(t1.f184126b.k(), this, pq.v.n(), false, h(), new r0(this));
    }

    public final t0 l() {
        return this.f184120a;
    }

    public final String m(er.l<? super t0, ? extends Object> lVar) {
        return pq.v.v0(pq.v.U0(this.f184121b, new a(lVar)), " & ", "{", "}", 0, null, new p0(lVar), 24, null);
    }

    @Override // st.x1
    public Collection<t0> q() {
        return this.f184121b;
    }

    @Override // st.x1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public s0 a(tt.g gVar) {
        Collection<t0> collectionQ = q();
        ArrayList arrayList = new ArrayList(pq.v.y(collectionQ, 10));
        Iterator<T> it = collectionQ.iterator();
        boolean z15 = false;
        while (it.hasNext()) {
            arrayList.add(((t0) it.next()).d1(gVar));
            z15 = true;
        }
        s0 s0VarS = null;
        if (z15) {
            t0 t0VarL = l();
            s0VarS = new s0(arrayList).s(t0VarL != null ? t0VarL.d1(gVar) : null);
        }
        return s0VarS == null ? this : s0VarS;
    }

    public final s0 s(t0 t0Var) {
        return new s0(this.f184121b, t0Var);
    }

    public String toString() {
        return n(this, null, 1, null);
    }

    private s0(Collection<? extends t0> collection, t0 t0Var) {
        this(collection);
        this.f184120a = t0Var;
    }
}
