package v;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<SurfaceConfig> f202760a = new ArrayList();

    private static void b(List<int[]> list, int i15, int[] iArr, int i16) {
        if (i16 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = 0;
            while (true) {
                if (i18 >= i16) {
                    iArr[i16] = i17;
                    b(list, i15, iArr, i16 + 1);
                    break;
                } else if (i17 == iArr[i18]) {
                    break;
                } else {
                    i18++;
                }
            }
        }
    }

    private List<int[]> c(int i15) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i15, new int[i15], 0);
        return arrayList;
    }

    public boolean a(SurfaceConfig surfaceConfig) {
        return this.f202760a.add(surfaceConfig);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[RETURN] */
    public List<SurfaceConfig> d(List<SurfaceConfig> list) {
        int i15;
        boolean zG;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f202760a.size()) {
            return null;
        }
        List<int[]> listC = c(this.f202760a.size());
        SurfaceConfig[] surfaceConfigArr = new SurfaceConfig[list.size()];
        Iterator<int[]> it = listC.iterator();
        do {
            i15 = 0;
            if (it.hasNext()) {
                int[] next = it.next();
                zG = true;
                while (i15 < this.f202760a.size()) {
                    if (next[i15] < list.size()) {
                        zG &= this.f202760a.get(i15).g(list.get(next[i15]));
                        if (!zG) {
                            break;
                        }
                        surfaceConfigArr[next[i15]] = this.f202760a.get(i15);
                    }
                    i15++;
                }
            }
            if (i15 != 0) {
                return Arrays.asList(surfaceConfigArr);
            }
            return null;
        } while (!zG);
        i15 = 1;
        if (i15 != 0) {
            return Arrays.asList(surfaceConfigArr);
        }
        return null;
    }
}
