package ch1;

import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e¨\u0006\u001f"}, d2 = {"Lch1/z;", "Lgz/b;", "Lgz/b$a$a;", "", "Lah1/g;", "Lbh1/e;", "widgetsRepository", "Lby0/d;", "isWidgetAirQualityRemoteFFActiveUC", "Lch1/g0;", "isEPaymentsWidgetRemoteFFActiveUC", "Lh64/r;", "loadServicesUseCase", "Lh64/n;", "isServiceTemporaryInterruptedUC", "<init>", "(Lbh1/e;Lby0/d;Lch1/g0;Lh64/r;Lh64/n;)V", "", "e", "(Ltq/e;)Ljava/lang/Object;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lbh1/e;", "b", "Lby0/d;", "c", "Lch1/g0;", "d", "Lh64/r;", "Lh64/n;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements gz.b<gz.b.a.C1792a, Set<? extends ah1.g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bh1.e widgetsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final by0.d isWidgetAirQualityRemoteFFActiveUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g0 isEPaymentsWidgetRemoteFFActiveUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h64.r loadServicesUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h64.n isServiceTemporaryInterruptedUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27107a;

        static {
            int[] iArr = new int[ah1.g.values().length];
            try {
                iArr[ah1.g.AIR_QUALITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ah1.g.EPAYMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27107a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f27108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f27109e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f27110f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f27111g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f27112h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f27113j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f27114k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f27115l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f27116m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f27117n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f27118p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f27120r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f27118p = obj;
            this.f27120r |= PKIFailureInfo.systemUnavail;
            return z.this.a(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f27121d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f27122e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f27124g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f27122e = obj;
            this.f27124g |= PKIFailureInfo.systemUnavail;
            return z.this.e(this);
        }
    }

    public z(bh1.e eVar, by0.d dVar, g0 g0Var, h64.r rVar, h64.n nVar) {
        this.widgetsRepository = eVar;
        this.isWidgetAirQualityRemoteFFActiveUC = dVar;
        this.isEPaymentsWidgetRemoteFFActiveUC = g0Var;
        this.loadServicesUseCase = rVar;
        this.isServiceTemporaryInterruptedUC = nVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(tq.e<? super Boolean> eVar) throws Throwable {
        c cVar;
        int i15;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i16 = cVar.f27124g;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f27124g = i16 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f27122e;
        Object objE = uq.b.e();
        int i17 = cVar.f27124g;
        boolean z15 = false;
        if (i17 == 0) {
            oq.u.b(objC);
            h64.r rVar = this.loadServicesUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            cVar.f27124g = 1;
            objC = rVar.c(c1792a, cVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i17 == 1) {
            oq.u.b(objC);
        } else {
            if (i17 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i15 = cVar.f27121d;
            oq.u.b(objC);
        }
        boolean zBooleanValue = ((Boolean) objC).booleanValue();
        if (i15 != 0 && !zBooleanValue) {
            z15 = true;
        }
        return vq.b.a(z15);
        List list = (List) objC;
        int i18 = (list == null || !iq0.q.a(list, rq0.c.E_PAYMENTS)) ? 0 : 1;
        h64.n nVar = this.isServiceTemporaryInterruptedUC;
        h64.n.Params params = new h64.n.Params(rq0.c.E_PAYMENTS);
        cVar.f27121d = i18;
        cVar.f27124g = 2;
        Object objC2 = nVar.c(params, cVar);
        if (objC2 != objE) {
            i15 = i18;
            objC = objC2;
            boolean zBooleanValue2 = ((Boolean) objC).booleanValue();
            if (i15 != 0) {
                z15 = true;
            }
            return vq.b.a(z15);
        }
        return objE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:28:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:41:0x0107  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e2 -> B:33:0x00e5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00f7 -> B:40:0x0105). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object a(gz.b.a.C1792a r18, tq.e<? super java.util.Set<? extends ah1.g>> r19) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ch1.z.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
