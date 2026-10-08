package androidx.compose.ui.platform;

import java.util.List;
import n4.ScrollAxisRange;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u001b\u0010\u001aR$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u000e\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b!\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Landroidx/compose/ui/platform/n2;", "Lg4/b1;", "", "semanticsNodeId", "", "allScopes", "", "oldXValue", "oldYValue", "Ln4/n;", "horizontalScrollAxisRange", "verticalScrollAxisRange", "<init>", "(ILjava/util/List;Ljava/lang/Float;Ljava/lang/Float;Ln4/n;Ln4/n;)V", "a", "I", "d", "()I", "b", "Ljava/util/List;", "getAllScopes", "()Ljava/util/List;", "c", "Ljava/lang/Float;", "()Ljava/lang/Float;", "g", "(Ljava/lang/Float;)V", "h", "e", "Ln4/n;", "()Ln4/n;", "f", "(Ln4/n;)V", "i", "", "K1", "()Z", "isValidOwnerScope", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n2 implements g4.b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int semanticsNodeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<n2> allScopes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Float oldXValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Float oldYValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange horizontalScrollAxisRange;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private ScrollAxisRange verticalScrollAxisRange;

    public n2(int i15, List<n2> list, Float f15, Float f16, ScrollAxisRange scrollAxisRange, ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i15;
        this.allScopes = list;
        this.oldXValue = f15;
        this.oldYValue = f16;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    @Override // g4.b1
    public boolean K1() {
        return this.allScopes.contains(this);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Float getOldXValue() {
        return this.oldXValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Float getOldYValue() {
        return this.oldYValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    public final void f(ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void g(Float f15) {
        this.oldXValue = f15;
    }

    public final void h(Float f15) {
        this.oldYValue = f15;
    }

    public final void i(ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }
}
