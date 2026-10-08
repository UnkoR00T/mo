package uc;

import java.util.Map;
import kc.n;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\u00020\f8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0019\"\u0004\b\u001b\u0010\u0015R\u0014\u0010\u001e\u001a\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Luc/i;", "", "Luc/d$b;", "key", "Luc/d$c;", "a", "(Luc/d$b;)Luc/d$c;", "Lkc/n;", "image", "", "", "extras", "", "size", "Loq/i0;", "d", "(Luc/d$b;Lkc/n;Ljava/util/Map;J)V", "", "f", "(Luc/d$b;)Z", "e", "(J)V", "clear", "()V", "getSize", "()J", "getMaxSize", "b", "maxSize", "c", "initialMaxSize", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface i {
    d.Value a(d.Key key);

    void b(long j15);

    /* JADX INFO: renamed from: c */
    long getInitialMaxSize();

    void clear();

    void d(d.Key key, n image, Map<String, ? extends Object> extras, long size);

    void e(long size);

    boolean f(d.Key key);

    long getSize();
}
