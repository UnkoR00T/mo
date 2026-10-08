package dc;

import android.net.NetworkRequest;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ldc/m;", "", "<init>", "()V", "", "capabilities", "transports", "Landroid/net/NetworkRequest;", "a", "([I[I)Landroid/net/NetworkRequest;", "request", "", "capability", "", "c", "(Landroid/net/NetworkRequest;I)Z", "transport", "d", "Ldc/o;", "b", "([I[I)Ldc/o;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f40764a = new m();

    private m() {
    }

    public static final NetworkRequest a(int[] capabilities, int[] transports) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i15 : capabilities) {
            try {
                builder.addCapability(i15);
            } catch (IllegalArgumentException e15) {
                ub.w.e().l(NetworkRequestCompat.INSTANCE.a(), "Ignoring adding capability '" + i15 + '\'', e15);
            }
        }
        for (int i16 : p.f40769a) {
            if (!pq.n.d0(capabilities, i16)) {
                try {
                    builder.removeCapability(i16);
                } catch (IllegalArgumentException e16) {
                    ub.w.e().l(NetworkRequestCompat.INSTANCE.a(), "Ignoring removing default capability '" + i16 + '\'', e16);
                }
            }
        }
        for (int i17 : transports) {
            builder.addTransportType(i17);
        }
        return builder.build();
    }

    public final NetworkRequestCompat b(int[] capabilities, int[] transports) {
        return new NetworkRequestCompat(a(capabilities, transports));
    }

    public final boolean c(NetworkRequest request, int capability) {
        return request.hasCapability(capability);
    }

    public final boolean d(NetworkRequest request, int transport) {
        return request.hasTransport(transport);
    }
}
