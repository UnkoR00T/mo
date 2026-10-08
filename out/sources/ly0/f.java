package ly0;

import h64.n;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001e¨\u0006\u001f"}, d2 = {"Lly0/f;", "Lby0/c;", "Lky0/b;", "airQualityWidgetRepository", "Lly0/k;", "shouldUpdateWidgetPointUC", "Lez/a;", "currentTimeProvider", "Lh64/n;", "isServiceTemporaryInterruptedUC", "Llh0/d;", "fetchAirQualityWidgetPointUC", "<init>", "(Lky0/b;Lly0/k;Lez/a;Lh64/n;Llh0/d;)V", "", "f", "(Ltq/e;)Ljava/lang/Object;", "Lay0/c;", "e", "Lgz/b$a$a;", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lky0/b;", "b", "Lly0/k;", "c", "Lez/a;", "d", "Lh64/n;", "Llh0/d;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements by0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ky0.b airQualityWidgetRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k shouldUpdateWidgetPointUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n isServiceTemporaryInterruptedUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final lh0.d fetchAirQualityWidgetPointUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121400d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121401e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f121402f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f121403g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f121404h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f121405j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f121406k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f121408m;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121406k = obj;
            this.f121408m |= PKIFailureInfo.systemUnavail;
            return f.this.e(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121409d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f121410e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121411f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f121413h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121411f = obj;
            this.f121413h |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    public f(ky0.b bVar, k kVar, ez.a aVar, n nVar, lh0.d dVar) {
        this.airQualityWidgetRepository = bVar;
        this.shouldUpdateWidgetPointUC = kVar;
        this.currentTimeProvider = aVar;
        this.isServiceTemporaryInterruptedUC = nVar;
        this.fetchAirQualityWidgetPointUC = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        if (r3.c(r6, r0) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(tq.e<? super ay0.c> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ly0.f.e(tq.e):java.lang.Object");
    }

    private final Object f(tq.e<? super Boolean> eVar) {
        return this.isServiceTemporaryInterruptedUC.c(new n.Params(rq0.c.AIR_QUALITY), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super ay0.c> eVar) throws Throwable {
        b bVar;
        gz.b.a.C1792a c1792a2;
        hy0.a aVar;
        Object objE;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f121413h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f121413h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objF = bVar.f121411f;
        Object objE2 = uq.b.e();
        int i16 = bVar.f121413h;
        if (i16 == 0) {
            u.b(objF);
            bVar.f121409d = vq.j.a(c1792a);
            bVar.f121413h = 1;
            objF = f(bVar);
            if (objF != objE2) {
            }
            return objE2;
        }
        if (i16 == 1) {
            c1792a = (gz.b.a.C1792a) bVar.f121409d;
            u.b(objF);
        } else {
            if (i16 != 2) {
                if (i16 == 3) {
                    u.b(objF);
                    return objF;
                }
                if (i16 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(objF);
                return objF;
            }
            aVar = (hy0.a) bVar.f121410e;
            c1792a2 = (gz.b.a.C1792a) bVar.f121409d;
            u.b(objF);
        }
        if (((Boolean) objF).booleanValue()) {
            return new ay0.c.WidgetPoint(((hy0.a.Added) aVar).getWidgetPoint());
        }
        bVar.f121409d = vq.j.a(c1792a2);
        bVar.f121410e = vq.j.a(aVar);
        bVar.f121413h = 3;
        objE = e(bVar);
        if (objE != objE2) {
            return objE2;
        }
        return objE;
        if (((Boolean) objF).booleanValue()) {
            return ay0.c.d.f15211a;
        }
        hy0.a widgetLocalData = this.airQualityWidgetRepository.getWidgetLocalData();
        if (widgetLocalData instanceof hy0.a.Added) {
            k kVar = this.shouldUpdateWidgetPointUC;
            gz.b.a.C1792a c1792a3 = gz.b.a.C1792a.f78542a;
            bVar.f121409d = vq.j.a(c1792a);
            bVar.f121410e = widgetLocalData;
            bVar.f121413h = 2;
            Object objA = kVar.a(c1792a3, bVar);
            if (objA != objE2) {
                c1792a2 = c1792a;
                aVar = widgetLocalData;
                objF = objA;
                if (((Boolean) objF).booleanValue()) {
                    return new ay0.c.WidgetPoint(((hy0.a.Added) aVar).getWidgetPoint());
                }
                bVar.f121409d = vq.j.a(c1792a2);
                bVar.f121410e = vq.j.a(aVar);
                bVar.f121413h = 3;
                objE = e(bVar);
                if (objE != objE2) {
                    return objE;
                }
            }
        } else {
            if (!(widgetLocalData instanceof hy0.a.Uninitialized)) {
                if (widgetLocalData instanceof hy0.a.NotAdded) {
                    return ay0.c.a.f15208a;
                }
                throw new p();
            }
            bVar.f121409d = vq.j.a(c1792a);
            bVar.f121410e = vq.j.a(widgetLocalData);
            bVar.f121413h = 4;
            Object objE3 = e(bVar);
            if (objE3 != objE2) {
                return objE3;
            }
        }
        return objE2;
    }
}
