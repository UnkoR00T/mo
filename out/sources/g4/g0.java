package g4;

import androidx.compose.ui.node.Owner;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/node/Owner;", "b", "(Landroidx/compose/ui/node/g;)Landroidx/compose/ui/node/Owner;", "Lc5/d;", "a", "Lc5/d;", "DefaultDensity", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c5.d f70337a = c5.f.b(1.0f, 0.0f, 2, null);

    public static final Owner b(androidx.compose.ui.node.g gVar) {
        Owner owner = gVar.getOwner();
        if (owner != null) {
            return owner;
        }
        d4.a.d("LayoutNode should be attached to an owner");
        throw new oq.g();
    }
}
