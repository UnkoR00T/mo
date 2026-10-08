package u14;

import p071kotlin.Metadata;
import vy.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lu14/f;", "Le14/e;", "Luy/d;", "gpsManager", "<init>", "(Luy/d;)V", "Lgz/b$a$a;", "params", "Lmu/g;", "Lvy/d;", "b", "(Lgz/b$a$a;)Lmu/g;", "a", "Luy/d;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements e14.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uy.d gpsManager;

    public f(uy.d dVar) {
        this.gpsManager = dVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mu.g<vy.d> a(gz.b.a.C1792a params) {
        return uy.d.c(this.gpsManager, j.PRIORITY_HIGH_ACCURACY, 0L, 2, null);
    }
}
