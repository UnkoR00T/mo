package sy0;

import fr.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kh0.BEDashboardFavoritePoints;
import kh0.BEFavoriteMeasurementPoint;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BK\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020 H\u0082@¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020$H\u0082@¢\u0006\u0004\b'\u0010(J\u001e\u0010,\u001a\u00020$2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0082@¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b1\u00102R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010K\u001a\b\u0012\u0004\u0012\u00020F0E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR&\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030L8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006W"}, d2 = {"Lsy0/w;", "Ll00/g;", "Lsy0/d;", "Lsy0/c;", "Lsy0/e;", "", "Lyy/a;", "stateMachineFactory", "Lty0/f;", "mapper", "Lty0/b;", "dialogMapper", "Lib4/c;", "errorMapper", "Lly0/j;", "saveFavouritePointsListUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lby0/d;", "isWidgetAirQualityRemoteFFActiveUC", "Lkh0/d;", "dashboardFavoritePoints", "<init>", "(Lyy/a;Lty0/f;Lty0/b;Lib4/c;Lly0/j;Lac4/a;Lby0/d;Lkh0/d;)V", "state", "Lsy0/e$a;", "B9", "(Lsy0/d;)Lsy0/e$a;", "", "toIndex", "fromIndex", "Lk10/c0;", "Lsy0/d$b;", "Lk10/l;", "x9", "(IILk10/c0;)Lk10/l;", "Loq/i0;", "w9", "(Lsy0/d$b;Ltq/e;)Ljava/lang/Object;", "G9", "(Ltq/e;)Ljava/lang/Object;", "", "Lkh0/g;", "favoritePoints", "E9", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Ljb4/b;", "z9", "(Ldx/b;)Ljb4/b;", "b", "Lty0/f;", "c", "Lty0/b;", "d", "Lib4/c;", "e", "Lly0/j;", "f", "Lac4/a;", "g", "Lby0/d;", "h", "Lkh0/d;", "Lsy0/d$a;", "j", "Lsy0/d$a;", "initialState", "Lxw/b;", "Lsy0/c$f;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w extends l00.g<sy0.d, sy0.c> implements sy0.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ty0.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ty0.b dialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ly0.j saveFavouritePointsListUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final by0.d isWidgetAirQualityRemoteFFActiveUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final BEDashboardFavoritePoints dashboardFavoritePoints;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final sy0.d.Initial initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<sy0.c.f> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sy0.d, sy0.c> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<sy0.e.a> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185625e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<BEFavoriteMeasurementPoint> f185627g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<BEFavoriteMeasurementPoint> list, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f185627g = list;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185625e;
            if (i15 == 0) {
                oq.u.b(obj);
                ly0.j jVar = w.this.saveFavouritePointsListUC;
                List<BEFavoriteMeasurementPoint> list = this.f185627g;
                ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((BEFavoriteMeasurementPoint) it.next()).getId());
                }
                ly0.j.Params params = new ly0.j.Params(arrayList);
                this.f185625e = 1;
                obj = jVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            w wVar = w.this;
            if (iVar instanceof dx.i.Left) {
                wVar.d9(new sy0.c.Error((dx.b) ((dx.i.Left) iVar).b()));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                wVar.d9(sy0.c.b.f185570a);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return w.this.new a(this.f185627g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<sy0.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f185628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w f185629b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f185630a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w f185631b;

            /* JADX INFO: renamed from: sy0.w$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4796a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f185632d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f185633e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f185634f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f185636h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f185637j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f185638k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f185639l;

                public C4796a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f185632d = obj;
                    this.f185633e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w wVar) {
                this.f185630a = hVar;
                this.f185631b = wVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4796a c4796a;
                if (eVar instanceof C4796a) {
                    c4796a = (C4796a) eVar;
                    int i15 = c4796a.f185633e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4796a.f185633e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4796a = new C4796a(eVar);
                    }
                } else {
                    c4796a = new C4796a(eVar);
                }
                Object obj2 = c4796a.f185632d;
                Object objE = uq.b.e();
                int i16 = c4796a.f185633e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f185630a;
                    sy0.e.a aVarB9 = this.f185631b.B9((sy0.d) obj);
                    c4796a.f185634f = vq.j.a(obj);
                    c4796a.f185636h = vq.j.a(c4796a);
                    c4796a.f185637j = vq.j.a(obj);
                    c4796a.f185638k = vq.j.a(hVar);
                    c4796a.f185639l = 0;
                    c4796a.f185633e = 1;
                    if (hVar.F(aVarB9, c4796a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, w wVar) {
            this.f185628a = gVar;
            this.f185629b = wVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super sy0.e.a> hVar, tq.e eVar) {
            Object objA = this.f185628a.a(new a(hVar, this.f185629b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsy0/c$b;", "<unused var>", "Lsy0/d;", "Loq/i0;", "<anonymous>", "(Lsy0/c$b;Lsy0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sy0.c.b, sy0.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185640e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185640e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<sy0.c.f> bVarY1 = w.this.Y1();
                sy0.c.f.Close close = new sy0.c.f.Close(py0.b.DEFAULT);
                this.f185640e = 1;
                if (bVarY1.F(close, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sy0.c.b bVar, sy0.d dVar, tq.e<? super i0> eVar) {
            return w.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsy0/d$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsy0/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<sy0.d.Initial, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185642e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f185642e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            w.this.d9(sy0.c.h.f185579a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(sy0.d.Initial initial, tq.e<? super i0> eVar) {
            return ((d) v(initial, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return w.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy0/c$h;", "<unused var>", "Lk10/c0;", "Lsy0/d$a;", "state", "Lk10/l;", "Lsy0/d;", "<anonymous>", "(Lsy0/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<sy0.c.h, k10.c0<sy0.d.Initial>, tq.e<? super k10.l<? extends sy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185644e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185645f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy0.d.Initialized O(boolean z15, sy0.d.Initial initial) {
            List<BEFavoriteMeasurementPoint> listA = initial.getDashboardFavoritePoints().a();
            List<BEFavoriteMeasurementPoint> listA2 = initial.getDashboardFavoritePoints().a();
            ArrayList arrayList = new ArrayList(pq.v.y(listA2, 10));
            Iterator<T> it = listA2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BEFavoriteMeasurementPoint) it.next()).getId());
            }
            return new sy0.d.Initialized(listA, arrayList, null, z15);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185645f;
            uq.b.e();
            if (this.f185644e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final boolean zBooleanValue = w.this.isWidgetAirQualityRemoteFFActiveUC.a(gz.b.a.C1792a.f78542a).booleanValue();
            return c0Var.d(new er.l() { // from class: sy0.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.e.O(zBooleanValue, (d.Initial) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy0.c.h hVar, k10.c0<sy0.d.Initial> c0Var, tq.e<? super k10.l<? extends sy0.d>> eVar) {
            e eVar2 = w.this.new e(eVar);
            eVar2.f185645f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsy0/c$a;", "<unused var>", "Lsy0/d$b;", "state", "Loq/i0;", "<anonymous>", "(Lsy0/c$a;Lsy0/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sy0.c.a, sy0.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185647e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185648f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sy0.d.Initialized initialized = (sy0.d.Initialized) this.f185648f;
            Object objE = uq.b.e();
            int i15 = this.f185647e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                this.f185648f = vq.j.a(initialized);
                this.f185647e = 1;
                if (wVar.w9(initialized, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sy0.c.a aVar, sy0.d.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = w.this.new f(eVar);
            fVar.f185648f = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsy0/c$g;", "<unused var>", "Lsy0/d$b;", "state", "Loq/i0;", "<anonymous>", "(Lsy0/c$g;Lsy0/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sy0.c.g, sy0.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185650e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185651f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sy0.d.Initialized initialized = (sy0.d.Initialized) this.f185651f;
            Object objE = uq.b.e();
            int i15 = this.f185650e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = w.this;
                List<BEFavoriteMeasurementPoint> listC = initialized.c();
                this.f185651f = vq.j.a(initialized);
                this.f185650e = 1;
                if (wVar.E9(listC, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sy0.c.g gVar, sy0.d.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar2 = w.this.new g(eVar);
            gVar2.f185651f = initialized;
            return gVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lsy0/c$d;", "action", "Lsy0/d$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lsy0/c$d;Lsy0/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sy0.c.Error, sy0.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f185654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185655g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sy0.c.Error error = (sy0.c.Error) this.f185655g;
            Object objE = uq.b.e();
            int i15 = this.f185654f;
            if (i15 == 0) {
                oq.u.b(obj);
                jb4.b bVarZ9 = w.this.z9(error.getDomainError());
                xw.b<sy0.c.f> bVarY1 = w.this.Y1();
                sy0.c.f.Error error2 = new sy0.c.f.Error(bVarZ9);
                this.f185655g = vq.j.a(error);
                this.f185653e = vq.j.a(bVarZ9);
                this.f185654f = 1;
                if (bVarY1.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sy0.c.Error error, sy0.d.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = w.this.new h(eVar);
            hVar.f185655g = error;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy0/c$c;", "action", "Lk10/c0;", "Lsy0/d$b;", "state", "Lk10/l;", "Lsy0/d;", "<anonymous>", "(Lsy0/c$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<sy0.c.DoReorder, k10.c0<sy0.d.Initialized>, tq.e<? super k10.l<? extends sy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185659g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sy0.c.DoReorder doReorder = (sy0.c.DoReorder) this.f185658f;
            k10.c0 c0Var = (k10.c0) this.f185659g;
            uq.b.e();
            if (this.f185657e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return w.this.x9(doReorder.getToIndex(), doReorder.getFromIndex(), c0Var);
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sy0.c.DoReorder doReorder, k10.c0<sy0.d.Initialized> c0Var, tq.e<? super k10.l<? extends sy0.d>> eVar) {
            i iVar = w.this.new i(eVar);
            iVar.f185658f = doReorder;
            iVar.f185659g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy0/c$i;", "action", "Lk10/c0;", "Lsy0/d$b;", "state", "Lk10/l;", "Lsy0/d;", "<anonymous>", "(Lsy0/c$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sy0.c.ShowReorderMenu, k10.c0<sy0.d.Initialized>, tq.e<? super k10.l<? extends sy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185662f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185663g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy0.d.Initialized O(sy0.c.ShowReorderMenu showReorderMenu, sy0.d.Initialized initialized) {
            return sy0.d.Initialized.b(initialized, null, null, showReorderMenu.getPointId(), false, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sy0.c.ShowReorderMenu showReorderMenu = (sy0.c.ShowReorderMenu) this.f185662f;
            k10.c0 c0Var = (k10.c0) this.f185663g;
            uq.b.e();
            if (this.f185661e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sy0.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.j.O(showReorderMenu, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy0.c.ShowReorderMenu showReorderMenu, k10.c0<sy0.d.Initialized> c0Var, tq.e<? super k10.l<? extends sy0.d>> eVar) {
            j jVar = new j(eVar);
            jVar.f185662f = showReorderMenu;
            jVar.f185663g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy0/c$e;", "<unused var>", "Lk10/c0;", "Lsy0/d$b;", "state", "Lk10/l;", "Lsy0/d;", "<anonymous>", "(Lsy0/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<sy0.c.e, k10.c0<sy0.d.Initialized>, tq.e<? super k10.l<? extends sy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185665f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy0.d.Initialized O(sy0.d.Initialized initialized) {
            return sy0.d.Initialized.b(initialized, null, null, null, false, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185665f;
            uq.b.e();
            if (this.f185664e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sy0.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return w.k.O((d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy0.c.e eVar, k10.c0<sy0.d.Initialized> c0Var, tq.e<? super k10.l<? extends sy0.d>> eVar2) {
            k kVar = new k(eVar2);
            kVar.f185665f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    public w(yy.a aVar, ty0.f fVar, ty0.b bVar, ib4.c cVar, ly0.j jVar, ac4.a aVar2, by0.d dVar, BEDashboardFavoritePoints bEDashboardFavoritePoints) {
        this.mapper = fVar;
        this.dialogMapper = bVar;
        this.errorMapper = cVar;
        this.saveFavouritePointsListUC = jVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.isWidgetAirQualityRemoteFFActiveUC = dVar;
        this.dashboardFavoritePoints = bEDashboardFavoritePoints;
        sy0.d.Initial initial = new sy0.d.Initial(bEDashboardFavoritePoints);
        this.initialState = initial;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initial, new er.l() { // from class: sy0.v
            @Override // er.l
            public final Object b(Object obj) {
                return w.H9(this.f185613a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), B9(initial));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(w wVar, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            wVar.d9(sy0.c.g.f185578a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sy0.e.a B9(sy0.d state) {
        return this.mapper.b(new ty0.f.Params(state, b9(sy0.c.a.f185569a), new er.p() { // from class: sy0.o
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return w.C9(this.f185606a, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        }, new er.l() { // from class: sy0.p
            @Override // er.l
            public final Object b(Object obj) {
                return w.D9(this.f185607a, (String) obj);
            }
        }, b9(sy0.c.e.f185574a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(w wVar, int i15, int i16) {
        wVar.d9(new sy0.c.DoReorder(i15, i16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(w wVar, String str) {
        wVar.d9(new sy0.c.ShowReorderMenu(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E9(List<BEFavoriteMeasurementPoint> list, tq.e<? super i0> eVar) {
        Object objA = ac4.a.a(this.callActionWithLoaderUseCase, null, new a(list, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    private final Object G9(tq.e<? super i0> eVar) {
        Object objF = Y1().F(new sy0.c.f.ShowEditDialog(this.dialogMapper.b(new ty0.b.Params(b9(sy0.c.b.f185570a), b9(sy0.c.g.f185578a)))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(final w wVar, k10.v vVar) {
        vVar.c(q0.c(sy0.d.class), new er.l() { // from class: sy0.q
            @Override // er.l
            public final Object b(Object obj) {
                return w.I9(this.f185608a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sy0.d.Initial.class), new er.l() { // from class: sy0.r
            @Override // er.l
            public final Object b(Object obj) {
                return w.J9(this.f185609a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sy0.d.Initialized.class), new er.l() { // from class: sy0.s
            @Override // er.l
            public final Object b(Object obj) {
                return w.K9(this.f185610a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(w wVar, k10.z zVar) {
        c cVar = wVar.new c(null);
        zVar.x(q0.c(sy0.c.b.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(w wVar, k10.z zVar) {
        zVar.C(wVar.new d(null));
        e eVar = wVar.new e(null);
        zVar.v(q0.c(sy0.c.h.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(w wVar, k10.z zVar) {
        f fVar = wVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sy0.c.a.class), oVar, fVar);
        zVar.x(q0.c(sy0.c.g.class), oVar, wVar.new g(null));
        zVar.x(q0.c(sy0.c.Error.class), oVar, wVar.new h(null));
        zVar.v(q0.c(sy0.c.DoReorder.class), oVar, wVar.new i(null));
        zVar.v(q0.c(sy0.c.ShowReorderMenu.class), oVar, new j(null));
        zVar.v(q0.c(sy0.c.e.class), oVar, new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w9(sy0.d.Initialized initialized, tq.e<? super i0> eVar) {
        List<BEFavoriteMeasurementPoint> listC = initialized.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(((BEFavoriteMeasurementPoint) it.next()).getId());
        }
        if (fr.t.c(arrayList, initialized.e())) {
            d9(sy0.c.b.f185570a);
            return i0.f148189a;
        }
        Object objG9 = G9(eVar);
        return objG9 == uq.b.e() ? objG9 : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k10.l<sy0.d.Initialized> x9(int toIndex, int fromIndex, k10.c0<sy0.d.Initialized> state) {
        final List<BEFavoriteMeasurementPoint> listC = state.a().c();
        Collections.swap(listC, toIndex, fromIndex);
        return state.b(new er.l() { // from class: sy0.t
            @Override // er.l
            public final Object b(Object obj) {
                return w.y9(listC, (d.Initialized) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sy0.d.Initialized y9(List list, sy0.d.Initialized initialized) {
        return sy0.d.Initialized.b(initialized, list, null, null, false, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b z9(dx.b domainError) {
        return this.errorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: sy0.u
            @Override // er.l
            public final Object b(Object obj) {
                return w.A9(this.f185612a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(BEDashboardFavoritePoints bEDashboardFavoritePoints) {
        super.P5(bEDashboardFavoritePoints);
    }

    @Override // zx.b
    public xw.b<sy0.c.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<sy0.d, sy0.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<sy0.e.a> getState() {
        return this.state;
    }
}
