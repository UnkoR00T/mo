package c94;

import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import s84.AttendanceStatusDetails;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001IBC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010 \u001a\u00020\u001f*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001b\u00106\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u000208078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R&\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030>8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H¨\u0006J"}, d2 = {"Lc94/t;", "Ll00/g;", "Lc94/b;", "Lc94/a;", "Lc94/c;", "", "Lyy/a;", "stateMachineFactory", "Le94/a;", "mapper", "Lp84/a;", "interactorFactory", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Ld94/a;", "contract", "<init>", "(Lyy/a;Le94/a;Lp84/a;Lhb4/d;Lib4/c;Lac4/a;Ld94/a;)V", "state", "Lc94/c$b;", "y9", "(Lc94/b;)Lc94/c$b;", "Ldx/b;", "Lkotlin/Function0;", "Loq/i0;", "onRetry", "onClose", "Ljb4/b;", "E9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "b", "Le94/a;", "c", "Lp84/a;", "d", "Lhb4/d;", "e", "Lib4/c;", "f", "Lac4/a;", "g", "Ld94/a;", "h", "Lc94/b;", "initialState", "Lr84/a;", "j", "Loq/k;", "w9", "()Lr84/a;", "interactor", "Lxw/b;", "Lc94/a$a;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<c94.b, c94.a> implements c94.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e94.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p84.a interactorFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d94.a contract;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c94.b initialState;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oq.k interactor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c94.a.InterfaceC0654a> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<c94.b, c94.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<c94.c.b> state;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lc94/t$a;", "", "Ld94/a;", "data", "Lc94/t;", "a", "(Ld94/a;)Lc94/t;", "schoolattendance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {
        t a(d94.a data);
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<c94.c.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f24678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f24679b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f24680a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f24681b;

            /* JADX INFO: renamed from: c94.t$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0659a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f24682d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f24683e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f24684f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f24686h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f24687j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f24688k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f24689l;

                public C0659a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f24682d = obj;
                    this.f24683e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f24680a = hVar;
                this.f24681b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0659a c0659a;
                if (eVar instanceof C0659a) {
                    c0659a = (C0659a) eVar;
                    int i15 = c0659a.f24683e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0659a.f24683e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0659a = new C0659a(eVar);
                    }
                } else {
                    c0659a = new C0659a(eVar);
                }
                Object obj2 = c0659a.f24682d;
                Object objE = uq.b.e();
                int i16 = c0659a.f24683e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f24680a;
                    c94.c.b bVarY9 = this.f24681b.y9((c94.b) obj);
                    c0659a.f24684f = vq.j.a(obj);
                    c0659a.f24686h = vq.j.a(c0659a);
                    c0659a.f24687j = vq.j.a(obj);
                    c0659a.f24688k = vq.j.a(hVar);
                    c0659a.f24689l = 0;
                    c0659a.f24683e = 1;
                    if (hVar.F(bVarY9, c0659a) == objE) {
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
            this.f24678a = gVar;
            this.f24679b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c94.c.b> hVar, tq.e eVar) {
            Object objA = this.f24678a.a(new a(hVar, this.f24679b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lc94/b$c;", "state", "Lk10/l;", "Lc94/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<c94.b.c>, tq.e<? super k10.l<? extends c94.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f24690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f24691f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f24692g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f24693h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f24694j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f24695k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lc94/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends c94.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f24697e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t f24698f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f24699g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ s84.c f24700h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ k10.c0<c94.b.c> f24701j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ s84.h f24702k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, String str, s84.c cVar, k10.c0<c94.b.c> c0Var, s84.h hVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f24698f = tVar;
                this.f24699g = str;
                this.f24700h = cVar;
                this.f24701j = c0Var;
                this.f24702k = hVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final c94.b.ErrorLoading X(t tVar, dx.b bVar, c94.b.c cVar) {
                return new c94.b.ErrorLoading(tVar.errorVMSFactory.a(tVar.E9(bVar, tVar.b9(c94.a.c.f24632a), tVar.b9(c94.a.b.f24631a))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final c94.b.Displaying Y(AttendanceStatusDetails attendanceStatusDetails, s84.h hVar, c94.b.c cVar) {
                return new c94.b.Displaying(attendanceStatusDetails, hVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f24697e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    r84.a aVarW9 = this.f24698f.w9();
                    String strF = this.f24698f.contract.f();
                    String str = this.f24699g;
                    s84.c cVar = this.f24700h;
                    this.f24697e = 1;
                    obj = aVarW9.c(strF, str, cVar, this);
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
                k10.c0<c94.b.c> c0Var = this.f24701j;
                final t tVar = this.f24698f;
                final s84.h hVar = this.f24702k;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: c94.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.c.a.X(tVar, bVar, (b.c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final AttendanceStatusDetails attendanceStatusDetails = (AttendanceStatusDetails) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: c94.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.c.a.Y(attendanceStatusDetails, hVar, (b.c) obj2);
                    }
                });
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f24698f, this.f24699g, this.f24700h, this.f24701j, this.f24702k, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends c94.b>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c94.b.ErrorLoading X(final t tVar, c94.b.c cVar) {
            return new c94.b.ErrorLoading(tVar.errorVMSFactory.a(tVar.genericDomainErrorMapper.b(new ib4.c.Params(new dx.b.Generic(null, 1, null), false, new er.l() { // from class: c94.w
                @Override // er.l
                public final Object b(Object obj) {
                    return t.c.Y(tVar, (ib4.c.b) obj);
                }
            }))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 Y(t tVar, ib4.c.b bVar) {
            tVar.d9(c94.a.b.f24631a);
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c94.b.Displaying Z(s84.h hVar, c94.b.c cVar) {
            return new c94.b.Displaying(null, hVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objA;
            k10.c0 c0Var = (k10.c0) this.f24695k;
            Object objE = uq.b.e();
            int i15 = this.f24694j;
            if (i15 == 0) {
                oq.u.b(obj);
                final s84.h hVarH1 = t.this.contract.H1();
                String strZ = t.this.contract.z();
                s84.c cVarB = hVarH1 != null ? s84.g.b(hVarH1) : null;
                Integer numK3 = t.this.contract.K3();
                if (hVarH1 == null || strZ == null || cVarB == null) {
                    final t tVar = t.this;
                    return c0Var.d(new er.l() { // from class: c94.u
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.c.X(tVar, (b.c) obj2);
                        }
                    });
                }
                if (numK3 != null && numK3.intValue() <= 0) {
                    return c0Var.d(new er.l() { // from class: c94.v
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.c.Z(hVarH1, (b.c) obj2);
                        }
                    });
                }
                ac4.a aVar = t.this.callActionWithLoaderUseCase;
                a aVar2 = new a(t.this, strZ, cVarB, c0Var, hVarH1, null);
                this.f24695k = vq.j.a(c0Var);
                this.f24690e = vq.j.a(hVarH1);
                this.f24691f = vq.j.a(strZ);
                this.f24692g = vq.j.a(cVarB);
                this.f24693h = vq.j.a(numK3);
                this.f24694j = 1;
                objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
                if (objA == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                objA = obj;
            }
            return (k10.l) objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<c94.b.c> c0Var, tq.e<? super k10.l<? extends c94.b>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = t.this.new c(eVar);
            cVar.f24695k = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc94/a$b;", "<unused var>", "Lc94/b$a;", "Loq/i0;", "<anonymous>", "(Lc94/a$b;Lc94/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<c94.a.b, c94.b.Displaying, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24703e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24703e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                c94.a.InterfaceC0654a.C0655a c0655a = c94.a.InterfaceC0654a.C0655a.f24630a;
                this.f24703e = 1;
                if (tVar.F(c0655a, this) == objE) {
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
        public final Object w(c94.a.b bVar, c94.b.Displaying displaying, tq.e<? super i0> eVar) {
            return t.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lc94/a$c;", "<unused var>", "Lk10/c0;", "Lc94/b$b;", "state", "Lk10/l;", "Lc94/b;", "<anonymous>", "(Lc94/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<c94.a.c, k10.c0<c94.b.ErrorLoading>, tq.e<? super k10.l<? extends c94.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24705e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f24706f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c94.b.c O(c94.b.ErrorLoading errorLoading) {
            return c94.b.c.f24636a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f24706f;
            uq.b.e();
            if (this.f24705e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: c94.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O((b.ErrorLoading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(c94.a.c cVar, k10.c0<c94.b.ErrorLoading> c0Var, tq.e<? super k10.l<? extends c94.b>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f24706f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc94/a$b;", "<unused var>", "Lc94/b$b;", "Loq/i0;", "<anonymous>", "(Lc94/a$b;Lc94/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<c94.a.b, c94.b.ErrorLoading, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f24707e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f24707e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                c94.a.InterfaceC0654a.C0655a c0655a = c94.a.InterfaceC0654a.C0655a.f24630a;
                this.f24707e = 1;
                if (tVar.F(c0655a, this) == objE) {
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
        public final Object w(c94.a.b bVar, c94.b.ErrorLoading errorLoading, tq.e<? super i0> eVar) {
            return t.this.new f(eVar).J(i0.f148189a);
        }
    }

    public t(yy.a aVar, e94.a aVar2, p84.a aVar3, hb4.d dVar, ib4.c cVar, ac4.a aVar4, d94.a aVar5) {
        this.mapper = aVar2;
        this.interactorFactory = aVar3;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar4;
        this.contract = aVar5;
        c94.b.c cVar2 = c94.b.c.f24636a;
        this.initialState = cVar2;
        this.interactor = oq.l.a(new er.a() { // from class: c94.n
            @Override // er.a
            public final Object a() {
                return t.x9(this.f24660a);
            }
        });
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: c94.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.A9(this.f24661a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), y9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(c94.b.c.class), new er.l() { // from class: c94.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.B9(this.f24662a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(c94.b.Displaying.class), new er.l() { // from class: c94.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.C9(this.f24663a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(c94.b.ErrorLoading.class), new er.l() { // from class: c94.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.D9(this.f24664a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(t tVar, k10.z zVar) {
        zVar.A(tVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(t tVar, k10.z zVar) {
        d dVar = tVar.new d(null);
        zVar.x(q0.c(c94.a.b.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(t tVar, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(c94.a.c.class), oVar, eVar);
        zVar.x(q0.c(c94.a.b.class), oVar, tVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b E9(dx.b bVar, final er.a<i0> aVar, final er.a<i0> aVar2) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: c94.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.F9(aVar2, aVar, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
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
    public final r84.a w9() {
        return (r84.a) this.interactor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r84.a x9(t tVar) {
        return tVar.interactorFactory.a(tVar.contract.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c94.c.b y9(c94.b state) {
        return this.mapper.b(new e94.a.Params(state, b9(c94.a.b.f24631a)));
    }

    @Override // zx.b
    public xw.b<c94.a.InterfaceC0654a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<c94.b, c94.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<c94.c.b> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(c94.a.InterfaceC0654a interfaceC0654a, tq.e<? super i0> eVar) {
        return super.F(interfaceC0654a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
