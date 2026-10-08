package ez;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lez/g;", "", "Lgu/b;", "tick", "Lmu/g;", "a", "(J)Lmu/g;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {
    static /* synthetic */ mu.g b(g gVar, long j15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start-LRDsOJo");
        }
        if ((i15 & 1) != 0) {
            gu.b.Companion companion = gu.b.INSTANCE;
            j15 = gu.d.q(1, gu.e.SECONDS);
        }
        return gVar.a(j15);
    }

    mu.g<gu.b> a(long tick);
}
