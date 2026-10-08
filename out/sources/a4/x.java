package a4;

import g4.DpTouchBoundsExpansion;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf3/m;", "La4/w;", "icon", "", "overrideDescendants", "a", "(Lf3/m;La4/w;Z)Lf3/m;", "Lg4/p;", "touchBoundsExpansion", "c", "(Lf3/m;La4/w;ZLg4/p;)Lf3/m;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {
    public static final f3.m a(f3.m mVar, w wVar, boolean z15) {
        return mVar.u(new PointerHoverIconModifierElement(wVar, z15));
    }

    public static /* synthetic */ f3.m b(f3.m mVar, w wVar, boolean z15, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        return a(mVar, wVar, z15);
    }

    public static final f3.m c(f3.m mVar, w wVar, boolean z15, DpTouchBoundsExpansion dpTouchBoundsExpansion) {
        return mVar.u(new StylusHoverIconModifierElement(wVar, z15, dpTouchBoundsExpansion));
    }
}
