package v84;

import fr.q0;
import java.util.Iterator;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import s84.SemesterAttendanceSummary;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001NBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010%\u001a\u00020$*\u00020\u001f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R \u0010B\u001a\b\u0012\u0004\u0012\u00020=0<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR&\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030C8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lv84/m;", "Ll00/g;", "Lv84/b;", "Lv84/a;", "Lv84/c;", "", "Lyy/a;", "stateMachineFactory", "Lx84/d;", "mapper", "Lp84/a;", "interactorFactory", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lw84/a;", "contract", "<init>", "(Lyy/a;Lx84/d;Lp84/a;Lhb4/d;Lib4/c;Lac4/a;Lw84/a;)V", "state", "Lv84/c$a;", "A9", "(Lv84/b;)Lv84/c$a;", "Ls84/f$a;", "attendanceSummary", "Ls84/k;", "D9", "(Ls84/f$a;)Ls84/k;", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "K9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "b", "Lx84/d;", "c", "Lp84/a;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Lw84/a;", "Lr84/a;", "h", "Loq/k;", "y9", "()Lr84/a;", "interactor", "j", "Lv84/b;", "initialState", "Lxw/b;", "Lv84/a$d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<v84.b, v84.a> implements v84.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final x84.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p84.a interactorFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final w84.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k interactor = oq.l.a(new er.a() { // from class: v84.k
        @Override // er.a
        public final Object a() {
            return m.z9(this.f204806a);
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final v84.b initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v84.a.d> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<v84.b, v84.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<v84.c.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lv84/m$a;", "Lf00/j0;", "Lw84/a;", "Lv84/m;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0<w84.a, m> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<v84.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f204822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f204823b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f204824a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f204825b;

            /* JADX INFO: renamed from: v84.m$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5350a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f204826d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f204827e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f204828f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f204830h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f204831j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f204832k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f204833l;

                public C5350a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f204826d = obj;
                    this.f204827e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f204824a = hVar;
                this.f204825b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5350a c5350a;
                if (eVar instanceof C5350a) {
                    c5350a = (C5350a) eVar;
                    int i15 = c5350a.f204827e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5350a.f204827e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5350a = new C5350a(eVar);
                    }
                } else {
                    c5350a = new C5350a(eVar);
                }
                Object obj2 = c5350a.f204826d;
                Object objE = uq.b.e();
                int i16 = c5350a.f204827e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f204824a;
                    v84.c.a aVarA9 = this.f204825b.A9((v84.b) obj);
                    c5350a.f204828f = vq.j.a(obj);
                    c5350a.f204830h = vq.j.a(c5350a);
                    c5350a.f204831j = vq.j.a(obj);
                    c5350a.f204832k = vq.j.a(hVar);
                    c5350a.f204833l = 0;
                    c5350a.f204827e = 1;
                    if (hVar.F(aVarA9, c5350a) == objE) {
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

        public b(mu.g gVar, m mVar) {
            this.f204822a = gVar;
            this.f204823b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super v84.c.a> hVar, tq.e eVar) {
            Object objA = this.f204822a.a(new a(hVar, this.f204823b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lv84/b$d;", "state", "Lk10/l;", "Lv84/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<v84.b.d>, tq.e<? super k10.l<? extends v84.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204835f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lv84/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends v84.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f204837e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ m f204838f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<v84.b.d> f204839g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, k10.c0<v84.b.d> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f204838f = mVar;
                this.f204839g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final v84.b.ErrorLoadingInitialData a0(m mVar, dx.b bVar, v84.b.d dVar) {
                return new v84.b.ErrorLoadingInitialData(mVar.errorVMSFactory.a(mVar.K9(bVar, mVar.b9(v84.a.h.f204766a), mVar.b9(v84.a.e.f204763a))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final v84.b.Displaying b0(s84.f fVar, SemesterAttendanceSummary semesterAttendanceSummary, v84.b.d dVar) {
                return new v84.b.Displaying((s84.f.AttendanceSemesters) fVar, semesterAttendanceSummary, false, 4, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final v84.b.ErrorLoadingInitialData c0(m mVar, v84.b.d dVar) {
                return new v84.b.ErrorLoadingInitialData(mVar.errorVMSFactory.a(mVar.K9(new dx.b.Generic(null, 1, null), mVar.b9(v84.a.h.f204766a), mVar.b9(v84.a.e.f204763a))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final v84.b.AttendanceEmptyState d0(s84.f fVar, v84.b.d dVar) {
                return new v84.b.AttendanceEmptyState(((s84.f.EmptyState) fVar).getMessage());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final v84.b.ErrorLoadingInitialData e0(m mVar, v84.b.d dVar) {
                return new v84.b.ErrorLoadingInitialData(mVar.errorVMSFactory.a(mVar.K9(new dx.b.Generic(null, 1, null), mVar.b9(v84.a.h.f204766a), mVar.b9(v84.a.e.f204763a))));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f204837e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    r84.a aVarY9 = this.f204838f.y9();
                    String strF = this.f204838f.contract.f();
                    this.f204837e = 1;
                    obj = aVarY9.a(strF, this);
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
                k10.c0<v84.b.d> c0Var = this.f204839g;
                final m mVar = this.f204838f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: v84.n
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return m.c.a.a0(mVar, bVar, (b.d) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final s84.f fVar = (s84.f) ((dx.i.Right) iVar).b();
                if (!(fVar instanceof s84.f.AttendanceSemesters)) {
                    if (fVar instanceof s84.f.EmptyState) {
                        return c0Var.d(new er.l() { // from class: v84.q
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return m.c.a.d0(fVar, (b.d) obj2);
                            }
                        });
                    }
                    if (fr.t.c(fVar, s84.f.c.f179316a)) {
                        return c0Var.d(new er.l() { // from class: v84.r
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return m.c.a.e0(mVar, (b.d) obj2);
                            }
                        });
                    }
                    throw new oq.p();
                }
                s84.f.AttendanceSemesters attendanceSemesters = (s84.f.AttendanceSemesters) fVar;
                final SemesterAttendanceSummary semesterAttendanceSummaryD9 = mVar.D9(attendanceSemesters);
                if (semesterAttendanceSummaryD9 != null) {
                    mVar.contract.Q7(attendanceSemesters);
                    mVar.contract.P7(semesterAttendanceSummaryD9.getSemesterId());
                    Object objD = c0Var.d(new er.l() { // from class: v84.o
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return m.c.a.b0(fVar, semesterAttendanceSummaryD9, (b.d) obj2);
                        }
                    });
                    if (objD != null) {
                        return objD;
                    }
                }
                return c0Var.d(new er.l() { // from class: v84.p
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.c.a.c0(mVar, (b.d) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> Y(tq.e<?> eVar) {
                return new a(this.f204838f, this.f204839g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends v84.b>> eVar) {
                return ((a) Y(eVar)).J(oq.i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f204835f;
            Object objE = uq.b.e();
            int i15 = this.f204834e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = m.this.callActionWithLoaderUseCase;
            a aVar2 = new a(m.this, c0Var, null);
            this.f204835f = vq.j.a(c0Var);
            this.f204834e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<v84.b.d> c0Var, tq.e<? super k10.l<? extends v84.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f204835f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv84/a$e;", "<unused var>", "Lv84/b$a;", "Loq/i0;", "<anonymous>", "(Lv84/a$e;Lv84/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<v84.a.e, v84.b.AttendanceEmptyState, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204840e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f204840e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                v84.a.d.C5346a c5346a = v84.a.d.C5346a.f204760a;
                this.f204840e = 1;
                if (mVar.F(c5346a, this) == objE) {
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
        public final Object w(v84.a.e eVar, v84.b.AttendanceEmptyState attendanceEmptyState, tq.e<? super oq.i0> eVar2) {
            return m.this.new d(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv84/a$e;", "<unused var>", "Lv84/b$b;", "Loq/i0;", "<anonymous>", "(Lv84/a$e;Lv84/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<v84.a.e, v84.b.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204842e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f204842e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                v84.a.d.C5346a c5346a = v84.a.d.C5346a.f204760a;
                this.f204842e = 1;
                if (mVar.F(c5346a, this) == objE) {
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
        public final Object w(v84.a.e eVar, v84.b.Displaying displaying, tq.e<? super oq.i0> eVar2) {
            return m.this.new e(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv84/a$g;", "action", "Lv84/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv84/a$g;Lv84/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<v84.a.OnStatusSelected, v84.b.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f204844e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f204845f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f204846g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f204847h;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v84.a.OnStatusSelected onStatusSelected = (v84.a.OnStatusSelected) this.f204847h;
            Object objE = uq.b.e();
            int i15 = this.f204846g;
            if (i15 == 0) {
                oq.u.b(obj);
                s84.h hVarA = s84.g.a(onStatusSelected.getStatus());
                if (hVarA != null) {
                    m mVar = m.this;
                    mVar.contract.t8(hVarA);
                    v84.a.d.c cVar = v84.a.d.c.f204762a;
                    this.f204847h = vq.j.a(onStatusSelected);
                    this.f204844e = vq.j.a(hVarA);
                    this.f204845f = 0;
                    this.f204846g = 1;
                    if (mVar.F(cVar, this) == objE) {
                        return objE;
                    }
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
        public final Object w(v84.a.OnStatusSelected onStatusSelected, v84.b.Displaying displaying, tq.e<? super oq.i0> eVar) {
            f fVar = m.this.new f(eVar);
            fVar.f204847h = onStatusSelected;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv84/a$a;", "<unused var>", "Lk10/c0;", "Lv84/b$b;", "state", "Lk10/l;", "Lv84/b;", "<anonymous>", "(Lv84/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<v84.a.C5345a, k10.c0<v84.b.Displaying>, tq.e<? super k10.l<? extends v84.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204849e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204850f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v84.b.Displaying O(v84.b.Displaying displaying) {
            return v84.b.Displaying.b(displaying, null, null, true, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f204850f;
            uq.b.e();
            if (this.f204849e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: v84.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.g.O((b.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v84.a.C5345a c5345a, k10.c0<v84.b.Displaying> c0Var, tq.e<? super k10.l<? extends v84.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f204850f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv84/a$b;", "<unused var>", "Lk10/c0;", "Lv84/b$b;", "state", "Lk10/l;", "Lv84/b;", "<anonymous>", "(Lv84/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<v84.a.b, k10.c0<v84.b.Displaying>, tq.e<? super k10.l<? extends v84.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204851e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204852f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v84.b.Displaying O(v84.b.Displaying displaying) {
            return v84.b.Displaying.b(displaying, null, null, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f204852f;
            uq.b.e();
            if (this.f204851e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: v84.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.h.O((b.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v84.a.b bVar, k10.c0<v84.b.Displaying> c0Var, tq.e<? super k10.l<? extends v84.b>> eVar) {
            h hVar = new h(eVar);
            hVar.f204852f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv84/a$c;", "<unused var>", "Lv84/b$b;", "Loq/i0;", "<anonymous>", "(Lv84/a$c;Lv84/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<v84.a.c, v84.b.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204853e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f204853e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                v84.a.d.b bVar = v84.a.d.b.f204761a;
                this.f204853e = 1;
                if (mVar.F(bVar, this) == objE) {
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
        public final Object w(v84.a.c cVar, v84.b.Displaying displaying, tq.e<? super oq.i0> eVar) {
            return m.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv84/a$f;", "action", "Lk10/c0;", "Lv84/b$b;", "state", "Lk10/l;", "Lv84/b;", "<anonymous>", "(Lv84/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<v84.a.OnSemesterSelected, k10.c0<v84.b.Displaying>, tq.e<? super k10.l<? extends v84.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204855e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204856f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204857g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v84.b.Displaying O(v84.a.OnSemesterSelected onSemesterSelected, v84.b.Displaying displaying) {
            return v84.b.Displaying.b(displaying, null, onSemesterSelected.getSemester(), false, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v84.a.OnSemesterSelected onSemesterSelected = (v84.a.OnSemesterSelected) this.f204856f;
            k10.c0 c0Var = (k10.c0) this.f204857g;
            uq.b.e();
            if (this.f204855e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m.this.contract.P7(onSemesterSelected.getSemester().getSemesterId());
            return c0Var.d(new er.l() { // from class: v84.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.j.O(onSemesterSelected, (b.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v84.a.OnSemesterSelected onSemesterSelected, k10.c0<v84.b.Displaying> c0Var, tq.e<? super k10.l<? extends v84.b>> eVar) {
            j jVar = m.this.new j(eVar);
            jVar.f204856f = onSemesterSelected;
            jVar.f204857g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv84/a$h;", "<unused var>", "Lk10/c0;", "Lv84/b$c;", "state", "Lk10/l;", "Lv84/b;", "<anonymous>", "(Lv84/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<v84.a.h, k10.c0<v84.b.ErrorLoadingInitialData>, tq.e<? super k10.l<? extends v84.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204859e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204860f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v84.b.d O(v84.b.ErrorLoadingInitialData errorLoadingInitialData) {
            return v84.b.d.f204773a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f204860f;
            uq.b.e();
            if (this.f204859e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: v84.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.k.O((b.ErrorLoadingInitialData) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v84.a.h hVar, k10.c0<v84.b.ErrorLoadingInitialData> c0Var, tq.e<? super k10.l<? extends v84.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f204860f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv84/a$e;", "<unused var>", "Lv84/b$c;", "Loq/i0;", "<anonymous>", "(Lv84/a$e;Lv84/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<v84.a.e, v84.b.ErrorLoadingInitialData, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204861e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f204861e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                v84.a.d.C5346a c5346a = v84.a.d.C5346a.f204760a;
                this.f204861e = 1;
                if (mVar.F(c5346a, this) == objE) {
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
        public final Object w(v84.a.e eVar, v84.b.ErrorLoadingInitialData errorLoadingInitialData, tq.e<? super oq.i0> eVar2) {
            return m.this.new l(eVar2).J(oq.i0.f148189a);
        }
    }

    public m(yy.a aVar, x84.d dVar, p84.a aVar2, hb4.d dVar2, ib4.c cVar, ac4.a aVar3, w84.a aVar4) {
        this.mapper = dVar;
        this.interactorFactory = aVar2;
        this.errorVMSFactory = dVar2;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.contract = aVar4;
        v84.b.d dVar3 = v84.b.d.f204773a;
        this.initialState = dVar3;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(dVar3, new er.l() { // from class: v84.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.F9(this.f204808a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), A9(dVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v84.c.a A9(v84.b state) {
        return this.mapper.b(new x84.d.Params(state, b9(v84.a.e.f204763a), b9(v84.a.C5345a.f204757a), b9(v84.a.b.f204758a), new er.l() { // from class: v84.h
            @Override // er.l
            public final Object b(Object obj) {
                return m.B9(this.f204798a, (SemesterAttendanceSummary) obj);
            }
        }, new er.l() { // from class: v84.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.C9(this.f204800a, (s84.c) obj);
            }
        }, b9(v84.a.c.f204759a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(m mVar, SemesterAttendanceSummary semesterAttendanceSummary) {
        mVar.d9(new v84.a.OnSemesterSelected(semesterAttendanceSummary));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(m mVar, s84.c cVar) {
        mVar.d9(new v84.a.OnStatusSelected(cVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SemesterAttendanceSummary D9(s84.f.AttendanceSemesters attendanceSummary) {
        Object next;
        String strZ = this.contract.z();
        Object obj = null;
        if (strZ != null) {
            Iterator<T> it = attendanceSummary.a().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((SemesterAttendanceSummary) next).getSemesterId(), strZ));
            SemesterAttendanceSummary semesterAttendanceSummary = (SemesterAttendanceSummary) next;
            if (semesterAttendanceSummary != null) {
                return semesterAttendanceSummary;
            }
        }
        for (Object obj2 : attendanceSummary.a()) {
            if (((SemesterAttendanceSummary) obj2).getCurrent()) {
                obj = obj2;
                break;
            }
        }
        SemesterAttendanceSummary semesterAttendanceSummary2 = (SemesterAttendanceSummary) obj;
        return semesterAttendanceSummary2 == null ? (SemesterAttendanceSummary) pq.v.n0(attendanceSummary.a()) : semesterAttendanceSummary2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(final m mVar, k10.v vVar) {
        vVar.c(q0.c(v84.b.d.class), new er.l() { // from class: v84.d
            @Override // er.l
            public final Object b(Object obj) {
                return m.G9(this.f204789a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(v84.b.AttendanceEmptyState.class), new er.l() { // from class: v84.e
            @Override // er.l
            public final Object b(Object obj) {
                return m.H9(this.f204792a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(v84.b.Displaying.class), new er.l() { // from class: v84.f
            @Override // er.l
            public final Object b(Object obj) {
                return m.I9(this.f204793a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(v84.b.ErrorLoadingInitialData.class), new er.l() { // from class: v84.g
            @Override // er.l
            public final Object b(Object obj) {
                return m.J9(this.f204796a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(m mVar, k10.z zVar) {
        zVar.A(mVar.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(m mVar, k10.z zVar) {
        d dVar = mVar.new d(null);
        zVar.x(q0.c(v84.a.e.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(m mVar, k10.z zVar) {
        e eVar = mVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(v84.a.e.class), oVar, eVar);
        zVar.x(q0.c(v84.a.OnStatusSelected.class), oVar, mVar.new f(null));
        zVar.v(q0.c(v84.a.C5345a.class), oVar, new g(null));
        zVar.v(q0.c(v84.a.b.class), oVar, new h(null));
        zVar.x(q0.c(v84.a.c.class), oVar, mVar.new i(null));
        zVar.v(q0.c(v84.a.OnSemesterSelected.class), oVar, mVar.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(m mVar, k10.z zVar) {
        k kVar = new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(v84.a.h.class), oVar, kVar);
        zVar.x(q0.c(v84.a.e.class), oVar, mVar.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b K9(dx.b bVar, final er.a<oq.i0> aVar, final er.a<oq.i0> aVar2) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: v84.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.L9(aVar2, aVar, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
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
    public final r84.a y9() {
        return (r84.a) this.interactor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r84.a z9(m mVar) {
        return mVar.interactorFactory.a(mVar.contract.b());
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<v84.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<v84.b, v84.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<v84.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(v84.a.d dVar, tq.e<? super oq.i0> eVar) {
        return super.F(dVar, eVar);
    }
}
