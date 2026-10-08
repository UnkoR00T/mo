package nd;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class c extends p<od.d, od.d> {
    public c(List<ud.a<od.d>> list) {
        super(b(list));
    }

    private static ud.a<od.d> a(ud.a<od.d> aVar) {
        od.d dVar = aVar.f197576b;
        od.d dVar2 = aVar.f197577c;
        if (dVar == null || dVar2 == null || dVar.e().length == dVar2.e().length) {
            return aVar;
        }
        float[] fArrC = c(dVar.e(), dVar2.e());
        return aVar.b(dVar.b(fArrC), dVar2.b(fArrC));
    }

    private static List<ud.a<od.d>> b(List<ud.a<od.d>> list) {
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.set(i15, a(list.get(i15)));
        }
        return list;
    }

    static float[] c(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f15 = Float.NaN;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            float f16 = fArr3[i16];
            if (f16 != f15) {
                fArr3[i15] = f16;
                i15++;
                f15 = fArr3[i16];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i15);
    }

    @Override // nd.p, nd.o
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // nd.o
    public id.a<od.d, od.d> l() {
        return new id.e(this.f134267a);
    }

    @Override // nd.p, nd.o
    public /* bridge */ /* synthetic */ List m() {
        return super.m();
    }

    @Override // nd.p
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
