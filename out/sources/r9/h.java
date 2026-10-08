package r9;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import l9.k;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f172416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f172417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, g> f172418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, e> f172419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, String> f172420e;

    public h(c cVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f172416a = cVar;
        this.f172419d = map2;
        this.f172420e = map3;
        this.f172418c = map != null ? Collections.unmodifiableMap(map) : Collections.EMPTY_MAP;
        this.f172417b = cVar.j();
    }

    @Override // l9.k
    public int b(long j15) {
        int iD = o0.d(this.f172417b, j15, false, false);
        if (iD < this.f172417b.length) {
            return iD;
        }
        return -1;
    }

    @Override // l9.k
    public List<v7.a> e(long j15) {
        return this.f172416a.h(j15, this.f172418c, this.f172419d, this.f172420e);
    }

    @Override // l9.k
    public long g(int i15) {
        return this.f172417b[i15];
    }

    @Override // l9.k
    public int j() {
        return this.f172417b.length;
    }
}
