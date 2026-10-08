package ea4;

import aa4.GradeDetailsData;
import f00.j0;
import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import w94.SemesterGrade;
import w94.SubjectGrades;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001IBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010 \u001a\u00020\u001f*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00106\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lea4/s;", "Ll00/g;", "Lea4/i;", "Lea4/h;", "Lea4/j;", "", "Lyy/a;", "stateMachineFactory", "Lga4/c;", "mapper", "Lt94/a;", "interactorFactory", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lfa4/a;", "contract", "<init>", "(Lyy/a;Lga4/c;Lt94/a;Lhb4/d;Lib4/c;Lac4/a;Lfa4/a;)V", "state", "Lea4/j$a;", "A9", "(Lea4/i;)Lea4/j$a;", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "I9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "b", "Lga4/c;", "c", "Lt94/a;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Lfa4/a;", "Lv94/a;", "h", "Loq/k;", "y9", "()Lv94/a;", "interactor", "j", "Lea4/i;", "initialState", "Lxw/b;", "Lea4/h$a;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<i, ea4.h> implements j, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ga4.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t94.a interactorFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final fa4.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k interactor = oq.l.a(new er.a() { // from class: ea4.q
        @Override // er.a
        public final Object a() {
            return s.z9(this.f49030a);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final i initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ea4.h.a> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<i, ea4.h> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<j.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lea4/s$a;", "Lf00/j0;", "Lfa4/a;", "Lea4/s;", "schoolgrades_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<fa4.a, s> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f49043a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f49044b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f49045a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f49046b;

            /* JADX INFO: renamed from: ea4.s$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1152a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f49047d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f49048e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f49049f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f49051h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f49052j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f49053k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f49054l;

                public C1152a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f49047d = obj;
                    this.f49048e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, s sVar) {
                this.f49045a = hVar;
                this.f49046b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1152a c1152a;
                if (eVar instanceof C1152a) {
                    c1152a = (C1152a) eVar;
                    int i15 = c1152a.f49048e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1152a.f49048e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1152a = new C1152a(eVar);
                    }
                } else {
                    c1152a = new C1152a(eVar);
                }
                Object obj2 = c1152a.f49047d;
                Object objE = uq.b.e();
                int i16 = c1152a.f49048e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f49045a;
                    j.a aVarA9 = this.f49046b.A9((i) obj);
                    c1152a.f49049f = vq.j.a(obj);
                    c1152a.f49051h = vq.j.a(c1152a);
                    c1152a.f49052j = vq.j.a(obj);
                    c1152a.f49053k = vq.j.a(hVar);
                    c1152a.f49054l = 0;
                    c1152a.f49048e = 1;
                    if (hVar.F(aVarA9, c1152a) == objE) {
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

        public b(mu.g gVar, s sVar) {
            this.f49043a = gVar;
            this.f49044b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super j.a> hVar, tq.e eVar) {
            Object objA = this.f49043a.a(new a(hVar, this.f49044b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lea4/i$c;", "state", "Lk10/l;", "Lea4/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<i.c>, tq.e<? super k10.l<? extends i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f49055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f49056f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f49057g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f49058h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lea4/i;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends i>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f49060e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s f49061f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f49062g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f49063h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c0<i.c> f49064j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s sVar, String str, String str2, c0<i.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f49061f = sVar;
                this.f49062g = str;
                this.f49063h = str2;
                this.f49064j = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i.ErrorLoadingSubjectGrades X(s sVar, dx.b bVar, i.c cVar) {
                return new i.ErrorLoadingSubjectGrades(sVar.errorVMSFactory.a(sVar.I9(bVar, sVar.b9(ea4.h.e.f49008a), sVar.b9(ea4.h.b.f49005a))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i.DisplayingSubjectGrades Y(s sVar, SubjectGrades subjectGrades, i.c cVar) {
                return new i.DisplayingSubjectGrades(sVar.contract.h8(), subjectGrades);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f49060e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    v94.a aVarY9 = this.f49061f.y9();
                    String str = this.f49062g;
                    String str2 = this.f49063h;
                    String strF = this.f49061f.contract.f();
                    this.f49060e = 1;
                    obj = aVarY9.e(str, str2, strF, this);
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
                c0<i.c> c0Var = this.f49064j;
                final s sVar = this.f49061f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: ea4.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s.c.a.X(sVar, bVar, (i.c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final SubjectGrades subjectGrades = (SubjectGrades) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: ea4.w
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.c.a.Y(sVar, subjectGrades, (i.c) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f49061f, this.f49062g, this.f49063h, this.f49064j, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends i>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i.ErrorLoadingSubjectGrades V(final s sVar, i.c cVar) {
            return new i.ErrorLoadingSubjectGrades(sVar.errorVMSFactory.a(sVar.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: ea4.u
                @Override // er.l
                public final Object b(Object obj) {
                    return s.c.X(sVar, (ib4.c.b) obj);
                }
            }))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(s sVar, ib4.c.b bVar) {
            sVar.d9(ea4.h.b.f49005a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f49058h;
            Object objE = uq.b.e();
            int i15 = this.f49057g;
            if (i15 == 0) {
                oq.u.b(obj);
                String strZ = s.this.contract.z();
                String strG6 = s.this.contract.G6();
                if (strZ == null || strG6 == null) {
                    final s sVar = s.this;
                    return c0Var.d(new er.l() { // from class: ea4.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return s.c.V(sVar, (i.c) obj2);
                        }
                    });
                }
                ac4.a aVar = s.this.callActionWithLoaderUseCase;
                a aVar2 = new a(s.this, strZ, strG6, c0Var, null);
                this.f49058h = vq.j.a(c0Var);
                this.f49055e = vq.j.a(strZ);
                this.f49056f = vq.j.a(strG6);
                this.f49057g = 1;
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
        public final Object B(c0<i.c> c0Var, tq.e<? super k10.l<? extends i>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = s.this.new c(eVar);
            cVar.f49058h = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lea4/h$b;", "<unused var>", "Lea4/i$a;", "Loq/i0;", "<anonymous>", "(Lea4/h$b;Lea4/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ea4.h.b, i.DisplayingSubjectGrades, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49065e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49065e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                ea4.h.a.C1150a c1150a = ea4.h.a.C1150a.f49003a;
                this.f49065e = 1;
                if (sVar.F(c1150a, this) == objE) {
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
        public final Object w(ea4.h.b bVar, i.DisplayingSubjectGrades displayingSubjectGrades, tq.e<? super i0> eVar) {
            return s.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lea4/h$c;", "action", "Lea4/i$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lea4/h$c;Lea4/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ea4.h.OnGradeClicked, i.DisplayingSubjectGrades, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49068f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ea4.h.OnGradeClicked onGradeClicked = (ea4.h.OnGradeClicked) this.f49068f;
            Object objE = uq.b.e();
            int i15 = this.f49067e;
            if (i15 == 0) {
                oq.u.b(obj);
                s.this.contract.p5(new x94.v.GradeById(onGradeClicked.getGradeId()));
                s sVar = s.this;
                ea4.h.a.b bVar = ea4.h.a.b.f49004a;
                this.f49068f = vq.j.a(onGradeClicked);
                this.f49067e = 1;
                if (sVar.F(bVar, this) == objE) {
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
        public final Object w(ea4.h.OnGradeClicked onGradeClicked, i.DisplayingSubjectGrades displayingSubjectGrades, tq.e<? super i0> eVar) {
            e eVar2 = s.this.new e(eVar);
            eVar2.f49068f = onGradeClicked;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lea4/h$d;", "action", "Lea4/i$a;", "state", "Loq/i0;", "<anonymous>", "(Lea4/h$d;Lea4/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ea4.h.OnSemesterGradeClicked, i.DisplayingSubjectGrades, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49070e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49071f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f49072g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ea4.h.OnSemesterGradeClicked onSemesterGradeClicked = (ea4.h.OnSemesterGradeClicked) this.f49071f;
            i.DisplayingSubjectGrades displayingSubjectGrades = (i.DisplayingSubjectGrades) this.f49072g;
            Object objE = uq.b.e();
            int i15 = this.f49070e;
            if (i15 == 0) {
                oq.u.b(obj);
                s.this.contract.p5(new x94.v.GradeWithDetails(GradeDetailsData.INSTANCE.b(onSemesterGradeClicked.getGrade(), displayingSubjectGrades.getSubjectTitle())));
                s sVar = s.this;
                ea4.h.a.b bVar = ea4.h.a.b.f49004a;
                this.f49071f = vq.j.a(onSemesterGradeClicked);
                this.f49072g = vq.j.a(displayingSubjectGrades);
                this.f49070e = 1;
                if (sVar.F(bVar, this) == objE) {
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
        public final Object w(ea4.h.OnSemesterGradeClicked onSemesterGradeClicked, i.DisplayingSubjectGrades displayingSubjectGrades, tq.e<? super i0> eVar) {
            f fVar = s.this.new f(eVar);
            fVar.f49071f = onSemesterGradeClicked;
            fVar.f49072g = displayingSubjectGrades;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lea4/h$e;", "<unused var>", "Lk10/c0;", "Lea4/i$b;", "state", "Lk10/l;", "Lea4/i;", "<anonymous>", "(Lea4/h$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ea4.h.e, c0<i.ErrorLoadingSubjectGrades>, tq.e<? super k10.l<? extends i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49074e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49075f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i.c O(i.ErrorLoadingSubjectGrades errorLoadingSubjectGrades) {
            return i.c.f49012a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f49075f;
            uq.b.e();
            if (this.f49074e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ea4.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.g.O((i.ErrorLoadingSubjectGrades) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ea4.h.e eVar, c0<i.ErrorLoadingSubjectGrades> c0Var, tq.e<? super k10.l<? extends i>> eVar2) {
            g gVar = new g(eVar2);
            gVar.f49075f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lea4/h$b;", "<unused var>", "Lea4/i$b;", "Loq/i0;", "<anonymous>", "(Lea4/h$b;Lea4/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ea4.h.b, i.ErrorLoadingSubjectGrades, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49076e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49076e;
            if (i15 == 0) {
                oq.u.b(obj);
                s sVar = s.this;
                ea4.h.a.C1150a c1150a = ea4.h.a.C1150a.f49003a;
                this.f49076e = 1;
                if (sVar.F(c1150a, this) == objE) {
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
        public final Object w(ea4.h.b bVar, i.ErrorLoadingSubjectGrades errorLoadingSubjectGrades, tq.e<? super i0> eVar) {
            return s.this.new h(eVar).J(i0.f148189a);
        }
    }

    public s(yy.a aVar, ga4.c cVar, t94.a aVar2, hb4.d dVar, ib4.c cVar2, ac4.a aVar3, fa4.a aVar4) {
        this.mapper = cVar;
        this.interactorFactory = aVar2;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar2;
        this.callActionWithLoaderUseCase = aVar3;
        this.contract = aVar4;
        i.c cVar3 = i.c.f49012a;
        this.initialState = cVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar3, new er.l() { // from class: ea4.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.E9(this.f49031a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), A9(cVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j.a A9(i state) {
        return this.mapper.b(new ga4.c.Params(state, b9(ea4.h.b.f49005a), new er.l() { // from class: ea4.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.B9(this.f49026a, (String) obj);
            }
        }, new er.l() { // from class: ea4.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.C9(this.f49027a, (SemesterGrade) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(s sVar, String str) {
        sVar.d9(new ea4.h.OnGradeClicked(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(s sVar, SemesterGrade semesterGrade) {
        sVar.d9(new ea4.h.OnSemesterGradeClicked(semesterGrade));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(i.c.class), new er.l() { // from class: ea4.k
            @Override // er.l
            public final Object b(Object obj) {
                return s.F9(this.f49023a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(i.DisplayingSubjectGrades.class), new er.l() { // from class: ea4.l
            @Override // er.l
            public final Object b(Object obj) {
                return s.G9(this.f49024a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(i.ErrorLoadingSubjectGrades.class), new er.l() { // from class: ea4.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.H9(this.f49025a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(s sVar, k10.z zVar) {
        zVar.A(sVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(s sVar, k10.z zVar) {
        d dVar = sVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ea4.h.b.class), oVar, dVar);
        zVar.x(q0.c(ea4.h.OnGradeClicked.class), oVar, sVar.new e(null));
        zVar.x(q0.c(ea4.h.OnSemesterGradeClicked.class), oVar, sVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(s sVar, k10.z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ea4.h.e.class), oVar, gVar);
        zVar.x(q0.c(ea4.h.b.class), oVar, sVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b I9(dx.b bVar, final er.a<i0> aVar, final er.a<i0> aVar2) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: ea4.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.J9(aVar2, aVar, (ib4.c.b) obj);
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
    public static final v94.a z9(s sVar) {
        return sVar.interactorFactory.a(sVar.contract.b());
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<ea4.h.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<i, ea4.h> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<j.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ea4.h.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }
}
