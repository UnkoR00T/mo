package i6;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\b\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Li6/h;", "", "T", "Li6/g;", "", "maxPoolSize", "<init>", "(I)V", "z", "()Ljava/lang/Object;", "instance", "", "A", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/Object;", "lock", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class h<T> extends g<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    public h(int i15) {
        super(i15);
        this.lock = new Object();
    }

    @Override // i6.g, i6.f
    public boolean A(T instance) {
        boolean zA;
        synchronized (this.lock) {
            zA = super.A(instance);
        }
        return zA;
    }

    @Override // i6.g, i6.f
    public T z() {
        T t15;
        synchronized (this.lock) {
            t15 = (T) super.z();
        }
        return t15;
    }
}
