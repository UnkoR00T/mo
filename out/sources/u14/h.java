package u14;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lu14/h;", "Le14/f;", "Luy/d;", "gpsManager", "<init>", "(Luy/d;)V", "Lgz/b$a$a;", "params", "Lmu/g;", "Ldx/i;", "Ldx/b;", "Lvy/c;", "b", "(Lgz/b$a$a;)Lmu/g;", "a", "Luy/d;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements e14.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uy.d gpsManager;

    public h(uy.d dVar) {
        this.gpsManager = dVar;
    }

    @Override // gz.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public mu.g<dx.i<dx.b, Coordinates>> a(gz.b.a.C1792a params) {
        return this.gpsManager.g();
    }
}
