package w11;

import fr.q0;
import j30.ButtonTextData;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import s11.CertificateRevokeConfirmationData;
import th0.RevokeUserCertificateMobileApiResponse;
import th0.UserCertificateMobileApi;
import vw.NavigationDialogModel;
import z11.CertificateData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Ba\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R \u0010E\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR&\u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030F8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P¨\u0006Q"}, d2 = {"Lw11/q;", "Ll00/g;", "Lw11/b;", "Lw11/a;", "Lw11/c;", "", "Lyy/a;", "stateMachineFactory", "Lac4/a;", "callActionWithLoaderUseCase", "Lwz3/i;", "revokeUserCertificateWithChallengeUC", "Ly11/b;", "certificateDetailsMapper", "Lv64/f;", "clearSessionDataUC", "Lo11/b;", "notificationsInteractor", "Ly11/c;", "revokeConfirmationMapper", "Lib4/c;", "errorMapper", "Lmx/c;", "labelProvider", "Lhb4/d;", "errorVMSFactory", "Lo11/a;", "certificatesContainersInteractor", "<init>", "(Lyy/a;Lac4/a;Lwz3/i;Ly11/b;Lv64/f;Lo11/b;Ly11/c;Lib4/c;Lmx/c;Lhb4/d;Lo11/a;)V", "state", "Lw11/c$a;", "y9", "(Lw11/b;)Lw11/c$a;", "Lz11/a;", "certificate", "Lvw/a;", "A9", "(Lz11/a;)Lvw/a;", "Lth0/t;", "Loq/i0;", "D9", "(Lth0/t;)V", "b", "Lac4/a;", "c", "Lwz3/i;", "d", "Ly11/b;", "e", "Lv64/f;", "f", "Lo11/b;", "g", "Ly11/c;", "h", "Lib4/c;", "j", "Lmx/c;", "k", "Lhb4/d;", "l", "Lo11/a;", "Lxw/b;", "Lw11/a$e;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "n", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<w11.b, w11.a> implements w11.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final wz3.i revokeUserCertificateWithChallengeUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y11.b certificateDetailsMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v64.f clearSessionDataUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o11.b notificationsInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final y11.c revokeConfirmationMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final o11.a certificatesContainersInteractor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final k10.t<w11.b, w11.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<w11.a.e> navAction = new xw.b<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final p0<w11.c.a> state = a9(new a(e9().getState(), this), w11.c.a.b.f209196a);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<w11.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f209223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f209224b;

        /* JADX INFO: renamed from: w11.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5507a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f209225a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f209226b;

            /* JADX INFO: renamed from: w11.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5508a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f209227d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f209228e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f209229f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f209231h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f209232j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f209233k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f209234l;

                public C5508a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f209227d = obj;
                    this.f209228e |= PKIFailureInfo.systemUnavail;
                    return C5507a.this.F(null, this);
                }
            }

            public C5507a(mu.h hVar, q qVar) {
                this.f209225a = hVar;
                this.f209226b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5508a c5508a;
                if (eVar instanceof C5508a) {
                    c5508a = (C5508a) eVar;
                    int i15 = c5508a.f209228e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5508a.f209228e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5508a = new C5508a(eVar);
                    }
                } else {
                    c5508a = new C5508a(eVar);
                }
                Object obj2 = c5508a.f209227d;
                Object objE = uq.b.e();
                int i16 = c5508a.f209228e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f209225a;
                    w11.c.a aVarY9 = this.f209226b.y9((w11.b) obj);
                    c5508a.f209229f = vq.j.a(obj);
                    c5508a.f209231h = vq.j.a(c5508a);
                    c5508a.f209232j = vq.j.a(obj);
                    c5508a.f209233k = vq.j.a(hVar);
                    c5508a.f209234l = 0;
                    c5508a.f209228e = 1;
                    if (hVar.F(aVarY9, c5508a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f209223a = gVar;
            this.f209224b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super w11.c.a> hVar, tq.e eVar) {
            Object objA = this.f209223a.a(new C5507a(hVar, this.f209224b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw11/a$h;", "action", "Lk10/c0;", "Lw11/b$a;", "state", "Lk10/l;", "Lw11/b;", "<anonymous>", "(Lw11/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<w11.a.SetupCertData, c0<w11.b.a>, tq.e<? super k10.l<? extends w11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f209236f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f209237g;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w11.b.InterfaceC5503b.Displaying O(w11.a.SetupCertData setupCertData, w11.b.a aVar) {
            return new w11.b.InterfaceC5503b.Displaying(setupCertData.getCertificate());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final w11.a.SetupCertData setupCertData = (w11.a.SetupCertData) this.f209236f;
            c0 c0Var = (c0) this.f209237g;
            uq.b.e();
            if (this.f209235e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: w11.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.b.O(setupCertData, (b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w11.a.SetupCertData setupCertData, c0<w11.b.a> c0Var, tq.e<? super k10.l<? extends w11.b>> eVar) {
            b bVar = new b(eVar);
            bVar.f209236f = setupCertData;
            bVar.f209237g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw11/a$a;", "<unused var>", "Lw11/b$b;", "Loq/i0;", "<anonymous>", "(Lw11/a$a;Lw11/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<w11.a.C5500a, w11.b.InterfaceC5503b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209238e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f209238e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<w11.a.e> bVarY1 = q.this.Y1();
                w11.a.e.C5501a c5501a = w11.a.e.C5501a.f209176a;
                this.f209238e = 1;
                if (bVarY1.F(c5501a, this) == objE) {
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
        public final Object w(w11.a.C5500a c5500a, w11.b.InterfaceC5503b interfaceC5503b, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw11/a$b;", "<unused var>", "Lw11/b$b;", "Loq/i0;", "<anonymous>", "(Lw11/a$b;Lw11/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<w11.a.b, w11.b.InterfaceC5503b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209240e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f209240e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<w11.a.e> bVarY1 = q.this.Y1();
                w11.a.e.GoBackAndRefresh goBackAndRefresh = new w11.a.e.GoBackAndRefresh(s11.d.a.f177428a);
                this.f209240e = 1;
                if (bVarY1.F(goBackAndRefresh, this) == objE) {
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
        public final Object w(w11.a.b bVar, w11.b.InterfaceC5503b interfaceC5503b, tq.e<? super i0> eVar) {
            return q.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lw11/a$c;", "<unused var>", "Lw11/b$b;", "Loq/i0;", "<anonymous>", "(Lw11/a$c;Lw11/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<w11.a.c, w11.b.InterfaceC5503b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209242e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f209242e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<w11.a.e> bVarY1 = q.this.Y1();
                w11.a.e.d dVar = w11.a.e.d.f209180a;
                this.f209242e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(w11.a.c cVar, w11.b.InterfaceC5503b interfaceC5503b, tq.e<? super i0> eVar) {
            return q.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw11/a$g;", "action", "Lk10/c0;", "Lw11/b$b;", "state", "Lk10/l;", "Lw11/b;", "<anonymous>", "(Lw11/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<w11.a.RevokeCertificate, c0<w11.b.InterfaceC5503b>, tq.e<? super k10.l<? extends w11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209244e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f209245f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f209246g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w11.b.InterfaceC5503b.CertificateRevocation O(c0 c0Var, w11.a.RevokeCertificate revokeCertificate, w11.b.InterfaceC5503b interfaceC5503b) {
            return new w11.b.InterfaceC5503b.CertificateRevocation(revokeCertificate.getSelectedCertificate(), ((w11.b.InterfaceC5503b) c0Var.a()).getCertificate());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final w11.a.RevokeCertificate revokeCertificate = (w11.a.RevokeCertificate) this.f209245f;
            final c0 c0Var = (c0) this.f209246g;
            uq.b.e();
            if (this.f209244e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: w11.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O(c0Var, revokeCertificate, (b.InterfaceC5503b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w11.a.RevokeCertificate revokeCertificate, c0<w11.b.InterfaceC5503b> c0Var, tq.e<? super k10.l<? extends w11.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f209245f = revokeCertificate;
            fVar.f209246g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw11/a$i;", "action", "Lw11/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lw11/a$i;Lw11/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<w11.a.ShowConfirmationDialog, w11.b.InterfaceC5503b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209247e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f209248f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            w11.a.ShowConfirmationDialog showConfirmationDialog = (w11.a.ShowConfirmationDialog) this.f209248f;
            Object objE = uq.b.e();
            int i15 = this.f209247e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<w11.a.e> bVarY1 = q.this.Y1();
                w11.a.e.ShowNavigationDialog showNavigationDialog = new w11.a.e.ShowNavigationDialog(q.this.A9(showConfirmationDialog.getSelectedCertificate()));
                this.f209248f = vq.j.a(showConfirmationDialog);
                this.f209247e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
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
        public final Object w(w11.a.ShowConfirmationDialog showConfirmationDialog, w11.b.InterfaceC5503b interfaceC5503b, tq.e<? super i0> eVar) {
            g gVar = q.this.new g(eVar);
            gVar.f209248f = showConfirmationDialog;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lw11/b$b$a;", "state", "Lk10/l;", "Lw11/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<c0<w11.b.InterfaceC5503b.CertificateRevocation>, tq.e<? super k10.l<? extends w11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209250e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f209251f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lw11/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends w11.b>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f209253e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f209254f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f209255g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f209256h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f209257j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f209258k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f209259l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f209260m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ q f209261n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ c0<w11.b.InterfaceC5503b.CertificateRevocation> f209262p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(q qVar, c0<w11.b.InterfaceC5503b.CertificateRevocation> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f209261n = qVar;
                this.f209262p = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final w11.b.InterfaceC5503b.Error X(c0 c0Var, final q qVar, dx.b bVar, final w11.b.InterfaceC5503b.CertificateRevocation certificateRevocation) {
                return new w11.b.InterfaceC5503b.Error(qVar.errorVMSFactory.a(qVar.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: w11.u
                    @Override // er.l
                    public final Object b(Object obj) {
                        return q.h.a.Y(qVar, certificateRevocation, (ib4.c.b) obj);
                    }
                }, 2, null))), ((w11.b.InterfaceC5503b.CertificateRevocation) c0Var.a()).getCertificate());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final i0 Y(q qVar, w11.b.InterfaceC5503b.CertificateRevocation certificateRevocation, ib4.c.b bVar) {
                if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    qVar.d9(new w11.a.RevokeCertificate(certificateRevocation.getSelectedCertificate()));
                } else {
                    qVar.d9(w11.a.C5500a.f209171a);
                }
                return i0.f148189a;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0134  */
            /* JADX WARN: Code duplicated, block: B:34:0x0153  */
            /* JADX WARN: Code duplicated, block: B:38:0x0176  */
            /* JADX WARN: Code duplicated, block: B:42:0x019e  */
            /* JADX WARN: Code duplicated, block: B:44:0x01c5  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                final q qVar;
                int i15;
                c0<w11.b.InterfaceC5503b.CertificateRevocation> c0Var;
                RevokeUserCertificateMobileApiResponse revokeUserCertificateMobileApiResponse;
                q qVar2;
                int i16;
                w11.a.GoToRevokeConfirmation goToRevokeConfirmation;
                o11.b bVar;
                c0<w11.b.InterfaceC5503b.CertificateRevocation> c0Var2;
                q qVar3;
                dx.i iVar2;
                int i17;
                o11.a aVar;
                c0<w11.b.InterfaceC5503b.CertificateRevocation> c0Var3;
                int i18;
                RevokeUserCertificateMobileApiResponse revokeUserCertificateMobileApiResponse2;
                int i19;
                q qVar4;
                v64.f fVar;
                gz.b.a.C1792a c1792a;
                q qVar5;
                c0<w11.b.InterfaceC5503b.CertificateRevocation> c0Var4;
                Object objE = uq.b.e();
                int i25 = this.f209260m;
                if (i25 == 0) {
                    oq.u.b(obj);
                    wz3.i iVar3 = this.f209261n.revokeUserCertificateWithChallengeUC;
                    wz3.i.Params params = new wz3.i.Params(this.f209262p.a().getSelectedCertificate().getSerialNumber());
                    this.f209260m = 1;
                    obj = iVar3.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i25 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i25 == 2) {
                        i16 = this.f209259l;
                        int i26 = this.f209258k;
                        q qVar6 = (q) this.f209257j;
                        RevokeUserCertificateMobileApiResponse revokeUserCertificateMobileApiResponse3 = (RevokeUserCertificateMobileApiResponse) this.f209256h;
                        c0<w11.b.InterfaceC5503b.CertificateRevocation> c0Var5 = (c0) this.f209255g;
                        qVar = (q) this.f209254f;
                        iVar = (dx.i) this.f209253e;
                        oq.u.b(obj);
                        i15 = i26;
                        qVar2 = qVar6;
                        revokeUserCertificateMobileApiResponse = revokeUserCertificateMobileApiResponse3;
                        c0Var = c0Var5;
                        if (((Boolean) obj).booleanValue()) {
                            bVar = qVar.notificationsInteractor;
                            this.f209253e = vq.j.a(iVar);
                            this.f209254f = qVar;
                            this.f209255g = c0Var;
                            this.f209256h = revokeUserCertificateMobileApiResponse;
                            this.f209257j = qVar2;
                            this.f209258k = i15;
                            this.f209259l = i16;
                            this.f209260m = 3;
                            if (bVar.a(this) != objE) {
                                c0Var2 = c0Var;
                                qVar3 = qVar;
                                iVar2 = iVar;
                                i17 = i15;
                                aVar = qVar3.certificatesContainersInteractor;
                                this.f209253e = vq.j.a(iVar2);
                                this.f209254f = qVar3;
                                this.f209255g = c0Var2;
                                this.f209256h = revokeUserCertificateMobileApiResponse;
                                this.f209257j = qVar2;
                                this.f209258k = i17;
                                this.f209259l = i16;
                                this.f209260m = 4;
                                if (aVar.e(this) != objE) {
                                    RevokeUserCertificateMobileApiResponse revokeUserCertificateMobileApiResponse4 = revokeUserCertificateMobileApiResponse;
                                    c0Var3 = c0Var2;
                                    i18 = i16;
                                    revokeUserCertificateMobileApiResponse2 = revokeUserCertificateMobileApiResponse4;
                                    i19 = i17;
                                    qVar4 = qVar2;
                                    fVar = qVar3.clearSessionDataUC;
                                    c1792a = gz.b.a.C1792a.f78542a;
                                    this.f209253e = vq.j.a(iVar2);
                                    this.f209254f = c0Var3;
                                    this.f209255g = revokeUserCertificateMobileApiResponse2;
                                    this.f209256h = qVar4;
                                    this.f209257j = null;
                                    this.f209258k = i19;
                                    this.f209259l = i18;
                                    this.f209260m = 5;
                                    if (fVar.c(c1792a, this) != objE) {
                                        qVar5 = qVar4;
                                        c0Var4 = c0Var3;
                                    }
                                }
                            }
                            return objE;
                        }
                        goToRevokeConfirmation = new w11.a.GoToRevokeConfirmation(new CertificateRevokeConfirmationData(c0Var.a().getSelectedCertificate().getDocumentTypeName(), revokeUserCertificateMobileApiResponse.getRevokeDate(), revokeUserCertificateMobileApiResponse.getReason()), w11.a.b.f209172a);
                        qVar2.d9(goToRevokeConfirmation);
                        return c0Var.c();
                    }
                    if (i25 == 3) {
                        i16 = this.f209259l;
                        i17 = this.f209258k;
                        qVar2 = (q) this.f209257j;
                        revokeUserCertificateMobileApiResponse = (RevokeUserCertificateMobileApiResponse) this.f209256h;
                        c0<w11.b.InterfaceC5503b.CertificateRevocation> c0Var6 = (c0) this.f209255g;
                        q qVar7 = (q) this.f209254f;
                        dx.i iVar4 = (dx.i) this.f209253e;
                        oq.u.b(obj);
                        c0Var2 = c0Var6;
                        qVar3 = qVar7;
                        iVar2 = iVar4;
                        aVar = qVar3.certificatesContainersInteractor;
                        this.f209253e = vq.j.a(iVar2);
                        this.f209254f = qVar3;
                        this.f209255g = c0Var2;
                        this.f209256h = revokeUserCertificateMobileApiResponse;
                        this.f209257j = qVar2;
                        this.f209258k = i17;
                        this.f209259l = i16;
                        this.f209260m = 4;
                        if (aVar.e(this) != objE) {
                            RevokeUserCertificateMobileApiResponse revokeUserCertificateMobileApiResponse5 = revokeUserCertificateMobileApiResponse;
                            c0Var3 = c0Var2;
                            i18 = i16;
                            revokeUserCertificateMobileApiResponse2 = revokeUserCertificateMobileApiResponse5;
                            i19 = i17;
                            qVar4 = qVar2;
                            fVar = qVar3.clearSessionDataUC;
                            c1792a = gz.b.a.C1792a.f78542a;
                            this.f209253e = vq.j.a(iVar2);
                            this.f209254f = c0Var3;
                            this.f209255g = revokeUserCertificateMobileApiResponse2;
                            this.f209256h = qVar4;
                            this.f209257j = null;
                            this.f209258k = i19;
                            this.f209259l = i18;
                            this.f209260m = 5;
                            if (fVar.c(c1792a, this) != objE) {
                                qVar5 = qVar4;
                                c0Var4 = c0Var3;
                            }
                        }
                        return objE;
                    }
                    if (i25 == 4) {
                        int i27 = this.f209259l;
                        i19 = this.f209258k;
                        qVar4 = (q) this.f209257j;
                        RevokeUserCertificateMobileApiResponse revokeUserCertificateMobileApiResponse6 = (RevokeUserCertificateMobileApiResponse) this.f209256h;
                        c0Var3 = (c0) this.f209255g;
                        qVar3 = (q) this.f209254f;
                        iVar2 = (dx.i) this.f209253e;
                        oq.u.b(obj);
                        i18 = i27;
                        revokeUserCertificateMobileApiResponse2 = revokeUserCertificateMobileApiResponse6;
                        fVar = qVar3.clearSessionDataUC;
                        c1792a = gz.b.a.C1792a.f78542a;
                        this.f209253e = vq.j.a(iVar2);
                        this.f209254f = c0Var3;
                        this.f209255g = revokeUserCertificateMobileApiResponse2;
                        this.f209256h = qVar4;
                        this.f209257j = null;
                        this.f209258k = i19;
                        this.f209259l = i18;
                        this.f209260m = 5;
                        if (fVar.c(c1792a, this) != objE) {
                            qVar5 = qVar4;
                            c0Var4 = c0Var3;
                        }
                        return objE;
                    }
                    if (i25 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    qVar5 = (q) this.f209256h;
                    revokeUserCertificateMobileApiResponse2 = (RevokeUserCertificateMobileApiResponse) this.f209255g;
                    c0Var4 = (c0) this.f209254f;
                    oq.u.b(obj);
                }
                goToRevokeConfirmation = new w11.a.GoToRevokeConfirmation(new CertificateRevokeConfirmationData(c0Var4.a().getSelectedCertificate().getDocumentTypeName(), revokeUserCertificateMobileApiResponse2.getRevokeDate(), revokeUserCertificateMobileApiResponse2.getReason()), w11.a.c.f209173a);
                qVar2 = qVar5;
                c0Var = c0Var4;
                qVar2.d9(goToRevokeConfirmation);
                return c0Var.c();
                iVar = (dx.i) obj;
                final c0<w11.b.InterfaceC5503b.CertificateRevocation> c0Var7 = this.f209262p;
                qVar = this.f209261n;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var7.d(new er.l() { // from class: w11.t
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return q.h.a.X(c0Var7, qVar, bVar2, (b.InterfaceC5503b.CertificateRevocation) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                RevokeUserCertificateMobileApiResponse revokeUserCertificateMobileApiResponse7 = (RevokeUserCertificateMobileApiResponse) ((dx.i.Right) iVar).b();
                o11.a aVar2 = qVar.certificatesContainersInteractor;
                rq0.b documentType = c0Var7.a().getSelectedCertificate().getDocumentType();
                iy.b0 serialNumber = c0Var7.a().getSelectedCertificate().getSerialNumber();
                this.f209253e = vq.j.a(iVar);
                this.f209254f = qVar;
                this.f209255g = c0Var7;
                this.f209256h = revokeUserCertificateMobileApiResponse7;
                this.f209257j = qVar;
                i15 = 0;
                this.f209258k = 0;
                this.f209259l = 0;
                this.f209260m = 2;
                Object objF = aVar2.f(documentType, serialNumber, this);
                if (objF != objE) {
                    c0Var = c0Var7;
                    revokeUserCertificateMobileApiResponse = revokeUserCertificateMobileApiResponse7;
                    obj = objF;
                    qVar2 = qVar;
                    i16 = 0;
                    if (((Boolean) obj).booleanValue()) {
                        bVar = qVar.notificationsInteractor;
                        this.f209253e = vq.j.a(iVar);
                        this.f209254f = qVar;
                        this.f209255g = c0Var;
                        this.f209256h = revokeUserCertificateMobileApiResponse;
                        this.f209257j = qVar2;
                        this.f209258k = i15;
                        this.f209259l = i16;
                        this.f209260m = 3;
                        if (bVar.a(this) != objE) {
                            c0Var2 = c0Var;
                            qVar3 = qVar;
                            iVar2 = iVar;
                            i17 = i15;
                            aVar = qVar3.certificatesContainersInteractor;
                            this.f209253e = vq.j.a(iVar2);
                            this.f209254f = qVar3;
                            this.f209255g = c0Var2;
                            this.f209256h = revokeUserCertificateMobileApiResponse;
                            this.f209257j = qVar2;
                            this.f209258k = i17;
                            this.f209259l = i16;
                            this.f209260m = 4;
                            if (aVar.e(this) != objE) {
                                RevokeUserCertificateMobileApiResponse revokeUserCertificateMobileApiResponse8 = revokeUserCertificateMobileApiResponse;
                                c0Var3 = c0Var2;
                                i18 = i16;
                                revokeUserCertificateMobileApiResponse2 = revokeUserCertificateMobileApiResponse8;
                                i19 = i17;
                                qVar4 = qVar2;
                                fVar = qVar3.clearSessionDataUC;
                                c1792a = gz.b.a.C1792a.f78542a;
                                this.f209253e = vq.j.a(iVar2);
                                this.f209254f = c0Var3;
                                this.f209255g = revokeUserCertificateMobileApiResponse2;
                                this.f209256h = qVar4;
                                this.f209257j = null;
                                this.f209258k = i19;
                                this.f209259l = i18;
                                this.f209260m = 5;
                                if (fVar.c(c1792a, this) != objE) {
                                    qVar5 = qVar4;
                                    c0Var4 = c0Var3;
                                    goToRevokeConfirmation = new w11.a.GoToRevokeConfirmation(new CertificateRevokeConfirmationData(c0Var4.a().getSelectedCertificate().getDocumentTypeName(), revokeUserCertificateMobileApiResponse2.getRevokeDate(), revokeUserCertificateMobileApiResponse2.getReason()), w11.a.c.f209173a);
                                    qVar2 = qVar5;
                                    c0Var = c0Var4;
                                }
                            }
                        }
                    } else {
                        goToRevokeConfirmation = new w11.a.GoToRevokeConfirmation(new CertificateRevokeConfirmationData(c0Var.a().getSelectedCertificate().getDocumentTypeName(), revokeUserCertificateMobileApiResponse.getRevokeDate(), revokeUserCertificateMobileApiResponse.getReason()), w11.a.b.f209172a);
                    }
                    qVar2.d9(goToRevokeConfirmation);
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<i0> O(tq.e<?> eVar) {
                return new a(this.f209261n, this.f209262p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends w11.b>> eVar) {
                return ((a) O(eVar)).J(i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f209251f;
            Object objE = uq.b.e();
            int i15 = this.f209250e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = q.this.callActionWithLoaderUseCase;
            a aVar2 = new a(q.this, c0Var, null);
            this.f209251f = vq.j.a(c0Var);
            this.f209250e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<w11.b.InterfaceC5503b.CertificateRevocation> c0Var, tq.e<? super k10.l<? extends w11.b>> eVar) {
            return ((h) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            h hVar = q.this.new h(eVar);
            hVar.f209251f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lw11/a$d;", "action", "Lw11/b$b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lw11/a$d;Lw11/b$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<w11.a.GoToRevokeConfirmation, w11.b.InterfaceC5503b.CertificateRevocation, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f209264f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(q qVar, w11.a.GoToRevokeConfirmation goToRevokeConfirmation) {
            qVar.d9(goToRevokeConfirmation.getActionEvent());
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(q qVar, w11.a.GoToRevokeConfirmation goToRevokeConfirmation) {
            qVar.d9(goToRevokeConfirmation.getActionEvent());
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final w11.a.GoToRevokeConfirmation goToRevokeConfirmation = (w11.a.GoToRevokeConfirmation) this.f209264f;
            Object objE = uq.b.e();
            int i15 = this.f209263e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<w11.a.e> bVarY1 = q.this.Y1();
                y11.c cVar = q.this.revokeConfirmationMapper;
                CertificateRevokeConfirmationData certificateRevokeConfirmationData = goToRevokeConfirmation.getCertificateRevokeConfirmationData();
                final q qVar = q.this;
                er.a aVar = new er.a() { // from class: w11.v
                    @Override // er.a
                    public final Object a() {
                        return q.i.V(qVar, goToRevokeConfirmation);
                    }
                };
                final q qVar2 = q.this;
                w11.a.e.GoToConfirmation goToConfirmation = new w11.a.e.GoToConfirmation(cVar.b(new y11.c.Params(certificateRevokeConfirmationData, aVar, new er.a() { // from class: w11.w
                    @Override // er.a
                    public final Object a() {
                        return q.i.X(qVar2, goToRevokeConfirmation);
                    }
                })));
                this.f209264f = vq.j.a(goToRevokeConfirmation);
                this.f209263e = 1;
                if (bVarY1.F(goToConfirmation, this) == objE) {
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
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(w11.a.GoToRevokeConfirmation goToRevokeConfirmation, w11.b.InterfaceC5503b.CertificateRevocation certificateRevocation, tq.e<? super i0> eVar) {
            i iVar = q.this.new i(eVar);
            iVar.f209264f = goToRevokeConfirmation;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw11/a$f;", "action", "Lk10/c0;", "Lw11/b$b$c;", "state", "Lk10/l;", "Lw11/b;", "<anonymous>", "(Lw11/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<w11.a.RetryCertificateRevocation, c0<w11.b.InterfaceC5503b.Error>, tq.e<? super k10.l<? extends w11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209266e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f209267f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f209268g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w11.b.InterfaceC5503b.CertificateRevocation O(c0 c0Var, w11.a.RetryCertificateRevocation retryCertificateRevocation, w11.b.InterfaceC5503b.Error error) {
            return new w11.b.InterfaceC5503b.CertificateRevocation(retryCertificateRevocation.getSelectedCertificate(), ((w11.b.InterfaceC5503b.Error) c0Var.a()).getCertificate());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final w11.a.RetryCertificateRevocation retryCertificateRevocation = (w11.a.RetryCertificateRevocation) this.f209267f;
            final c0 c0Var = (c0) this.f209268g;
            uq.b.e();
            if (this.f209266e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: w11.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.j.O(c0Var, retryCertificateRevocation, (b.InterfaceC5503b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w11.a.RetryCertificateRevocation retryCertificateRevocation, c0<w11.b.InterfaceC5503b.Error> c0Var, tq.e<? super k10.l<? extends w11.b>> eVar) {
            j jVar = new j(eVar);
            jVar.f209267f = retryCertificateRevocation;
            jVar.f209268g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lw11/a$a;", "<unused var>", "Lk10/c0;", "Lw11/b$b$c;", "state", "Lk10/l;", "Lw11/b;", "<anonymous>", "(Lw11/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<w11.a.C5500a, c0<w11.b.InterfaceC5503b.Error>, tq.e<? super k10.l<? extends w11.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f209269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f209270f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w11.b.InterfaceC5503b.Displaying O(c0 c0Var, w11.b.InterfaceC5503b.Error error) {
            return new w11.b.InterfaceC5503b.Displaying(((w11.b.InterfaceC5503b.Error) c0Var.a()).getCertificate());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f209270f;
            uq.b.e();
            if (this.f209269e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: w11.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.k.O(c0Var, (b.InterfaceC5503b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(w11.a.C5500a c5500a, c0<w11.b.InterfaceC5503b.Error> c0Var, tq.e<? super k10.l<? extends w11.b>> eVar) {
            k kVar = new k(eVar);
            kVar.f209270f = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, ac4.a aVar2, wz3.i iVar, y11.b bVar, v64.f fVar, o11.b bVar2, y11.c cVar, ib4.c cVar2, mx.c cVar3, hb4.d dVar, o11.a aVar3) {
        this.callActionWithLoaderUseCase = aVar2;
        this.revokeUserCertificateWithChallengeUC = iVar;
        this.certificateDetailsMapper = bVar;
        this.clearSessionDataUC = fVar;
        this.notificationsInteractor = bVar2;
        this.revokeConfirmationMapper = cVar;
        this.errorMapper = cVar2;
        this.labelProvider = cVar3;
        this.errorVMSFactory = dVar;
        this.certificatesContainersInteractor = aVar3;
        this.stateMachine = aVar.a(w11.b.a.f209188a, new er.l() { // from class: w11.j
            @Override // er.l
            public final Object b(Object obj) {
                return q.E9(this.f209206a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NavigationDialogModel A9(CertificateData certificate) {
        return new NavigationDialogModel(this.labelProvider.c(m11.b.A), this.labelProvider.c(m11.b.f122500z), null, null, null, null, new ButtonTextData(null, this.labelProvider.c(m11.b.f122467f0), null, null, b9(new w11.a.RevokeCertificate(certificate)), 13, null), new ButtonTextData(null, this.labelProvider.c(m11.b.f122456a), null, null, new er.a() { // from class: w11.p
            @Override // er.a
            public final Object a() {
                return q.B9();
            }
        }, 13, null), 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(w11.b.a.class), new er.l() { // from class: w11.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.F9((k10.z) obj);
            }
        });
        vVar.c(q0.c(w11.b.InterfaceC5503b.class), new er.l() { // from class: w11.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.G9(this.f209207a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(w11.b.InterfaceC5503b.CertificateRevocation.class), new er.l() { // from class: w11.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.H9(this.f209208a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(w11.b.InterfaceC5503b.Error.class), new er.l() { // from class: w11.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.I9((k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(k10.z zVar) {
        b bVar = new b(null);
        zVar.v(q0.c(w11.a.SetupCertData.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(q qVar, k10.z zVar) {
        c cVar = qVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(w11.a.C5500a.class), oVar, cVar);
        zVar.x(q0.c(w11.a.b.class), oVar, qVar.new d(null));
        zVar.x(q0.c(w11.a.c.class), oVar, qVar.new e(null));
        zVar.v(q0.c(w11.a.RevokeCertificate.class), oVar, new f(null));
        zVar.x(q0.c(w11.a.ShowConfirmationDialog.class), oVar, qVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(q qVar, k10.z zVar) {
        zVar.A(qVar.new h(null));
        i iVar = qVar.new i(null);
        zVar.x(q0.c(w11.a.GoToRevokeConfirmation.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I9(k10.z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(w11.a.RetryCertificateRevocation.class), oVar, jVar);
        zVar.v(q0.c(w11.a.C5500a.class), oVar, new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w11.c.a y9(w11.b state) {
        return this.certificateDetailsMapper.b(new y11.b.Params(state, new er.l() { // from class: w11.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f209209a, (CertificateData) obj);
            }
        }, b9(w11.a.C5500a.f209171a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, CertificateData certificateData) {
        qVar.d9(new w11.a.ShowConfirmationDialog(certificateData));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(w11.c.a aVar) {
        super.P5(aVar);
    }

    public void D9(UserCertificateMobileApi certificate) {
        d9(new w11.a.SetupCertData(certificate));
    }

    @Override // zx.b
    public xw.b<w11.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<w11.b, w11.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<w11.c.a> getState() {
        return this.state;
    }
}
