package x1;

import androidx.compose.ui.platform.f3;
import androidx.compose.ui.platform.l2;
import androidx.compose.ui.platform.r2;
import ju.d2;
import p071kotlin.Metadata;
import p079n1.s3;
import z1.c2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b!\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\u0003R(\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lx1/k1;", "Lv4/m0;", "<init>", "()V", "Lx1/k1$a;", "node", "Loq/i0;", "j", "(Lx1/k1$a;)V", "l", "f", "c", "k", "value", "a", "Lx1/k1$a;", "i", "()Lx1/k1$a;", "textInputModifierNode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class k1 implements v4.m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a textInputModifierNode;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J5\u0010\b\u001a\u0004\u0018\u00010\u00072\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, d2 = {"Lx1/k1$a;", "", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/l2;", "Ltq/e;", "", "block", "Lju/d2;", "C1", "(Ler/p;)Lju/d2;", "Landroidx/compose/ui/platform/r2;", "getSoftwareKeyboardController", "()Landroidx/compose/ui/platform/r2;", "softwareKeyboardController", "Le4/b0;", "P0", "()Le4/b0;", "layoutCoordinates", "Ln1/s3;", "D2", "()Ln1/s3;", "legacyTextFieldState", "Lz1/c2;", "Y1", "()Lz1/c2;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/f3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/f3;", "viewConfiguration", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        d2 C1(er.p<? super l2, ? super tq.e<?>, ? extends Object> block);

        s3 D2();

        p036e4.b0 P0();

        c2 Y1();

        r2 getSoftwareKeyboardController();

        f3 getViewConfiguration();
    }

    @Override // v4.m0
    public final void c() {
        r2 softwareKeyboardController;
        a aVar = this.textInputModifierNode;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.c();
    }

    @Override // v4.m0
    public final void f() {
        r2 softwareKeyboardController;
        a aVar = this.textInputModifierNode;
        if (aVar == null || (softwareKeyboardController = aVar.getSoftwareKeyboardController()) == null) {
            return;
        }
        softwareKeyboardController.a();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    protected final a getTextInputModifierNode() {
        return this.textInputModifierNode;
    }

    public final void j(a node) {
        if (!(this.textInputModifierNode == null)) {
            c1.e.c("Expected textInputModifierNode to be null");
        }
        this.textInputModifierNode = node;
    }

    public abstract void k();

    public final void l(a node) {
        if (!(this.textInputModifierNode == node)) {
            c1.e.c("Expected textInputModifierNode to be " + node + " but was " + this.textInputModifierNode);
        }
        this.textInputModifierNode = null;
    }
}
