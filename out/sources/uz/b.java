package uz;

import android.content.Context;
import com.google.common.util.concurrent.q;
import m0.n;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011¨\u0006\u0013"}, d2 = {"Luz/b;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Luz/a;", "b", "()Luz/a;", "Ljava/lang/Runnable;", "listener", "Loq/i0;", "a", "(Ljava/lang/Runnable;)V", "Landroid/content/Context;", "Lcom/google/common/util/concurrent/q;", "Lm0/n;", "Lcom/google/common/util/concurrent/q;", "cameraProviderFuture", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q<n> cameraProviderFuture;

    public b(Context context) {
        this.context = context;
        this.cameraProviderFuture = n.INSTANCE.c(context);
    }

    public final void a(Runnable listener) {
        this.cameraProviderFuture.b(listener, u5.a.i(this.context));
    }

    public final a b() {
        return new a(this.cameraProviderFuture.get());
    }
}
