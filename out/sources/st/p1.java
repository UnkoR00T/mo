package st;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f184096e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p1 f184097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vr.l1 f184098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<d2> f184099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<vr.m1, d2> f184100d;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final p1 a(p1 p1Var, vr.l1 l1Var, List<? extends d2> list) {
            List<vr.m1> parameters = l1Var.o().getParameters();
            ArrayList arrayList = new ArrayList(pq.v.y(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((vr.m1) it.next()).a());
            }
            return new p1(p1Var, l1Var, list, pq.v0.s(pq.v.p1(arrayList, list)), null);
        }

        private a() {
        }
    }

    public /* synthetic */ p1(p1 p1Var, vr.l1 l1Var, List list, Map map, fr.k kVar) {
        this(p1Var, l1Var, list, map);
    }

    public final List<d2> a() {
        return this.f184099c;
    }

    public final vr.l1 b() {
        return this.f184098b;
    }

    public final d2 c(x1 x1Var) {
        vr.h hVarC = x1Var.c();
        if (hVarC instanceof vr.m1) {
            return this.f184100d.get(hVarC);
        }
        return null;
    }

    public final boolean d(vr.l1 l1Var) {
        if (fr.t.c(this.f184098b, l1Var)) {
            return true;
        }
        p1 p1Var = this.f184097a;
        return p1Var != null ? p1Var.d(l1Var) : false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private p1(p1 p1Var, vr.l1 l1Var, List<? extends d2> list, Map<vr.m1, ? extends d2> map) {
        this.f184097a = p1Var;
        this.f184098b = l1Var;
        this.f184099c = list;
        this.f184100d = map;
    }
}
