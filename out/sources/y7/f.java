package y7;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface f extends t7.h {

    public interface a {
        f a();
    }

    Uri c();

    void close();

    default Map<String, List<String>> f() {
        return Collections.EMPTY_MAP;
    }

    long i(j jVar);

    void m(x xVar);
}
