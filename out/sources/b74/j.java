package b74;

import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lb74/j;", "Lv64/f;", "", "Lwy/c;", "sessionCleanableSet", "Lmz3/d;", "cancelAllAsyncDownloadWorkersUC", "Lpq3/a;", "disableWhatsNewUseCase", "Lz64/f;", "userNotificationsInteractor", "La14/c;", "clearWebViewUC", "<init>", "(Ljava/util/Set;Lmz3/d;Lpq3/a;Lz64/f;La14/c;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ljava/util/Set;", "b", "Lmz3/d;", "c", "Lpq3/a;", "d", "Lz64/f;", "e", "La14/c;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements v64.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<wy.c> sessionCleanableSet;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.d cancelAllAsyncDownloadWorkersUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final pq3.a disableWhatsNewUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z64.f userNotificationsInteractor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a14.c clearWebViewUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f17134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f17135e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f17137g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f17135e = obj;
            this.f17137g |= PKIFailureInfo.systemUnavail;
            return j.this.c(null, this);
        }
    }

    public j(Set<wy.c> set, mz3.d dVar, pq3.a aVar, z64.f fVar, a14.c cVar) {
        this.sessionCleanableSet = set;
        this.cancelAllAsyncDownloadWorkersUC = dVar;
        this.disableWhatsNewUseCase = aVar;
        this.userNotificationsInteractor = fVar;
        this.clearWebViewUC = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a9 A[PHI: r9
      0x00a9: PHI (r9v3 gz.b$a$a) = (r9v2 gz.b$a$a), (r9v12 gz.b$a$a) binds: [B:31:0x00a6, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b9, code lost:
    
        if (r10.c(r2, r0) == r1) goto L35;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gz.b.a.C1792a r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof b74.j.a
            if (r0 == 0) goto L13
            r0 = r10
            b74.j$a r0 = (b74.j.a) r0
            int r1 = r0.f17137g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f17137g = r1
            goto L18
        L13:
            b74.j$a r0 = new b74.j$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f17135e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f17137g
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L57
            if (r2 == r6) goto L4f
            if (r2 == r5) goto L47
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r9 = r0.f17134d
            gz.b$a$a r9 = (gz.b.a.C1792a) r9
            oq.u.b(r10)
            goto Lbc
        L37:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3f:
            java.lang.Object r9 = r0.f17134d
            gz.b$a$a r9 = (gz.b.a.C1792a) r9
            oq.u.b(r10)
            goto La9
        L47:
            java.lang.Object r9 = r0.f17134d
            gz.b$a$a r9 = (gz.b.a.C1792a) r9
            oq.u.b(r10)
            goto L98
        L4f:
            java.lang.Object r9 = r0.f17134d
            gz.b$a$a r9 = (gz.b.a.C1792a) r9
            oq.u.b(r10)
            goto L85
        L57:
            oq.u.b(r10)
            java.util.Set<wy.c> r10 = r8.sessionCleanableSet
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L62:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r10.next()
            wy.c r2 = (wy.c) r2
            r2.clear()
            goto L62
        L72:
            mz3.d r10 = r8.cancelAllAsyncDownloadWorkersUC
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            java.lang.Object r7 = vq.j.a(r9)
            r0.f17134d = r7
            r0.f17137g = r6
            java.lang.Object r10 = r10.c(r2, r0)
            if (r10 != r1) goto L85
            goto Lbb
        L85:
            pq3.a r10 = r8.disableWhatsNewUseCase
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            java.lang.Object r6 = vq.j.a(r9)
            r0.f17134d = r6
            r0.f17137g = r5
            java.lang.Object r10 = r10.c(r2, r0)
            if (r10 != r1) goto L98
            goto Lbb
        L98:
            z64.f r10 = r8.userNotificationsInteractor
            java.lang.Object r2 = vq.j.a(r9)
            r0.f17134d = r2
            r0.f17137g = r4
            java.lang.Object r10 = r10.b(r0)
            if (r10 != r1) goto La9
            goto Lbb
        La9:
            a14.c r10 = r8.clearWebViewUC
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            java.lang.Object r9 = vq.j.a(r9)
            r0.f17134d = r9
            r0.f17137g = r3
            java.lang.Object r9 = r10.c(r2, r0)
            if (r9 != r1) goto Lbc
        Lbb:
            return r1
        Lbc:
            oq.i0 r9 = oq.i0.f148189a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b74.j.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
