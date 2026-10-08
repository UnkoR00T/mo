package dc;

import android.net.NetworkRequest;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Ldc/n;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "request", "", "a", "(Landroid/net/NetworkRequest;)[I", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f40765a = new n();

    private n() {
    }

    public final int[] a(NetworkRequest request) {
        return request.getCapabilities();
    }

    public final int[] b(NetworkRequest request) {
        return request.getTransportTypes();
    }
}
