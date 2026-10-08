package d;

import CON.j0;
import h.q1;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;
import pq.v0;
import v.u1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001BW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u0002\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\"\u0010#\u001a\u0010\u0012\f\u0012\n !*\u0004\u0018\u00010\u00030\u00030 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\"R'\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010&R\u001b\u0010+\u001a\u00020\u00038FX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b$\u0010(*\u0004\b)\u0010*¨\u0006,"}, d2 = {"Ld/g0;", "", "Lnq/a;", "Lh/s;", "cameraGraphProvider", "LPRN/o;", "cameraStateAdapter", "LPRN/d0;", "graphStateToCameraStateAdapter", "", "Lh/c0$a;", "Lv/u1;", "streamConfigMapProvider", "Lh/q1;", "defaultSurfaceToStreamMap", "<init>", "(Lnq/a;LPRN/o;LPRN/d0;Lnq/a;Ljava/util/Map;)V", "Loq/i0;", "d", "()V", "", "deferrableSurfaces", "", "g", "(Ljava/util/Collection;)Ljava/util/Set;", "e", "a", "Lnq/a;", "b", "LPRN/o;", "c", "LPRN/d0;", "Loq/k;", "kotlin.jvm.PlatformType", "Loq/k;", "_graph", "f", "h", "()Ljava/util/Map;", "surfaceToStreamMap", "()Lh/s;", "getGraph$delegate", "(Ld/g0;)Ljava/lang/Object;", "graph", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nq.a<h.s> cameraGraphProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final PRN.o cameraStateAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PRN.d0 graphStateToCameraStateAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final nq.a<Map<h.c0.a, u1>> streamConfigMapProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k<h.s> _graph;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oq.k surfaceToStreamMap;

    public g0(nq.a<h.s> aVar, PRN.o oVar, PRN.d0 d0Var, nq.a<Map<h.c0.a, u1>> aVar2, final Map<u1, q1> map) {
        this.cameraGraphProvider = aVar;
        this.cameraStateAdapter = oVar;
        this.graphStateToCameraStateAdapter = d0Var;
        this.streamConfigMapProvider = aVar2;
        this._graph = oq.l.a(new er.a() { // from class: d.e0
            @Override // er.a
            public final Object a() {
                return g0.c(this.f38856a);
            }
        });
        this.surfaceToStreamMap = oq.l.a(new er.a() { // from class: d.f0
            @Override // er.a
            public final Object a() {
                return g0.i(map, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.s c(g0 g0Var) {
        return g0Var.cameraGraphProvider.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i(Map map, g0 g0Var) {
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<h.c0.a, u1> entry : g0Var.streamConfigMapProvider.get().entrySet()) {
            h.c0.a key = entry.getKey();
            u1 value = entry.getValue();
            h.c0 c0VarR = g0Var.f().G().r(key);
            if (c0VarR != null) {
                linkedHashMap.put(value, q1.a(c0VarR.getId()));
            }
        }
        return v0.u(linkedHashMap);
    }

    public final void d() throws Exception {
        if (this._graph.c()) {
            j0.a(f());
        }
    }

    public final void e() {
        this.graphStateToCameraStateAdapter.g(f());
        this.cameraStateAdapter.i(f());
    }

    public final h.s f() {
        return this._graph.getValue();
    }

    public final Set<q1> g(Collection<? extends u1> deferrableSurfaces) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = deferrableSurfaces.iterator();
        while (it.hasNext()) {
            q1 q1Var = h().get((u1) it.next());
            if (q1Var != null) {
                linkedHashSet.add(q1.a(q1Var.getValue()));
            }
        }
        return linkedHashSet;
    }

    public final Map<u1, q1> h() {
        return (Map) this.surfaceToStreamMap.getValue();
    }

    public /* synthetic */ g0(nq.a aVar, PRN.o oVar, PRN.d0 d0Var, nq.a aVar2, Map map, int i15, fr.k kVar) {
        this(aVar, oVar, d0Var, aVar2, (i15 & 16) != 0 ? null : map);
    }
}
