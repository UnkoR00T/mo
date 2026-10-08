package p046f2;

import android.content.Context;
import android.view.Window;
import androidx.compose.ui.platform.b;
import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p076m2.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R7\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lf2/qe;", "Landroidx/compose/ui/platform/b;", "", "Landroid/content/Context;", "context", "Landroid/view/Window;", "window", "<init>", "(Landroid/content/Context;Landroid/view/Window;)V", "Lm2/v;", "parent", "Lkotlin/Function0;", "Loq/i0;", "content", "s", "(Lm2/v;Ler/p;)V", "c", "(Lm2/r;I)V", "k", "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "<set-?>", "l", "Lm2/a3;", "getContent", "()Ler/p;", "setContent", "(Ler/p;)V", "", "value", "m", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "shouldCreateCompositionOnAttachedToWindow", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class qe extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Window window;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a3 content;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    public qe(Context context, Window window) {
        super(context, null, 0, 6, null);
        this.window = window;
        this.content = c6.e(o3.f57100a.b(), null, 2, null);
    }

    private final p<r, Integer, i0> getContent() {
        return (p) this.content.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(qe qeVar, int i15, r rVar, int i16) {
        qeVar.c(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private final void setContent(p<? super r, ? super Integer, i0> pVar) {
        this.content.setValue(pVar);
    }

    @Override // androidx.compose.ui.platform.b
    public void c(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(576708319);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(576708319, i16, -1, "androidx.compose.material3.ModalBottomSheetDialogLayout.Content (ModalBottomSheet.android.kt:293)");
            }
            getContent().B(rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: f2.pe
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return qe.r(this.f57279a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // androidx.compose.ui.platform.b
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void s(v parent, p<? super r, ? super Integer, i0> content) {
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        g();
    }
}
