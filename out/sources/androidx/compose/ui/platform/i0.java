package androidx.compose.ui.platform;

import android.view.ActionMode;
import android.view.View;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jg\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JW\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001cR$\u0010\"\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u000f\u0010 \u001a\u0004\b\u0018\u0010!¨\u0006#"}, d2 = {"Landroidx/compose/ui/platform/i0;", "Landroidx/compose/ui/platform/v2;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "Lm3/g;", "rect", "Lkotlin/Function0;", "Loq/i0;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "d", "(Lm3/g;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "e", "(Lm3/g;Ler/a;Ler/a;Ler/a;Ler/a;)V", "c", "()V", "a", "Landroid/view/View;", "Landroid/view/ActionMode;", "b", "Landroid/view/ActionMode;", "actionMode", "Li4/c;", "Li4/c;", "textActionModeCallback", "Landroidx/compose/ui/platform/x2;", "value", "Landroidx/compose/ui/platform/x2;", "()Landroidx/compose/ui/platform/x2;", "status", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 implements v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private ActionMode actionMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i4.c textActionModeCallback = new i4.c(new a(), null, null, null, null, null, null, 126, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private x2 status = x2.Hidden;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<oq.i0> {
        a() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        public final void c() {
            i0.this.actionMode = null;
        }
    }

    public i0(View view) {
        this.view = view;
    }

    @Override // androidx.compose.ui.platform.v2
    /* JADX INFO: renamed from: b, reason: from getter */
    public x2 getStatus() {
        return this.status;
    }

    @Override // androidx.compose.ui.platform.v2
    public void c() {
        this.status = x2.Hidden;
        ActionMode actionMode = this.actionMode;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.actionMode = null;
    }

    @Override // androidx.compose.ui.platform.v2
    public void d(m3.g rect, er.a<oq.i0> onCopyRequested, er.a<oq.i0> onPasteRequested, er.a<oq.i0> onCutRequested, er.a<oq.i0> onSelectAllRequested, er.a<oq.i0> onAutofillRequested) {
        this.textActionModeCallback.m(rect);
        this.textActionModeCallback.i(onCopyRequested);
        this.textActionModeCallback.j(onCutRequested);
        this.textActionModeCallback.k(onPasteRequested);
        this.textActionModeCallback.l(onSelectAllRequested);
        this.textActionModeCallback.h(onAutofillRequested);
        ActionMode actionMode = this.actionMode;
        if (actionMode == null) {
            this.status = x2.Shown;
            this.actionMode = w2.f10860a.a(this.view, new i4.a(this.textActionModeCallback), 1);
        } else if (actionMode != null) {
            actionMode.invalidate();
        }
    }

    @Override // androidx.compose.ui.platform.v2
    public void e(m3.g rect, er.a<oq.i0> onCopyRequested, er.a<oq.i0> onPasteRequested, er.a<oq.i0> onCutRequested, er.a<oq.i0> onSelectAllRequested) {
        d(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested, null);
    }
}
