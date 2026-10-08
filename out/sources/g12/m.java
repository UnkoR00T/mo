package g12;

import d12.OAuthWebViewData;
import fr.q0;
import go0.g0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R&\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030%8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lg12/m;", "Ll00/g;", "Lg12/b;", "Lg12/a;", "Lg12/c;", "", "Lyy/a;", "stateMachineFactory", "Lh12/b;", "agreementsScreenMapper", "Lib4/c;", "genericDomainErrorMapper", "Lgo0/g0;", "sendAgreementUseCase", "Lmx/c;", "labelProvider", "Leo0/e$b;", "agreementData", "<init>", "(Lyy/a;Lh12/b;Lib4/c;Lgo0/g0;Lmx/c;Leo0/e$b;)V", "Loq/i0;", "t9", "(Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "r9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "b", "Lh12/b;", "c", "Lib4/c;", "d", "Lgo0/g0;", "e", "Lmx/c;", "f", "Leo0/e$b;", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lg12/a$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lg12/c$a;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<g12.b, g12.a> implements g12.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h12.b agreementsScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g0 sendAgreementUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final eo0.e.NotAccepted agreementData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<g12.b, g12.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<g12.a.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<g12.c.a> state = a9(new b(e9().getState(), this), g12.c.a.C1565a.f69612a);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f69638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f69639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f69640f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f69641g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f69642h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f69644k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f69642h = obj;
            this.f69644k |= PKIFailureInfo.systemUnavail;
            return m.this.t9(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<g12.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f69645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f69646b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f69647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f69648b;

            /* JADX INFO: renamed from: g12.m$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1566a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f69649d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f69650e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f69651f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f69653h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f69654j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f69655k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f69656l;

                public C1566a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f69649d = obj;
                    this.f69650e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f69647a = hVar;
                this.f69648b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1566a c1566a;
                if (eVar instanceof C1566a) {
                    c1566a = (C1566a) eVar;
                    int i15 = c1566a.f69650e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1566a.f69650e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1566a = new C1566a(eVar);
                    }
                } else {
                    c1566a = new C1566a(eVar);
                }
                Object obj2 = c1566a.f69649d;
                Object objE = uq.b.e();
                int i16 = c1566a.f69650e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f69647a;
                    g12.c.a aVarB = this.f69648b.agreementsScreenMapper.b(new h12.b.Params((g12.b) obj, this.f69648b.b9(g12.a.C1561a.f69599a), this.f69648b.new c(), this.f69648b.new d(), this.f69648b.b9(g12.a.c.f69604a)));
                    c1566a.f69651f = vq.j.a(obj);
                    c1566a.f69653h = vq.j.a(c1566a);
                    c1566a.f69654j = vq.j.a(obj);
                    c1566a.f69655k = vq.j.a(hVar);
                    c1566a.f69656l = 0;
                    c1566a.f69650e = 1;
                    if (hVar.F(aVarB, c1566a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, m mVar) {
            this.f69645a = gVar;
            this.f69646b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g12.c.a> hVar, tq.e eVar) {
            Object objA = this.f69645a.a(new a(hVar, this.f69646b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.l<Boolean, i0> {
        c() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Boolean bool) {
            c(bool.booleanValue());
            return i0.f148189a;
        }

        public final void c(boolean z15) {
            m.this.d9(new g12.a.TogglePermission(z15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.l<String, i0> {
        d() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(String str) {
            c(str);
            return i0.f148189a;
        }

        public final void c(String str) {
            m.this.d9(new g12.a.ToAgreementDetails(str));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg12/a$a;", "<unused var>", "Lg12/b;", "Loq/i0;", "<anonymous>", "(Lg12/a$a;Lg12/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<g12.a.C1561a, g12.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69659e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f69659e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<g12.a.b> bVarY1 = m.this.Y1();
                g12.a.b.C1562a c1562a = g12.a.b.C1562a.f69600a;
                this.f69659e = 1;
                if (bVarY1.F(c1562a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(g12.a.C1561a c1561a, g12.b bVar, tq.e<? super i0> eVar) {
            return m.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lg12/b$a;", "state", "Lk10/l;", "Lg12/b;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<c0<g12.b.a>, tq.e<? super k10.l<? extends g12.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69661e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69662f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g12.b.Initialized O(m mVar, g12.b.a aVar) {
            return new g12.b.Initialized(mVar.agreementData, false, null, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f69662f;
            uq.b.e();
            if (this.f69661e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final m mVar = m.this;
            return c0Var.d(new er.l() { // from class: g12.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.f.O(mVar, (b.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<g12.b.a> c0Var, tq.e<? super k10.l<? extends g12.b>> eVar) {
            return ((f) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = m.this.new f(eVar);
            fVar.f69662f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg12/a$f;", "action", "Lk10/c0;", "Lg12/b$b;", "state", "Lk10/l;", "Lg12/b;", "<anonymous>", "(Lg12/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<g12.a.TogglePermission, c0<g12.b.Initialized>, tq.e<? super k10.l<? extends g12.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69664e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69665f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f69666g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g12.b.Initialized O(g12.a.TogglePermission togglePermission, g12.b.Initialized initialized) {
            return g12.b.Initialized.b(initialized, null, togglePermission.getIsGranted(), hz.b.C2039b.f86846c, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final g12.a.TogglePermission togglePermission = (g12.a.TogglePermission) this.f69665f;
            c0 c0Var = (c0) this.f69666g;
            uq.b.e();
            if (this.f69664e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: g12.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.g.O(togglePermission, (b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g12.a.TogglePermission togglePermission, c0<g12.b.Initialized> c0Var, tq.e<? super k10.l<? extends g12.b>> eVar) {
            g gVar = new g(eVar);
            gVar.f69665f = togglePermission;
            gVar.f69666g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lg12/a$d;", "action", "Lg12/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lg12/a$d;Lg12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<g12.a.ToAgreementDetails, g12.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69668f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g12.a.ToAgreementDetails toAgreementDetails = (g12.a.ToAgreementDetails) this.f69668f;
            Object objE = uq.b.e();
            int i15 = this.f69667e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<g12.a.b> bVarY1 = m.this.Y1();
                g12.a.b.ToAgreementDetails toAgreementDetails2 = new g12.a.b.ToAgreementDetails(toAgreementDetails.getFullDescription());
                this.f69668f = vq.j.a(toAgreementDetails);
                this.f69667e = 1;
                if (bVarY1.F(toAgreementDetails2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(g12.a.ToAgreementDetails toAgreementDetails, g12.b.Initialized initialized, tq.e<? super i0> eVar) {
            h hVar = m.this.new h(eVar);
            hVar.f69668f = toAgreementDetails;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lg12/a$e;", "<unused var>", "Lg12/b$b;", "Loq/i0;", "<anonymous>", "(Lg12/a$e;Lg12/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<g12.a.e, g12.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69670e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f69670e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<g12.a.b> bVarY1 = m.this.Y1();
                g12.a.b.ToAuthorization toAuthorization = new g12.a.b.ToAuthorization(new OAuthWebViewData(null, 1, null));
                this.f69670e = 1;
                if (bVarY1.F(toAuthorization, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(g12.a.e eVar, g12.b.Initialized initialized, tq.e<? super i0> eVar2) {
            return m.this.new i(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lg12/a$c;", "<unused var>", "Lk10/c0;", "Lg12/b$b;", "state", "Lk10/l;", "Lg12/b;", "<anonymous>", "(Lg12/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<g12.a.c, c0<g12.b.Initialized>, tq.e<? super k10.l<? extends g12.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f69672e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f69673f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final g12.b.Initialized O(m mVar, g12.b.Initialized initialized) {
            return g12.b.Initialized.b(initialized, null, false, new hz.b.Invalid(mVar.labelProvider.c(e02.a.U3)), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f69673f;
            Object objE = uq.b.e();
            int i15 = this.f69672e;
            if (i15 == 0) {
                u.b(obj);
                if (!((g12.b.Initialized) c0Var.a()).getIsGranted()) {
                    final m mVar = m.this;
                    return c0Var.b(new er.l() { // from class: g12.p
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return m.j.O(mVar, (b.Initialized) obj2);
                        }
                    });
                }
                m mVar2 = m.this;
                this.f69673f = c0Var;
                this.f69672e = 1;
                if (mVar2.t9(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(g12.a.c cVar, c0<g12.b.Initialized> c0Var, tq.e<? super k10.l<? extends g12.b>> eVar) {
            j jVar = m.this.new j(eVar);
            jVar.f69673f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, h12.b bVar, ib4.c cVar, g0 g0Var, mx.c cVar2, eo0.e.NotAccepted notAccepted) {
        this.agreementsScreenMapper = bVar;
        this.genericDomainErrorMapper = cVar;
        this.sendAgreementUseCase = g0Var;
        this.labelProvider = cVar2;
        this.agreementData = notAccepted;
        this.stateMachine = aVar.a(g12.b.a.f69608a, new er.l() { // from class: g12.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.v9(this.f69629a, (v) obj);
            }
        });
    }

    private final Object r9(dx.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new g12.a.b.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: g12.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.s9(this.f69628a, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(m mVar, ib4.c.b bVar) {
        mVar.d9(g12.a.C1561a.f69599a);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r9(r2, r0) == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t9(tq.e<? super oq.i0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof g12.m.a
            if (r0 == 0) goto L13
            r0 = r6
            g12.m$a r0 = (g12.m.a) r0
            int r1 = r0.f69644k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f69644k = r1
            goto L18
        L13:
            g12.m$a r0 = new g12.m$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f69642h
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f69644k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.f69639e
            dx.b r1 = (dx.b) r1
            java.lang.Object r0 = r0.f69638d
            dx.i r0 = (dx.i) r0
            oq.u.b(r6)
            goto L8a
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            oq.u.b(r6)
            goto L50
        L40:
            oq.u.b(r6)
            go0.g0 r6 = r5.sendAgreementUseCase
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            r0.f69644k = r4
            java.lang.Object r6 = r6.c(r2, r0)
            if (r6 != r1) goto L50
            goto L78
        L50:
            dx.i r6 = (dx.i) r6
            boolean r2 = r6 instanceof dx.i.Left
            if (r2 == 0) goto L79
            r2 = r6
            dx.i$b r2 = (dx.i.Left) r2
            java.lang.Object r2 = r2.b()
            dx.b r2 = (dx.b) r2
            java.lang.Object r6 = vq.j.a(r6)
            r0.f69638d = r6
            java.lang.Object r6 = vq.j.a(r2)
            r0.f69639e = r6
            r6 = 0
            r0.f69640f = r6
            r0.f69641g = r6
            r0.f69644k = r3
            java.lang.Object r6 = r5.r9(r2, r0)
            if (r6 != r1) goto L8a
        L78:
            return r1
        L79:
            boolean r0 = r6 instanceof dx.i.Right
            if (r0 == 0) goto L8d
            dx.i$c r6 = (dx.i.Right) r6
            java.lang.Object r6 = r6.b()
            oq.i0 r6 = (oq.i0) r6
            g12.a$e r6 = g12.a.e.f69606a
            r5.d9(r6)
        L8a:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        L8d:
            oq.p r6 = new oq.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g12.m.t9(tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(final m mVar, v vVar) {
        vVar.c(q0.c(g12.b.class), new er.l() { // from class: g12.h
            @Override // er.l
            public final Object b(Object obj) {
                return m.w9(this.f69625a, (z) obj);
            }
        });
        vVar.c(q0.c(g12.b.a.class), new er.l() { // from class: g12.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.x9(this.f69626a, (z) obj);
            }
        });
        vVar.c(q0.c(g12.b.Initialized.class), new er.l() { // from class: g12.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.y9(this.f69627a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(m mVar, z zVar) {
        e eVar = mVar.new e(null);
        zVar.x(q0.c(g12.a.C1561a.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(m mVar, z zVar) {
        zVar.A(mVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(m mVar, z zVar) {
        g gVar = new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(g12.a.TogglePermission.class), oVar, gVar);
        zVar.x(q0.c(g12.a.ToAgreementDetails.class), oVar, mVar.new h(null));
        zVar.x(q0.c(g12.a.e.class), oVar, mVar.new i(null));
        zVar.v(q0.c(g12.a.c.class), oVar, mVar.new j(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<g12.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<g12.b, g12.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g12.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(eo0.e.NotAccepted notAccepted) {
        super.P5(notAccepted);
    }
}
