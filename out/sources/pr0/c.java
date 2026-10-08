package pr0;

import fr.q0;
import fr0.BEAsyncDocumentGenerationResult;
import ge4.x;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Map;
import oq.i0;
import oq.p;
import oq.u;
import oq.y;
import or0.AsyncDocumentGenerationResultDtoDto;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pq.v0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 82\u00020\u0001:\u0001\u0019B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b \u0010!J,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0096@¢\u0006\u0004\b$\u0010%J,\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b*\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010.R\u001b\u00103\u001a\u00020/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u00100\u001a\u0004\b1\u00102R\u001b\u00107\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lpr0/c;", "Lrr0/a;", "Ler0/a;", "asyncEndpoints", "Ljx/d;", "deviceInfo", "Lay/j;", "jsonSerializer", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "Lay/o;", "sseManagerFactory", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "<init>", "(Ler0/a;Ljx/d;Lay/j;Lpl/gov/coi/common/network/g0;Lay/o;Lpl/gov/coi/common/network/w;)V", "Ldx/b;", "error", "Ldx/i;", "Lfr0/a;", "n", "(Ldx/b;)Ldx/i;", "", "taskId", "Loq/i0;", "a", "(Ljava/lang/String;)V", "Lmu/g;", "", "Lfr0/d;", "c", "()Lmu/g;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "authToken", "f", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "documentId", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "task", "d", "Ler0/a;", "Ljx/d;", "Lay/j;", "Lpl/gov/coi/common/network/g0;", "Lay/n;", "Loq/k;", "m", "()Lay/n;", "sseManager", "Lmr0/a;", "l", "()Lmr0/a;", "client", "g", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements rr0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er0.a asyncEndpoints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jx.d deviceInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k sseManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oq.k client;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162017a;

        static {
            int[] iArr = new int[dx.b.g.Http.a.values().length];
            try {
                iArr[dx.b.g.Http.a.GATEWAY_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[dx.b.g.Http.a.REQUEST_TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f162017a = iArr;
        }
    }

    /* JADX INFO: renamed from: pr0.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3992c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162018d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f162019e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f162020f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f162022h;

        C3992c(tq.e<? super C3992c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162020f = obj;
            this.f162022h |= PKIFailureInfo.systemUnavail;
            return c.this.e(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f162024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f162025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f162026g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f162028j;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162026g = obj;
            this.f162028j |= PKIFailureInfo.systemUnavail;
            return c.this.f(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<Map<String, ? extends BEAsyncDocumentGenerationResult>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f162029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f162030b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f162031a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f162032b;

            /* JADX INFO: renamed from: pr0.c$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3993a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f162033d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f162034e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f162035f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f162037h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f162038j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f162039k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f162040l;

                public C3993a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f162033d = obj;
                    this.f162034e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, c cVar) {
                this.f162031a = hVar;
                this.f162032b = cVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3993a c3993a;
                if (eVar instanceof C3993a) {
                    c3993a = (C3993a) eVar;
                    int i15 = c3993a.f162034e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3993a.f162034e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3993a = new C3993a(eVar);
                    }
                } else {
                    c3993a = new C3993a(eVar);
                }
                Object obj2 = c3993a.f162033d;
                Object objE = uq.b.e();
                int i16 = c3993a.f162034e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f162031a;
                    Map map = (Map) obj;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(y.a(entry.getKey(), nr0.a.c((AsyncDocumentGenerationResultDtoDto) this.f162032b.jsonSerializer.a((String) entry.getValue(), q0.n(AsyncDocumentGenerationResultDtoDto.class)))));
                    }
                    Map mapS = v0.s(arrayList);
                    c3993a.f162035f = vq.j.a(obj);
                    c3993a.f162037h = vq.j.a(c3993a);
                    c3993a.f162038j = vq.j.a(obj);
                    c3993a.f162039k = vq.j.a(hVar);
                    c3993a.f162040l = 0;
                    c3993a.f162034e = 1;
                    if (hVar.F(mapS, c3993a) == objE) {
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

        public e(mu.g gVar, c cVar) {
            this.f162029a = gVar;
            this.f162030b = cVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super Map<String, ? extends BEAsyncDocumentGenerationResult>> hVar, tq.e eVar) {
            Object objA = this.f162029a.a(new a(hVar, this.f162030b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162041e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f162043g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f162043g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162041e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mr0.a aVarL = c.this.l();
            String str = this.f162043g;
            this.f162041e = 1;
            Object objB = aVarL.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new f(this.f162043g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f162044e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f162046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f162047h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f162046g = str;
            this.f162047h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f162044e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            mr0.a aVarL = c.this.l();
            String str = this.f162046g;
            String str2 = this.f162047h;
            this.f162044e = 1;
            Object objA = aVarL.a(str, str2, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return c.this.new g(this.f162046g, this.f162047h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    public c(er0.a aVar, jx.d dVar, ay.j jVar, g0 g0Var, final ay.o oVar, final w wVar) {
        this.asyncEndpoints = aVar;
        this.deviceInfo = dVar;
        this.jsonSerializer = jVar;
        this.networkCallMediator = g0Var;
        this.sseManager = oq.l.a(new er.a() { // from class: pr0.a
            @Override // er.a
            public final Object a() {
                return c.o(oVar);
            }
        });
        this.client = oq.l.a(new er.a() { // from class: pr0.b
            @Override // er.a
            public final Object a() {
                return c.k(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mr0.a k(w wVar) {
        return (mr0.a) w.b(wVar, null, mr0.a.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mr0.a l() {
        return (mr0.a) this.client.getValue();
    }

    private final dx.i<dx.b, fr0.a> n(dx.b error) {
        if (error instanceof dx.b.g.h) {
            return new dx.i.Right(fr0.a.C1477a.f66430a);
        }
        if (!(error instanceof dx.b.g.Http)) {
            return new dx.i.Left(error);
        }
        int i15 = b.f162017a[((dx.b.g.Http) error).getCode().ordinal()];
        if (i15 != 1 && i15 != 2) {
            return new dx.i.Left(error);
        }
        return new dx.i.Right(fr0.a.C1477a.f66430a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ay.n o(ay.o oVar) {
        return oVar.a(new ay.l.New(gu.d.q(6, gu.e.MINUTES), null));
    }

    @Override // rr0.a
    public void a(String taskId) {
        m().a(taskId);
    }

    @Override // rr0.a
    public Object b(String str, String str2, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new g(str, str2, null), eVar);
    }

    @Override // rr0.a
    public mu.g<Map<String, BEAsyncDocumentGenerationResult>> c() {
        return new e(m().b(), this);
    }

    @Override // rr0.a
    public Object d(String str, tq.e<? super i0> eVar) {
        Object objB = this.networkCallMediator.b(new f(str, null), eVar);
        return objB == uq.b.e() ? objB : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rr0.a
    public Object e(String str, tq.e<? super dx.i<? extends dx.b, ? extends fr0.a>> eVar) throws Throwable {
        C3992c c3992c;
        if (eVar instanceof C3992c) {
            c3992c = (C3992c) eVar;
            int i15 = c3992c.f162022h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c3992c.f162022h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c3992c = new C3992c(eVar);
            }
        } else {
            c3992c = new C3992c(eVar);
        }
        Object objC = c3992c.f162020f;
        Object objE = uq.b.e();
        int i16 = c3992c.f162022h;
        if (i16 == 0) {
            u.b(objC);
            String str2 = this.asyncEndpoints.r0() + str;
            ay.n nVarM = m();
            Map<String, String> mapF = v0.f(y.a("Device-Uuid", this.deviceInfo.b()));
            c3992c.f162018d = vq.j.a(str);
            c3992c.f162019e = vq.j.a(str2);
            c3992c.f162022h = 1;
            objC = nVarM.c(str2, str, mapF, c3992c);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return n((dx.b) ((dx.i.Left) iVar).b());
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        return new dx.i.Right(fr0.a.b.f66431a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rr0.a
    public Object f(String str, b0 b0Var, tq.e<? super dx.i<? extends dx.b, ? extends fr0.a>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f162028j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f162028j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f162026g;
        Object objE = uq.b.e();
        int i16 = dVar.f162028j;
        if (i16 == 0) {
            u.b(objC);
            String strM = this.asyncEndpoints.m();
            ay.n nVarM = m();
            Map<String, String> mapF = v0.f(y.a("Authorization", c0.e(b0Var)));
            dVar.f162023d = vq.j.a(str);
            dVar.f162024e = vq.j.a(b0Var);
            dVar.f162025f = vq.j.a(strM);
            dVar.f162028j = 1;
            objC = nVarM.c(strM, str, mapF, dVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return n((dx.b) ((dx.i.Left) iVar).b());
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new p();
        }
        return new dx.i.Right(fr0.a.b.f66431a);
    }

    public final ay.n m() {
        return (ay.n) this.sseManager.getValue();
    }
}
