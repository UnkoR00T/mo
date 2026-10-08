package p012a2;

import androidx.compose.ui.graphics.Color;
import fr.k;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.r;
import p076m2.t;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\rJ\u001a\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"La2/n1;", "La2/r0;", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "disabledBackgroundColor", "disabledContentColor", "<init>", "(JJJJLfr/k;)V", "", "enabled", "Lm2/f6;", "a", "(ZLm2/r;I)Lm2/f6;", "b", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "c", "d", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class n1 implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long backgroundColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long contentColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledBackgroundColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long disabledContentColor;

    public /* synthetic */ n1(long j15, long j16, long j17, long j18, k kVar) {
        this(j15, j16, j17, j18);
    }

    @Override // p012a2.r0
    public f6<Color> a(boolean z15, r rVar, int i15) {
        rVar.X(-655254499);
        if (t.k()) {
            t.o(-655254499, i15, -1, "androidx.compose.material.DefaultButtonColors.backgroundColor (Button.kt:581)");
        }
        f6<Color> f6VarP = x5.p(Color.m0boximpl(z15 ? this.backgroundColor : this.disabledBackgroundColor), rVar, 0);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return f6VarP;
    }

    @Override // p012a2.r0
    public f6<Color> b(boolean z15, r rVar, int i15) {
        rVar.X(-2133647540);
        if (t.k()) {
            t.o(-2133647540, i15, -1, "androidx.compose.material.DefaultButtonColors.contentColor (Button.kt:586)");
        }
        f6<Color> f6VarP = x5.p(Color.m0boximpl(z15 ? this.contentColor : this.disabledContentColor), rVar, 0);
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return f6VarP;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || n1.class != other.getClass()) {
            return false;
        }
        n1 n1Var = (n1) other;
        return Color.m11equalsimpl0(this.backgroundColor, n1Var.backgroundColor) && Color.m11equalsimpl0(this.contentColor, n1Var.contentColor) && Color.m11equalsimpl0(this.disabledBackgroundColor, n1Var.disabledBackgroundColor) && Color.m11equalsimpl0(this.disabledContentColor, n1Var.disabledContentColor);
    }

    public int hashCode() {
        return (((((Color.m17hashCodeimpl(this.backgroundColor) * 31) + Color.m17hashCodeimpl(this.contentColor)) * 31) + Color.m17hashCodeimpl(this.disabledBackgroundColor)) * 31) + Color.m17hashCodeimpl(this.disabledContentColor);
    }

    private n1(long j15, long j16, long j17, long j18) {
        this.backgroundColor = j15;
        this.contentColor = j16;
        this.disabledBackgroundColor = j17;
        this.disabledContentColor = j18;
    }
}
