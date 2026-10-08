package t04;

import p071kotlin.Metadata;
import vy.Coordinates;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0007¨\u0006\f"}, d2 = {"Lt04/b;", "", "<init>", "()V", "Lvy/c;", "b", "Lvy/c;", "()Lvy/c;", "COORDINATE_WARSAW", "c", "a", "COORDINATES_LODZ", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f186822a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Coordinates COORDINATE_WARSAW = new Coordinates(52.237049d, 21.017532d);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Coordinates COORDINATES_LODZ = new Coordinates(51.759445d, 19.457216d);

    private b() {
    }

    public final Coordinates a() {
        return COORDINATES_LODZ;
    }

    public final Coordinates b() {
        return COORDINATE_WARSAW;
    }
}
