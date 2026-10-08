package i6;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Li6/g;", "", "T", "Li6/f;", "", "maxPoolSize", "<init>", "(I)V", "instance", "", "a", "(Ljava/lang/Object;)Z", "z", "()Ljava/lang/Object;", "A", "", "[Ljava/lang/Object;", "pool", "b", "I", "poolSize", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class g<T> implements f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object[] pool;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int poolSize;

    public g(int i15) {
        if (i15 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.pool = new Object[i15];
    }

    private final boolean a(T instance) {
        int i15 = this.poolSize;
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.pool[i16] == instance) {
                return true;
            }
        }
        return false;
    }

    @Override // i6.f
    public boolean A(T instance) {
        if (a(instance)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i15 = this.poolSize;
        Object[] objArr = this.pool;
        if (i15 >= objArr.length) {
            return false;
        }
        objArr[i15] = instance;
        this.poolSize = i15 + 1;
        return true;
    }

    @Override // i6.f
    public T z() {
        int i15 = this.poolSize;
        if (i15 <= 0) {
            return null;
        }
        int i16 = i15 - 1;
        Object[] objArr = this.pool;
        T t15 = (T) objArr[i16];
        objArr[i16] = null;
        this.poolSize = i15 - 1;
        return t15;
    }
}
