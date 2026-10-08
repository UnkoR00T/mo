package ox2;

import al0.ApplicationReason;
import fr.q0;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tt3.AddressSearchData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BS\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001c*\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b(\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010D\u001a\b\u0012\u0004\u0012\u00020?0>8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR&\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030E8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lox2/v;", "Ll00/g;", "Lox2/b;", "Lox2/a;", "Lox2/c;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lqx2/d;", "mapper", "Lml0/g;", "getApplicationReasonsUseCase", "La14/w;", "openUrlUseCase", "globalSnackBarManager", "Lib4/c;", "errorMapper", "Lyw/b;", "accessibilityTalkBackManager", "Lac4/a;", "callActionWithLoaderUC", "Lpx2/a;", "contract", "<init>", "(Lyy/a;Lqx2/d;Lml0/g;La14/w;Li70/e;Lib4/c;Lyw/b;Lac4/a;Lpx2/a;)V", "Lk10/c0;", "Lox2/b$b;", "Lk10/l;", "D9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "state", "Lox2/c$a;", "z9", "(Lox2/b;)Lox2/c$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lqx2/d;", "c", "Lml0/g;", "d", "La14/w;", "e", "Li70/e;", "f", "Lib4/c;", "g", "Lyw/b;", "h", "Lac4/a;", "j", "Lpx2/a;", "Lox2/b$a;", "k", "Lox2/b$a;", "initialState", "Lxw/b;", "Lox2/a$d;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<ox2.b, ox2.a> implements ox2.c, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qx2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ml0.g getApplicationReasonsUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final px2.a contract;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ox2.b.Initial initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ox2.a.d> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ox2.b, ox2.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<ox2.c.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f150549d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f150550e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150551f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f150553h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f150551f = obj;
            this.f150553h |= PKIFailureInfo.systemUnavail;
            return v.this.D9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ox2.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f150554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f150555b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f150556a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f150557b;

            /* JADX INFO: renamed from: ox2.v$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3713a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f150558d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f150559e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f150560f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f150562h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f150563j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f150564k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f150565l;

                public C3713a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f150558d = obj;
                    this.f150559e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f150556a = hVar;
                this.f150557b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3713a c3713a;
                if (eVar instanceof C3713a) {
                    c3713a = (C3713a) eVar;
                    int i15 = c3713a.f150559e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3713a.f150559e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3713a = new C3713a(eVar);
                    }
                } else {
                    c3713a = new C3713a(eVar);
                }
                Object obj2 = c3713a.f150558d;
                Object objE = uq.b.e();
                int i16 = c3713a.f150559e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f150556a;
                    ox2.c.a aVarZ9 = this.f150557b.z9((ox2.b) obj);
                    c3713a.f150560f = vq.j.a(obj);
                    c3713a.f150562h = vq.j.a(c3713a);
                    c3713a.f150563j = vq.j.a(obj);
                    c3713a.f150564k = vq.j.a(hVar);
                    c3713a.f150565l = 0;
                    c3713a.f150559e = 1;
                    if (hVar.F(aVarZ9, c3713a) == objE) {
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

        public b(mu.g gVar, v vVar) {
            this.f150554a = gVar;
            this.f150555b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ox2.c.a> hVar, tq.e eVar) {
            Object objA = this.f150554a.a(new a(hVar, this.f150555b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lox2/a$e;", "<unused var>", "Lox2/b;", "Loq/i0;", "<anonymous>", "(Lox2/a$e;Lox2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ox2.a.e, ox2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150566e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150566e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                ox2.a.d.C3709a c3709a = ox2.a.d.C3709a.f150483a;
                this.f150566e = 1;
                if (vVar.F(c3709a, this) == objE) {
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
        public final Object w(ox2.a.e eVar, ox2.b bVar, tq.e<? super i0> eVar2) {
            return v.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lox2/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lox2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<ox2.b.Initial, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150568e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f150568e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.d9(ox2.a.b.f150481a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ox2.b.Initial initial, tq.e<? super i0> eVar) {
            return ((d) v(initial, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return v.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lox2/a$b;", "<unused var>", "Lk10/c0;", "Lox2/b$a;", "state", "Lk10/l;", "Lox2/b;", "<anonymous>", "(Lox2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ox2.a.b, k10.c0<ox2.b.Initial>, tq.e<? super k10.l<? extends ox2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150571f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lox2/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ox2.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f150573e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v f150574f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<ox2.b.Initial> f150575g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, k10.c0<ox2.b.Initial> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f150574f = vVar;
                this.f150575g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ox2.b.Initialized V(k10.c0 c0Var, List list, v vVar, ox2.b.Initial initial) {
                al0.g ownerWithAge = ((ox2.b.Initial) c0Var.a()).getOwnerWithAge();
                ApplicationReason applicationReasonM = vVar.contract.m();
                return new ox2.b.Initialized(ownerWithAge, list, (applicationReasonM == null || !list.contains(applicationReasonM)) ? null : applicationReasonM, false, false, ox2.d.TopAppBar, 24, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f150573e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.g gVar = this.f150574f.getApplicationReasonsUseCase;
                    ml0.g.Params params = new ml0.g.Params(this.f150575g.a().getOwnerWithAge());
                    this.f150573e = 1;
                    obj = gVar.c(params, this);
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
                final k10.c0<ox2.b.Initial> c0Var = this.f150575g;
                final v vVar = this.f150574f;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    Object objC = c0Var.c();
                    vVar.d9(new ox2.a.OnError(bVar));
                    return objC;
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ox2.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.e.a.V(c0Var, list, vVar, (b.Initial) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f150574f, this.f150575g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ox2.b>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f150571f;
            Object objE = uq.b.e();
            int i15 = this.f150570e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUC;
            a aVar2 = new a(v.this, c0Var, null);
            this.f150571f = vq.j.a(c0Var);
            this.f150570e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ox2.a.b bVar, k10.c0<ox2.b.Initial> c0Var, tq.e<? super k10.l<? extends ox2.b>> eVar) {
            e eVar2 = v.this.new e(eVar);
            eVar2.f150571f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lox2/a$f;", "action", "Lox2/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lox2/a$f;Lox2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ox2.a.OnError, ox2.b.Initial, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f150576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f150577f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f150578g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f150579h;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(v vVar, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    vVar.d9(ox2.a.e.f150488a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    vVar.d9(ox2.a.b.f150481a);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ox2.a.OnError onError = (ox2.a.OnError) this.f150579h;
            Object objE = uq.b.e();
            int i15 = this.f150578g;
            if (i15 == 0) {
                oq.u.b(obj);
                ib4.c cVar = v.this.errorMapper;
                dx.b error = onError.getError();
                final v vVar = v.this;
                jb4.b bVarB = cVar.b(new ib4.c.Params(error, false, new er.l() { // from class: ox2.x
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.f.O(vVar, (ib4.c.b) obj2);
                    }
                }, 2, null));
                xw.b<ox2.a.d> bVarY1 = v.this.Y1();
                ox2.a.d.GoToError goToError = new ox2.a.d.GoToError(bVarB);
                this.f150579h = vq.j.a(onError);
                this.f150576e = vq.j.a(bVarB);
                this.f150577f = 0;
                this.f150578g = 1;
                if (bVarY1.F(goToError, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ox2.a.OnError onError, ox2.b.Initial initial, tq.e<? super i0> eVar) {
            f fVar = v.this.new f(eVar);
            fVar.f150579h = onError;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lox2/a$i;", "<unused var>", "Lox2/b$b;", "Loq/i0;", "<anonymous>", "(Lox2/a$i;Lox2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ox2.a.i, ox2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150581e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f150581e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                ox2.a.d.b bVar = ox2.a.d.b.f150484a;
                this.f150581e = 1;
                if (vVar.F(bVar, this) == objE) {
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
        public final Object w(ox2.a.i iVar, ox2.b.Initialized initialized, tq.e<? super i0> eVar) {
            return v.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lox2/a$c;", "event", "Lk10/c0;", "Lox2/b$b;", "state", "Lk10/l;", "Lox2/b;", "<anonymous>", "(Lox2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ox2.a.GoToSearch, k10.c0<ox2.b.Initialized>, tq.e<? super k10.l<? extends ox2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150584f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f150585g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ox2.b.Initialized O(ox2.b.Initialized initialized) {
            return ox2.b.Initialized.b(initialized, null, null, null, false, false, ox2.d.ReasonDropDown, 31, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ox2.a.GoToSearch goToSearch = (ox2.a.GoToSearch) this.f150584f;
            k10.c0 c0Var = (k10.c0) this.f150585g;
            Object objE = uq.b.e();
            int i15 = this.f150583e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                ox2.a.d.GoToSearch goToSearch2 = new ox2.a.d.GoToSearch(goToSearch.getModel());
                this.f150584f = vq.j.a(goToSearch);
                this.f150585g = c0Var;
                this.f150583e = 1;
                if (vVar.F(goToSearch2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: ox2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.h.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ox2.a.GoToSearch goToSearch, k10.c0<ox2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ox2.b>> eVar) {
            h hVar = v.this.new h(eVar);
            hVar.f150584f = goToSearch;
            hVar.f150585g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lox2/a$h;", "event", "Lk10/c0;", "Lox2/b$b;", "state", "Lk10/l;", "Lox2/b;", "<anonymous>", "(Lox2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ox2.a.OnReasonSelected, k10.c0<ox2.b.Initialized>, tq.e<? super k10.l<? extends ox2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150587e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150588f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f150589g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ox2.b.Initialized O(ox2.a.OnReasonSelected onReasonSelected, ox2.b.Initialized initialized) {
            return ox2.b.Initialized.b(initialized, null, null, onReasonSelected.getReason(), true, false, null, 51, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ox2.a.OnReasonSelected onReasonSelected = (ox2.a.OnReasonSelected) this.f150588f;
            k10.c0 c0Var = (k10.c0) this.f150589g;
            uq.b.e();
            if (this.f150587e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            v.this.accessibilityTalkBackManager.a(c70.a.f23835a.a().J().getText());
            return c0Var.b(new er.l() { // from class: ox2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.i.O(onReasonSelected, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ox2.a.OnReasonSelected onReasonSelected, k10.c0<ox2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ox2.b>> eVar) {
            i iVar = v.this.new i(eVar);
            iVar.f150588f = onReasonSelected;
            iVar.f150589g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lox2/a$j;", "event", "Lox2/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lox2/a$j;Lox2/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ox2.a.OnUrlClicked, ox2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150592f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ox2.a.OnUrlClicked onUrlClicked = (ox2.a.OnUrlClicked) this.f150592f;
            Object objE = uq.b.e();
            int i15 = this.f150591e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = v.this.openUrlUseCase;
                a14.w.Params params = new a14.w.Params(onUrlClicked.getUrl(), false, 2, null);
                this.f150592f = vq.j.a(onUrlClicked);
                this.f150591e = 1;
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
            v vVar = v.this;
            if (iVar instanceof dx.i.Left) {
                vVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ox2.a.OnUrlClicked onUrlClicked, ox2.b.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = v.this.new j(eVar);
            jVar.f150592f = onUrlClicked;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lox2/a$g;", "<unused var>", "Lk10/c0;", "Lox2/b$b;", "state", "Lk10/l;", "Lox2/b;", "<anonymous>", "(Lox2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ox2.a.g, k10.c0<ox2.b.Initialized>, tq.e<? super k10.l<? extends ox2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150595f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f150595f;
            Object objE = uq.b.e();
            int i15 = this.f150594e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            v vVar = v.this;
            this.f150595f = vq.j.a(c0Var);
            this.f150594e = 1;
            Object objD9 = vVar.D9(c0Var, this);
            return objD9 == objE ? objE : objD9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ox2.a.g gVar, k10.c0<ox2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ox2.b>> eVar) {
            k kVar = v.this.new k(eVar);
            kVar.f150595f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lox2/a$a;", "<unused var>", "Lk10/c0;", "Lox2/b$b;", "state", "Lk10/l;", "Lox2/b;", "<anonymous>", "(Lox2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ox2.a.C3708a, k10.c0<ox2.b.Initialized>, tq.e<? super k10.l<? extends ox2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f150597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f150598f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ox2.b.Initialized O(ox2.b.Initialized initialized) {
            return ox2.b.Initialized.b(initialized, null, null, null, false, false, null, 47, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f150598f;
            uq.b.e();
            if (this.f150597e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ox2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.l.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ox2.a.C3708a c3708a, k10.c0<ox2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ox2.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f150598f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    public v(yy.a aVar, qx2.d dVar, ml0.g gVar, a14.w wVar, i70.e eVar, ib4.c cVar, yw.b bVar, ac4.a aVar2, px2.a aVar3) {
        this.mapper = dVar;
        this.getApplicationReasonsUseCase = gVar;
        this.openUrlUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.errorMapper = cVar;
        this.accessibilityTalkBackManager = bVar;
        this.callActionWithLoaderUC = aVar2;
        this.contract = aVar3;
        ox2.b.Initial initial = new ox2.b.Initial(aVar3.getRequireOwnerWithAge());
        this.initialState = initial;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initial, new er.l() { // from class: ox2.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.H9(this.f150536a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), z9(initial));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(v vVar, AddressSearchData addressSearchData) {
        vVar.d9(new ox2.a.GoToSearch(addressSearchData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(v vVar, ApplicationReason applicationReason) {
        vVar.d9(new ox2.a.OnReasonSelected(applicationReason));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(v vVar, String str) {
        vVar.d9(new ox2.a.OnUrlClicked(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D9(k10.c0<ox2.b.Initialized> c0Var, tq.e<? super k10.l<ox2.b.Initialized>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f150553h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f150553h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f150551f;
        Object objE = uq.b.e();
        int i16 = aVar.f150553h;
        if (i16 == 0) {
            oq.u.b(obj);
            ApplicationReason selectedReason = c0Var.a().getSelectedReason();
            if (selectedReason == null) {
                return c0Var.b(new er.l() { // from class: ox2.s
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.E9((b.Initialized) obj2);
                    }
                });
            }
            this.contract.p(selectedReason);
            Object goToNextScreen = new ox2.a.d.GoToNextScreen(c0Var.a().getOwnerWithAge());
            aVar.f150549d = c0Var;
            aVar.f150550e = vq.j.a(selectedReason);
            aVar.f150553h = 1;
            if (F(goToNextScreen, aVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0Var = (k10.c0) aVar.f150549d;
            oq.u.b(obj);
        }
        return c0Var.b(new er.l() { // from class: ox2.t
            @Override // er.l
            public final Object b(Object obj2) {
                return v.F9((b.Initialized) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ox2.b.Initialized E9(ox2.b.Initialized initialized) {
        return ox2.b.Initialized.b(initialized, null, null, null, false, true, null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ox2.b.Initialized F9(ox2.b.Initialized initialized) {
        return ox2.b.Initialized.b(initialized, null, null, null, false, false, ox2.d.TopAppBar, 31, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(ox2.b.class), new er.l() { // from class: ox2.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.I9(this.f150533a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(ox2.b.Initial.class), new er.l() { // from class: ox2.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.J9(this.f150534a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(ox2.b.Initialized.class), new er.l() { // from class: ox2.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.K9(this.f150535a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(v vVar, k10.z zVar) {
        c cVar = vVar.new c(null);
        zVar.x(q0.c(ox2.a.e.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(v vVar, k10.z zVar) {
        zVar.C(vVar.new d(null));
        e eVar = vVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ox2.a.b.class), oVar, eVar);
        zVar.x(q0.c(ox2.a.OnError.class), oVar, vVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(v vVar, k10.z zVar) {
        g gVar = vVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ox2.a.i.class), oVar, gVar);
        zVar.v(q0.c(ox2.a.GoToSearch.class), oVar, vVar.new h(null));
        zVar.v(q0.c(ox2.a.OnReasonSelected.class), oVar, vVar.new i(null));
        zVar.x(q0.c(ox2.a.OnUrlClicked.class), oVar, vVar.new j(null));
        zVar.v(q0.c(ox2.a.g.class), oVar, vVar.new k(null));
        zVar.v(q0.c(ox2.a.C3708a.class), oVar, new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ox2.c.a z9(ox2.b state) {
        return this.mapper.b(new qx2.d.Params(state, new er.l() { // from class: ox2.m
            @Override // er.l
            public final Object b(Object obj) {
                return v.A9(this.f150530a, (AddressSearchData) obj);
            }
        }, new er.l() { // from class: ox2.n
            @Override // er.l
            public final Object b(Object obj) {
                return v.B9(this.f150531a, (ApplicationReason) obj);
            }
        }, new er.l() { // from class: ox2.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.C9(this.f150532a, (String) obj);
            }
        }, b9(ox2.a.C3708a.f150480a), b9(ox2.a.g.f150490a), b9(ox2.a.e.f150488a), b9(ox2.a.i.f150492a)));
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(px2.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<ox2.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ox2.b, ox2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ox2.c.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ox2.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }
}
