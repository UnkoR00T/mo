package np;

import bp.h;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f137579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f137580b;

    public a(bp.a aVar, int i15) {
        this.f137580b = aVar.s4();
        this.f137579a = i15;
    }

    @Override // hp.c
    public bp.b D1() {
        bp.a aVar = new bp.a();
        bp.a aVar2 = new bp.a();
        aVar2.q4(this.f137580b);
        aVar.A3(aVar2);
        aVar.A3(h.g4(this.f137579a));
        return aVar;
    }

    public String toString() {
        return "PDLineDashPattern{array=" + Arrays.toString(this.f137580b) + ", phase=" + this.f137579a + "}";
    }
}
