package t53;

import fr.q0;
import iy.b0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v53.LoginWithPinScreenData;
import w53.BiometricLoginNavResultData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BY\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J,\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b&\u0010'J(\u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0082@¢\u0006\u0004\b,\u0010-J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020/0.H\u0096\u0001¢\u0006\u0004\b0\u00101R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010M\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010T\u001a\b\u0012\u0004\u0012\u00020O0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030U8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_¨\u0006`"}, d2 = {"Lt53/m;", "Ll00/g;", "Lt53/b;", "Lt53/a;", "Lt53/c;", "", "Lnx/b;", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lg04/g;", "checkBiometricStatusUseCase", "Lg04/a;", "activateBiometricUseCase", "Lg04/c;", "biometricLoginUseCase", "Lg04/h;", "compareWithBiometricPinUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lg73/d;", "settingsNavigationDialogMapper", "Lu53/b;", "loginWithPinMapper", "Loz/q;", "ownerViewLifecycleManager", "<init>", "(Lyy/a;Lmx/c;Lg04/g;Lg04/a;Lg04/c;Lg04/h;Lib4/c;Lg73/d;Lu53/b;Loz/q;)V", "state", "Lv53/e;", "x9", "(Lt53/b;)Lv53/e;", "Lk10/c0;", "Lt53/b$b;", "Liy/b0;", "pinValue", "Lk10/l;", "F9", "(Lk10/c0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lv53/a;", "loginWithPinResources", "decryptedPassword", "Loq/i0;", "z9", "(Lv53/a;Liy/b0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "Lnx/c;", "G2", "()Lmu/g;", "b", "Lmx/c;", "c", "Lg04/g;", "d", "Lg04/a;", "e", "Lg04/c;", "f", "Lg04/h;", "g", "Lib4/c;", "h", "Lg73/d;", "j", "Lu53/b;", "k", "Loz/q;", "Lt53/b$a;", "l", "Lt53/b$a;", "initialState", "Loz/j;", "m", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "Lxw/b;", "Lt53/a$g;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<t53.b, t53.a> implements t53.c, zx.b, nx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g04.g checkBiometricStatusUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g04.a activateBiometricUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g04.c biometricLoginUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g04.h compareWithBiometricPinUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final g73.d settingsNavigationDialogMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final u53.b loginWithPinMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final oz.q ownerViewLifecycleManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final t53.b.a initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final oz.j lifecycleConnector;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<t53.a.g> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<t53.b, t53.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<LoginWithPinScreenData> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f187877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f187878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f187879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f187880g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f187882j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f187880g = obj;
            this.f187882j |= PKIFailureInfo.systemUnavail;
            return m.this.z9(null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<LoginWithPinScreenData> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f187883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f187884b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f187885a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f187886b;

            /* JADX INFO: renamed from: t53.m$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4888a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f187887d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f187888e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f187889f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f187891h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f187892j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f187893k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f187894l;

                public C4888a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f187887d = obj;
                    this.f187888e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f187885a = hVar;
                this.f187886b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4888a c4888a;
                if (eVar instanceof C4888a) {
                    c4888a = (C4888a) eVar;
                    int i15 = c4888a.f187888e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4888a.f187888e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4888a = new C4888a(eVar);
                    }
                } else {
                    c4888a = new C4888a(eVar);
                }
                Object obj2 = c4888a.f187887d;
                Object objE = uq.b.e();
                int i16 = c4888a.f187888e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f187885a;
                    LoginWithPinScreenData loginWithPinScreenDataX9 = this.f187886b.x9((t53.b) obj);
                    c4888a.f187889f = vq.j.a(obj);
                    c4888a.f187891h = vq.j.a(c4888a);
                    c4888a.f187892j = vq.j.a(obj);
                    c4888a.f187893k = vq.j.a(hVar);
                    c4888a.f187894l = 0;
                    c4888a.f187888e = 1;
                    if (hVar.F(loginWithPinScreenDataX9, c4888a) == objE) {
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

        public b(mu.g gVar, m mVar) {
            this.f187883a = gVar;
            this.f187884b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super LoginWithPinScreenData> hVar, tq.e eVar) {
            Object objA = this.f187883a.a(new a(hVar, this.f187884b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnx/c;", "visibility", "Lt53/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lnx/c;Lt53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<nx.c, t53.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187896f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nx.c cVar = (nx.c) this.f187896f;
            uq.b.e();
            if (this.f187895e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (cVar == nx.c.FOREGROUND) {
                m.this.d9(t53.a.b.f187824a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(nx.c cVar, t53.b bVar, tq.e<? super i0> eVar) {
            c cVar2 = m.this.new c(eVar);
            cVar2.f187896f = cVar;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt53/a$b;", "<unused var>", "Lt53/b;", "Loq/i0;", "<anonymous>", "(Lt53/a$b;Lt53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<t53.a.b, t53.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187898e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t53.a setup;
            Object objE = uq.b.e();
            int i15 = this.f187898e;
            if (i15 == 0) {
                oq.u.b(obj);
                g04.g gVar = m.this.checkBiometricStatusUseCase;
                g04.g.Params params = new g04.g.Params(true);
                this.f187898e = 1;
                obj = gVar.c(params, this);
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
            m mVar = m.this;
            if (iVar instanceof dx.i.Left) {
                mVar.d9(t53.a.d.f187826a);
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                e04.e eVar = (e04.e) ((dx.i.Right) iVar).b();
                if (eVar instanceof e04.e.b) {
                    setup = new t53.a.Setup(v53.b.a((e04.e.b) eVar));
                } else {
                    if (!(eVar instanceof e04.e.a)) {
                        throw new oq.p();
                    }
                    setup = t53.a.d.f187826a;
                }
                mVar.d9(setup);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t53.a.b bVar, t53.b bVar2, tq.e<? super i0> eVar) {
            return m.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt53/a$n;", "<unused var>", "Lt53/b;", "Loq/i0;", "<anonymous>", "(Lt53/a$n;Lt53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<t53.a.n, t53.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187900e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f187900e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                t53.a.g.ShowNavigationDialog showNavigationDialog = new t53.a.g.ShowNavigationDialog(m.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(m.this.b9(t53.a.d.f187826a), null, 2, null))));
                this.f187900e = 1;
                if (mVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(t53.a.n nVar, t53.b bVar, tq.e<? super i0> eVar) {
            return m.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt53/a$m;", "<unused var>", "Lt53/b;", "Loq/i0;", "<anonymous>", "(Lt53/a$m;Lt53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<t53.a.m, t53.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187902e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f187902e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                t53.a.g.ShowNavigationDialog showNavigationDialog = new t53.a.g.ShowNavigationDialog(m.this.settingsNavigationDialogMapper.b(new g73.d.Params(new g73.a.TerminationProcessDialog(m.this.b9(t53.a.d.f187826a), m.this.b9(t53.a.f.f187828a)))));
                this.f187902e = 1;
                if (mVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(t53.a.m mVar, t53.b bVar, tq.e<? super i0> eVar) {
            return m.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt53/a$h;", "action", "Lt53/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lt53/a$h;Lt53/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<t53.a.OnError, t53.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f187904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f187905f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f187906g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f187907h;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m mVar, ib4.c.b bVar) {
            mVar.d9(t53.a.d.f187826a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t53.a.OnError onError = (t53.a.OnError) this.f187907h;
            Object objE = uq.b.e();
            int i15 = this.f187906g;
            if (i15 == 0) {
                oq.u.b(obj);
                ib4.c cVar = m.this.genericDomainErrorMapper;
                dx.b domainError = onError.getDomainError();
                final m mVar = m.this;
                jb4.b bVarB = cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: t53.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.g.O(mVar, (ib4.c.b) obj2);
                    }
                }, 2, null));
                m mVar2 = m.this;
                jb4.b bVar = bVarB;
                t53.a.g.OnError onError2 = new t53.a.g.OnError(bVar);
                this.f187907h = vq.j.a(onError);
                this.f187904e = vq.j.a(bVar);
                this.f187905f = 0;
                this.f187906g = 1;
                if (mVar2.F(onError2, this) == objE) {
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
        public final Object w(t53.a.OnError onError, t53.b bVar, tq.e<? super i0> eVar) {
            g gVar = m.this.new g(eVar);
            gVar.f187907h = onError;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt53/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lt53/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<t53.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187909e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f187909e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m.this.d9(t53.a.b.f187824a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(t53.b.a aVar, tq.e<? super i0> eVar) {
            return ((h) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return m.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lt53/a$k;", "action", "Lk10/c0;", "Lt53/b$a;", "state", "Lk10/l;", "Lt53/b;", "<anonymous>", "(Lt53/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<t53.a.Setup, c0<t53.b.a>, tq.e<? super k10.l<? extends t53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187912f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f187913g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t53.b.Initialized O(t53.a.Setup setup, t53.b.a aVar) {
            return new t53.b.Initialized(setup.getData(), null, null, false, null, null, 62, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final t53.a.Setup setup = (t53.a.Setup) this.f187912f;
            c0 c0Var = (c0) this.f187913g;
            uq.b.e();
            if (this.f187911e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: t53.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.i.O(setup, (b.a) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t53.a.Setup setup, c0<t53.b.a> c0Var, tq.e<? super k10.l<? extends t53.b>> eVar) {
            i iVar = new i(eVar);
            iVar.f187912f = setup;
            iVar.f187913g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt53/b$b;", "it", "Loq/i0;", "<anonymous>", "(Lt53/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<t53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187914e;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f187914e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            m.this.d9(t53.a.f.f187828a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(t53.b.Initialized initialized, tq.e<? super i0> eVar) {
            return ((j) v(initialized, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return m.this.new j(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt53/a$f;", "<unused var>", "Lt53/b$b;", "Loq/i0;", "<anonymous>", "(Lt53/a$f;Lt53/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<t53.a.f, t53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187916e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f187916e;
            if (i15 == 0) {
                oq.u.b(obj);
                g04.c cVar = m.this.biometricLoginUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f187916e = 1;
                obj = cVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            e04.a aVar = (e04.a) obj;
            if (aVar instanceof e04.a.AuthenticationSucceed) {
                m.this.d9(new t53.a.AuthenticationSucceed(((e04.a.AuthenticationSucceed) aVar).getResultData()));
            } else if (fr.t.c(aVar, e04.a.d.f46681a)) {
                m.this.d9(t53.a.m.f187842a);
            } else if (fr.t.c(aVar, e04.a.C1055a.f46678a)) {
                m.this.d9(new t53.a.CloseWithResult(new BiometricLoginNavResultData(m.this.labelProvider.c(c53.a.f23739x))));
            } else {
                if (!(aVar instanceof e04.a.Error)) {
                    throw new oq.p();
                }
                m.this.d9(new t53.a.OnError(((e04.a.Error) aVar).getErrorType()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t53.a.f fVar, t53.b.Initialized initialized, tq.e<? super i0> eVar) {
            return m.this.new k(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lt53/a$a;", "action", "Lk10/c0;", "Lt53/b$b;", "state", "Lk10/l;", "Lt53/b;", "<anonymous>", "(Lt53/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<t53.a.AuthenticationSucceed, c0<t53.b.Initialized>, tq.e<? super k10.l<? extends t53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187919f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f187920g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t53.b.Initialized O(t53.a.AuthenticationSucceed authenticationSucceed, t53.b.Initialized initialized) {
            return t53.b.Initialized.b(initialized, null, authenticationSucceed.getBiometricResult(), null, true, null, null, 53, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final t53.a.AuthenticationSucceed authenticationSucceed = (t53.a.AuthenticationSucceed) this.f187919f;
            c0 c0Var = (c0) this.f187920g;
            uq.b.e();
            if (this.f187918e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: t53.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.l.O(authenticationSucceed, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t53.a.AuthenticationSucceed authenticationSucceed, c0<t53.b.Initialized> c0Var, tq.e<? super k10.l<? extends t53.b>> eVar) {
            l lVar = new l(eVar);
            lVar.f187919f = authenticationSucceed;
            lVar.f187920g = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: t53.m$m, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lt53/a$i;", "action", "Lk10/c0;", "Lt53/b$b;", "state", "Lk10/l;", "Lt53/b;", "<anonymous>", "(Lt53/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C4889m extends vq.k implements er.q<t53.a.OnPinChanged, c0<t53.b.Initialized>, tq.e<? super k10.l<? extends t53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187922f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f187923g;

        C4889m(tq.e<? super C4889m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t53.b.Initialized O(t53.a.OnPinChanged onPinChanged, t53.b.Initialized initialized) {
            return t53.b.Initialized.b(initialized, null, null, null, false, onPinChanged.getPinValue(), hz.b.C2039b.f86846c, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final t53.a.OnPinChanged onPinChanged = (t53.a.OnPinChanged) this.f187922f;
            c0 c0Var = (c0) this.f187923g;
            Object objE = uq.b.e();
            int i15 = this.f187921e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (onPinChanged.getPinValue().getData().length < 4) {
                    return c0Var.b(new er.l() { // from class: t53.q
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return m.C4889m.O(onPinChanged, (b.Initialized) obj2);
                        }
                    });
                }
                m mVar = m.this;
                b0 pinValue = onPinChanged.getPinValue();
                this.f187922f = vq.j.a(onPinChanged);
                this.f187923g = vq.j.a(c0Var);
                this.f187921e = 1;
                obj = mVar.F9(c0Var, pinValue, this);
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

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t53.a.OnPinChanged onPinChanged, c0<t53.b.Initialized> c0Var, tq.e<? super k10.l<? extends t53.b>> eVar) {
            C4889m c4889m = m.this.new C4889m(eVar);
            c4889m.f187922f = onPinChanged;
            c4889m.f187923g = c0Var;
            return c4889m.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt53/a$l;", "<unused var>", "Lt53/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lt53/a$l;Lt53/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<t53.a.l, t53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187925e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187926f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m mVar, t53.b.Initialized initialized) {
            mVar.d9(new t53.a.SetDifferentLoginType(initialized.getDecryptedPassword(), initialized.getPinValue()));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final t53.b.Initialized initialized = (t53.b.Initialized) this.f187926f;
            Object objE = uq.b.e();
            int i15 = this.f187925e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                g73.d dVar = m.this.settingsNavigationDialogMapper;
                er.a aVarB9 = m.this.b9(t53.a.d.f187826a);
                final m mVar2 = m.this;
                t53.a.g.ShowNavigationDialog showNavigationDialog = new t53.a.g.ShowNavigationDialog(dVar.b(new g73.d.Params(new g73.a.TerminationProcessDialog(aVarB9, new er.a() { // from class: t53.r
                    @Override // er.a
                    public final Object a() {
                        return m.n.O(mVar2, initialized);
                    }
                }))));
                this.f187926f = vq.j.a(initialized);
                this.f187925e = 1;
                if (mVar.F(showNavigationDialog, this) == objE) {
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
        public final Object w(t53.a.l lVar, t53.b.Initialized initialized, tq.e<? super i0> eVar) {
            n nVar = m.this.new n(eVar);
            nVar.f187926f = initialized;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt53/a$j;", "action", "Lt53/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lt53/a$j;Lt53/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<t53.a.SetDifferentLoginType, t53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f187930g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t53.a.SetDifferentLoginType setDifferentLoginType = (t53.a.SetDifferentLoginType) this.f187929f;
            t53.b.Initialized initialized = (t53.b.Initialized) this.f187930g;
            Object objE = uq.b.e();
            int i15 = this.f187928e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                v53.a loginWithPinResources = initialized.getLoginWithPinResources();
                b0 decryptedPassword = setDifferentLoginType.getDecryptedPassword();
                b0 pinValue = setDifferentLoginType.getPinValue();
                this.f187929f = vq.j.a(setDifferentLoginType);
                this.f187930g = vq.j.a(initialized);
                this.f187928e = 1;
                if (mVar.z9(loginWithPinResources, decryptedPassword, pinValue, this) == objE) {
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
        public final Object w(t53.a.SetDifferentLoginType setDifferentLoginType, t53.b.Initialized initialized, tq.e<? super i0> eVar) {
            o oVar = m.this.new o(eVar);
            oVar.f187929f = setDifferentLoginType;
            oVar.f187930g = initialized;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lt53/a$c;", "<unused var>", "Lk10/c0;", "Lt53/b$b;", "state", "Lk10/l;", "Lt53/b;", "<anonymous>", "(Lt53/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<t53.a.c, c0<t53.b.Initialized>, tq.e<? super k10.l<? extends t53.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187933f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t53.b.Initialized O(m mVar, t53.b.Initialized initialized) {
            return t53.b.Initialized.b(initialized, null, null, null, false, b0.INSTANCE.a(), new hz.b.Invalid(mVar.labelProvider.c(c53.a.f23687f)), 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f187933f;
            uq.b.e();
            if (this.f187932e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final m mVar = m.this;
            return c0Var.b(new er.l() { // from class: t53.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.p.O(mVar, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(t53.a.c cVar, c0<t53.b.Initialized> c0Var, tq.e<? super k10.l<? extends t53.b>> eVar) {
            p pVar = m.this.new p(eVar);
            pVar.f187933f = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt53/a$e;", "action", "Lt53/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lt53/a$e;Lt53/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<t53.a.CloseWithResult, t53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187936f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t53.a.CloseWithResult closeWithResult = (t53.a.CloseWithResult) this.f187936f;
            Object objE = uq.b.e();
            int i15 = this.f187935e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                t53.a.g.CloseWithResult closeWithResult2 = new t53.a.g.CloseWithResult(closeWithResult.getResultData());
                this.f187936f = vq.j.a(closeWithResult);
                this.f187935e = 1;
                if (mVar.F(closeWithResult2, this) == objE) {
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
        public final Object w(t53.a.CloseWithResult closeWithResult, t53.b.Initialized initialized, tq.e<? super i0> eVar) {
            q qVar = m.this.new q(eVar);
            qVar.f187936f = closeWithResult;
            return qVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt53/a$d;", "<unused var>", "Lt53/b$b;", "Loq/i0;", "<anonymous>", "(Lt53/a$d;Lt53/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<t53.a.d, t53.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187938e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f187938e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                t53.a.g.C4886a c4886a = t53.a.g.C4886a.f187829a;
                this.f187938e = 1;
                if (mVar.F(c4886a, this) == objE) {
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
        public final Object w(t53.a.d dVar, t53.b.Initialized initialized, tq.e<? super i0> eVar) {
            return m.this.new r(eVar).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class s extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f187940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f187941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187942f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f187944h;

        s(tq.e<? super s> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f187942f = obj;
            this.f187944h |= PKIFailureInfo.systemUnavail;
            return m.this.F9(null, null, this);
        }
    }

    public m(yy.a aVar, mx.c cVar, g04.g gVar, g04.a aVar2, g04.c cVar2, g04.h hVar, ib4.c cVar3, g73.d dVar, u53.b bVar, oz.q qVar) {
        this.labelProvider = cVar;
        this.checkBiometricStatusUseCase = gVar;
        this.activateBiometricUseCase = aVar2;
        this.biometricLoginUseCase = cVar2;
        this.compareWithBiometricPinUseCase = hVar;
        this.genericDomainErrorMapper = cVar3;
        this.settingsNavigationDialogMapper = dVar;
        this.loginWithPinMapper = bVar;
        this.ownerViewLifecycleManager = qVar;
        t53.b.a aVar3 = t53.b.a.f187844a;
        this.initialState = aVar3;
        this.lifecycleConnector = qVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: t53.g
            @Override // er.l
            public final Object b(Object obj) {
                return m.B9(this.f187856a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), x9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final m mVar, k10.v vVar) {
        vVar.c(q0.c(t53.b.class), new er.l() { // from class: t53.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.C9(this.f187858a, (z) obj);
            }
        });
        vVar.c(q0.c(t53.b.a.class), new er.l() { // from class: t53.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.D9(this.f187859a, (z) obj);
            }
        });
        vVar.c(q0.c(t53.b.Initialized.class), new er.l() { // from class: t53.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.E9(this.f187860a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(m mVar, z zVar) {
        k10.k.s(zVar, mVar.G2(), null, mVar.new c(null), 2, null);
        d dVar = mVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(t53.a.b.class), oVar, dVar);
        zVar.x(q0.c(t53.a.n.class), oVar, mVar.new e(null));
        zVar.x(q0.c(t53.a.m.class), oVar, mVar.new f(null));
        zVar.x(q0.c(t53.a.OnError.class), oVar, mVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(m mVar, z zVar) {
        zVar.C(mVar.new h(null));
        i iVar = new i(null);
        zVar.v(q0.c(t53.a.Setup.class), k10.o.CANCEL_PREVIOUS, iVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(m mVar, z zVar) {
        zVar.C(mVar.new j(null));
        k kVar = mVar.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(t53.a.f.class), oVar, kVar);
        zVar.v(q0.c(t53.a.AuthenticationSucceed.class), oVar, new l(null));
        zVar.v(q0.c(t53.a.OnPinChanged.class), oVar, mVar.new C4889m(null));
        zVar.x(q0.c(t53.a.l.class), oVar, mVar.new n(null));
        zVar.x(q0.c(t53.a.SetDifferentLoginType.class), oVar, mVar.new o(null));
        zVar.v(q0.c(t53.a.c.class), oVar, mVar.new p(null));
        zVar.x(q0.c(t53.a.CloseWithResult.class), oVar, mVar.new q(null));
        zVar.x(q0.c(t53.a.d.class), oVar, mVar.new r(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object F9(c0<t53.b.Initialized> c0Var, final b0 b0Var, tq.e<? super k10.l<? extends t53.b>> eVar) throws Throwable {
        s sVar;
        if (eVar instanceof s) {
            sVar = (s) eVar;
            int i15 = sVar.f187944h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                sVar.f187944h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                sVar = new s(eVar);
            }
        } else {
            sVar = new s(eVar);
        }
        Object objC = sVar.f187942f;
        Object objE = uq.b.e();
        int i16 = sVar.f187944h;
        if (i16 == 0) {
            oq.u.b(objC);
            g04.h hVar = this.compareWithBiometricPinUseCase;
            g04.h.Params params = new g04.h.Params(c0Var.a().getBiometricResult(), b0Var);
            sVar.f187940d = c0Var;
            sVar.f187941e = b0Var;
            sVar.f187944h = 1;
            objC = hVar.c(params, sVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b0Var = (b0) sVar.f187941e;
            c0Var = (c0) sVar.f187940d;
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            d9(new t53.a.OnError((dx.b) ((dx.i.Left) iVar).b()));
            return c0Var.c();
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        final g04.n nVar = (g04.n) ((dx.i.Right) iVar).b();
        if (nVar instanceof g04.n.Correct) {
            d9(new t53.a.SetDifferentLoginType(((g04.n.Correct) nVar).getDecryptedPassword(), b0Var));
            return c0Var.b(new er.l() { // from class: t53.l
                @Override // er.l
                public final Object b(Object obj) {
                    return m.G9(nVar, b0Var, (b.Initialized) obj);
                }
            });
        }
        if (!fr.t.c(nVar, g04.n.b.f69227a)) {
            throw new oq.p();
        }
        d9(t53.a.c.f187825a);
        return c0Var.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t53.b.Initialized G9(g04.n nVar, b0 b0Var, t53.b.Initialized initialized) {
        return t53.b.Initialized.b(initialized, null, null, ((g04.n.Correct) nVar).getDecryptedPassword(), false, b0Var, null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoginWithPinScreenData x9(t53.b state) {
        return this.loginWithPinMapper.b(new u53.b.Params(state, b9(t53.a.n.f187843a), new er.l() { // from class: t53.h
            @Override // er.l
            public final Object b(Object obj) {
                return m.y9(this.f187857a, (b0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(m mVar, b0 b0Var) {
        mVar.d9(new t53.a.OnPinChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a7, code lost:
    
        if (r9 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z9(v53.a r6, iy.b0 r7, iy.b0 r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t53.m.z9(v53.a, iy.b0, iy.b0, tq.e):java.lang.Object");
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // nx.b
    public mu.g<nx.c> G2() {
        return this.ownerViewLifecycleManager.G2();
    }

    @Override // zx.b
    public xw.b<t53.a.g> Y1() {
        return this.navAction;
    }

    @Override // t53.c
    /* JADX INFO: renamed from: a, reason: from getter */
    public oz.j getLifecycleConnector() {
        return this.lifecycleConnector;
    }

    @Override // l00.g
    protected k10.t<t53.b, t53.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<LoginWithPinScreenData> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(t53.a.g gVar, tq.e<? super i0> eVar) {
        return super.F(gVar, eVar);
    }
}
