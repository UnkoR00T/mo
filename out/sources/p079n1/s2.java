package p079n1;

import fr.t;
import g4.l0;
import p071kotlin.Metadata;
import q4.TextStyle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Ln1/s2;", "Lg4/l0;", "Ln1/y2;", "Lq4/b4;", "textStyle", "", "minLines", "maxLines", "<init>", "(Lq4/b4;II)V", "a", "()Ln1/y2;", "node", "Loq/i0;", "l", "(Ln1/y2;)V", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lq4/b4;", "e", "I", "f", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s2 extends l0<y2> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TextStyle textStyle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    public s2(TextStyle textStyle, int i15, int i16) {
        this.textStyle = textStyle;
        this.minLines = i15;
        this.maxLines = i16;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y2 create() {
        return new y2(this.textStyle, this.minLines, this.maxLines);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof s2)) {
            return false;
        }
        s2 s2Var = (s2) other;
        return t.c(this.textStyle, s2Var.textStyle) && this.minLines == s2Var.minLines && this.maxLines == s2Var.maxLines;
    }

    public int hashCode() {
        return (((this.textStyle.hashCode() * 31) + this.minLines) * 31) + this.maxLines;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(y2 node) {
        node.x3(this.textStyle, this.minLines, this.maxLines);
    }
}
