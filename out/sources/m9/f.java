package m9;

import java.util.Collections;
import java.util.List;
import l9.k;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<v7.a> f124679a;

    public f(List<v7.a> list) {
        this.f124679a = list;
    }

    @Override // l9.k
    public int b(long j15) {
        return j15 < 0 ? 0 : -1;
    }

    @Override // l9.k
    public List<v7.a> e(long j15) {
        return j15 >= 0 ? this.f124679a : Collections.EMPTY_LIST;
    }

    @Override // l9.k
    public long g(int i15) {
        p.d(i15 == 0);
        return 0L;
    }

    @Override // l9.k
    public int j() {
        return 1;
    }
}
