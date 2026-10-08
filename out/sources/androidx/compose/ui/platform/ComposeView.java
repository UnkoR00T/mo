package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import p071kotlin.Metadata;
import p076m2.c6;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001!B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00100\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Loq/i0;", "c", "(Lm2/r;I)V", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "content", "setContent", "(Ler/p;)V", "Lm2/a3;", "k", "Lm2/a3;", "", "value", "l", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "m", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ComposeView extends androidx.compose.ui.platform.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f10385n = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3<er.p<p076m2.r, Integer, oq.i0>> content;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends fr.w implements er.p<p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f10389c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i15) {
            super(2);
            this.f10389c = i15;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ oq.i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return oq.i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            ComposeView.this.c(rVar, g4.a(this.f10389c | 1));
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.b
    public void c(p076m2.r rVar, int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(420213850);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(420213850, i16, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:619)");
            }
            er.p<p076m2.r, Integer, oq.i0> value = this.content.getValue();
            if (value == null) {
                rVarH.X(-1238823553);
            } else {
                rVarH.X(98585282);
                value.B(rVarH, 0);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new b(i15));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ComposeView.class.getName();
    }

    @Override // androidx.compose.ui.platform.b
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(er.p<? super p076m2.r, ? super Integer, oq.i0> content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(content);
        if (isAttachedToWindow() || getComposeViewContext() != null) {
            g();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.content = c6.e(null, null, 2, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i15, int i16, fr.k kVar) {
        this(context, (i16 & 2) != 0 ? null : attributeSet, (i16 & 4) != 0 ? 0 : i15);
    }
}
