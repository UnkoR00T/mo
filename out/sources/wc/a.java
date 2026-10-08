package wc;

import fr.k;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;
import vc.NetworkRequest;
import vc.NetworkResponse;
import zc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lwc/a;", "Lvc/b;", "<init>", "()V", "Lvc/s;", "cacheResponse", "Lvc/q;", "networkRequest", "Lzc/n;", "options", "Lvc/b$b;", "a", "(Lvc/s;Lvc/q;Lzc/n;Ltq/e;)Ljava/lang/Object;", "networkResponse", "Lvc/b$c;", "b", "(Lvc/s;Lvc/q;Lvc/s;Lzc/n;Ltq/e;)Ljava/lang/Object;", "c", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements vc.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C5588a f212037c = new C5588a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<Integer> f212038d = e1.i(300, 301, 404, 405, 410, 414, 501);

    /* JADX INFO: renamed from: wc.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwc/a$a;", "", "<init>", "()V", "", "", "CACHEABLE_STATUS_CODES", "Ljava/util/Set;", "coil-network-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class C5588a {
        public /* synthetic */ C5588a(k kVar) {
            this();
        }

        private C5588a() {
        }
    }

    @Override // vc.b
    public Object a(NetworkResponse networkResponse, NetworkRequest networkRequest, Options options, tq.e<? super vc.b.ReadResult> eVar) {
        return new vc.b.ReadResult(networkResponse);
    }

    @Override // vc.b
    public Object b(NetworkResponse networkResponse, NetworkRequest networkRequest, NetworkResponse networkResponse2, Options options, tq.e<? super vc.b.WriteResult> eVar) {
        if (networkResponse2.getCode() == 304 && networkResponse != null) {
            return new vc.b.WriteResult(NetworkResponse.b(networkResponse2, 0, 0L, 0L, e.d(networkResponse.getHeaders(), networkResponse2.getHeaders()), null, null, 39, null));
        }
        int code = networkResponse2.getCode();
        return ((200 > code || code >= 300) && !f212038d.contains(vq.b.e(networkResponse2.getCode()))) ? vc.b.WriteResult.f205962c : new vc.b.WriteResult(networkResponse2);
    }
}
