package f64;

import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0010J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lf64/i;", "Ls54/g;", "Le64/b;", "localNotificationsRepository", "Lf64/g;", "removeAllNotificationsForVehicleUseCase", "Lpx/d;", "remoteLogger", "Lc64/a;", "localNotificationsContainersInteractor", "<init>", "(Le64/b;Lf64/g;Lpx/d;Lc64/a;)V", "Lrq0/b;", "documentType", "Loq/i0;", "i", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "g", "", "containerId", "f", "(Lrq0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ls54/g$a;", "params", "h", "(Ls54/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Le64/b;", "b", "Lf64/g;", "c", "Lpx/d;", "d", "Lc64/a;", "localnotifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements s54.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e64.b localNotificationsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g removeAllNotificationsForVehicleUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c64.a localNotificationsContainersInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f59584d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f59585e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f59586f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f59587g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f59588h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f59589j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f59590k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f59592m;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f59590k = obj;
            this.f59592m |= PKIFailureInfo.systemUnavail;
            return i.this.f(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f59593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f59594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f59595f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f59597h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f59595f = obj;
            this.f59597h |= PKIFailureInfo.systemUnavail;
            return i.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f59598d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f59599e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f59600f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f59601g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f59602h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f59603j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f59604k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f59605l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f59607n;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f59605l = obj;
            this.f59607n |= PKIFailureInfo.systemUnavail;
            return i.this.i(null, this);
        }
    }

    public i(e64.b bVar, g gVar, px.d dVar, c64.a aVar) {
        this.localNotificationsRepository = bVar;
        this.removeAllNotificationsForVehicleUseCase = gVar;
        this.remoteLogger = dVar;
        this.localNotificationsContainersInteractor = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:29:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
    
        if (r4.i(r6, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0116, code lost:
    
        if (i(r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0134, code lost:
    
        if (i(r8, r0) == r1) goto L43;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x0083, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(rq0.b r8, java.lang.String r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f64.i.f(rq0.b, java.lang.String, tq.e):java.lang.Object");
    }

    private final Object g(rq0.b bVar, tq.e<? super i0> eVar) {
        if (bVar == rq0.b.d.VEHICLE_CARD) {
            Object objC = this.removeAllNotificationsForVehicleUseCase.c(gz.b.a.C1792a.f78542a, eVar);
            return objC == uq.b.e() ? objC : i0.f148189a;
        }
        Object objM = this.localNotificationsRepository.m(bVar, eVar);
        return objM == uq.b.e() ? objM : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:? A[LOOP:0: B:28:0x0091->B:43:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d6, code lost:
    
        if (g(r7, r0) == r1) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(rq0.b r11, tq.e<? super oq.i0> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f64.i.i(rq0.b, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        if (f(r3, r2, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (i(r2, r0) == r1) goto L27;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(s54.g.Params r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof f64.i.b
            if (r0 == 0) goto L13
            r0 = r7
            f64.i$b r0 = (f64.i.b) r0
            int r1 = r0.f59597h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59597h = r1
            goto L18
        L13:
            f64.i$b r0 = new f64.i$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f59595f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f59597h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f59594e
            s54.g$b r6 = (s54.g.b) r6
            java.lang.Object r6 = r0.f59593d
            s54.g$a r6 = (s54.g.Params) r6
            oq.u.b(r7)
            goto L96
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f59594e
            s54.g$b r6 = (s54.g.b) r6
            java.lang.Object r6 = r0.f59593d
            s54.g$a r6 = (s54.g.Params) r6
            oq.u.b(r7)
            goto L73
        L48:
            oq.u.b(r7)
            s54.g$b r7 = r6.getRemoveOperation()
            boolean r2 = r7 instanceof s54.g.b.ByContainerId
            if (r2 == 0) goto L76
            r2 = r7
            s54.g$b$a r2 = (s54.g.b.ByContainerId) r2
            rq0.b r3 = r2.getDocumentType()
            java.lang.String r2 = r2.getContainerId()
            java.lang.Object r6 = vq.j.a(r6)
            r0.f59593d = r6
            java.lang.Object r6 = vq.j.a(r7)
            r0.f59594e = r6
            r0.f59597h = r4
            java.lang.Object r6 = r5.f(r3, r2, r0)
            if (r6 != r1) goto L73
            goto L95
        L73:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        L76:
            boolean r2 = r7 instanceof s54.g.b.ByDocumentType
            if (r2 == 0) goto L99
            r2 = r7
            s54.g$b$b r2 = (s54.g.b.ByDocumentType) r2
            rq0.b r2 = r2.getDocumentType()
            java.lang.Object r6 = vq.j.a(r6)
            r0.f59593d = r6
            java.lang.Object r6 = vq.j.a(r7)
            r0.f59594e = r6
            r0.f59597h = r3
            java.lang.Object r6 = r5.i(r2, r0)
            if (r6 != r1) goto L96
        L95:
            return r1
        L96:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        L99:
            oq.p r6 = new oq.p
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f64.i.c(s54.g$a, tq.e):java.lang.Object");
    }
}
