package t3;

import fr.t;
import java.util.List;
import n3.a3;
import n3.b3;
import n3.o2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001B\u009b\u0001\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b2\u00103R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b4\u00100R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010!R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b9\u0010!R\u0017\u0010\u0014\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b5\u00101\u001a\u0004\b:\u00103R\u0017\u0010\u0015\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b;\u00101\u001a\u0004\b<\u00103R\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b8\u00101\u001a\u0004\b=\u00103R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b>\u00101\u001a\u0004\b?\u00103¨\u0006@"}, d2 = {"Lt3/r;", "Lt3/p;", "", "name", "", "Lt3/h;", "pathData", "Ln3/o2;", "pathFillType", "Landroidx/compose/ui/graphics/c;", "fill", "", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "Ln3/a3;", "strokeLineCap", "Ln3/b3;", "strokeLineJoin", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILandroidx/compose/ui/graphics/c;FLandroidx/compose/ui/graphics/c;FFIIFFFFLfr/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "b", "Ljava/util/List;", "h", "()Ljava/util/List;", "c", "I", "i", "d", "Landroidx/compose/ui/graphics/c;", "e", "()Landroidx/compose/ui/graphics/c;", "F", "f", "()F", "k", "l", "s", "j", "n", "o", "q", "m", "v", "t", "p", "u", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<h> pathData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int pathFillType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.graphics.c fill;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float fillAlpha;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.graphics.c stroke;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float strokeAlpha;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float strokeLineWidth;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int strokeLineCap;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int strokeLineJoin;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final float strokeLineMiter;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final float trimPathStart;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final float trimPathEnd;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final float trimPathOffset;

    public /* synthetic */ r(String str, List list, int i15, androidx.compose.ui.graphics.c cVar, float f15, androidx.compose.ui.graphics.c cVar2, float f16, float f17, int i16, int i17, float f18, float f19, float f25, float f26, fr.k kVar) {
        this(str, list, i15, cVar, f15, cVar2, f16, f17, i16, i17, f18, f19, f25, f26);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final androidx.compose.ui.graphics.c getFill() {
        return this.fill;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && r.class == other.getClass()) {
            r rVar = (r) other;
            return t.c(this.name, rVar.name) && t.c(this.fill, rVar.fill) && this.fillAlpha == rVar.fillAlpha && t.c(this.stroke, rVar.stroke) && this.strokeAlpha == rVar.strokeAlpha && this.strokeLineWidth == rVar.strokeLineWidth && a3.e(this.strokeLineCap, rVar.strokeLineCap) && b3.e(this.strokeLineJoin, rVar.strokeLineJoin) && this.strokeLineMiter == rVar.strokeLineMiter && this.trimPathStart == rVar.trimPathStart && this.trimPathEnd == rVar.trimPathEnd && this.trimPathOffset == rVar.trimPathOffset && o2.d(this.pathFillType, rVar.pathFillType) && t.c(this.pathData, rVar.pathData);
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<h> h() {
        return this.pathData;
    }

    public int hashCode() {
        int iHashCode = ((this.name.hashCode() * 31) + this.pathData.hashCode()) * 31;
        androidx.compose.ui.graphics.c cVar = this.fill;
        int iHashCode2 = (((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + Float.hashCode(this.fillAlpha)) * 31;
        androidx.compose.ui.graphics.c cVar2 = this.stroke;
        return ((((((((((((((((((iHashCode2 + (cVar2 != null ? cVar2.hashCode() : 0)) * 31) + Float.hashCode(this.strokeAlpha)) * 31) + Float.hashCode(this.strokeLineWidth)) * 31) + a3.f(this.strokeLineCap)) * 31) + b3.f(this.strokeLineJoin)) * 31) + Float.hashCode(this.strokeLineMiter)) * 31) + Float.hashCode(this.trimPathStart)) * 31) + Float.hashCode(this.trimPathEnd)) * 31) + Float.hashCode(this.trimPathOffset)) * 31) + o2.e(this.pathFillType);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getPathFillType() {
        return this.pathFillType;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final androidx.compose.ui.graphics.c getStroke() {
        return this.stroke;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getStrokeLineCap() {
        return this.strokeLineCap;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getStrokeLineJoin() {
        return this.strokeLineJoin;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r(String str, List<? extends h> list, int i15, androidx.compose.ui.graphics.c cVar, float f15, androidx.compose.ui.graphics.c cVar2, float f16, float f17, int i16, int i17, float f18, float f19, float f25, float f26) {
        super(null);
        this.name = str;
        this.pathData = list;
        this.pathFillType = i15;
        this.fill = cVar;
        this.fillAlpha = f15;
        this.stroke = cVar2;
        this.strokeAlpha = f16;
        this.strokeLineWidth = f17;
        this.strokeLineCap = i16;
        this.strokeLineJoin = i17;
        this.strokeLineMiter = f18;
        this.trimPathStart = f19;
        this.trimPathEnd = f25;
        this.trimPathOffset = f26;
    }
}
