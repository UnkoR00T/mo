package v42;

import fr.q0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p024c42.e3;
import p071kotlin.Metadata;
import qx3.MakePaymentInitialData;
import u42.MakePaymentsNavParams;
import x42.PaymentSummary;
import x42.PaymentsReminderDestinationParams;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lv42/s;", "Ll00/g;", "Lv42/c;", "Lv42/a;", "Lv42/d;", "", "Lyy/a;", "stateMachineFactory", "Lw42/a;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lv42/b;", "setupData", "<init>", "(Lyy/a;Lw42/a;Lib4/c;Lv42/b;)V", "state", "Lv42/d$a;", "n9", "(Lv42/c;)Lv42/d$a;", "data", "Loq/i0;", "o9", "(Lv42/b;)V", "b", "Lw42/a;", "c", "Lib4/c;", "d", "Lv42/b;", "Lv42/c$a;", "e", "Lv42/c$a;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lv42/a$d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<v42.c, v42.a> implements v42.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w42.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private PaymentsReminderSetupData setupData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v42.c.a initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<v42.c, v42.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v42.a.d> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<v42.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<v42.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f203903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f203904b;

        /* JADX INFO: renamed from: v42.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5311a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f203905a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f203906b;

            /* JADX INFO: renamed from: v42.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5312a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f203907d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f203908e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f203909f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f203911h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f203912j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f203913k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f203914l;

                public C5312a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f203907d = obj;
                    this.f203908e |= PKIFailureInfo.systemUnavail;
                    return C5311a.this.F(null, this);
                }
            }

            public C5311a(mu.h hVar, s sVar) {
                this.f203905a = hVar;
                this.f203906b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5312a c5312a;
                if (eVar instanceof C5312a) {
                    c5312a = (C5312a) eVar;
                    int i15 = c5312a.f203908e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5312a.f203908e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5312a = new C5312a(eVar);
                    }
                } else {
                    c5312a = new C5312a(eVar);
                }
                Object obj2 = c5312a.f203907d;
                Object objE = uq.b.e();
                int i16 = c5312a.f203908e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f203905a;
                    v42.d.a aVarN9 = this.f203906b.n9((v42.c) obj);
                    c5312a.f203909f = vq.j.a(obj);
                    c5312a.f203911h = vq.j.a(c5312a);
                    c5312a.f203912j = vq.j.a(obj);
                    c5312a.f203913k = vq.j.a(hVar);
                    c5312a.f203914l = 0;
                    c5312a.f203908e = 1;
                    if (hVar.F(aVarN9, c5312a) == objE) {
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

        public a(mu.g gVar, s sVar) {
            this.f203903a = gVar;
            this.f203904b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super v42.d.a> hVar, tq.e eVar) {
            Object objA = this.f203903a.a(new C5311a(hVar, this.f203904b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv42/a$a;", "<unused var>", "Lv42/c;", "Loq/i0;", "<anonymous>", "(Lv42/a$a;Lv42/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<v42.a.C5308a, v42.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203915e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f203915e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v42.a.d> bVarY1 = s.this.Y1();
                v42.a.d.C5309a c5309a = v42.a.d.C5309a.f203853a;
                this.f203915e = 1;
                if (bVarY1.F(c5309a, this) == objE) {
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
        public final Object w(v42.a.C5308a c5308a, v42.c cVar, tq.e<? super i0> eVar) {
            return s.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv42/a$b;", "action", "Lv42/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv42/a$b;Lv42/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<v42.a.Error, v42.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203918f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(s sVar, v42.a.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    sVar.d9(v42.a.C5308a.f203849a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    sVar.d9(error.getRetryAction());
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v42.a.Error error = (v42.a.Error) this.f203918f;
            Object objE = uq.b.e();
            int i15 = this.f203917e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v42.a.d> bVarY1 = s.this.Y1();
                ib4.c cVar = s.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final s sVar = s.this;
                v42.a.d.Error error2 = new v42.a.d.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: v42.t
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.c.O(sVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f203918f = vq.j.a(error);
                this.f203917e = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        public final Object w(v42.a.Error error, v42.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = s.this.new c(eVar);
            cVar2.f203918f = error;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv42/a$e;", "action", "Lk10/c0;", "Lv42/c$a;", "state", "Lk10/l;", "Lv42/c;", "<anonymous>", "(Lv42/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<v42.a.Setup, c0<v42.c.a>, tq.e<? super k10.l<? extends v42.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f203922g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t15, T t16) {
                return sq.a.e(Integer.valueOf(((PaymentSummary) t15).getType().getListOrder()), Integer.valueOf(((PaymentSummary) t16).getType().getListOrder()));
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v42.c.Initialized O(PaymentsReminderDestinationParams paymentsReminderDestinationParams, v42.c.a aVar) {
            return new v42.c.Initialized(paymentsReminderDestinationParams.getSourcePaymentId(), paymentsReminderDestinationParams.getPaymentPackageId(), pq.v.U0(paymentsReminderDestinationParams.f(), new a()), paymentsReminderDestinationParams.getInstitutionId(), paymentsReminderDestinationParams.a(), paymentsReminderDestinationParams.getInstitutionName(), paymentsReminderDestinationParams.getOrigin() == x42.c.DETAILS);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v42.a.Setup setup = (v42.a.Setup) this.f203921f;
            c0 c0Var = (c0) this.f203922g;
            uq.b.e();
            if (this.f203920e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final PaymentsReminderDestinationParams destinationParams = setup.getDestinationParams();
            return c0Var.d(new er.l() { // from class: v42.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.d.O(destinationParams, (c.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v42.a.Setup setup, c0<v42.c.a> c0Var, tq.e<? super k10.l<? extends v42.c>> eVar) {
            d dVar = new d(eVar);
            dVar.f203921f = setup;
            dVar.f203922g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv42/a$c;", "<unused var>", "Lk10/c0;", "Lv42/c$b;", "state", "Lk10/l;", "Lv42/c;", "<anonymous>", "(Lv42/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<v42.a.c, c0<v42.c.Initialized>, tq.e<? super k10.l<? extends v42.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203923e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203924f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v42.c.Initialized O(v42.c.Initialized initialized) {
            return v42.c.Initialized.b(initialized, null, null, null, null, null, null, false, 63, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f203924f;
            uq.b.e();
            if (this.f203923e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v42.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v42.a.c cVar, c0<v42.c.Initialized> c0Var, tq.e<? super k10.l<? extends v42.c>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f203924f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv42/a$f;", "<unused var>", "Lv42/c$b;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Lv42/a$f;Lv42/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<v42.a.f, v42.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f203925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f203926f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f203927g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f203928h;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v42.c.Initialized initialized = (v42.c.Initialized) this.f203928h;
            Object objE = uq.b.e();
            int i15 = this.f203927g;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v42.a.d> bVarY1 = s.this.Y1();
                List<yr0.a> listC = initialized.c();
                ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    arrayList.add(h42.a.a((yr0.a) it.next()));
                }
                String sourcePaymentId = initialized.getSourcePaymentId();
                List<PaymentSummary> listG = initialized.g();
                ArrayList arrayList2 = new ArrayList(pq.v.y(listG, 10));
                Iterator<T> it4 = listG.iterator();
                while (it4.hasNext()) {
                    arrayList2.add(((PaymentSummary) it4.next()).getId());
                }
                String title = ((PaymentSummary) pq.v.l0(initialized.g())).getTitle();
                List<PaymentSummary> listG2 = initialized.g();
                BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
                Iterator<T> it5 = listG2.iterator();
                BigDecimal bigDecimalAdd = bigDecimalValueOf;
                while (it5.hasNext()) {
                    bigDecimalAdd = bigDecimalAdd.add(((PaymentSummary) it5.next()).getAmount());
                }
                v42.a.d.ToMakePayment toMakePayment = new v42.a.d.ToMakePayment(new MakePaymentInitialData(arrayList, sourcePaymentId, arrayList2, title, bigDecimalAdd, ((PaymentSummary) pq.v.l0(initialized.g())).getCurrency(), initialized.getInstitutionId(), initialized.getInstitutionName(), initialized.getPaymentPackageId(), new MakePaymentsNavParams(e3.b.f23168a), null, 1024, null));
                this.f203928h = vq.j.a(initialized);
                this.f203925e = vq.j.a(initialized);
                this.f203926f = 0;
                this.f203927g = 1;
                if (bVarY1.F(toMakePayment, this) == objE) {
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
        public final Object w(v42.a.f fVar, v42.c.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar2 = s.this.new f(eVar);
            fVar2.f203928h = initialized;
            return fVar2.J(i0.f148189a);
        }
    }

    public s(yy.a aVar, w42.a aVar2, ib4.c cVar, PaymentsReminderSetupData paymentsReminderSetupData) {
        this.mapper = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.setupData = paymentsReminderSetupData;
        v42.c.a aVar3 = v42.c.a.f203859a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: v42.r
            @Override // er.l
            public final Object b(Object obj) {
                return s.p9(this.f203895a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), n9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v42.d.a n9(v42.c state) {
        return this.mapper.b(new w42.a.Params(state, b9(v42.a.C5308a.f203849a), b9(v42.a.c.f203852a), b9(v42.a.f.f203857a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final s sVar, k10.v vVar) {
        vVar.c(q0.c(v42.c.class), new er.l() { // from class: v42.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.q9(this.f203893a, (z) obj);
            }
        });
        vVar.c(q0.c(v42.c.a.class), new er.l() { // from class: v42.p
            @Override // er.l
            public final Object b(Object obj) {
                return s.r9((z) obj);
            }
        });
        vVar.c(q0.c(v42.c.Initialized.class), new er.l() { // from class: v42.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.s9(this.f203894a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(s sVar, z zVar) {
        b bVar = sVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(v42.a.C5308a.class), oVar, bVar);
        zVar.x(q0.c(v42.a.Error.class), oVar, sVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(z zVar) {
        d dVar = new d(null);
        zVar.v(q0.c(v42.a.Setup.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(s sVar, z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(v42.a.c.class), oVar, eVar);
        zVar.x(q0.c(v42.a.f.class), oVar, sVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<v42.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<v42.c, v42.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<v42.d.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public void P5(PaymentsReminderSetupData data) {
        this.setupData = data;
        d9(new v42.a.Setup(data.getParams()));
    }
}
