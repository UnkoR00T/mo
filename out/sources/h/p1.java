package h;

import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lh/p1;", "", "Lh/c0$a;", "config", "Lh/c0;", "r", "(Lh/c0$a;)Lh/c0;", "Lh/q1;", "streamId", "h", "(I)Lh/c0;", "Lh/c1;", "outputId", "Lh/e1;", "p", "(I)Lh/e1;", "", "G", "()Ljava/util/List;", "streams", "Lh/x0;", "b", "inputs", "m", "outputs", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface p1 {
    List<c0> G();

    List<x0> b();

    default c0 h(int streamId) {
        Object next;
        Iterator<T> it = G().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (q1.d(((c0) next).getId(), streamId)) {
                return (c0) next;
            }
        }
        next = null;
        return (c0) next;
    }

    List<e1> m();

    default e1 p(int outputId) {
        Object next;
        Iterator<T> it = m().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (c1.d(((e1) next).getId(), outputId)) {
                return (e1) next;
            }
        }
        next = null;
        return (e1) next;
    }

    c0 r(c0.a config);
}
