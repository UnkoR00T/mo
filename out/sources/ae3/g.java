package ae3;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lae3/g;", "", "Lgz/b$a$a;", "Lvy/c;", "Lzd3/b;", "gpsCoordinateRepository", "<init>", "(Lzd3/b;)V", "params", "Lmu/g;", "b", "(Lgz/b$a$a;)Lmu/g;", "a", "Lzd3/b;", "getGpsCoordinateRepository", "()Lzd3/b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final zd3.b gpsCoordinateRepository;

    public g(zd3.b bVar) {
        this.gpsCoordinateRepository = bVar;
    }

    public mu.g<Coordinates> b(gz.b.a.C1792a params) {
        return this.gpsCoordinateRepository.m();
    }
}
