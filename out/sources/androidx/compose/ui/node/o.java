package androidx.compose.ui.node;

import g4.j0;
import java.util.ArrayList;
import java.util.List;
import p036e4.v0;
import p036e4.w;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Le4/w;", "scope", "", "Le4/v0;", "a", "(Le4/w;)Ljava/util/List;", "Landroidx/compose/ui/node/g;", "", "b", "(Landroidx/compose/ui/node/g;)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10262a;

        static {
            int[] iArr = new int[g.e.values().length];
            try {
                iArr[g.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.e.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.e.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10262a = iArr;
        }
    }

    public static final List<List<v0>> a(w wVar) {
        g layoutNode = ((j0) wVar).getLayoutNode();
        boolean zB = b(layoutNode);
        List<g> listW = layoutNode.W();
        ArrayList arrayList = new ArrayList(listW.size());
        int size = listW.size();
        for (int i15 = 0; i15 < size; i15++) {
            g gVar = listW.get(i15);
            arrayList.add(zB ? gVar.P() : gVar.Q());
        }
        return arrayList;
    }

    private static final boolean b(g gVar) {
        int i15 = a.f10262a[gVar.i0().ordinal()];
        if (i15 == 1 || i15 == 2) {
            return true;
        }
        if (i15 == 3 || i15 == 4) {
            return false;
        }
        if (i15 != 5) {
            throw new oq.p();
        }
        g gVarC0 = gVar.C0();
        if (gVarC0 != null) {
            return b(gVarC0);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}
