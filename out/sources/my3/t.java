package my3;

import by3.BlikRequiredData;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BS\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010!J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b&\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R&\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030<8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010H\u001a\b\u0012\u0004\u0012\u00020C0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020O0N8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u0010P¨\u0006R"}, d2 = {"Lmy3/t;", "Ll00/g;", "Lmy3/f;", "Lmy3/d;", "Lmy3/h;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lr44/b;", "downloadTransactionConfirmationUC", "Lxx3/a;", "downloadConfirmationLabelMapper", "Lny3/d;", "paymentResultMapper", "Lny3/c;", "paymentResultDialogMapper", "snackBarManagerStateHolder", "Lib4/c;", "genericErrorMapper", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lmy3/e;", "setupData", "<init>", "(Lyy/a;Lr44/b;Lxx3/a;Lny3/d;Lny3/c;Li70/n;Lib4/c;La14/m;Lmy3/e;)V", "state", "Lmy3/h$a;", "u9", "(Lmy3/f;)Lmy3/h$a;", "data", "Loq/i0;", "v9", "(Lmy3/e;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lr44/b;", "c", "Lxx3/a;", "d", "Lny3/d;", "e", "Lny3/c;", "f", "Li70/n;", "g", "Lib4/c;", "h", "La14/m;", "j", "Lmy3/e;", "Lmy3/f$a;", "k", "Lmy3/f$a;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lmy3/d$f;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<my3.f, my3.d> implements my3.h, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r44.b downloadTransactionConfirmationUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xx3.a downloadConfirmationLabelMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ny3.d paymentResultMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ny3.c paymentResultDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private PaymentResultSetupData setupData;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final my3.f.a initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<my3.f, my3.d> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<my3.d.f> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<my3.h.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<my3.h.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f129574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f129575b;

        /* JADX INFO: renamed from: my3.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3224a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f129576a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f129577b;

            /* JADX INFO: renamed from: my3.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3225a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f129578d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f129579e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f129580f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f129582h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f129583j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f129584k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f129585l;

                public C3225a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f129578d = obj;
                    this.f129579e |= PKIFailureInfo.systemUnavail;
                    return C3224a.this.F(null, this);
                }
            }

            public C3224a(mu.h hVar, t tVar) {
                this.f129576a = hVar;
                this.f129577b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3225a c3225a;
                if (eVar instanceof C3225a) {
                    c3225a = (C3225a) eVar;
                    int i15 = c3225a.f129579e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3225a.f129579e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3225a = new C3225a(eVar);
                    }
                } else {
                    c3225a = new C3225a(eVar);
                }
                Object obj2 = c3225a.f129578d;
                Object objE = uq.b.e();
                int i16 = c3225a.f129579e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f129576a;
                    my3.h.a aVarU9 = this.f129577b.u9((my3.f) obj);
                    c3225a.f129580f = vq.j.a(obj);
                    c3225a.f129582h = vq.j.a(c3225a);
                    c3225a.f129583j = vq.j.a(obj);
                    c3225a.f129584k = vq.j.a(hVar);
                    c3225a.f129585l = 0;
                    c3225a.f129579e = 1;
                    if (hVar.F(aVarU9, c3225a) == objE) {
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
            this.f129574a = gVar;
            this.f129575b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super my3.h.a> hVar, tq.e eVar) {
            Object objA = this.f129574a.a(new C3224a(hVar, this.f129575b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmy3/d$a;", "<unused var>", "Lmy3/f;", "state", "Loq/i0;", "<anonymous>", "(Lmy3/d$a;Lmy3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<my3.d.a, my3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129587f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object completeProcess;
            my3.f fVar = (my3.f) this.f129587f;
            Object objE = uq.b.e();
            int i15 = this.f129586e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                if (fr.t.c(fVar, my3.f.a.f129519a) || (fVar instanceof my3.f.b.a)) {
                    completeProcess = my3.d.f.a.f129506a;
                } else if (fVar instanceof my3.f.b.PaymentInProcessing) {
                    completeProcess = new my3.d.f.CompleteProcess(true);
                } else {
                    if (!(fVar instanceof my3.f.b.Success)) {
                        throw new oq.p();
                    }
                    completeProcess = new my3.d.f.CompleteProcess(false);
                }
                this.f129587f = vq.j.a(fVar);
                this.f129586e = 1;
                if (tVar.F(completeProcess, this) == objE) {
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
        public final Object w(my3.d.a aVar, my3.f fVar, tq.e<? super i0> eVar) {
            b bVar = t.this.new b(eVar);
            bVar.f129587f = fVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmy3/d$e;", "action", "Lmy3/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmy3/d$e;Lmy3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<my3.d.HandleGenericError, my3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129590f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(t tVar, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                    tVar.d9(my3.d.c.f129503a);
                } else {
                    if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                        throw new oq.p();
                    }
                    tVar.d9(my3.d.a.f129501a);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            my3.d.HandleGenericError handleGenericError = (my3.d.HandleGenericError) this.f129590f;
            Object objE = uq.b.e();
            int i15 = this.f129589e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<my3.d.f> bVarY1 = t.this.Y1();
                ib4.c cVar = t.this.genericErrorMapper;
                dx.b domainError = handleGenericError.getDomainError();
                final t tVar = t.this;
                my3.d.f.HandleGenericError handleGenericError2 = new my3.d.f.HandleGenericError(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: my3.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.c.O(tVar, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f129590f = vq.j.a(handleGenericError);
                this.f129589e = 1;
                if (bVarY1.F(handleGenericError2, this) == objE) {
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
        public final Object w(my3.d.HandleGenericError handleGenericError, my3.f fVar, tq.e<? super i0> eVar) {
            c cVar = t.this.new c(eVar);
            cVar.f129590f = handleGenericError;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmy3/d$h;", "<unused var>", "Lmy3/f;", "Loq/i0;", "<anonymous>", "(Lmy3/d$h;Lmy3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<my3.d.h, my3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129592e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f129592e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(my3.d.h hVar, my3.f fVar, tq.e<? super i0> eVar) {
            return t.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmy3/d$j;", "action", "Lmy3/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmy3/d$j;Lmy3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<my3.d.ShowSnackBarNoIcon, my3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129595f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            my3.d.ShowSnackBarNoIcon showSnackBarNoIcon = (my3.d.ShowSnackBarNoIcon) this.f129595f;
            uq.b.e();
            if (this.f129594e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.y(new p50.a.Default(showSnackBarNoIcon.getMessageLabel(), false, null, 6, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(my3.d.ShowSnackBarNoIcon showSnackBarNoIcon, my3.f fVar, tq.e<? super i0> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f129595f = showSnackBarNoIcon;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmy3/d$k;", "action", "Lmy3/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmy3/d$k;Lmy3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<my3.d.ShowSnackBarWithCloseIcon, my3.f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129597e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129598f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            my3.d.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon = (my3.d.ShowSnackBarWithCloseIcon) this.f129598f;
            uq.b.e();
            if (this.f129597e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.y(new p50.a.DefaultWithIcon(showSnackBarWithCloseIcon.getMessageLabel(), false, null, null, 14, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(my3.d.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon, my3.f fVar, tq.e<? super i0> eVar) {
            f fVar2 = t.this.new f(eVar);
            fVar2.f129598f = showSnackBarWithCloseIcon;
            return fVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmy3/d$i;", "action", "Lk10/c0;", "Lmy3/f$a;", "state", "Lk10/l;", "Lmy3/f;", "<anonymous>", "(Lmy3/d$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<my3.d.Setup, c0<my3.f.a>, tq.e<? super k10.l<? extends my3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f129602g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final my3.f.b O(my3.d.Setup setup, my3.f.a aVar) {
            return setup.getPaymentResultState();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final my3.d.Setup setup = (my3.d.Setup) this.f129601f;
            c0 c0Var = (c0) this.f129602g;
            uq.b.e();
            if (this.f129600e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: my3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.O(setup, (f.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(my3.d.Setup setup, c0<my3.f.a> c0Var, tq.e<? super k10.l<? extends my3.f>> eVar) {
            g gVar = new g(eVar);
            gVar.f129601f = setup;
            gVar.f129602g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmy3/d$b;", "<unused var>", "Lk10/c0;", "Lmy3/f$b$c;", "state", "Lk10/l;", "Lmy3/f;", "<anonymous>", "(Lmy3/d$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<my3.d.b, c0<my3.f.b.Success>, tq.e<? super k10.l<? extends my3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129603e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129604f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f129605g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f129606h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f129607j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f129608k;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f129610a;

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
                f129610a = iArr;
            }
        }

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e6, code lost:
        
            if (r4.F(r6, r10) == r1) goto L35;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: my3.t.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(my3.d.b bVar, c0<my3.f.b.Success> c0Var, tq.e<? super k10.l<? extends my3.f>> eVar) {
            h hVar = t.this.new h(eVar);
            hVar.f129608k = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmy3/d$d;", "<unused var>", "Lmy3/f$b$c;", "Loq/i0;", "<anonymous>", "(Lmy3/d$d;Lmy3/f$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<my3.d.C3217d, my3.f.b.Success, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129611e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f129611e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = t.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            t tVar = t.this;
            if (iVarA instanceof dx.i.Left) {
                tVar.d9(new my3.d.ShowSnackBarWithCloseIcon(tVar.downloadConfirmationLabelMapper.a()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(my3.d.C3217d c3217d, my3.f.b.Success success, tq.e<? super i0> eVar) {
            return t.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmy3/d$c;", "<unused var>", "Lmy3/f$b$c;", "Loq/i0;", "<anonymous>", "(Lmy3/d$c;Lmy3/f$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<my3.d.c, my3.f.b.Success, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129613e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f129613e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(my3.d.b.f129502a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(my3.d.c cVar, my3.f.b.Success success, tq.e<? super i0> eVar) {
            return t.this.new j(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmy3/d$g;", "<unused var>", "Lmy3/f$b$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lmy3/d$g;Lmy3/f$b$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<my3.d.g, my3.f.b.a.Alias, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129615e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129616f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            my3.f.b.a.Alias alias = (my3.f.b.a.Alias) this.f129616f;
            Object objE = uq.b.e();
            int i15 = this.f129615e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<my3.d.f> bVarY1 = t.this.Y1();
                List<String> listF = alias.f();
                Long paymentPackageId = alias.getPaymentPackageId();
                my3.d.f.GoToBlikPayment goToBlikPayment = new my3.d.f.GoToBlikPayment(new BlikRequiredData(alias.getPaymentId(), listF, alias.getPaymentAmount().getText(), alias.getPaymentTitle().getText(), paymentPackageId));
                this.f129616f = vq.j.a(alias);
                this.f129615e = 1;
                if (bVarY1.F(goToBlikPayment, this) == objE) {
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
        public final Object w(my3.d.g gVar, my3.f.b.a.Alias alias, tq.e<? super i0> eVar) {
            k kVar = t.this.new k(eVar);
            kVar.f129616f = alias;
            return kVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, r44.b bVar, xx3.a aVar2, ny3.d dVar, ny3.c cVar, i70.n nVar, ib4.c cVar2, a14.m mVar, PaymentResultSetupData paymentResultSetupData) {
        this.downloadTransactionConfirmationUC = bVar;
        this.downloadConfirmationLabelMapper = aVar2;
        this.paymentResultMapper = dVar;
        this.paymentResultDialogMapper = cVar;
        this.snackBarManagerStateHolder = nVar;
        this.genericErrorMapper = cVar2;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.setupData = paymentResultSetupData;
        my3.f.a aVar3 = my3.f.a.f129519a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: my3.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.w9(this.f129561a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), u9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(t tVar, z zVar) {
        k kVar = tVar.new k(null);
        zVar.x(q0.c(my3.d.g.class), k10.o.CANCEL_PREVIOUS, kVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final my3.h.a u9(my3.f state) {
        return this.paymentResultMapper.b(new ny3.d.Params(state, b9(my3.d.a.f129501a), b9(my3.d.b.f129502a), b9(my3.d.h.f129513a), b9(my3.d.g.f129512a), this.setupData.getPaymentSuccessResultType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(my3.f.class), new er.l() { // from class: my3.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.x9(this.f129558a, (z) obj);
            }
        });
        vVar.c(q0.c(my3.f.a.class), new er.l() { // from class: my3.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.y9((z) obj);
            }
        });
        vVar.c(q0.c(my3.f.b.Success.class), new er.l() { // from class: my3.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.z9(this.f129559a, (z) obj);
            }
        });
        vVar.c(q0.c(my3.f.b.a.Alias.class), new er.l() { // from class: my3.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.A9(this.f129560a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(t tVar, z zVar) {
        b bVar = tVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(my3.d.a.class), oVar, bVar);
        zVar.x(q0.c(my3.d.HandleGenericError.class), oVar, tVar.new c(null));
        zVar.x(q0.c(my3.d.h.class), oVar, tVar.new d(null));
        zVar.x(q0.c(my3.d.ShowSnackBarNoIcon.class), oVar, tVar.new e(null));
        zVar.x(q0.c(my3.d.ShowSnackBarWithCloseIcon.class), oVar, tVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(z zVar) {
        g gVar = new g(null);
        zVar.v(q0.c(my3.d.Setup.class), k10.o.CANCEL_PREVIOUS, gVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(t tVar, z zVar) {
        h hVar = tVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(my3.d.b.class), oVar, hVar);
        zVar.x(q0.c(my3.d.C3217d.class), oVar, tVar.new i(null));
        zVar.x(q0.c(my3.d.c.class), oVar, tVar.new j(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<my3.d.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<my3.f, my3.d> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<my3.h.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(my3.d.f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public void P5(PaymentResultSetupData data) {
        this.setupData = data;
        d9(new my3.d.Setup(data.getResult()));
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
