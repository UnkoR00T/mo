package zm;

import androidx.p016lifecycle.d0;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.p;
import java.io.Closeable;
import vh.l;

/* JADX INFO: loaded from: classes4.dex */
public interface c extends Closeable, p, hg.g {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @d0(j.a.ON_DESTROY)
    void close();

    l<a> x(vm.a aVar);
}
