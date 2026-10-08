package x1;

import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.compose.ui.platform.f3;
import n3.s2;
import p071kotlin.Metadata;
import p079n1.k6;
import p079n1.s3;
import q4.TextLayoutInput;
import q4.TextLayoutResult;
import q4.a4;
import q4.m3;
import q4.q3;
import q4.z3;
import v4.CommitTextCommand;
import v4.DeleteSurroundingTextCommand;
import v4.SetSelectionCommand;
import z1.c2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0016\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001b\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001a2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010 \u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001f2\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\"\u0010#JA\u0010'\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b'\u0010(J9\u0010*\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020)2\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b*\u0010+JA\u0010-\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020,2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b-\u0010.J3\u00101\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\r2\u0006\u0010\u0015\u001a\u0002002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b1\u00102J5\u00105\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b5\u00106J;\u00109\u001a\u00020\u000b2\u0006\u00104\u001a\u0002032\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u00108\u001a\u0002072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b9\u0010:J+\u0010<\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020;2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010?\u001a\u00020>*\u00020\rH\u0002¢\u0006\u0004\b?\u0010@JC\u0010A\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0006\u001a\u00020;2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010&\u001a\u0004\u0018\u00010%2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0000¢\u0006\u0004\bA\u0010BJ/\u0010F\u001a\u000207*\u00020\u00042\u0006\u0010\u0006\u001a\u00020C2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00072\b\u0010E\u001a\u0004\u0018\u00010DH\u0000¢\u0006\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lx1/z0;", "", "<init>", "()V", "Ln1/s3;", "Landroid/view/inputmethod/SelectGesture;", "gesture", "Lz1/c2;", "textSelectionManager", "Lkotlin/Function1;", "Lv4/j;", "Loq/i0;", "editCommandConsumer", "", "m", "(Ln1/s3;Landroid/view/inputmethod/SelectGesture;Lz1/c2;Ler/l;)I", "textFieldSelectionManager", "t", "(Ln1/s3;Landroid/view/inputmethod/SelectGesture;Lz1/c2;)V", "Landroid/view/inputmethod/DeleteGesture;", "Lq4/e;", "text", "d", "(Ln1/s3;Landroid/view/inputmethod/DeleteGesture;Lq4/e;Ler/l;)I", "p", "(Ln1/s3;Landroid/view/inputmethod/DeleteGesture;Lz1/c2;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "n", "(Ln1/s3;Landroid/view/inputmethod/SelectRangeGesture;Lz1/c2;Ler/l;)I", "u", "(Ln1/s3;Landroid/view/inputmethod/SelectRangeGesture;Lz1/c2;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", "e", "(Ln1/s3;Landroid/view/inputmethod/DeleteRangeGesture;Lq4/e;Ler/l;)I", "q", "(Ln1/s3;Landroid/view/inputmethod/DeleteRangeGesture;Lz1/c2;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "Landroidx/compose/ui/platform/f3;", "viewConfiguration", "j", "(Ln1/s3;Landroid/view/inputmethod/JoinOrSplitGesture;Lq4/e;Landroidx/compose/ui/platform/f3;Ler/l;)I", "Landroid/view/inputmethod/InsertGesture;", "h", "(Ln1/s3;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/f3;Ler/l;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "k", "(Ln1/s3;Landroid/view/inputmethod/RemoveSpaceGesture;Lq4/e;Landroidx/compose/ui/platform/f3;Ler/l;)I", "offset", "", "i", "(ILjava/lang/String;Ler/l;)V", "Lq4/z3;", "range", "o", "(JLz1/c2;Ler/l;)V", "", "adjustRange", "f", "(JLq4/e;ZLer/l;)V", "Landroid/view/inputmethod/HandwritingGesture;", "c", "(Landroid/view/inputmethod/HandwritingGesture;Ler/l;)I", "Lq4/m3;", "v", "(I)I", "g", "(Ln1/s3;Landroid/view/inputmethod/HandwritingGesture;Lz1/c2;Landroidx/compose/ui/platform/f3;Ler/l;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "r", "(Ln1/s3;Landroid/view/inputmethod/PreviewableHandwritingGesture;Lz1/c2;Landroid/os/CancellationSignal;)Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f216430a = new z0();

    private z0() {
    }

    private final int c(HandwritingGesture gesture, er.l<? super v4.j, oq.i0> editCommandConsumer) {
        String fallbackText = gesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        editCommandConsumer.b(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    private final int d(s3 s3Var, DeleteGesture deleteGesture, q4.e eVar, er.l<? super v4.j, oq.i0> lVar) {
        int iV = v(deleteGesture.getGranularity());
        long jR = a1.r(s3Var, s2.f(deleteGesture.getDeletionArea()), iV, q3.INSTANCE.h());
        if (z3.h(jR)) {
            return f216430a.c(deleteGesture, lVar);
        }
        f(jR, eVar, m3.d(iV, m3.INSTANCE.b()), lVar);
        return 1;
    }

    private final int e(s3 s3Var, DeleteRangeGesture deleteRangeGesture, q4.e eVar, er.l<? super v4.j, oq.i0> lVar) {
        int iV = v(deleteRangeGesture.getGranularity());
        long jS = a1.s(s3Var, s2.f(deleteRangeGesture.getDeletionStartArea()), s2.f(deleteRangeGesture.getDeletionEndArea()), iV, q3.INSTANCE.h());
        if (z3.h(jS)) {
            return f216430a.c(deleteRangeGesture, lVar);
        }
        f(jS, eVar, m3.d(iV, m3.INSTANCE.b()), lVar);
        return 1;
    }

    private final void f(long range, q4.e text, boolean adjustRange, er.l<? super v4.j, oq.i0> editCommandConsumer) {
        if (adjustRange) {
            range = a1.j(range, text);
        }
        editCommandConsumer.b(a1.k(new SetSelectionCommand(z3.i(range), z3.i(range)), new DeleteSurroundingTextCommand(z3.j(range), 0)));
    }

    private final int h(s3 s3Var, InsertGesture insertGesture, f3 f3Var, er.l<? super v4.j, oq.i0> lVar) {
        k6 k6VarN;
        TextLayoutResult value;
        if (f3Var == null) {
            return c(insertGesture, lVar);
        }
        int iN = a1.n(s3Var, a1.z(insertGesture.getInsertionPoint()), f3Var);
        if (iN == -1 || !((k6VarN = s3Var.n()) == null || (value = k6VarN.getValue()) == null || !a1.t(value, iN))) {
            return c(insertGesture, lVar);
        }
        i(iN, insertGesture.getTextToInsert(), lVar);
        return 1;
    }

    private final void i(int offset, String text, er.l<? super v4.j, oq.i0> editCommandConsumer) {
        editCommandConsumer.b(a1.k(new SetSelectionCommand(offset, offset), new CommitTextCommand(text, 1)));
    }

    private final int j(s3 s3Var, JoinOrSplitGesture joinOrSplitGesture, q4.e eVar, f3 f3Var, er.l<? super v4.j, oq.i0> lVar) {
        k6 k6VarN;
        TextLayoutResult value;
        if (f3Var == null) {
            return c(joinOrSplitGesture, lVar);
        }
        int iN = a1.n(s3Var, a1.z(joinOrSplitGesture.getJoinOrSplitPoint()), f3Var);
        if (iN == -1 || !((k6VarN = s3Var.n()) == null || (value = k6VarN.getValue()) == null || !a1.t(value, iN))) {
            return c(joinOrSplitGesture, lVar);
        }
        long jY = a1.y(eVar, iN);
        if (z3.h(jY)) {
            i(z3.n(jY), " ", lVar);
        } else {
            f(jY, eVar, false, lVar);
        }
        return 1;
    }

    private final int k(s3 s3Var, RemoveSpaceGesture removeSpaceGesture, q4.e eVar, f3 f3Var, er.l<? super v4.j, oq.i0> lVar) {
        k6 k6VarN = s3Var.n();
        long jP = a1.p(k6VarN != null ? k6VarN.getValue() : null, a1.z(removeSpaceGesture.getStartPoint()), a1.z(removeSpaceGesture.getEndPoint()), s3Var.m(), f3Var);
        if (z3.h(jP)) {
            return f216430a.c(removeSpaceGesture, lVar);
        }
        final fr.n0 n0Var = new fr.n0();
        n0Var.f66407a = -1;
        final fr.n0 n0Var2 = new fr.n0();
        n0Var2.f66407a = -1;
        String strG = new fu.o("\\s+").g(a4.e(eVar, jP), new er.l() { // from class: x1.y0
            @Override // er.l
            public final Object b(Object obj) {
                return z0.l(n0Var, n0Var2, (fu.l) obj);
            }
        });
        if (n0Var.f66407a == -1 || n0Var2.f66407a == -1) {
            return c(removeSpaceGesture, lVar);
        }
        lVar.b(a1.k(new SetSelectionCommand(z3.n(jP) + n0Var.f66407a, z3.n(jP) + n0Var2.f66407a), new CommitTextCommand(strG.substring(n0Var.f66407a, strG.length() - (z3.j(jP) - n0Var2.f66407a)), 1)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence l(fr.n0 n0Var, fr.n0 n0Var2, fu.l lVar) {
        if (n0Var.f66407a == -1) {
            n0Var.f66407a = lVar.a().getFirst();
        }
        n0Var2.f66407a = lVar.a().getLast() + 1;
        return "";
    }

    private final int m(s3 s3Var, SelectGesture selectGesture, c2 c2Var, er.l<? super v4.j, oq.i0> lVar) {
        long jR = a1.r(s3Var, s2.f(selectGesture.getSelectionArea()), v(selectGesture.getGranularity()), q3.INSTANCE.h());
        if (z3.h(jR)) {
            return f216430a.c(selectGesture, lVar);
        }
        o(jR, c2Var, lVar);
        return 1;
    }

    private final int n(s3 s3Var, SelectRangeGesture selectRangeGesture, c2 c2Var, er.l<? super v4.j, oq.i0> lVar) {
        long jS = a1.s(s3Var, s2.f(selectRangeGesture.getSelectionStartArea()), s2.f(selectRangeGesture.getSelectionEndArea()), v(selectRangeGesture.getGranularity()), q3.INSTANCE.h());
        if (z3.h(jS)) {
            return f216430a.c(selectRangeGesture, lVar);
        }
        o(jS, c2Var, lVar);
        return 1;
    }

    private final void o(long range, c2 textSelectionManager, er.l<? super v4.j, oq.i0> editCommandConsumer) {
        editCommandConsumer.b(new SetSelectionCommand(z3.n(range), z3.i(range)));
        if (textSelectionManager != null) {
            textSelectionManager.M(true);
        }
    }

    private final void p(s3 s3Var, DeleteGesture deleteGesture, c2 c2Var) {
        if (c2Var != null) {
            c2Var.C0(a1.r(s3Var, s2.f(deleteGesture.getDeletionArea()), v(deleteGesture.getGranularity()), q3.INSTANCE.h()));
        }
    }

    private final void q(s3 s3Var, DeleteRangeGesture deleteRangeGesture, c2 c2Var) {
        if (c2Var != null) {
            c2Var.C0(a1.s(s3Var, s2.f(deleteRangeGesture.getDeletionStartArea()), s2.f(deleteRangeGesture.getDeletionEndArea()), v(deleteRangeGesture.getGranularity()), q3.INSTANCE.h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(c2 c2Var) {
        if (c2Var != null) {
            c2Var.B();
        }
    }

    private final void t(s3 s3Var, SelectGesture selectGesture, c2 c2Var) {
        if (c2Var != null) {
            c2Var.P0(a1.r(s3Var, s2.f(selectGesture.getSelectionArea()), v(selectGesture.getGranularity()), q3.INSTANCE.h()));
        }
    }

    private final void u(s3 s3Var, SelectRangeGesture selectRangeGesture, c2 c2Var) {
        if (c2Var != null) {
            c2Var.P0(a1.s(s3Var, s2.f(selectRangeGesture.getSelectionStartArea()), s2.f(selectRangeGesture.getSelectionEndArea()), v(selectRangeGesture.getGranularity()), q3.INSTANCE.h()));
        }
    }

    private final int v(int i15) {
        if (i15 != 1) {
            return i15 != 2 ? m3.INSTANCE.a() : m3.INSTANCE.a();
        }
        return m3.INSTANCE.b();
    }

    public final int g(s3 s3Var, HandwritingGesture handwritingGesture, c2 c2Var, f3 f3Var, er.l<? super v4.j, oq.i0> lVar) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        q4.e untransformedText = s3Var.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        k6 k6VarN = s3Var.n();
        if (!fr.t.c(untransformedText, (k6VarN == null || (value = k6VarN.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (j0.a(handwritingGesture)) {
            return m(s3Var, s0.a(handwritingGesture), c2Var, lVar);
        }
        if (t0.a(handwritingGesture)) {
            return d(s3Var, u0.a(handwritingGesture), untransformedText, lVar);
        }
        if (v0.a(handwritingGesture)) {
            return n(s3Var, w0.a(handwritingGesture), c2Var, lVar);
        }
        if (k0.a(handwritingGesture)) {
            return e(s3Var, l0.a(handwritingGesture), untransformedText, lVar);
        }
        if (m0.a(handwritingGesture)) {
            return j(s3Var, n0.a(handwritingGesture), untransformedText, f3Var, lVar);
        }
        if (o0.a(handwritingGesture)) {
            return h(s3Var, p0.a(handwritingGesture), f3Var, lVar);
        }
        if (q0.a(handwritingGesture)) {
            return k(s3Var, r0.a(handwritingGesture), untransformedText, f3Var, lVar);
        }
        return 2;
    }

    public final boolean r(s3 s3Var, PreviewableHandwritingGesture previewableHandwritingGesture, final c2 c2Var, CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        q4.e untransformedText = s3Var.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        k6 k6VarN = s3Var.n();
        if (!fr.t.c(untransformedText, (k6VarN == null || (value = k6VarN.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (j0.a(previewableHandwritingGesture)) {
            t(s3Var, s0.a(previewableHandwritingGesture), c2Var);
        } else if (t0.a(previewableHandwritingGesture)) {
            p(s3Var, u0.a(previewableHandwritingGesture), c2Var);
        } else if (v0.a(previewableHandwritingGesture)) {
            u(s3Var, w0.a(previewableHandwritingGesture), c2Var);
        } else {
            if (!k0.a(previewableHandwritingGesture)) {
                return false;
            }
            q(s3Var, l0.a(previewableHandwritingGesture), c2Var);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: x1.x0
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                z0.s(c2Var);
            }
        });
        return true;
    }
}
