package o72;

import a14.w;
import fr.q0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u0010008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lo72/r;", "Ll00/g;", "Lo72/d;", "", "Lo72/e;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "La14/w;", "openUrlIntentUseCase", "Lp72/a;", "mapper", "snackBarManagerStateHolder", "<init>", "(Lyy/a;La14/w;Lp72/a;Li70/n;)V", "state", "Lo72/e$a;", "l9", "(Lo72/d;)Lo72/e$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "La14/w;", "c", "Lp72/a;", "d", "Li70/n;", "e", "Lo72/d;", "initialState", "Lxw/b;", "Lo72/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "j", "()Lmu/g;", "snackBarVisibilityState", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<d, Object> implements e, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p72.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<o72.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<d, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f142911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f142912b;

        /* JADX INFO: renamed from: o72.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3538a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f142913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f142914b;

            /* JADX INFO: renamed from: o72.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3539a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f142915d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f142916e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f142917f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f142919h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f142920j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f142921k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f142922l;

                public C3539a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f142915d = obj;
                    this.f142916e |= PKIFailureInfo.systemUnavail;
                    return C3538a.this.F(null, this);
                }
            }

            public C3538a(mu.h hVar, r rVar) {
                this.f142913a = hVar;
                this.f142914b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3539a c3539a;
                if (eVar instanceof C3539a) {
                    c3539a = (C3539a) eVar;
                    int i15 = c3539a.f142916e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3539a.f142916e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3539a = new C3539a(eVar);
                    }
                } else {
                    c3539a = new C3539a(eVar);
                }
                Object obj2 = c3539a.f142915d;
                Object objE = uq.b.e();
                int i16 = c3539a.f142916e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f142913a;
                    e.Data dataL9 = this.f142914b.l9((d) obj);
                    c3539a.f142917f = vq.j.a(obj);
                    c3539a.f142919h = vq.j.a(c3539a);
                    c3539a.f142920j = vq.j.a(obj);
                    c3539a.f142921k = vq.j.a(hVar);
                    c3539a.f142922l = 0;
                    c3539a.f142916e = 1;
                    if (hVar.F(dataL9, c3539a) == objE) {
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

        public a(mu.g gVar, r rVar) {
            this.f142911a = gVar;
            this.f142912b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f142911a.a(new C3538a(hVar, this.f142912b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo72/a;", "<unused var>", "Lo72/d;", "Loq/i0;", "<anonymous>", "(Lo72/a;Lo72/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<o72.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142923e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f142923e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<o72.b> bVarY1 = r.this.Y1();
                o72.b.a aVar = o72.b.a.f142879a;
                this.f142923e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(o72.a aVar, d dVar, tq.e<? super i0> eVar) {
            return r.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo72/c;", "action", "Lo72/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lo72/c;Lo72/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnUrlClick, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f142925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f142926f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnUrlClick onUrlClick = (OnUrlClick) this.f142926f;
            Object objE = uq.b.e();
            int i15 = this.f142925e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = r.this.openUrlIntentUseCase;
                w.Params params = new w.Params(onUrlClick.getUrl(), false, 2, null);
                this.f142926f = vq.j.a(onUrlClick);
                this.f142925e = 1;
                obj = wVar.c(params, this);
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
            r rVar = r.this;
            if (iVar instanceof dx.i.Left) {
                rVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OnUrlClick onUrlClick, d dVar, tq.e<? super i0> eVar) {
            c cVar = r.this.new c(eVar);
            cVar.f142926f = onUrlClick;
            return cVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, w wVar, p72.a aVar2, i70.n nVar) {
        this.openUrlIntentUseCase = wVar;
        this.mapper = aVar2;
        this.snackBarManagerStateHolder = nVar;
        d dVar = d.f142881a;
        this.initialState = dVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: o72.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.o9(this.f142901a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data l9(d state) {
        return this.mapper.b(new p72.a.Params(state, b9(o72.a.f142878a), new er.l() { // from class: o72.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.m9(this.f142903a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(r rVar, String str) {
        rVar.d9(new OnUrlClick(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final r rVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: o72.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.p9(this.f142902a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(r rVar, z zVar) {
        b bVar = rVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(o72.a.class), oVar, bVar);
        zVar.x(q0.c(OnUrlClick.class), oVar, rVar.new c(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<o72.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
