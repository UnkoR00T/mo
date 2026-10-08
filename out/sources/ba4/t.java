package ba4;

import aa4.GradeDetailsData;
import f00.j0;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import w94.GradeDetails;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001IBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010 \u001a\u00020\u001f*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lba4/t;", "Ll00/g;", "Lba4/j;", "Lba4/i;", "Lba4/k;", "", "Lyy/a;", "stateMachineFactory", "Lda4/h;", "mapper", "Lt94/a;", "interactorFactory", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lca4/a;", "contract", "<init>", "(Lyy/a;Lda4/h;Lt94/a;Lhb4/d;Lib4/c;Lac4/a;Lca4/a;)V", "state", "Lba4/k$a;", "A9", "(Lba4/j;)Lba4/k$a;", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "I9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "b", "Lda4/h;", "c", "Lt94/a;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Lca4/a;", "Lv94/a;", "h", "Loq/k;", "y9", "()Lv94/a;", "interactor", "j", "Lba4/j;", "initialState", "Lxw/b;", "Lba4/i$a;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<ba4.j, ba4.i> implements k, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final da4.h mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t94.a interactorFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ca4.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k interactor = oq.l.a(new er.a() { // from class: ba4.r
        @Override // er.a
        public final Object a() {
            return t.z9(this.f17916a);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ba4.j initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ba4.i.a> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ba4.j, ba4.i> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<k.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lba4/t$a;", "Lf00/j0;", "Lca4/a;", "Lba4/t;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<ca4.a, t> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f17929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f17930b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f17931a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f17932b;

            /* JADX INFO: renamed from: ba4.t$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0440a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f17933d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f17934e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f17935f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f17937h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f17938j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f17939k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f17940l;

                public C0440a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f17933d = obj;
                    this.f17934e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f17931a = hVar;
                this.f17932b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0440a c0440a;
                if (eVar instanceof C0440a) {
                    c0440a = (C0440a) eVar;
                    int i15 = c0440a.f17934e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0440a.f17934e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0440a = new C0440a(eVar);
                    }
                } else {
                    c0440a = new C0440a(eVar);
                }
                Object obj2 = c0440a.f17933d;
                Object objE = uq.b.e();
                int i16 = c0440a.f17934e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f17931a;
                    k.a aVarA9 = this.f17932b.A9((ba4.j) obj);
                    c0440a.f17935f = vq.j.a(obj);
                    c0440a.f17937h = vq.j.a(c0440a);
                    c0440a.f17938j = vq.j.a(obj);
                    c0440a.f17939k = vq.j.a(hVar);
                    c0440a.f17940l = 0;
                    c0440a.f17934e = 1;
                    if (hVar.F(aVarA9, c0440a) == objE) {
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

        public b(mu.g gVar, t tVar) {
            this.f17929a = gVar;
            this.f17930b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super k.a> hVar, tq.e eVar) {
            Object objA = this.f17929a.a(new a(hVar, this.f17930b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lba4/j$e;", "state", "Lk10/l;", "Lba4/j;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<ba4.j.e>, tq.e<? super k10.l<? extends ba4.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f17941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f17942f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f17943g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lba4/j;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends ba4.j>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f17945e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t f17946f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ x94.v f17947g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<ba4.j.e> f17948h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, x94.v vVar, k10.c0<ba4.j.e> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f17946f = tVar;
                this.f17947g = vVar;
                this.f17948h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ba4.j.ErrorLoadingGradeDetails X(t tVar, dx.b bVar, ba4.j.e eVar) {
                return new ba4.j.ErrorLoadingGradeDetails(tVar.errorVMSFactory.a(tVar.I9(bVar, tVar.b9(ba4.i.g.f17892a), tVar.b9(ba4.i.b.f17887a))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final ba4.j.DisplayingGradeDetails Y(GradeDetails gradeDetails, ba4.j.e eVar) {
                return new ba4.j.DisplayingGradeDetails(GradeDetailsData.INSTANCE.a(gradeDetails));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f17945e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    v94.a aVarY9 = this.f17946f.y9();
                    String gradeId = ((x94.v.GradeById) this.f17947g).getGradeId();
                    String strF = this.f17946f.contract.f();
                    this.f17945e = 1;
                    obj = aVarY9.d(gradeId, strF, this);
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
                k10.c0<ba4.j.e> c0Var = this.f17948h;
                final t tVar = this.f17946f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ba4.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.c.a.X(tVar, bVar, (j.e) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final GradeDetails gradeDetails = (GradeDetails) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ba4.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.c.a.Y(gradeDetails, (j.e) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f17946f, this.f17947g, this.f17948h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends ba4.j>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ba4.j.DisplayingGradeDetails X(x94.v vVar, ba4.j.e eVar) {
            return new ba4.j.DisplayingGradeDetails(((x94.v.GradeWithDetails) vVar).getGradeDetails());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ba4.j.ErrorLoadingGradeDetails Y(final t tVar, ba4.j.e eVar) {
            return new ba4.j.ErrorLoadingGradeDetails(tVar.errorVMSFactory.a(tVar.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: ba4.w
                @Override // er.l
                public final Object b(Object obj) {
                    return t.c.Z(tVar, (ib4.c.b) obj);
                }
            }))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Z(t tVar, ib4.c.b bVar) {
            tVar.d9(ba4.i.b.f17887a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f17943g;
            Object objE = uq.b.e();
            int i15 = this.f17942f;
            if (i15 == 0) {
                oq.u.b(obj);
                final x94.v vVarP0 = t.this.contract.p0();
                if (!(vVarP0 instanceof x94.v.GradeById)) {
                    if (vVarP0 instanceof x94.v.GradeWithDetails) {
                        return c0Var.d(new er.l() { // from class: ba4.u
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return t.c.X(vVarP0, (j.e) obj2);
                            }
                        });
                    }
                    final t tVar = t.this;
                    return c0Var.d(new er.l() { // from class: ba4.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.c.Y(tVar, (j.e) obj2);
                        }
                    });
                }
                ac4.a aVar = t.this.callActionWithLoaderUseCase;
                a aVar2 = new a(t.this, vVarP0, c0Var, null);
                this.f17943g = vq.j.a(c0Var);
                this.f17941e = vq.j.a(vVarP0);
                this.f17942f = 1;
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
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ba4.j.e> c0Var, tq.e<? super k10.l<? extends ba4.j>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = t.this.new c(eVar);
            cVar.f17943g = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lba4/i$b;", "<unused var>", "Lba4/j$c;", "Loq/i0;", "<anonymous>", "(Lba4/i$b;Lba4/j$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ba4.i.b, ba4.j.DisplayingGradeDetails, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17949e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f17949e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                ba4.i.a.C0438a c0438a = ba4.i.a.C0438a.f17886a;
                this.f17949e = 1;
                if (tVar.F(c0438a, this) == objE) {
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
        public final Object w(ba4.i.b bVar, ba4.j.DisplayingGradeDetails displayingGradeDetails, tq.e<? super i0> eVar) {
            return t.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lba4/i$e;", "<unused var>", "Lk10/c0;", "Lba4/j$c;", "state", "Lk10/l;", "Lba4/j;", "<anonymous>", "(Lba4/i$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ba4.i.e, k10.c0<ba4.j.DisplayingGradeDetails>, tq.e<? super k10.l<? extends ba4.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17952f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ba4.j.DisplayingFullGradeText O(k10.c0 c0Var, ba4.j.DisplayingGradeDetails displayingGradeDetails) {
            return new ba4.j.DisplayingFullGradeText(((ba4.j.DisplayingGradeDetails) c0Var.a()).getGradeDetails());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f17952f;
            uq.b.e();
            if (this.f17951e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ba4.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(c0Var, (j.DisplayingGradeDetails) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ba4.i.e eVar, k10.c0<ba4.j.DisplayingGradeDetails> c0Var, tq.e<? super k10.l<? extends ba4.j>> eVar2) {
            e eVar3 = new e(eVar2);
            eVar3.f17952f = c0Var;
            return eVar3.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lba4/i$f;", "<unused var>", "Lk10/c0;", "Lba4/j$c;", "state", "Lk10/l;", "Lba4/j;", "<anonymous>", "(Lba4/i$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ba4.i.f, k10.c0<ba4.j.DisplayingGradeDetails>, tq.e<? super k10.l<? extends ba4.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17954f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ba4.j.DisplayingFullPreviousGradeText O(k10.c0 c0Var, ba4.j.DisplayingGradeDetails displayingGradeDetails) {
            return new ba4.j.DisplayingFullPreviousGradeText(((ba4.j.DisplayingGradeDetails) c0Var.a()).getGradeDetails());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f17954f;
            uq.b.e();
            if (this.f17953e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ba4.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.f.O(c0Var, (j.DisplayingGradeDetails) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ba4.i.f fVar, k10.c0<ba4.j.DisplayingGradeDetails> c0Var, tq.e<? super k10.l<? extends ba4.j>> eVar) {
            f fVar2 = new f(eVar);
            fVar2.f17954f = c0Var;
            return fVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lba4/i$c;", "<unused var>", "Lk10/c0;", "Lba4/j$a;", "state", "Lk10/l;", "Lba4/j;", "<anonymous>", "(Lba4/i$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ba4.i.c, k10.c0<ba4.j.DisplayingFullGradeText>, tq.e<? super k10.l<? extends ba4.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17956f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ba4.j.DisplayingGradeDetails O(k10.c0 c0Var, ba4.j.DisplayingFullGradeText displayingFullGradeText) {
            return new ba4.j.DisplayingGradeDetails(((ba4.j.DisplayingFullGradeText) c0Var.a()).getGradeDetails());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f17956f;
            uq.b.e();
            if (this.f17955e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ba4.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.O(c0Var, (j.DisplayingFullGradeText) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ba4.i.c cVar, k10.c0<ba4.j.DisplayingFullGradeText> c0Var, tq.e<? super k10.l<? extends ba4.j>> eVar) {
            g gVar = new g(eVar);
            gVar.f17956f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lba4/i$d;", "<unused var>", "Lk10/c0;", "Lba4/j$b;", "state", "Lk10/l;", "Lba4/j;", "<anonymous>", "(Lba4/i$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ba4.i.d, k10.c0<ba4.j.DisplayingFullPreviousGradeText>, tq.e<? super k10.l<? extends ba4.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17957e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17958f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ba4.j.DisplayingGradeDetails O(k10.c0 c0Var, ba4.j.DisplayingFullPreviousGradeText displayingFullPreviousGradeText) {
            return new ba4.j.DisplayingGradeDetails(((ba4.j.DisplayingFullPreviousGradeText) c0Var.a()).getGradeDetails());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f17958f;
            uq.b.e();
            if (this.f17957e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ba4.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.h.O(c0Var, (j.DisplayingFullPreviousGradeText) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ba4.i.d dVar, k10.c0<ba4.j.DisplayingFullPreviousGradeText> c0Var, tq.e<? super k10.l<? extends ba4.j>> eVar) {
            h hVar = new h(eVar);
            hVar.f17958f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lba4/i$g;", "<unused var>", "Lk10/c0;", "Lba4/j$d;", "state", "Lk10/l;", "Lba4/j;", "<anonymous>", "(Lba4/i$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ba4.i.g, k10.c0<ba4.j.ErrorLoadingGradeDetails>, tq.e<? super k10.l<? extends ba4.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17960f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ba4.j.e O(ba4.j.ErrorLoadingGradeDetails errorLoadingGradeDetails) {
            return ba4.j.e.f17897a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f17960f;
            uq.b.e();
            if (this.f17959e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ba4.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.i.O((j.ErrorLoadingGradeDetails) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ba4.i.g gVar, k10.c0<ba4.j.ErrorLoadingGradeDetails> c0Var, tq.e<? super k10.l<? extends ba4.j>> eVar) {
            i iVar = new i(eVar);
            iVar.f17960f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lba4/i$b;", "<unused var>", "Lba4/j$d;", "Loq/i0;", "<anonymous>", "(Lba4/i$b;Lba4/j$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ba4.i.b, ba4.j.ErrorLoadingGradeDetails, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17961e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f17961e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                ba4.i.a.C0438a c0438a = ba4.i.a.C0438a.f17886a;
                this.f17961e = 1;
                if (tVar.F(c0438a, this) == objE) {
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
        public final Object w(ba4.i.b bVar, ba4.j.ErrorLoadingGradeDetails errorLoadingGradeDetails, tq.e<? super i0> eVar) {
            return t.this.new j(eVar).J(i0.f148189a);
        }
    }

    public t(yy.a aVar, da4.h hVar, t94.a aVar2, hb4.d dVar, ib4.c cVar, ac4.a aVar3, ca4.a aVar4) {
        this.mapper = hVar;
        this.interactorFactory = aVar2;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.contract = aVar4;
        ba4.j.e eVar = ba4.j.e.f17897a;
        this.initialState = eVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(eVar, new er.l() { // from class: ba4.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.C9(this.f17917a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), A9(eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k.a A9(ba4.j state) {
        return this.mapper.b(new da4.h.Params(state, b9(ba4.i.b.f17887a), b9(ba4.i.e.f17890a), b9(ba4.i.c.f17888a), b9(ba4.i.f.f17891a), b9(ba4.i.d.f17889a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(ba4.j.e.class), new er.l() { // from class: ba4.l
            @Override // er.l
            public final Object b(Object obj) {
                return t.D9(this.f17911a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ba4.j.DisplayingGradeDetails.class), new er.l() { // from class: ba4.m
            @Override // er.l
            public final Object b(Object obj) {
                return t.E9(this.f17912a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ba4.j.DisplayingFullGradeText.class), new er.l() { // from class: ba4.n
            @Override // er.l
            public final Object b(Object obj) {
                return t.F9((k10.z) obj);
            }
        });
        vVar.c(q0.c(ba4.j.DisplayingFullPreviousGradeText.class), new er.l() { // from class: ba4.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.G9((k10.z) obj);
            }
        });
        vVar.c(q0.c(ba4.j.ErrorLoadingGradeDetails.class), new er.l() { // from class: ba4.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.H9(this.f17913a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(t tVar, k10.z zVar) {
        zVar.A(tVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(t tVar, k10.z zVar) {
        d dVar = tVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ba4.i.b.class), oVar, dVar);
        zVar.v(q0.c(ba4.i.e.class), oVar, new e(null));
        zVar.v(q0.c(ba4.i.f.class), oVar, new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(k10.z zVar) {
        g gVar = new g(null);
        zVar.v(q0.c(ba4.i.c.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(k10.z zVar) {
        h hVar = new h(null);
        zVar.v(q0.c(ba4.i.d.class), k10.o.CANCEL_PREVIOUS, hVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(t tVar, k10.z zVar) {
        i iVar = new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ba4.i.g.class), oVar, iVar);
        zVar.x(q0.c(ba4.i.b.class), oVar, tVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b I9(dx.b bVar, final er.a<i0> aVar, final er.a<i0> aVar2) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ba4.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.J9(aVar2, aVar, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            aVar.a();
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v94.a y9() {
        return (v94.a) this.interactor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v94.a z9(t tVar) {
        return tVar.interactorFactory.a(tVar.contract.b());
    }

    @Override // zx.b
    /* JADX INFO: renamed from: B9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<ba4.i.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ba4.j, ba4.i> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<k.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ba4.i.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }
}
