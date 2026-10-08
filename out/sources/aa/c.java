package aa;

import java.lang.ref.WeakReference;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00018\u00008\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\r¨\u0006\u000f"}, d2 = {"Laa/c;", "", "T", "reference", "<init>", "(Ljava/lang/Object;)V", "b", "()Ljava/lang/Object;", "Loq/i0;", "a", "()V", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "Ljava/lang/ref/WeakReference;", "weakReference", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<T> weakReference;

    public c(T t15) {
        this.weakReference = new WeakReference<>(t15);
    }

    public final void a() {
        this.weakReference.clear();
    }

    public final T b() {
        return this.weakReference.get();
    }
}
