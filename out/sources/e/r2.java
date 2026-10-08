package e;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import ju.e3;
import ju.g3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ.\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u0018*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001e0\u001d2\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b!\u0010\"J\u0013\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0 ¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0015H\u0016¢\u0006\u0004\b*\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010 8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u00106R \u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011088\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b9\u0010:R$\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010>8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b?\u0010@¨\u0006B"}, d2 = {"Le/r2;", "Lh/e0$b;", "Le/u2;", "threads", "Lh/z;", "cameraPipe", "Lc/n;", "inactiveSurfaceCloser", "LPRN/r0;", "sessionConfigAdapter", "<init>", "(Le/u2;Lh/z;Lc/n;LPRN/r0;)V", "Loq/i0;", "n", "()V", "s", "", "Lv/u1;", "deferrableSurfaces", "", "timeoutMillis", "Landroid/view/Surface;", "m", "(Ljava/util/List;JLtq/e;)Ljava/lang/Object;", "", "j", "(Ljava/util/List;)Z", "Lh/s;", "graph", "", "Lh/q1;", "surfaceToStreamMap", "Lju/w0;", "o", "(Lh/s;LPRN/r0;Ljava/util/Map;J)Lju/w0;", "r", "()Lju/w0;", "k", "(Ltq/e;)Ljava/lang/Object;", "surface", "a", "(Landroid/view/Surface;)V", "b", "Le/u2;", "Lh/z;", "c", "Lc/n;", "d", "LPRN/r0;", "", "e", "Ljava/lang/Object;", "lock", "f", "Lju/w0;", "setupDeferred", "", "g", "Ljava/util/Map;", "activeSurfaceMap", "h", "configuredSurfaceMap", "Lju/x;", "i", "Lju/x;", "stopDeferred", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class r2 implements h.e0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.z cameraPipe;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c.n inactiveSurfaceCloser;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final PRN.r0 sessionConfigAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ju.w0<Boolean> setupDeferred;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Map<Surface, ? extends v.u1> configuredSurfaceMap;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ju.x<oq.i0> stopDeferred;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<Surface, v.u1> activeSurfaceMap = new LinkedHashMap();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f46269d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f46271f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46269d = obj;
            this.f46271f |= PKIFailureInfo.systemUnavail;
            return r2.l(r2.this, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f46272d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f46274f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f46272d = obj;
            this.f46274f |= PKIFailureInfo.systemUnavail;
            return r2.this.m(null, 0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0005\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "", "Landroid/view/Surface;", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super List<Surface>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<v.u1> f46276f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends v.u1> list, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f46276f = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46275e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            List<v.u1> list = this.f46276f;
            ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a0.f.i(((v.u1) it.next()).j()));
            }
            com.google.common.util.concurrent.q qVarM = a0.f.m(arrayList);
            this.f46275e = 1;
            Object objB = androidx.concurrent.futures.e.b(qVarM, this);
            return objB == objE ? objE : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super List<Surface>> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f46276f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46277e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ PRN.r0 f46278f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ v.u1.a f46279g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(PRN.r0 r0Var, v.u1.a aVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f46278f = r0Var;
            this.f46279g = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f46277e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f46278f.q(this.f46279g.a());
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f46278f, this.f46279g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<ju.p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46280e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f46281f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ PRN.r0 f46282g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ r2 f46283h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ List<v.u1> f46284j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f46285k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Map<v.u1, h.q1> f46286l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ h.s f46287m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(PRN.r0 r0Var, r2 r2Var, List<? extends v.u1> list, long j15, Map<v.u1, h.q1> map, h.s sVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f46282g = r0Var;
            this.f46283h = r2Var;
            this.f46284j = list;
            this.f46285k = j15;
            this.f46286l = map;
            this.f46287m = sVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ju.p0 p0Var;
            Object objE = uq.b.e();
            int i15 = this.f46280e;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    ju.p0 p0Var2 = (ju.p0) this.f46281f;
                    if (!this.f46282g.p()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    r2 r2Var = this.f46283h;
                    List<v.u1> list = this.f46284j;
                    long j15 = this.f46285k;
                    this.f46281f = p0Var2;
                    this.f46280e = 1;
                    Object objM = r2Var.m(list, j15, this);
                    if (objM == objE) {
                        return objE;
                    }
                    p0Var = p0Var2;
                    obj = objM;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p0Var = (ju.p0) this.f46281f;
                    oq.u.b(obj);
                }
                List list2 = (List) obj;
                if (!ju.q0.g(p0Var) || list2.isEmpty()) {
                    e.c cVar = e.c.f45719a;
                    if (o.e1.h("CXCP")) {
                        String unused = e.c.TRUNCATED_TAG;
                        ju.q0.g(p0Var);
                        Objects.toString(list2);
                    }
                    return vq.b.a(false);
                }
                if (!this.f46283h.j(list2)) {
                    e.c cVar2 = e.c.f45719a;
                    if (o.e1.k("CXCP")) {
                        io.sentry.android.core.c2.g(e.c.TRUNCATED_TAG, "Surface setup failed: Some Surfaces are invalid");
                    }
                    this.f46282g.q(this.f46284j.get(list2.indexOf(null)));
                    return vq.b.a(false);
                }
                Object obj2 = this.f46283h.lock;
                r2 r2Var2 = this.f46283h;
                List<v.u1> list3 = this.f46284j;
                synchronized (obj2) {
                    try {
                        List<v.u1> list4 = list3;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(pq.v0.e(pq.v.y(list4, 10)), 16));
                        for (Object obj3 : list4) {
                            Object obj4 = list2.get(list3.indexOf((v.u1) obj3));
                            if (obj4 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            linkedHashMap.put((Surface) obj4, obj3);
                        }
                        r2Var2.configuredSurfaceMap = linkedHashMap;
                        r2Var2.n();
                        oq.i0 i0Var = oq.i0.f148189a;
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                Map<v.u1, h.q1> map = this.f46286l;
                List<v.u1> list5 = this.f46284j;
                h.s sVar = this.f46287m;
                r2 r2Var3 = this.f46283h;
                for (Map.Entry<v.u1, h.q1> entry : map.entrySet()) {
                    int value = entry.getValue().getValue();
                    Surface surface = (Surface) list2.get(list5.indexOf(entry.getKey()));
                    e.c cVar3 = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused2 = e.c.TRUNCATED_TAG;
                        Objects.toString(surface);
                        h.q1.f(value);
                    }
                    sVar.H1(value, surface);
                    r2Var3.inactiveSurfaceCloser.c(value, entry.getKey(), sVar);
                }
                e.c cVar4 = e.c.f45719a;
                if (o.e1.h("CXCP")) {
                    String unused3 = e.c.TRUNCATED_TAG;
                }
                return vq.b.a(true);
            } catch (e3 unused4) {
                e.c cVar5 = e.c.f45719a;
                long j16 = this.f46285k;
                if (o.e1.k("CXCP")) {
                    io.sentry.android.core.c2.g(e.c.TRUNCATED_TAG, "Failed to get Surfaces within " + j16 + " ms");
                }
                return vq.b.a(false);
            } catch (v.u1.a e15) {
                e.c cVar6 = e.c.f45719a;
                if (o.e1.k("CXCP")) {
                    io.sentry.android.core.c2.h(e.c.TRUNCATED_TAG, "Failed to get Surfaces: Surfaces closed", e15);
                }
                this.f46282g.q(e15.a());
                return vq.b.a(false);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((e) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f46282g, this.f46283h, this.f46284j, this.f46285k, this.f46286l, this.f46287m, eVar);
            eVar2.f46281f = obj;
            return eVar2;
        }
    }

    public r2(u2 u2Var, h.z zVar, c.n nVar, PRN.r0 r0Var) {
        this.threads = u2Var;
        this.cameraPipe = zVar;
        this.inactiveSurfaceCloser = nVar;
        this.sessionConfigAdapter = r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(List<? extends Surface> list) {
        return (list.isEmpty() || list.contains(null)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static /* synthetic */ Object l(r2 r2Var, tq.e<? super Boolean> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f46271f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f46271f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = r2Var.new a(eVar);
            }
        } else {
            aVar = r2Var.new a(eVar);
        }
        Object obj = aVar.f46269d;
        Object objE = uq.b.e();
        int i16 = aVar.f46271f;
        try {
            if (i16 != 0) {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            synchronized (r2Var.lock) {
                ju.w0<Boolean> w0Var = r2Var.setupDeferred;
                if (w0Var == null || r2Var.stopDeferred != null) {
                    return vq.b.a(false);
                }
                aVar.f46271f = 1;
                Object objI = w0Var.I(aVar);
                return objI == objE ? objE : objI;
            }
        } catch (CancellationException unused) {
            e.c cVar = e.c.f45719a;
            if (o.e1.k("CXCP")) {
                io.sentry.android.core.c2.g(e.c.TRUNCATED_TAG, "Surface setup was cancelled");
            }
            return vq.b.a(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(List<? extends v.u1> list, long j15, tq.e<? super List<? extends Surface>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f46274f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f46274f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objE = bVar.f46272d;
        Object objE2 = uq.b.e();
        int i16 = bVar.f46274f;
        if (i16 == 0) {
            oq.u.b(objE);
            c cVar = new c(list, null);
            bVar.f46274f = 1;
            objE = g3.e(j15, cVar, bVar);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objE);
        }
        List list2 = (List) objE;
        return list2 == null ? pq.v.n() : list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        this.cameraPipe.b().b(this);
    }

    public static /* synthetic */ ju.w0 p(r2 r2Var, h.s sVar, PRN.r0 r0Var, Map map, long j15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupAsync");
        }
        if ((i15 & 8) != 0) {
            j15 = 5000;
        }
        return r2Var.o(sVar, r0Var, map, j15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(List list, Throwable th4) {
        v.v1.a(list);
        return oq.i0.f148189a;
    }

    private final void s() {
        synchronized (this.lock) {
            try {
                if (this.activeSurfaceMap.isEmpty() && this.configuredSurfaceMap == null) {
                    e.c cVar = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused = e.c.TRUNCATED_TAG;
                        toString();
                    }
                    this.cameraPipe.b().e(this);
                    ju.x<oq.i0> xVar = this.stopDeferred;
                    if (xVar != null) {
                        xVar.d0(oq.i0.f148189a);
                    }
                }
                oq.i0 i0Var = oq.i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // h.e0.b
    public void a(Surface surface) {
        v.u1 u1Var;
        synchronized (this.lock) {
            try {
                Map<Surface, ? extends v.u1> map = this.configuredSurfaceMap;
                if (map != null && (u1Var = map.get(surface)) != null) {
                    if (!this.activeSurfaceMap.containsKey(surface)) {
                        e.c cVar = e.c.f45719a;
                        if (o.e1.f("CXCP")) {
                            String unused = e.c.TRUNCATED_TAG;
                            u1Var.toString();
                            toString();
                        }
                        this.activeSurfaceMap.put(surface, u1Var);
                        try {
                            u1Var.l();
                        } catch (v.u1.a e15) {
                            e.c cVar2 = e.c.f45719a;
                            if (o.e1.k("CXCP")) {
                                io.sentry.android.core.c2.h(e.c.TRUNCATED_TAG, "Error when " + surface + " going to increase the use count.", e15);
                            }
                            this.sessionConfigAdapter.q(e15.a());
                        }
                    }
                    oq.i0 i0Var = oq.i0.f148189a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // h.e0.b
    public void b(Surface surface) {
        synchronized (this.lock) {
            try {
                v.u1 u1VarRemove = this.activeSurfaceMap.remove(surface);
                if (u1VarRemove != null) {
                    e.c cVar = e.c.f45719a;
                    if (o.e1.f("CXCP")) {
                        String unused = e.c.TRUNCATED_TAG;
                        u1VarRemove.toString();
                        toString();
                    }
                    this.inactiveSurfaceCloser.a(u1VarRemove);
                    try {
                        u1VarRemove.e();
                    } catch (IllegalStateException e15) {
                        e.c cVar2 = e.c.f45719a;
                        if (o.e1.k("CXCP")) {
                            io.sentry.android.core.c2.h(e.c.TRUNCATED_TAG, "Error when " + surface + " going to decrease the use count.", e15);
                        }
                    }
                    s();
                    oq.i0 i0Var = oq.i0.f148189a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public Object k(tq.e<? super Boolean> eVar) {
        return l(this, eVar);
    }

    public final ju.w0<Boolean> o(h.s graph, PRN.r0 sessionConfigAdapter, Map<v.u1, h.q1> surfaceToStreamMap, long timeoutMillis) {
        ju.w0<Boolean> w0VarA;
        synchronized (this.lock) {
            try {
                if (this.setupDeferred != null) {
                    throw new IllegalStateException("Surfaces should only be set up once!");
                }
                if (this.stopDeferred != null) {
                    throw new IllegalStateException("Surfaces being setup after stopped!");
                }
                if (this.configuredSurfaceMap != null) {
                    throw new IllegalStateException("Check failed.");
                }
                final List<v.u1> listG = sessionConfigAdapter.g();
                try {
                    v.v1.b(listG);
                    w0VarA = ju.k.b(this.threads.getScope(), null, null, new e(sessionConfigAdapter, this, listG, timeoutMillis, surfaceToStreamMap, graph, null), 3, null);
                    w0VarA.C0(new er.l() { // from class: e.q2
                        @Override // er.l
                        public final Object b(Object obj) {
                            return r2.q(listG, (Throwable) obj);
                        }
                    });
                    this.setupDeferred = w0VarA;
                } catch (v.u1.a e15) {
                    e.c cVar = e.c.f45719a;
                    if (o.e1.k("CXCP")) {
                        io.sentry.android.core.c2.g(e.c.TRUNCATED_TAG, "Failed to increment DeferrableSurfaces: Surfaces closed");
                    }
                    ju.k.d(this.threads.getScope(), null, null, new d(sessionConfigAdapter, e15, null), 3, null);
                    w0VarA = ju.z.a(Boolean.FALSE);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return w0VarA;
    }

    public final ju.w0<oq.i0> r() {
        ju.x<oq.i0> xVarC;
        synchronized (this.lock) {
            try {
                xVarC = this.stopDeferred;
                if (xVarC != null) {
                    e.c cVar = e.c.f45719a;
                    if (o.e1.k("CXCP")) {
                        io.sentry.android.core.c2.g(e.c.TRUNCATED_TAG, "UseCaseSurfaceManager is already stopping!");
                    }
                } else {
                    ju.w0<Boolean> w0Var = this.setupDeferred;
                    if (w0Var != null) {
                        ju.d2.a.a(w0Var, null, 1, null);
                    }
                    this.inactiveSurfaceCloser.b();
                    this.configuredSurfaceMap = null;
                    xVarC = ju.z.c(null, 1, null);
                    this.stopDeferred = xVarC;
                    s();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return xVarC;
    }
}
