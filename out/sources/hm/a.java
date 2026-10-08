package hm;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018¨\u0006\u001c"}, d2 = {"Lhm/a;", "", "", "minX", "maxX", "minY", "maxY", "<init>", "(DDDD)V", "x", "y", "", "a", "(DD)Z", "Lhm/b;", "point", "c", "(Lhm/b;)Z", "d", "(DDDD)Z", "bounds", "e", "(Lhm/a;)Z", "b", ip.a.f96138c, "midX", "f", "midY", "library_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final double minX;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final double maxX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final double minY;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final double maxY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final double midX;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final double midY;

    public a(double d15, double d16, double d17, double d18) {
        this.minX = d15;
        this.maxX = d16;
        this.minY = d17;
        this.maxY = d18;
        double d19 = d15 + d16;
        double d25 = 2;
        this.midX = d19 / d25;
        this.midY = (d17 + d18) / d25;
    }

    public final boolean a(double x15, double y15) {
        return this.minX <= x15 && x15 <= this.maxX && this.minY <= y15 && y15 <= this.maxY;
    }

    public final boolean b(a bounds) {
        return bounds.minX >= this.minX && bounds.maxX <= this.maxX && bounds.minY >= this.minY && bounds.maxY <= this.maxY;
    }

    public final boolean c(Point point) {
        return a(point.x, point.y);
    }

    public final boolean d(double minX, double maxX, double minY, double maxY) {
        return minX < this.maxX && this.minX < maxX && minY < this.maxY && this.minY < maxY;
    }

    public final boolean e(a bounds) {
        return d(bounds.minX, bounds.maxX, bounds.minY, bounds.maxY);
    }
}
