package wp3;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oo0.RoundSummaryModel;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B9\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ4\u0010#\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0082@¢\u0006\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u0015058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lwp3/r;", "Ll00/g;", "Lwp3/f;", "Lwp3/e;", "Lwp3/g;", "", "Lyy/a;", "stateMachineFactory", "Lxp3/a;", "screenMapper", "Lpo0/e;", "fetchRoundSummaryUC", "Lib4/c;", "genericDomainErrorMapper", "Lc54/b;", "isFeatureEnabledUseCase", "Lac4/a;", "callActionWithLoaderUC", "<init>", "(Lyy/a;Lxp3/a;Lpo0/e;Lib4/c;Lc54/b;Lac4/a;)V", "state", "Lwp3/g$a;", "v9", "(Lwp3/f;)Lwp3/g$a;", "Lk10/c0;", "Lwp3/f$a;", "Lk10/l;", "s9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "retryAction", "closeAction", "t9", "(Ldx/b;Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "b", "Lxp3/a;", "c", "Lpo0/e;", "d", "Lib4/c;", "e", "Lc54/b;", "f", "Lac4/a;", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lwp3/e$e;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<wp3.f, wp3.e> implements wp3.g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xp3.a screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final po0.e fetchRoundSummaryUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<wp3.f, wp3.e> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<wp3.g.a> state;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wp3.e.InterfaceC5680e> navAction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lwp3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends wp3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f214358e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f214359f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f214360g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f214361h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f214362j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f214363k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ c0<wp3.f.a> f214365m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c0<wp3.f.a> c0Var, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f214365m = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final wp3.f.Initialized V(RoundSummaryModel roundSummaryModel, r rVar, wp3.f.a aVar) {
            return new wp3.f.Initialized(roundSummaryModel, rVar.isFeatureEnabledUseCase.a(b54.c.VOTE_IDEA_DEV).booleanValue());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0<wp3.f.a> c0Var;
            Object objE = uq.b.e();
            int i15 = this.f214363k;
            if (i15 == 0) {
                oq.u.b(obj);
                po0.e eVar = r.this.fetchRoundSummaryUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f214363k = 1;
                obj = eVar.c(c1792a, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0Var = (c0) this.f214359f;
                oq.u.b(obj);
            }
            return c0Var.c();
            dx.i iVar = (dx.i) obj;
            final r rVar = r.this;
            c0<wp3.f.a> c0Var2 = this.f214365m;
            if (!(iVar instanceof dx.i.Left)) {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final RoundSummaryModel roundSummaryModel = (RoundSummaryModel) ((dx.i.Right) iVar).b();
                return c0Var2.d(new er.l() { // from class: wp3.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return r.a.V(roundSummaryModel, rVar, (f.a) obj2);
                    }
                });
            }
            dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
            er.a aVarB9 = rVar.b9(wp3.e.b.f214319a);
            er.a aVarB10 = rVar.b9(wp3.e.a.f214318a);
            this.f214358e = vq.j.a(iVar);
            this.f214359f = c0Var2;
            this.f214360g = vq.j.a(bVar);
            this.f214361h = 0;
            this.f214362j = 0;
            this.f214363k = 2;
            if (rVar.t9(bVar, aVarB9, aVarB10, this) != objE) {
                c0Var = c0Var2;
                return c0Var.c();
            }
            return objE;
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return r.this.new a(this.f214365m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<? extends wp3.f>> eVar) {
            return ((a) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<wp3.g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f214366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f214367b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f214368a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f214369b;

            /* JADX INFO: renamed from: wp3.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5683a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f214370d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f214371e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f214372f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f214374h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f214375j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f214376k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f214377l;

                public C5683a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f214370d = obj;
                    this.f214371e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f214368a = hVar;
                this.f214369b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5683a c5683a;
                if (eVar instanceof C5683a) {
                    c5683a = (C5683a) eVar;
                    int i15 = c5683a.f214371e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5683a.f214371e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5683a = new C5683a(eVar);
                    }
                } else {
                    c5683a = new C5683a(eVar);
                }
                Object obj2 = c5683a.f214370d;
                Object objE = uq.b.e();
                int i16 = c5683a.f214371e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f214368a;
                    wp3.g.a aVarV9 = this.f214369b.v9((wp3.f) obj);
                    c5683a.f214372f = vq.j.a(obj);
                    c5683a.f214374h = vq.j.a(c5683a);
                    c5683a.f214375j = vq.j.a(obj);
                    c5683a.f214376k = vq.j.a(hVar);
                    c5683a.f214377l = 0;
                    c5683a.f214371e = 1;
                    if (hVar.F(aVarV9, c5683a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f214366a = gVar;
            this.f214367b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super wp3.g.a> hVar, tq.e eVar) {
            Object objA = this.f214366a.a(new a(hVar, this.f214367b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwp3/e$a;", "<unused var>", "Lwp3/f;", "Loq/i0;", "<anonymous>", "(Lwp3/e$a;Lwp3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<wp3.e.a, wp3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214378e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f214378e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wp3.e.InterfaceC5680e> bVarY1 = r.this.Y1();
                wp3.e.InterfaceC5680e.a aVar = wp3.e.InterfaceC5680e.a.f214322a;
                this.f214378e = 1;
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
        public final Object w(wp3.e.a aVar, wp3.f fVar, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwp3/e$d;", "<unused var>", "Lwp3/f;", "Loq/i0;", "<anonymous>", "(Lwp3/e$d;Lwp3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<wp3.e.d, wp3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214380e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f214380e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wp3.e.InterfaceC5680e> bVarY1 = r.this.Y1();
                wp3.e.InterfaceC5680e.d dVar = wp3.e.InterfaceC5680e.d.f214325a;
                this.f214380e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(wp3.e.d dVar, wp3.f fVar, tq.e<? super i0> eVar) {
            return r.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwp3/f$a;", "it", "Loq/i0;", "<anonymous>", "(Lwp3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<wp3.f.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214382e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f214382e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            r.this.d9(wp3.e.b.f214319a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(wp3.f.a aVar, tq.e<? super i0> eVar) {
            return ((e) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return r.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lwp3/e$b;", "<unused var>", "Lk10/c0;", "Lwp3/f$a;", "state", "Lk10/l;", "Lwp3/f;", "<anonymous>", "(Lwp3/e$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<wp3.e.b, c0<wp3.f.a>, tq.e<? super k10.l<? extends wp3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214385f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f214385f;
            Object objE = uq.b.e();
            int i15 = this.f214384e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            r rVar = r.this;
            this.f214385f = vq.j.a(c0Var);
            this.f214384e = 1;
            Object objS9 = rVar.s9(c0Var, this);
            return objS9 == objE ? objE : objS9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(wp3.e.b bVar, c0<wp3.f.a> c0Var, tq.e<? super k10.l<? extends wp3.f>> eVar) {
            f fVar = r.this.new f(eVar);
            fVar.f214385f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwp3/e$f;", "<unused var>", "Lwp3/f$b;", "Loq/i0;", "<anonymous>", "(Lwp3/e$f;Lwp3/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<wp3.e.f, wp3.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214387e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f214387e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<wp3.e.InterfaceC5680e> bVarY1 = r.this.Y1();
                wp3.e.InterfaceC5680e.f fVar = wp3.e.InterfaceC5680e.f.f214327a;
                this.f214387e = 1;
                if (bVarY1.F(fVar, this) == objE) {
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
        public final Object w(wp3.e.f fVar, wp3.f.Initialized initialized, tq.e<? super i0> eVar) {
            return r.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwp3/e$c;", "<unused var>", "Lwp3/f$b;", "state", "Loq/i0;", "<anonymous>", "(Lwp3/e$c;Lwp3/f$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<wp3.e.c, wp3.f.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214390f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        
            if (r6.F(r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f214390f
                wp3.f$b r0 = (wp3.f.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f214389e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                oq.u.b(r6)
                goto L56
            L1f:
                oq.u.b(r6)
                boolean r6 = r0.getIsVoteIdeaDevFFEnabled()
                if (r6 == 0) goto L3f
                wp3.r r6 = wp3.r.this
                xw.b r6 = r6.Y1()
                wp3.e$e$c r2 = wp3.e.InterfaceC5680e.c.f214324a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f214390f = r0
                r5.f214389e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L56
                goto L55
            L3f:
                wp3.r r6 = wp3.r.this
                xw.b r6 = r6.Y1()
                wp3.e$e$e r2 = wp3.e.InterfaceC5680e.C5681e.f214326a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f214390f = r0
                r5.f214389e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L56
            L55:
                return r1
            L56:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: wp3.r.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(wp3.e.c cVar, wp3.f.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = r.this.new h(eVar);
            hVar.f214390f = initialized;
            return hVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, xp3.a aVar2, po0.e eVar, ib4.c cVar, c54.b bVar, ac4.a aVar3) {
        this.screenMapper = aVar2;
        this.fetchRoundSummaryUC = eVar;
        this.genericDomainErrorMapper = cVar;
        this.isFeatureEnabledUseCase = bVar;
        this.callActionWithLoaderUC = aVar3;
        wp3.f.a aVar4 = wp3.f.a.f214329a;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: wp3.l
            @Override // er.l
            public final Object b(Object obj) {
                return r.x9(this.f214342a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), v9(aVar4));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(r rVar, z zVar) {
        g gVar = rVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(wp3.e.f.class), oVar, gVar);
        zVar.x(q0.c(wp3.e.c.class), oVar, rVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s9(c0<wp3.f.a> c0Var, tq.e<? super k10.l<? extends wp3.f>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUC, null, new a(c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object t9(dx.b bVar, final er.a<i0> aVar, final er.a<i0> aVar2, tq.e<? super i0> eVar) {
        if (bVar instanceof dx.b.g.c) {
            d9(wp3.e.d.f214321a);
            return i0.f148189a;
        }
        Object objF = Y1().F(new wp3.e.InterfaceC5680e.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: wp3.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.u9(aVar, aVar2, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
            aVar.a();
        } else {
            aVar2.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wp3.g.a v9(wp3.f state) {
        return this.screenMapper.b(new xp3.a.Params(state, b9(wp3.e.d.f214321a), b9(wp3.e.c.f214320a), b9(wp3.e.a.f214318a), b9(wp3.e.f.f214328a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final r rVar, v vVar) {
        vVar.c(q0.c(wp3.f.class), new er.l() { // from class: wp3.m
            @Override // er.l
            public final Object b(Object obj) {
                return r.y9(this.f214343a, (z) obj);
            }
        });
        vVar.c(q0.c(wp3.f.a.class), new er.l() { // from class: wp3.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.z9(this.f214344a, (z) obj);
            }
        });
        vVar.c(q0.c(wp3.f.Initialized.class), new er.l() { // from class: wp3.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.A9(this.f214345a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(r rVar, z zVar) {
        c cVar = rVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(wp3.e.a.class), oVar, cVar);
        zVar.x(q0.c(wp3.e.d.class), oVar, rVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(r rVar, z zVar) {
        zVar.C(rVar.new e(null));
        f fVar = rVar.new f(null);
        zVar.v(q0.c(wp3.e.b.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<wp3.e.InterfaceC5680e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<wp3.f, wp3.e> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<wp3.g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
