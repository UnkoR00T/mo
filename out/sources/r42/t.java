package r42;

import fr.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import t42.InstallmentWithCheck;
import t42.InstallmentsPaymentData;
import x42.PaymentSummary;
import x42.PaymentsReminderDestinationParams;
import yr0.BEPaymentPackage;
import yr0.BEPaymentPart;
import yr0.BEPaymentReminder;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018*\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0018*\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0010H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lr42/t;", "Ll00/g;", "Lr42/c;", "Lr42/a;", "Lr42/d;", "", "Lyy/a;", "stateMachineFactory", "Ls42/b;", "mapper", "Les0/d;", "getPaymentPackageUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lr42/b;", "setupData", "<init>", "(Lyy/a;Ls42/b;Les0/d;Lib4/c;Lac4/a;Lr42/b;)V", "state", "Lr42/d$a;", "t9", "(Lr42/c;)Lr42/d$a;", "", "Lt42/a;", "", "clickedIndex", "", "checkState", "s9", "(Ljava/util/List;IZ)Ljava/util/List;", "Lx42/a;", "A9", "(Ljava/util/List;)Ljava/util/List;", "data", "Loq/i0;", "v9", "(Lr42/b;)V", "b", "Ls42/b;", "c", "Les0/d;", "d", "Lib4/c;", "e", "Lac4/a;", "f", "Lr42/b;", "Lr42/c$a;", "g", "Lr42/c$a;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lr42/a$e;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<r42.c, r42.a> implements r42.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s42.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final es0.d getPaymentPackageUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final PaymentsInstallmentsSetupData setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final r42.c.Initial initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<r42.c, r42.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<r42.a.e> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<r42.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<r42.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f171740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f171741b;

        /* JADX INFO: renamed from: r42.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4366a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f171742a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f171743b;

            /* JADX INFO: renamed from: r42.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4367a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f171744d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f171745e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f171746f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f171748h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f171749j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f171750k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f171751l;

                public C4367a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f171744d = obj;
                    this.f171745e |= PKIFailureInfo.systemUnavail;
                    return C4366a.this.F(null, this);
                }
            }

            public C4366a(mu.h hVar, t tVar) {
                this.f171742a = hVar;
                this.f171743b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4367a c4367a;
                if (eVar instanceof C4367a) {
                    c4367a = (C4367a) eVar;
                    int i15 = c4367a.f171745e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4367a.f171745e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4367a = new C4367a(eVar);
                    }
                } else {
                    c4367a = new C4367a(eVar);
                }
                Object obj2 = c4367a.f171744d;
                Object objE = uq.b.e();
                int i16 = c4367a.f171745e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f171742a;
                    r42.d.a aVarT9 = this.f171743b.t9((r42.c) obj);
                    c4367a.f171746f = vq.j.a(obj);
                    c4367a.f171748h = vq.j.a(c4367a);
                    c4367a.f171749j = vq.j.a(obj);
                    c4367a.f171750k = vq.j.a(hVar);
                    c4367a.f171751l = 0;
                    c4367a.f171745e = 1;
                    if (hVar.F(aVarT9, c4367a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f171740a = gVar;
            this.f171741b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super r42.d.a> hVar, tq.e eVar) {
            Object objA = this.f171740a.a(new C4366a(hVar, this.f171741b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr42/a$a;", "<unused var>", "Lr42/c;", "Loq/i0;", "<anonymous>", "(Lr42/a$a;Lr42/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<r42.a.C4363a, r42.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171752e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f171752e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<r42.a.e> bVarY1 = t.this.Y1();
                r42.a.e.C4364a c4364a = r42.a.e.C4364a.f171680a;
                this.f171752e = 1;
                if (bVarY1.F(c4364a, this) == objE) {
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
        public final Object w(r42.a.C4363a c4363a, r42.c cVar, tq.e<? super i0> eVar) {
            return t.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr42/a$f;", "action", "Lr42/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lr42/a$f;Lr42/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<r42.a.ToError, r42.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171754e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171755f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(t tVar, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                tVar.d9(r42.a.C4363a.f171671a);
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r42.a.ToError toError = (r42.a.ToError) this.f171755f;
            Object objE = uq.b.e();
            int i15 = this.f171754e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<r42.a.e> bVarY1 = t.this.Y1();
                ib4.c cVar = t.this.genericDomainErrorMapper;
                dx.b domainError = toError.getDomainError();
                final t tVar = t.this;
                r42.a.e.ToError toError2 = new r42.a.e.ToError(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: r42.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.c.O(tVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f171755f = vq.j.a(toError);
                this.f171754e = 1;
                if (bVarY1.F(toError2, this) == objE) {
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
        public final Object w(r42.a.ToError toError, r42.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = t.this.new c(eVar);
            cVar2.f171755f = toError;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr42/a$d;", "action", "Lk10/c0;", "Lr42/c$a;", "state", "Lk10/l;", "Lr42/c;", "<anonymous>", "(Lr42/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<r42.a.LoadPaymentsInstallmentsDataAction, c0<r42.c.Initial>, tq.e<? super k10.l<? extends r42.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171758f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171759g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lr42/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends r42.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f171761e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ t f171762f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ r42.a.LoadPaymentsInstallmentsDataAction f171763g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0<r42.c.Initial> f171764h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(t tVar, r42.a.LoadPaymentsInstallmentsDataAction loadPaymentsInstallmentsDataAction, c0<r42.c.Initial> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f171762f = tVar;
                this.f171763g = loadPaymentsInstallmentsDataAction;
                this.f171764h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final r42.c.Initialized V(r42.a.LoadPaymentsInstallmentsDataAction loadPaymentsInstallmentsDataAction, BEPaymentPackage bEPaymentPackage, r42.c.Initial initial) {
                Object next;
                String sourcePaymentId = loadPaymentsInstallmentsDataAction.getSourcePaymentId();
                long paymentPackageId = loadPaymentsInstallmentsDataAction.getPaymentPackageId();
                List<BEPaymentPart> listA = bEPaymentPackage.a();
                ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
                for (BEPaymentPart bEPaymentPart : listA) {
                    Iterator<T> it = bEPaymentPackage.b().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!fr.t.c(((BEPaymentReminder) next).getId(), bEPaymentPart.getReminderPaymentId()));
                    arrayList.add(new InstallmentWithCheck(bEPaymentPart, (BEPaymentReminder) next, false));
                }
                return new r42.c.Initialized(sourcePaymentId, paymentPackageId, bEPaymentPackage, arrayList, !bEPaymentPackage.b().isEmpty(), loadPaymentsInstallmentsDataAction.getInstitutionId(), loadPaymentsInstallmentsDataAction.getInstitutionName(), loadPaymentsInstallmentsDataAction.a());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f171761e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    es0.d dVar = this.f171762f.getPaymentPackageUseCase;
                    es0.d.Params params = new es0.d.Params(this.f171763g.getPaymentPackageId());
                    this.f171761e = 1;
                    obj = dVar.c(params, this);
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
                t tVar = this.f171762f;
                c0<r42.c.Initial> c0Var = this.f171764h;
                final r42.a.LoadPaymentsInstallmentsDataAction loadPaymentsInstallmentsDataAction = this.f171763g;
                if (iVar instanceof dx.i.Left) {
                    tVar.d9(new r42.a.ToError((dx.b) ((dx.i.Left) iVar).b()));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEPaymentPackage bEPaymentPackage = (BEPaymentPackage) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: r42.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.d.a.V(loadPaymentsInstallmentsDataAction, bEPaymentPackage, (c.Initial) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f171762f, this.f171763g, this.f171764h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends r42.c>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r42.a.LoadPaymentsInstallmentsDataAction loadPaymentsInstallmentsDataAction = (r42.a.LoadPaymentsInstallmentsDataAction) this.f171758f;
            c0 c0Var = (c0) this.f171759g;
            Object objE = uq.b.e();
            int i15 = this.f171757e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = t.this.callActionWithLoaderUseCase;
            a aVar2 = new a(t.this, loadPaymentsInstallmentsDataAction, c0Var, null);
            this.f171758f = vq.j.a(loadPaymentsInstallmentsDataAction);
            this.f171759g = vq.j.a(c0Var);
            this.f171757e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r42.a.LoadPaymentsInstallmentsDataAction loadPaymentsInstallmentsDataAction, c0<r42.c.Initial> c0Var, tq.e<? super k10.l<? extends r42.c>> eVar) {
            d dVar = t.this.new d(eVar);
            dVar.f171758f = loadPaymentsInstallmentsDataAction;
            dVar.f171759g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr42/a$b;", "<unused var>", "Lk10/c0;", "Lr42/c$b;", "state", "Lk10/l;", "Lr42/c;", "<anonymous>", "(Lr42/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<r42.a.b, c0<r42.c.Initialized>, tq.e<? super k10.l<? extends r42.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171766f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r42.c.Initialized O(r42.c.Initialized initialized) {
            return r42.c.Initialized.b(initialized, null, 0L, null, null, false, null, null, null, 239, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f171766f;
            uq.b.e();
            if (this.f171765e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: r42.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r42.a.b bVar, c0<r42.c.Initialized> c0Var, tq.e<? super k10.l<? extends r42.c>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f171766f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lr42/a$c;", "action", "Lk10/c0;", "Lr42/c$b;", "state", "Lk10/l;", "Lr42/c;", "<anonymous>", "(Lr42/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<r42.a.InstallmentClicked, c0<r42.c.Initialized>, tq.e<? super k10.l<? extends r42.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171767e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171768f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f171769g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final r42.c.Initialized O(t tVar, r42.a.InstallmentClicked installmentClicked, r42.c.Initialized initialized) {
            return r42.c.Initialized.b(initialized, null, 0L, null, tVar.s9(initialized.d(), installmentClicked.getIndex(), installmentClicked.getCheckState()), false, null, null, null, 247, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final r42.a.InstallmentClicked installmentClicked = (r42.a.InstallmentClicked) this.f171768f;
            c0 c0Var = (c0) this.f171769g;
            uq.b.e();
            if (this.f171767e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final t tVar = t.this;
            return c0Var.b(new er.l() { // from class: r42.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.f.O(tVar, installmentClicked, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(r42.a.InstallmentClicked installmentClicked, c0<r42.c.Initialized> c0Var, tq.e<? super k10.l<? extends r42.c>> eVar) {
            f fVar = t.this.new f(eVar);
            fVar.f171768f = installmentClicked;
            fVar.f171769g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr42/a$g;", "<unused var>", "Lr42/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lr42/a$g;Lr42/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<r42.a.g, r42.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f171771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f171772f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r42.c.Initialized initialized = (r42.c.Initialized) this.f171772f;
            Object objE = uq.b.e();
            int i15 = this.f171771e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<r42.a.e> bVarY1 = t.this.Y1();
                String sourcePaymentId = initialized.getSourcePaymentId();
                x42.c cVar = x42.c.INSTALLMENTS;
                List listA9 = t.this.A9(initialized.d());
                long paymentPackageId = initialized.getPaymentPackageId();
                String institutionId = initialized.getInstitutionId();
                List<yr0.a> listC = initialized.c();
                r42.a.e.ToPaymentReminderSummary toPaymentReminderSummary = new r42.a.e.ToPaymentReminderSummary(new PaymentsReminderDestinationParams(sourcePaymentId, cVar, listA9, vq.b.f(paymentPackageId), institutionId, initialized.getInstitutionName(), listC));
                this.f171772f = vq.j.a(initialized);
                this.f171771e = 1;
                if (bVarY1.F(toPaymentReminderSummary, this) == objE) {
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
        public final Object w(r42.a.g gVar, r42.c.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar2 = t.this.new g(eVar);
            gVar2.f171772f = initialized;
            return gVar2.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, s42.b bVar, es0.d dVar, ib4.c cVar, ac4.a aVar2, PaymentsInstallmentsSetupData paymentsInstallmentsSetupData) {
        this.mapper = bVar;
        this.getPaymentPackageUseCase = dVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.setupData = paymentsInstallmentsSetupData;
        r42.c.Initial initial = new r42.c.Initial(paymentsInstallmentsSetupData.getInstallmentsPaymentData());
        this.initialState = initial;
        this.stateMachine = aVar.a(initial, new er.l() { // from class: r42.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.w9(this.f171730a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), t9(initial));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<PaymentSummary> A9(List<InstallmentWithCheck> list) {
        ArrayList<InstallmentWithCheck> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InstallmentWithCheck) obj).g()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (InstallmentWithCheck installmentWithCheck : arrayList) {
            PaymentSummary paymentSummary = new PaymentSummary(installmentWithCheck.e().getPaymentId(), installmentWithCheck.e().getDescription(), installmentWithCheck.e().getAmount(), installmentWithCheck.e().getCurrency(), x42.b.PAYMENT);
            BEPaymentReminder paymentReminder = installmentWithCheck.getPaymentReminder();
            pq.v.D(arrayList2, pq.v.s(paymentSummary, paymentReminder != null ? new PaymentSummary(paymentReminder.getId(), paymentReminder.getDescription(), paymentReminder.getAmount(), installmentWithCheck.e().getCurrency(), x42.b.REMINDER) : null));
        }
        return pq.v.e0(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<InstallmentWithCheck> s9(List<InstallmentWithCheck> list, int i15, boolean z15) {
        List<InstallmentWithCheck> list2 = list;
        ArrayList arrayList = new ArrayList(pq.v.y(list2, 10));
        int i16 = 0;
        for (Object obj : list2) {
            int i17 = i16 + 1;
            if (i16 < 0) {
                pq.v.x();
            }
            InstallmentWithCheck installmentWithCheckD = (InstallmentWithCheck) obj;
            if (i16 == i15) {
                installmentWithCheckD = InstallmentWithCheck.d(installmentWithCheckD, null, null, z15, 3, null);
            } else if (i16 > i15) {
                installmentWithCheckD = InstallmentWithCheck.d(installmentWithCheckD, null, null, false, 3, null);
            }
            arrayList.add(installmentWithCheckD);
            i16 = i17;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r42.d.a t9(r42.c state) {
        s42.b bVar = this.mapper;
        r42.a.g gVar = r42.a.g.f171684a;
        return bVar.b(new s42.b.Params(state, b9(gVar), b9(r42.a.C4363a.f171671a), new er.p() { // from class: r42.r
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return t.u9(this.f171729a, ((Integer) obj).intValue(), ((Boolean) obj2).booleanValue());
            }
        }, b9(r42.a.b.f171672a), b9(gVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(t tVar, int i15, boolean z15) {
        tVar.d9(new r42.a.InstallmentClicked(i15, z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(r42.c.class), new er.l() { // from class: r42.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.x9(this.f171726a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(r42.c.Initial.class), new er.l() { // from class: r42.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.y9(this.f171727a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(r42.c.Initialized.class), new er.l() { // from class: r42.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.z9(this.f171728a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(r42.a.C4363a.class), oVar, bVar);
        zVar.x(q0.c(r42.a.ToError.class), oVar, tVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(t tVar, k10.z zVar) {
        d dVar = tVar.new d(null);
        zVar.v(q0.c(r42.a.LoadPaymentsInstallmentsDataAction.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(t tVar, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(r42.a.b.class), oVar, eVar);
        zVar.v(q0.c(r42.a.InstallmentClicked.class), oVar, tVar.new f(null));
        zVar.x(q0.c(r42.a.g.class), oVar, tVar.new g(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<r42.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<r42.c, r42.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<r42.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public void P5(PaymentsInstallmentsSetupData data) {
        InstallmentsPaymentData installmentsPaymentData = data.getInstallmentsPaymentData();
        d9(new r42.a.LoadPaymentsInstallmentsDataAction(installmentsPaymentData.getSourcePaymentId(), installmentsPaymentData.getPaymentPackageId(), installmentsPaymentData.getInstitutionId(), installmentsPaymentData.getInstitutionName(), installmentsPaymentData.a()));
    }
}
