package androidx.compose.ui.graphics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import n3.k2;
import oq.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00122\u00020\u0001:\u0001\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0013\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/c;", "", "<init>", "()V", "Lm3/k;", "size", "Ln3/k2;", "p", "", "alpha", "Loq/i0;", "a", "(JLn3/k2;F)V", "b", "J", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "c", "Landroidx/compose/ui/graphics/h;", "Landroidx/compose/ui/graphics/j;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long intrinsicSize;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u000f\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J;\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u001b\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001b\u0010\u0018JY\u0010\u001c\u001a\u00020\u000e2*\u0010\b\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\"\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/ui/graphics/c$a;", "", "<init>", "()V", "", "Loq/r;", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "Lm3/e;", "start", "end", "Landroidx/compose/ui/graphics/k;", "tileMode", "Landroidx/compose/ui/graphics/c;", "e", "([Loq/r;JJI)Landroidx/compose/ui/graphics/c;", "", "colors", "d", "(Ljava/util/List;JJI)Landroidx/compose/ui/graphics/c;", "startX", "endX", "b", "(Ljava/util/List;FFI)Landroidx/compose/ui/graphics/c;", "startY", "endY", "f", "g", "([Loq/r;FFI)Landroidx/compose/ui/graphics/c;", "dstBrush", "srcBrush", "Ln3/a1;", "blendMode", "a", "(Landroidx/compose/ui/graphics/c;Landroidx/compose/ui/graphics/c;I)Landroidx/compose/ui/graphics/c;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public static /* synthetic */ c c(Companion companion, List list, float f15, float f16, int i15, int i16, Object obj) {
            if ((i16 & 2) != 0) {
                f15 = 0.0f;
            }
            if ((i16 & 4) != 0) {
                f16 = Float.POSITIVE_INFINITY;
            }
            if ((i16 & 8) != 0) {
                i15 = k.INSTANCE.a();
            }
            return companion.b(list, f15, f16, i15);
        }

        public static /* synthetic */ c h(Companion companion, List list, float f15, float f16, int i15, int i16, Object obj) {
            if ((i16 & 2) != 0) {
                f15 = 0.0f;
            }
            if ((i16 & 4) != 0) {
                f16 = Float.POSITIVE_INFINITY;
            }
            if ((i16 & 8) != 0) {
                i15 = k.INSTANCE.a();
            }
            return companion.f(list, f15, f16, i15);
        }

        public static /* synthetic */ c i(Companion companion, r[] rVarArr, float f15, float f16, int i15, int i16, Object obj) {
            if ((i16 & 2) != 0) {
                f15 = 0.0f;
            }
            if ((i16 & 4) != 0) {
                f16 = Float.POSITIVE_INFINITY;
            }
            if ((i16 & 8) != 0) {
                i15 = k.INSTANCE.a();
            }
            return companion.g(rVarArr, f15, f16, i15);
        }

        public final c a(c dstBrush, c srcBrush, int blendMode) {
            return new CompositeShaderBrush(d.f(dstBrush), d.f(srcBrush), blendMode, null);
        }

        public final c b(List<Color> colors, float startX, float endX, int tileMode) {
            return d(colors, m3.e.e((((long) Float.floatToRawIntBits(startX)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax)), m3.e.e((((long) Float.floatToRawIntBits(endX)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & BodyPartID.bodyIdMax)), tileMode);
        }

        public final c d(List<Color> colors, long start, long end, int tileMode) {
            return new g(colors, null, start, end, tileMode, null);
        }

        public final c e(r<Float, Color>[] colorStops, long start, long end, int tileMode) {
            ArrayList arrayList = new ArrayList(colorStops.length);
            for (r<Float, Color> rVar : colorStops) {
                arrayList.add(Color.m0boximpl(rVar.d().m20unboximpl()));
            }
            ArrayList arrayList2 = new ArrayList(colorStops.length);
            for (r<Float, Color> rVar2 : colorStops) {
                arrayList2.add(Float.valueOf(rVar2.c().floatValue()));
            }
            return new g(arrayList, arrayList2, start, end, tileMode, null);
        }

        public final c f(List<Color> colors, float startY, float endY, int tileMode) {
            return d(colors, m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(startY)) & BodyPartID.bodyIdMax)), m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(endY)) & BodyPartID.bodyIdMax)), tileMode);
        }

        public final c g(r<Float, Color>[] colorStops, float startY, float endY, int tileMode) {
            return e((r[]) Arrays.copyOf(colorStops, colorStops.length), m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(startY)) & BodyPartID.bodyIdMax)), m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(endY)) & BodyPartID.bodyIdMax)), tileMode);
        }

        private Companion() {
        }
    }

    public /* synthetic */ c(fr.k kVar) {
        this();
    }

    public abstract void a(long size, k2 p15, float alpha);

    private c() {
        this.intrinsicSize = m3.k.INSTANCE.a();
    }
}
