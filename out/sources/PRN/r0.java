package PRN;

import android.media.MediaCodec;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import ju.g1;
import o.j2;
import p071kotlin.Metadata;
import v.j3;
import v.p1;
import v.u1;
import v.w3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000 22\u00020\u0001:\u0001 B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00022\u0010\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u0002H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002H\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R'\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R'\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u000b0\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u001b\u00100\u001a\u00020,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010/R\u001b\u00103\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010%\u001a\u0004\b2\u0010\u0010R!\u00107\u001a\b\u0012\u0004\u0012\u00020\u0013048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"LPRN/r0;", "", "", "Lo/j2;", "useCases", "", "isPrimary", "<init>", "(Ljava/util/Collection;Z)V", "Ljava/lang/Class;", "kClass", "", "i", "(Ljava/lang/Class;)J", "Lv/j3;", "n", "()Lv/j3;", "p", "()Z", "Lv/u1;", "deferrableSurface", "Loq/i0;", "q", "(Lv/u1;)V", "sessionConfigs", "Lv/w3;", "useCaseConfigs", "", "k", "(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Map;", "m", "(Ljava/util/Collection;)Ljava/util/Map;", "a", "Ljava/util/Collection;", "b", "Z", "c", "Loq/k;", "j", "()Ljava/util/Map;", "surfaceToStreamUseCaseMap", "d", "l", "surfaceToStreamUseHintMap", "Lv/j3$h;", "e", "o", "()Lv/j3$h;", "validatingBuilder", "f", "h", "sessionConfig", "", "g", "()Ljava/util/List;", "deferrableSurfaces", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Collection<j2> useCases;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isPrimary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k surfaceToStreamUseCaseMap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k surfaceToStreamUseHintMap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k validatingBuilder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oq.k sessionConfig;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final oq.k deferrableSurfaces;

    /* JADX INFO: renamed from: PRN.r0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LPRN/r0$a;", "", "<init>", "()V", "Lo/j2;", "", "isPrimary", "Lv/j3;", "a", "(Lo/j2;Z)Lv/j3;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final j3 a(j2 j2Var, boolean z15) {
            return z15 ? j2Var.z() : j2Var.x();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f770e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j3 f771f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j3 j3Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f771f = j3Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            j3.d dVarD;
            uq.b.e();
            if (this.f770e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            j3 j3Var = this.f771f;
            if (j3Var != null && (dVarD = j3Var.d()) != null) {
                dVarD.a(this.f771f, j3.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f771f, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r0(Collection<? extends j2> collection, boolean z15) {
        this.useCases = collection;
        this.isPrimary = z15;
        this.surfaceToStreamUseCaseMap = oq.l.a(new er.a() { // from class: PRN.m0
            @Override // er.a
            public final Object a() {
                return r0.s(this.f722a);
            }
        });
        this.surfaceToStreamUseHintMap = oq.l.a(new er.a() { // from class: PRN.n0
            @Override // er.a
            public final Object a() {
                return r0.t(this.f725a);
            }
        });
        this.validatingBuilder = oq.l.a(new er.a() { // from class: PRN.o0
            @Override // er.a
            public final Object a() {
                return r0.u(this.f739a);
            }
        });
        this.sessionConfig = oq.l.a(new er.a() { // from class: PRN.p0
            @Override // er.a
            public final Object a() {
                return r0.r(this.f744a);
            }
        });
        this.deferrableSurfaces = oq.l.a(new er.a() { // from class: PRN.q0
            @Override // er.a
            public final Object a() {
                return r0.f(this.f754a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(r0 r0Var) {
        if (!r0Var.o().f()) {
            throw new IllegalStateException("Check failed.");
        }
        j3.f fVarJ = r0Var.h().j();
        if (fVarJ != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(r0Var.h().p());
            arrayList.add(fVarJ.f());
            List listUnmodifiableList = Collections.unmodifiableList(arrayList);
            if (listUnmodifiableList != null) {
                return listUnmodifiableList;
            }
        }
        return r0Var.h().p();
    }

    private final j3 h() {
        return (j3) this.sessionConfig.getValue();
    }

    private final long i(Class<?> kClass) {
        return fr.t.c(kClass, MediaCodec.class) ? h.e1.g.INSTANCE.b() : h.e1.g.INSTANCE.a();
    }

    private final j3.h o() {
        return (j3.h) this.validatingBuilder.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3 r(r0 r0Var) {
        if (r0Var.o().f()) {
            return r0Var.o().c();
        }
        throw new IllegalStateException("Check failed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map s(r0 r0Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (j2 j2Var : r0Var.useCases) {
            arrayList.add(INSTANCE.a(j2Var, r0Var.isPrimary));
            arrayList2.add(j2Var.l());
        }
        return r0Var.k(arrayList, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map t(r0 r0Var) {
        Collection<j2> collection = r0Var.useCases;
        ArrayList arrayList = new ArrayList(pq.v.y(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(INSTANCE.a((j2) it.next(), r0Var.isPrimary));
        }
        return r0Var.m(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j3.h u(r0 r0Var) {
        j3.h hVar = new j3.h();
        Iterator<j2> it = r0Var.useCases.iterator();
        while (it.hasNext()) {
            hVar.b(INSTANCE.a(it.next(), r0Var.isPrimary));
        }
        return hVar;
    }

    public final List<u1> g() {
        return (List) this.deferrableSurfaces.getValue();
    }

    public final Map<u1, Long> j() {
        return (Map) this.surfaceToStreamUseCaseMap.getValue();
    }

    public final Map<u1, Long> k(Collection<j3> sessionConfigs, Collection<? extends w3<?>> useCaseConfigs) {
        Collection<j3> collection = sessionConfigs;
        if (!collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (((j3) it.next()).q() == 5) {
                    e.c cVar = e.c.f45719a;
                    if (o.e1.g("CXCP")) {
                        c2.e(e.c.TRUNCATED_TAG, "ZSL in populateSurfaceToStreamUseCaseMapping()");
                    }
                    return pq.v0.i();
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f.l.f54477a.n(sessionConfigs, useCaseConfigs, linkedHashMap);
        return linkedHashMap;
    }

    public final Map<u1, Long> l() {
        return (Map) this.surfaceToStreamUseHintMap.getValue();
    }

    public final Map<u1, Long> m(Collection<j3> sessionConfigs) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (j3 j3Var : sessionConfigs) {
            for (u1 u1Var : j3Var.p()) {
                p1 p1VarG = j3Var.g();
                p1.a<Long> aVar = e.a.Y;
                if (!p1VarG.h(aVar) || j3Var.g().d(aVar) == null) {
                    linkedHashMap.put(u1Var, Long.valueOf(i(u1Var.g())));
                } else {
                    linkedHashMap.put(u1Var, j3Var.g().d(aVar));
                }
            }
        }
        return linkedHashMap;
    }

    public final j3 n() {
        if (p()) {
            return h();
        }
        return null;
    }

    public final boolean p() {
        return o().f();
    }

    public final void q(u1 deferrableSurface) {
        Object next;
        e.c cVar = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            Objects.toString(deferrableSurface);
        }
        Iterator<T> it = this.useCases.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!INSTANCE.a((j2) next, this.isPrimary).p().contains(deferrableSurface));
        j2 j2Var = (j2) next;
        ju.k.d(ju.q0.a(g1.c().j2()), null, null, new b(j2Var != null ? j2Var.z() : null, null), 3, null);
    }

    public /* synthetic */ r0(Collection collection, boolean z15, int i15, fr.k kVar) {
        this(collection, (i15 & 2) != 0 ? true : z15);
    }
}
