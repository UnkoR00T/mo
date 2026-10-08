package q01;

import a14.w;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R&\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030'8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0016048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lq01/o;", "Ll00/g;", "Lq01/f;", "", "Lq01/g;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lu04/a;", "commonEndpoints", "La14/w;", "openUrlIntentUseCase", "Lr01/a;", "screenMapper", "snackBarManagerStateHolder", "<init>", "(Lyy/a;Lu04/a;La14/w;Lr01/a;Li70/n;)V", "Lmx/a;", "message", "Loq/i0;", "o9", "(Lmx/a;)V", "Lq01/g$a;", "m9", "()Lq01/g$a;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lu04/a;", "c", "La14/w;", "d", "Lr01/a;", "e", "Li70/n;", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lq01/e;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lmu/g;", "Li70/p;", "j", "()Lmu/g;", "snackBarVisibilityState", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<f, Object> implements g, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r01.a screenMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<f, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e> navAction = new xw.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state = a9(new a(e9().getState(), this), m9());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f163423a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f163424b;

        /* JADX INFO: renamed from: q01.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4053a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f163425a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f163426b;

            /* JADX INFO: renamed from: q01.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4054a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f163427d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f163428e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f163429f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f163431h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f163432j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f163433k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f163434l;

                public C4054a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f163427d = obj;
                    this.f163428e |= PKIFailureInfo.systemUnavail;
                    return C4053a.this.F(null, this);
                }
            }

            public C4053a(mu.h hVar, o oVar) {
                this.f163425a = hVar;
                this.f163426b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4054a c4054a;
                if (eVar instanceof C4054a) {
                    c4054a = (C4054a) eVar;
                    int i15 = c4054a.f163428e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4054a.f163428e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4054a = new C4054a(eVar);
                    }
                } else {
                    c4054a = new C4054a(eVar);
                }
                Object obj2 = c4054a.f163427d;
                Object objE = uq.b.e();
                int i16 = c4054a.f163428e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f163425a;
                    g.Data dataM9 = this.f163426b.m9();
                    c4054a.f163429f = vq.j.a(obj);
                    c4054a.f163431h = vq.j.a(c4054a);
                    c4054a.f163432j = vq.j.a(obj);
                    c4054a.f163433k = vq.j.a(hVar);
                    c4054a.f163434l = 0;
                    c4054a.f163428e = 1;
                    if (hVar.F(dataM9, c4054a) == objE) {
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
            this.f163423a = gVar;
            this.f163424b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f163423a.a(new C4053a(hVar, this.f163424b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq01/c;", "<unused var>", "Lq01/f;", "Loq/i0;", "<anonymous>", "(Lq01/c;Lq01/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<q01.c, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163435e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f163435e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<e> bVarY1 = o.this.Y1();
                e.a aVar = e.a.f163401a;
                this.f163435e = 1;
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
        public final Object w(q01.c cVar, f fVar, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq01/d;", "<unused var>", "Lq01/f;", "Loq/i0;", "<anonymous>", "(Lq01/d;Lq01/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<d, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f163437e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f163437e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = o.this.openUrlIntentUseCase;
                w.Params params = new w.Params(o.this.commonEndpoints.Q(), false, 2, null);
                this.f163437e = 1;
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
                oVar.o9(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage());
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(d dVar, f fVar, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, u04.a aVar2, w wVar, r01.a aVar3, i70.n nVar) {
        this.commonEndpoints = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.screenMapper = aVar3;
        this.snackBarManagerStateHolder = nVar;
        this.stateMachine = aVar.a(f.f163402a, new er.l() { // from class: q01.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.p9(this.f163414a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data m9() {
        return this.screenMapper.b(new r01.a.Params(b9(q01.c.f163399a), b9(d.f163400a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o9(Label message) {
        y(new p50.a.DefaultWithIcon(message, false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final o oVar, v vVar) {
        vVar.c(q0.c(f.class), new er.l() { // from class: q01.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(this.f163415a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(q01.c.class), oVar2, bVar);
        zVar.x(q0.c(d.class), oVar2, oVar.new c(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<f, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
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
