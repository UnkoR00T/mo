package h7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lr.m;
import oq.r;
import oq.y;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import pq.s0;
import pq.v;
import r0.f0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aS\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aG\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001b\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a/\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"", "numVertices", "", "radius", "centerX", "centerY", "Lh7/a;", "rounding", "", "perVertexRounding", "Lh7/i;", "a", "(IFFFLh7/a;Ljava/util/List;)Lh7/i;", "", "vertices", "b", "([FLh7/a;Ljava/util/List;FF)Lh7/i;", "Lr0/g;", "Landroidx/graphics/shapes/Point;", "e", "([F)J", "f", "(IFFF)[F", "graphics-shapes_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {
    public static final i a(int i15, float f15, float f16, float f17, a aVar, List<a> list) {
        return b(f(i15, f15, f16, f17), aVar, list, f16, f17);
    }

    public static final i b(float[] fArr, a aVar, List<a> list, float f15, float f16) {
        a aVar2;
        Float fValueOf = Float.valueOf(1.0f);
        if (fArr.length < 6) {
            throw new IllegalArgumentException("Polygons must have at least 3 vertices");
        }
        int i15 = 2;
        int i16 = 1;
        if (fArr.length % 2 == 1) {
            throw new IllegalArgumentException("The vertices array should have even size");
        }
        if (list != null && list.size() * 2 != fArr.length) {
            throw new IllegalArgumentException("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
        }
        ArrayList arrayList = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList2 = new ArrayList();
        int i17 = 0;
        int i18 = 0;
        while (i18 < length) {
            a aVar3 = (list == null || (aVar2 = list.get(i18)) == null) ? aVar : aVar2;
            int i19 = (((i18 + length) - 1) % length) * 2;
            int i25 = i18 + 1;
            int i26 = (i25 % length) * 2;
            int i27 = i18 * 2;
            arrayList2.add(new h(r0.g.b(fArr[i19], fArr[i19 + 1]), r0.g.b(fArr[i27], fArr[i27 + 1]), r0.g.b(fArr[i26], fArr[i26 + 1]), aVar3, null));
            i18 = i25;
        }
        lr.i iVarW = m.w(0, length);
        ArrayList arrayList3 = new ArrayList(v.y(iVarW, 10));
        Iterator<Integer> it = iVarW.iterator();
        while (it.hasNext()) {
            int iNextInt = ((s0) it).nextInt();
            int i28 = (iNextInt + 1) % length;
            float expectedRoundCut = ((h) arrayList2.get(iNextInt)).getExpectedRoundCut() + ((h) arrayList2.get(i28)).getExpectedRoundCut();
            float fE = ((h) arrayList2.get(iNextInt)).e() + ((h) arrayList2.get(i28)).e();
            int i29 = iNextInt * 2;
            int i35 = i28 * 2;
            float fC = l.c(fArr[i29] - fArr[i35], fArr[i29 + 1] - fArr[i35 + 1]);
            arrayList3.add(expectedRoundCut > fC ? y.a(Float.valueOf(fC / expectedRoundCut), Float.valueOf(0.0f)) : fE > fC ? y.a(fValueOf, Float.valueOf((fC - expectedRoundCut) / (fE - expectedRoundCut))) : y.a(fValueOf, fValueOf));
        }
        for (int i36 = 0; i36 < length; i36++) {
            f0 f0Var = new f0(2);
            for (int i37 = 0; i37 < 2; i37++) {
                r rVar = (r) arrayList3.get((((i36 + length) - 1) + i37) % length);
                f0Var.d((((h) arrayList2.get(i36)).getExpectedRoundCut() * ((Number) rVar.a()).floatValue()) + ((((h) arrayList2.get(i36)).e() - ((h) arrayList2.get(i36)).getExpectedRoundCut()) * ((Number) rVar.b()).floatValue()));
            }
            arrayList.add(((h) arrayList2.get(i36)).d(f0Var.a(0), f0Var.a(1)));
        }
        ArrayList arrayList4 = new ArrayList();
        while (i17 < length) {
            int i38 = i17 + 1;
            int i39 = i38 % length;
            int i45 = i17 * 2;
            long jB = r0.g.b(fArr[i45], fArr[i45 + i16]);
            int i46 = (((i17 + length) - i16) % length) * i15;
            long jB2 = r0.g.b(fArr[i46], fArr[i46 + i16]);
            int i47 = i39 * 2;
            arrayList4.add(new d.a((List) arrayList.get(i17), jB, ((h) arrayList2.get(i17)).getCenter(), f.a(f.j(jB, jB2), f.j(r0.g.b(fArr[i47], fArr[i47 + i16]), jB)), null));
            arrayList4.add(new d.b(v.e(b.INSTANCE.b(((b) v.x0((List) arrayList.get(i17))).d(), ((b) v.x0((List) arrayList.get(i17))).e(), ((b) v.l0((List) arrayList.get(i39))).b(), ((b) v.l0((List) arrayList.get(i39))).c()))));
            i17 = i38;
            i15 = 2;
            i16 = 1;
        }
        long jE = (f15 == Float.MIN_VALUE || f16 == Float.MIN_VALUE) ? e(fArr) : r0.g.b(f15, f16);
        return new i(arrayList4, Float.intBitsToFloat((int) (jE >> 32)), Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax)));
    }

    public static /* synthetic */ i c(int i15, float f15, float f16, float f17, a aVar, List list, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            f15 = 1.0f;
        }
        if ((i16 & 4) != 0) {
            f16 = 0.0f;
        }
        if ((i16 & 8) != 0) {
            f17 = 0.0f;
        }
        if ((i16 & 16) != 0) {
            aVar = a.f81292d;
        }
        if ((i16 & 32) != 0) {
            list = null;
        }
        List list2 = list;
        return a(i15, f15, f16, f17, aVar, list2);
    }

    public static /* synthetic */ i d(float[] fArr, a aVar, List list, float f15, float f16, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            aVar = a.f81292d;
        }
        if ((i15 & 4) != 0) {
            list = null;
        }
        if ((i15 & 8) != 0) {
            f15 = Float.MIN_VALUE;
        }
        if ((i15 & 16) != 0) {
            f16 = Float.MIN_VALUE;
        }
        return b(fArr, aVar, list, f15, f16);
    }

    private static final long e(float[] fArr) {
        float f15 = 0.0f;
        int i15 = 0;
        float f16 = 0.0f;
        while (i15 < fArr.length) {
            int i16 = i15 + 1;
            f15 += fArr[i15];
            i15 += 2;
            f16 += fArr[i16];
        }
        float f17 = 2;
        return r0.g.b((f15 / fArr.length) / f17, (f16 / fArr.length) / f17);
    }

    private static final float[] f(int i15, float f15, float f16, float f17) {
        float[] fArr = new float[i15 * 2];
        int i16 = 0;
        int i17 = 0;
        while (i16 < i15) {
            float f18 = f15;
            long jK = f.k(l.g(f18, (l.d() / i15) * 2 * i16, 0L, 4, null), r0.g.b(f16, f17));
            int i18 = i17 + 1;
            fArr[i17] = f.g(jK);
            i17 += 2;
            fArr[i18] = f.h(jK);
            i16++;
            f15 = f18;
        }
        return fArr;
    }
}
