package h3;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.List;
import l3.n0;
import n4.AccessibilityAction;
import n4.c0;
import oq.i0;
import p071kotlin.Metadata;
import r0.b1;
import r0.k0;
import r0.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0014\u001a\u00020\u00132\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010#\u001a\u00020\u00132\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 ¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b'\u0010&J\u001f\u0010*\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b,\u0010&J\u0017\u0010-\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b-\u0010&J\u000f\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b.\u0010/R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010:R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010BR\u0016\u0010F\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010E¨\u0006G"}, d2 = {"Lh3/b;", "Lh3/n;", "Ln4/t;", "Ll3/n;", "Lh3/y;", "platformAutofillManager", "Ln4/a0;", "semanticsOwner", "Landroid/view/View;", "view", "Lo4/d;", "rectManager", "", "packageName", "<init>", "(Lh3/y;Ln4/a0;Landroid/view/View;Lo4/d;Ljava/lang/String;)V", "Ll3/n0;", "previous", "current", "Loq/i0;", "N", "(Ll3/n0;Ll3/n0;)V", "Ln4/r;", "semanticsInfo", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "previousSemanticsConfiguration", "a", "(Ln4/r;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "Landroid/view/ViewStructure;", "rootViewStructure", "k", "(Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "j", "(Landroid/util/SparseArray;)V", "l", "(Ln4/r;)V", "h", "", "previousSemanticsId", "i", "(Ln4/r;I)V", "g", "e", "f", "()V", "Lh3/y;", "d", "()Lh3/y;", "setPlatformAutofillManager", "(Lh3/y;)V", "b", "Ln4/a0;", "c", "Landroid/view/View;", "Lo4/d;", "Ljava/lang/String;", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "reusableRect", "Landroid/view/autofill/AutofillId;", "Landroid/view/autofill/AutofillId;", "rootAutofillId", "Lr0/k0;", "Lr0/k0;", "currentlyDisplayedIDs", "", "Z", "pendingAutofillCommit", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends n implements n4.t, l3.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private y platformAutofillManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n4.a0 semanticsOwner;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final o4.d rectManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String packageName;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Rect reusableRect = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private AutofillId rootAutofillId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private k0 currentlyDisplayedIDs;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean pendingAutofillCommit;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80229a;

        static {
            int[] iArr = new int[p4.a.values().length];
            try {
                iArr[p4.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p4.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f80229a = iArr;
        }
    }

    /* JADX INFO: renamed from: h3.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "l", "t", "r", "b", "Loq/i0;", "c", "(IIII)V"}, k = 3, mv = {2, 1, 0})
    static final class C1828b extends fr.w implements er.r<Integer, Integer, Integer, Integer, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f80231c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1828b(int i15) {
            super(4);
            this.f80231c = i15;
        }

        public final void c(int i15, int i16, int i17, int i18) {
            b.this.getPlatformAutofillManager().e(b.this.view, this.f80231c, new Rect(i15, i16, i17, i18));
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(Integer num, Integer num2, Integer num3, Integer num4) {
            c(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "left", "top", "right", "bottom", "Loq/i0;", "c", "(IIII)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.r<Integer, Integer, Integer, Integer, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n4.r f80233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(n4.r rVar) {
            super(4);
            this.f80233c = rVar;
        }

        public final void c(int i15, int i16, int i17, int i18) {
            b.this.reusableRect.set(i15, i16, i17, i18);
            b.this.getPlatformAutofillManager().c(b.this.view, this.f80233c.getSemanticsId(), b.this.reusableRect);
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(Integer num, Integer num2, Integer num3, Integer num4) {
            c(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue());
            return i0.f148189a;
        }
    }

    public b(y yVar, n4.a0 a0Var, View view, o4.d dVar, String str) {
        this.platformAutofillManager = yVar;
        this.semanticsOwner = a0Var;
        this.view = view;
        this.rectManager = dVar;
        this.packageName = str;
        view.setImportantForAutofill(1);
        j4.a aVarA = j4.d.a(view);
        AutofillId autofillIdA = aVarA != null ? aVarA.a() : null;
        if (autofillIdA == null) {
            d4.a.d("Required value was null.");
            throw new oq.g();
        }
        this.rootAutofillId = autofillIdA;
        this.currentlyDisplayedIDs = new k0(0, 1, null);
    }

    @Override // l3.n
    public void N(n0 previous, n0 current) {
        n4.r rVarU;
        SemanticsConfiguration semanticsConfigurationF;
        n4.r rVarU2;
        SemanticsConfiguration semanticsConfigurationF2;
        if (previous != null && (rVarU2 = g4.h.u(previous)) != null && (semanticsConfigurationF2 = rVarU2.f()) != null && h3.c.d(semanticsConfigurationF2)) {
            this.platformAutofillManager.b(this.view, rVarU2.getSemanticsId());
        }
        if (current == null || (rVarU = g4.h.u(current)) == null || (semanticsConfigurationF = rVarU.f()) == null || !h3.c.d(semanticsConfigurationF)) {
            return;
        }
        int semanticsId = rVarU.getSemanticsId();
        this.rectManager.getRects().q(semanticsId, new C1828b(semanticsId));
    }

    @Override // n4.t
    public void a(n4.r semanticsInfo, SemanticsConfiguration previousSemanticsConfiguration) {
        Boolean bool;
        q4.e eVar;
        q4.e eVar2;
        SemanticsConfiguration semanticsConfigurationF = semanticsInfo.f();
        int semanticsId = semanticsInfo.getSemanticsId();
        String text = (previousSemanticsConfiguration == null || (eVar2 = (q4.e) n4.q.a(previousSemanticsConfiguration, c0.f131174a.p())) == null) ? null : eVar2.getText();
        String text2 = (semanticsConfigurationF == null || (eVar = (q4.e) n4.q.a(semanticsConfigurationF, c0.f131174a.p())) == null) ? null : eVar.getText();
        boolean z15 = false;
        if (text != text2) {
            if (text == null) {
                this.platformAutofillManager.d(this.view, semanticsId, true);
            } else if (text2 == null) {
                this.platformAutofillManager.d(this.view, semanticsId, false);
            } else if (fr.t.c((s) n4.q.a(semanticsConfigurationF, c0.f131174a.c()), s.INSTANCE.a())) {
                this.platformAutofillManager.a(this.view, semanticsId, j.f80238a.b(text2));
            }
        }
        p4.a aVar = previousSemanticsConfiguration != null ? (p4.a) n4.q.a(previousSemanticsConfiguration, c0.f131174a.Q()) : null;
        p4.a aVar2 = semanticsConfigurationF != null ? (p4.a) n4.q.a(semanticsConfigurationF, c0.f131174a.Q()) : null;
        if (aVar != aVar2) {
            if (aVar == null) {
                this.platformAutofillManager.d(this.view, semanticsId, true);
            } else if (aVar2 == null) {
                this.platformAutofillManager.d(this.view, semanticsId, false);
            } else if (fr.t.c((s) n4.q.a(semanticsConfigurationF, c0.f131174a.c()), s.INSTANCE.b())) {
                int i15 = a.f80229a[aVar2.ordinal()];
                if (i15 != 1) {
                    bool = i15 != 2 ? null : Boolean.FALSE;
                } else {
                    bool = Boolean.TRUE;
                }
                if (bool != null) {
                    this.platformAutofillManager.a(this.view, semanticsId, j.f80238a.c(bool.booleanValue()));
                }
            }
        }
        w wVar = previousSemanticsConfiguration != null ? (w) n4.q.a(previousSemanticsConfiguration, c0.f131174a.i()) : null;
        w wVar2 = semanticsConfigurationF != null ? (w) n4.q.a(semanticsConfigurationF, c0.f131174a.i()) : null;
        if (!fr.t.c(wVar, wVar2)) {
            if (wVar == null) {
                this.platformAutofillManager.d(this.view, semanticsId, true);
            } else if (wVar2 == null) {
                this.platformAutofillManager.d(this.view, semanticsId, false);
            } else {
                this.platformAutofillManager.a(this.view, semanticsId, ((h) wVar2).getAutofillValue());
            }
        }
        boolean z16 = previousSemanticsConfiguration != null && h3.c.e(previousSemanticsConfiguration);
        if (semanticsConfigurationF != null && h3.c.e(semanticsConfigurationF)) {
            z15 = true;
        }
        if (z16 != z15) {
            if (z15) {
                this.currentlyDisplayedIDs.h(semanticsId);
            } else {
                this.currentlyDisplayedIDs.v(semanticsId);
            }
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final y getPlatformAutofillManager() {
        return this.platformAutofillManager;
    }

    public final void e(n4.r semanticsInfo) {
        if (this.currentlyDisplayedIDs.v(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.d(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void f() {
        if (this.currentlyDisplayedIDs.d() && this.pendingAutofillCommit) {
            this.platformAutofillManager.commit();
            this.pendingAutofillCommit = false;
        }
        if (this.currentlyDisplayedIDs.e()) {
            this.pendingAutofillCommit = true;
        }
    }

    public final void g(n4.r semanticsInfo) {
        if (this.currentlyDisplayedIDs.v(semanticsInfo.getSemanticsId())) {
            this.platformAutofillManager.d(this.view, semanticsInfo.getSemanticsId(), false);
        }
    }

    public final void h(n4.r semanticsInfo) {
        SemanticsConfiguration semanticsConfigurationF = semanticsInfo.f();
        if (semanticsConfigurationF == null || !h3.c.e(semanticsConfigurationF)) {
            return;
        }
        this.currentlyDisplayedIDs.h(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.d(this.view, semanticsInfo.getSemanticsId(), true);
    }

    public final void i(n4.r semanticsInfo, int previousSemanticsId) {
        if (this.currentlyDisplayedIDs.v(previousSemanticsId)) {
            this.platformAutofillManager.d(this.view, previousSemanticsId, false);
        }
        SemanticsConfiguration semanticsConfigurationF = semanticsInfo.f();
        if (semanticsConfigurationF == null || !h3.c.e(semanticsConfigurationF)) {
            return;
        }
        this.currentlyDisplayedIDs.h(semanticsInfo.getSemanticsId());
        this.platformAutofillManager.d(this.view, semanticsInfo.getSemanticsId(), true);
    }

    public final void j(SparseArray<AutofillValue> values) {
        SemanticsConfiguration semanticsConfigurationF;
        er.l lVar;
        er.l lVar2;
        int size = values.size();
        for (int i15 = 0; i15 < size; i15++) {
            int iKeyAt = values.keyAt(i15);
            AutofillValue autofillValue = values.get(iKeyAt);
            n4.r rVarA = this.semanticsOwner.a(iKeyAt);
            if (rVarA != null && (semanticsConfigurationF = rVarA.f()) != null) {
                n4.p pVar = n4.p.f131279a;
                AccessibilityAction accessibilityAction = (AccessibilityAction) n4.q.a(semanticsConfigurationF, pVar.k());
                if (accessibilityAction != null && (lVar2 = (er.l) accessibilityAction.a()) != null) {
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) n4.q.a(semanticsConfigurationF, pVar.m());
                if (accessibilityAction2 != null && (lVar = (er.l) accessibilityAction2.a()) != null) {
                }
            }
        }
    }

    public final void k(ViewStructure rootViewStructure) {
        j jVar = j.f80238a;
        n4.r rVarC = this.semanticsOwner.c();
        a0.a(rootViewStructure, rVarC, this.rootAutofillId, this.packageName, this.rectManager);
        q0 q0VarH = b1.h(rVarC, rootViewStructure);
        while (q0VarH.h()) {
            ViewStructure viewStructure = (ViewStructure) q0VarH.B(q0VarH._size - 1);
            List<n4.r> listR = ((n4.r) q0VarH.B(q0VarH._size - 1)).r();
            int size = listR.size();
            for (int i15 = 0; i15 < size; i15++) {
                n4.r rVar = listR.get(i15);
                if (!rVar.getIsDeactivated() && rVar.c() && rVar.p()) {
                    SemanticsConfiguration semanticsConfigurationF = rVar.f();
                    if (semanticsConfigurationF == null || !h3.c.f(semanticsConfigurationF)) {
                        q0VarH.n(rVar);
                        q0VarH.n(viewStructure);
                    } else {
                        ViewStructure viewStructureH = jVar.h(viewStructure, jVar.a(viewStructure, 1));
                        a0.a(viewStructureH, rVar, this.rootAutofillId, this.packageName, this.rectManager);
                        q0VarH.n(rVar);
                        q0VarH.n(viewStructureH);
                    }
                }
            }
        }
    }

    public final void l(n4.r semanticsInfo) {
        this.rectManager.getRects().q(semanticsInfo.getSemanticsId(), new c(semanticsInfo));
    }
}
