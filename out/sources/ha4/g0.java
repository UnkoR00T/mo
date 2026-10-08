package ha4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import w94.SemesterDetails;
import w94.Subject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001IBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010 \u001a\u00020\u001f*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lha4/g0;", "Ll00/g;", "Lha4/c;", "Lha4/a;", "Lha4/e;", "", "Lyy/a;", "stateMachineFactory", "Lja4/d;", "mapper", "Lt94/a;", "interactorFactory", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lia4/a;", "contract", "<init>", "(Lyy/a;Lja4/d;Lt94/a;Lhb4/d;Lib4/c;Lac4/a;Lia4/a;)V", "state", "Lha4/e$a;", "B9", "(Lha4/c;)Lha4/e$a;", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "M9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "b", "Lja4/d;", "c", "Lt94/a;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Lia4/a;", "Lv94/a;", "h", "Loq/k;", "z9", "()Lv94/a;", "interactor", "j", "Lha4/c;", "initialState", "Lxw/b;", "Lha4/a$c;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 extends l00.g<ha4.c, ha4.a> implements ha4.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ja4.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t94.a interactorFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ia4.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k interactor = oq.l.a(new er.a() { // from class: ha4.f0
        @Override // er.a
        public final Object a() {
            return g0.A9(this.f82640a);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ha4.c initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ha4.a.c> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ha4.c, ha4.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<ha4.e.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lha4/g0$a;", "Lf00/j0;", "Lia4/a;", "Lha4/g0;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<ia4.a, g0> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<ha4.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f82654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f82655b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f82656a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g0 f82657b;

            /* JADX INFO: renamed from: ha4.g0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1903a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f82658d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f82659e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f82660f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f82662h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f82663j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f82664k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f82665l;

                public C1903a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f82658d = obj;
                    this.f82659e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, g0 g0Var) {
                this.f82656a = hVar;
                this.f82657b = g0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1903a c1903a;
                if (eVar instanceof C1903a) {
                    c1903a = (C1903a) eVar;
                    int i15 = c1903a.f82659e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1903a.f82659e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1903a = new C1903a(eVar);
                    }
                } else {
                    c1903a = new C1903a(eVar);
                }
                Object obj2 = c1903a.f82658d;
                Object objE = uq.b.e();
                int i16 = c1903a.f82659e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f82656a;
                    ha4.e.a aVarB9 = this.f82657b.B9((ha4.c) obj);
                    c1903a.f82660f = vq.j.a(obj);
                    c1903a.f82662h = vq.j.a(c1903a);
                    c1903a.f82663j = vq.j.a(obj);
                    c1903a.f82664k = vq.j.a(hVar);
                    c1903a.f82665l = 0;
                    c1903a.f82659e = 1;
                    if (hVar.F(aVarB9, c1903a) == objE) {
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

        public b(mu.g gVar, g0 g0Var) {
            this.f82654a = gVar;
            this.f82655b = g0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ha4.e.a> hVar, tq.e eVar) {
            Object objA = this.f82654a.a(new a(hVar, this.f82655b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lha4/c$f;", "state", "Lk10/l;", "Lha4/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<ha4.c.f>, tq.e<? super k10.l<? extends ha4.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82667f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lha4/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ha4.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f82669e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g0 f82670f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<ha4.c.f> f82671g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, k10.c0<ha4.c.f> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f82670f = g0Var;
                this.f82671g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ha4.c.ErrorLoadingInitialData X(g0 g0Var, dx.b bVar, ha4.c.f fVar) {
                return new ha4.c.ErrorLoadingInitialData(g0Var.errorVMSFactory.a(g0Var.M9(bVar, g0Var.b9(ha4.a.g.f82598a), g0Var.b9(ha4.a.d.f82593a))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ha4.c Y(w94.e eVar, g0 g0Var, ha4.c.f fVar) {
                if (eVar instanceof w94.e.Semesters) {
                    return new ha4.c.DisplayingSubjectList(SubjectListData.INSTANCE.a((w94.e.Semesters) eVar), false, 2, null);
                }
                if (eVar instanceof w94.e.EmptyState) {
                    return new ha4.c.EmptyStateSubjectList(((w94.e.EmptyState) eVar).getMessage());
                }
                if (!fr.t.c(eVar, w94.e.b.f211486a)) {
                    throw new oq.p();
                }
                hb4.d dVar = g0Var.errorVMSFactory;
                dx.b.Generic generic = new dx.b.Generic(null, 1, null);
                ha4.a.d dVar2 = ha4.a.d.f82593a;
                return new ha4.c.ErrorLoadingInitialData(dVar.a(g0Var.M9(generic, g0Var.b9(dVar2), g0Var.b9(dVar2))));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f82669e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    v94.a aVarZ9 = this.f82670f.z9();
                    String strF = this.f82670f.contract.f();
                    this.f82669e = 1;
                    obj = aVarZ9.a(strF, this);
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
                k10.c0<ha4.c.f> c0Var = this.f82671g;
                final g0 g0Var = this.f82670f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ha4.h0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return g0.c.a.X(g0Var, bVar, (c.f) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final w94.e eVar = (w94.e) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ha4.i0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.c.a.Y(eVar, g0Var, (c.f) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f82670f, this.f82671g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ha4.c>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f82667f;
            Object objE = uq.b.e();
            int i15 = this.f82666e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = g0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(g0.this, c0Var, null);
            this.f82667f = vq.j.a(c0Var);
            this.f82666e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ha4.c.f> c0Var, tq.e<? super k10.l<? extends ha4.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = g0.this.new c(eVar);
            cVar.f82667f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lha4/a$d;", "<unused var>", "Lha4/c$a;", "Loq/i0;", "<anonymous>", "(Lha4/a$d;Lha4/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ha4.a.d, ha4.c.DisplayingSubjectList, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82672e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f82672e;
            if (i15 == 0) {
                oq.u.b(obj);
                g0 g0Var = g0.this;
                ha4.a.c.C1899a c1899a = ha4.a.c.C1899a.f82591a;
                this.f82672e = 1;
                if (g0Var.F(c1899a, this) == objE) {
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
        public final Object w(ha4.a.d dVar, ha4.c.DisplayingSubjectList displayingSubjectList, tq.e<? super oq.i0> eVar) {
            return g0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lha4/a$a;", "<unused var>", "Lk10/c0;", "Lha4/c$a;", "state", "Lk10/l;", "Lha4/c;", "<anonymous>", "(Lha4/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ha4.a.C1898a, k10.c0<ha4.c.DisplayingSubjectList>, tq.e<? super k10.l<? extends ha4.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82675f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ha4.c.DisplayingSubjectList O(ha4.c.DisplayingSubjectList displayingSubjectList) {
            return ha4.c.DisplayingSubjectList.b(displayingSubjectList, null, true, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f82675f;
            uq.b.e();
            if (this.f82674e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ha4.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.e.O((c.DisplayingSubjectList) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ha4.a.C1898a c1898a, k10.c0<ha4.c.DisplayingSubjectList> c0Var, tq.e<? super k10.l<? extends ha4.c>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f82675f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lha4/a$b;", "<unused var>", "Lk10/c0;", "Lha4/c$a;", "state", "Lk10/l;", "Lha4/c;", "<anonymous>", "(Lha4/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ha4.a.b, k10.c0<ha4.c.DisplayingSubjectList>, tq.e<? super k10.l<? extends ha4.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82677f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ha4.c.DisplayingSubjectList O(ha4.c.DisplayingSubjectList displayingSubjectList) {
            return ha4.c.DisplayingSubjectList.b(displayingSubjectList, null, false, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f82677f;
            uq.b.e();
            if (this.f82676e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ha4.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.f.O((c.DisplayingSubjectList) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ha4.a.b bVar, k10.c0<ha4.c.DisplayingSubjectList> c0Var, tq.e<? super k10.l<? extends ha4.c>> eVar) {
            f fVar = new f(eVar);
            fVar.f82677f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lha4/a$e;", "action", "Lk10/c0;", "Lha4/c$a;", "state", "Lk10/l;", "Lha4/c;", "<anonymous>", "(Lha4/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ha4.a.OnSemesterSelected, k10.c0<ha4.c.DisplayingSubjectList>, tq.e<? super k10.l<? extends ha4.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82679f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f82680g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ha4.c.LoadingSemesterDetails O(k10.c0 c0Var, ha4.a.OnSemesterSelected onSemesterSelected, ha4.c.DisplayingSubjectList displayingSubjectList) {
            return new ha4.c.LoadingSemesterDetails(((ha4.c.DisplayingSubjectList) c0Var.a()).getData(), onSemesterSelected.getSemesterId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ha4.a.OnSemesterSelected onSemesterSelected = (ha4.a.OnSemesterSelected) this.f82679f;
            final k10.c0 c0Var = (k10.c0) this.f82680g;
            uq.b.e();
            if (this.f82678e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ha4.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.g.O(c0Var, onSemesterSelected, (c.DisplayingSubjectList) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ha4.a.OnSemesterSelected onSemesterSelected, k10.c0<ha4.c.DisplayingSubjectList> c0Var, tq.e<? super k10.l<? extends ha4.c>> eVar) {
            g gVar = new g(eVar);
            gVar.f82679f = onSemesterSelected;
            gVar.f82680g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lha4/a$f;", "action", "Lk10/c0;", "Lha4/c$a;", "state", "Lk10/l;", "Lha4/c;", "<anonymous>", "(Lha4/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ha4.a.OnSubjectClicked, k10.c0<ha4.c.DisplayingSubjectList>, tq.e<? super k10.l<? extends ha4.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82682f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f82683g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ha4.c.DisplayingSubjectList O(k10.c0 c0Var, ha4.a.OnSubjectClicked onSubjectClicked, ha4.c.DisplayingSubjectList displayingSubjectList) {
            SubjectListData data = ((ha4.c.DisplayingSubjectList) c0Var.a()).getData();
            Map<String, SemesterDetails> mapF = ((ha4.c.DisplayingSubjectList) c0Var.a()).getData().f();
            LinkedHashMap linkedHashMap = new LinkedHashMap(pq.v0.e(mapF.size()));
            Iterator<T> it = mapF.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                String str = (String) entry.getKey();
                SemesterDetails semesterDetailsB = (SemesterDetails) entry.getValue();
                if (fr.t.c(str, onSubjectClicked.getSemesterId())) {
                    List<Subject> listE = semesterDetailsB.e();
                    ArrayList arrayList = new ArrayList(pq.v.y(listE, 10));
                    for (Subject subject : listE) {
                        Subject subjectB = !fr.t.c(subject.getId(), onSubjectClicked.getSubjectId()) ? subject : null;
                        if (subjectB == null) {
                            subjectB = Subject.b(subject, null, null, null, false, 7, null);
                        }
                        arrayList.add(subjectB);
                    }
                    semesterDetailsB = SemesterDetails.b(semesterDetailsB, null, null, arrayList, null, 11, null);
                }
                linkedHashMap.put(key, semesterDetailsB);
            }
            return ha4.c.DisplayingSubjectList.b(displayingSubjectList, SubjectListData.b(data, null, null, linkedHashMap, 3, null), false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ha4.a.OnSubjectClicked onSubjectClicked = (ha4.a.OnSubjectClicked) this.f82682f;
            final k10.c0 c0Var = (k10.c0) this.f82683g;
            Object objE = uq.b.e();
            int i15 = this.f82681e;
            if (i15 == 0) {
                oq.u.b(obj);
                g0.this.contract.W4(onSubjectClicked.getSemesterId(), onSubjectClicked.getSubjectId(), onSubjectClicked.getSubjectTitle());
                g0 g0Var = g0.this;
                ha4.a.c.b bVar = ha4.a.c.b.f82592a;
                this.f82682f = onSubjectClicked;
                this.f82683g = c0Var;
                this.f82681e = 1;
                if (g0Var.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: ha4.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.h.O(c0Var, onSubjectClicked, (c.DisplayingSubjectList) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ha4.a.OnSubjectClicked onSubjectClicked, k10.c0<ha4.c.DisplayingSubjectList> c0Var, tq.e<? super k10.l<? extends ha4.c>> eVar) {
            h hVar = g0.this.new h(eVar);
            hVar.f82682f = onSubjectClicked;
            hVar.f82683g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lha4/a$d;", "<unused var>", "Lha4/c$b;", "Loq/i0;", "<anonymous>", "(Lha4/a$d;Lha4/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ha4.a.d, ha4.c.EmptyStateSubjectList, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82685e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f82685e;
            if (i15 == 0) {
                oq.u.b(obj);
                g0 g0Var = g0.this;
                ha4.a.c.C1899a c1899a = ha4.a.c.C1899a.f82591a;
                this.f82685e = 1;
                if (g0Var.F(c1899a, this) == objE) {
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
        public final Object w(ha4.a.d dVar, ha4.c.EmptyStateSubjectList emptyStateSubjectList, tq.e<? super oq.i0> eVar) {
            return g0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lha4/c$e;", "state", "Lk10/l;", "Lha4/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<ha4.c.LoadingSemesterDetails>, tq.e<? super k10.l<? extends ha4.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f82687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f82688f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f82689g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f82690h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lha4/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ha4.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f82692e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g0 f82693f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ha4.c.LoadingSemesterDetails f82694g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<ha4.c.LoadingSemesterDetails> f82695h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, ha4.c.LoadingSemesterDetails loadingSemesterDetails, k10.c0<ha4.c.LoadingSemesterDetails> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f82693f = g0Var;
                this.f82694g = loadingSemesterDetails;
                this.f82695h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ha4.c.ErrorLoadingSemesterDetails X(ha4.c.LoadingSemesterDetails loadingSemesterDetails, g0 g0Var, dx.b bVar, ha4.c.LoadingSemesterDetails loadingSemesterDetails2) {
                return new ha4.c.ErrorLoadingSemesterDetails(loadingSemesterDetails.getData(), loadingSemesterDetails.getSemesterId(), g0Var.errorVMSFactory.a(g0Var.M9(bVar, g0Var.b9(ha4.a.g.f82598a), g0Var.b9(ha4.a.b.f82590a))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ha4.c.DisplayingSubjectList Y(ha4.c.LoadingSemesterDetails loadingSemesterDetails, SemesterDetails semesterDetails, ha4.c.LoadingSemesterDetails loadingSemesterDetails2) {
                return new ha4.c.DisplayingSubjectList(SubjectListData.b(loadingSemesterDetails.getData(), loadingSemesterDetails.getSemesterId(), null, pq.v0.p(loadingSemesterDetails.getData().f(), oq.y.a(loadingSemesterDetails.getSemesterId(), semesterDetails)), 2, null), false, 2, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f82692e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    v94.a aVarZ9 = this.f82693f.z9();
                    String semesterId = this.f82694g.getSemesterId();
                    String strF = this.f82693f.contract.f();
                    this.f82692e = 1;
                    obj = aVarZ9.c(semesterId, strF, this);
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
                k10.c0<ha4.c.LoadingSemesterDetails> c0Var = this.f82695h;
                final ha4.c.LoadingSemesterDetails loadingSemesterDetails = this.f82694g;
                final g0 g0Var = this.f82693f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ha4.o0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return g0.j.a.X(loadingSemesterDetails, g0Var, bVar, (c.LoadingSemesterDetails) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final SemesterDetails semesterDetails = (SemesterDetails) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ha4.p0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.j.a.Y(loadingSemesterDetails, semesterDetails, (c.LoadingSemesterDetails) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f82693f, this.f82694g, this.f82695h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ha4.c>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ha4.c.DisplayingSubjectList O(ha4.c.LoadingSemesterDetails loadingSemesterDetails, ha4.c.LoadingSemesterDetails loadingSemesterDetails2) {
            return new ha4.c.DisplayingSubjectList(SubjectListData.b(loadingSemesterDetails.getData(), loadingSemesterDetails.getSemesterId(), null, null, 6, null), false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f82690h;
            Object objE = uq.b.e();
            int i15 = this.f82689g;
            if (i15 == 0) {
                oq.u.b(obj);
                final ha4.c.LoadingSemesterDetails loadingSemesterDetails = (ha4.c.LoadingSemesterDetails) c0Var.a();
                SemesterDetails semesterDetails = loadingSemesterDetails.getData().f().get(loadingSemesterDetails.getSemesterId());
                if (semesterDetails != null) {
                    return c0Var.d(new er.l() { // from class: ha4.n0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return g0.j.O(loadingSemesterDetails, (c.LoadingSemesterDetails) obj2);
                        }
                    });
                }
                ac4.a aVar = g0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(g0.this, loadingSemesterDetails, c0Var, null);
                this.f82690h = vq.j.a(c0Var);
                this.f82687e = vq.j.a(loadingSemesterDetails);
                this.f82688f = vq.j.a(semesterDetails);
                this.f82689g = 1;
                obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return (k10.l) obj;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ha4.c.LoadingSemesterDetails> c0Var, tq.e<? super k10.l<? extends ha4.c>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = g0.this.new j(eVar);
            jVar.f82690h = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lha4/a$g;", "<unused var>", "Lk10/c0;", "Lha4/c$c;", "state", "Lk10/l;", "Lha4/c;", "<anonymous>", "(Lha4/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ha4.a.g, k10.c0<ha4.c.ErrorLoadingInitialData>, tq.e<? super k10.l<? extends ha4.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82696e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82697f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ha4.c.f O(ha4.c.ErrorLoadingInitialData errorLoadingInitialData) {
            return ha4.c.f.f82613a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f82697f;
            uq.b.e();
            if (this.f82696e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ha4.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.k.O((c.ErrorLoadingInitialData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ha4.a.g gVar, k10.c0<ha4.c.ErrorLoadingInitialData> c0Var, tq.e<? super k10.l<? extends ha4.c>> eVar) {
            k kVar = new k(eVar);
            kVar.f82697f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lha4/a$d;", "<unused var>", "Lha4/c$c;", "Loq/i0;", "<anonymous>", "(Lha4/a$d;Lha4/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ha4.a.d, ha4.c.ErrorLoadingInitialData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82698e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f82698e;
            if (i15 == 0) {
                oq.u.b(obj);
                g0 g0Var = g0.this;
                ha4.a.c.C1899a c1899a = ha4.a.c.C1899a.f82591a;
                this.f82698e = 1;
                if (g0Var.F(c1899a, this) == objE) {
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
        public final Object w(ha4.a.d dVar, ha4.c.ErrorLoadingInitialData errorLoadingInitialData, tq.e<? super oq.i0> eVar) {
            return g0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lha4/a$g;", "<unused var>", "Lk10/c0;", "Lha4/c$d;", "state", "Lk10/l;", "Lha4/c;", "<anonymous>", "(Lha4/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ha4.a.g, k10.c0<ha4.c.ErrorLoadingSemesterDetails>, tq.e<? super k10.l<? extends ha4.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82701f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ha4.c.LoadingSemesterDetails O(k10.c0 c0Var, ha4.c.ErrorLoadingSemesterDetails errorLoadingSemesterDetails) {
            return new ha4.c.LoadingSemesterDetails(((ha4.c.ErrorLoadingSemesterDetails) c0Var.a()).getData(), ((ha4.c.ErrorLoadingSemesterDetails) c0Var.a()).getSemesterId());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f82701f;
            uq.b.e();
            if (this.f82700e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ha4.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.m.O(c0Var, (c.ErrorLoadingSemesterDetails) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ha4.a.g gVar, k10.c0<ha4.c.ErrorLoadingSemesterDetails> c0Var, tq.e<? super k10.l<? extends ha4.c>> eVar) {
            m mVar = new m(eVar);
            mVar.f82701f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lha4/a$b;", "<unused var>", "Lk10/c0;", "Lha4/c$d;", "state", "Lk10/l;", "Lha4/c;", "<anonymous>", "(Lha4/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ha4.a.b, k10.c0<ha4.c.ErrorLoadingSemesterDetails>, tq.e<? super k10.l<? extends ha4.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f82703f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ha4.c.DisplayingSubjectList O(k10.c0 c0Var, ha4.c.ErrorLoadingSemesterDetails errorLoadingSemesterDetails) {
            return new ha4.c.DisplayingSubjectList(((ha4.c.ErrorLoadingSemesterDetails) c0Var.a()).getData(), false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f82703f;
            uq.b.e();
            if (this.f82702e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ha4.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.n.O(c0Var, (c.ErrorLoadingSemesterDetails) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ha4.a.b bVar, k10.c0<ha4.c.ErrorLoadingSemesterDetails> c0Var, tq.e<? super k10.l<? extends ha4.c>> eVar) {
            n nVar = new n(eVar);
            nVar.f82703f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lha4/a$d;", "<unused var>", "Lha4/c$d;", "Loq/i0;", "<anonymous>", "(Lha4/a$d;Lha4/c$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ha4.a.d, ha4.c.ErrorLoadingSemesterDetails, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f82704e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f82704e;
            if (i15 == 0) {
                oq.u.b(obj);
                g0 g0Var = g0.this;
                ha4.a.c.C1899a c1899a = ha4.a.c.C1899a.f82591a;
                this.f82704e = 1;
                if (g0Var.F(c1899a, this) == objE) {
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
        public final Object w(ha4.a.d dVar, ha4.c.ErrorLoadingSemesterDetails errorLoadingSemesterDetails, tq.e<? super oq.i0> eVar) {
            return g0.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    public g0(yy.a aVar, ja4.d dVar, t94.a aVar2, hb4.d dVar2, ib4.c cVar, ac4.a aVar3, ia4.a aVar4) {
        this.mapper = dVar;
        this.interactorFactory = aVar2;
        this.errorVMSFactory = dVar2;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.contract = aVar4;
        ha4.c.f fVar = ha4.c.f.f82613a;
        this.initialState = fVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(fVar, new er.l() { // from class: ha4.w
            @Override // er.l
            public final Object b(Object obj) {
                return g0.F9(this.f82745a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), B9(fVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v94.a A9(g0 g0Var) {
        return g0Var.interactorFactory.a(g0Var.contract.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ha4.e.a B9(ha4.c state) {
        return this.mapper.b(new ja4.d.Params(state, b9(ha4.a.d.f82593a), b9(ha4.a.C1898a.f82589a), b9(ha4.a.b.f82590a), new er.l() { // from class: ha4.c0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.C9(this.f82614a, (String) obj);
            }
        }, new er.q() { // from class: ha4.d0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return g0.D9(this.f82620a, (String) obj, (String) obj2, (String) obj3);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(g0 g0Var, String str) {
        g0Var.d9(new ha4.a.OnSemesterSelected(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(g0 g0Var, String str, String str2, String str3) {
        g0Var.d9(new ha4.a.OnSubjectClicked(str, str2, str3));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(final g0 g0Var, k10.v vVar) {
        vVar.c(fr.q0.c(ha4.c.f.class), new er.l() { // from class: ha4.v
            @Override // er.l
            public final Object b(Object obj) {
                return g0.G9(this.f82743a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ha4.c.DisplayingSubjectList.class), new er.l() { // from class: ha4.x
            @Override // er.l
            public final Object b(Object obj) {
                return g0.H9(this.f82746a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ha4.c.EmptyStateSubjectList.class), new er.l() { // from class: ha4.y
            @Override // er.l
            public final Object b(Object obj) {
                return g0.I9(this.f82747a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ha4.c.LoadingSemesterDetails.class), new er.l() { // from class: ha4.z
            @Override // er.l
            public final Object b(Object obj) {
                return g0.J9(this.f82748a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ha4.c.ErrorLoadingInitialData.class), new er.l() { // from class: ha4.a0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.K9(this.f82599a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(ha4.c.ErrorLoadingSemesterDetails.class), new er.l() { // from class: ha4.b0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.L9(this.f82603a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(g0 g0Var, k10.z zVar) {
        zVar.A(g0Var.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(g0 g0Var, k10.z zVar) {
        d dVar = g0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(ha4.a.d.class), oVar, dVar);
        zVar.v(fr.q0.c(ha4.a.C1898a.class), oVar, new e(null));
        zVar.v(fr.q0.c(ha4.a.b.class), oVar, new f(null));
        zVar.v(fr.q0.c(ha4.a.OnSemesterSelected.class), oVar, new g(null));
        zVar.v(fr.q0.c(ha4.a.OnSubjectClicked.class), oVar, g0Var.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(g0 g0Var, k10.z zVar) {
        i iVar = g0Var.new i(null);
        zVar.x(fr.q0.c(ha4.a.d.class), k10.o.CANCEL_PREVIOUS, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(g0 g0Var, k10.z zVar) {
        zVar.A(g0Var.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(g0 g0Var, k10.z zVar) {
        k kVar = new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ha4.a.g.class), oVar, kVar);
        zVar.x(fr.q0.c(ha4.a.d.class), oVar, g0Var.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(g0 g0Var, k10.z zVar) {
        m mVar = new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(ha4.a.g.class), oVar, mVar);
        zVar.v(fr.q0.c(ha4.a.b.class), oVar, new n(null));
        zVar.x(fr.q0.c(ha4.a.d.class), oVar, g0Var.new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b M9(dx.b bVar, final er.a<oq.i0> aVar, final er.a<oq.i0> aVar2) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ha4.e0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.N9(aVar2, aVar, (ib4.c.b) obj);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final v94.a z9() {
        return (v94.a) this.interactor.getValue();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<ha4.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ha4.c, ha4.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<ha4.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ha4.a.c cVar, tq.e<? super oq.i0> eVar) {
        return super.F(cVar, eVar);
    }
}
