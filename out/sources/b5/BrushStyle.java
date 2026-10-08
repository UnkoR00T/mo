package b5;

import androidx.compose.ui.graphics.Color;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b5.c, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lb5/c;", "Lb5/p;", "Landroidx/compose/ui/graphics/h;", "value", "", "alpha", "<init>", "(Landroidx/compose/ui/graphics/h;F)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Landroidx/compose/ui/graphics/h;", "j", "()Landroidx/compose/ui/graphics/h;", "c", "F", "a", "()F", "Landroidx/compose/ui/graphics/Color;", "()J", "color", "Landroidx/compose/ui/graphics/c;", "h", "()Landroidx/compose/ui/graphics/c;", "brush", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class BrushStyle implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final androidx.compose.ui.graphics.h value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    public BrushStyle(androidx.compose.ui.graphics.h hVar, float f15) {
        this.value = hVar;
        this.alpha = f15;
    }

    @Override // b5.p
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // b5.p
    /* JADX INFO: renamed from: b */
    public long getValue() {
        return Color.INSTANCE.h();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrushStyle)) {
            return false;
        }
        BrushStyle brushStyle = (BrushStyle) other;
        return fr.t.c(this.value, brushStyle.value) && Float.compare(this.alpha, brushStyle.alpha) == 0;
    }

    @Override // b5.p
    public androidx.compose.ui.graphics.c h() {
        return this.value;
    }

    public int hashCode() {
        return (this.value.hashCode() * 31) + Float.hashCode(this.alpha);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final androidx.compose.ui.graphics.h getValue() {
        return this.value;
    }

    public String toString() {
        return "BrushStyle(value=" + this.value + ", alpha=" + this.alpha + ')';
    }
}
