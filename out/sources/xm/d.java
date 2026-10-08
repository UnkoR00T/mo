package xm;

import androidx.p016lifecycle.d0;
import androidx.p016lifecycle.j;
import androidx.p016lifecycle.p;
import java.io.Closeable;
import java.util.List;
import vh.l;

/* JADX INFO: loaded from: classes4.dex */
public interface d extends Closeable, p, hg.g {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    @d0(j.a.ON_DESTROY)
    void close();

    l<List<a>> x(vm.a aVar);
}
