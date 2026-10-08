package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import n3.o1;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a9\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a?\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a9\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0019\u0010\u0014\u001a\u00020\u00012\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/graphics/c;", "Landroidx/compose/ui/graphics/h;", "f", "(Landroidx/compose/ui/graphics/c;)Landroidx/compose/ui/graphics/h;", "", "Landroidx/compose/ui/graphics/Color;", "left", "right", "", "t", "b", "(Ljava/util/List;Ljava/util/List;F)Ljava/util/List;", "d", "c", "Lm3/e;", "e", "(JJF)J", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "shader", "a", "(Landroid/graphics/Shader;)Landroidx/compose/ui/graphics/h;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/ui/graphics/d$a", "Landroidx/compose/ui/graphics/h;", "Lm3/k;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "c", "(J)Landroid/graphics/Shader;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Shader f9927g;

        a(Shader shader) {
            this.f9927g = shader;
        }

        @Override // androidx.compose.ui.graphics.h
        public Shader c(long size) {
            return this.f9927g;
        }
    }

    public static final h a(Shader shader) {
        return new a(shader);
    }

    public static final List<Color> b(List<Color> list, List<Color> list2, float f15) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i15 = 0; i15 < iMax; i15++) {
            arrayList.add(Color.m0boximpl(o1.h(list.get(Math.min(i15, list.size() - 1)).m20unboximpl(), list2.get(Math.min(i15, list2.size() - 1)).m20unboximpl(), f15)));
        }
        return arrayList;
    }

    public static final List<Float> c(List<Float> list, List<Float> list2, float f15) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i15 = 0; i15 < iMax; i15++) {
            arrayList.add(Float.valueOf(e5.c.b(list.get(Math.min(i15, list.size() - 1)).floatValue(), list2.get(Math.min(i15, list2.size() - 1)).floatValue(), f15)));
        }
        return arrayList;
    }

    public static final List<Float> d(List<Float> list, List<Float> list2, float f15) {
        if (list2 == null || list == null) {
            return null;
        }
        return c(list, list2, f15);
    }

    public static final long e(long j15, long j16, float f15) {
        if (((((j15 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j16 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            return m3.f.b(j15, j16, f15);
        }
        return f15 < 0.5f ? j15 : j16;
    }

    public static final h f(c cVar) {
        if (cVar instanceof h) {
            return (h) cVar;
        }
        if (!(cVar instanceof SolidColor)) {
            throw new p();
        }
        SolidColor solidColor = (SolidColor) cVar;
        return (h) c.Companion.h(c.INSTANCE, v.q(Color.m0boximpl(solidColor.getValue()), Color.m0boximpl(solidColor.getValue())), 0.0f, 0.0f, 0, 14, null);
    }
}
