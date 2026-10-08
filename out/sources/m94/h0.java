package m94;

import j94.PartialBehaviourGrade;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001IBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010 \u001a\u00020\u001f*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lm94/h0;", "Ll00/g;", "Lm94/d;", "Lm94/a;", "Lm94/e;", "", "Lyy/a;", "stateMachineFactory", "Lo94/d;", "mapper", "Lg94/a;", "interactorFactory", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Ln94/a;", "contract", "<init>", "(Lyy/a;Lo94/d;Lg94/a;Lhb4/d;Lib4/c;Lac4/a;Ln94/a;)V", "state", "Lm94/e$a;", "C9", "(Lm94/d;)Lm94/e$a;", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "M9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "b", "Lo94/d;", "c", "Lg94/a;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Ln94/a;", "Li94/a;", "h", "Loq/k;", "A9", "()Li94/a;", "interactor", "j", "Lm94/d;", "initialState", "Lxw/b;", "Lm94/a$c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 extends l00.g<m94.d, m94.a> implements m94.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o94.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g94.a interactorFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final n94.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k interactor = oq.l.a(new er.a() { // from class: m94.f0
        @Override // er.a
        public final Object a() {
            return h0.B9(this.f124893a);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final m94.d initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<m94.a.c> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<m94.d, m94.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<m94.e.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lm94/h0$a;", "Lf00/j0;", "Ln94/a;", "Lm94/h0;", "schoolbehavior_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<n94.a, h0> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<m94.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f124909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f124910b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f124911a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f124912b;

            /* JADX INFO: renamed from: m94.h0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3075a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f124913d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f124914e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f124915f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f124917h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f124918j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f124919k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f124920l;

                public C3075a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f124913d = obj;
                    this.f124914e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, h0 h0Var) {
                this.f124911a = hVar;
                this.f124912b = h0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3075a c3075a;
                if (eVar instanceof C3075a) {
                    c3075a = (C3075a) eVar;
                    int i15 = c3075a.f124914e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3075a.f124914e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3075a = new C3075a(eVar);
                    }
                } else {
                    c3075a = new C3075a(eVar);
                }
                Object obj2 = c3075a.f124913d;
                Object objE = uq.b.e();
                int i16 = c3075a.f124914e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f124911a;
                    m94.e.a aVarC9 = this.f124912b.C9((m94.d) obj);
                    c3075a.f124915f = vq.j.a(obj);
                    c3075a.f124917h = vq.j.a(c3075a);
                    c3075a.f124918j = vq.j.a(obj);
                    c3075a.f124919k = vq.j.a(hVar);
                    c3075a.f124920l = 0;
                    c3075a.f124914e = 1;
                    if (hVar.F(aVarC9, c3075a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, h0 h0Var) {
            this.f124909a = gVar;
            this.f124910b = h0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super m94.e.a> hVar, tq.e eVar) {
            Object objA = this.f124909a.a(new a(hVar, this.f124910b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lm94/d$e;", "state", "Lk10/l;", "Lm94/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<m94.d.e>, tq.e<? super k10.l<? extends m94.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124922f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lm94/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends m94.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f124924e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ h0 f124925f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<m94.d.e> f124926g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, k10.c0<m94.d.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f124925f = h0Var;
                this.f124926g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m94.d.ErrorLoadingInitialData Y(h0 h0Var, dx.b bVar, m94.d.e eVar) {
                return new m94.d.ErrorLoadingInitialData(h0Var.errorVMSFactory.a(h0Var.M9(bVar, h0Var.b9(m94.a.i.f124850a), h0Var.b9(m94.a.d.f124845a))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final m94.d Z(j94.b bVar, final h0 h0Var, m94.d.e eVar) {
                if (bVar instanceof j94.b.Semesters) {
                    return new m94.d.DisplayingBehaviorList(BehaviorListData.INSTANCE.a((j94.b.Semesters) bVar), false, 2, null);
                }
                if (bVar instanceof j94.b.EmptyState) {
                    return new m94.d.BehaviorEmptyState(((j94.b.EmptyState) bVar).getMessage());
                }
                if (fr.t.c(bVar, j94.b.C2363b.f100529a)) {
                    return new m94.d.ErrorLoadingInitialData(h0Var.errorVMSFactory.a(h0Var.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: m94.k0
                        @Override // er.l
                        public final Object b(Object obj) {
                            return h0.c.a.a0(h0Var, (ib4.c.b) obj);
                        }
                    }))));
                }
                throw new oq.p();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final oq.i0 a0(h0 h0Var, ib4.c.b bVar) {
                h0Var.d9(m94.a.d.f124845a);
                return oq.i0.f148189a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f124924e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    i94.a aVarA9 = this.f124925f.A9();
                    String strF = this.f124925f.contract.f();
                    this.f124924e = 1;
                    obj = aVarA9.a(strF, this);
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
                k10.c0<m94.d.e> c0Var = this.f124926g;
                final h0 h0Var = this.f124925f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: m94.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.c.a.Y(h0Var, bVar, (d.e) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final j94.b bVar2 = (j94.b) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: m94.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.c.a.Z(bVar2, h0Var, (d.e) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f124925f, this.f124926g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends m94.d>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f124922f;
            Object objE = uq.b.e();
            int i15 = this.f124921e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = h0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(h0.this, c0Var, null);
            this.f124922f = vq.j.a(c0Var);
            this.f124921e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<m94.d.e> c0Var, tq.e<? super k10.l<? extends m94.d>> eVar) {
            return ((c) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = h0.this.new c(eVar);
            cVar.f124922f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm94/a$d;", "<unused var>", "Lm94/d$a;", "Loq/i0;", "<anonymous>", "(Lm94/a$d;Lm94/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<m94.a.d, m94.d.BehaviorEmptyState, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124927e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f124927e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                m94.a.c.C3071a c3071a = m94.a.c.C3071a.f124843a;
                this.f124927e = 1;
                if (h0Var.F(c3071a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(m94.a.d dVar, m94.d.BehaviorEmptyState behaviorEmptyState, tq.e<? super oq.i0> eVar) {
            return h0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm94/a$d;", "<unused var>", "Lm94/d$b;", "Loq/i0;", "<anonymous>", "(Lm94/a$d;Lm94/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<m94.a.d, m94.d.DisplayingBehaviorList, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124929e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f124929e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                m94.a.c.C3071a c3071a = m94.a.c.C3071a.f124843a;
                this.f124929e = 1;
                if (h0Var.F(c3071a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(m94.a.d dVar, m94.d.DisplayingBehaviorList displayingBehaviorList, tq.e<? super oq.i0> eVar) {
            return h0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm94/a$a;", "<unused var>", "Lk10/c0;", "Lm94/d$b;", "state", "Lk10/l;", "Lm94/d;", "<anonymous>", "(Lm94/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<m94.a.C3070a, k10.c0<m94.d.DisplayingBehaviorList>, tq.e<? super k10.l<? extends m94.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124931e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124932f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m94.d.DisplayingBehaviorList O(m94.d.DisplayingBehaviorList displayingBehaviorList) {
            return m94.d.DisplayingBehaviorList.b(displayingBehaviorList, null, true, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f124932f;
            uq.b.e();
            if (this.f124931e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m94.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.f.O((d.DisplayingBehaviorList) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m94.a.C3070a c3070a, k10.c0<m94.d.DisplayingBehaviorList> c0Var, tq.e<? super k10.l<? extends m94.d>> eVar) {
            f fVar = new f(eVar);
            fVar.f124932f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm94/a$b;", "<unused var>", "Lk10/c0;", "Lm94/d$b;", "state", "Lk10/l;", "Lm94/d;", "<anonymous>", "(Lm94/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<m94.a.b, k10.c0<m94.d.DisplayingBehaviorList>, tq.e<? super k10.l<? extends m94.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124934f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m94.d.DisplayingBehaviorList O(m94.d.DisplayingBehaviorList displayingBehaviorList) {
            return m94.d.DisplayingBehaviorList.b(displayingBehaviorList, null, false, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f124934f;
            uq.b.e();
            if (this.f124933e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m94.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.g.O((d.DisplayingBehaviorList) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m94.a.b bVar, k10.c0<m94.d.DisplayingBehaviorList> c0Var, tq.e<? super k10.l<? extends m94.d>> eVar) {
            g gVar = new g(eVar);
            gVar.f124934f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm94/a$g;", "action", "Lk10/c0;", "Lm94/d$b;", "state", "Lk10/l;", "Lm94/d;", "<anonymous>", "(Lm94/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<m94.a.OnSemesterSelected, k10.c0<m94.d.DisplayingBehaviorList>, tq.e<? super k10.l<? extends m94.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124936f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f124937g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m94.d.DisplayingBehaviorList O(k10.c0 c0Var, m94.a.OnSemesterSelected onSemesterSelected, m94.d.DisplayingBehaviorList displayingBehaviorList) {
            return displayingBehaviorList.a(BehaviorListData.b(((m94.d.DisplayingBehaviorList) c0Var.a()).getData(), onSemesterSelected.getSemesterId(), null, 2, null), false);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m94.a.OnSemesterSelected onSemesterSelected = (m94.a.OnSemesterSelected) this.f124936f;
            final k10.c0 c0Var = (k10.c0) this.f124937g;
            uq.b.e();
            if (this.f124935e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m94.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.h.O(c0Var, onSemesterSelected, (d.DisplayingBehaviorList) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m94.a.OnSemesterSelected onSemesterSelected, k10.c0<m94.d.DisplayingBehaviorList> c0Var, tq.e<? super k10.l<? extends m94.d>> eVar) {
            h hVar = new h(eVar);
            hVar.f124936f = onSemesterSelected;
            hVar.f124937g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lm94/a$e;", "action", "Lm94/d$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lm94/a$e;Lm94/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<m94.a.OnGradeSelected, m94.d.DisplayingBehaviorList, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124939f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            m94.a.OnGradeSelected onGradeSelected = (m94.a.OnGradeSelected) this.f124939f;
            Object objE = uq.b.e();
            int i15 = this.f124938e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0.this.contract.V4(onGradeSelected.getGrade());
                h0 h0Var = h0.this;
                m94.a.c.b bVar = m94.a.c.b.f124844a;
                this.f124939f = vq.j.a(onGradeSelected);
                this.f124938e = 1;
                if (h0Var.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(m94.a.OnGradeSelected onGradeSelected, m94.d.DisplayingBehaviorList displayingBehaviorList, tq.e<? super oq.i0> eVar) {
            i iVar = h0.this.new i(eVar);
            iVar.f124939f = onGradeSelected;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm94/a$h;", "<unused var>", "Lk10/c0;", "Lm94/d$b;", "state", "Lk10/l;", "Lm94/d;", "<anonymous>", "(Lm94/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<m94.a.h, k10.c0<m94.d.DisplayingBehaviorList>, tq.e<? super k10.l<? extends m94.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124942f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m94.d.DisplayingFullBehaviourGradeText O(k10.c0 c0Var, m94.d.DisplayingBehaviorList displayingBehaviorList) {
            return new m94.d.DisplayingFullBehaviourGradeText(((m94.d.DisplayingBehaviorList) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f124942f;
            uq.b.e();
            if (this.f124941e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m94.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.j.O(c0Var, (d.DisplayingBehaviorList) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m94.a.h hVar, k10.c0<m94.d.DisplayingBehaviorList> c0Var, tq.e<? super k10.l<? extends m94.d>> eVar) {
            j jVar = new j(eVar);
            jVar.f124942f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm94/a$f;", "<unused var>", "Lk10/c0;", "Lm94/d$c;", "state", "Lk10/l;", "Lm94/d;", "<anonymous>", "(Lm94/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<m94.a.f, k10.c0<m94.d.DisplayingFullBehaviourGradeText>, tq.e<? super k10.l<? extends m94.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124944f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m94.d.DisplayingBehaviorList O(k10.c0 c0Var, m94.d.DisplayingFullBehaviourGradeText displayingFullBehaviourGradeText) {
            return new m94.d.DisplayingBehaviorList(((m94.d.DisplayingFullBehaviourGradeText) c0Var.a()).getData(), false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f124944f;
            uq.b.e();
            if (this.f124943e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m94.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.k.O(c0Var, (d.DisplayingFullBehaviourGradeText) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m94.a.f fVar, k10.c0<m94.d.DisplayingFullBehaviourGradeText> c0Var, tq.e<? super k10.l<? extends m94.d>> eVar) {
            k kVar = new k(eVar);
            kVar.f124944f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lm94/a$i;", "<unused var>", "Lk10/c0;", "Lm94/d$d;", "state", "Lk10/l;", "Lm94/d;", "<anonymous>", "(Lm94/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<m94.a.i, k10.c0<m94.d.ErrorLoadingInitialData>, tq.e<? super k10.l<? extends m94.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f124946f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final m94.d.e O(m94.d.ErrorLoadingInitialData errorLoadingInitialData) {
            return m94.d.e.f124865a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f124946f;
            uq.b.e();
            if (this.f124945e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: m94.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.l.O((d.ErrorLoadingInitialData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(m94.a.i iVar, k10.c0<m94.d.ErrorLoadingInitialData> c0Var, tq.e<? super k10.l<? extends m94.d>> eVar) {
            l lVar = new l(eVar);
            lVar.f124946f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lm94/a$d;", "<unused var>", "Lm94/d$d;", "Loq/i0;", "<anonymous>", "(Lm94/a$d;Lm94/d$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<m94.a.d, m94.d.ErrorLoadingInitialData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f124947e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f124947e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                m94.a.c.C3071a c3071a = m94.a.c.C3071a.f124843a;
                this.f124947e = 1;
                if (h0Var.F(c3071a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(m94.a.d dVar, m94.d.ErrorLoadingInitialData errorLoadingInitialData, tq.e<? super oq.i0> eVar) {
            return h0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    public h0(yy.a aVar, o94.d dVar, g94.a aVar2, hb4.d dVar2, ib4.c cVar, ac4.a aVar3, n94.a aVar4) {
        this.mapper = dVar;
        this.interactorFactory = aVar2;
        this.errorVMSFactory = dVar2;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.contract = aVar4;
        m94.d.e eVar = m94.d.e.f124865a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: m94.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.G9(this.f124895a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), C9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i94.a A9() {
        return (i94.a) this.interactor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i94.a B9(h0 h0Var) {
        return h0Var.interactorFactory.a(h0Var.contract.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m94.e.a C9(m94.d state) {
        return this.mapper.b(new o94.d.Params(state, b9(m94.a.d.f124845a), b9(m94.a.C3070a.f124841a), b9(m94.a.b.f124842a), new er.l() { // from class: m94.x
            @Override // er.l
            public final Object b(Object obj) {
                return h0.D9(this.f124981a, (String) obj);
            }
        }, b9(m94.a.h.f124849a), b9(m94.a.f.f124847a), new er.l() { // from class: m94.y
            @Override // er.l
            public final Object b(Object obj) {
                return h0.E9(this.f124982a, (PartialBehaviourGrade) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(h0 h0Var, String str) {
        h0Var.d9(new m94.a.OnSemesterSelected(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(h0 h0Var, PartialBehaviourGrade partialBehaviourGrade) {
        h0Var.d9(new m94.a.OnGradeSelected(partialBehaviourGrade));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(final h0 h0Var, k10.v vVar) {
        vVar.c(fr.q0.c(m94.d.e.class), new er.l() { // from class: m94.z
            @Override // er.l
            public final Object b(Object obj) {
                return h0.H9(this.f124983a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m94.d.BehaviorEmptyState.class), new er.l() { // from class: m94.a0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.I9(this.f124851a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m94.d.DisplayingBehaviorList.class), new er.l() { // from class: m94.b0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.J9(this.f124856a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m94.d.DisplayingFullBehaviourGradeText.class), new er.l() { // from class: m94.c0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.K9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(m94.d.ErrorLoadingInitialData.class), new er.l() { // from class: m94.d0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.L9(this.f124866a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(h0 h0Var, k10.z zVar) {
        zVar.A(h0Var.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(h0 h0Var, k10.z zVar) {
        d dVar = h0Var.new d(null);
        zVar.x(fr.q0.c(m94.a.d.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(h0 h0Var, k10.z zVar) {
        e eVar = h0Var.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(m94.a.d.class), oVar, eVar);
        zVar.v(fr.q0.c(m94.a.C3070a.class), oVar, new f(null));
        zVar.v(fr.q0.c(m94.a.b.class), oVar, new g(null));
        zVar.v(fr.q0.c(m94.a.OnSemesterSelected.class), oVar, new h(null));
        zVar.x(fr.q0.c(m94.a.OnGradeSelected.class), oVar, h0Var.new i(null));
        zVar.v(fr.q0.c(m94.a.h.class), oVar, new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(k10.z zVar) {
        k kVar = new k(null);
        zVar.v(fr.q0.c(m94.a.f.class), k10.o.CANCEL_PREVIOUS, kVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(h0 h0Var, k10.z zVar) {
        l lVar = new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(m94.a.i.class), oVar, lVar);
        zVar.x(fr.q0.c(m94.a.d.class), oVar, h0Var.new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b M9(dx.b bVar, final er.a<oq.i0> aVar, final er.a<oq.i0> aVar2) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: m94.e0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.N9(aVar2, aVar, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            aVar.a();
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<m94.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<m94.d, m94.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<m94.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(m94.a.c cVar, tq.e<? super oq.i0> eVar) {
        return super.F(cVar, eVar);
    }
}
