package xm;

import android.graphics.PointF;
import eh.xe;
import eh.ye;

/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f219707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f219708b;

    f(int i15, PointF pointF) {
        this.f219707a = i15;
        this.f219708b = pointF;
    }

    public int a() {
        return this.f219707a;
    }

    public PointF b() {
        return this.f219708b;
    }

    public String toString() {
        xe xeVarA = ye.a("FaceLandmark");
        xeVarA.b("type", this.f219707a);
        xeVarA.c("position", this.f219708b);
        return xeVarA.toString();
    }
}
