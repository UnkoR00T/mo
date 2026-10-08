package w0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf3/m;", "", "enabled", "Lb1/l;", "interactionSource", "b", "(Lf3/m;ZLb1/l;)Lf3/m;", "a", "(Lf3/m;)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q0 {
    public static final f3.m a(f3.m mVar) {
        return mVar.u(n0.f209019d);
    }

    public static final f3.m b(f3.m mVar, boolean z15, b1.l lVar) {
        return mVar.u(z15 ? new p0(lVar) : f3.m.INSTANCE);
    }

    public static /* synthetic */ f3.m c(f3.m mVar, boolean z15, b1.l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        if ((i15 & 2) != 0) {
            lVar = null;
        }
        return b(mVar, z15, lVar);
    }
}
