package ns;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vr.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends yr.h0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f138062q = {fr.q0.j(new fr.h0(d0.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0)), fr.q0.j(new fr.h0(d0.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final qs.u f138063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ms.k f138064h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ws.c f138065j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final rt.i f138066k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final f f138067l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final rt.i<List<zs.c>> f138068m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final wr.h f138069n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final rt.i f138070p;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138071a;

        static {
            int[] iArr = new int[ts.a.EnumC5006a.values().length];
            try {
                iArr[ts.a.EnumC5006a.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ts.a.EnumC5006a.FILE_FACADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f138071a = iArr;
        }
    }

    public d0(ms.k kVar, qs.u uVar) {
        super(kVar.d(), uVar.g());
        this.f138063g = uVar;
        ms.k kVarF = ms.c.f(kVar, this, null, 0, 6, null);
        this.f138064h = kVarF;
        this.f138065j = kVar.a().b().f().g().d();
        this.f138066k = kVarF.e().d(new a0(this));
        this.f138067l = new f(kVarF, uVar, this);
        this.f138068m = kVarF.e().f(new b0(this), pq.v.n());
        this.f138069n = kVarF.a().i().a() ? wr.h.f214542p0.b() : ms.h.a(kVarF, uVar);
        this.f138070p = kVarF.e().d(new c0(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map S0(d0 d0Var) {
        List<String> listA = d0Var.f138064h.a().o().a(d0Var.g().a());
        ArrayList arrayList = new ArrayList();
        for (String str : listA) {
            ss.x xVarB = ss.w.b(d0Var.f138064h.a().j(), zs.b.f236634d.c(jt.d.d(str).e()), d0Var.f138065j);
            oq.r rVarA = xVarB != null ? oq.y.a(str, xVarB) : null;
            if (rVarA != null) {
                arrayList.add(rVarA);
            }
        }
        return pq.v0.s(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HashMap X0(d0 d0Var) {
        HashMap map = new HashMap();
        for (Map.Entry<String, ss.x> entry : d0Var.U0().entrySet()) {
            String key = entry.getKey();
            ss.x value = entry.getValue();
            jt.d dVarD = jt.d.d(key);
            ts.a aVarD = value.d();
            int i15 = a.f138071a[aVarD.c().ordinal()];
            if (i15 == 1) {
                String strE = aVarD.e();
                if (strE != null) {
                    map.put(dVarD, jt.d.d(strE));
                }
            } else if (i15 == 2) {
                map.put(dVarD, dVarD);
            }
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List Y0(d0 d0Var) {
        Collection<qs.u> collectionW = d0Var.f138063g.w();
        ArrayList arrayList = new ArrayList(pq.v.y(collectionW, 10));
        Iterator<T> it = collectionW.iterator();
        while (it.hasNext()) {
            arrayList.add(((qs.u) it.next()).g());
        }
        return arrayList;
    }

    public final vr.e T0(qs.g gVar) {
        return this.f138067l.i().k0(gVar);
    }

    public final Map<String, ss.x> U0() {
        return (Map) rt.m.a(this.f138066k, this, f138062q[0]);
    }

    @Override // vr.o0
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public f r() {
        return this.f138067l;
    }

    public final List<zs.c> W0() {
        return this.f138068m.a();
    }

    @Override // wr.b, wr.a
    public wr.h getAnnotations() {
        return this.f138069n;
    }

    @Override // yr.h0, yr.n, vr.p
    public h1 m() {
        return new ss.y(this);
    }

    @Override // yr.h0, yr.m
    public String toString() {
        return "Lazy Java package fragment: " + g() + " of module " + this.f138064h.a().m();
    }
}
