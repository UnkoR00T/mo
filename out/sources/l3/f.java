package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ll3/f;", "Ll3/j;", "Lf3/m$c;", "Lkotlin/Function1;", "Ll3/l0;", "Loq/i0;", "onFocusChanged", "<init>", "(Ler/l;)V", "focusState", "i", "(Ll3/l0;)V", "r", "Ler/l;", "getOnFocusChanged", "()Ler/l;", "n3", "s", "Ll3/l0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f extends f3.m.c implements j {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private er.l<? super l0, oq.i0> onFocusChanged;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private l0 focusState;

    public f(er.l<? super l0, oq.i0> lVar) {
        this.onFocusChanged = lVar;
    }

    @Override // l3.j
    public void i(l0 focusState) {
        if (fr.t.c(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.b(focusState);
    }

    public final void n3(er.l<? super l0, oq.i0> lVar) {
        this.onFocusChanged = lVar;
    }
}
