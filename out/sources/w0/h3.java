package w0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aY\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f\u001ac\u0010\u0012\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lf3/m;", "Lz0/v2;", "state", "Lz0/a2;", "orientation", "", "enabled", "reverseScrolling", "Lz0/e1;", "flingBehavior", "Lb1/l;", "interactionSource", "Lz0/y;", "bringIntoViewSpec", "b", "(Lf3/m;Lz0/v2;Lz0/a2;ZZLz0/e1;Lb1/l;Lz0/y;)Lf3/m;", "Lw0/g2;", "overscrollEffect", "a", "(Lf3/m;Lz0/v2;Lz0/a2;Lw0/g2;ZZLz0/e1;Lb1/l;Lz0/y;)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h3 {
    public static final f3.m a(f3.m mVar, p143z0.v2 v2Var, p143z0.a2 a2Var, g2 g2Var, boolean z15, boolean z16, p143z0.e1 e1Var, b1.l lVar, p143z0.y yVar) {
        return f0.a(mVar, a2Var).u(new g3(v2Var, a2Var, z15, z16, e1Var, lVar, yVar, false, g2Var));
    }

    public static final f3.m b(f3.m mVar, p143z0.v2 v2Var, p143z0.a2 a2Var, boolean z15, boolean z16, p143z0.e1 e1Var, b1.l lVar, p143z0.y yVar) {
        return f0.a(mVar, a2Var).u(new g3(v2Var, a2Var, z15, z16, e1Var, lVar, yVar, true, null));
    }

    public static /* synthetic */ f3.m c(f3.m mVar, p143z0.v2 v2Var, p143z0.a2 a2Var, g2 g2Var, boolean z15, boolean z16, p143z0.e1 e1Var, b1.l lVar, p143z0.y yVar, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z15 = true;
        }
        return a(mVar, v2Var, a2Var, g2Var, z15, (i15 & 16) != 0 ? false : z16, (i15 & 32) != 0 ? null : e1Var, (i15 & 64) != 0 ? null : lVar, (i15 & 128) != 0 ? null : yVar);
    }

    public static /* synthetic */ f3.m d(f3.m mVar, p143z0.v2 v2Var, p143z0.a2 a2Var, boolean z15, boolean z16, p143z0.e1 e1Var, b1.l lVar, p143z0.y yVar, int i15, Object obj) {
        if ((i15 & 4) != 0) {
            z15 = true;
        }
        boolean z17 = z15;
        if ((i15 & 8) != 0) {
            z16 = false;
        }
        return b(mVar, v2Var, a2Var, z17, z16, (i15 & 16) != 0 ? null : e1Var, (i15 & 32) != 0 ? null : lVar, (i15 & 64) != 0 ? null : yVar);
    }
}
