package wg0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lwg0/e;", "Lqg0/d;", "Lvg0/a;", "userRepository", "Lrg0/a;", "appSessionManager", "Leg0/c;", "deleteAllDatabasesUC", "Ldf0/a;", "cancelAllDownloadTaskWorkUC", "Lqg0/c;", "clearAllSharedPreferencesUC", "Lug0/a;", "notificationsInteractor", "<init>", "(Lvg0/a;Lrg0/a;Leg0/c;Ldf0/a;Lqg0/c;Lug0/a;)V", "Lgz/b$a$a;", "params", "Loq/i0;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Lvg0/a;", "b", "Lrg0/a;", "c", "Leg0/c;", "d", "Ldf0/a;", "e", "Lqg0/c;", "f", "Lug0/a;", "user_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements qg0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vg0.a userRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final rg0.a appSessionManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final eg0.c deleteAllDatabasesUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final df0.a cancelAllDownloadTaskWorkUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final qg0.c clearAllSharedPreferencesUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ug0.a notificationsInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f213053d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f213054e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f213056g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f213054e = obj;
            this.f213056g |= PKIFailureInfo.systemUnavail;
            return e.this.c(null, this);
        }
    }

    public e(vg0.a aVar, rg0.a aVar2, eg0.c cVar, df0.a aVar3, qg0.c cVar2, ug0.a aVar4) {
        this.userRepository = aVar;
        this.appSessionManager = aVar2;
        this.deleteAllDatabasesUC = cVar;
        this.cancelAllDownloadTaskWorkUC = aVar3;
        this.clearAllSharedPreferencesUC = cVar2;
        this.notificationsInteractor = aVar4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r8.a(r0) == r1) goto L21;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(gz.b.a.C1792a r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof wg0.e.a
            if (r0 == 0) goto L13
            r0 = r8
            wg0.e$a r0 = (wg0.e.a) r0
            int r1 = r0.f213056g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f213056g = r1
            goto L18
        L13:
            wg0.e$a r0 = new wg0.e$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f213054e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f213056g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f213053d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L67
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f213053d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L56
        L40:
            oq.u.b(r8)
            df0.a r8 = r6.cancelAllDownloadTaskWorkUC
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            java.lang.Object r5 = vq.j.a(r7)
            r0.f213053d = r5
            r0.f213056g = r4
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L56
            goto L66
        L56:
            ug0.a r8 = r6.notificationsInteractor
            java.lang.Object r7 = vq.j.a(r7)
            r0.f213053d = r7
            r0.f213056g = r3
            java.lang.Object r7 = r8.a(r0)
            if (r7 != r1) goto L67
        L66:
            return r1
        L67:
            rg0.a r7 = r6.appSessionManager
            r7.a()
            vg0.a r7 = r6.userRepository
            r7.d()
            eg0.c r7 = r6.deleteAllDatabasesUC
            gz.b$a$a r8 = gz.b.a.C1792a.f78542a
            r7.a(r8)
            qg0.c r7 = r6.clearAllSharedPreferencesUC
            r7.a(r8)
            oq.i0 r7 = oq.i0.f148189a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wg0.e.c(gz.b$a$a, tq.e):java.lang.Object");
    }
}
