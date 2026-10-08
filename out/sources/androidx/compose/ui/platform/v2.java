package androidx.compose.ui.platform;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001Jq\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ_\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H&¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/v2;", "", "Lm3/g;", "rect", "Lkotlin/Function0;", "Loq/i0;", "onCopyRequested", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "onAutofillRequested", "d", "(Lm3/g;Ler/a;Ler/a;Ler/a;Ler/a;Ler/a;)V", "e", "(Lm3/g;Ler/a;Ler/a;Ler/a;Ler/a;)V", "c", "()V", "Landroidx/compose/ui/platform/x2;", "b", "()Landroidx/compose/ui/platform/x2;", "status", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface v2 {
    x2 b();

    void c();

    default void d(m3.g rect, er.a<oq.i0> onCopyRequested, er.a<oq.i0> onPasteRequested, er.a<oq.i0> onCutRequested, er.a<oq.i0> onSelectAllRequested, er.a<oq.i0> onAutofillRequested) {
        e(rect, onCopyRequested, onPasteRequested, onCutRequested, onSelectAllRequested);
    }

    void e(m3.g rect, er.a<oq.i0> onCopyRequested, er.a<oq.i0> onPasteRequested, er.a<oq.i0> onCutRequested, er.a<oq.i0> onSelectAllRequested);
}
