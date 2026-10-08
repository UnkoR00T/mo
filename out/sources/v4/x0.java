package v4;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import n3.g2;
import p071kotlin.Metadata;
import q4.TextLayoutResult;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001-B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 JM\u0010+\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0018\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0010H\u0016¢\u0006\u0004\b-\u0010\u0014J\u000f\u0010.\u001a\u00020\u0010H\u0016¢\u0006\u0004\b.\u0010\u0014J\u000f\u0010/\u001a\u00020\u0010H\u0016¢\u0006\u0004\b/\u0010\u0014J\u000f\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b0\u0010\u0014J!\u00103\u001a\u00020\u00102\b\u00101\u001a\u0004\u0018\u00010!2\u0006\u00102\u001a\u00020!H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00102\u0006\u00106\u001a\u000205H\u0017¢\u0006\u0004\b7\u00108JK\u0010B\u001a\u00020\u00102\u0006\u00109\u001a\u00020!2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00100%2\u0006\u0010@\u001a\u0002052\u0006\u0010A\u001a\u000205H\u0016¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010D\u001a\u0004\bE\u0010FR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010HR\u0016\u0010J\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010IR(\u0010(\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010KR\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00100%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010KR$\u0010O\u001a\u00020!2\u0006\u0010\"\u001a\u00020!8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b+\u0010L\u001a\u0004\bM\u0010NR\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010PR\"\u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0R0Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010\\\u001a\u00020W8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u001a\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000e0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010k¨\u0006m"}, d2 = {"Lv4/x0;", "Lv4/m0;", "Landroid/view/View;", "view", "La4/i;", "rootPositionCalculator", "Lv4/w;", "inputMethodManager", "Ljava/util/concurrent/Executor;", "inputCommandProcessorExecutor", "<init>", "(Landroid/view/View;La4/i;Lv4/w;Ljava/util/concurrent/Executor;)V", "positionCalculator", "(Landroid/view/View;La4/i;)V", "Lv4/x0$a;", "command", "Loq/i0;", "v", "(Lv4/x0$a;)V", "s", "()V", "u", "", "visible", "x", "(Z)V", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "o", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "r", "()Z", "Lv4/t0;", "value", "Lv4/u;", "imeOptions", "Lkotlin/Function1;", "", "Lv4/j;", "onEditCommand", "Lv4/t;", "onImeActionPerformed", "g", "(Lv4/t0;Lv4/u;Ler/l;Ler/l;)V", "a", "b", "f", "c", "oldValue", "newValue", "d", "(Lv4/t0;Lv4/t0;)V", "Lm3/g;", "rect", "e", "(Lm3/g;)V", "textFieldValue", "Lv4/i0;", "offsetMapping", "Lq4/t3;", "textLayoutResult", "Ln3/g2;", "textFieldToRootTransform", "innerTextFieldBounds", "decorationBoxBounds", "h", "(Lv4/t0;Lv4/i0;Lq4/t3;Ler/l;Lm3/g;Lm3/g;)V", "Landroid/view/View;", "q", "()Landroid/view/View;", "Lv4/w;", "Ljava/util/concurrent/Executor;", "Z", "editorHasFocus", "Ler/l;", "Lv4/t0;", "getState$ui", "()Lv4/t0;", "state", "Lv4/u;", "", "Ljava/lang/ref/WeakReference;", "Lv4/n0;", "i", "Ljava/util/List;", "ics", "Landroid/view/inputmethod/BaseInputConnection;", "j", "Loq/k;", "p", "()Landroid/view/inputmethod/BaseInputConnection;", "baseInputConnection", "Landroid/graphics/Rect;", "k", "Landroid/graphics/Rect;", "focusedRect", "Lv4/f;", "l", "Lv4/f;", "cursorAnchorInfoController", "Ln2/c;", "m", "Ln2/c;", "textInputCommandQueue", "Ljava/lang/Runnable;", "n", "Ljava/lang/Runnable;", "frameCallback", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public final class x0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w inputMethodManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Executor inputCommandProcessorExecutor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean editorHasFocus;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private er.l<? super List<? extends j>, oq.i0> onEditCommand;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private er.l<? super t, oq.i0> onImeActionPerformed;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ImeOptions imeOptions;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private List<WeakReference<n0>> ics;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final oq.k baseInputConnection;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Rect focusedRect;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final v4.f cursorAnchorInfoController;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final n2.c<a> textInputCommandQueue;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Runnable frameCallback;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lv4/x0$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum a {
        StartInput,
        StopInput,
        ShowKeyboard,
        HideKeyboard;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ wq.a f203751f = wq.b.a(b());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203752a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.StartInput.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.StopInput.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ShowKeyboard.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HideKeyboard.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f203752a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "c", "()Landroid/view/inputmethod/BaseInputConnection;"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.a<BaseInputConnection> {
        c() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection a() {
            return new BaseInputConnection(x0.this.getView(), false);
        }
    }

    @Metadata(d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"v4/x0$d", "Lv4/v;", "", "Lv4/j;", "editCommands", "Loq/i0;", "d", "(Ljava/util/List;)V", "Lv4/t;", "imeAction", "c", "(I)V", "Landroid/view/KeyEvent;", "event", "a", "(Landroid/view/KeyEvent;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "b", "(ZZZZZZ)V", "Lv4/n0;", "inputConnection", "e", "(Lv4/n0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements v {
        d() {
        }

        @Override // v4.v
        public void a(KeyEvent event) {
            x0.this.p().sendKeyEvent(event);
        }

        @Override // v4.v
        public void b(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
            x0.this.cursorAnchorInfoController.b(immediate, monitor, includeInsertionMarker, includeCharacterBounds, includeEditorBounds, includeLineBounds);
        }

        @Override // v4.v
        public void c(int imeAction) {
            x0.this.onImeActionPerformed.b(t.j(imeAction));
        }

        @Override // v4.v
        public void d(List<? extends j> editCommands) {
            x0.this.onEditCommand.b(editCommands);
        }

        @Override // v4.v
        public void e(n0 inputConnection) {
            int size = x0.this.ics.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (fr.t.c(((WeakReference) x0.this.ics.get(i15)).get(), inputConnection)) {
                    x0.this.ics.remove(i15);
                    return;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lv4/j;", "it", "Loq/i0;", "c", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends fr.w implements er.l<List<? extends j>, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f203755b = new e();

        e() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(List<? extends j> list) {
            c(list);
            return oq.i0.f148189a;
        }

        public final void c(List<? extends j> list) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv4/t;", "it", "Loq/i0;", "c", "(I)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends fr.w implements er.l<t, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f203756b = new f();

        f() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(t tVar) {
            c(tVar.getValue());
            return oq.i0.f148189a;
        }

        public final void c(int i15) {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lv4/j;", "it", "Loq/i0;", "c", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends fr.w implements er.l<List<? extends j>, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f203757b = new g();

        g() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(List<? extends j> list) {
            c(list);
            return oq.i0.f148189a;
        }

        public final void c(List<? extends j> list) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv4/t;", "it", "Loq/i0;", "c", "(I)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends fr.w implements er.l<t, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f203758b = new h();

        h() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(t tVar) {
            c(tVar.getValue());
            return oq.i0.f148189a;
        }

        public final void c(int i15) {
        }
    }

    public x0(View view, a4.i iVar, w wVar, Executor executor) {
        this.view = view;
        this.inputMethodManager = wVar;
        this.inputCommandProcessorExecutor = executor;
        this.onEditCommand = e.f203755b;
        this.onImeActionPerformed = f.f203756b;
        this.state = new TextFieldValue("", z3.INSTANCE.a(), (z3) null, 4, (fr.k) null);
        this.imeOptions = ImeOptions.INSTANCE.a();
        this.ics = new ArrayList();
        this.baseInputConnection = oq.l.b(oq.o.NONE, new c());
        this.cursorAnchorInfoController = new v4.f(iVar, wVar);
        this.textInputCommandQueue = new n2.c<>(new a[16], 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection p() {
        return (BaseInputConnection) this.baseInputConnection.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void s() {
        View viewFindFocus;
        if (!this.view.isFocused() && (viewFindFocus = this.view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
            this.textInputCommandQueue.j();
            return;
        }
        fr.p0 p0Var = new fr.p0();
        fr.p0 p0Var2 = new fr.p0();
        n2.c<a> cVar = this.textInputCommandQueue;
        a[] aVarArr = cVar.content;
        int size = cVar.getSize();
        for (int i15 = 0; i15 < size; i15++) {
            t(aVarArr[i15], p0Var, p0Var2);
        }
        this.textInputCommandQueue.j();
        if (fr.t.c(p0Var.f66410a, Boolean.TRUE)) {
            u();
        }
        Boolean bool = (Boolean) p0Var2.f66410a;
        if (bool != null) {
            x(bool.booleanValue());
        }
        if (fr.t.c(p0Var.f66410a, Boolean.FALSE)) {
            u();
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void t(a aVar, fr.p0<Boolean> p0Var, fr.p0<Boolean> p0Var2) {
        int i15 = b.f203752a[aVar.ordinal()];
        if (i15 == 1) {
            ?? r15 = Boolean.TRUE;
            p0Var.f66410a = r15;
            p0Var2.f66410a = r15;
        } else if (i15 == 2) {
            ?? r16 = Boolean.FALSE;
            p0Var.f66410a = r16;
            p0Var2.f66410a = r16;
        } else {
            if (i15 != 3 && i15 != 4) {
                throw new oq.p();
            }
            if (fr.t.c(p0Var.f66410a, Boolean.FALSE)) {
                return;
            }
            p0Var2.f66410a = Boolean.valueOf(aVar == a.ShowKeyboard);
        }
    }

    private final void u() {
        this.inputMethodManager.b();
    }

    private final void v(a command) {
        this.textInputCommandQueue.d(command);
        if (this.frameCallback == null) {
            Runnable runnable = new Runnable() { // from class: v4.w0
                @Override // java.lang.Runnable
                public final void run() {
                    x0.w(this.f203727a);
                }
            };
            this.inputCommandProcessorExecutor.execute(runnable);
            this.frameCallback = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(x0 x0Var) {
        x0Var.frameCallback = null;
        x0Var.s();
    }

    private final void x(boolean visible) {
        if (visible) {
            this.inputMethodManager.c();
        } else {
            this.inputMethodManager.d();
        }
    }

    @Override // v4.m0
    public void a() {
        v(a.StartInput);
    }

    @Override // v4.m0
    public void b() {
        this.editorHasFocus = false;
        this.onEditCommand = g.f203757b;
        this.onImeActionPerformed = h.f203758b;
        this.focusedRect = null;
        v(a.StopInput);
    }

    @Override // v4.m0
    public void c() {
        v(a.HideKeyboard);
    }

    @Override // v4.m0
    public void d(TextFieldValue oldValue, TextFieldValue newValue) {
        boolean z15 = (z3.g(this.state.getSelection(), newValue.getSelection()) && fr.t.c(this.state.getComposition(), newValue.getComposition())) ? false : true;
        this.state = newValue;
        int size = this.ics.size();
        for (int i15 = 0; i15 < size; i15++) {
            n0 n0Var = this.ics.get(i15).get();
            if (n0Var != null) {
                n0Var.f(newValue);
            }
        }
        this.cursorAnchorInfoController.a();
        if (fr.t.c(oldValue, newValue)) {
            if (z15) {
                w wVar = this.inputMethodManager;
                int iL = z3.l(newValue.getSelection());
                int iK = z3.k(newValue.getSelection());
                z3 composition = this.state.getComposition();
                int iL2 = composition != null ? z3.l(composition.getPackedValue()) : -1;
                z3 composition2 = this.state.getComposition();
                wVar.a(iL, iK, iL2, composition2 != null ? z3.k(composition2.getPackedValue()) : -1);
                return;
            }
            return;
        }
        if (oldValue != null && (!fr.t.c(oldValue.m(), newValue.m()) || (z3.g(oldValue.getSelection(), newValue.getSelection()) && !fr.t.c(oldValue.getComposition(), newValue.getComposition())))) {
            u();
            return;
        }
        int size2 = this.ics.size();
        for (int i16 = 0; i16 < size2; i16++) {
            n0 n0Var2 = this.ics.get(i16).get();
            if (n0Var2 != null) {
                n0Var2.g(this.state, this.inputMethodManager);
            }
        }
    }

    @Override // v4.m0
    @oq.a
    public void e(m3.g rect) {
        Rect rect2;
        this.focusedRect = new Rect(hr.a.d(rect.getLeft()), hr.a.d(rect.getTop()), hr.a.d(rect.getRight()), hr.a.d(rect.getBottom()));
        if (!this.ics.isEmpty() || (rect2 = this.focusedRect) == null) {
            return;
        }
        this.view.requestRectangleOnScreen(new Rect(rect2));
    }

    @Override // v4.m0
    public void f() {
        v(a.ShowKeyboard);
    }

    @Override // v4.m0
    public void g(TextFieldValue value, ImeOptions imeOptions, er.l<? super List<? extends j>, oq.i0> onEditCommand, er.l<? super t, oq.i0> onImeActionPerformed) {
        this.editorHasFocus = true;
        this.state = value;
        this.imeOptions = imeOptions;
        this.onEditCommand = onEditCommand;
        this.onImeActionPerformed = onImeActionPerformed;
        v(a.StartInput);
    }

    @Override // v4.m0
    public void h(TextFieldValue textFieldValue, i0 offsetMapping, TextLayoutResult textLayoutResult, er.l<? super g2, oq.i0> textFieldToRootTransform, m3.g innerTextFieldBounds, m3.g decorationBoxBounds) {
        this.cursorAnchorInfoController.d(textFieldValue, offsetMapping, textLayoutResult, textFieldToRootTransform, innerTextFieldBounds, decorationBoxBounds);
    }

    public final InputConnection o(EditorInfo outAttrs) {
        if (!this.editorHasFocus) {
            return null;
        }
        a1.h(outAttrs, this.imeOptions, this.state);
        a1.i(outAttrs);
        n0 n0Var = new n0(this.state, new d(), this.imeOptions.getAutoCorrect());
        this.ics.add(new WeakReference<>(n0Var));
        return n0Var;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final View getView() {
        return this.view;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getEditorHasFocus() {
        return this.editorHasFocus;
    }

    public /* synthetic */ x0(View view, a4.i iVar, w wVar, Executor executor, int i15, fr.k kVar) {
        this(view, iVar, wVar, (i15 & 8) != 0 ? a1.d(Choreographer.getInstance()) : executor);
    }

    public x0(View view, a4.i iVar) {
        this(view, iVar, new x(view), null, 8, null);
    }
}
