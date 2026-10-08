package p00;

import fv.w;
import java.util.List;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lp00/g;", "", "Lp00/f;", "interceptorsConfig", "Lp00/a;", "blockHttpCleartextInterceptor", "Lp00/b;", "interceptorAuth", "Lp00/e;", "interceptorNetworkConnection", "Lp00/c;", "interceptorDefaultHeaders", "Lp00/i;", "remoteHttpLoggingInterceptor", "Lp00/d;", "interceptorDynamicBaseUrlMock", "<init>", "(Lp00/f;Lp00/a;Lp00/b;Lp00/e;Lp00/c;Lp00/i;Lp00/d;)V", "Ltv/a$a;", "loggingInterceptorLevel", "Lfv/w;", "b", "(Ltv/a$a;)Lfv/w;", "c", "()Lfv/w;", "Lp00/h;", "profile", "", "a", "(Lp00/h;)Ljava/util/List;", "Lp00/f;", "Lp00/a;", "Lp00/b;", "d", "Lp00/e;", "e", "Lp00/c;", "f", "Lp00/i;", "g", "Lp00/d;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f interceptorsConfig;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a blockHttpCleartextInterceptor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b interceptorAuth;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e interceptorNetworkConnection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c interceptorDefaultHeaders;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i remoteHttpLoggingInterceptor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d interceptorDynamicBaseUrlMock;

    public g(f fVar, a aVar, b bVar, e eVar, c cVar, i iVar, d dVar) {
        this.interceptorsConfig = fVar;
        this.blockHttpCleartextInterceptor = aVar;
        this.interceptorAuth = bVar;
        this.interceptorNetworkConnection = eVar;
        this.interceptorDefaultHeaders = cVar;
        this.remoteHttpLoggingInterceptor = iVar;
        this.interceptorDynamicBaseUrlMock = dVar;
    }

    private final w b(tv.a.EnumC5026a loggingInterceptorLevel) {
        if (!this.interceptorsConfig.l()) {
            return null;
        }
        tv.a aVar = new tv.a(null, 1, null);
        aVar.d(loggingInterceptorLevel);
        return aVar;
    }

    private final w c() {
        if (this.interceptorsConfig.e()) {
            return this.remoteHttpLoggingInterceptor;
        }
        return null;
    }

    public final List<w> a(h profile) {
        if (profile instanceof h.External) {
            h.External external = (h.External) profile;
            return v.L0(v.L0(external.a(), v.s(this.interceptorNetworkConnection, b(external.getLoggingInterceptorLevel()), c())), external.getBlockHttpCleartext() ? v.e(this.blockHttpCleartextInterceptor) : v.n());
        }
        if (profile instanceof h.Internal) {
            return v.s(this.blockHttpCleartextInterceptor, this.interceptorAuth, this.interceptorNetworkConnection, this.interceptorDefaultHeaders, null, b(((h.Internal) profile).getLoggingInterceptorLevel()));
        }
        throw new p();
    }
}
