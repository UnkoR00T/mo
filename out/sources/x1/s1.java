package x1;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.f3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p071kotlin.Metadata;
import p079n1.s3;
import q4.z3;
import v4.CommitTextCommand;
import v4.DeleteSurroundingTextCommand;
import v4.DeleteSurroundingTextInCodePointsCommand;
import v4.SetComposingRegionCommand;
import v4.SetComposingTextCommand;
import v4.SetSelectionCommand;
import v4.TextFieldValue;
import z1.c2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010!\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010\u0016J\u000f\u0010#\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b,\u0010-J!\u0010.\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010'\u001a\u00020\u0018H\u0016¢\u0006\u0004\b.\u0010)J\u001f\u00101\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0016¢\u0006\u0004\b1\u0010-J\u001f\u00102\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u0010-J\u001f\u00103\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u0010-J\u000f\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b4\u0010\u0016J\u0017\u00107\u001a\u00020\u00062\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020%2\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010=\u001a\u00020%2\u0006\u00109\u001a\u00020\u00182\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\b=\u0010<J\u0019\u0010>\u001a\u0004\u0018\u00010%2\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0018H\u0016¢\u0006\u0004\bA\u0010BJ!\u0010F\u001a\u00020E2\b\u0010D\u001a\u0004\u0018\u00010C2\u0006\u0010:\u001a\u00020\u0018H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\u00062\u0006\u0010H\u001a\u00020\u0018H\u0016¢\u0006\u0004\bI\u0010BJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u0018H\u0016¢\u0006\u0004\bK\u0010BJ+\u0010R\u001a\u00020\u00122\u0006\u0010M\u001a\u00020L2\b\u0010O\u001a\u0004\u0018\u00010N2\b\u0010Q\u001a\u0004\u0018\u00010PH\u0016¢\u0006\u0004\bR\u0010SJ!\u0010W\u001a\u00020\u00062\u0006\u0010M\u001a\u00020T2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010Z\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0004\bZ\u0010[J\u0019\u0010^\u001a\u00020\u00062\b\u0010]\u001a\u0004\u0018\u00010\\H\u0016¢\u0006\u0004\b^\u0010_J\u0011\u0010a\u001a\u0004\u0018\u00010`H\u0016¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0018H\u0016¢\u0006\u0004\bd\u0010BJ\u0017\u0010f\u001a\u00020\u00062\u0006\u0010e\u001a\u00020\u0006H\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010i\u001a\u00020\u00182\u0006\u0010h\u001a\u00020\u0018H\u0016¢\u0006\u0004\bi\u0010jJ#\u0010o\u001a\u00020\u00062\b\u0010l\u001a\u0004\u0018\u00010k2\b\u0010n\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0004\bo\u0010pJ)\u0010t\u001a\u00020\u00062\u0006\u0010r\u001a\u00020q2\u0006\u0010:\u001a\u00020\u00182\b\u0010s\u001a\u0004\u0018\u00010mH\u0016¢\u0006\u0004\bt\u0010uR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bv\u0010w\u001a\u0004\bx\u0010yR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010}\u001a\u0004\b~\u0010\u007fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000f\n\u0005\b\u0015\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\u000f\n\u0005\b\u0017\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R1\u0010\u008f\u0001\u001a\u00020\u00022\u0007\u0010\u0089\u0001\u001a\u00020\u00028\u0000@@X\u0080\u000e¢\u0006\u0017\n\u0005\b\u001a\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0087\u0001R\u0017\u0010\u0091\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010{R\u001e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u00100\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0097\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010{¨\u0006\u0098\u0001"}, d2 = {"Lx1/s1;", "Landroid/view/inputmethod/InputConnection;", "Lv4/t0;", "initState", "Lx1/b1;", "eventCallback", "", "autoCorrect", "Ln1/s3;", "legacyTextFieldState", "Lz1/c2;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/f3;", "viewConfiguration", "<init>", "(Lv4/t0;Lx1/b1;ZLn1/s3;Lz1/c2;Landroidx/compose/ui/platform/f3;)V", "Lv4/j;", "editCommand", "Loq/i0;", "c", "(Lv4/j;)V", "d", "()Z", "e", "", "code", "g", "(I)V", "state", "Lx1/c1;", "inputMethodManager", "i", "(Lv4/t0;Lx1/c1;)V", "beginBatchEdit", "endBatchEdit", "closeConnection", "()V", "", "text", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "a", "Lx1/b1;", "getEventCallback", "()Lx1/b1;", "b", "Z", "getAutoCorrect", "Ln1/s3;", "getLegacyTextFieldState", "()Ln1/s3;", "Lz1/c2;", "getTextFieldSelectionManager", "()Lz1/c2;", "Landroidx/compose/ui/platform/f3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/f3;", "f", "I", "batchDepth", "value", "Lv4/t0;", "getTextFieldValue$foundation", "()Lv4/t0;", "h", "(Lv4/t0;)V", "textFieldValue", "currentExtractedTextRequestToken", "extractedTextMonitorMode", "", "j", "Ljava/util/List;", "editCommands", "k", "isActive", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s1 implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b1 eventCallback;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean autoCorrect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s3 legacyTextFieldState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c2 textFieldSelectionManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f3 viewConfiguration;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int batchDepth;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue textFieldValue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int currentExtractedTextRequestToken;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean extractedTextMonitorMode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<v4.j> editCommands = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean isActive = true;

    public s1(TextFieldValue textFieldValue, b1 b1Var, boolean z15, s3 s3Var, c2 c2Var, f3 f3Var) {
        this.eventCallback = b1Var;
        this.autoCorrect = z15;
        this.legacyTextFieldState = s3Var;
        this.textFieldSelectionManager = c2Var;
        this.viewConfiguration = f3Var;
        this.textFieldValue = textFieldValue;
    }

    private final void c(v4.j editCommand) {
        d();
        try {
            this.editCommands.add(editCommand);
        } finally {
            e();
        }
    }

    private final boolean d() {
        this.batchDepth++;
        return true;
    }

    private final boolean e() {
        int i15 = this.batchDepth - 1;
        this.batchDepth = i15;
        if (i15 == 0 && !this.editCommands.isEmpty()) {
            this.eventCallback.d(pq.v.i1(this.editCommands));
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(s1 s1Var, v4.j jVar) {
        s1Var.c(jVar);
        return oq.i0.f148189a;
    }

    private final void g(int code) {
        sendKeyEvent(new KeyEvent(0, code));
        sendKeyEvent(new KeyEvent(1, code));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z15 = this.isActive;
        return z15 ? d() : z15;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int states) {
        boolean z15 = this.isActive;
        if (z15) {
            return false;
        }
        return z15;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
        this.eventCallback.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo text) {
        boolean z15 = this.isActive;
        if (z15) {
            return false;
        }
        return z15;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) {
        boolean z15 = this.isActive;
        if (z15) {
            return false;
        }
        return z15;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z15 = this.isActive;
        return z15 ? this.autoCorrect : z15;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence text, int newCursorPosition) {
        boolean z15 = this.isActive;
        if (z15) {
            c(new CommitTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z15;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int beforeLength, int afterLength) {
        boolean z15 = this.isActive;
        if (!z15) {
            return z15;
        }
        c(new DeleteSurroundingTextCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) {
        boolean z15 = this.isActive;
        if (!z15) {
            return z15;
        }
        c(new DeleteSurroundingTextInCodePointsCommand(beforeLength, afterLength));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return e();
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z15 = this.isActive;
        if (!z15) {
            return z15;
        }
        c(new v4.p());
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int reqModes) {
        return TextUtils.getCapsMode(this.textFieldValue.m(), z3.l(this.textFieldValue.getSelection()), reqModes);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) {
        boolean z15 = (flags & 1) != 0;
        this.extractedTextMonitorMode = z15;
        if (z15) {
            this.currentExtractedTextRequestToken = request != null ? request.token : 0;
        }
        return t1.b(this.textFieldValue);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int flags) {
        if (z3.h(this.textFieldValue.getSelection())) {
            return null;
        }
        return v4.u0.a(this.textFieldValue).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int maxChars, int flags) {
        return v4.u0.b(this.textFieldValue, maxChars).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int maxChars, int flags) {
        return v4.u0.c(this.textFieldValue, maxChars).toString();
    }

    public final void h(TextFieldValue textFieldValue) {
        this.textFieldValue = textFieldValue;
    }

    public final void i(TextFieldValue state, c1 inputMethodManager) {
        if (this.isActive) {
            h(state);
            if (this.extractedTextMonitorMode) {
                inputMethodManager.updateExtractedText(this.currentExtractedTextRequestToken, t1.b(state));
            }
            z3 composition = state.getComposition();
            int iL = composition != null ? z3.l(composition.getPackedValue()) : -1;
            z3 composition2 = state.getComposition();
            inputMethodManager.a(z3.l(state.getSelection()), z3.k(state.getSelection()), iL, composition2 != null ? z3.k(composition2.getPackedValue()) : -1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int id5) {
        boolean z15 = this.isActive;
        if (z15) {
            z15 = false;
            switch (id5) {
                case R.id.selectAll:
                    c(new SetSelectionCommand(0, this.textFieldValue.m().length()));
                    break;
                case R.id.cut:
                    g(277);
                    break;
                case R.id.copy:
                    g(278);
                    break;
                case R.id.paste:
                    g(279);
                    break;
            }
        }
        return z15;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int editorAction) {
        int iA;
        boolean z15 = this.isActive;
        if (!z15) {
            return z15;
        }
        if (editorAction != 0) {
            switch (editorAction) {
                case 2:
                    iA = v4.t.INSTANCE.c();
                    break;
                case 3:
                    iA = v4.t.INSTANCE.g();
                    break;
                case 4:
                    iA = v4.t.INSTANCE.h();
                    break;
                case 5:
                    iA = v4.t.INSTANCE.d();
                    break;
                case 6:
                    iA = v4.t.INSTANCE.b();
                    break;
                case 7:
                    iA = v4.t.INSTANCE.f();
                    break;
                default:
                    io.sentry.android.core.c2.g("RecordingIC", "IME sends unsupported Editor Action: " + editorAction);
                    iA = v4.t.INSTANCE.a();
                    break;
            }
        } else {
            iA = v4.t.INSTANCE.a();
        }
        this.eventCallback.c(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(HandwritingGesture gesture, Executor executor, IntConsumer consumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            e.f216323a.b(this.legacyTextFieldState, this.textFieldSelectionManager, gesture, this.viewConfiguration, executor, consumer, new er.l() { // from class: x1.r1
                @Override // er.l
                public final Object b(Object obj) {
                    return s1.f(this.f216396a, (v4.j) obj);
                }
            });
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String action, Bundle data) {
        boolean z15 = this.isActive;
        if (z15) {
            return true;
        }
        return z15;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(PreviewableHandwritingGesture gesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return e.f216323a.d(this.legacyTextFieldState, this.textFieldSelectionManager, gesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean enabled) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int cursorUpdateMode) {
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19 = this.isActive;
        if (!z19) {
            return z19;
        }
        boolean z25 = false;
        boolean z26 = (cursorUpdateMode & 1) != 0;
        boolean z27 = (cursorUpdateMode & 2) != 0;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33) {
            boolean z28 = (cursorUpdateMode & 16) != 0;
            boolean z29 = (cursorUpdateMode & 8) != 0;
            boolean z35 = (cursorUpdateMode & 4) != 0;
            if (i15 >= 34 && (cursorUpdateMode & 32) != 0) {
                z25 = true;
            }
            if (z28 || z29 || z35 || z25) {
                z16 = z25;
                z15 = z35;
                z18 = z29;
                z17 = z28;
            } else if (i15 >= 34) {
                z17 = true;
                z18 = true;
                z15 = true;
                z16 = true;
            } else {
                z16 = z25;
                z17 = true;
                z18 = true;
                z15 = true;
            }
        } else {
            z15 = false;
            z16 = false;
            z17 = true;
            z18 = true;
        }
        this.eventCallback.b(z26, z27, z17, z18, z15, z16);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent event) {
        boolean z15 = this.isActive;
        if (!z15) {
            return z15;
        }
        this.eventCallback.a(event);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int start, int end) {
        boolean z15 = this.isActive;
        if (z15) {
            c(new SetComposingRegionCommand(start, end));
        }
        return z15;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence text, int newCursorPosition) {
        boolean z15 = this.isActive;
        if (z15) {
            c(new SetComposingTextCommand(String.valueOf(text), newCursorPosition));
        }
        return z15;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int start, int end) {
        boolean z15 = this.isActive;
        if (!z15) {
            return z15;
        }
        c(new SetSelectionCommand(start, end));
        return true;
    }
}
