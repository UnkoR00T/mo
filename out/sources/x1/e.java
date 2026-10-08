package x1;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.f3;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p071kotlin.Metadata;
import p079n1.s3;
import z1.c2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0014\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lx1/e;", "", "<init>", "()V", "Ln1/s3;", "legacyTextFieldState", "Lz1/c2;", "textFieldSelectionManager", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Landroidx/compose/ui/platform/f3;", "viewConfiguration", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "Lkotlin/Function1;", "Lv4/j;", "Loq/i0;", "editCommandConsumer", "b", "(Ln1/s3;Lz1/c2;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/ui/platform/f3;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;Ler/l;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "d", "(Ln1/s3;Lz1/c2;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f216323a = new e();

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(IntConsumer intConsumer, int i15) {
        intConsumer.accept(i15);
    }

    public final void b(s3 legacyTextFieldState, c2 textFieldSelectionManager, HandwritingGesture gesture, f3 viewConfiguration, Executor executor, final IntConsumer consumer, er.l<? super v4.j, oq.i0> editCommandConsumer) {
        final int iG = legacyTextFieldState != null ? z0.f216430a.g(legacyTextFieldState, gesture, textFieldSelectionManager, viewConfiguration, editCommandConsumer) : 3;
        if (consumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: x1.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.c(consumer, iG);
                }
            });
        } else {
            consumer.accept(iG);
        }
    }

    public final boolean d(s3 legacyTextFieldState, c2 textFieldSelectionManager, PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        if (legacyTextFieldState != null) {
            return z0.f216430a.r(legacyTextFieldState, gesture, textFieldSelectionManager, cancellationSignal);
        }
        return false;
    }
}
