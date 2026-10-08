package xr3;

import bt3.SetupData;
import cj0.BookedZusEVisitSummary;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0013J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0011H\u0096\u0001¢\u0006\u0004\b \u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R,\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u0013\u001a\u0004\b.\u0010/R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R&\u0010?\u001a\b\u0012\u0004\u0012\u00020\u0014098\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b:\u0010;\u0012\u0004\b>\u0010\u0013\u001a\u0004\b<\u0010=R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010B¨\u0006D"}, d2 = {"Lxr3/p;", "Ll00/g;", "Lxr3/g;", "", "Lxr3/h;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lnr3/a;", "addVisitToCalendarUseCase", "Lyr3/b;", "screenMapper", "snackBarManagerStateHolder", "Lcj0/e;", "setupData", "<init>", "(Lyy/a;Lnr3/a;Lyr3/b;Li70/n;Lcj0/e;)V", "Loq/i0;", "d", "()V", "Lxr3/h$a;", "p9", "(Lxr3/g;)Lxr3/h$a;", "", "visitId", "q9", "(J)V", "n9", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "b", "Lnr3/a;", "c", "Lyr3/b;", "Li70/n;", "e", "Lcj0/e;", "f", "Lxr3/g;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "Lxr3/f;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements h, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nr3.a addVisitToCalendarUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yr3.b screenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final BookedZusEVisitSummary setupData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xr3.f> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<i0> {
        a(Object obj) {
            super(0, obj, p.class, "onBackPressed", "onBackPressed()V", 0);
        }

        public final void E() {
            ((p) this.f66391b).d();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.a<i0> {
        b(Object obj) {
            super(0, obj, p.class, "addToCalendar", "addToCalendar()V", 0);
        }

        public final void E() {
            ((p) this.f66391b).n9();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<Long, i0> {
        c(Object obj) {
            super(1, obj, p.class, "onDetailsClick", "onDetailsClick(J)V", 0);
        }

        public final void E(long j15) {
            ((p) this.f66391b).q9(j15);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Long l15) {
            E(l15.longValue());
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220640e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f220642g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j15, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f220642g = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f220640e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                xr3.f.EnterDetails enterDetails = new xr3.f.EnterDetails(new SetupData(this.f220642g, false));
                this.f220640e = 1;
                if (pVar.F(enterDetails, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return p.this.new d(this.f220642g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f220643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f220644b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f220645a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f220646b;

            /* JADX INFO: renamed from: xr3.p$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5900a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f220647d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f220648e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f220649f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f220651h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f220652j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f220653k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f220654l;

                public C5900a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f220647d = obj;
                    this.f220648e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f220645a = hVar;
                this.f220646b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5900a c5900a;
                if (eVar instanceof C5900a) {
                    c5900a = (C5900a) eVar;
                    int i15 = c5900a.f220648e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5900a.f220648e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5900a = new C5900a(eVar);
                    }
                } else {
                    c5900a = new C5900a(eVar);
                }
                Object obj2 = c5900a.f220647d;
                Object objE = uq.b.e();
                int i16 = c5900a.f220648e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f220645a;
                    h.Data dataP9 = this.f220646b.p9((State) obj);
                    c5900a.f220649f = vq.j.a(obj);
                    c5900a.f220651h = vq.j.a(c5900a);
                    c5900a.f220652j = vq.j.a(obj);
                    c5900a.f220653k = vq.j.a(hVar);
                    c5900a.f220654l = 0;
                    c5900a.f220648e = 1;
                    if (hVar.F(dataP9, c5900a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public e(mu.g gVar, p pVar) {
            this.f220643a = gVar;
            this.f220644b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f220643a.a(new a(hVar, this.f220644b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxr3/d;", "<unused var>", "Lxr3/g;", "state", "Loq/i0;", "<anonymous>", "(Lxr3/d;Lxr3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<xr3.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f220655e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f220656f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f220657g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f220657g;
            Object objE = uq.b.e();
            int i15 = this.f220656f;
            if (i15 == 0) {
                u.b(obj);
                BookedZusEVisitSummary bookedData = state.getBookedData();
                nr3.a aVar = p.this.addVisitToCalendarUseCase;
                long jK = ez.d.k(bookedData.getVisitDate().getDate());
                long jK2 = ez.d.k(bookedData.getVisitEndDate().getDate());
                nr3.a.Params params = new nr3.a.Params(bookedData.getTopic(), jK, vq.b.f(jK2), bookedData.getVisitUrl());
                this.f220657g = vq.j.a(state);
                this.f220655e = vq.j.a(bookedData);
                this.f220656f = 1;
                obj = aVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            p pVar = p.this;
            if (iVar instanceof dx.i.Left) {
                pVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xr3.d dVar, State state, tq.e<? super i0> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f220657g = state;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxr3/e;", "<unused var>", "Lxr3/g;", "Loq/i0;", "<anonymous>", "(Lxr3/e;Lxr3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<xr3.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220659e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f220659e;
            if (i15 == 0) {
                u.b(obj);
                p pVar = p.this;
                xr3.f.a aVar = xr3.f.a.f220614a;
                this.f220659e = 1;
                if (pVar.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xr3.e eVar, State state, tq.e<? super i0> eVar2) {
            return p.this.new g(eVar2).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, nr3.a aVar2, yr3.b bVar, i70.n nVar, BookedZusEVisitSummary bookedZusEVisitSummary) {
        this.addVisitToCalendarUseCase = aVar2;
        this.screenMapper = bVar;
        this.snackBarManagerStateHolder = nVar;
        this.setupData = bookedZusEVisitSummary;
        State state = new State(bookedZusEVisitSummary);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: xr3.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.s9(this.f220631a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new e(e9().getState(), this), p9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        d9(xr3.e.f220613a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n9() {
        d9(xr3.d.f220612a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data p9(State state) {
        return this.screenMapper.b(new yr3.b.Params(state, new a(this), new b(this), new c(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q9(long visitId) {
        i00.a.a(this, new d(visitId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: xr3.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f220630a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(p pVar, z zVar) {
        f fVar = pVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xr3.d.class), oVar, fVar);
        zVar.x(q0.c(xr3.e.class), oVar, pVar.new g(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<xr3.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(xr3.f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(BookedZusEVisitSummary bookedZusEVisitSummary) {
        super.P5(bookedZusEVisitSummary);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
