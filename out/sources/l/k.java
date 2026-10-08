package l;

import h.g1;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\n\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\r\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH&¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00038&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Ll/k;", "", "", "Lh/g1;", "requests", "", "p0", "(Ljava/util/List;)Z", "", "parameters", "l", "(Ljava/util/Map;)Z", "Loq/i0;", "e", "(Ljava/util/Map;)V", "j", "Lh/g1$a;", "listeners", "f", "(Ljava/util/List;)V", "close", "()V", "g", "()Lh/g1;", "c", "(Lh/g1;)V", "repeatingRequest", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface k {
    void c(g1 g1Var);

    void close();

    void e(Map<?, ? extends Object> parameters);

    void f(List<? extends g1.a> listeners);

    g1 g();

    void j(Map<?, ? extends Object> parameters);

    boolean l(Map<?, ? extends Object> parameters);

    boolean p0(List<g1> requests);
}
