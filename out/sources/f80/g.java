package f80;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf80/g;", "La80/g;", "Le80/e;", "userCertificateRepository", "Le80/c;", "challengeControllerRepository", "<init>", "(Le80/e;Le80/c;)V", "La80/g$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(La80/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Le80/e;", "b", "Le80/c;", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements a80.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e80.e userCertificateRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e80.c challengeControllerRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f60086d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f60087e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f60088f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f60089g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f60090h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f60091j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f60093l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f60091j = obj;
            this.f60093l |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(e80.e eVar, e80.c cVar) {
        this.userCertificateRepository = eVar;
        this.challengeControllerRepository = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
    
        if (r8 == r1) goto L26;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(a80.g.Params r7, tq.e<? super dx.i<? extends dx.b, oq.i0>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof f80.g.a
            if (r0 == 0) goto L13
            r0 = r8
            f80.g$a r0 = (f80.g.a) r0
            int r1 = r0.f60093l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60093l = r1
            goto L18
        L13:
            f80.g$a r0 = new f80.g$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f60091j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f60093l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f60088f
            z70.d r7 = (z70.Challenge) r7
            java.lang.Object r7 = r0.f60087e
            dx.i r7 = (dx.i) r7
            java.lang.Object r7 = r0.f60086d
            a80.g$a r7 = (a80.g.Params) r7
            oq.u.b(r8)
            goto L92
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f60086d
            a80.g$a r7 = (a80.g.Params) r7
            oq.u.b(r8)
            goto L58
        L48:
            oq.u.b(r8)
            e80.c r8 = r6.challengeControllerRepository
            r0.f60086d = r7
            r0.f60093l = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L58
            goto L91
        L58:
            dx.i r8 = (dx.i) r8
            boolean r2 = r8 instanceof dx.i.Left
            if (r2 == 0) goto L5f
            return r8
        L5f:
            boolean r2 = r8 instanceof dx.i.Right
            if (r2 == 0) goto L95
            r2 = r8
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            z70.d r2 = (z70.Challenge) r2
            e80.e r4 = r6.userCertificateRepository
            ry.c r5 = r7.getCertKeyPairToRevoke()
            java.lang.Object r7 = vq.j.a(r7)
            r0.f60086d = r7
            java.lang.Object r7 = vq.j.a(r8)
            r0.f60087e = r7
            java.lang.Object r7 = vq.j.a(r2)
            r0.f60088f = r7
            r7 = 0
            r0.f60089g = r7
            r0.f60090h = r7
            r0.f60093l = r3
            java.lang.Object r8 = r4.a(r2, r5, r0)
            if (r8 != r1) goto L92
        L91:
            return r1
        L92:
            dx.i r8 = (dx.i) r8
            return r8
        L95:
            oq.p r7 = new oq.p
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f80.g.c(a80.g$a, tq.e):java.lang.Object");
    }
}
