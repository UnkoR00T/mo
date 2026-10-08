package z52;

import as0.BETransactionDetailsDomain;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bk\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0001\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u001cH\u0016¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020%2\u0006\u0010)\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020%H\u0096\u0001¢\u0006\u0004\b,\u0010-R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR&\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030H8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010 \u001a\b\u0012\u0004\u0012\u00020!0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR \u0010Y\u001a\b\u0012\u0004\u0012\u00020T0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020[0Z8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010\\¨\u0006^"}, d2 = {"Lz52/p;", "Ll00/g;", "Lz52/c;", "Lz52/a;", "Lz52/d;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lz52/e;", "mapper", "Lgs0/b;", "getTransactionDetailsUseCase", "Lr44/b;", "downloadTransactionConfirmationUC", "Ld62/a;", "downloadConfirmationMapper", "snackBarManagerStateHolder", "Lmx/c;", "labelProvider", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lcb4/j;", "dialogVMSFactory", "Lz52/b;", "setupData", "<init>", "(Lyy/a;Lib4/c;Lac4/a;Lz52/e;Lgs0/b;Lr44/b;Ld62/a;Li70/n;Lmx/c;La14/m;Lcb4/j;Lz52/b;)V", "state", "Lz52/d$a;", "v9", "(Lz52/c;)Lz52/d$a;", "data", "Loq/i0;", "w9", "(Lz52/b;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lib4/c;", "c", "Lac4/a;", "d", "Lz52/e;", "e", "Lgs0/b;", "f", "Lr44/b;", "g", "Ld62/a;", "h", "Li70/n;", "j", "Lmx/c;", "k", "La14/m;", "l", "Lcb4/j;", "m", "Lz52/b;", "Lz52/c$a;", "n", "Lz52/c$a;", "initialState", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lz52/a$h;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<z52.c, z52.a> implements z52.d, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z52.e mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final gs0.b getTransactionDetailsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final r44.b downloadTransactionConfirmationUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d62.a downloadConfirmationMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private PaymentsTransactionDetailsSetupData setupData;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final z52.c.a initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<z52.c, z52.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<z52.d.a> state;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<z52.a.h> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<z52.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f233003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f233004b;

        /* JADX INFO: renamed from: z52.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6263a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f233005a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f233006b;

            /* JADX INFO: renamed from: z52.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6264a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f233007d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f233008e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f233009f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f233011h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f233012j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f233013k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f233014l;

                public C6264a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f233007d = obj;
                    this.f233008e |= PKIFailureInfo.systemUnavail;
                    return C6263a.this.F(null, this);
                }
            }

            public C6263a(mu.h hVar, p pVar) {
                this.f233005a = hVar;
                this.f233006b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6264a c6264a;
                if (eVar instanceof C6264a) {
                    c6264a = (C6264a) eVar;
                    int i15 = c6264a.f233008e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6264a.f233008e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6264a = new C6264a(eVar);
                    }
                } else {
                    c6264a = new C6264a(eVar);
                }
                Object obj2 = c6264a.f233007d;
                Object objE = uq.b.e();
                int i16 = c6264a.f233008e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f233005a;
                    z52.d.a aVarV9 = this.f233006b.v9((z52.c) obj);
                    c6264a.f233009f = vq.j.a(obj);
                    c6264a.f233011h = vq.j.a(c6264a);
                    c6264a.f233012j = vq.j.a(obj);
                    c6264a.f233013k = vq.j.a(hVar);
                    c6264a.f233014l = 0;
                    c6264a.f233008e = 1;
                    if (hVar.F(aVarV9, c6264a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f233003a = gVar;
            this.f233004b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super z52.d.a> hVar, tq.e eVar) {
            Object objA = this.f233003a.a(new C6263a(hVar, this.f233004b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz52/a$b;", "action", "Lz52/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lz52/a$b;Lz52/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<z52.a.Error, z52.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233015e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233016f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(p pVar, z52.a.Error error, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                pVar.d9(z52.a.C6260a.f232937a);
            } else if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                pVar.d9(error.getRetryAction());
            } else if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                throw new oq.p();
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final z52.a.Error error = (z52.a.Error) this.f233016f;
            Object objE = uq.b.e();
            int i15 = this.f233015e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<z52.a.h> bVarY1 = p.this.Y1();
                ib4.c cVar = p.this.genericDomainErrorMapper;
                dx.b domainError = error.getDomainError();
                final p pVar = p.this;
                z52.a.h.Error error2 = new z52.a.h.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: z52.q
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.b.O(pVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f233016f = vq.j.a(error);
                this.f233015e = 1;
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
        public final Object w(z52.a.Error error, z52.c cVar, tq.e<? super i0> eVar) {
            b bVar = p.this.new b(eVar);
            bVar.f233016f = error;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lz52/a$d;", "action", "Lk10/c0;", "Lz52/c;", "state", "Lk10/l;", "<anonymous>", "(Lz52/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<z52.a.GetTransactionDetails, c0<z52.c>, tq.e<? super k10.l<? extends z52.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f233020g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lz52/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends z52.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f233022e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f233023f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ z52.a.GetTransactionDetails f233024g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ c0<z52.c> f233025h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, z52.a.GetTransactionDetails getTransactionDetails, c0<z52.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f233023f = pVar;
                this.f233024g = getTransactionDetails;
                this.f233025h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final z52.c.Initialized V(BETransactionDetailsDomain bETransactionDetailsDomain, z52.a.GetTransactionDetails getTransactionDetails, z52.c cVar) {
                return new z52.c.Initialized(bETransactionDetailsDomain, getTransactionDetails.getPaymentId(), null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f233022e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    gs0.b bVar = this.f233023f.getTransactionDetailsUseCase;
                    gs0.b.Params params = new gs0.b.Params(this.f233024g.getPaymentId(), this.f233024g.getTransactionId());
                    this.f233022e = 1;
                    obj = bVar.c(params, this);
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
                p pVar = this.f233023f;
                final z52.a.GetTransactionDetails getTransactionDetails = this.f233024g;
                c0<z52.c> c0Var = this.f233025h;
                if (iVar instanceof dx.i.Left) {
                    pVar.d9(new z52.a.Error((dx.b) ((dx.i.Left) iVar).b(), getTransactionDetails));
                    return c0Var.c();
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BETransactionDetailsDomain bETransactionDetailsDomain = (BETransactionDetailsDomain) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: z52.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p.c.a.V(bETransactionDetailsDomain, getTransactionDetails, (c) obj2);
                    }
                });
            }

            public final tq.e<i0> N(tq.e<?> eVar) {
                return new a(this.f233023f, this.f233024g, this.f233025h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends z52.c>> eVar) {
                return ((a) N(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            z52.a.GetTransactionDetails getTransactionDetails = (z52.a.GetTransactionDetails) this.f233019f;
            c0 c0Var = (c0) this.f233020g;
            Object objE = uq.b.e();
            int i15 = this.f233018e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p.this, getTransactionDetails, c0Var, null);
            this.f233019f = vq.j.a(getTransactionDetails);
            this.f233020g = vq.j.a(c0Var);
            this.f233018e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(z52.a.GetTransactionDetails getTransactionDetails, c0<z52.c> c0Var, tq.e<? super k10.l<? extends z52.c>> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f233019f = getTransactionDetails;
            cVar.f233020g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz52/a$a;", "<unused var>", "Lz52/c;", "Loq/i0;", "<anonymous>", "(Lz52/a$a;Lz52/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<z52.a.C6260a, z52.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233026e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f233026e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<z52.a.h> bVarY1 = p.this.Y1();
                z52.a.h.C6261a c6261a = z52.a.h.C6261a.f232946a;
                this.f233026e = 1;
                if (bVarY1.F(c6261a, this) == objE) {
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
        public final Object w(z52.a.C6260a c6260a, z52.c cVar, tq.e<? super i0> eVar) {
            return p.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz52/a$j;", "action", "Lz52/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lz52/a$j;Lz52/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<z52.a.Setup, z52.c.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233029f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            z52.a.Setup setup = (z52.a.Setup) this.f233029f;
            uq.b.e();
            if (this.f233028e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.d9(new z52.a.GetTransactionDetails(setup.getTransactionDetailsNavParams().getPaymentId(), setup.getTransactionDetailsNavParams().getTransactionId()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(z52.a.Setup setup, z52.c.a aVar, tq.e<? super i0> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f233029f = setup;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz52/a$c;", "action", "Lz52/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lz52/a$c;Lz52/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<z52.a.c, z52.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233032f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f233033g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f233035e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f233036f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ z52.c.Initialized f233037g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ z52.a.c f233038h;

            /* JADX INFO: renamed from: z52.p$f$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C6265a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f233039a;

                static {
                    int[] iArr = new int[r44.b.EnumC4371b.values().length];
                    try {
                        iArr[r44.b.EnumC4371b.OK.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[r44.b.EnumC4371b.FILE_NOT_SAVED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[r44.b.EnumC4371b.NOT_PERMISSION_GRANTED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[r44.b.EnumC4371b.NOT_PERMISSION_GRANTED_GO_TO_SETTINGS.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    f233039a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, z52.c.Initialized initialized, z52.a.c cVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f233036f = pVar;
                this.f233037g = initialized;
                this.f233038h = cVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f233035e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    r44.b bVar = this.f233036f.downloadTransactionConfirmationUC;
                    r44.b.a.Transaction transaction = new r44.b.a.Transaction(this.f233037g.getPaymentId(), this.f233037g.getTransactionDetails().getTransactionId());
                    this.f233035e = 1;
                    obj = bVar.c(transaction, this);
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
                p pVar = this.f233036f;
                z52.a.c cVar = this.f233038h;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    if (fr.t.c(bVar2, dx.b.g.e.f45078a) || fr.t.c(bVar2, dx.b.g.a.f45045a)) {
                        pVar.d9(new z52.a.ShowSnackBarWithCloseIcon(pVar.downloadConfirmationMapper.c()));
                    } else {
                        pVar.d9(new z52.a.Error(bVar2, cVar));
                    }
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    r44.b.EnumC4371b enumC4371b = (r44.b.EnumC4371b) ((dx.i.Right) iVar).b();
                    int i16 = C6265a.f233039a[enumC4371b.ordinal()];
                    if (i16 == 1) {
                        pVar.d9(new z52.a.ShowSnackBarNoIcon(pVar.downloadConfirmationMapper.b(enumC4371b)));
                    } else if (i16 == 2 || i16 == 3) {
                        pVar.d9(new z52.a.ShowSnackBarWithCloseIcon(pVar.downloadConfirmationMapper.b(enumC4371b)));
                    } else {
                        if (i16 != 4) {
                            throw new oq.p();
                        }
                        pVar.d9(z52.a.i.f232948a);
                    }
                }
                return i0.f148189a;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f233036f, this.f233037g, this.f233038h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            z52.a.c cVar = (z52.a.c) this.f233032f;
            z52.c.Initialized initialized = (z52.c.Initialized) this.f233033g;
            Object objE = uq.b.e();
            int i15 = this.f233031e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = p.this.callActionWithLoaderUseCase;
                a aVar2 = new a(p.this, initialized, cVar, null);
                this.f233032f = vq.j.a(cVar);
                this.f233033g = vq.j.a(initialized);
                this.f233031e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(z52.a.c cVar, z52.c.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f233032f = cVar;
            fVar.f233033g = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz52/a$i;", "<unused var>", "Lk10/c0;", "Lz52/c$b;", "state", "Lk10/l;", "Lz52/c;", "<anonymous>", "(Lz52/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<z52.a.i, c0<z52.c.Initialized>, tq.e<? super k10.l<? extends z52.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233040e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233041f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z52.c.Initialized O(p pVar, z52.c.Initialized initialized) {
            cb4.j jVar = pVar.dialogVMSFactory;
            cb4.h.b bVar = cb4.h.b.f24985a;
            Label labelC = pVar.labelProvider.c(t32.b.f187444c2);
            Label labelC2 = pVar.labelProvider.c(t32.b.f187440b2);
            DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(pVar.labelProvider.c(t32.b.Y1), null, pVar.b9(z52.a.e.f232943a), 2, null);
            Label labelC3 = pVar.labelProvider.c(t32.b.Z1);
            z52.a.f fVar = z52.a.f.f232944a;
            return z52.c.Initialized.b(initialized, null, null, jVar.a(new DialogData(bVar, labelC, labelC2, dialogButtonTextData, new DialogButtonTextData(labelC3, null, pVar.b9(fVar), 2, null), null, pVar.b9(fVar), 32, null)), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f233041f;
            uq.b.e();
            if (this.f233040e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p pVar = p.this;
            return c0Var.b(new er.l() { // from class: z52.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.g.O(pVar, (c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(z52.a.i iVar, c0<z52.c.Initialized> c0Var, tq.e<? super k10.l<? extends z52.c>> eVar) {
            g gVar = p.this.new g(eVar);
            gVar.f233041f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz52/a$e;", "<unused var>", "Lz52/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lz52/a$e;Lz52/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<z52.a.e, z52.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233043e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f233043e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = p.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            p pVar = p.this;
            if (iVarA instanceof dx.i.Left) {
                pVar.d9(new z52.a.ShowSnackBarWithCloseIcon(pVar.downloadConfirmationMapper.a()));
            }
            p.this.d9(z52.a.f.f232944a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(z52.a.e eVar, z52.c.Initialized initialized, tq.e<? super i0> eVar2) {
            return p.this.new h(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz52/a$l;", "action", "Lz52/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lz52/a$l;Lz52/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<z52.a.ShowSnackBarWithCloseIcon, z52.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233046f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            z52.a.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon = (z52.a.ShowSnackBarWithCloseIcon) this.f233046f;
            uq.b.e();
            if (this.f233045e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.y(new p50.a.DefaultWithIcon(showSnackBarWithCloseIcon.getMessage(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(z52.a.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon, z52.c.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = p.this.new i(eVar);
            iVar.f233046f = showSnackBarWithCloseIcon;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lz52/a$k;", "action", "Lz52/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lz52/a$k;Lz52/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<z52.a.ShowSnackBarNoIcon, z52.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233049f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            z52.a.ShowSnackBarNoIcon showSnackBarNoIcon = (z52.a.ShowSnackBarNoIcon) this.f233049f;
            uq.b.e();
            if (this.f233048e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.y(new p50.a.Default(showSnackBarNoIcon.getMessage(), false, null, 6, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(z52.a.ShowSnackBarNoIcon showSnackBarNoIcon, z52.c.Initialized initialized, tq.e<? super i0> eVar) {
            j jVar = p.this.new j(eVar);
            jVar.f233049f = showSnackBarNoIcon;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lz52/a$g;", "<unused var>", "Lz52/c$b;", "Loq/i0;", "<anonymous>", "(Lz52/a$g;Lz52/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<z52.a.g, z52.c.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233051e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f233051e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(z52.a.g gVar, z52.c.Initialized initialized, tq.e<? super i0> eVar) {
            return p.this.new k(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lz52/a$f;", "<unused var>", "Lk10/c0;", "Lz52/c$b;", "state", "Lk10/l;", "Lz52/c;", "<anonymous>", "(Lz52/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<z52.a.f, c0<z52.c.Initialized>, tq.e<? super k10.l<? extends z52.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f233053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f233054f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final z52.c.Initialized O(z52.c.Initialized initialized) {
            return z52.c.Initialized.b(initialized, null, null, null, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f233054f;
            uq.b.e();
            if (this.f233053e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: z52.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.l.O((c.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(z52.a.f fVar, c0<z52.c.Initialized> c0Var, tq.e<? super k10.l<? extends z52.c>> eVar) {
            l lVar = new l(eVar);
            lVar.f233054f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ib4.c cVar, ac4.a aVar2, z52.e eVar, gs0.b bVar, r44.b bVar2, d62.a aVar3, i70.n nVar, mx.c cVar2, a14.m mVar, cb4.j jVar, PaymentsTransactionDetailsSetupData paymentsTransactionDetailsSetupData) {
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.mapper = eVar;
        this.getTransactionDetailsUseCase = bVar;
        this.downloadTransactionConfirmationUC = bVar2;
        this.downloadConfirmationMapper = aVar3;
        this.snackBarManagerStateHolder = nVar;
        this.labelProvider = cVar2;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.dialogVMSFactory = jVar;
        this.setupData = paymentsTransactionDetailsSetupData;
        z52.c.a aVar4 = z52.c.a.f232953a;
        this.initialState = aVar4;
        this.stateMachine = aVar.a(aVar4, new er.l() { // from class: z52.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.x9(this.f232987a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), v9(aVar4));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(p pVar, z zVar) {
        f fVar = pVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(z52.a.c.class), oVar, fVar);
        zVar.v(q0.c(z52.a.i.class), oVar, pVar.new g(null));
        zVar.x(q0.c(z52.a.e.class), oVar, pVar.new h(null));
        zVar.x(q0.c(z52.a.ShowSnackBarWithCloseIcon.class), oVar, pVar.new i(null));
        zVar.x(q0.c(z52.a.ShowSnackBarNoIcon.class), oVar, pVar.new j(null));
        zVar.x(q0.c(z52.a.g.class), oVar, pVar.new k(null));
        zVar.v(q0.c(z52.a.f.class), oVar, new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final z52.d.a v9(z52.c state) {
        return this.mapper.b(new z52.e.Params(state, b9(z52.a.C6260a.f232937a), b9(z52.a.c.f232940a), b9(z52.a.g.f232945a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(z52.c.class), new er.l() { // from class: z52.l
            @Override // er.l
            public final Object b(Object obj) {
                return p.y9(this.f232984a, (z) obj);
            }
        });
        vVar.c(q0.c(z52.c.a.class), new er.l() { // from class: z52.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.z9(this.f232985a, (z) obj);
            }
        });
        vVar.c(q0.c(z52.c.Initialized.class), new er.l() { // from class: z52.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.A9(this.f232986a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(z52.a.Error.class), oVar, bVar);
        zVar.v(q0.c(z52.a.GetTransactionDetails.class), oVar, pVar.new c(null));
        zVar.x(q0.c(z52.a.C6260a.class), oVar, pVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(p pVar, z zVar) {
        e eVar = pVar.new e(null);
        zVar.x(q0.c(z52.a.Setup.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<z52.a.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<z52.c, z52.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<z52.d.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public void P5(PaymentsTransactionDetailsSetupData data) {
        this.setupData = data;
        d9(new z52.a.Setup(data.getData()));
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
