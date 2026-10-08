package id;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class e extends g<od.d> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final od.d f90978i;

    public e(List<ud.a<od.d>> list) {
        super(list);
        int iMax = 0;
        for (int i15 = 0; i15 < list.size(); i15++) {
            od.d dVar = list.get(i15).f197576b;
            if (dVar != null) {
                iMax = Math.max(iMax, dVar.f());
            }
        }
        this.f90978i = new od.d(new float[iMax], new int[iMax]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // id.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public od.d i(ud.a<od.d> aVar, float f15) {
        this.f90978i.g(aVar.f197576b, aVar.f197577c, f15);
        return this.f90978i;
    }
}
