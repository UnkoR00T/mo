package ju2;

import bu2.VerificationCheckData;
import bu2.VerifiedStatus;
import fr.q0;
import iu2.WizardResultData;
import java.time.LocalDate;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BI\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\"H\u0096@¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010(H\u0096@¢\u0006\u0004\b,\u0010'J\u0017\u0010/\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u001f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104JA\u0010;\u001a\u00020\u001f2\b\u00106\u001a\u0004\u0018\u0001052\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\u001f072\b\u00109\u001a\u0004\u0018\u0001052\b\u0010:\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b;\u0010<R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR&\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030K8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR \u0010W\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR \u0010Z\u001a\b\u0012\u0004\u0012\u00020X0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bG\u0010VR&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0[8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\\\u0010]\u0012\u0004\b`\u0010a\u001a\u0004\b^\u0010_¨\u0006b"}, d2 = {"Lju2/g0;", "Ll00/g;", "Lju2/g;", "Lju2/e;", "Lju2/h;", "", "Lju2/f;", "Lyy/a;", "stateMachineFactory", "Lku2/a;", "mapper", "Luu2/b;", "exitDialogMapper", "Lzt2/s;", "saveWizardVerificationCheckDataUseCase", "Lzt2/n;", "getWizardVerificationCheckDataUseCase", "Lzt2/t;", "saveWizardVerifiedStatusUseCase", "Lzt2/o;", "getWizardVerifiedStatusUseCase", "Lzt2/k;", "clearWizardDataUseCase", "<init>", "(Lyy/a;Lku2/a;Luu2/b;Lzt2/s;Lzt2/n;Lzt2/t;Lzt2/o;Lzt2/k;)V", "state", "Lju2/h$a;", "r9", "(Lju2/g;)Lju2/h$a;", "Lcu2/i$g;", "destination", "Loq/i0;", "Y5", "(Lcu2/i$g;)V", "Lbu2/d;", "verificationCheckData", "J", "(Lbu2/d;Ltq/e;)Ljava/lang/Object;", "s", "(Ltq/e;)Ljava/lang/Object;", "Lbu2/e;", "verifiedStatus", "w0", "(Lbu2/e;Ltq/e;)Ljava/lang/Object;", "Y", "Liu2/a;", "wizardResultData", "H0", "(Liu2/a;)V", "Ljb4/b;", "errorData", "b0", "(Ljb4/b;)V", "Ljava/time/LocalDate;", "initialDate", "Lkotlin/Function1;", "onDateChange", "minimumDate", "maximumDate", "t0", "(Ljava/time/LocalDate;Ler/l;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "b", "Lku2/a;", "c", "Luu2/b;", "d", "Lzt2/s;", "e", "Lzt2/n;", "f", "Lzt2/t;", "g", "Lzt2/o;", "h", "Lzt2/k;", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lju2/e$d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lju2/e$e;", "l", "nestedNavAction", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "()V", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 extends l00.g<ju2.g, ju2.e> implements ju2.h, zx.d, ju2.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ku2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uu2.b exitDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zt2.s saveWizardVerificationCheckDataUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zt2.n getWizardVerificationCheckDataUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final zt2.t saveWizardVerifiedStatusUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final zt2.o getWizardVerifiedStatusUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final zt2.k clearWizardDataUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ju2.g, ju2.e> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ju2.e.d> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ju2.e.AbstractC2511e> nestedNavAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final p0<ju2.h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ju2.h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f105922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f105923b;

        /* JADX INFO: renamed from: ju2.g0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2512a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f105924a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g0 f105925b;

            /* JADX INFO: renamed from: ju2.g0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2513a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f105926d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f105927e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f105928f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f105930h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f105931j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f105932k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f105933l;

                public C2513a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f105926d = obj;
                    this.f105927e |= PKIFailureInfo.systemUnavail;
                    return C2512a.this.F(null, this);
                }
            }

            public C2512a(mu.h hVar, g0 g0Var) {
                this.f105924a = hVar;
                this.f105925b = g0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2513a c2513a;
                if (eVar instanceof C2513a) {
                    c2513a = (C2513a) eVar;
                    int i15 = c2513a.f105927e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2513a.f105927e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2513a = new C2513a(eVar);
                    }
                } else {
                    c2513a = new C2513a(eVar);
                }
                Object obj2 = c2513a.f105926d;
                Object objE = uq.b.e();
                int i16 = c2513a.f105927e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f105924a;
                    ju2.h.Data dataR9 = this.f105925b.r9((ju2.g) obj);
                    c2513a.f105928f = vq.j.a(obj);
                    c2513a.f105930h = vq.j.a(c2513a);
                    c2513a.f105931j = vq.j.a(obj);
                    c2513a.f105932k = vq.j.a(hVar);
                    c2513a.f105933l = 0;
                    c2513a.f105927e = 1;
                    if (hVar.F(dataR9, c2513a) == objE) {
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

        public a(mu.g gVar, g0 g0Var) {
            this.f105922a = gVar;
            this.f105923b = g0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super ju2.h.Data> hVar, tq.e eVar) {
            Object objA = this.f105922a.a(new C2512a(hVar, this.f105923b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lju2/g;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<ju2.g>, tq.e<? super k10.l<? extends ju2.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105935f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f105935f;
            Object objE = uq.b.e();
            int i15 = this.f105934e;
            if (i15 == 0) {
                oq.u.b(obj);
                zt2.k kVar = g0.this.clearWizardDataUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f105935f = c0Var;
                this.f105934e = 1;
                if (kVar.a(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<ju2.g> c0Var, tq.e<? super k10.l<? extends ju2.g>> eVar) {
            return ((b) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = g0.this.new b(eVar);
            bVar.f105935f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lju2/e$i;", "action", "Lk10/c0;", "Lju2/g;", "state", "Lk10/l;", "<anonymous>", "(Lju2/e$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ju2.e.StepChanged, k10.c0<ju2.g>, tq.e<? super k10.l<? extends ju2.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105938f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f105939g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ju2.g.b X(ju2.g gVar) {
            return ju2.g.b.f105909a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ju2.g.c Y(ju2.g gVar) {
            return ju2.g.c.f105910a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ju2.g.a Z(ju2.g gVar) {
            return ju2.g.a.f105908a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ju2.e.StepChanged stepChanged = (ju2.e.StepChanged) this.f105938f;
            k10.c0 c0Var = (k10.c0) this.f105939g;
            uq.b.e();
            if (this.f105937e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            cu2.i.g destination = stepChanged.getDestination();
            if (fr.t.c(destination, cu2.i.g.b.f37997a)) {
                return c0Var.d(new er.l() { // from class: ju2.h0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.c.X((g) obj2);
                    }
                });
            }
            if (fr.t.c(destination, cu2.i.g.c.f37999a)) {
                return c0Var.d(new er.l() { // from class: ju2.i0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.c.Y((g) obj2);
                    }
                });
            }
            if (fr.t.c(destination, cu2.i.g.a.f37995a)) {
                return c0Var.d(new er.l() { // from class: ju2.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.c.Z((g) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(ju2.e.StepChanged stepChanged, k10.c0<ju2.g> c0Var, tq.e<? super k10.l<? extends ju2.g>> eVar) {
            c cVar = new c(eVar);
            cVar.f105938f = stepChanged;
            cVar.f105939g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju2/e$g;", "action", "Lju2/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lju2/e$g;Lju2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ju2.e.SaveVerificationCheckData, ju2.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105941f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ju2.e.SaveVerificationCheckData saveVerificationCheckData = (ju2.e.SaveVerificationCheckData) this.f105941f;
            Object objE = uq.b.e();
            int i15 = this.f105940e;
            if (i15 == 0) {
                oq.u.b(obj);
                zt2.s sVar = g0.this.saveWizardVerificationCheckDataUseCase;
                zt2.s.Params params = new zt2.s.Params(saveVerificationCheckData.getVerificationCheckData());
                this.f105941f = vq.j.a(saveVerificationCheckData);
                this.f105940e = 1;
                if (sVar.d(params, this) == objE) {
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
        public final Object w(ju2.e.SaveVerificationCheckData saveVerificationCheckData, ju2.g gVar, tq.e<? super oq.i0> eVar) {
            d dVar = g0.this.new d(eVar);
            dVar.f105941f = saveVerificationCheckData;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju2/e$h;", "action", "Lju2/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lju2/e$h;Lju2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ju2.e.SaveVerifiedStatus, ju2.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105943e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105944f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ju2.e.SaveVerifiedStatus saveVerifiedStatus = (ju2.e.SaveVerifiedStatus) this.f105944f;
            Object objE = uq.b.e();
            int i15 = this.f105943e;
            if (i15 == 0) {
                oq.u.b(obj);
                zt2.t tVar = g0.this.saveWizardVerifiedStatusUseCase;
                zt2.t.Params params = new zt2.t.Params(saveVerifiedStatus.getVerifiedStatus());
                this.f105944f = vq.j.a(saveVerifiedStatus);
                this.f105943e = 1;
                if (tVar.d(params, this) == objE) {
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
        public final Object w(ju2.e.SaveVerifiedStatus saveVerifiedStatus, ju2.g gVar, tq.e<? super oq.i0> eVar) {
            e eVar2 = g0.this.new e(eVar);
            eVar2.f105944f = saveVerifiedStatus;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju2/e$f;", "<unused var>", "Lju2/g;", "Loq/i0;", "<anonymous>", "(Lju2/e$f;Lju2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ju2.e.f, ju2.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105946e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105946e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ju2.e.d> bVarY1 = g0.this.Y1();
                ju2.e.d.OpenExitDialog openExitDialog = new ju2.e.d.OpenExitDialog(g0.this.exitDialogMapper.b(new uu2.b.Params(g0.this.b9(ju2.e.b.f105886a))));
                this.f105946e = 1;
                if (bVarY1.F(openExitDialog, this) == objE) {
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
        public final Object w(ju2.e.f fVar, ju2.g gVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju2/e$b;", "<unused var>", "Lju2/g;", "Loq/i0;", "<anonymous>", "(Lju2/e$b;Lju2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ju2.e.b, ju2.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105948e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105948e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ju2.e.d> bVarY1 = g0.this.Y1();
                ju2.e.d.c cVar = ju2.e.d.c.f105890a;
                this.f105948e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(ju2.e.b bVar, ju2.g gVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju2/e$c;", "action", "Lju2/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lju2/e$c;Lju2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ju2.e.GoToResult, ju2.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105951f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ju2.e.GoToResult goToResult = (ju2.e.GoToResult) this.f105951f;
            Object objE = uq.b.e();
            int i15 = this.f105950e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ju2.e.d> bVarY1 = g0.this.Y1();
                ju2.e.d.GoToResult goToResult2 = new ju2.e.d.GoToResult(goToResult.getWizardResultData());
                this.f105951f = vq.j.a(goToResult);
                this.f105950e = 1;
                if (bVarY1.F(goToResult2, this) == objE) {
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
        public final Object w(ju2.e.GoToResult goToResult, ju2.g gVar, tq.e<? super oq.i0> eVar) {
            h hVar = g0.this.new h(eVar);
            hVar.f105951f = goToResult;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju2/e$a;", "action", "Lju2/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lju2/e$a;Lju2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ju2.e.Error, ju2.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105953e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105954f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ju2.e.Error error = (ju2.e.Error) this.f105954f;
            Object objE = uq.b.e();
            int i15 = this.f105953e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ju2.e.d> bVarY1 = g0.this.Y1();
                ju2.e.d.Error error2 = new ju2.e.d.Error(error.getErrorData());
                this.f105954f = vq.j.a(error);
                this.f105953e = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        public final Object w(ju2.e.Error error, ju2.g gVar, tq.e<? super oq.i0> eVar) {
            i iVar = g0.this.new i(eVar);
            iVar.f105954f = error;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju2/e$j;", "action", "Lju2/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lju2/e$j;Lju2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ju2.e.ToDatePicker, ju2.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105957f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ju2.e.ToDatePicker toDatePicker = (ju2.e.ToDatePicker) this.f105957f;
            Object objE = uq.b.e();
            int i15 = this.f105956e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ju2.e.d> bVarY1 = g0.this.Y1();
                ju2.e.d.ToDatePicker toDatePicker2 = new ju2.e.d.ToDatePicker(toDatePicker.getInitialDate(), toDatePicker.d(), toDatePicker.getMinimumDate(), toDatePicker.getMaximumDate());
                this.f105957f = vq.j.a(toDatePicker);
                this.f105956e = 1;
                if (bVarY1.F(toDatePicker2, this) == objE) {
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
        public final Object w(ju2.e.ToDatePicker toDatePicker, ju2.g gVar, tq.e<? super oq.i0> eVar) {
            j jVar = g0.this.new j(eVar);
            jVar.f105957f = toDatePicker;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju2/e$e$a;", "<unused var>", "Lju2/g$b;", "Loq/i0;", "<anonymous>", "(Lju2/e$e$a;Lju2/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ju2.e.AbstractC2511e.a, ju2.g.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105959e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105959e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ju2.e.d> bVarY1 = g0.this.Y1();
                ju2.e.d.a aVar = ju2.e.d.a.f105888a;
                this.f105959e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(ju2.e.AbstractC2511e.a aVar, ju2.g.b bVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju2/e$e$a;", "<unused var>", "Lju2/g$c;", "Loq/i0;", "<anonymous>", "(Lju2/e$e$a;Lju2/g$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ju2.e.AbstractC2511e.a, ju2.g.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105961e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105961e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ju2.e.AbstractC2511e> bVarG = g0.this.g();
                ju2.e.AbstractC2511e.a aVar = ju2.e.AbstractC2511e.a.f105897a;
                this.f105961e = 1;
                if (bVarG.F(aVar, this) == objE) {
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
        public final Object w(ju2.e.AbstractC2511e.a aVar, ju2.g.c cVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju2/e$e$a;", "<unused var>", "Lju2/g$a;", "Loq/i0;", "<anonymous>", "(Lju2/e$e$a;Lju2/g$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ju2.e.AbstractC2511e.a, ju2.g.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105963e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f105963e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ju2.e.AbstractC2511e> bVarG = g0.this.g();
                ju2.e.AbstractC2511e.a aVar = ju2.e.AbstractC2511e.a.f105897a;
                this.f105963e = 1;
                if (bVarG.F(aVar, this) == objE) {
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
        public final Object w(ju2.e.AbstractC2511e.a aVar, ju2.g.a aVar2, tq.e<? super oq.i0> eVar) {
            return g0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    public g0(yy.a aVar, ku2.a aVar2, uu2.b bVar, zt2.s sVar, zt2.n nVar, zt2.t tVar, zt2.o oVar, zt2.k kVar) {
        this.mapper = aVar2;
        this.exitDialogMapper = bVar;
        this.saveWizardVerificationCheckDataUseCase = sVar;
        this.getWizardVerificationCheckDataUseCase = nVar;
        this.saveWizardVerifiedStatusUseCase = tVar;
        this.getWizardVerifiedStatusUseCase = oVar;
        this.clearWizardDataUseCase = kVar;
        ju2.g.b bVar2 = ju2.g.b.f105909a;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: ju2.b0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.t9(this.f105878a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.nestedNavAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), r9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ju2.h.Data r9(ju2.g state) {
        return this.mapper.b(new ku2.a.Params(state, b9(ju2.e.AbstractC2511e.a.f105897a), b9(ju2.e.f.f105898a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t9(final g0 g0Var, k10.v vVar) {
        vVar.c(q0.c(ju2.g.class), new er.l() { // from class: ju2.c0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.u9(this.f105879a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ju2.g.b.class), new er.l() { // from class: ju2.d0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.v9(this.f105884a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ju2.g.c.class), new er.l() { // from class: ju2.e0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.w9(this.f105906a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ju2.g.a.class), new er.l() { // from class: ju2.f0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.x9(this.f105907a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u9(g0 g0Var, k10.z zVar) {
        zVar.A(g0Var.new b(null));
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ju2.e.StepChanged.class), oVar, cVar);
        zVar.x(q0.c(ju2.e.SaveVerificationCheckData.class), oVar, g0Var.new d(null));
        zVar.x(q0.c(ju2.e.SaveVerifiedStatus.class), oVar, g0Var.new e(null));
        zVar.x(q0.c(ju2.e.f.class), oVar, g0Var.new f(null));
        zVar.x(q0.c(ju2.e.b.class), oVar, g0Var.new g(null));
        zVar.x(q0.c(ju2.e.GoToResult.class), oVar, g0Var.new h(null));
        zVar.x(q0.c(ju2.e.Error.class), oVar, g0Var.new i(null));
        zVar.x(q0.c(ju2.e.ToDatePicker.class), oVar, g0Var.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v9(g0 g0Var, k10.z zVar) {
        k kVar = g0Var.new k(null);
        zVar.x(q0.c(ju2.e.AbstractC2511e.a.class), k10.o.CANCEL_PREVIOUS, kVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w9(g0 g0Var, k10.z zVar) {
        l lVar = g0Var.new l(null);
        zVar.x(q0.c(ju2.e.AbstractC2511e.a.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(g0 g0Var, k10.z zVar) {
        m mVar = g0Var.new m(null);
        zVar.x(q0.c(ju2.e.AbstractC2511e.a.class), k10.o.CANCEL_PREVIOUS, mVar);
        return oq.i0.f148189a;
    }

    @Override // ju2.f
    public void H0(WizardResultData wizardResultData) {
        d9(new ju2.e.GoToResult(wizardResultData));
    }

    @Override // ju2.f
    public Object J(VerificationCheckData verificationCheckData, tq.e<? super oq.i0> eVar) {
        d9(new ju2.e.SaveVerificationCheckData(verificationCheckData));
        return oq.i0.f148189a;
    }

    @Override // ju2.f
    public Object Y(tq.e<? super VerifiedStatus> eVar) {
        return this.getWizardVerifiedStatusUseCase.a(gz.b.a.C1792a.f78542a, eVar);
    }

    @Override // zx.b
    public xw.b<ju2.e.d> Y1() {
        return this.navAction;
    }

    @Override // ju2.f
    public void Y5(cu2.i.g destination) {
        d9(new ju2.e.StepChanged(destination));
    }

    @Override // ju2.f
    public void b0(jb4.b errorData) {
        d9(new ju2.e.Error(errorData));
    }

    @Override // l00.g
    protected k10.t<ju2.g, ju2.e> e9() {
        return this.stateMachine;
    }

    @Override // ju2.f
    public xw.b<ju2.e.AbstractC2511e> g() {
        return this.nestedNavAction;
    }

    @Override // l00.e
    public p0<ju2.h.Data> getState() {
        return this.state;
    }

    @Override // ju2.f
    public Object s(tq.e<? super VerificationCheckData> eVar) {
        return this.getWizardVerificationCheckDataUseCase.a(gz.b.a.C1792a.f78542a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // ju2.f
    public void t0(LocalDate initialDate, er.l<? super LocalDate, oq.i0> onDateChange, LocalDate minimumDate, LocalDate maximumDate) {
        d9(new ju2.e.ToDatePicker(initialDate, onDateChange, minimumDate, maximumDate));
    }

    @Override // ju2.f
    public Object w0(VerifiedStatus verifiedStatus, tq.e<? super oq.i0> eVar) {
        d9(new ju2.e.SaveVerifiedStatus(verifiedStatus));
        return oq.i0.f148189a;
    }
}
