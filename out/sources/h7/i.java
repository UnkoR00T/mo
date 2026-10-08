package h7;

import fr.t;
import java.util.List;
import oq.r;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 *2\u00020\u0001:\u0001\u0017B'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010#\u001a\u0004\b&\u0010%R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b(\u0010!¨\u0006+"}, d2 = {"Lh7/i;", "", "", "Lh7/d;", "features", "", "centerX", "centerY", "<init>", "(Ljava/util/List;FF)V", "Lh7/g;", "f", "d", "(Lh7/g;)Lh7/i;", "c", "()Lh7/i;", "", "toString", "()Ljava/lang/String;", "", "bounds", "", "approximate", "a", "([FZ)[F", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/util/List;", "getFeatures$graphics_shapes_release", "()Ljava/util/List;", "b", "F", "getCenterX", "()F", "getCenterY", "Lh7/b;", "getCubics", "cubics", "e", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<d> features;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float centerX;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float centerY;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<h7.b> cubics;

    /* JADX INFO: renamed from: h7.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh7/i$a;", "", "<init>", "()V", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "x", "y", "Lr0/g;", "Landroidx/graphics/shapes/TransformResult;", "<anonymous>", "(FF)Lr0/g;"}, k = 3, mv = {1, 8, 0})
    static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f81318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f81319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f81320c;

        b(float f15, float f16, float f17) {
            this.f81318a = f15;
            this.f81319b = f16;
            this.f81320c = f17;
        }

        @Override // h7.g
        public final long a(float f15, float f16) {
            float f17 = f15 + this.f81318a;
            float f18 = this.f81319b;
            return r0.g.b(f17 / f18, (f16 + this.f81320c) / f18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(List<? extends d> list, float f15, float f16) {
        List<h7.b> listT;
        List<h7.b> listT2;
        h7.b bVar;
        List<h7.b> listA;
        this.features = list;
        this.centerX = f15;
        this.centerY = f16;
        List listC = v.c();
        int i15 = 0;
        h7.b bVar2 = null;
        if (list.size() <= 0 || ((d) list.get(0)).a().size() != 3) {
            listT = null;
            listT2 = null;
        } else {
            r<h7.b, h7.b> rVarM = ((d) list.get(0)).a().get(1).m(0.5f);
            h7.b bVarA = rVarM.a();
            h7.b bVarB = rVarM.b();
            listT2 = v.t(((d) list.get(0)).a().get(0), bVarA);
            listT = v.t(bVarB, ((d) list.get(0)).a().get(2));
        }
        int size = list.size();
        if (size >= 0) {
            int i16 = 0;
            h7.b bVar3 = null;
            while (true) {
                if (i16 == 0 && listT != null) {
                    listA = listT;
                } else if (i16 != this.features.size()) {
                    listA = this.features.get(i16).a();
                } else if (listT2 == null) {
                    break;
                } else {
                    listA = listT2;
                }
                int size2 = listA.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    h7.b bVar4 = listA.get(i17);
                    if (!bVar4.p()) {
                        if (bVar3 != null) {
                            listC.add(bVar3);
                        }
                        if (bVar2 == null) {
                            bVar2 = bVar4;
                            bVar3 = bVar2;
                        } else {
                            bVar3 = bVar4;
                        }
                    } else if (bVar3 != null) {
                        bVar3.getPoints()[6] = bVar4.d();
                        bVar3.getPoints()[7] = bVar4.e();
                    }
                }
                if (i16 == size) {
                    break;
                } else {
                    i16++;
                }
            }
            bVar = bVar2;
            bVar2 = bVar3;
        } else {
            bVar = null;
        }
        if (bVar2 != null && bVar != null) {
            listC.add(c.a(bVar2.b(), bVar2.c(), bVar2.f(), bVar2.g(), bVar2.h(), bVar2.i(), bVar.b(), bVar.c()));
        }
        List<h7.b> listA2 = v.a(listC);
        this.cubics = listA2;
        h7.b bVar5 = listA2.get(listA2.size() - 1);
        int size3 = listA2.size();
        while (i15 < size3) {
            h7.b bVar6 = this.cubics.get(i15);
            h7.b bVar7 = bVar5;
            if (Math.abs(bVar6.b() - bVar7.d()) > 1.0E-4f || Math.abs(bVar6.c() - bVar7.e()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i15++;
            bVar5 = bVar6;
        }
    }

    public static /* synthetic */ float[] b(i iVar, float[] fArr, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            fArr = new float[4];
        }
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        return iVar.a(fArr, z15);
    }

    public final float[] a(float[] bounds, boolean approximate) {
        if (bounds.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int size = this.cubics.size();
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        for (int i15 = 0; i15 < size; i15++) {
            this.cubics.get(i15).a(bounds, approximate);
            fMin = Math.min(fMin, bounds[0]);
            fMin2 = Math.min(fMin2, bounds[1]);
            fMax = Math.max(fMax, bounds[2]);
            fMax2 = Math.max(fMax2, bounds[3]);
        }
        bounds[0] = fMin;
        bounds[1] = fMin2;
        bounds[2] = fMax;
        bounds[3] = fMax2;
        return bounds;
    }

    public final i c() {
        float[] fArrB = b(this, null, false, 3, null);
        float f15 = fArrB[2] - fArrB[0];
        float f16 = fArrB[3] - fArrB[1];
        float fMax = Math.max(f15, f16);
        float f17 = 2;
        return d(new b(((fMax - f15) / f17) - fArrB[0], fMax, ((fMax - f16) / f17) - fArrB[1]));
    }

    public final i d(g f15) {
        long jM = f.m(r0.g.b(this.centerX, this.centerY), f15);
        List listC = v.c();
        int size = this.features.size();
        for (int i15 = 0; i15 < size; i15++) {
            listC.add(this.features.get(i15).b(f15));
        }
        return new i(v.a(listC), f.g(jM), f.h(jM));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof i) {
            return t.c(this.features, ((i) other).features);
        }
        return false;
    }

    public int hashCode() {
        return this.features.hashCode();
    }

    public String toString() {
        return "[RoundedPolygon. Cubics = " + v.v0(this.cubics, null, null, null, 0, null, null, 63, null) + " || Features = " + v.v0(this.features, null, null, null, 0, null, null, 63, null) + " || Center = (" + this.centerX + ", " + this.centerY + ")]";
    }
}
