package s02;

import eo0.CentralTokens;
import eo0.OwTokens;
import fr.t;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ls02/k;", "Lgz/b;", "Ls02/k$a;", "Loq/i0;", "Ls02/i;", "saveOwAccessTokenUseCase", "Ls02/j;", "saveOwRefreshTokenUseCase", "Ls02/h;", "saveCentralAccessTokenUseCase", "<init>", "(Ls02/i;Ls02/j;Ls02/h;)V", "params", "d", "(Ls02/k$a;Ltq/e;)Ljava/lang/Object;", "a", "Ls02/i;", "b", "Ls02/j;", "c", "Ls02/h;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements gz.b<Params, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i saveOwAccessTokenUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j saveOwRefreshTokenUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h saveCentralAccessTokenUseCase;

    /* JADX INFO: renamed from: s02.k$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Ls02/k$a;", "Lgz/b$a;", "Leo0/i0$a;", "owAccessToken", "Leo0/i0$c;", "owRefreshToken", "Leo0/k$a;", "centralAccessToken", "<init>", "(Leo0/i0$a;Leo0/i0$c;Leo0/k$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/i0$a;", "b", "()Leo0/i0$a;", "Leo0/i0$c;", "c", "()Leo0/i0$c;", "Leo0/k$a;", "()Leo0/k$a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OwTokens.Access owAccessToken;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final OwTokens.Refresh owRefreshToken;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CentralTokens.Access centralAccessToken;

        public Params(OwTokens.Access access, OwTokens.Refresh refresh, CentralTokens.Access access2) {
            this.owAccessToken = access;
            this.owRefreshToken = refresh;
            this.centralAccessToken = access2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CentralTokens.Access getCentralAccessToken() {
            return this.centralAccessToken;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OwTokens.Access getOwAccessToken() {
            return this.owAccessToken;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final OwTokens.Refresh getOwRefreshToken() {
            return this.owRefreshToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.owAccessToken, params.owAccessToken) && t.c(this.owRefreshToken, params.owRefreshToken) && t.c(this.centralAccessToken, params.centralAccessToken);
        }

        public int hashCode() {
            return (((this.owAccessToken.hashCode() * 31) + this.owRefreshToken.hashCode()) * 31) + this.centralAccessToken.hashCode();
        }

        public String toString() {
            return "Params(owAccessToken=" + this.owAccessToken + ", owRefreshToken=" + this.owRefreshToken + ", centralAccessToken=" + this.centralAccessToken + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f177170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f177171e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f177173g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f177171e = obj;
            this.f177173g |= PKIFailureInfo.systemUnavail;
            return k.this.d(null, this);
        }
    }

    public k(i iVar, j jVar, h hVar) {
        this.saveOwAccessTokenUseCase = iVar;
        this.saveOwRefreshTokenUseCase = jVar;
        this.saveCentralAccessTokenUseCase = hVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r9.d(r2, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(s02.k.Params r8, tq.e<? super oq.i0> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof s02.k.b
            if (r0 == 0) goto L13
            r0 = r9
            s02.k$b r0 = (s02.k.b) r0
            int r1 = r0.f177173g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f177173g = r1
            goto L18
        L13:
            s02.k$b r0 = new s02.k$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f177171e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f177173g
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f177170d
            s02.k$a r8 = (s02.k.Params) r8
            oq.u.b(r9)
            goto L94
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f177170d
            s02.k$a r8 = (s02.k.Params) r8
            oq.u.b(r9)
            goto L7a
        L43:
            java.lang.Object r8 = r0.f177170d
            s02.k$a r8 = (s02.k.Params) r8
            oq.u.b(r9)
            goto L64
        L4b:
            oq.u.b(r9)
            s02.i r9 = r7.saveOwAccessTokenUseCase
            s02.i$a r2 = new s02.i$a
            eo0.i0$a r6 = r8.getOwAccessToken()
            r2.<init>(r6)
            r0.f177170d = r8
            r0.f177173g = r5
            java.lang.Object r9 = r9.d(r2, r0)
            if (r9 != r1) goto L64
            goto L93
        L64:
            s02.j r9 = r7.saveOwRefreshTokenUseCase
            s02.j$a r2 = new s02.j$a
            eo0.i0$c r5 = r8.getOwRefreshToken()
            r2.<init>(r5)
            r0.f177170d = r8
            r0.f177173g = r4
            java.lang.Object r9 = r9.d(r2, r0)
            if (r9 != r1) goto L7a
            goto L93
        L7a:
            s02.h r9 = r7.saveCentralAccessTokenUseCase
            s02.h$a r2 = new s02.h$a
            eo0.k$a r4 = r8.getCentralAccessToken()
            r2.<init>(r4)
            java.lang.Object r8 = vq.j.a(r8)
            r0.f177170d = r8
            r0.f177173g = r3
            java.lang.Object r8 = r9.d(r2, r0)
            if (r8 != r1) goto L94
        L93:
            return r1
        L94:
            oq.i0 r8 = oq.i0.f148189a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: s02.k.d(s02.k$a, tq.e):java.lang.Object");
    }
}
