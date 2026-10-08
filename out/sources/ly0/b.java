package ly0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lly0/b;", "Lby0/b;", "Llh0/b;", "clearAirQualityRepoCacheUC", "Lky0/b;", "airQualityWidgetRepository", "<init>", "(Llh0/b;Lky0/b;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Llh0/b;", "b", "Lky0/b;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements by0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lh0.b clearAirQualityRepoCacheUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ky0.b airQualityWidgetRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f121378d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f121379e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f121381g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f121379e = obj;
            this.f121381g |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(lh0.b bVar, ky0.b bVar2) {
        this.clearAirQualityRepoCacheUC = bVar;
        this.airQualityWidgetRepository = bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r7.c(r2, r0) == r1) goto L21;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gz.b.a.C1792a r6, tq.e<? super oq.i0> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ly0.b.a
            if (r0 == 0) goto L13
            r0 = r7
            ly0.b$a r0 = (ly0.b.a) r0
            int r1 = r0.f121381g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f121381g = r1
            goto L18
        L13:
            ly0.b$a r0 = new ly0.b$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f121379e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f121381g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f121378d
            gz.b$a$a r6 = (gz.b.a.C1792a) r6
            oq.u.b(r7)
            goto L67
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            java.lang.Object r6 = r0.f121378d
            gz.b$a$a r6 = (gz.b.a.C1792a) r6
            oq.u.b(r7)
            goto L54
        L40:
            oq.u.b(r7)
            ky0.b r7 = r5.airQualityWidgetRepository
            java.lang.Object r2 = vq.j.a(r6)
            r0.f121378d = r2
            r0.f121381g = r4
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L54
            goto L66
        L54:
            lh0.b r7 = r5.clearAirQualityRepoCacheUC
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            java.lang.Object r6 = vq.j.a(r6)
            r0.f121378d = r6
            r0.f121381g = r3
            java.lang.Object r6 = r7.c(r2, r0)
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            oq.i0 r6 = oq.i0.f148189a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ly0.b.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
