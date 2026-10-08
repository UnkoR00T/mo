package p079n1;

import fr.t;
import g4.l0;
import p071kotlin.Metadata;
import q4.TextStyle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ln1/c6;", "Lg4/l0;", "Ln1/i6;", "Lq4/b4;", "style", "<init>", "(Lq4/b4;)V", "a", "()Ln1/i6;", "node", "Loq/i0;", "l", "(Ln1/i6;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lq4/b4;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c6 extends l0<i6> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    public c6(TextStyle textStyle) {
        this.style = textStyle;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public i6 create() {
        return new i6(this.style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof c6) {
            return t.c(this.style, ((c6) other).style);
        }
        return false;
    }

    public int hashCode() {
        return this.style.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(i6 node) {
        node.r3(this.style);
    }
}
