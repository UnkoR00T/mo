package j60;

import androidx.compose.ui.graphics.Color;
import fr.k;
import fr.t;
import k70.o;
import p071kotlin.Metadata;
import q4.TextStyle;

/* JADX INFO: renamed from: j60.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lj60/a;", "", "Lq4/b4;", "textStyle", "Landroidx/compose/ui/graphics/Color;", "textColor", "<init>", "(Lq4/b4;JLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq4/b4;", "b", "()Lq4/b4;", "J", "()J", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BulletItemStyle {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f99759c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle textStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long textColor;

    public /* synthetic */ BulletItemStyle(TextStyle textStyle, long j15, k kVar) {
        this(textStyle, j15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getTextColor() {
        return this.textColor;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextStyle getTextStyle() {
        return this.textStyle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BulletItemStyle)) {
            return false;
        }
        BulletItemStyle bulletItemStyle = (BulletItemStyle) other;
        return t.c(this.textStyle, bulletItemStyle.textStyle) && Color.m11equalsimpl0(this.textColor, bulletItemStyle.textColor);
    }

    public int hashCode() {
        return (this.textStyle.hashCode() * 31) + Color.m17hashCodeimpl(this.textColor);
    }

    public String toString() {
        return "BulletItemStyle(textStyle=" + this.textStyle + ", textColor=" + ((Object) Color.m18toStringimpl(this.textColor)) + ')';
    }

    private BulletItemStyle(TextStyle textStyle, long j15) {
        this.textStyle = textStyle;
        this.textColor = j15;
    }

    public /* synthetic */ BulletItemStyle(TextStyle textStyle, long j15, int i15, k kVar) {
        this((i15 & 1) != 0 ? o.f108893a.a() : textStyle, (i15 & 2) != 0 ? Color.INSTANCE.h() : j15, null);
    }
}
