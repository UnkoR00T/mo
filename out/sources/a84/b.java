package a84;

import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"La84/b;", "Lgz/b;", "Lgz/b$a$a;", "Loq/i0;", "Ley/a;", "remoteNotificationsManager", "Lz74/a;", "notificationLocalRepository", "<init>", "(Ley/a;Lz74/a;)V", "params", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "Ley/a;", "b", "Lz74/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<gz.b.a.C1792a, i0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4894c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ey.a remoteNotificationsManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z74.a notificationLocalRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f4897d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f4898e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f4899f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f4901h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f4899f = obj;
            this.f4901h |= PKIFailureInfo.systemUnavail;
            return b.this.a(null, this);
        }
    }

    public b(ey.a aVar, z74.a aVar2) {
        this.remoteNotificationsManager = aVar;
        this.notificationLocalRepository = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        if (r8 == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a84.b.a
            if (r0 == 0) goto L13
            r0 = r8
            a84.b$a r0 = (a84.b.a) r0
            int r1 = r0.f4901h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4901h = r1
            goto L18
        L13:
            a84.b$a r0 = new a84.b$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f4899f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f4901h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L54
            if (r2 == r5) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f4898e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f4897d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto La5
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f4898e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r2 = r0.f4897d
            gz.b$a$a r2 = (gz.b.a.C1792a) r2
            oq.u.b(r8)
            goto L89
        L4c:
            java.lang.Object r7 = r0.f4897d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L68
        L54:
            oq.u.b(r8)
            z74.a r8 = r6.notificationLocalRepository
            java.lang.Object r2 = vq.j.a(r7)
            r0.f4897d = r2
            r0.f4901h = r5
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L68
            goto La4
        L68:
            y74.a r8 = (y74.NotificationRegistrationData) r8
            java.lang.String r8 = r8.getToken()
            if (r8 == 0) goto Lc1
            z74.a r2 = r6.notificationLocalRepository
            java.lang.Object r5 = vq.j.a(r7)
            r0.f4897d = r5
            java.lang.Object r5 = vq.j.a(r8)
            r0.f4898e = r5
            r0.f4901h = r4
            java.lang.Object r2 = r2.a(r0)
            if (r2 != r1) goto L87
            goto La4
        L87:
            r2 = r7
            r7 = r8
        L89:
            ey.a r8 = r6.remoteNotificationsManager
            r8.a()
            ey.a r8 = r6.remoteNotificationsManager
            java.lang.Object r2 = vq.j.a(r2)
            r0.f4897d = r2
            java.lang.Object r7 = vq.j.a(r7)
            r0.f4898e = r7
            r0.f4901h = r3
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto La5
        La4:
            return r1
        La5:
            dx.i r8 = (dx.i) r8
            boolean r7 = r8 instanceof dx.i.Left
            if (r7 == 0) goto Lc1
            dx.i$b r8 = (dx.i.Left) r8
            java.lang.Object r7 = r8.b()
            dx.b r7 = (dx.b) r7
            px.f r0 = px.f.f163100a
            java.util.List r3 = px.c.a(r6)
            r4 = 2
            r5 = 0
            java.lang.String r1 = "Error deleting notification token from Firebase"
            r2 = 0
            px.f.e(r0, r1, r2, r3, r4, r5)
        Lc1:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a84.b.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
