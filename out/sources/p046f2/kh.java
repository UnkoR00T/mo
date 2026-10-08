package p046f2;

import androidx.compose.ui.graphics.Color;
import fr.k;
import l2.k0;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;
import p114t0.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lf2/kh;", "", "Landroidx/compose/ui/graphics/Color;", "selectedColor", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "<init>", "(JJJJLfr/k;)V", "a", "(JJJJ)Lf2/kh;", "", "enabled", "selected", "Lm2/f6;", "b", "(ZZLm2/r;I)Lm2/f6;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getSelectedColor-0d7_KjU", "()J", "getUnselectedColor-0d7_KjU", "c", "getDisabledSelectedColor-0d7_KjU", "d", "getDisabledUnselectedColor-0d7_KjU", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class kh {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectedColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long unselectedColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledSelectedColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledUnselectedColor;

    public /* synthetic */ kh(long j15, long j16, long j17, long j18, k kVar) {
        this(j15, j16, j17, j18);
    }

    public final kh a(long selectedColor, long unselectedColor, long disabledSelectedColor, long disabledUnselectedColor) {
        return new kh(selectedColor != 16 ? selectedColor : this.selectedColor, unselectedColor != 16 ? unselectedColor : this.unselectedColor, disabledSelectedColor != 16 ? disabledSelectedColor : this.disabledSelectedColor, disabledUnselectedColor != 16 ? disabledUnselectedColor : this.disabledUnselectedColor, null);
    }

    public final f6<Color> b(boolean z15, boolean z16, r rVar, int i15) {
        long j15;
        f6<Color> f6VarP;
        if (t.k()) {
            t.o(-1840145292, i15, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:230)");
        }
        if (z15 && z16) {
            j15 = this.selectedColor;
        } else if (!z15 || z16) {
            j15 = (z15 || !z16) ? this.disabledUnselectedColor : this.disabledSelectedColor;
        } else {
            j15 = this.unselectedColor;
        }
        long j16 = j15;
        if (z15) {
            rVar.X(1194671677);
            f6VarP = v0.a(j16, of.b(k0.DefaultEffects, rVar, 6), null, null, rVar, 0, 12);
            rVar.R();
        } else {
            rVar.X(1194849338);
            f6VarP = x5.p(Color.m0boximpl(j16), rVar, 0);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return f6VarP;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof kh)) {
            return false;
        }
        kh khVar = (kh) other;
        return Color.m11equalsimpl0(this.selectedColor, khVar.selectedColor) && Color.m11equalsimpl0(this.unselectedColor, khVar.unselectedColor) && Color.m11equalsimpl0(this.disabledSelectedColor, khVar.disabledSelectedColor) && Color.m11equalsimpl0(this.disabledUnselectedColor, khVar.disabledUnselectedColor);
    }

    public int hashCode() {
        return (((((Color.m17hashCodeimpl(this.selectedColor) * 31) + Color.m17hashCodeimpl(this.unselectedColor)) * 31) + Color.m17hashCodeimpl(this.disabledSelectedColor)) * 31) + Color.m17hashCodeimpl(this.disabledUnselectedColor);
    }

    private kh(long j15, long j16, long j17, long j18) {
        this.selectedColor = j15;
        this.unselectedColor = j16;
        this.disabledSelectedColor = j17;
        this.disabledUnselectedColor = j18;
    }
}
