package gw0;

import fr.q0;
import fw0.SubscribeVehicleCollisionStatementReadyResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import sv0.k0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001\u0011B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00140\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lgw0/f;", "Ljw0/c;", "Lay/o;", "sseManagerFactory", "Lay/j;", "jsonSerializer", "Lpx/d;", "remoteLogger", "Lov0/a;", "vehicleServiceEndpoints", "<init>", "(Lay/o;Lay/j;Lpx/d;Lov0/a;)V", "Lsv0/y;", "processId", "Ldx/i;", "Ldx/b;", "Loq/i0;", "a", "(Lsv0/y;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "", "Lsv0/k0;", "b", "()Lmu/g;", "c", "()V", "Lay/j;", "Lpx/d;", "Lov0/a;", "Lay/n;", "d", "Loq/k;", "f", "()Lay/n;", "sseManager", "e", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements jw0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ay.j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ov0.a vehicleServiceEndpoints;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k sseManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77428a;

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
            f77428a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f77429d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f77430e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f77431f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f77432g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f77433h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f77434j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f77435k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f77437m;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f77435k = obj;
            this.f77437m |= PKIFailureInfo.systemUnavail;
            return f.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements mu.g<List<? extends k0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f77438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f77439b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f77440a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f77441b;

            /* JADX INFO: renamed from: gw0.f$d$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1759a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f77442d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f77443e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f77444f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f77446h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f77447j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f77448k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f77449l;

                public C1759a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f77442d = obj;
                    this.f77443e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, f fVar) {
                this.f77440a = hVar;
                this.f77441b = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1759a c1759a;
                if (eVar instanceof C1759a) {
                    c1759a = (C1759a) eVar;
                    int i15 = c1759a.f77443e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1759a.f77443e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1759a = new C1759a(eVar);
                    }
                } else {
                    c1759a = new C1759a(eVar);
                }
                Object obj2 = c1759a.f77442d;
                Object objE = uq.b.e();
                int i16 = c1759a.f77443e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f77440a;
                    Collection collectionValues = ((Map) obj).values();
                    ArrayList arrayList = new ArrayList(pq.v.y(collectionValues, 10));
                    Iterator<T> it = collectionValues.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ew0.d.l((SubscribeVehicleCollisionStatementReadyResponse) this.f77441b.jsonSerializer.a((String) it.next(), q0.n(SubscribeVehicleCollisionStatementReadyResponse.class))).a());
                    }
                    c1759a.f77444f = vq.j.a(obj);
                    c1759a.f77446h = vq.j.a(c1759a);
                    c1759a.f77447j = vq.j.a(obj);
                    c1759a.f77448k = vq.j.a(hVar);
                    c1759a.f77449l = 0;
                    c1759a.f77443e = 1;
                    if (hVar.F(arrayList, c1759a) == objE) {
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

        public d(mu.g gVar, f fVar) {
            this.f77438a = gVar;
            this.f77439b = fVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super List<? extends k0>> hVar, tq.e eVar) {
            Object objA = this.f77438a.a(new a(hVar, this.f77439b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    public f(final ay.o oVar, ay.j jVar, px.d dVar, ov0.a aVar) {
        this.jsonSerializer = jVar;
        this.remoteLogger = dVar;
        this.vehicleServiceEndpoints = aVar;
        this.sseManager = oq.l.a(new er.a() { // from class: gw0.e
            @Override // er.a
            public final Object a() {
                return f.g(oVar);
            }
        });
    }

    private final ay.n f() {
        return (ay.n) this.sseManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ay.n g(ay.o oVar) {
        return oVar.a(new ay.l.New(gu.d.q(6, gu.e.MINUTES), null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fa, code lost:
    
        if (r1 == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0138, code lost:
    
        if (r1 == r3) goto L44;
     */
    @Override // jw0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(sv0.ProcessId r19, tq.e<? super dx.i<? extends dx.b, oq.i0>> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gw0.f.a(sv0.y, tq.e):java.lang.Object");
    }

    @Override // jw0.c
    public mu.g<List<k0>> b() {
        return new d(f().b(), this);
    }

    @Override // jw0.c
    public void c() {
        f().a("VEHICLE_COLLISION_READY_STATEMENT");
    }
}
