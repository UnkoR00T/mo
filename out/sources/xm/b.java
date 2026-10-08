package xm;

import android.graphics.PointF;
import eh.xe;
import eh.ye;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f219691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f219692b;

    public b(int i15, List list) {
        this.f219691a = i15;
        this.f219692b = list;
    }

    public int a() {
        return this.f219691a;
    }

    public List<PointF> b() {
        return this.f219692b;
    }

    public String toString() {
        xe xeVarA = ye.a("FaceContour");
        xeVarA.b("type", this.f219691a);
        xeVarA.c("points", this.f219692b.toArray());
        return xeVarA.toString();
    }
}
