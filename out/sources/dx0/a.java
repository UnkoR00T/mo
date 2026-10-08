package dx0;

import h64.q;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ldx0/a;", "Lax0/a;", "Lcx0/b;", "notificationsInteractor", "Lcx0/a;", "addDocumentInteractor", "Lgx/d;", "globalEventManager", "Lby0/b;", "clearAirQualityWidgetTemporaryCacheUC", "Lh64/q;", "loadRemoteSettingsUseCase", "<init>", "(Lcx0/b;Lcx0/a;Lgx/d;Lby0/b;Lh64/q;)V", "Lax0/a$a;", "params", "Loq/i0;", "d", "(Lax0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lcx0/b;", "b", "Lcx0/a;", "c", "Lgx/d;", "Lby0/b;", "e", "Lh64/q;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements ax0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final cx0.b notificationsInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cx0.a addDocumentInteractor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final gx.d globalEventManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final by0.b clearAirQualityWidgetTemporaryCacheUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final q loadRemoteSettingsUseCase;

    /* JADX INFO: renamed from: dx0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1035a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f45108d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f45109e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f45111g;

        C1035a(tq.e<? super C1035a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f45109e = obj;
            this.f45111g |= PKIFailureInfo.systemUnavail;
            return a.this.c(null, this);
        }
    }

    public a(cx0.b bVar, cx0.a aVar, gx.d dVar, by0.b bVar2, q qVar) {
        this.notificationsInteractor = bVar;
        this.addDocumentInteractor = aVar;
        this.globalEventManager = dVar;
        this.clearAirQualityWidgetTemporaryCacheUC = bVar2;
        this.loadRemoteSettingsUseCase = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[PHI: r8
      0x0083: PHI (r8v3 ax0.a$a) = (r8v2 ax0.a$a), (r8v12 ax0.a$a) binds: [B:27:0x0080, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r9.c(r2, r0) == r1) goto L31;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(ax0.a.Params r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof dx0.a.C1035a
            if (r0 == 0) goto L13
            r0 = r9
            dx0.a$a r0 = (dx0.a.C1035a) r0
            int r1 = r0.f45111g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45111g = r1
            goto L18
        L13:
            dx0.a$a r0 = new dx0.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f45109e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f45111g
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L57
            if (r2 == r6) goto L4f
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r8 = r0.f45108d
            ax0.a$a r8 = (ax0.a.Params) r8
            oq.u.b(r9)
            goto La4
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            java.lang.Object r8 = r0.f45108d
            ax0.a$a r8 = (ax0.a.Params) r8
            oq.u.b(r9)
            goto L83
        L47:
            java.lang.Object r8 = r0.f45108d
            ax0.a$a r8 = (ax0.a.Params) r8
            oq.u.b(r9)
            goto L76
        L4f:
            java.lang.Object r8 = r0.f45108d
            ax0.a$a r8 = (ax0.a.Params) r8
            oq.u.b(r9)
            goto L67
        L57:
            oq.u.b(r9)
            cx0.a r9 = r7.addDocumentInteractor
            r0.f45108d = r8
            r0.f45111g = r6
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L67
            goto La3
        L67:
            by0.b r9 = r7.clearAirQualityWidgetTemporaryCacheUC
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            r0.f45108d = r8
            r0.f45111g = r5
            java.lang.Object r9 = r9.c(r2, r0)
            if (r9 != r1) goto L76
            goto La3
        L76:
            cx0.b r9 = r7.notificationsInteractor
            r0.f45108d = r8
            r0.f45111g = r4
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L83
            goto La3
        L83:
            gx.d r9 = r7.globalEventManager
            fo2.a$a r2 = new fo2.a$a
            rq0.b r4 = r8.getDocumentType()
            r2.<init>(r4)
            r9.c(r2)
            h64.q r9 = r7.loadRemoteSettingsUseCase
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            java.lang.Object r8 = vq.j.a(r8)
            r0.f45108d = r8
            r0.f45111g = r3
            java.lang.Object r8 = r9.c(r2, r0)
            if (r8 != r1) goto La4
        La3:
            return r1
        La4:
            oq.i0 r8 = oq.i0.f148189a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.a.c(ax0.a$a, tq.e):java.lang.Object");
    }
}
