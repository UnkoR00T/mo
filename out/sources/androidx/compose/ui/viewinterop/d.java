package androidx.compose.ui.viewinterop;

import android.view.View;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0010\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012*(\b\u0002\u0010\u0016\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00030\u00142\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00030\u0014*<\b\u0002\u0010\u0018\"\u0010\u0012\u0006\u0012\u0004\u0018\u0001`\u0017\u0012\u0004\u0012\u00020\u00030\u00142$\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014j\u0004\u0018\u0001`\u0017\u0012\u0004\u0012\u00020\u00030\u0014¨\u0006\u0019"}, d2 = {"Landroid/view/View;", "Landroidx/compose/ui/node/g;", "layoutNode", "Loq/i0;", "f", "(Landroid/view/View;Landroidx/compose/ui/node/g;)V", "", "", "g", "(I)F", "h", "(F)F", "type", "Lz3/g;", "i", "(I)I", "androidx/compose/ui/viewinterop/d$a", "a", "Landroidx/compose/ui/viewinterop/d$a;", "NoOpScrollConnection", "Lkotlin/Function1;", "Lm3/g;", "BringIntoViewRequester", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "OnRequesterReady", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f10967a = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/viewinterop/d$a", "Lz3/a;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements z3.a {
        a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(View view, androidx.compose.ui.node.g gVar) {
        long jG = c0.g(gVar.m());
        int iRound = Math.round(Float.intBitsToFloat((int) (jG >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jG & BodyPartID.bodyIdMax)));
        view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(int i15) {
        return i15 * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(float f15) {
        return f15 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(int i15) {
        return i15 == 0 ? z3.g.INSTANCE.b() : z3.g.INSTANCE.a();
    }
}
