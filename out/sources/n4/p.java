package n4;

import java.util.List;
import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R5\u0010\u000e\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR)\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\rR5\u0010\u001a\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00160\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR9\u0010\u001f\u001a$\u0012 \u0012\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00160\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\rR/\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010\rR8\u0010(\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u000b\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\rR/\u0010+\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b*\u0010\rR/\u0010.\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\rR;\u00101\u001a&\u0012\"\u0012 \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0/0\u00050\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b0\u0010\rR/\u00103\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b2\u0010\rR/\u00105\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b4\u0010\rR/\u00108\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\u000b\u001a\u0004\b7\u0010\rR)\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b9\u0010\rR/\u0010<\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b;\u0010\u000b\u001a\u0004\b,\u0010\rR)\u0010>\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b=\u0010\u000b\u001a\u0004\b6\u0010\rR2\u0010B\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b?\u0010\u000b\u0012\u0004\bA\u0010\u0003\u001a\u0004\b@\u0010\rR)\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\u000b\u001a\u0004\b\u0010\u0010\rR)\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bE\u0010\u000b\u001a\u0004\b\u0018\u0010\rR)\u0010H\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\u000b\u001a\u0004\bE\u0010\rR)\u0010I\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b!\u0010\rR)\u0010J\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\n\u0010\rR)\u0010K\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b\u001d\u0010\rR)\u0010L\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b-\u0010\u000b\u001a\u0004\bG\u0010\rR#\u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M0\u00048\u0006¢\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\b\u0013\u0010\rR)\u0010P\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u000b\u001a\u0004\bC\u0010\rR)\u0010Q\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b4\u0010\u000b\u001a\u0004\b=\u0010\rR)\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\b7\u0010\u000b\u001a\u0004\b;\u0010\rR)\u0010T\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u00050\u00048\u0006¢\u0006\f\n\u0004\bS\u0010\u000b\u001a\u0004\b?\u0010\rR5\u0010V\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0007\u0012\u0004\u0012\u00020\t0\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\u000b\u001a\u0004\b%\u0010\r¨\u0006W"}, d2 = {"Ln4/p;", "", "<init>", "()V", "Ln4/h0;", "Ln4/a;", "Lkotlin/Function1;", "", "Lq4/t3;", "", "b", "Ln4/h0;", "i", "()Ln4/h0;", "GetTextLayoutResult", "Lkotlin/Function0;", "c", "l", "OnClick", "d", "o", "OnLongClick", "Lkotlin/Function2;", "", "e", "v", "ScrollBy", "Lm3/e;", "Ltq/e;", "f", "w", "ScrollByOffset", "", "g", "x", "ScrollToIndex", "Lq4/e;", "h", "k", "getOnAutofillText$annotations", "OnAutofillText", "Lh3/w;", "m", "OnFillData", "j", "y", "SetProgress", "Lkotlin/Function3;", "z", "SetSelection", "A", "SetText", "B", "SetTextSubstitution", "n", "C", "ShowTextSubstitution", "a", "ClearTextSubstitution", "p", "InsertTextAtCursor", "q", "OnImeAction", "r", "getPerformImeAction", "getPerformImeAction$annotations", "PerformImeAction", "s", "CopyText", "t", "CutText", "u", "PasteText", "Expand", "Collapse", "Dismiss", "RequestFocus", "", "Ln4/g;", "CustomActions", "PageUp", "PageLeft", "PageDown", ip.a.f96138c, "PageRight", "E", "GetScrollViewportLength", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> PageUp;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> PageLeft;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> PageDown;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> PageRight;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final h0<AccessibilityAction<er.l<List<Float>, Boolean>>> GetScrollViewportLength;
    public static final int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f131279a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.l<List<TextLayoutResult>, Boolean>>> GetTextLayoutResult;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> OnClick;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> OnLongClick;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.p<Float, Float, Boolean>>> ScrollBy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final h0<er.p<m3.e, tq.e<? super m3.e>, Object>> ScrollByOffset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.l<Integer, Boolean>>> ScrollToIndex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.l<q4.e, Boolean>>> OnAutofillText;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.l<h3.w, Boolean>>> OnFillData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.l<Float, Boolean>>> SetProgress;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.q<Integer, Integer, Boolean, Boolean>>> SetSelection;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.l<q4.e, Boolean>>> SetText;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.l<q4.e, Boolean>>> SetTextSubstitution;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.l<Boolean, Boolean>>> ShowTextSubstitution;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> ClearTextSubstitution;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.l<q4.e, Boolean>>> InsertTextAtCursor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> OnImeAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> PerformImeAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> CopyText;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> CutText;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> PasteText;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> Expand;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> Collapse;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> Dismiss;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final h0<AccessibilityAction<er.a<Boolean>>> RequestFocus;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final h0<List<CustomAccessibilityAction>> CustomActions;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Ln4/g;", "parentValue", "childValue", "c", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.p<List<? extends CustomAccessibilityAction>, List<? extends CustomAccessibilityAction>, List<? extends CustomAccessibilityAction>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f131305b = new a();

        a() {
            super(2);
        }

        @Override // er.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<CustomAccessibilityAction> B(List<CustomAccessibilityAction> list, List<CustomAccessibilityAction> list2) {
            if (list == null) {
                list = pq.v.n();
            }
            return pq.v.L0(list, list2);
        }
    }

    static {
        e0 e0Var = e0.f131227b;
        GetTextLayoutResult = new h0<>("GetTextLayoutResult", true, e0Var, null, 8, null);
        OnClick = new h0<>("OnClick", true, e0Var, null, 8, null);
        OnLongClick = new h0<>("OnLongClick", true, e0Var, null, 8, null);
        ScrollBy = new h0<>("ScrollBy", true, e0Var, null, 8, null);
        ScrollByOffset = new h0<>("ScrollByOffset", (er.p) null, 2, (fr.k) null);
        ScrollToIndex = new h0<>("ScrollToIndex", true, e0Var, null, 8, null);
        OnAutofillText = new h0<>("OnAutofillText", true, e0Var, null, 8, null);
        OnFillData = new h0<>("OnFillData", true, e0Var, null, 8, null);
        SetProgress = new h0<>("SetProgress", true, e0Var, null, 8, null);
        SetSelection = new h0<>("SetSelection", true, e0Var, null, 8, null);
        SetText = new h0<>("SetText", true, e0Var, null, 8, null);
        SetTextSubstitution = new h0<>("SetTextSubstitution", true, e0Var, null, 8, null);
        ShowTextSubstitution = new h0<>("ShowTextSubstitution", true, e0Var, null, 8, null);
        ClearTextSubstitution = new h0<>("ClearTextSubstitution", true, e0Var, null, 8, null);
        InsertTextAtCursor = new h0<>("InsertTextAtCursor", true, e0Var, null, 8, null);
        OnImeAction = new h0<>("PerformImeAction", true, e0Var, null, 8, null);
        PerformImeAction = new h0<>("PerformImeAction", true, e0Var, null, 8, null);
        CopyText = new h0<>("CopyText", true, e0Var, null, 8, null);
        CutText = new h0<>("CutText", true, e0Var, null, 8, null);
        PasteText = new h0<>("PasteText", true, e0Var, null, 8, null);
        Expand = new h0<>("Expand", true, e0Var, null, 8, null);
        Collapse = new h0<>("Collapse", true, e0Var, null, 8, null);
        Dismiss = new h0<>("Dismiss", true, e0Var, null, 8, null);
        RequestFocus = new h0<>("RequestFocus", true, e0Var, null, 8, null);
        CustomActions = new h0<>("CustomActions", true, a.f131305b, null, 8, null);
        PageUp = new h0<>("PageUp", true, e0Var, null, 8, null);
        PageLeft = new h0<>("PageLeft", true, e0Var, null, 8, null);
        PageDown = new h0<>("PageDown", true, e0Var, null, 8, null);
        PageRight = new h0<>("PageRight", true, e0Var, null, 8, null);
        GetScrollViewportLength = new h0<>("GetScrollViewportLength", true, e0Var, null, 8, null);
        F = 8;
    }

    private p() {
    }

    public final h0<AccessibilityAction<er.l<q4.e, Boolean>>> A() {
        return SetText;
    }

    public final h0<AccessibilityAction<er.l<q4.e, Boolean>>> B() {
        return SetTextSubstitution;
    }

    public final h0<AccessibilityAction<er.l<Boolean, Boolean>>> C() {
        return ShowTextSubstitution;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> a() {
        return ClearTextSubstitution;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> b() {
        return Collapse;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> c() {
        return CopyText;
    }

    public final h0<List<CustomAccessibilityAction>> d() {
        return CustomActions;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> e() {
        return CutText;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> f() {
        return Dismiss;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> g() {
        return Expand;
    }

    public final h0<AccessibilityAction<er.l<List<Float>, Boolean>>> h() {
        return GetScrollViewportLength;
    }

    public final h0<AccessibilityAction<er.l<List<TextLayoutResult>, Boolean>>> i() {
        return GetTextLayoutResult;
    }

    public final h0<AccessibilityAction<er.l<q4.e, Boolean>>> j() {
        return InsertTextAtCursor;
    }

    public final h0<AccessibilityAction<er.l<q4.e, Boolean>>> k() {
        return OnAutofillText;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> l() {
        return OnClick;
    }

    public final h0<AccessibilityAction<er.l<h3.w, Boolean>>> m() {
        return OnFillData;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> n() {
        return OnImeAction;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> o() {
        return OnLongClick;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> p() {
        return PageDown;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> q() {
        return PageLeft;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> r() {
        return PageRight;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> s() {
        return PageUp;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> t() {
        return PasteText;
    }

    public final h0<AccessibilityAction<er.a<Boolean>>> u() {
        return RequestFocus;
    }

    public final h0<AccessibilityAction<er.p<Float, Float, Boolean>>> v() {
        return ScrollBy;
    }

    public final h0<er.p<m3.e, tq.e<? super m3.e>, Object>> w() {
        return ScrollByOffset;
    }

    public final h0<AccessibilityAction<er.l<Integer, Boolean>>> x() {
        return ScrollToIndex;
    }

    public final h0<AccessibilityAction<er.l<Float, Boolean>>> y() {
        return SetProgress;
    }

    public final h0<AccessibilityAction<er.q<Integer, Integer, Boolean, Boolean>>> z() {
        return SetSelection;
    }
}
