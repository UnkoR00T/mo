package h7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lr.m;
import p071kotlin.Metadata;
import pq.s0;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0007*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\b\u0010\t\u001ak\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lh7/i$a;", "", "numVertices", "", "radius", "centerX", "centerY", "Lh7/i;", "a", "(Lh7/i$a;IFFF)Lh7/i;", "numVerticesPerRadius", "innerRadius", "Lh7/a;", "rounding", "innerRounding", "", "perVertexRounding", "c", "(Lh7/i$a;IFFLh7/a;Lh7/a;Ljava/util/List;FF)Lh7/i;", "", "e", "(IFFFF)[F", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {
    public static final i a(i.Companion companion, int i15, float f15, float f16, float f17) {
        if (i15 >= 3) {
            return j.c(i15, f15 / ((float) Math.cos(l.d() / i15)), f16, f17, new a(f15, 0.0f, 2, null), null, 32, null);
        }
        throw new IllegalArgumentException("Circle must have at least three vertices");
    }

    public static /* synthetic */ i b(i.Companion companion, int i15, float f15, float f16, float f17, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = 8;
        }
        if ((i16 & 2) != 0) {
            f15 = 1.0f;
        }
        if ((i16 & 4) != 0) {
            f16 = 0.0f;
        }
        if ((i16 & 8) != 0) {
            f17 = 0.0f;
        }
        return a(companion, i15, f15, f16, f17);
    }

    public static final i c(i.Companion companion, int i15, float f15, float f16, a aVar, a aVar2, List<a> list, float f17, float f18) {
        if (f15 <= 0.0f || f16 <= 0.0f) {
            throw new IllegalArgumentException("Star radii must both be greater than 0");
        }
        if (f16 >= f15) {
            throw new IllegalArgumentException("innerRadius must be less than radius");
        }
        if (list == null && aVar2 != null) {
            lr.i iVarW = m.w(0, i15);
            list = new ArrayList<>();
            Iterator<Integer> it = iVarW.iterator();
            while (it.hasNext()) {
                ((s0) it).nextInt();
                v.D(list, v.q(aVar, aVar2));
            }
        }
        return j.b(e(i15, f15, f16, f17, f18), aVar, list, f17, f18);
    }

    private static final float[] e(int i15, float f15, float f16, float f17, float f18) {
        float[] fArr = new float[i15 * 4];
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            float f19 = i15;
            long jG = l.g(f15, (l.d() / f19) * 2 * i17, 0L, 4, null);
            fArr[i16] = f.g(jG) + f17;
            fArr[i16 + 1] = f.h(jG) + f18;
            long jG2 = l.g(f16, (l.d() / f19) * ((i17 * 2) + 1), 0L, 4, null);
            int i18 = i16 + 3;
            fArr[i16 + 2] = f.g(jG2) + f17;
            i16 += 4;
            fArr[i18] = f.h(jG2) + f18;
        }
        return fArr;
    }
}
