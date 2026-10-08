package n;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR$\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00040\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ln/t;", "T", "", "value", "Ln/h;", "defaultFinalizer", "<init>", "(Ljava/lang/Object;Ln/h;)V", "a", "()Ljava/lang/Object;", "Loq/i0;", "b", "()V", "Ljava/lang/Object;", "Liu/c;", "Liu/c;", "count", "Liu/e;", "c", "Liu/e;", "currentFinalizer", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iu.c count = iu.b.c(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private iu.e<h<T>> currentFinalizer;

    public t(T t15, h<? super T> hVar) {
        this.value = t15;
        this.currentFinalizer = iu.b.g(hVar);
    }

    public final T a() {
        int value;
        int i15;
        iu.c cVar = this.count;
        do {
            value = cVar.getValue();
            i15 = value == 0 ? 0 : value + 1;
        } while (!cVar.a(value, i15));
        if (i15 != 0) {
            return this.value;
        }
        return null;
    }

    public final void b() {
        if (this.count.b() == 0) {
            this.currentFinalizer.b(null).a(this.value);
        }
    }
}
