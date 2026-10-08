package bi0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lbi0/f;", "Luh0/f;", "Luh0/e;", "bEGetChallengeUseCase", "Lai0/j;", "userCertificateRepository", "<init>", "(Luh0/e;Lai0/j;)V", "Luh0/f$a;", "params", "Ldx/i;", "Ldx/b;", "Lth0/s;", "d", "(Luh0/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Luh0/e;", "b", "Lai0/j;", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements uh0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uh0.e bEGetChallengeUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ai0.j userCertificateRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f19791d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f19792e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f19793f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f19794g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f19795h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f19796j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f19798l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f19796j = obj;
            this.f19798l |= PKIFailureInfo.systemUnavail;
            return f.this.c(null, this);
        }
    }

    public f(uh0.e eVar, ai0.j jVar) {
        this.bEGetChallengeUseCase = eVar;
        this.userCertificateRepository = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if (r10 == r1) goto L26;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(uh0.f.Params r9, tq.e<? super dx.i<? extends dx.b, th0.RevokeUserCertificateMobileApiResponse>> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof bi0.f.a
            if (r0 == 0) goto L13
            r0 = r10
            bi0.f$a r0 = (bi0.f.a) r0
            int r1 = r0.f19798l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19798l = r1
            goto L18
        L13:
            bi0.f$a r0 = new bi0.f$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f19796j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f19798l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L41
            if (r2 != r3) goto L39
            java.lang.Object r9 = r0.f19793f
            th0.e r9 = (th0.BEChallengeResponse) r9
            java.lang.Object r9 = r0.f19792e
            dx.i r9 = (dx.i) r9
            java.lang.Object r9 = r0.f19791d
            uh0.f$a r9 = (uh0.f.Params) r9
            oq.u.b(r10)
            goto Lb8
        L39:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L41:
            java.lang.Object r9 = r0.f19791d
            uh0.f$a r9 = (uh0.f.Params) r9
            oq.u.b(r10)
            goto L5b
        L49:
            oq.u.b(r10)
            uh0.e r10 = r8.bEGetChallengeUseCase
            gz.b$a$a r2 = gz.b.a.C1792a.f78542a
            r0.f19791d = r9
            r0.f19798l = r4
            java.lang.Object r10 = r10.c(r2, r0)
            if (r10 != r1) goto L5b
            goto Lb7
        L5b:
            dx.i r10 = (dx.i) r10
            boolean r2 = r10 instanceof dx.i.Left
            if (r2 == 0) goto L62
            return r10
        L62:
            boolean r2 = r10 instanceof dx.i.Right
            if (r2 == 0) goto Lbb
            r2 = r10
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            th0.e r2 = (th0.BEChallengeResponse) r2
            ai0.j r4 = r8.userCertificateRepository
            ry.c r5 = r9.getCertKeyPair()
            java.security.cert.X509Certificate r5 = r5.getCertificate()
            java.math.BigInteger r5 = r5.getSerialNumber()
            r6 = 16
            java.lang.String r5 = r5.toString(r6)
            iy.b0 r5 = iy.c0.g(r5)
            ay.c r6 = r2.getChallenge()
            iy.b0 r6 = r6.getChallenge()
            th0.r r7 = new th0.r
            r7.<init>(r6, r5)
            ry.c r5 = r9.getCertKeyPair()
            java.lang.Object r9 = vq.j.a(r9)
            r0.f19791d = r9
            java.lang.Object r9 = vq.j.a(r10)
            r0.f19792e = r9
            java.lang.Object r9 = vq.j.a(r2)
            r0.f19793f = r9
            r9 = 0
            r0.f19794g = r9
            r0.f19795h = r9
            r0.f19798l = r3
            java.lang.Object r10 = r4.b(r7, r5, r0)
            if (r10 != r1) goto Lb8
        Lb7:
            return r1
        Lb8:
            dx.i r10 = (dx.i) r10
            return r10
        Lbb:
            oq.p r9 = new oq.p
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.f.c(uh0.f$a, tq.e):java.lang.Object");
    }
}
