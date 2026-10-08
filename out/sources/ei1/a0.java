package ei1;

import c3.SnapshotStateList;
import ch1.p0;
import fr.q0;
import iq0.CategoryDashboardServices;
import iq0.DashboardServiceEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.x5;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R,\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030&8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010\u0016\u001a\u0004\b)\u0010*R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010\u0016\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lei1/a0;", "Ll00/g;", "Lei1/b;", "Lei1/a;", "Lei1/c;", "", "Lyy/a;", "stateMachineFactory", "Lch1/c0;", "getServicesUseCase", "Lch1/p0;", "saveFavouriteServicesUC", "Lfi1/b;", "servicesFavouritesScreenMapper", "<init>", "(Lyy/a;Lch1/c0;Lch1/p0;Lfi1/b;)V", "state", "Lfi1/b$a;", "r9", "(Lei1/b;)Lfi1/b$a;", "Loq/i0;", "d", "()V", "b", "Lch1/c0;", "c", "Lch1/p0;", "Lfi1/b;", "e", "Lei1/b;", "initialState", "Lxw/b;", "Lei1/a$e;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lmu/p0;", "Lei1/c$a;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 extends l00.g<State, ei1.a> implements ei1.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ch1.c0 getServicesUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p0 saveFavouriteServicesUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final fi1.b servicesFavouritesScreenMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ei1.a.e> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, ei1.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ei1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ei1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f51566a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a0 f51567b;

        /* JADX INFO: renamed from: ei1.a0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1215a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f51568a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a0 f51569b;

            /* JADX INFO: renamed from: ei1.a0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1216a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f51570d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f51571e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f51572f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f51574h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f51575j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f51576k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f51577l;

                public C1216a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f51570d = obj;
                    this.f51571e |= PKIFailureInfo.systemUnavail;
                    return C1215a.this.F(null, this);
                }
            }

            public C1215a(mu.h hVar, a0 a0Var) {
                this.f51568a = hVar;
                this.f51569b = a0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1216a c1216a;
                if (eVar instanceof C1216a) {
                    c1216a = (C1216a) eVar;
                    int i15 = c1216a.f51571e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1216a.f51571e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1216a = new C1216a(eVar);
                    }
                } else {
                    c1216a = new C1216a(eVar);
                }
                Object obj2 = c1216a.f51570d;
                Object objE = uq.b.e();
                int i16 = c1216a.f51571e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f51568a;
                    ei1.c.Data dataB = this.f51569b.servicesFavouritesScreenMapper.b(this.f51569b.r9((State) obj));
                    c1216a.f51572f = vq.j.a(obj);
                    c1216a.f51574h = vq.j.a(c1216a);
                    c1216a.f51575j = vq.j.a(obj);
                    c1216a.f51576k = vq.j.a(hVar);
                    c1216a.f51577l = 0;
                    c1216a.f51571e = 1;
                    if (hVar.F(dataB, c1216a) == objE) {
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

        public a(mu.g gVar, a0 a0Var) {
            this.f51566a = gVar;
            this.f51567b = a0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ei1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f51566a.a(new C1215a(hVar, this.f51567b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lei1/a$b;", "<unused var>", "Lei1/b;", "Loq/i0;", "<anonymous>", "(Lei1/a$b;Lei1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ei1.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51578e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f51578e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            a0.this.d9(ei1.a.g.f51558a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ei1.a.b bVar, State state, tq.e<? super i0> eVar) {
            return a0.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lei1/a$c;", "<unused var>", "Lei1/b;", "Loq/i0;", "<anonymous>", "(Lei1/a$c;Lei1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ei1.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51580e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f51580e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ei1.a.e> bVarY1 = a0.this.Y1();
                ei1.a.e.C1214a c1214a = ei1.a.e.C1214a.f51556a;
                this.f51580e = 1;
                if (bVarY1.F(c1214a, this) == objE) {
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
        public final Object w(ei1.a.c cVar, State state, tq.e<? super i0> eVar) {
            return a0.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lch1/c0$a;", "result", "Lk10/c0;", "Lei1/b;", "state", "Lk10/l;", "<anonymous>", "(Lch1/c0$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ch1.c0.ServicesResult, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f51583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f51584g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ch1.c0.ServicesResult servicesResult, State state) {
            List<DashboardServiceEntry> listB = servicesResult.b();
            List<CategoryDashboardServices> listA = servicesResult.a();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                pq.v.D(arrayList, ((CategoryDashboardServices) it.next()).b());
            }
            return state.a(listB, arrayList);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ch1.c0.ServicesResult servicesResult = (ch1.c0.ServicesResult) this.f51583f;
            k10.c0 c0Var = (k10.c0) this.f51584g;
            uq.b.e();
            if (this.f51582e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ei1.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.d.O(servicesResult, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ch1.c0.ServicesResult servicesResult, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f51583f = servicesResult;
            dVar.f51584g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lei1/a$g;", "<unused var>", "Lei1/b;", "state", "Loq/i0;", "<anonymous>", "(Lei1/a$g;Lei1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ei1.a.g, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f51586f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f51586f;
            Object objE = uq.b.e();
            int i15 = this.f51585e;
            if (i15 == 0) {
                oq.u.b(obj);
                p0 p0Var = a0.this.saveFavouriteServicesUC;
                p0.Params params = new p0.Params(state.d());
                this.f51586f = vq.j.a(state);
                this.f51585e = 1;
                if (p0Var.d(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            a0.this.d9(ei1.a.c.f51553a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ei1.a.g gVar, State state, tq.e<? super i0> eVar) {
            e eVar2 = a0.this.new e(eVar);
            eVar2.f51586f = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lei1/a$d;", "action", "Lk10/c0;", "Lei1/b;", "state", "Lk10/l;", "<anonymous>", "(Lei1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ei1.a.DoReorder, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f51589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f51590g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(List list, State state) {
            return State.b(state, list, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.l lVarB;
            ei1.a.DoReorder doReorder = (ei1.a.DoReorder) this.f51589f;
            k10.c0 c0Var = (k10.c0) this.f51590g;
            uq.b.e();
            if (this.f51588e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final List listA = qi1.a.a(((State) c0Var.a()).d(), doReorder.getFromIndex(), doReorder.getToIndex());
            return (listA == null || (lVarB = c0Var.b(new er.l() { // from class: ei1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.f.O(listA, (State) obj2);
                }
            })) == null) ? c0Var.c() : lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ei1.a.DoReorder doReorder, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f51589f = doReorder;
            fVar.f51590g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lei1/a$a;", "action", "Lk10/c0;", "Lei1/b;", "state", "Lk10/l;", "<anonymous>", "(Lei1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ei1.a.AddItem, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f51592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f51593g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, ei1.a.AddItem addItem, State state) {
            SnapshotStateList snapshotStateListS = x5.s(((State) c0Var.a()).d());
            snapshotStateListS.add(addItem.getItem());
            return State.b(state, snapshotStateListS, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ei1.a.AddItem addItem = (ei1.a.AddItem) this.f51592f;
            final k10.c0 c0Var = (k10.c0) this.f51593g;
            uq.b.e();
            if (this.f51591e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ei1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.g.O(c0Var, addItem, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ei1.a.AddItem addItem, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f51592f = addItem;
            gVar.f51593g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lei1/a$f;", "action", "Lk10/c0;", "Lei1/b;", "state", "Lk10/l;", "<anonymous>", "(Lei1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ei1.a.RemoveItem, k10.c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f51594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f51595f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f51596g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(k10.c0 c0Var, ei1.a.RemoveItem removeItem, State state) {
            SnapshotStateList snapshotStateListS = x5.s(((State) c0Var.a()).d());
            snapshotStateListS.remove(removeItem.getItem());
            return State.b(state, snapshotStateListS, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ei1.a.RemoveItem removeItem = (ei1.a.RemoveItem) this.f51595f;
            final k10.c0 c0Var = (k10.c0) this.f51596g;
            uq.b.e();
            if (this.f51594e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ei1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return a0.h.O(c0Var, removeItem, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ei1.a.RemoveItem removeItem, k10.c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            h hVar = new h(eVar);
            hVar.f51595f = removeItem;
            hVar.f51596g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    public a0(yy.a aVar, ch1.c0 c0Var, p0 p0Var, fi1.b bVar) {
        this.getServicesUseCase = c0Var;
        this.saveFavouriteServicesUC = p0Var;
        this.servicesFavouritesScreenMapper = bVar;
        State state = new State(pq.v.n(), pq.v.n());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ei1.t
            @Override // er.l
            public final Object b(Object obj) {
                return a0.x9(this.f51633a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), bVar.b(r9(state)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fi1.b.Params r9(State state) {
        return new fi1.b.Params(state, new er.a() { // from class: ei1.w
            @Override // er.a
            public final Object a() {
                return a0.s9(this.f51636a);
            }
        }, new er.l() { // from class: ei1.x
            @Override // er.l
            public final Object b(Object obj) {
                return a0.t9(this.f51637a, (DashboardServiceEntry) obj);
            }
        }, new er.l() { // from class: ei1.y
            @Override // er.l
            public final Object b(Object obj) {
                return a0.u9(this.f51638a, (DashboardServiceEntry) obj);
            }
        }, new er.p() { // from class: ei1.z
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return a0.v9(this.f51639a, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(a0 a0Var) {
        a0Var.d9(ei1.a.b.f51552a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(a0 a0Var, DashboardServiceEntry dashboardServiceEntry) {
        a0Var.d9(new ei1.a.RemoveItem(dashboardServiceEntry));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(a0 a0Var, DashboardServiceEntry dashboardServiceEntry) {
        a0Var.d9(new ei1.a.AddItem(dashboardServiceEntry));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(a0 a0Var, int i15, int i16) {
        a0Var.d9(new ei1.a.DoReorder(i15, i16));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final a0 a0Var, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ei1.u
            @Override // er.l
            public final Object b(Object obj) {
                return a0.y9(this.f51634a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: ei1.v
            @Override // er.l
            public final Object b(Object obj) {
                return a0.z9(this.f51635a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(a0 a0Var, k10.z zVar) {
        b bVar = a0Var.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ei1.a.b.class), oVar, bVar);
        zVar.x(q0.c(ei1.a.c.class), oVar, a0Var.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(a0 a0Var, k10.z zVar) {
        k10.k.m(zVar, a0Var.getServicesUseCase.b(gz.b.a.C1792a.f78542a), null, new d(null), 2, null);
        e eVar = a0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ei1.a.g.class), oVar, eVar);
        zVar.v(q0.c(ei1.a.DoReorder.class), oVar, new f(null));
        zVar.v(q0.c(ei1.a.AddItem.class), oVar, new g(null));
        zVar.v(q0.c(ei1.a.RemoveItem.class), oVar, new h(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ei1.a.e> Y1() {
        return this.navAction;
    }

    @Override // ei1.c
    public void d() {
        d9(ei1.a.b.f51552a);
    }

    @Override // l00.g
    protected k10.t<State, ei1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ei1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
