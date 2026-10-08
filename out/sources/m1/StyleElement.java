package m1;

import g4.l0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: m1.i, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lm1/i;", "Lg4/l0;", "Lm1/t;", "Lm1/w;", "styleState", "Lm1/g;", "style", "<init>", "(Lm1/w;Lm1/g;)V", "a", "()Lm1/t;", "node", "Loq/i0;", "l", "(Lm1/t;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "Lm1/w;", "getStyleState", "()Lm1/w;", "e", "Lm1/g;", "getStyle", "()Lm1/g;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class StyleElement extends l0<t> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final w styleState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final g style;

    public StyleElement(w wVar, g gVar) {
        this.styleState = wVar;
        this.style = gVar;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public t create() {
        return new t(this.styleState, this.style);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StyleElement)) {
            return false;
        }
        StyleElement styleElement = (StyleElement) other;
        return fr.t.c(styleElement.style, this.style) && fr.t.c(styleElement.styleState, this.styleState);
    }

    public int hashCode() {
        return this.style.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(t node) {
        node.i4(this.style);
        w cVar = this.styleState;
        if (cVar == null) {
            cVar = new c(null);
        }
        node.h4(cVar);
    }

    public String toString() {
        return "StyleElement(styleState=" + this.styleState + ", style=" + this.style + ')';
    }
}
