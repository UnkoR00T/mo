package ra4;

import f00.j0;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oa4.LessonDetails;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001IBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lra4/p;", "Ll00/g;", "Lra4/h;", "Lra4/g;", "Lra4/i;", "", "Lyy/a;", "stateMachineFactory", "Lta4/a;", "mapper", "Lla4/a;", "interactorFactory", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lsa4/a;", "contract", "<init>", "(Lyy/a;Lta4/a;Lla4/a;Lhb4/d;Lib4/c;Lac4/a;Lsa4/a;)V", "state", "Lra4/i$a;", "x9", "(Lra4/h;)Lra4/i$a;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "Lhb4/c;", "s9", "(Ldx/b;Ler/a;)Lhb4/c;", "b", "Lta4/a;", "c", "Lla4/a;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Lsa4/a;", "Lna4/a;", "h", "Loq/k;", "v9", "()Lna4/a;", "interactor", "j", "Lra4/h;", "initialState", "Lxw/b;", "Lra4/g$a;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<h, ra4.g> implements i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ta4.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final la4.a interactorFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final sa4.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k interactor = oq.l.a(new er.a() { // from class: ra4.n
        @Override // er.a
        public final Object a() {
            return p.w9(this.f172790a);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final h initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ra4.g.a> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<h, ra4.g> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<i.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lra4/p$a;", "Lf00/j0;", "Lsa4/a;", "Lra4/p;", "schooltimetable_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<sa4.a, p> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f172803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f172804b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f172805a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f172806b;

            /* JADX INFO: renamed from: ra4.p$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4408a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f172807d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f172808e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f172809f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f172811h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f172812j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f172813k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f172814l;

                public C4408a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f172807d = obj;
                    this.f172808e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f172805a = hVar;
                this.f172806b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4408a c4408a;
                if (eVar instanceof C4408a) {
                    c4408a = (C4408a) eVar;
                    int i15 = c4408a.f172808e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4408a.f172808e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4408a = new C4408a(eVar);
                    }
                } else {
                    c4408a = new C4408a(eVar);
                }
                Object obj2 = c4408a.f172807d;
                Object objE = uq.b.e();
                int i16 = c4408a.f172808e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f172805a;
                    i.a aVarX9 = this.f172806b.x9((h) obj);
                    c4408a.f172809f = vq.j.a(obj);
                    c4408a.f172811h = vq.j.a(c4408a);
                    c4408a.f172812j = vq.j.a(obj);
                    c4408a.f172813k = vq.j.a(hVar);
                    c4408a.f172814l = 0;
                    c4408a.f172808e = 1;
                    if (hVar.F(aVarX9, c4408a) == objE) {
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

        public b(mu.g gVar, p pVar) {
            this.f172803a = gVar;
            this.f172804b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i.a> hVar, tq.e eVar) {
            Object objA = this.f172803a.a(new a(hVar, this.f172804b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lra4/h$c;", "state", "Lk10/l;", "Lra4/h;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<h.c>, tq.e<? super k10.l<? extends h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f172815e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f172816f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f172817g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lra4/h;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends h>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f172819e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f172820f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f172821g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0<h.c> f172822h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, String str, c0<h.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f172820f = pVar;
                this.f172821g = str;
                this.f172822h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h.ErrorLoadingLessonDetails X(p pVar, dx.b bVar, h.c cVar) {
                return new h.ErrorLoadingLessonDetails(pVar.s9(bVar, pVar.b9(ra4.g.c.f172773a)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final h.DisplayingLessonDetails Y(LessonDetails lessonDetails, h.c cVar) {
                return new h.DisplayingLessonDetails(lessonDetails);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f172819e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    na4.a aVarV9 = this.f172820f.v9();
                    String str = this.f172821g;
                    String strF = this.f172820f.contract.f();
                    this.f172819e = 1;
                    obj = aVarV9.c(str, strF, this);
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
                c0<h.c> c0Var = this.f172822h;
                final p pVar = this.f172820f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ra4.s
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.c.a.X(pVar, bVar, (h.c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final LessonDetails lessonDetails = (LessonDetails) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ra4.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.c.a.Y(lessonDetails, (h.c) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f172820f, this.f172821g, this.f172822h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends h>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h.ErrorLoadingLessonDetails V(p pVar, h.c cVar) {
            return new h.ErrorLoadingLessonDetails(pVar.s9(new dx.b.Generic(null, 1, null), new er.a() { // from class: ra4.r
                @Override // er.a
                public final Object a() {
                    return p.c.X();
                }
            }));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X() {
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f172817g;
            Object objE = uq.b.e();
            int i15 = this.f172816f;
            if (i15 == 0) {
                oq.u.b(obj);
                String strJ2 = p.this.contract.J2();
                if (strJ2 == null) {
                    final p pVar = p.this;
                    return c0Var.d(new er.l() { // from class: ra4.q
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p.c.V(pVar, (h.c) obj2);
                        }
                    });
                }
                ac4.a aVar = p.this.callActionWithLoaderUseCase;
                a aVar2 = new a(p.this, strJ2, c0Var, null);
                this.f172817g = vq.j.a(c0Var);
                this.f172815e = vq.j.a(strJ2);
                this.f172816f = 1;
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
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<h.c> c0Var, tq.e<? super k10.l<? extends h>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f172817g = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lra4/g$b;", "<unused var>", "Lra4/h$c;", "Loq/i0;", "<anonymous>", "(Lra4/g$b;Lra4/h$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ra4.g.b, h.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172823e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f172823e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                ra4.g.a.C4406a c4406a = ra4.g.a.C4406a.f172771a;
                this.f172823e = 1;
                if (pVar.F(c4406a, this) == objE) {
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
        public final Object w(ra4.g.b bVar, h.c cVar, tq.e<? super i0> eVar) {
            return p.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lra4/g$b;", "<unused var>", "Lra4/h$a;", "Loq/i0;", "<anonymous>", "(Lra4/g$b;Lra4/h$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ra4.g.b, h.DisplayingLessonDetails, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172825e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f172825e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                ra4.g.a.C4406a c4406a = ra4.g.a.C4406a.f172771a;
                this.f172825e = 1;
                if (pVar.F(c4406a, this) == objE) {
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
        public final Object w(ra4.g.b bVar, h.DisplayingLessonDetails displayingLessonDetails, tq.e<? super i0> eVar) {
            return p.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lra4/g$b;", "<unused var>", "Lra4/h$b;", "Loq/i0;", "<anonymous>", "(Lra4/g$b;Lra4/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ra4.g.b, h.ErrorLoadingLessonDetails, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172827e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f172827e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                ra4.g.a.C4406a c4406a = ra4.g.a.C4406a.f172771a;
                this.f172827e = 1;
                if (pVar.F(c4406a, this) == objE) {
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
        public final Object w(ra4.g.b bVar, h.ErrorLoadingLessonDetails errorLoadingLessonDetails, tq.e<? super i0> eVar) {
            return p.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lra4/g$c;", "<unused var>", "Lk10/c0;", "Lra4/h$b;", "state", "Lk10/l;", "Lra4/h;", "<anonymous>", "(Lra4/g$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ra4.g.c, c0<h.ErrorLoadingLessonDetails>, tq.e<? super k10.l<? extends h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f172829e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f172830f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h.c O(h.ErrorLoadingLessonDetails errorLoadingLessonDetails) {
            return h.c.f172776a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f172830f;
            uq.b.e();
            if (this.f172829e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ra4.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.g.O((h.ErrorLoadingLessonDetails) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ra4.g.c cVar, c0<h.ErrorLoadingLessonDetails> c0Var, tq.e<? super k10.l<? extends h>> eVar) {
            g gVar = new g(eVar);
            gVar.f172830f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ta4.a aVar2, la4.a aVar3, hb4.d dVar, ib4.c cVar, ac4.a aVar4, sa4.a aVar5) {
        this.mapper = aVar2;
        this.interactorFactory = aVar3;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar4;
        this.contract = aVar5;
        h.c cVar2 = h.c.f172776a;
        this.initialState = cVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: ra4.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f172791a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), x9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(p pVar, z zVar) {
        zVar.A(pVar.new c(null));
        d dVar = pVar.new d(null);
        zVar.x(q0.c(ra4.g.b.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(p pVar, z zVar) {
        e eVar = pVar.new e(null);
        zVar.x(q0.c(ra4.g.b.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(p pVar, z zVar) {
        f fVar = pVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ra4.g.b.class), oVar, fVar);
        zVar.v(q0.c(ra4.g.c.class), oVar, new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c s9(dx.b domainError, final er.a<i0> onRetry) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: ra4.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.t9(this.f172788a, onRetry, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(p pVar, er.a aVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            pVar.d9(ra4.g.b.f172772a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            aVar.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final na4.a v9() {
        return (na4.a) this.interactor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final na4.a w9(p pVar) {
        return pVar.interactorFactory.a(pVar.contract.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.a x9(h state) {
        return this.mapper.b(new ta4.a.Params(state, b9(ra4.g.b.f172772a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(h.c.class), new er.l() { // from class: ra4.j
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f172785a, (z) obj);
            }
        });
        vVar.c(q0.c(h.DisplayingLessonDetails.class), new er.l() { // from class: ra4.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.B9(this.f172786a, (z) obj);
            }
        });
        vVar.c(q0.c(h.ErrorLoadingLessonDetails.class), new er.l() { // from class: ra4.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.C9(this.f172787a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ra4.g.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<h, ra4.g> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ra4.g.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
