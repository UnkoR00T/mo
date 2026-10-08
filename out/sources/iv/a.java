package iv;

import fr.k;
import fu.r;
import fv.a0;
import fv.b0;
import fv.c;
import fv.d0;
import fv.e;
import fv.e0;
import fv.u;
import fv.w;
import gv.d;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Liv/a;", "Lfv/w;", "Lfv/c;", "cache", "<init>", "(Lfv/c;)V", "Lfv/w$a;", "chain", "Lfv/d0;", "a", "(Lfv/w$a;)Lfv/d0;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: iv.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Liv/a$a;", "", "<init>", "()V", "Lfv/d0;", "response", "f", "(Lfv/d0;)Lfv/d0;", "Lfv/u;", "cachedHeaders", "networkHeaders", "c", "(Lfv/u;Lfv/u;)Lfv/u;", "", "fieldName", "", "e", "(Ljava/lang/String;)Z", "d", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final u c(u cachedHeaders, u networkHeaders) {
            u.a aVar = new u.a();
            int size = cachedHeaders.size();
            for (int i15 = 0; i15 < size; i15++) {
                String strF = cachedHeaders.f(i15);
                String strK = cachedHeaders.k(i15);
                if ((!r.G("Warning", strF, true) || !r.V(strK, "1", false, 2, null)) && (d(strF) || !e(strF) || networkHeaders.e(strF) == null)) {
                    aVar.d(strF, strK);
                }
            }
            int size2 = networkHeaders.size();
            for (int i16 = 0; i16 < size2; i16++) {
                String strF2 = networkHeaders.f(i16);
                if (!d(strF2) && e(strF2)) {
                    aVar.d(strF2, networkHeaders.k(i16));
                }
            }
            return aVar.f();
        }

        private final boolean d(String fieldName) {
            return r.G("Content-Length", fieldName, true) || r.G("Content-Encoding", fieldName, true) || r.G("Content-Type", fieldName, true);
        }

        private final boolean e(String fieldName) {
            return (r.G("Connection", fieldName, true) || r.G("Keep-Alive", fieldName, true) || r.G("Proxy-Authenticate", fieldName, true) || r.G("Proxy-Authorization", fieldName, true) || r.G("TE", fieldName, true) || r.G("Trailers", fieldName, true) || r.G("Transfer-Encoding", fieldName, true) || r.G("Upgrade", fieldName, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final d0 f(d0 response) {
            return (response != null ? response.getBody() : null) != null ? response.K().b(null).c() : response;
        }

        private Companion() {
        }
    }

    public a(c cVar) {
    }

    @Override // fv.w
    public d0 a(w.a chain) {
        fv.r eventListener;
        e eVarCall = chain.call();
        b bVarB = new b.C2275b(System.currentTimeMillis(), chain.getRequest(), null).b();
        b0 b0VarB = bVarB.getNetworkRequest();
        d0 d0VarA = bVarB.getCacheResponse();
        kv.e eVar = eVarCall instanceof kv.e ? (kv.e) eVarCall : null;
        if (eVar == null || (eventListener = eVar.getEventListener()) == null) {
            eventListener = fv.r.f67486b;
        }
        if (b0VarB == null && d0VarA == null) {
            d0 d0VarC = new d0.a().r(chain.getRequest()).p(a0.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(d.f77105c).s(-1L).q(System.currentTimeMillis()).c();
            eventListener.z(eVarCall, d0VarC);
            return d0VarC;
        }
        if (b0VarB == null) {
            d0 d0VarC2 = d0VarA.K().d(INSTANCE.f(d0VarA)).c();
            eventListener.b(eVarCall, d0VarC2);
            return d0VarC2;
        }
        if (d0VarA != null) {
            eventListener.a(eVarCall, d0VarA);
        }
        d0 d0VarA2 = chain.a(b0VarB);
        if (d0VarA != null) {
            if (d0VarA2 != null && d0VarA2.getCode() == 304) {
                d0.a aVarK = d0VarA.K();
                Companion companion = INSTANCE;
                aVarK.k(companion.c(d0VarA.getHeaders(), d0VarA2.getHeaders())).s(d0VarA2.getSentRequestAtMillis()).q(d0VarA2.getReceivedResponseAtMillis()).d(companion.f(d0VarA)).n(companion.f(d0VarA2)).c();
                d0VarA2.getBody().close();
                throw null;
            }
            e0 body = d0VarA.getBody();
            if (body != null) {
                d.m(body);
            }
        }
        d0.a aVarK2 = d0VarA2.K();
        Companion companion2 = INSTANCE;
        return aVarK2.d(companion2.f(d0VarA)).n(companion2.f(d0VarA2)).c();
    }
}
