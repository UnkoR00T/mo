package ba;

import fr.q0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import p071kotlin.Metadata;
import p136y9.b1;
import p136y9.w0;
import p136y9.y0;
import pq.v0;
import r0.m1;
import r0.o1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00192\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u0004\u0018\u00010\u000b2\u0006\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b\"\u0010#J7\u0010%\u001a\u0004\u0018\u00010\u000b2\u0006\u0010!\u001a\u00020 2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b'\u0010(J!\u0010*\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\bH\u0001¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0,H\u0000¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u0006H\u0000¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00192\u0006\u00102\u001a\u00020 H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u0006H\u0000¢\u0006\u0004\b6\u00107J!\u00109\u001a\u00020\u0019\"\b\b\u0000\u00108*\u00020\u00012\u0006\u00105\u001a\u00028\u0000H\u0000¢\u0006\u0004\b9\u0010:J7\u0010?\u001a\u00020\u0019\"\u0004\b\u0000\u001082\f\u0010<\u001a\b\u0012\u0004\u0012\u00028\u00000;2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060=H\u0000¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0E8AX\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010F\u001a\u0004\bG\u0010HR\"\u00102\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u00104R$\u0010Q\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u00107R.\u0010T\u001a\u0004\u0018\u00010\u00062\b\u00105\u001a\u0004\u0018\u00010\u00068\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010M\u001a\u0004\bR\u0010O\"\u0004\bS\u00107R$\u0010W\u001a\u00020 2\u0006\u00102\u001a\u00020 8@@@X\u0080\u000e¢\u0006\f\u001a\u0004\bU\u0010K\"\u0004\bV\u00104R\u0014\u0010Y\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bX\u0010O¨\u0006Z"}, d2 = {"Lba/b0;", "", "Ly9/b1;", "graph", "<init>", "(Ly9/b1;)V", "", "route", "", "searchChildren", "searchParent", "Ly9/y0;", "lastVisited", "Ly9/y0$b;", "s", "(Ljava/lang/String;ZZLy9/y0;)Ly9/y0$b;", "bestMatch", "Ly9/w0;", "navDeepLinkRequest", "r", "(Ly9/y0$b;Ly9/w0;ZZLy9/y0;)Ly9/y0$b;", "superBestMatch", "q", "(Ly9/y0$b;Ly9/w0;)Ly9/y0$b;", "node", "Loq/i0;", "b", "(Ly9/y0;)V", "", "nodes", "c", "(Ljava/util/Collection;)V", "", "resId", "d", "(I)Ly9/y0;", "matchingDest", "g", "(ILy9/y0;ZLy9/y0;)Ly9/y0;", "e", "(Ljava/lang/String;)Ly9/y0;", "searchParents", "f", "(Ljava/lang/String;Z)Ly9/y0;", "", "p", "()Ljava/util/Iterator;", "superName", "i", "(Ljava/lang/String;)Ljava/lang/String;", "startDestId", "u", "(I)V", "startDestRoute", "w", "(Ljava/lang/String;)V", "T", "v", "(Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlin/Function1;", "parseRoute", "x", "(Lkotlinx/serialization/KSerializer;Ler/l;)V", "a", "Ly9/b1;", "getGraph", "()Ly9/b1;", "Lr0/m1;", "Lr0/m1;", "j", "()Lr0/m1;", "I", "l", "()I", "setStartDestId$navigation_common_release", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "setStartDestIdName$navigation_common_release", "startDestIdName", "o", "z", "startDestinationRoute", "n", "y", "startDestinationId", "k", "startDestDisplayName", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b1 graph;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m1<y0> nodes = new m1<>(0, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int startDestId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String startDestIdName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String startDestinationRoute;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"ba/b0$a", "", "Ly9/y0;", "", "hasNext", "()Z", "a", "()Ly9/y0;", "Loq/i0;", "remove", "()V", "", "I", "index", "b", "Z", "wentToNext", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Iterator<y0>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean wentToNext;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public y0 next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.wentToNext = true;
            m1<y0> m1VarJ = b0.this.j();
            int i15 = this.index + 1;
            this.index = i15;
            return m1VarJ.t(i15);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index + 1 < b0.this.j().s();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.wentToNext) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            m1<y0> m1VarJ = b0.this.j();
            m1VarJ.t(this.index).C(null);
            m1VarJ.p(this.index);
            this.index--;
            this.wentToNext = false;
        }
    }

    public b0(b1 b1Var) {
        this.graph = b1Var;
    }

    public static /* synthetic */ y0 h(b0 b0Var, int i15, y0 y0Var, boolean z15, y0 y0Var2, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            y0Var2 = null;
        }
        return b0Var.g(i15, y0Var, z15, y0Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String t(Object obj, y0 y0Var) {
        Map<String, p136y9.t> mapK = y0Var.k();
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(mapK.size()));
        Iterator<T> it = mapK.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((p136y9.t) entry.getValue()).a());
        }
        return ca.d.d(obj, linkedHashMap);
    }

    public final void b(y0 node) {
        int iO = node.o();
        String strU = node.u();
        if (iO == 0 && strU == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (this.graph.u() != null && fr.t.c(strU, this.graph.u())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this.graph).toString());
        }
        if (iO == this.graph.o()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this.graph).toString());
        }
        y0 y0VarI = this.nodes.i(iO);
        if (y0VarI == node) {
            return;
        }
        if (node.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (y0VarI != null) {
            y0VarI.C(null);
        }
        node.C(this.graph);
        this.nodes.n(node.o(), node);
    }

    public final void c(Collection<? extends y0> nodes) {
        for (y0 y0Var : nodes) {
            if (y0Var != null) {
                b(y0Var);
            }
        }
    }

    public final y0 d(int resId) {
        return h(this, resId, this.graph, false, null, 8, null);
    }

    public final y0 e(String route) {
        if (route == null || fu.r.t0(route)) {
            return null;
        }
        return f(route, true);
    }

    public final y0 f(String route, boolean searchParents) {
        Object next;
        y0 y0Var;
        Iterator it = eu.k.g(o1.b(this.nodes)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            y0Var = (y0) next;
            if (fu.r.H(y0Var.u(), route, false, 2, null)) {
                break;
            }
        } while (y0Var.x(route) == null);
        y0 y0Var2 = (y0) next;
        if (y0Var2 != null) {
            return y0Var2;
        }
        if (!searchParents || this.graph.getParent() == null) {
            return null;
        }
        return this.graph.getParent().P(route);
    }

    public final y0 g(int resId, y0 lastVisited, boolean searchChildren, y0 matchingDest) {
        y0 y0VarI = this.nodes.i(resId);
        if (matchingDest != null) {
            if (fr.t.c(y0VarI, matchingDest) && fr.t.c(y0VarI.getParent(), matchingDest.getParent())) {
                return y0VarI;
            }
            y0VarI = null;
        } else if (y0VarI != null) {
            return y0VarI;
        }
        if (searchChildren) {
            Iterator it = eu.k.g(o1.b(this.nodes)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    y0VarI = null;
                    break;
                }
                y0 y0Var = (y0) it.next();
                y0 y0VarR = (!(y0Var instanceof b1) || fr.t.c(y0Var, lastVisited)) ? null : ((b1) y0Var).R(resId, this.graph, true, matchingDest);
                if (y0VarR != null) {
                    y0VarI = y0VarR;
                    break;
                }
            }
        }
        if (y0VarI != null) {
            return y0VarI;
        }
        if (this.graph.getParent() == null || fr.t.c(this.graph.getParent(), lastVisited)) {
            return null;
        }
        return this.graph.getParent().R(resId, this.graph, searchChildren, matchingDest);
    }

    public final String i(String superName) {
        return this.graph.o() != 0 ? superName : "the root navigation";
    }

    public final m1<y0> j() {
        return this.nodes;
    }

    public final String k() {
        if (this.startDestIdName == null) {
            String strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        return this.startDestIdName;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getStartDestIdName() {
        return this.startDestIdName;
    }

    public final int n() {
        return this.startDestId;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    public final Iterator<y0> p() {
        return new a();
    }

    public final y0.b q(y0.b superBestMatch, w0 navDeepLinkRequest) {
        return r(superBestMatch, navDeepLinkRequest, true, false, this.graph);
    }

    public final y0.b r(y0.b bestMatch, w0 navDeepLinkRequest, boolean searchChildren, boolean searchParent, y0 lastVisited) {
        y0.b bVar;
        y0.b bVarW = null;
        if (searchChildren) {
            b1 b1Var = this.graph;
            ArrayList arrayList = new ArrayList();
            for (y0 y0Var : b1Var) {
                y0.b bVarW2 = !fr.t.c(y0Var, lastVisited) ? y0Var.w(navDeepLinkRequest) : null;
                if (bVarW2 != null) {
                    arrayList.add(bVarW2);
                }
            }
            bVar = (y0.b) pq.v.B0(arrayList);
        } else {
            bVar = null;
        }
        b1 parent = this.graph.getParent();
        if (parent != null && searchParent && !fr.t.c(parent, lastVisited)) {
            bVarW = parent.W(navDeepLinkRequest, searchChildren, true, this.graph);
        }
        return (y0.b) pq.v.B0(pq.v.s(bestMatch, bVar, bVarW));
    }

    public final y0.b s(String route, boolean searchChildren, boolean searchParent, y0 lastVisited) {
        y0.b bVar;
        y0.b bVarX = this.graph.x(route);
        y0.b bVarX2 = null;
        if (searchChildren) {
            b1 b1Var = this.graph;
            ArrayList arrayList = new ArrayList();
            for (y0 y0Var : b1Var) {
                y0.b bVarX3 = fr.t.c(y0Var, lastVisited) ? null : y0Var instanceof b1 ? ((b1) y0Var).X(route, true, false, this.graph) : y0Var.x(route);
                if (bVarX3 != null) {
                    arrayList.add(bVarX3);
                }
            }
            bVar = (y0.b) pq.v.B0(arrayList);
        } else {
            bVar = null;
        }
        b1 parent = this.graph.getParent();
        if (parent != null && searchParent && !fr.t.c(parent, lastVisited)) {
            bVarX2 = parent.X(route, searchChildren, true, this.graph);
        }
        return (y0.b) pq.v.B0(pq.v.s(bVarX, bVar, bVarX2));
    }

    public final void u(int startDestId) {
        y(startDestId);
    }

    public final <T> void v(final T startDestRoute) {
        x(uu.p.b(q0.c(startDestRoute.getClass())), new er.l() { // from class: ba.a0
            @Override // er.l
            public final Object b(Object obj) {
                return b0.t(startDestRoute, (y0) obj);
            }
        });
    }

    public final void w(String startDestRoute) {
        z(startDestRoute);
    }

    public final <T> void x(KSerializer<T> serializer, er.l<? super y0, String> parseRoute) {
        int iC = ca.d.c(serializer);
        y0 y0VarD = d(iC);
        if (y0VarD != null) {
            z(parseRoute.b(y0VarD));
            this.startDestId = iC;
        } else {
            throw new IllegalStateException(("Cannot find startDestination " + serializer.getDescriptor().getSerialName() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
    }

    public final void y(int i15) {
        if (i15 != this.graph.o()) {
            if (this.startDestinationRoute != null) {
                z(null);
            }
            this.startDestId = i15;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i15 + " cannot use the same id as the graph " + this.graph).toString());
    }

    public final void z(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (fr.t.c(str, this.graph.u())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this.graph).toString());
            }
            if (fu.r.t0(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = y0.INSTANCE.c(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }
}
