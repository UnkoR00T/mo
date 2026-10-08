package od;

import fd.a0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class q implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f144773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f144774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f144775c;

    public q(String str, List<c> list, boolean z15) {
        this.f144773a = str;
        this.f144774b = list;
        this.f144775c = z15;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        return new hd.d(a0Var, bVar, this, fVar);
    }

    public List<c> b() {
        return this.f144774b;
    }

    public String c() {
        return this.f144773a;
    }

    public boolean d() {
        return this.f144775c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f144773a + "' Shapes: " + Arrays.toString(this.f144774b.toArray()) + '}';
    }
}
