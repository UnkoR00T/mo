package q4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lq4/u3;", "", "Lq4/h3;", "style", "focusedStyle", "hoveredStyle", "pressedStyle", "<init>", "(Lq4/h3;Lq4/h3;Lq4/h3;Lq4/h3;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lq4/h3;", "d", "()Lq4/h3;", "b", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle style;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle focusedStyle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle hoveredStyle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle pressedStyle;

    public u3() {
        this(null, null, null, null, 15, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final SpanStyle getFocusedStyle() {
        return this.focusedStyle;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final SpanStyle getHoveredStyle() {
        return this.hoveredStyle;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final SpanStyle getPressedStyle() {
        return this.pressedStyle;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final SpanStyle getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof u3)) {
            return false;
        }
        u3 u3Var = (u3) other;
        return fr.t.c(this.style, u3Var.style) && fr.t.c(this.focusedStyle, u3Var.focusedStyle) && fr.t.c(this.hoveredStyle, u3Var.hoveredStyle) && fr.t.c(this.pressedStyle, u3Var.pressedStyle);
    }

    public int hashCode() {
        SpanStyle h3Var = this.style;
        int iHashCode = (h3Var != null ? h3Var.hashCode() : 0) * 31;
        SpanStyle h3Var2 = this.focusedStyle;
        int iHashCode2 = (iHashCode + (h3Var2 != null ? h3Var2.hashCode() : 0)) * 31;
        SpanStyle h3Var3 = this.hoveredStyle;
        int iHashCode3 = (iHashCode2 + (h3Var3 != null ? h3Var3.hashCode() : 0)) * 31;
        SpanStyle h3Var4 = this.pressedStyle;
        return iHashCode3 + (h3Var4 != null ? h3Var4.hashCode() : 0);
    }

    public u3(SpanStyle h3Var, SpanStyle h3Var2, SpanStyle h3Var3, SpanStyle h3Var4) {
        this.style = h3Var;
        this.focusedStyle = h3Var2;
        this.hoveredStyle = h3Var3;
        this.pressedStyle = h3Var4;
    }

    public /* synthetic */ u3(SpanStyle h3Var, SpanStyle h3Var2, SpanStyle h3Var3, SpanStyle h3Var4, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : h3Var, (i15 & 2) != 0 ? null : h3Var2, (i15 & 4) != 0 ? null : h3Var3, (i15 & 8) != 0 ? null : h3Var4);
    }
}
