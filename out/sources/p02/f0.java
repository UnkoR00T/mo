package p02;

import eo0.OwTokens;
import jb4.PayloadErrorData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0010\nB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013¨\u0006\u0015"}, d2 = {"Lp02/f0;", "", "Ls02/g;", "refreshUseCase", "Ls02/b;", "getOwAccessTokenUseCase", "<init>", "(Ls02/g;Ls02/b;)V", "Ldx/b;", "Ljb4/f;", "a", "(Ldx/b;)Ljb4/f;", "RESULT", "Lp02/f0$b;", "params", "Ldx/i;", "b", "(Lp02/f0$b;Ltq/e;)Ljava/lang/Object;", "Ls02/g;", "Ls02/b;", "c", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f151022d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final dx.b.Business f151023e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s02.g refreshUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s02.b getOwAccessTokenUseCase;

    /* JADX INFO: renamed from: p02.f0$b, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B?\u0012.\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R?\u0010\b\u001a*\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"Lp02/f0$b;", "RESULT", "", "Lkotlin/Function2;", "Leo0/i0$a;", "Ltq/e;", "Ldx/i;", "Ldx/b;", "onTokenRefreshed", "domainError", "<init>", "(Ler/p;Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/p;", "b", "()Ler/p;", "Ldx/b;", "()Ldx/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params<RESULT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends RESULT>>, Object> onTokenRefreshed;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final dx.b domainError;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(er.p<? super OwTokens.Access, ? super tq.e<? super dx.i<? extends dx.b, ? extends RESULT>>, ? extends Object> pVar, dx.b bVar) {
            this.onTokenRefreshed = pVar;
            this.domainError = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dx.b getDomainError() {
            return this.domainError;
        }

        public final er.p<OwTokens.Access, tq.e<? super dx.i<? extends dx.b, ? extends RESULT>>, Object> b() {
            return this.onTokenRefreshed;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.onTokenRefreshed, params.onTokenRefreshed) && fr.t.c(this.domainError, params.domainError);
        }

        public int hashCode() {
            return (this.onTokenRefreshed.hashCode() * 31) + this.domainError.hashCode();
        }

        public String toString() {
            return "Params(onTokenRefreshed=" + this.onTokenRefreshed + ", domainError=" + this.domainError + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c<RESULT> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f151028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f151029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f151030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f151031g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f151032h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f151033j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f151034k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f151035l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f151036m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f151037n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f151038p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f151040r;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f151038p = obj;
            this.f151040r |= PKIFailureInfo.systemUnavail;
            return f0.this.b(null, this);
        }
    }

    static {
        n02.a aVar = n02.a.REFRESH_TOKEN_EXPIRED;
        Label.Companion companion = Label.INSTANCE;
        f151023e = new dx.b.Business(aVar, null, companion.c(), null, null, companion.c(), null, 90, null);
    }

    public f0(s02.g gVar, s02.b bVar) {
        this.refreshUseCase = gVar;
        this.getOwAccessTokenUseCase = bVar;
    }

    private final PayloadErrorData a(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0116  */
    /* JADX WARN: Code duplicated, block: B:47:0x011a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0186  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0159, code lost:
    
        if (r13 == r1) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <RESULT> java.lang.Object b(p02.f0.Params<RESULT> r12, tq.e<? super dx.i<? extends dx.b, ? extends RESULT>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.f0.b(p02.f0$b, tq.e):java.lang.Object");
    }
}
