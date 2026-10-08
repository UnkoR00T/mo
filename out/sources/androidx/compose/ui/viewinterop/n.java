package androidx.compose.ui.viewinterop;

import android.view.View;
import l3.v;
import l3.z;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/viewinterop/n;", "Lf3/m$c;", "Ll3/z;", "<init>", "()V", "Ll3/v;", "focusProperties", "Loq/i0;", "I0", "(Ll3/v;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n extends f3.m.c implements z {
    @Override // l3.z
    public void I0(v focusProperties) {
        m3.g gVarA;
        View viewG = h.g(this);
        focusProperties.j(getNode().getIsAttached() && h.g(this).hasFocusable());
        View viewFindFocus = viewG.findFocus();
        if (viewFindFocus == null || (gVarA = l3.l.a(viewFindFocus, viewG)) == null) {
            return;
        }
        focusProperties.r(gVarA);
    }
}
