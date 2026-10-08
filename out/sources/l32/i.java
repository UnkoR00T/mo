package l32;

import d12.OAuthWebViewData;
import er.p;
import er.q;
import fr.q0;
import go0.m;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004BI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001cJ\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@¢\u0006\u0004\b \u0010!R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003008\u0014X\u0094\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010<\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00170=8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Ll32/i;", "Ll00/g;", "Ll32/b;", "Ll32/a;", "", "Lyy/a;", "stateMachineFactory", "Lgo0/m;", "getAgreementTypeUseCase", "Ls02/d;", "getStoredOwTokensUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lk02/a;", "electronicDeliveryContainersInteractor", "Lib4/c;", "genericDomainErrorMapper", "Lgx/d;", "globalEventManager", "Lm32/a;", "startScreenErrorMapper", "<init>", "(Lyy/a;Lgo0/m;Ls02/d;Lac4/a;Lk02/a;Lib4/c;Lgx/d;Lm32/a;)V", "Ll32/c;", "u9", "()Ll32/c;", "Loq/i0;", "y9", "(Ltq/e;)Ljava/lang/Object;", "r9", "Ldx/b;", "domainError", "s9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "b", "Lgo0/m;", "c", "Ls02/d;", "d", "Lac4/a;", "e", "Lk02/a;", "f", "Lib4/c;", "g", "Lgx/d;", "h", "Lm32/a;", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ll32/a$d;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends l00.g<l32.b, l32.a> implements l00.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m getAgreementTypeUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s02.d getStoredOwTokensUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k02.a electronicDeliveryContainersInteractor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final m32.a startScreenErrorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<l32.b, l32.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<l32.a.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p0<l32.c> state = a9(new b(e9().getState(), this), l32.c.f115779a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f115795e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f115796f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f115797g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f115798h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f115799j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f115800k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f115801l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f115802m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115803n;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ee A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:39:0x00f0  */
        /* JADX WARN: Code duplicated, block: B:42:0x0101  */
        /* JADX WARN: Code duplicated, block: B:45:0x012a  */
        /* JADX WARN: Code duplicated, block: B:47:0x012e  */
        /* JADX WARN: Code duplicated, block: B:48:0x013c  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
        
            if (r5.s9(r13, r12) == r0) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0127, code lost:
        
            if (r5.s9(r8, r12) == r0) goto L44;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 351
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: l32.i.a.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<l32.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f115805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f115806b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f115807a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f115808b;

            /* JADX INFO: renamed from: l32.i$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2792a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f115809d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f115810e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f115811f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f115813h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f115814j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f115815k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f115816l;

                public C2792a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f115809d = obj;
                    this.f115810e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, i iVar) {
                this.f115807a = hVar;
                this.f115808b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2792a c2792a;
                if (eVar instanceof C2792a) {
                    c2792a = (C2792a) eVar;
                    int i15 = c2792a.f115810e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2792a.f115810e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2792a = new C2792a(eVar);
                    }
                } else {
                    c2792a = new C2792a(eVar);
                }
                Object obj2 = c2792a.f115809d;
                Object objE = uq.b.e();
                int i16 = c2792a.f115810e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f115807a;
                    l32.c cVarU9 = this.f115808b.u9();
                    c2792a.f115811f = vq.j.a(obj);
                    c2792a.f115813h = vq.j.a(c2792a);
                    c2792a.f115814j = vq.j.a(obj);
                    c2792a.f115815k = vq.j.a(hVar);
                    c2792a.f115816l = 0;
                    c2792a.f115810e = 1;
                    if (hVar.F(cVarU9, c2792a) == objE) {
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

        public b(mu.g gVar, i iVar) {
            this.f115805a = gVar;
            this.f115806b = iVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super l32.c> hVar, tq.e eVar) {
            Object objA = this.f115805a.a(new a(hVar, this.f115806b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll32/b;", "it", "Loq/i0;", "<anonymous>", "(Ll32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<l32.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115817e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f115817e;
            if (i15 == 0) {
                u.b(obj);
                i iVar = i.this;
                this.f115817e = 1;
                if (iVar.y9(this) == objE) {
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
        public final Object B(l32.b bVar, tq.e<? super i0> eVar) {
            return ((c) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return i.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll32/a$a;", "<unused var>", "Ll32/b;", "Loq/i0;", "<anonymous>", "(Ll32/a$a;Ll32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<l32.a.C2789a, l32.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115819e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f115819e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<l32.a.d> bVarY1 = i.this.Y1();
                l32.a.d.C2790a c2790a = l32.a.d.C2790a.f115769a;
                this.f115819e = 1;
                if (bVarY1.F(c2790a, this) == objE) {
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
        public final Object w(l32.a.C2789a c2789a, l32.b bVar, tq.e<? super i0> eVar) {
            return i.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll32/a$h;", "<unused var>", "Ll32/b;", "Loq/i0;", "<anonymous>", "(Ll32/a$h;Ll32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements q<l32.a.h, l32.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115821e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f115821e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<l32.a.d> bVarY1 = i.this.Y1();
                l32.a.d.e eVar = l32.a.d.e.f115773a;
                this.f115821e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(l32.a.h hVar, l32.b bVar, tq.e<? super i0> eVar) {
            return i.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll32/a$f;", "<unused var>", "Ll32/b;", "Loq/i0;", "<anonymous>", "(Ll32/a$f;Ll32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<l32.a.f, l32.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115823e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f115823e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            i.this.globalEventManager.c(new zw0.a.ToAddDocument(false, zw0.a.ToAddDocument.EnumC6430a.IDENTITY_CARD, false, false, null, 28, null));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l32.a.f fVar, l32.b bVar, tq.e<? super i0> eVar) {
            return i.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ll32/a$c;", "action", "Ll32/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ll32/a$c;Ll32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<l32.a.GoToAgreements, l32.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f115826f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            l32.a.GoToAgreements goToAgreements = (l32.a.GoToAgreements) this.f115826f;
            Object objE = uq.b.e();
            int i15 = this.f115825e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<l32.a.d> bVarY1 = i.this.Y1();
                l32.a.d.GoToAgreements goToAgreements2 = new l32.a.d.GoToAgreements(goToAgreements.getAgreementData());
                this.f115826f = vq.j.a(goToAgreements);
                this.f115825e = 1;
                if (bVarY1.F(goToAgreements2, this) == objE) {
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
        public final Object w(l32.a.GoToAgreements goToAgreements, l32.b bVar, tq.e<? super i0> eVar) {
            g gVar = i.this.new g(eVar);
            gVar.f115826f = goToAgreements;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll32/a$g;", "<unused var>", "Ll32/b;", "Loq/i0;", "<anonymous>", "(Ll32/a$g;Ll32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements q<l32.a.g, l32.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115828e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f115828e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<l32.a.d> bVarY1 = i.this.Y1();
                l32.a.d.ToAuthorization toAuthorization = new l32.a.d.ToAuthorization(new OAuthWebViewData(null, 1, null));
                this.f115828e = 1;
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
        public final Object w(l32.a.g gVar, l32.b bVar, tq.e<? super i0> eVar) {
            return i.this.new h(eVar).J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: l32.i$i, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll32/a$b;", "<unused var>", "Ll32/b;", "Loq/i0;", "<anonymous>", "(Ll32/a$b;Ll32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C2793i extends vq.k implements q<l32.a.b, l32.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115830e;

        C2793i(tq.e<? super C2793i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f115830e;
            if (i15 == 0) {
                u.b(obj);
                i iVar = i.this;
                this.f115830e = 1;
                if (iVar.r9(this) == objE) {
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
        public final Object w(l32.a.b bVar, l32.b bVar2, tq.e<? super i0> eVar) {
            return i.this.new C2793i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ll32/a$e;", "<unused var>", "Ll32/b;", "Loq/i0;", "<anonymous>", "(Ll32/a$e;Ll32/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements q<l32.a.e, l32.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f115832e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f115832e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            i.this.d9(l32.a.b.f115767a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(l32.a.e eVar, l32.b bVar, tq.e<? super i0> eVar2) {
            return i.this.new j(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f115834d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f115835e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f115836f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f115837g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f115839j;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f115837g = obj;
            this.f115839j |= PKIFailureInfo.systemUnavail;
            return i.this.y9(this);
        }
    }

    public i(yy.a aVar, m mVar, s02.d dVar, ac4.a aVar2, k02.a aVar3, ib4.c cVar, gx.d dVar2, m32.a aVar4) {
        this.getAgreementTypeUseCase = mVar;
        this.getStoredOwTokensUC = dVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.electronicDeliveryContainersInteractor = aVar3;
        this.genericDomainErrorMapper = cVar;
        this.globalEventManager = dVar2;
        this.startScreenErrorMapper = aVar4;
        this.stateMachine = aVar.a(l32.b.f115778a, new er.l() { // from class: l32.f
            @Override // er.l
            public final Object b(Object obj) {
                return i.w9(this.f115781a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r9(tq.e<? super i0> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new a(null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s9(final dx.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new l32.a.d.Error(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: l32.h
            @Override // er.l
            public final Object b(Object obj) {
                return i.t9(this.f115783a, bVar, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(i iVar, dx.b bVar, ib4.c.b bVar2) {
        if (fr.t.c(bVar2, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            iVar.d9(l32.a.e.f115774a);
        } else if (bVar2 instanceof ib4.c.b.a.Primary) {
            if (bVar instanceof dx.b.Business) {
                dx.b.Business.a type = ((dx.b.Business) bVar).getType();
                if (type == n32.a.STUDENT_ERROR) {
                    iVar.d9(l32.a.f.f115775a);
                } else if (type == n32.a.REFUGEE_ERROR) {
                    iVar.d9(l32.a.C2789a.f115766a);
                }
            } else {
                iVar.d9(l32.a.C2789a.f115766a);
            }
        } else {
            if (!(bVar2 instanceof ib4.c.b.a.Secondary) && !(bVar2 instanceof ib4.c.b.a.Close) && !fr.t.c(bVar2, ib4.c.b.AbstractC2161b.a.f90859a)) {
                throw new oq.p();
            }
            iVar.d9(l32.a.C2789a.f115766a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l32.c u9() {
        return l32.c.f115779a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(final i iVar, v vVar) {
        vVar.c(q0.c(l32.b.class), new er.l() { // from class: l32.g
            @Override // er.l
            public final Object b(Object obj) {
                return i.x9(this.f115782a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(i iVar, z zVar) {
        zVar.C(iVar.new c(null));
        d dVar = iVar.new d(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(l32.a.C2789a.class), oVar, dVar);
        zVar.x(q0.c(l32.a.h.class), oVar, iVar.new e(null));
        zVar.x(q0.c(l32.a.f.class), oVar, iVar.new f(null));
        zVar.x(q0.c(l32.a.GoToAgreements.class), oVar, iVar.new g(null));
        zVar.x(q0.c(l32.a.g.class), oVar, iVar.new h(null));
        zVar.x(q0.c(l32.a.b.class), oVar, iVar.new C2793i(null));
        zVar.x(q0.c(l32.a.e.class), oVar, iVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (s9(r2, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y9(tq.e<? super oq.i0> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof l32.i.k
            if (r0 == 0) goto L13
            r0 = r6
            l32.i$k r0 = (l32.i.k) r0
            int r1 = r0.f115839j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115839j = r1
            goto L18
        L13:
            l32.i$k r0 = new l32.i$k
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f115837g
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f115839j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r1 = r0.f115835e
            dx.b$c r1 = (dx.b.Business) r1
            java.lang.Object r0 = r0.f115834d
            rq0.b r0 = (rq0.b) r0
            oq.u.b(r6)
            goto L85
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            oq.u.b(r6)
            goto L4e
        L40:
            oq.u.b(r6)
            k02.a r6 = r5.electronicDeliveryContainersInteractor
            r0.f115839j = r4
            java.lang.Object r6 = r6.e(r0)
            if (r6 != r1) goto L4e
            goto L84
        L4e:
            dx.i r6 = (dx.i) r6
            java.lang.Object r6 = r6.a()
            rq0.b r6 = (rq0.b) r6
            if (r6 == 0) goto L85
            rq0.b$d r2 = rq0.b.d.ID_CARD
            if (r6 != r2) goto L62
            l32.a$b r6 = l32.a.b.f115767a
            r5.d9(r6)
            goto L85
        L62:
            m32.a r2 = r5.startScreenErrorMapper
            m32.a$a r4 = new m32.a$a
            r4.<init>(r6)
            dx.b$c r2 = r2.b(r4)
            java.lang.Object r6 = vq.j.a(r6)
            r0.f115834d = r6
            java.lang.Object r6 = vq.j.a(r2)
            r0.f115835e = r6
            r6 = 0
            r0.f115836f = r6
            r0.f115839j = r3
            java.lang.Object r6 = r5.s9(r2, r0)
            if (r6 != r1) goto L85
        L84:
            return r1
        L85:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l32.i.y9(tq.e):java.lang.Object");
    }

    @Override // zx.b
    public xw.b<l32.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<l32.b, l32.a> e9() {
        return this.stateMachine;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
