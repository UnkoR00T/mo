package k14;

import fv.d0;
import fv.w;
import java.util.UUID;
import jx.d;
import jx.g;
import p00.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u001c2\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016¨\u0006\u001d"}, d2 = {"Lk14/a;", "Lp00/c;", "Ljx/d;", "deviceInfo", "Ljx/a;", "appInfo", "Ljx/g;", "systemInfo", "<init>", "(Ljx/d;Ljx/a;Ljx/g;)V", "Lfv/w$a;", "chain", "Lfv/d0;", "a", "(Lfv/w$a;)Lfv/d0;", "Ljx/d;", "b", "Ljx/a;", "c", "Ljx/g;", "", "d", "Ljava/lang/String;", "traceId", "e", "spanId", "f", "parentSpanId", "g", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d deviceInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jx.a appInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g systemInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String traceId = UUID.randomUUID().toString().substring(0, 16);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String spanId = UUID.randomUUID().toString().substring(0, 8);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String parentSpanId = UUID.randomUUID().toString().substring(0, 8);

    public a(d dVar, jx.a aVar, g gVar) {
        this.deviceInfo = dVar;
        this.appInfo = aVar;
        this.systemInfo = gVar;
    }

    @Override // fv.w
    public d0 a(w.a chain) {
        return chain.a(chain.C().i().d("Device-Uuid", this.deviceInfo.b()).d("Device-Model", this.deviceInfo.a()).d("App-Version", this.appInfo.c()).d("Os-Type", "ANDROID").d("Os-Version", String.valueOf(this.systemInfo.j())).d("X-B3-TraceId", this.traceId).d("X-B3-SpanId", this.spanId).d("X-B3-ParentSpanId", this.parentSpanId).d("Accept-Language", this.systemInfo.n()).d("Mobile-Theme", this.appInfo.a()).d("X-Session-Id", this.appInfo.b()).b());
    }
}
