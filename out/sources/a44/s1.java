package a44;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v04.ShowSnackbarEvent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001\u0015B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"La44/s1;", "Lq34/r1;", "Lp34/a;", "documentsRepository", "Lu34/b;", "documentsSummaryLocalRepository", "Lmz3/z;", "updateDocumentAsyncUC", "Lpx/d;", "remoteLogger", "Ld00/a;", "inMemoryCache", "Lgx/d;", "globalEventManager", "Lmx/c;", "labelProvider", "<init>", "(Lp34/a;Lu34/b;Lmz3/z;Lpx/d;Ld00/a;Lgx/d;Lmx/c;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lp34/a;", "b", "Lu34/b;", "c", "Lmz3/z;", "d", "Lpx/d;", "e", "Ld00/a;", "f", "Lgx/d;", "Lv04/a;", "g", "Lv04/a;", "snackBarEvent", "h", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s1 implements q34.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p34.a documentsRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u34.b documentsSummaryLocalRepository;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d00.a inMemoryCache;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ShowSnackbarEvent snackBarEvent;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f3200d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f3201e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3203g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f3201e = obj;
            this.f3203g |= PKIFailureInfo.systemUnavail;
            return s1.this.c(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c<T> implements mu.h {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f3205e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ s1 f3206f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(s1 s1Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f3206f = s1Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f3205e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f3206f.globalEventManager.c(this.f3206f.snackBarEvent);
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f3206f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f3207d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f3208e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f3209f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f3210g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f3211h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            /* synthetic */ Object f3212j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ c<T> f3213k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f3214l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(c<? super T> cVar, tq.e<? super b> eVar) {
                super(eVar);
                this.f3213k = cVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f3212j = obj;
                this.f3214l |= PKIFailureInfo.systemUnavail;
                return this.f3213k.F(null, this);
            }
        }

        c() {
        }

        /* JADX WARN: Code duplicated, block: B:54:0x022b  */
        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00bb, code lost:
        
            if (r11.e(r3, r2, r6) == r0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0125, code lost:
        
            if (r1.b(r2, r3, r4, r5, r6) == r0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x016d, code lost:
        
            if (r11.c(r1, r6) == r0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x01c3, code lost:
        
            if (r11.j(r1, r2, r6) == r0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x0260, code lost:
        
            if (d00.a.p(r1, 90002, 0, r5, r6, 2, null) == r0) goto L56;
         */
        @Override // mu.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object F(k34.i r10, tq.e<? super oq.i0> r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 638
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: a44.s1.c.F(k34.i, tq.e):java.lang.Object");
        }
    }

    public s1(p34.a aVar, u34.b bVar, mz3.z zVar, px.d dVar, d00.a aVar2, gx.d dVar2, mx.c cVar) {
        this.documentsRepository = aVar;
        this.documentsSummaryLocalRepository = bVar;
        this.updateDocumentAsyncUC = zVar;
        this.remoteLogger = dVar;
        this.inMemoryCache = aVar2;
        this.globalEventManager = dVar2;
        this.snackBarEvent = new ShowSnackbarEvent(cVar.c(f34.a.f59008d));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Object c(gz.b.a.C1792a c1792a, tq.e<? super oq.i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f3203g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f3203g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f3201e;
        Object objE = uq.b.e();
        int i16 = bVar.f3203g;
        if (i16 == 0) {
            oq.u.b(obj);
            mu.g<k34.i> gVarW = this.documentsRepository.w();
            c cVar = new c();
            bVar.f3200d = vq.j.a(c1792a);
            bVar.f3203g = 1;
            if (gVarW.a(cVar, bVar) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
        }
        return oq.i0.f148189a;
    }
}
