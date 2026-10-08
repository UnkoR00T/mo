package go3;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lgo3/e;", "", "Lgz/b$a$a;", "Ldn0/b;", "La14/k;", "generateRsaKeyPairUseCase", "Len0/f;", "startSessionUC", "<init>", "(La14/k;Len0/f;)V", "params", "Ldx/i;", "Ldx/b;", "a", "(Lgz/b$a$a;Ltq/e;)Ljava/lang/Object;", "La14/k;", "b", "Len0/f;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a14.k generateRsaKeyPairUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final en0.f startSessionUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75365f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75366g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75367h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f75368j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75370l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75368j = obj;
            this.f75370l |= PKIFailureInfo.systemUnavail;
            return e.this.a(null, this);
        }
    }

    public e(a14.k kVar, en0.f fVar) {
        this.generateRsaKeyPairUseCase = kVar;
        this.startSessionUC = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
    
        if (r8 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(gz.b.a.C1792a r7, tq.e<? super dx.i<? extends dx.b, dn0.StartVerificationSession>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof go3.e.a
            if (r0 == 0) goto L13
            r0 = r8
            go3.e$a r0 = (go3.e.a) r0
            int r1 = r0.f75370l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75370l = r1
            goto L18
        L13:
            go3.e$a r0 = new go3.e$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f75368j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f75370l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f75365f
            java.security.KeyPair r7 = (java.security.KeyPair) r7
            java.lang.Object r7 = r0.f75364e
            dx.i r7 = (dx.i) r7
            java.lang.Object r7 = r0.f75363d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L99
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f75363d
            gz.b$a$a r7 = (gz.b.a.C1792a) r7
            oq.u.b(r8)
            goto L5e
        L48:
            oq.u.b(r8)
            a14.k r8 = r6.generateRsaKeyPairUseCase
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            java.lang.Object r5 = vq.j.a(r7)
            r0.f75363d = r5
            r0.f75370l = r4
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L5e
            goto L98
        L5e:
            dx.i r8 = (dx.i) r8
            boolean r2 = r8 instanceof dx.i.Left
            if (r2 == 0) goto L65
            return r8
        L65:
            boolean r2 = r8 instanceof dx.i.Right
            if (r2 == 0) goto L9c
            r2 = r8
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            java.security.KeyPair r2 = (java.security.KeyPair) r2
            en0.f r4 = r6.startSessionUC
            en0.f$a r5 = new en0.f$a
            r5.<init>(r2)
            java.lang.Object r7 = vq.j.a(r7)
            r0.f75363d = r7
            java.lang.Object r7 = vq.j.a(r8)
            r0.f75364e = r7
            java.lang.Object r7 = vq.j.a(r2)
            r0.f75365f = r7
            r7 = 0
            r0.f75366g = r7
            r0.f75367h = r7
            r0.f75370l = r3
            java.lang.Object r8 = r4.c(r5, r0)
            if (r8 != r1) goto L99
        L98:
            return r1
        L99:
            dx.i r8 = (dx.i) r8
            return r8
        L9c:
            oq.p r7 = new oq.p
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: go3.e.a(gz.b$a$a, tq.e):java.lang.Object");
    }
}
