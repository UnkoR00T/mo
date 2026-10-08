package n3;

import android.graphics.ColorFilter;
import androidx.compose.ui.graphics.Color;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n3.b1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001e"}, d2 = {"Ln3/b1;", "Ln3/n1;", "Landroidx/compose/ui/graphics/Color;", "color", "Ln3/a1;", "blendMode", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "nativeColorFilter", "<init>", "(JILandroid/graphics/ColorFilter;Lfr/k;)V", "(JILfr/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "c", "J", "getColor-0d7_KjU", "()J", "d", "I", "b", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BlendModeColorFilter extends n1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long color;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int blendMode;

    public /* synthetic */ BlendModeColorFilter(long j15, int i15, ColorFilter colorFilter, fr.k kVar) {
        this(j15, i15, colorFilter);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlendModeColorFilter)) {
            return false;
        }
        BlendModeColorFilter blendModeColorFilter = (BlendModeColorFilter) other;
        return Color.m11equalsimpl0(this.color, blendModeColorFilter.color) && a1.E(this.blendMode, blendModeColorFilter.blendMode);
    }

    public int hashCode() {
        return (Color.m17hashCodeimpl(this.color) * 31) + a1.F(this.blendMode);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + ((Object) Color.m18toStringimpl(this.color)) + ", blendMode=" + ((Object) a1.G(this.blendMode)) + ')';
    }

    public /* synthetic */ BlendModeColorFilter(long j15, int i15, fr.k kVar) {
        this(j15, i15);
    }

    private BlendModeColorFilter(long j15, int i15, ColorFilter colorFilter) {
        super(colorFilter);
        this.color = j15;
        this.blendMode = i15;
    }

    private BlendModeColorFilter(long j15, int i15) {
        this(j15, i15, g0.a(j15, i15), null);
    }
}
