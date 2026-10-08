package cm;

import bm.b;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public class e<T extends bm.b> extends c<T> implements g<T> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final im.b f28210i = new im.b(1.0d);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private LatLng f28213h;

    public e(int i15, int i16) {
        this.f28211f = i15;
        this.f28212g = i16;
    }

    private hm.a m(float f15) {
        LatLng latLng = this.f28213h;
        if (latLng == null) {
            return new hm.a(0.0d, 0.0d, 0.0d, 0.0d);
        }
        im.a aVarB = f28210i.b(latLng);
        double d15 = f15;
        double dPow = ((((double) this.f28211f) / Math.pow(2.0d, d15)) / 256.0d) / 2.0d;
        double dPow2 = ((((double) this.f28212g) / Math.pow(2.0d, d15)) / 256.0d) / 2.0d;
        double d16 = aVarB.x;
        double d17 = aVarB.y;
        return new hm.a(d16 - dPow, d16 + dPow, d17 - dPow2, d17 + dPow2);
    }

    @Override // cm.g
    public void b(CameraPosition cameraPosition) {
        this.f28213h = cameraPosition.f31419a;
    }

    @Override // cm.g
    public boolean e() {
        return true;
    }

    @Override // cm.c
    protected Collection<c.a<T>> l(jm.a<c.a<T>> aVar, float f15) {
        hm.a aVarM = m(f15);
        ArrayList arrayList = new ArrayList();
        double d15 = aVarM.minX;
        if (d15 < 0.0d) {
            arrayList.addAll(aVar.d(new hm.a(d15 + 1.0d, 1.0d, aVarM.minY, aVarM.maxY)));
            aVarM = new hm.a(0.0d, aVarM.maxX, aVarM.minY, aVarM.maxY);
        }
        double d16 = aVarM.maxX;
        if (d16 > 1.0d) {
            arrayList.addAll(aVar.d(new hm.a(0.0d, d16 - 1.0d, aVarM.minY, aVarM.maxY)));
            aVarM = new hm.a(aVarM.minX, 1.0d, aVarM.minY, aVarM.maxY);
        }
        arrayList.addAll(aVar.d(aVarM));
        return arrayList;
    }
}
