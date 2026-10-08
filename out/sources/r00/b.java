package r00;

import ay.k;
import ay.l;
import ay.o;
import fv.z;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.s;
import pl.gov.coi.common.network.t;
import px.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lr00/b;", "Lay/o;", "Lpl/gov/coi/common/network/s;", "httpClientFactory", "Lay/a;", "baseUrlProvider", "Lpx/d;", "remoteLogger", "Lay/k;", "networkConnectionManager", "Lxw/d;", "dispatcherProvider", "<init>", "(Lpl/gov/coi/common/network/s;Lay/a;Lpx/d;Lay/k;Lxw/d;)V", "Lay/l;", "defaultTimeoutOverride", "Lr00/c;", "b", "(Lay/l;)Lr00/c;", "a", "Lpl/gov/coi/common/network/s;", "Lay/a;", "c", "Lpx/d;", "d", "Lay/k;", "e", "Lxw/d;", "Lfv/z;", "f", "Lfv/z;", "sseHttpClient", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s httpClientFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ay.a baseUrlProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k networkConnectionManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final z sseHttpClient;

    public b(s sVar, ay.a aVar, d dVar, k kVar, xw.d dVar2) {
        this.httpClientFactory = sVar;
        this.baseUrlProvider = aVar;
        this.remoteLogger = dVar;
        this.networkConnectionManager = kVar;
        this.dispatcherProvider = dVar2;
        this.sseHttpClient = sVar.a(new t.SSE(null, 1, null));
    }

    @Override // ay.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(l defaultTimeoutOverride) {
        return new c(null, this.baseUrlProvider, this.remoteLogger, this.networkConnectionManager, this.httpClientFactory.c(this.sseHttpClient, defaultTimeoutOverride.a()), this.dispatcherProvider, 1, null);
    }
}
