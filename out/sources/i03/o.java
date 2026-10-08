package i03;

import a14.w;
import fr.q0;
import h03.HistoryPayload;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030'8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u0012048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:098\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010;¨\u0006="}, d2 = {"Li03/o;", "Ll00/g;", "Li03/c;", "", "Li03/d;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lj03/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lh03/b;", "historyPayload", "<init>", "(Lyy/a;Lj03/a;La14/w;Li70/n;Lh03/b;)V", "state", "Li03/d$a;", "l9", "(Li03/c;)Li03/d$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lj03/a;", "c", "La14/w;", "d", "Li70/n;", "e", "Lh03/b;", "f", "Li03/c;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Li03/a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "registeredaddress_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<i03.c, Object> implements d, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j03.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final HistoryPayload historyPayload;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i03.c initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<i03.c, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i03.a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f87799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f87800b;

        /* JADX INFO: renamed from: i03.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2063a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f87801a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f87802b;

            /* JADX INFO: renamed from: i03.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2064a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f87803d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f87804e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f87805f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f87807h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f87808j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f87809k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f87810l;

                public C2064a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f87803d = obj;
                    this.f87804e |= PKIFailureInfo.systemUnavail;
                    return C2063a.this.F(null, this);
                }
            }

            public C2063a(mu.h hVar, o oVar) {
                this.f87801a = hVar;
                this.f87802b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2064a c2064a;
                if (eVar instanceof C2064a) {
                    c2064a = (C2064a) eVar;
                    int i15 = c2064a.f87804e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2064a.f87804e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2064a = new C2064a(eVar);
                    }
                } else {
                    c2064a = new C2064a(eVar);
                }
                Object obj2 = c2064a.f87803d;
                Object objE = uq.b.e();
                int i16 = c2064a.f87804e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f87801a;
                    d.a aVarL9 = this.f87802b.l9((i03.c) obj);
                    c2064a.f87805f = vq.j.a(obj);
                    c2064a.f87807h = vq.j.a(c2064a);
                    c2064a.f87808j = vq.j.a(obj);
                    c2064a.f87809k = vq.j.a(hVar);
                    c2064a.f87810l = 0;
                    c2064a.f87804e = 1;
                    if (hVar.F(aVarL9, c2064a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f87799a = gVar;
            this.f87800b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.a> hVar, tq.e eVar) {
            Object objA = this.f87799a.a(new C2063a(hVar, this.f87800b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li03/a;", "action", "Li03/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li03/a;Li03/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<i03.a, i03.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87811e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f87812f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            i03.a aVar = (i03.a) this.f87812f;
            Object objE = uq.b.e();
            int i15 = this.f87811e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i03.a> bVarY1 = o.this.Y1();
                this.f87812f = vq.j.a(aVar);
                this.f87811e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(i03.a aVar, i03.c cVar, tq.e<? super i0> eVar) {
            b bVar = o.this.new b(eVar);
            bVar.f87812f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li03/b;", "action", "Li03/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li03/b;Li03/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnUrlClick, i03.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87814e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f87815f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnUrlClick onUrlClick = (OnUrlClick) this.f87815f;
            Object objE = uq.b.e();
            int i15 = this.f87814e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = o.this.openUrlIntentUseCase;
                w.Params params = new w.Params(onUrlClick.getUrl(), false, 2, null);
                this.f87815f = vq.j.a(onUrlClick);
                this.f87814e = 1;
                obj = wVar.c(params, this);
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
            o oVar = o.this;
            if (iVar instanceof dx.i.Left) {
                oVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnUrlClick onUrlClick, i03.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = o.this.new c(eVar);
            cVar2.f87815f = onUrlClick;
            return cVar2.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, j03.a aVar2, w wVar, i70.n nVar, HistoryPayload historyPayload) {
        i03.c initialized;
        this.mapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.historyPayload = historyPayload;
        boolean zIsEmpty = historyPayload.b().isEmpty();
        if (!zIsEmpty) {
            initialized = new i03.c.Initialized(historyPayload);
        } else {
            if (!zIsEmpty) {
                throw new oq.p();
            }
            initialized = i03.c.a.f87769a;
        }
        this.initialState = initialized;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: i03.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.o9(this.f87790a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.a l9(i03.c state) {
        return this.mapper.b(new j03.a.Params(state, new er.l() { // from class: i03.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.m9(this.f87788a, (String) obj);
            }
        }, b9(i03.a.C2061a.f87767a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(o oVar, String str) {
        oVar.d9(new OnUrlClick(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final o oVar, v vVar) {
        vVar.c(q0.c(i03.c.class), new er.l() { // from class: i03.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.p9(this.f87789a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(i03.a.class), oVar2, bVar);
        zVar.x(q0.c(OnUrlClick.class), oVar2, oVar.new c(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<i03.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<i03.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(HistoryPayload historyPayload) {
        super.P5(historyPayload);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
