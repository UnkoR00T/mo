package ak2;

import ck2.BiometricPinSetupData;
import f00.j0;
import fr.q0;
import iy.b0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 W2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0002-XBs\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J,\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR \u0010K\u001a\b\u0012\u0004\u0012\u00020F0E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR&\u0010Q\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030L8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V¨\u0006Y"}, d2 = {"Lak2/m;", "Ll00/g;", "Lak2/b;", "Lak2/a;", "Lak2/c;", "", "Lyy/a;", "stateMachineFactory", "Lbk2/b;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lg04/l;", "getPasswordFromBiometricUseCase", "Luj2/b;", "loginToAppUseCase", "Lsj2/a;", "loginInteractor", "Lmx/c;", "labelProvider", "Llx/a;", "keyboardManager", "La14/l;", "getImeVisibleStateUseCase", "Lax0/c;", "isAnyMainDocumentDownloadingUC", "Lb14/b;", "getAppVersionUC", "Lac4/e;", "getPartOfTheDayUC", "Lck2/a;", "biometricPinSetupData", "<init>", "(Lyy/a;Lbk2/b;Lib4/c;Lg04/l;Luj2/b;Lsj2/a;Lmx/c;Llx/a;La14/l;Lax0/c;Lb14/b;Lac4/e;Lck2/a;)V", "state", "Lak2/c$a;", "s9", "(Lak2/b;)Lak2/c$a;", "Lk10/c0;", "Lak2/b$c;", "Liy/b0;", "pinValue", "Lk10/l;", "z9", "(Lk10/c0;Liy/b0;Ltq/e;)Ljava/lang/Object;", "b", "Lbk2/b;", "c", "Lib4/c;", "d", "Lg04/l;", "e", "Luj2/b;", "f", "Lsj2/a;", "g", "Lmx/c;", "h", "Llx/a;", "j", "La14/l;", "k", "Lax0/c;", "l", "Lck2/a;", "Lak2/b$a;", "m", "Lak2/b$a;", "initialState", "Lxw/b;", "Lak2/a$a;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "r", "a", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<ak2.b, a> implements ak2.c, zx.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f7184s = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bk2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g04.l getPasswordFromBiometricUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final uj2.b loginToAppUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final sj2.a loginInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final lx.a keyboardManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a14.l getImeVisibleStateUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ax0.c isAnyMainDocumentDownloadingUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final BiometricPinSetupData biometricPinSetupData;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ak2.b.Initialized initialState;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a.InterfaceC0156a> navAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ak2.b, a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<ak2.c.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lak2/m$b;", "Lf00/j0;", "Lck2/a;", "Lak2/m;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b extends j0<BiometricPinSetupData, m> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<ak2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f7199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f7200b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f7201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f7202b;

            /* JADX INFO: renamed from: ak2.m$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0159a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f7203d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f7204e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f7205f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f7207h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f7208j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f7209k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f7210l;

                public C0159a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f7203d = obj;
                    this.f7204e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f7201a = hVar;
                this.f7202b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0159a c0159a;
                if (eVar instanceof C0159a) {
                    c0159a = (C0159a) eVar;
                    int i15 = c0159a.f7204e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0159a.f7204e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0159a = new C0159a(eVar);
                    }
                } else {
                    c0159a = new C0159a(eVar);
                }
                Object obj2 = c0159a.f7203d;
                Object objE = uq.b.e();
                int i16 = c0159a.f7204e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f7201a;
                    ak2.c.Data dataS9 = this.f7202b.s9((ak2.b) obj);
                    c0159a.f7205f = vq.j.a(obj);
                    c0159a.f7207h = vq.j.a(c0159a);
                    c0159a.f7208j = vq.j.a(obj);
                    c0159a.f7209k = vq.j.a(hVar);
                    c0159a.f7210l = 0;
                    c0159a.f7204e = 1;
                    if (hVar.F(dataS9, c0159a) == objE) {
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

        public c(mu.g gVar, m mVar) {
            this.f7199a = gVar;
            this.f7200b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ak2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f7199a.a(new a(hVar, this.f7200b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lak2/a$b;", "action", "Lak2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lak2/a$b;Lak2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<a.OnError, ak2.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f7211e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f7212f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7213g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f7214h;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(m mVar, ib4.c.b bVar) {
            mVar.d9(a.g.f7151a);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a.OnError onError = (a.OnError) this.f7214h;
            Object objE = uq.b.e();
            int i15 = this.f7213g;
            if (i15 == 0) {
                oq.u.b(obj);
                m.this.keyboardManager.c();
                ib4.c cVar = m.this.genericDomainErrorMapper;
                dx.b domainError = onError.getDomainError();
                final m mVar = m.this;
                jb4.b bVarB = cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: ak2.n
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return m.d.O(mVar, (ib4.c.b) obj2);
                    }
                }, 2, null));
                m mVar2 = m.this;
                jb4.b bVar = bVarB;
                a.InterfaceC0156a.OnError onError2 = new a.InterfaceC0156a.OnError(bVar);
                this.f7214h = vq.j.a(onError);
                this.f7211e = vq.j.a(bVar);
                this.f7212f = 0;
                this.f7213g = 1;
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
        public final Object w(a.OnError onError, ak2.b bVar, tq.e<? super i0> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f7214h = onError;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lak2/b$a;", "state", "Lk10/l;", "Lak2/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<c0<ak2.b.Initialized>, tq.e<? super k10.l<? extends ak2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7217f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b14.b f7218g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b14.b bVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f7218g = bVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ak2.b.Initialized O(String str, ak2.b.Initialized initialized) {
            return initialized.a(ak2.b.StateData.b(initialized.getStateData(), null, null, null, str, null, false, false, 119, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f7217f;
            uq.b.e();
            if (this.f7216e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final String strA = this.f7218g.a(gz.b.a.C1792a.f78542a);
            return c0Var.b(new er.l() { // from class: ak2.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.e.O(strA, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<ak2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ak2.b>> eVar) {
            return ((e) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f7218g, eVar);
            eVar2.f7217f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isImeVisible", "Lk10/c0;", "Lak2/b$a;", "state", "Lk10/l;", "Lak2/b;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<Boolean, c0<ak2.b.Initialized>, tq.e<? super k10.l<? extends ak2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f7220f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f7221g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ak2.b.Initialized O(boolean z15, ak2.b.Initialized initialized) {
            return initialized.a(ak2.b.StateData.b(initialized.getStateData(), null, null, null, null, null, z15, false, 95, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f7220f;
            c0 c0Var = (c0) this.f7221g;
            uq.b.e();
            if (this.f7219e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ak2.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.f.O(z15, (b.Initialized) obj2);
                }
            });
        }

        public final Object N(boolean z15, c0<ak2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ak2.b>> eVar) {
            f fVar = new f(eVar);
            fVar.f7220f = z15;
            fVar.f7221g = c0Var;
            return fVar.J(i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, c0<ak2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ak2.b>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lak2/a$g;", "<unused var>", "Lak2/b$a;", "Loq/i0;", "<anonymous>", "(Lak2/a$g;Lak2/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a.g, ak2.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7222e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7222e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                a.InterfaceC0156a.ToPasswordLogin toPasswordLogin = new a.InterfaceC0156a.ToPasswordLogin(fk2.a.PASSWORD);
                this.f7222e = 1;
                if (mVar.F(toPasswordLogin, this) == objE) {
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
        public final Object w(a.g gVar, ak2.b.Initialized initialized, tq.e<? super i0> eVar) {
            return m.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lak2/a$c;", "action", "Lk10/c0;", "Lak2/b$a;", "state", "Lk10/l;", "Lak2/b;", "<anonymous>", "(Lak2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a.OnPinChanged, c0<ak2.b.Initialized>, tq.e<? super k10.l<? extends ak2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f7226g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ak2.b.Initialized V(a.OnPinChanged onPinChanged, ak2.b.Initialized initialized) {
            return initialized.a(ak2.b.StateData.b(initialized.getStateData(), null, onPinChanged.getPinValue(), hz.b.C2039b.f86846c, null, null, false, false, 121, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ak2.b.Verifying X(a.OnPinChanged onPinChanged, ak2.b.Initialized initialized) {
            return new ak2.b.Verifying(ak2.b.StateData.b(initialized.getStateData(), null, onPinChanged.getPinValue(), null, null, null, false, false, 61, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final a.OnPinChanged onPinChanged = (a.OnPinChanged) this.f7225f;
            c0 c0Var = (c0) this.f7226g;
            uq.b.e();
            if (this.f7224e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return onPinChanged.getPinValue().getData().length < 4 ? c0Var.b(new er.l() { // from class: ak2.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.h.V(onPinChanged, (b.Initialized) obj2);
                }
            }) : c0Var.d(new er.l() { // from class: ak2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.h.X(onPinChanged, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(a.OnPinChanged onPinChanged, c0<ak2.b.Initialized> c0Var, tq.e<? super k10.l<? extends ak2.b>> eVar) {
            h hVar = new h(eVar);
            hVar.f7225f = onPinChanged;
            hVar.f7226g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lak2/b$c;", "state", "Lk10/l;", "Lak2/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<c0<ak2.b.Verifying>, tq.e<? super k10.l<? extends ak2.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7227e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f7228f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f7228f;
            Object objE = uq.b.e();
            int i15 = this.f7227e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            m mVar = m.this;
            b0 pinValue = ((ak2.b.Verifying) c0Var.a()).getStateData().getPinValue();
            this.f7228f = vq.j.a(c0Var);
            this.f7227e = 1;
            Object objZ9 = mVar.z9(c0Var, pinValue, this);
            return objZ9 == objE ? objE : objZ9;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<ak2.b.Verifying> c0Var, tq.e<? super k10.l<? extends ak2.b>> eVar) {
            return ((i) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            i iVar = m.this.new i(eVar);
            iVar.f7228f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lak2/a$e;", "<unused var>", "Lak2/b$c;", "Loq/i0;", "<anonymous>", "(Lak2/a$e;Lak2/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<a.e, ak2.b.Verifying, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7230e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7230e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                a.InterfaceC0156a.c cVar = a.InterfaceC0156a.c.f7142a;
                this.f7230e = 1;
                if (mVar.F(cVar, this) == objE) {
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
        public final Object w(a.e eVar, ak2.b.Verifying verifying, tq.e<? super i0> eVar2) {
            return m.this.new j(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lak2/a$d;", "<unused var>", "Lak2/b$c;", "Loq/i0;", "<anonymous>", "(Lak2/a$d;Lak2/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<a.d, ak2.b.Verifying, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7232e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7232e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                a.InterfaceC0156a.b bVar = a.InterfaceC0156a.b.f7141a;
                this.f7232e = 1;
                if (mVar.F(bVar, this) == objE) {
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
        public final Object w(a.d dVar, ak2.b.Verifying verifying, tq.e<? super i0> eVar) {
            return m.this.new k(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lak2/a$f;", "<unused var>", "Lak2/b$c;", "Loq/i0;", "<anonymous>", "(Lak2/a$f;Lak2/b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<a.f, ak2.b.Verifying, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7234e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7234e;
            if (i15 == 0) {
                oq.u.b(obj);
                m mVar = m.this;
                a.InterfaceC0156a.d dVar = a.InterfaceC0156a.d.f7143a;
                this.f7234e = 1;
                if (mVar.F(dVar, this) == objE) {
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
        public final Object w(a.f fVar, ak2.b.Verifying verifying, tq.e<? super i0> eVar) {
            return m.this.new l(eVar).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: ak2.m$m, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0160m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f7236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f7237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f7238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7239g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7240h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f7241j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f7242k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f7243l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7245n;

        C0160m(tq.e<? super C0160m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f7243l = obj;
            this.f7245n |= PKIFailureInfo.systemUnavail;
            return m.this.z9(null, null, this);
        }
    }

    public m(yy.a aVar, bk2.b bVar, ib4.c cVar, g04.l lVar, uj2.b bVar2, sj2.a aVar2, mx.c cVar2, lx.a aVar3, a14.l lVar2, ax0.c cVar3, final b14.b bVar3, ac4.e eVar, BiometricPinSetupData biometricPinSetupData) {
        this.mapper = bVar;
        this.genericDomainErrorMapper = cVar;
        this.getPasswordFromBiometricUseCase = lVar;
        this.loginToAppUseCase = bVar2;
        this.loginInteractor = aVar2;
        this.labelProvider = cVar2;
        this.keyboardManager = aVar3;
        this.getImeVisibleStateUseCase = lVar2;
        this.isAnyMainDocumentDownloadingUC = cVar3;
        this.biometricPinSetupData = biometricPinSetupData;
        ak2.b.Initialized initialized = new ak2.b.Initialized(new ak2.b.StateData(biometricPinSetupData.getBiometricResult(), b0.INSTANCE.a(), hz.b.C2039b.f86846c, "", eVar.a(gz.b.a.C1792a.f78542a), true, true));
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: ak2.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.v9(this.f7181a, bVar3, (v) obj);
            }
        });
        this.state = a9(new c(e9().getState(), this), s9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ak2.b.Initialized A9(m mVar, ak2.b.Verifying verifying) {
        return new ak2.b.Initialized(ak2.b.StateData.b(verifying.getStateData(), null, b0.INSTANCE.a(), new hz.b.Invalid(mVar.labelProvider.c(sj2.b.f182029j)), null, null, false, true, 57, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ak2.c.Data s9(ak2.b state) {
        return this.mapper.b(new bk2.b.Params(state, b9(a.g.f7151a), new er.l() { // from class: ak2.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.t9(this.f7179a, (b0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(m mVar, b0 b0Var) {
        mVar.d9(new a.OnPinChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final m mVar, final b14.b bVar, v vVar) {
        vVar.c(q0.c(ak2.b.class), new er.l() { // from class: ak2.g
            @Override // er.l
            public final Object b(Object obj) {
                return m.w9(this.f7175a, (z) obj);
            }
        });
        vVar.c(q0.c(ak2.b.Initialized.class), new er.l() { // from class: ak2.h
            @Override // er.l
            public final Object b(Object obj) {
                return m.x9(this.f7176a, bVar, (z) obj);
            }
        });
        vVar.c(q0.c(ak2.b.Verifying.class), new er.l() { // from class: ak2.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.y9(this.f7178a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(m mVar, z zVar) {
        d dVar = mVar.new d(null);
        zVar.x(q0.c(a.OnError.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(m mVar, b14.b bVar, z zVar) {
        zVar.A(new e(bVar, null));
        k10.k.m(zVar, (mu.g) mVar.getImeVisibleStateUseCase.a(gz.b.a.C1792a.f78542a), null, new f(null), 2, null);
        g gVar = mVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.g.class), oVar, gVar);
        zVar.v(q0.c(a.OnPinChanged.class), oVar, new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(m mVar, z zVar) {
        zVar.A(mVar.new i(null));
        j jVar = mVar.new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.e.class), oVar, jVar);
        zVar.x(q0.c(a.d.class), oVar, mVar.new k(null));
        zVar.x(q0.c(a.f.class), oVar, mVar.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0105  */
    /* JADX WARN: Code duplicated, block: B:36:0x011a  */
    /* JADX WARN: Code duplicated, block: B:38:0x011e  */
    /* JADX WARN: Code duplicated, block: B:40:0x012e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0179  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0156, code lost:
    
        if (r13 == r1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x019f, code lost:
    
        if (r13 == r1) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z9(k10.c0<ak2.b.Verifying> r11, iy.b0 r12, tq.e<? super k10.l<? extends ak2.b>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ak2.m.z9(k10.c0, iy.b0, tq.e):java.lang.Object");
    }

    @Override // zx.b
    public xw.b<a.InterfaceC0156a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ak2.b, a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ak2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a.InterfaceC0156a interfaceC0156a, tq.e<? super i0> eVar) {
        return super.F(interfaceC0156a, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ak2.c.Data data) {
        super.P5(data);
    }
}
