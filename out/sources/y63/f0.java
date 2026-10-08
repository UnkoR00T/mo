package y63;

import fr.q0;
import java.util.Iterator;
import java.util.List;
import jb4.PayloadErrorData;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import xi0.ContactDetail;
import xi0.ContactDetailAdditionalValue;
import xi0.ContactDetails;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BK\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u0004\u0018\u00010&*\u00020!H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010+\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u001aH\u0096\u0001¢\u0006\u0004\b-\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R,\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030=8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b>\u0010?\u0012\u0004\bB\u0010.\u001a\u0004\b@\u0010AR \u0010I\u001a\b\u0012\u0004\u0012\u00020\u00180D8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0J8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bK\u0010L\u0012\u0004\bO\u0010.\u001a\u0004\bM\u0010NR\u0018\u0010S\u001a\u00020P*\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020U0T8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010V¨\u0006X"}, d2 = {"Ly63/f0;", "Ll00/g;", "Ly63/i;", "Ly63/a;", "Ly63/j;", "", "Li70/n;", "Lmx/c;", "labelProvider", "Lz63/g;", "mainContactDetailsMapper", "Lyy/a;", "stateMachineFactory", "Lfj0/g;", "getContactDetailsUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "snackBarManagerStateHolder", "Lib4/c;", "genericDomainErrorMapper", "Ly63/h;", "setupData", "<init>", "(Lmx/c;Lz63/g;Lyy/a;Lfj0/g;Lac4/a;Li70/n;Lib4/c;Ly63/h;)V", "Ly63/a$k;", "action", "Loq/i0;", "D9", "(Ly63/a$k;Ltq/e;)Ljava/lang/Object;", "state", "Ly63/j$a;", "G9", "(Ly63/i;)Ly63/j$a;", "Ldx/b;", "domainError", "Ljb4/b;", "B9", "(Ldx/b;)Ljb4/b;", "Ljb4/f;", "E9", "(Ldx/b;)Ljb4/f;", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lmx/c;", "c", "Lz63/g;", "d", "Li70/n;", "e", "Lib4/c;", "f", "Ly63/h;", "Ly63/i$a;", "g", "Ly63/i$a;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "stateMachine", "Lxw/b;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "", "F9", "(Ldx/b;)Z", "isFeatureNotAvailable", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 extends l00.g<y63.i, y63.a> implements y63.j, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z63.g mainContactDetailsMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final y63.i.a initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<y63.i, y63.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<y63.a.k> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<y63.j.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, f0.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((f0) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<y63.j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f224716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f224717b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f224718a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f0 f224719b;

            /* JADX INFO: renamed from: y63.f0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6023a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f224720d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f224721e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f224722f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f224724h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f224725j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f224726k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f224727l;

                public C6023a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f224720d = obj;
                    this.f224721e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, f0 f0Var) {
                this.f224718a = hVar;
                this.f224719b = f0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6023a c6023a;
                if (eVar instanceof C6023a) {
                    c6023a = (C6023a) eVar;
                    int i15 = c6023a.f224721e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6023a.f224721e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6023a = new C6023a(eVar);
                    }
                } else {
                    c6023a = new C6023a(eVar);
                }
                Object obj2 = c6023a.f224720d;
                Object objE = uq.b.e();
                int i16 = c6023a.f224721e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f224718a;
                    y63.j.a aVarG9 = this.f224719b.G9((y63.i) obj);
                    c6023a.f224722f = vq.j.a(obj);
                    c6023a.f224724h = vq.j.a(c6023a);
                    c6023a.f224725j = vq.j.a(obj);
                    c6023a.f224726k = vq.j.a(hVar);
                    c6023a.f224727l = 0;
                    c6023a.f224721e = 1;
                    if (hVar.F(aVarG9, c6023a) == objE) {
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

        public b(mu.g gVar, f0 f0Var) {
            this.f224716a = gVar;
            this.f224717b = f0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super y63.j.a> hVar, tq.e eVar) {
            Object objA = this.f224716a.a(new a(hVar, this.f224717b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ly63/a$i;", "action", "Lk10/c0;", "Ly63/i;", "state", "Lk10/l;", "<anonymous>", "(Ly63/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<y63.a.FetchData, k10.c0<y63.i>, tq.e<? super k10.l<? extends y63.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f224730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ ac4.a f224731h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ fj0.g f224732j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ f0 f224733k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ly63/i;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends y63.i>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f224734e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f224735f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f224736g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f224737h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f224738j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f224739k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f224740l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ fj0.g f224741m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ f0 f224742n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<y63.i> f224743p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ y63.a.FetchData f224744q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(fj0.g gVar, f0 f0Var, k10.c0<y63.i> c0Var, y63.a.FetchData fetchData, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f224741m = gVar;
                this.f224742n = f0Var;
                this.f224743p = c0Var;
                this.f224744q = fetchData;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final y63.i.NotAdult Y(PayloadErrorData payloadErrorData, f0 f0Var, y63.i iVar) {
                String title = payloadErrorData.getTitle();
                if (title == null) {
                    title = f0Var.labelProvider.c(c53.a.f23690g).getText();
                }
                return new y63.i.NotAdult(mx.b.b(title, "notAdultTitle"));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final y63.i.d Z(y63.i iVar) {
                return y63.i.d.f224786a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final y63.i.Initialized a0(ContactDetails contactDetails, y63.i iVar) {
                return new y63.i.Initialized(contactDetails);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<y63.i> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f224740l;
                if (i15 == 0) {
                    oq.u.b(obj);
                    fj0.g gVar = this.f224741m;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f224740l = 1;
                    obj = gVar.c(c1792a, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f224735f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar = (dx.i) obj;
                final f0 f0Var = this.f224742n;
                k10.c0<y63.i> c0Var2 = this.f224743p;
                y63.a.FetchData fetchData = this.f224744q;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final ContactDetails contactDetails = (ContactDetails) ((dx.i.Right) iVar).b();
                    m63.b snackBarSuccessMessage = fetchData.getSnackBarSuccessMessage();
                    if (snackBarSuccessMessage != null) {
                        f0Var.y(new p50.a.DefaultWithIcon(f0Var.labelProvider.c(snackBarSuccessMessage.getStringId()), false, null, null, 14, null));
                    }
                    return c0Var2.d(new er.l() { // from class: y63.i0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return f0.c.a.a0(contactDetails, (i) obj2);
                        }
                    });
                }
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                final PayloadErrorData payloadErrorDataE9 = f0Var.E9(bVar);
                if (fr.t.c(payloadErrorDataE9 != null ? payloadErrorDataE9.getCode() : null, "NOT_ADULT")) {
                    return c0Var2.d(new er.l() { // from class: y63.g0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return f0.c.a.Y(payloadErrorDataE9, f0Var, (i) obj2);
                        }
                    });
                }
                if (f0Var.F9(bVar)) {
                    return c0Var2.d(new er.l() { // from class: y63.h0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return f0.c.a.Z((i) obj2);
                        }
                    });
                }
                y63.a.k.Error error = new y63.a.k.Error(f0Var.B9(bVar));
                this.f224734e = vq.j.a(iVar);
                this.f224735f = c0Var2;
                this.f224736g = vq.j.a(bVar);
                this.f224737h = vq.j.a(payloadErrorDataE9);
                this.f224738j = 0;
                this.f224739k = 0;
                this.f224740l = 2;
                if (f0Var.D9(error, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f224741m, this.f224742n, this.f224743p, this.f224744q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends y63.i>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ac4.a aVar, fj0.g gVar, f0 f0Var, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f224731h = aVar;
            this.f224732j = gVar;
            this.f224733k = f0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y63.a.FetchData fetchData = (y63.a.FetchData) this.f224729f;
            k10.c0 c0Var = (k10.c0) this.f224730g;
            Object objE = uq.b.e();
            int i15 = this.f224728e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = this.f224731h;
            a aVar2 = new a(this.f224732j, this.f224733k, c0Var, fetchData, null);
            this.f224729f = vq.j.a(fetchData);
            this.f224730g = vq.j.a(c0Var);
            this.f224728e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(y63.a.FetchData fetchData, k10.c0<y63.i> c0Var, tq.e<? super k10.l<? extends y63.i>> eVar) {
            c cVar = new c(this.f224731h, this.f224732j, this.f224733k, eVar);
            cVar.f224729f = fetchData;
            cVar.f224730g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly63/a$d;", "<unused var>", "Ly63/i;", "Loq/i0;", "<anonymous>", "(Ly63/a$d;Ly63/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<y63.a.d, y63.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224745e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224745e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y63.a.k> bVarY1 = f0.this.Y1();
                y63.a.k.b bVar = y63.a.k.b.f224683a;
                this.f224745e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(y63.a.d dVar, y63.i iVar, tq.e<? super oq.i0> eVar) {
            return f0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly63/a$j;", "<unused var>", "Ly63/i;", "Loq/i0;", "<anonymous>", "(Ly63/a$j;Ly63/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<y63.a.j, y63.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224747e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224747e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y63.a.k> bVarY1 = f0.this.Y1();
                y63.a.k.d dVar = y63.a.k.d.f224685a;
                this.f224747e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(y63.a.j jVar, y63.i iVar, tq.e<? super oq.i0> eVar) {
            return f0.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly63/i$a;", "it", "Loq/i0;", "<anonymous>", "(Ly63/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<y63.i.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224749e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f224749e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            f0.this.d9(new y63.a.FetchData(f0.this.setupData.getSnackBarSuccessMessage()));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(y63.i.a aVar, tq.e<? super oq.i0> eVar) {
            return ((f) v(aVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return f0.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly63/a$c;", "<unused var>", "Ly63/i$c;", "Loq/i0;", "<anonymous>", "(Ly63/a$c;Ly63/i$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<y63.a.c, y63.i.NotAdult, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224751e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224751e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y63.a.k> bVarY1 = f0.this.Y1();
                y63.a.k.C6022a c6022a = y63.a.k.C6022a.f224682a;
                this.f224751e = 1;
                if (bVarY1.F(c6022a, this) == objE) {
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
        public final Object w(y63.a.c cVar, y63.i.NotAdult notAdult, tq.e<? super oq.i0> eVar) {
            return f0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly63/a$c;", "<unused var>", "Ly63/i$d;", "Loq/i0;", "<anonymous>", "(Ly63/a$c;Ly63/i$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<y63.a.c, y63.i.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224753e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224753e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y63.a.k> bVarY1 = f0.this.Y1();
                y63.a.k.C6022a c6022a = y63.a.k.C6022a.f224682a;
                this.f224753e = 1;
                if (bVarY1.F(c6022a, this) == objE) {
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
        public final Object w(y63.a.c cVar, y63.i.d dVar, tq.e<? super oq.i0> eVar) {
            return f0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly63/a$c;", "<unused var>", "Ly63/i$b;", "Loq/i0;", "<anonymous>", "(Ly63/a$c;Ly63/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<y63.a.c, y63.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224755e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224755e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y63.a.k> bVarY1 = f0.this.Y1();
                y63.a.k.C6022a c6022a = y63.a.k.C6022a.f224682a;
                this.f224755e = 1;
                if (bVarY1.F(c6022a, this) == objE) {
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
        public final Object w(y63.a.c cVar, y63.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return f0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ly63/a$d;", "<unused var>", "Ly63/i$b;", "Loq/i0;", "<anonymous>", "(Ly63/a$d;Ly63/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<y63.a.d, y63.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224757e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f224757e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<y63.a.k> bVarY1 = f0.this.Y1();
                y63.a.k.b bVar = y63.a.k.b.f224683a;
                this.f224757e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(y63.a.d dVar, y63.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return f0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly63/a$a;", "action", "Ly63/i$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly63/a$a;Ly63/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<y63.a.AddEmailAddress, y63.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224759e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224760f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y63.a.AddEmailAddress addEmailAddress = (y63.a.AddEmailAddress) this.f224760f;
            Object objE = uq.b.e();
            int i15 = this.f224759e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                Add add = new Add(addEmailAddress.getIsAnyContactRegistered());
                this.f224760f = vq.j.a(addEmailAddress);
                this.f224759e = 1;
                if (f0Var.D9(add, this) == objE) {
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
        public final Object w(y63.a.AddEmailAddress addEmailAddress, y63.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            k kVar = f0.this.new k(eVar);
            kVar.f224760f = addEmailAddress;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly63/a$g;", "action", "Ly63/i$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly63/a$g;Ly63/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<y63.a.EditEmailAddress, y63.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224762e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224763f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y63.a.EditEmailAddress editEmailAddress = (y63.a.EditEmailAddress) this.f224763f;
            Object objE = uq.b.e();
            int i15 = this.f224762e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                Edit edit = new Edit(editEmailAddress.getEmail());
                this.f224763f = vq.j.a(editEmailAddress);
                this.f224762e = 1;
                if (f0Var.D9(edit, this) == objE) {
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
        public final Object w(y63.a.EditEmailAddress editEmailAddress, y63.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            l lVar = f0.this.new l(eVar);
            lVar.f224763f = editEmailAddress;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly63/a$e;", "action", "Ly63/i$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly63/a$e;Ly63/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<y63.a.ConfirmEmailAddress, y63.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224765e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224766f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y63.a.ConfirmEmailAddress confirmEmailAddress = (y63.a.ConfirmEmailAddress) this.f224766f;
            Object objE = uq.b.e();
            int i15 = this.f224765e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                Confirm confirm = new Confirm(confirmEmailAddress.getEmail(), confirmEmailAddress.getPreviousEmail(), confirmEmailAddress.getIsAnyContactRegistered());
                this.f224766f = vq.j.a(confirmEmailAddress);
                this.f224765e = 1;
                if (f0Var.D9(confirm, this) == objE) {
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
        public final Object w(y63.a.ConfirmEmailAddress confirmEmailAddress, y63.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            m mVar = f0.this.new m(eVar);
            mVar.f224766f = confirmEmailAddress;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly63/a$b;", "action", "Ly63/i$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly63/a$b;Ly63/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<y63.a.AddPhoneNumber, y63.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224769f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y63.a.AddPhoneNumber addPhoneNumber = (y63.a.AddPhoneNumber) this.f224769f;
            Object objE = uq.b.e();
            int i15 = this.f224768e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                Add add = new Add(addPhoneNumber.getIsAnyContactRegistered());
                this.f224769f = vq.j.a(addPhoneNumber);
                this.f224768e = 1;
                if (f0Var.D9(add, this) == objE) {
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
        public final Object w(y63.a.AddPhoneNumber addPhoneNumber, y63.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            n nVar = f0.this.new n(eVar);
            nVar.f224769f = addPhoneNumber;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly63/a$h;", "action", "Ly63/i$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly63/a$h;Ly63/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<y63.a.EditPhoneNumber, y63.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224772f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y63.a.EditPhoneNumber editPhoneNumber = (y63.a.EditPhoneNumber) this.f224772f;
            Object objE = uq.b.e();
            int i15 = this.f224771e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                Edit edit = new Edit(editPhoneNumber.getPrefix(), editPhoneNumber.getPhoneNumber());
                this.f224772f = vq.j.a(editPhoneNumber);
                this.f224771e = 1;
                if (f0Var.D9(edit, this) == objE) {
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
        public final Object w(y63.a.EditPhoneNumber editPhoneNumber, y63.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            o oVar = f0.this.new o(eVar);
            oVar.f224772f = editPhoneNumber;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ly63/a$f;", "action", "Ly63/i$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ly63/a$f;Ly63/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<y63.a.ConfirmPhoneNumber, y63.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f224774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f224775f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            y63.a.ConfirmPhoneNumber confirmPhoneNumber = (y63.a.ConfirmPhoneNumber) this.f224775f;
            Object objE = uq.b.e();
            int i15 = this.f224774e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                Confirm confirm = new Confirm(confirmPhoneNumber.getPrefix(), confirmPhoneNumber.getPhoneNumber(), confirmPhoneNumber.getPreviousPrefix(), confirmPhoneNumber.getPreviousPhoneNumber(), confirmPhoneNumber.getIsAnyContactRegistered());
                this.f224775f = vq.j.a(confirmPhoneNumber);
                this.f224774e = 1;
                if (f0Var.D9(confirm, this) == objE) {
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
        public final Object w(y63.a.ConfirmPhoneNumber confirmPhoneNumber, y63.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            p pVar = f0.this.new p(eVar);
            pVar.f224775f = confirmPhoneNumber;
            return pVar.J(oq.i0.f148189a);
        }
    }

    public f0(mx.c cVar, z63.g gVar, yy.a aVar, final fj0.g gVar2, final ac4.a aVar2, i70.n nVar, ib4.c cVar2, SetupData setupData) {
        this.labelProvider = cVar;
        this.mainContactDetailsMapper = gVar;
        this.snackBarManagerStateHolder = nVar;
        this.genericDomainErrorMapper = cVar2;
        this.setupData = setupData;
        y63.i.a aVar3 = y63.i.a.f224783a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: y63.v
            @Override // er.l
            public final Object b(Object obj) {
                return f0.O9(aVar2, gVar2, this, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), G9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b B9(dx.b domainError) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: y63.u
            @Override // er.l
            public final Object b(Object obj) {
                return f0.C9(this.f224830a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(f0 f0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            f0Var.d9(new y63.a.FetchData(null, 1, null));
        } else {
            f0Var.d9(y63.a.d.f224664a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object D9(y63.a.k kVar, tq.e<? super oq.i0> eVar) {
        B0();
        Object objF = Y1().F(kVar, eVar);
        return objF == uq.b.e() ? objF : oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayloadErrorData E9(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F9(dx.b bVar) {
        if (!(bVar instanceof dx.b.g.Http)) {
            return false;
        }
        dx.b.g.Http http = (dx.b.g.Http) bVar;
        return http.getCode() == dx.b.g.Http.a.FORBIDDEN && http.b() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y63.j.a G9(y63.i state) {
        z63.g gVar = this.mainContactDetailsMapper;
        er.a<oq.i0> aVarB9 = b9(y63.a.c.f224663a);
        y63.a.j jVar = y63.a.j.f224681a;
        return gVar.b(new z63.g.Params(state, aVarB9, b9(jVar), new er.l() { // from class: y63.s
            @Override // er.l
            public final Object b(Object obj) {
                return f0.H9(this.f224828a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: y63.w
            @Override // er.l
            public final Object b(Object obj) {
                return f0.I9(this.f224834a, (iy.b0) obj);
            }
        }, new er.q() { // from class: y63.x
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return f0.J9(this.f224835a, (ContactDetail) obj, (ContactDetail) obj2, ((Boolean) obj3).booleanValue());
            }
        }, new er.l() { // from class: y63.y
            @Override // er.l
            public final Object b(Object obj) {
                return f0.K9(this.f224836a, ((Boolean) obj).booleanValue());
            }
        }, new er.p() { // from class: y63.z
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return f0.L9(this.f224837a, (iy.b0) obj, (iy.b0) obj2);
            }
        }, new er.q() { // from class: y63.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return f0.M9(this.f224686a, (ContactDetail) obj, (ContactDetail) obj2, ((Boolean) obj3).booleanValue());
            }
        }, new a(this), b9(jVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(f0 f0Var, boolean z15) {
        f0Var.d9(new y63.a.AddEmailAddress(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(f0 f0Var, iy.b0 b0Var) {
        f0Var.d9(new y63.a.EditEmailAddress(b0Var));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(f0 f0Var, ContactDetail contactDetail, ContactDetail contactDetail2, boolean z15) {
        iy.b0 value = contactDetail.getValue();
        if (value == null) {
            value = iy.b0.INSTANCE.a();
        }
        f0Var.d9(new y63.a.ConfirmEmailAddress(value, contactDetail2 != null ? contactDetail2.getValue() : null, z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(f0 f0Var, boolean z15) {
        f0Var.d9(new y63.a.AddPhoneNumber(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(f0 f0Var, iy.b0 b0Var, iy.b0 b0Var2) {
        f0Var.d9(new y63.a.EditPhoneNumber(b0Var, b0Var2));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    public static final oq.i0 M9(f0 f0Var, ContactDetail contactDetail, ContactDetail contactDetail2, boolean z15) {
        Object next;
        iy.b0 b0VarA;
        iy.b0 value;
        List<ContactDetailAdditionalValue> listA;
        Object next2;
        Iterator<T> it = contactDetail.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((ContactDetailAdditionalValue) next).getKey(), "PREFIX"));
        ContactDetailAdditionalValue contactDetailAdditionalValue = (ContactDetailAdditionalValue) next;
        if (contactDetailAdditionalValue == null || (b0VarA = contactDetailAdditionalValue.getValue()) == null) {
            b0VarA = iy.b0.INSTANCE.a();
        }
        iy.b0 b0Var = b0VarA;
        iy.b0 value2 = contactDetail.getValue();
        if (value2 == null) {
            value2 = iy.b0.INSTANCE.a();
        }
        iy.b0 b0Var2 = value2;
        if (contactDetail2 == null || (listA = contactDetail2.a()) == null) {
            value = null;
        } else {
            Iterator<T> it4 = listA.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!fr.t.c(((ContactDetailAdditionalValue) next2).getKey(), "PREFIX"));
            ContactDetailAdditionalValue contactDetailAdditionalValue2 = (ContactDetailAdditionalValue) next2;
            if (contactDetailAdditionalValue2 != null) {
                value = contactDetailAdditionalValue2.getValue();
            } else {
                value = null;
            }
        }
        f0Var.d9(new y63.a.ConfirmPhoneNumber(b0Var, b0Var2, value, contactDetail2 != null ? contactDetail2.getValue() : null, z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(final ac4.a aVar, final fj0.g gVar, final f0 f0Var, k10.v vVar) {
        vVar.c(q0.c(y63.i.class), new er.l() { // from class: y63.b0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.P9(aVar, gVar, f0Var, (k10.z) obj);
            }
        });
        vVar.c(q0.c(y63.i.a.class), new er.l() { // from class: y63.c0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.Q9(this.f224695a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(y63.i.NotAdult.class), new er.l() { // from class: y63.d0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.R9(this.f224698a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(y63.i.d.class), new er.l() { // from class: y63.e0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.S9(this.f224700a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(y63.i.Initialized.class), new er.l() { // from class: y63.t
            @Override // er.l
            public final Object b(Object obj) {
                return f0.T9(this.f224829a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(ac4.a aVar, fj0.g gVar, f0 f0Var, k10.z zVar) {
        c cVar = new c(aVar, gVar, f0Var, null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(y63.a.FetchData.class), oVar, cVar);
        zVar.x(q0.c(y63.a.d.class), oVar, f0Var.new d(null));
        zVar.x(q0.c(y63.a.j.class), oVar, f0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(f0 f0Var, k10.z zVar) {
        zVar.C(f0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(f0 f0Var, k10.z zVar) {
        g gVar = f0Var.new g(null);
        zVar.x(q0.c(y63.a.c.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(f0 f0Var, k10.z zVar) {
        h hVar = f0Var.new h(null);
        zVar.x(q0.c(y63.a.c.class), k10.o.CANCEL_PREVIOUS, hVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(f0 f0Var, k10.z zVar) {
        i iVar = f0Var.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(y63.a.c.class), oVar, iVar);
        zVar.x(q0.c(y63.a.d.class), oVar, f0Var.new j(null));
        zVar.x(q0.c(y63.a.AddEmailAddress.class), oVar, f0Var.new k(null));
        zVar.x(q0.c(y63.a.EditEmailAddress.class), oVar, f0Var.new l(null));
        zVar.x(q0.c(y63.a.ConfirmEmailAddress.class), oVar, f0Var.new m(null));
        zVar.x(q0.c(y63.a.AddPhoneNumber.class), oVar, f0Var.new n(null));
        zVar.x(q0.c(y63.a.EditPhoneNumber.class), oVar, f0Var.new o(null));
        zVar.x(q0.c(y63.a.ConfirmPhoneNumber.class), oVar, f0Var.new p(null));
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: N9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<y63.a.k> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<y63.i, y63.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<y63.j.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
