package go3;

import dn0.VerificationResponse;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lgo3/f;", "", "Lgo3/f$a;", "Lco3/s;", "Lfo3/b;", "repository", "Lgo3/d0;", "getVerificationDetailsDataUseCase", "<init>", "(Lfo3/b;Lgo3/d0;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgo3/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lfo3/b;", "b", "Lgo3/d0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fo3.b repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d0 getVerificationDetailsDataUseCase;

    /* JADX INFO: renamed from: go3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/f$a;", "Lgz/b$a;", "Ldn0/d;", "verifiedPersonData", "<init>", "(Ldn0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldn0/d;", "()Ldn0/d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final VerificationResponse verifiedPersonData;

        public Params(VerificationResponse verificationResponse) {
            this.verifiedPersonData = verificationResponse;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final VerificationResponse getVerifiedPersonData() {
            return this.verifiedPersonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.verifiedPersonData, ((Params) other).verifiedPersonData);
        }

        public int hashCode() {
            return this.verifiedPersonData.hashCode();
        }

        public String toString() {
            return "Params(verifiedPersonData=" + this.verifiedPersonData + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75397f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75398g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75399h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f75400j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75402l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75400j = obj;
            this.f75402l |= PKIFailureInfo.systemUnavail;
            return f.this.d(null, this);
        }
    }

    public f(fo3.b bVar, d0 d0Var) {
        this.repository = bVar;
        this.getVerificationDetailsDataUseCase = d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        if (r8 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(go3.f.Params r7, tq.e<? super dx.i<? extends dx.b, ? extends co3.s>> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof go3.f.b
            if (r0 == 0) goto L13
            r0 = r8
            go3.f$b r0 = (go3.f.b) r0
            int r1 = r0.f75402l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f75402l = r1
            goto L18
        L13:
            go3.f$b r0 = new go3.f$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f75400j
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f75402l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r7 = r0.f75397f
            co3.r r7 = (co3.VerificationDecryptedData) r7
            java.lang.Object r7 = r0.f75396e
            dx.i r7 = (dx.i) r7
            java.lang.Object r7 = r0.f75395d
            go3.f$a r7 = (go3.f.Params) r7
            oq.u.b(r8)
            goto L9b
        L38:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L40:
            java.lang.Object r7 = r0.f75395d
            go3.f$a r7 = (go3.f.Params) r7
            oq.u.b(r8)
            goto L60
        L48:
            oq.u.b(r8)
            fo3.b r8 = r6.repository
            dn0.d r2 = r7.getVerifiedPersonData()
            java.lang.Object r5 = vq.j.a(r7)
            r0.f75395d = r5
            r0.f75402l = r4
            java.lang.Object r8 = r8.c(r2, r0)
            if (r8 != r1) goto L60
            goto L9a
        L60:
            dx.i r8 = (dx.i) r8
            boolean r2 = r8 instanceof dx.i.Left
            if (r2 == 0) goto L67
            return r8
        L67:
            boolean r2 = r8 instanceof dx.i.Right
            if (r2 == 0) goto L9e
            r2 = r8
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
            co3.r r2 = (co3.VerificationDecryptedData) r2
            go3.d0 r4 = r6.getVerificationDetailsDataUseCase
            go3.d0$a r5 = new go3.d0$a
            r5.<init>(r2)
            java.lang.Object r7 = vq.j.a(r7)
            r0.f75395d = r7
            java.lang.Object r7 = vq.j.a(r8)
            r0.f75396e = r7
            java.lang.Object r7 = vq.j.a(r2)
            r0.f75397f = r7
            r7 = 0
            r0.f75398g = r7
            r0.f75399h = r7
            r0.f75402l = r3
            java.lang.Object r8 = r4.d(r5, r0)
            if (r8 != r1) goto L9b
        L9a:
            return r1
        L9b:
            dx.i r8 = (dx.i) r8
            return r8
        L9e:
            oq.p r7 = new oq.p
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: go3.f.d(go3.f$a, tq.e):java.lang.Object");
    }
}
