package e;

import java.util.Collection;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Le/y1;", "", "Loq/i0;", "start", "()V", "", "captureMode", "flashMode", "flashType", "Lu/m;", "b", "(IIILtq/e;)Ljava/lang/Object;", "", "enabled", "d", "(Z)V", "isPrimary", "", "Lo/j2;", "runningUseCases", "Lju/d2;", "a", "(ZLjava/util/Collection;)Lju/d2;", "close", "()Lju/d2;", "Le/f2;", "c", "()Le/f2;", "requestControl", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface y1 {
    ju.d2 a(boolean isPrimary, Collection<? extends o.j2> runningUseCases);

    Object b(int i15, int i16, int i17, tq.e<? super u.m> eVar);

    f2 c();

    ju.d2 close();

    default void d(boolean enabled) {
    }

    void start();
}
