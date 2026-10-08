package h32;

import a14.w;
import d12.OAuthWebViewData;
import eo0.Directory;
import eo0.DirectoryResponse;
import eo0.OwnerAddress;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BI\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020#2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b$\u0010%J%\u0010*\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180(H\u0002¢\u0006\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R&\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030:8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020A0@8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER \u0010L\u001a\b\u0012\u0004\u0012\u00020G0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K¨\u0006M"}, d2 = {"Lh32/n;", "Ll00/g;", "Lh32/b;", "Lh32/a;", "", "Lh32/c;", "Lyy/a;", "stateMachineFactory", "Lp02/h;", "fetchDirectoriesUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Li32/b;", "personalInboxScreenMapper", "Lb12/c;", "electronicDeliveryErrorMapper", "La14/w;", "openUrlIntentUseCase", "Lp02/w;", "getOwnerAddressUseCase", "Li70/e;", "globalSnackBarManager", "<init>", "(Lyy/a;Lp02/h;Lac4/a;Li32/b;Lb12/c;La14/w;Lp02/w;Li70/e;)V", "Loq/i0;", "v9", "(Ltq/e;)Ljava/lang/Object;", "Lk10/c0;", "Lh32/b$a;", "state", "", "Leo0/q;", "directoryList", "", "faq", "Lk10/l;", "w9", "(Lk10/c0;Ljava/util/List;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "domainError", "Lkotlin/Function0;", "retryAction", "x9", "(Ldx/b;Ler/a;)V", "b", "Lp02/h;", "c", "Lac4/a;", "d", "Li32/b;", "e", "Lb12/c;", "f", "La14/w;", "g", "Lp02/w;", "h", "Li70/e;", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lh32/c$a;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lh32/a$h;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<h32.b, h32.a> implements zx.d, h32.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p02.h fetchDirectoriesUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i32.b personalInboxScreenMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b12.c electronicDeliveryErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p02.w getOwnerAddressUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<h32.b, h32.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<h32.c.a> state = a9(new c(e9().getState(), this), h32.c.a.C1840a.f80523a);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<h32.a.h> navAction = new xw.b<>();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80553e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f80553e;
            if (i15 == 0) {
                u.b(obj);
                p02.h hVar = n.this.fetchDirectoriesUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f80553e = 1;
                obj = hVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            n nVar = n.this;
            if (iVar instanceof dx.i.Left) {
                nVar.x9((dx.b) ((dx.i.Left) iVar).b(), nVar.b9(h32.a.e.f80499a));
            } else {
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                DirectoryResponse directoryResponse = (DirectoryResponse) ((dx.i.Right) iVar).b();
                nVar.d9(new h32.a.FetchOwnerAddress(directoryResponse.a(), directoryResponse.getFaq()));
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return n.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lh32/b;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super k10.l<? extends h32.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80555e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<Directory> f80557g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f80558h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ c0<h32.b.a> f80559j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<Directory> list, String str, c0<h32.b.a> c0Var, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f80557g = list;
            this.f80558h = str;
            this.f80559j = c0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h32.b.Initialized V(List list, String str, OwnerAddress ownerAddress, h32.b.a aVar) {
            return new h32.b.Initialized(list, str, ownerAddress, true);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f80555e;
            if (i15 == 0) {
                u.b(obj);
                p02.w wVar = n.this.getOwnerAddressUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f80555e = 1;
                obj = wVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            n nVar = n.this;
            final List<Directory> list = this.f80557g;
            final String str = this.f80558h;
            c0<h32.b.a> c0Var = this.f80559j;
            if (iVar instanceof dx.i.Left) {
                nVar.x9((dx.b) ((dx.i.Left) iVar).b(), nVar.b9(new h32.a.FetchOwnerAddress(list, str)));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final OwnerAddress ownerAddress = (OwnerAddress) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: h32.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.b.V(list, str, ownerAddress, (b.a) obj2);
                }
            });
        }

        public final tq.e<i0> N(tq.e<?> eVar) {
            return n.this.new b(this.f80557g, this.f80558h, this.f80559j, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super k10.l<? extends h32.b>> eVar) {
            return ((b) N(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<h32.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f80560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f80561b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f80562a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f80563b;

            /* JADX INFO: renamed from: h32.n$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1841a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f80564d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f80565e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f80566f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f80568h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f80569j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f80570k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f80571l;

                public C1841a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f80564d = obj;
                    this.f80565e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f80562a = hVar;
                this.f80563b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1841a c1841a;
                if (eVar instanceof C1841a) {
                    c1841a = (C1841a) eVar;
                    int i15 = c1841a.f80565e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1841a.f80565e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1841a = new C1841a(eVar);
                    }
                } else {
                    c1841a = new C1841a(eVar);
                }
                Object obj2 = c1841a.f80564d;
                Object objE = uq.b.e();
                int i16 = c1841a.f80565e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f80562a;
                    h32.c.a aVarB = this.f80563b.personalInboxScreenMapper.b(new i32.b.Params((h32.b) obj, this.f80563b.b9(h32.a.C1837a.f80495a), this.f80563b.b9(h32.a.k.f80516a), this.f80563b.b9(h32.a.d.f80498a), this.f80563b.new d(), this.f80563b.b9(h32.a.b.f80496a), this.f80563b.new e(), this.f80563b.b9(h32.a.l.f80517a)));
                    c1841a.f80566f = vq.j.a(obj);
                    c1841a.f80568h = vq.j.a(c1841a);
                    c1841a.f80569j = vq.j.a(obj);
                    c1841a.f80570k = vq.j.a(hVar);
                    c1841a.f80571l = 0;
                    c1841a.f80565e = 1;
                    if (hVar.F(aVarB, c1841a) == objE) {
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

        public c(mu.g gVar, n nVar) {
            this.f80560a = gVar;
            this.f80561b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h32.c.a> hVar, tq.e eVar) {
            Object objA = this.f80560a.a(new a(hVar, this.f80561b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.q<eo0.r, String, eo0.t, i0> {
        d() {
        }

        public final void c(String str, String str2, eo0.t tVar) {
            n.this.d9(new h32.a.OnInboxClick(str2, str, tVar, null));
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(eo0.r rVar, String str, eo0.t tVar) {
            c(rVar.getValue(), str, tVar);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.l<String, i0> {
        e() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(String str) {
            c(str);
            return i0.f148189a;
        }

        public final void c(String str) {
            n.this.d9(new h32.a.OnLinkClick(str));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh32/a$a;", "<unused var>", "Lh32/b;", "Loq/i0;", "<anonymous>", "(Lh32/a$a;Lh32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<h32.a.C1837a, h32.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80574e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f80574e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<h32.a.h> bVarY1 = n.this.Y1();
                h32.a.h.C1838a c1838a = h32.a.h.C1838a.f80503a;
                this.f80574e = 1;
                if (bVarY1.F(c1838a, this) == objE) {
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
        public final Object w(h32.a.C1837a c1837a, h32.b bVar, tq.e<? super i0> eVar) {
            return n.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh32/a$c;", "action", "Lh32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh32/a$c;Lh32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<h32.a.Error, h32.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80577f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h32.a.Error error = (h32.a.Error) this.f80577f;
            Object objE = uq.b.e();
            int i15 = this.f80576e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<h32.a.h> bVarY1 = n.this.Y1();
                h32.a.h.Error error2 = new h32.a.h.Error(error.getError());
                this.f80577f = vq.j.a(error);
                this.f80576e = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        public final Object w(h32.a.Error error, h32.b bVar, tq.e<? super i0> eVar) {
            g gVar = n.this.new g(eVar);
            gVar.f80577f = error;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh32/b$a;", "it", "Loq/i0;", "<anonymous>", "(Lh32/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<h32.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80579e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f80579e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                this.f80579e = 1;
                if (nVar.v9(this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h32.b.a aVar, tq.e<? super i0> eVar) {
            return ((h) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return n.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh32/a$g;", "action", "Lh32/b$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh32/a$g;Lh32/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<h32.a.GoToAuthorization, h32.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80581e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80582f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(h32.a.GoToAuthorization goToAuthorization) {
            goToAuthorization.a().a();
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final h32.a.GoToAuthorization goToAuthorization = (h32.a.GoToAuthorization) this.f80582f;
            Object objE = uq.b.e();
            int i15 = this.f80581e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<h32.a.h> bVarY1 = n.this.Y1();
                h32.a.h.GoToAuthorization goToAuthorization2 = new h32.a.h.GoToAuthorization(new OAuthWebViewData(new er.a() { // from class: h32.p
                    @Override // er.a
                    public final Object a() {
                        return n.i.O(goToAuthorization);
                    }
                }));
                this.f80582f = vq.j.a(goToAuthorization);
                this.f80581e = 1;
                if (bVarY1.F(goToAuthorization2, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h32.a.GoToAuthorization goToAuthorization, h32.b.a aVar, tq.e<? super i0> eVar) {
            i iVar = n.this.new i(eVar);
            iVar.f80582f = goToAuthorization;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh32/a$e;", "<unused var>", "Lh32/b$a;", "Loq/i0;", "<anonymous>", "(Lh32/a$e;Lh32/b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<h32.a.e, h32.b.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80584e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f80584e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                this.f80584e = 1;
                if (nVar.v9(this) == objE) {
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
        public final Object w(h32.a.e eVar, h32.b.a aVar, tq.e<? super i0> eVar2) {
            return n.this.new j(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh32/a$f;", "action", "Lk10/c0;", "Lh32/b$a;", "state", "Lk10/l;", "Lh32/b;", "<anonymous>", "(Lh32/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<h32.a.FetchOwnerAddress, c0<h32.b.a>, tq.e<? super k10.l<? extends h32.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80587f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80588g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h32.a.FetchOwnerAddress fetchOwnerAddress = (h32.a.FetchOwnerAddress) this.f80587f;
            c0 c0Var = (c0) this.f80588g;
            Object objE = uq.b.e();
            int i15 = this.f80586e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            n nVar = n.this;
            List<Directory> listA = fetchOwnerAddress.a();
            String faq = fetchOwnerAddress.getFaq();
            this.f80587f = vq.j.a(fetchOwnerAddress);
            this.f80588g = vq.j.a(c0Var);
            this.f80586e = 1;
            Object objW9 = nVar.w9(c0Var, listA, faq, this);
            return objW9 == objE ? objE : objW9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h32.a.FetchOwnerAddress fetchOwnerAddress, c0<h32.b.a> c0Var, tq.e<? super k10.l<? extends h32.b>> eVar) {
            k kVar = n.this.new k(eVar);
            kVar.f80587f = fetchOwnerAddress;
            kVar.f80588g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh32/a$i;", "action", "Lh32/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh32/a$i;Lh32/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<h32.a.OnInboxClick, h32.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80591f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h32.a.OnInboxClick onInboxClick = (h32.a.OnInboxClick) this.f80591f;
            Object objE = uq.b.e();
            int i15 = this.f80590e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<h32.a.h> bVarY1 = n.this.Y1();
                h32.a.h.MessagesList messagesList = new h32.a.h.MessagesList(onInboxClick.getName(), onInboxClick.getDirectoryId(), onInboxClick.getType(), null);
                this.f80591f = vq.j.a(onInboxClick);
                this.f80590e = 1;
                if (bVarY1.F(messagesList, this) == objE) {
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
        public final Object w(h32.a.OnInboxClick onInboxClick, h32.b.Initialized initialized, tq.e<? super i0> eVar) {
            l lVar = n.this.new l(eVar);
            lVar.f80591f = onInboxClick;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh32/a$k;", "<unused var>", "Lh32/b$b;", "Loq/i0;", "<anonymous>", "(Lh32/a$k;Lh32/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<h32.a.k, h32.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80593e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f80593e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<h32.a.h> bVarY1 = n.this.Y1();
                h32.a.h.g gVar = h32.a.h.g.f80511a;
                this.f80593e = 1;
                if (bVarY1.F(gVar, this) == objE) {
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
        public final Object w(h32.a.k kVar, h32.b.Initialized initialized, tq.e<? super i0> eVar) {
            return n.this.new m(eVar).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: h32.n$n, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh32/a$d;", "<unused var>", "Lh32/b$b;", "state", "Loq/i0;", "<anonymous>", "(Lh32/a$d;Lh32/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C1842n extends vq.k implements er.q<h32.a.d, h32.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80595e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80596f;

        C1842n(tq.e<? super C1842n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h32.b.Initialized initialized = (h32.b.Initialized) this.f80596f;
            Object objE = uq.b.e();
            int i15 = this.f80595e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<h32.a.h> bVarY1 = n.this.Y1();
                h32.a.h.Faq faq = new h32.a.h.Faq(initialized.getFaq());
                this.f80596f = vq.j.a(initialized);
                this.f80595e = 1;
                if (bVarY1.F(faq, this) == objE) {
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
        public final Object w(h32.a.d dVar, h32.b.Initialized initialized, tq.e<? super i0> eVar) {
            C1842n c1842n = n.this.new C1842n(eVar);
            c1842n.f80596f = initialized;
            return c1842n.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lh32/a$b;", "<unused var>", "Lk10/c0;", "Lh32/b$b;", "state", "Lk10/l;", "Lh32/b;", "<anonymous>", "(Lh32/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<h32.a.b, c0<h32.b.Initialized>, tq.e<? super k10.l<? extends h32.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80598e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80599f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h32.b.Initialized O(h32.b.Initialized initialized) {
            return h32.b.Initialized.b(initialized, null, null, null, false, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f80599f;
            uq.b.e();
            if (this.f80598e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: h32.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.o.O((b.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(h32.a.b bVar, c0<h32.b.Initialized> c0Var, tq.e<? super k10.l<? extends h32.b>> eVar) {
            o oVar = new o(eVar);
            oVar.f80599f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lh32/a$j;", "action", "Lh32/b$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lh32/a$j;Lh32/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<h32.a.OnLinkClick, h32.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f80601f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            h32.a.OnLinkClick onLinkClick = (h32.a.OnLinkClick) this.f80601f;
            Object objE = uq.b.e();
            int i15 = this.f80600e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = n.this.openUrlIntentUseCase;
                w.Params params = new w.Params(onLinkClick.getUrl(), false, 2, null);
                this.f80601f = vq.j.a(onLinkClick);
                this.f80600e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            n nVar = n.this;
            if (iVar instanceof dx.i.Left) {
                nVar.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(h32.a.OnLinkClick onLinkClick, h32.b.Initialized initialized, tq.e<? super i0> eVar) {
            p pVar = n.this.new p(eVar);
            pVar.f80601f = onLinkClick;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lh32/a$l;", "<unused var>", "Lh32/b$b;", "Loq/i0;", "<anonymous>", "(Lh32/a$l;Lh32/b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<h32.a.l, h32.b.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f80603e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f80603e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<h32.a.h> bVarY1 = n.this.Y1();
                h32.a.h.GoToWriteMessage goToWriteMessage = new h32.a.h.GoToWriteMessage(z02.a.c.f231893a);
                this.f80603e = 1;
                if (bVarY1.F(goToWriteMessage, this) == objE) {
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
        public final Object w(h32.a.l lVar, h32.b.Initialized initialized, tq.e<? super i0> eVar) {
            return n.this.new q(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, p02.h hVar, ac4.a aVar2, i32.b bVar, b12.c cVar, w wVar, p02.w wVar2, i70.e eVar) {
        this.fetchDirectoriesUseCase = hVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.personalInboxScreenMapper = bVar;
        this.electronicDeliveryErrorMapper = cVar;
        this.openUrlIntentUseCase = wVar;
        this.getOwnerAddressUseCase = wVar2;
        this.globalSnackBarManager = eVar;
        this.stateMachine = aVar.a(h32.b.a.f80518a, new er.l() { // from class: h32.i
            @Override // er.l
            public final Object b(Object obj) {
                return n.A9(this.f80538a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final n nVar, v vVar) {
        vVar.c(q0.c(h32.b.class), new er.l() { // from class: h32.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.B9(this.f80539a, (z) obj);
            }
        });
        vVar.c(q0.c(h32.b.a.class), new er.l() { // from class: h32.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.C9(this.f80540a, (z) obj);
            }
        });
        vVar.c(q0.c(h32.b.Initialized.class), new er.l() { // from class: h32.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.D9(this.f80541a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(n nVar, z zVar) {
        f fVar = nVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(h32.a.C1837a.class), oVar, fVar);
        zVar.x(q0.c(h32.a.Error.class), oVar, nVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(n nVar, z zVar) {
        zVar.C(nVar.new h(null));
        i iVar = nVar.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(h32.a.GoToAuthorization.class), oVar, iVar);
        zVar.x(q0.c(h32.a.e.class), oVar, nVar.new j(null));
        zVar.v(q0.c(h32.a.FetchOwnerAddress.class), oVar, nVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(n nVar, z zVar) {
        l lVar = nVar.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(h32.a.OnInboxClick.class), oVar, lVar);
        zVar.x(q0.c(h32.a.k.class), oVar, nVar.new m(null));
        zVar.x(q0.c(h32.a.d.class), oVar, nVar.new C1842n(null));
        zVar.v(q0.c(h32.a.b.class), oVar, new o(null));
        zVar.x(q0.c(h32.a.OnLinkClick.class), oVar, nVar.new p(null));
        zVar.x(q0.c(h32.a.l.class), oVar, nVar.new q(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v9(tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w9(c0<h32.b.a> c0Var, List<Directory> list, String str, tq.e<? super k10.l<? extends h32.b>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(list, str, c0Var, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x9(dx.b domainError, er.a<i0> retryAction) {
        this.electronicDeliveryErrorMapper.c(new b12.c.Params(domainError, b9(new h32.a.GoToAuthorization(retryAction)), b9(h32.a.C1837a.f80495a), retryAction, new er.l() { // from class: h32.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.y9(this.f80542a, (jb4.b) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(n nVar, jb4.b bVar) {
        nVar.d9(new h32.a.Error(bVar));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<h32.a.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<h32.b, h32.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h32.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
