package ck1;

import a14.w;
import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030&8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u00102\u001a\b\u0012\u0004\u0012\u00020-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R \u00108\u001a\b\u0012\u0004\u0012\u00020\u0011038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020:098\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u0010;¨\u0006="}, d2 = {"Lck1/m;", "Ll00/g;", "Lck1/d;", "", "Lck1/e;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Ldk1/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lsi1/a;", "defenceTrainingEndpoints", "<init>", "(Lyy/a;Ldk1/a;La14/w;Li70/n;Lsi1/a;)V", "Lck1/e$a;", "l9", "(Lck1/d;)Lck1/e$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Ldk1/a;", "c", "La14/w;", "d", "Li70/n;", "e", "Lsi1/a;", "f", "Lck1/d;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lck1/b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<d, Object> implements e, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dk1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final si1.a defenceTrainingEndpoints;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ck1.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f27859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f27860b;

        /* JADX INFO: renamed from: ck1.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0715a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f27861a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f27862b;

            /* JADX INFO: renamed from: ck1.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0716a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f27863d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f27864e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f27865f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f27867h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f27868j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f27869k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f27870l;

                public C0716a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f27863d = obj;
                    this.f27864e |= PKIFailureInfo.systemUnavail;
                    return C0715a.this.F(null, this);
                }
            }

            public C0715a(mu.h hVar, m mVar) {
                this.f27861a = hVar;
                this.f27862b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0716a c0716a;
                if (eVar instanceof C0716a) {
                    c0716a = (C0716a) eVar;
                    int i15 = c0716a.f27864e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0716a.f27864e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0716a = new C0716a(eVar);
                    }
                } else {
                    c0716a = new C0716a(eVar);
                }
                Object obj2 = c0716a.f27863d;
                Object objE = uq.b.e();
                int i16 = c0716a.f27864e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f27861a;
                    e.Data dataL9 = this.f27862b.l9((d) obj);
                    c0716a.f27865f = vq.j.a(obj);
                    c0716a.f27867h = vq.j.a(c0716a);
                    c0716a.f27868j = vq.j.a(obj);
                    c0716a.f27869k = vq.j.a(hVar);
                    c0716a.f27870l = 0;
                    c0716a.f27864e = 1;
                    if (hVar.F(dataL9, c0716a) == objE) {
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

        public a(mu.g gVar, m mVar) {
            this.f27859a = gVar;
            this.f27860b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f27859a.a(new C0715a(hVar, this.f27860b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lck1/a;", "<unused var>", "Lck1/d;", "Loq/i0;", "<anonymous>", "(Lck1/a;Lck1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<ck1.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27871e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f27871e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<ck1.b> bVarY1 = m.this.Y1();
                ck1.b.a aVar = ck1.b.a.f27829a;
                this.f27871e = 1;
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
        public final Object w(ck1.a aVar, d dVar, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lck1/c;", "<unused var>", "Lck1/d;", "Loq/i0;", "<anonymous>", "(Lck1/c;Lck1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<ck1.c, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f27873e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f27873e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = m.this.openUrlIntentUseCase;
                w.Params params = new w.Params(m.this.defenceTrainingEndpoints.e0(), false, 2, null);
                this.f27873e = 1;
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
            m mVar = m.this;
            if (iVar instanceof dx.i.Left) {
                mVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ck1.c cVar, d dVar, tq.e<? super i0> eVar) {
            return m.this.new c(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, dk1.a aVar2, w wVar, i70.n nVar, si1.a aVar3) {
        this.mapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.defenceTrainingEndpoints = aVar3;
        d dVar = d.f27831a;
        this.initialState = dVar;
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: ck1.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.n9(this.f27849a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data l9(d dVar) {
        return this.mapper.b(new dk1.a.Params(dVar, b9(ck1.a.f27828a), b9(ck1.c.f27830a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final m mVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: ck1.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f27850a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ck1.a.class), oVar, bVar);
        zVar.x(q0.c(ck1.c.class), oVar, mVar.new c(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<ck1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d, Object> e9() {
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
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
