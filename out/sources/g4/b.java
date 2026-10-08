package g4;

import androidx.compose.ui.node.NodeCoordinator;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lg4/b;", "Le4/v0;", "Loq/i0;", "T", "()V", "", "Le4/a;", "", "y", "()Ljava/util/Map;", "Lkotlin/Function1;", "block", "F", "(Ler/l;)V", "requestLayout", "B0", "i0", "()I", "placeOrder", "Landroidx/compose/ui/node/NodeCoordinator;", "X", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "Lg4/a;", "i", "()Lg4/a;", "alignmentLines", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Lg4/b;", "parentAlignmentLinesOwner", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b extends p036e4.v0 {
    void B0();

    void F(er.l<? super b, oq.i0> block);

    b H();

    void T();

    NodeCoordinator X();

    /* JADX INFO: renamed from: i */
    a getAlignmentLines();

    /* JADX INFO: renamed from: i0 */
    int getPlaceOrder();

    void requestLayout();

    Map<p036e4.a, Integer> y();
}
