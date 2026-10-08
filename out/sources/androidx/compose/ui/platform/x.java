package androidx.compose.ui.platform;

import android.content.res.Resources;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n4.AccessibilityAction;
import n4.ProgressBarRangeInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a)\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u000f\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001b\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0002*\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001b\u0010!\u001a\u00020\u0002*\u00020\u00112\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"\u001a\u0013\u0010#\u001a\u00020\u0002*\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u001d\u001a!\u0010'\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030$2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(\"\u0018\u0010*\u001a\u00020\u0002*\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001d¨\u0006+"}, d2 = {"Landroidx/compose/ui/node/g;", "Lkotlin/Function1;", "", "selector", "p", "(Landroidx/compose/ui/node/g;Ler/l;)Landroidx/compose/ui/node/g;", "Lr0/q;", "Ln4/y;", "currentSemanticsNodes", "Lr0/h0;", "outputBeforeMap", "outputAfterMap", "Landroid/content/res/Resources;", "resources", "Loq/i0;", "w", "(Lr0/q;Lr0/h0;Lr0/h0;Landroid/content/res/Resources;)V", "Ln4/w;", "node", "u", "(Ln4/w;Landroid/content/res/Resources;)Z", "Lq4/e;", "s", "(Ln4/w;)Lq4/e;", "", "r", "(Ln4/w;Landroid/content/res/Resources;)Ljava/lang/String;", "m", "q", "(Ln4/w;)Z", "n", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "oldConfig", "v", "(Ln4/w;Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "o", "Ln4/a;", "", "other", "l", "(Ln4/a;Ljava/lang/Object;)Z", "t", "isRtl", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10863a;

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
            try {
                iArr[p4.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10863a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/g;", "it", "", "c", "(Landroidx/compose/ui/node/g;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.l<androidx.compose.ui.node.g, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f10864b = new b();

        b() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001a  */
        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(androidx.compose.ui.node.g gVar) {
            boolean z15;
            SemanticsConfiguration semanticsConfigurationF = gVar.f();
            if (semanticsConfigurationF != null) {
                z15 = semanticsConfigurationF.getIsMergingSemanticsOfDescendants() && semanticsConfigurationF.g(n4.c0.f131174a.g());
            }
            return Boolean.valueOf(z15);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln4/w;", "it", "", "c", "(Ln4/w;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.l<n4.w, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r0.q<n4.y> f10865b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r0.q<n4.y> qVar) {
            super(1);
            this.f10865b = qVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(n4.w wVar) {
            return Boolean.valueOf(this.f10865b.a(wVar.getId()));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln4/w;", "it", "", "c", "(Ln4/w;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements er.l<n4.w, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Resources f10866b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Resources resources) {
            super(1);
            this.f10866b = resources;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(n4.w wVar) {
            return Boolean.valueOf(x.u(wVar, this.f10866b));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(AccessibilityAction<?> accessibilityAction, Object obj) {
        if (accessibilityAction == obj) {
            return true;
        }
        if (!(obj instanceof AccessibilityAction)) {
            return false;
        }
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) obj;
        if (!fr.t.c(accessibilityAction.getLabel(), accessibilityAction2.getLabel())) {
            return false;
        }
        if (accessibilityAction.a() != null || accessibilityAction2.a() == null) {
            return accessibilityAction.a() == null || accessibilityAction2.a() != null;
        }
        return false;
    }

    private static final String m(n4.w wVar, Resources resources) {
        SemanticsConfiguration semanticsConfigurationP = wVar.b().p();
        n4.c0 c0Var = n4.c0.f131174a;
        Collection collection = (Collection) n4.q.a(semanticsConfigurationP, c0Var.d());
        if (collection != null && !collection.isEmpty()) {
            return null;
        }
        Collection collection2 = (Collection) n4.q.a(semanticsConfigurationP, c0Var.L());
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        CharSequence charSequence = (CharSequence) n4.q.a(semanticsConfigurationP, c0Var.g());
        if (charSequence == null || charSequence.length() == 0) {
            return resources.getString(f3.q.f58803n);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(n4.w wVar) {
        return !wVar.p().g(n4.c0.f131174a.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(n4.w wVar) {
        SemanticsConfiguration unmergedConfig = wVar.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        if (unmergedConfig.g(c0Var.g()) && !fr.t.c(n4.q.a(wVar.getUnmergedConfig(), c0Var.j()), Boolean.TRUE)) {
            return true;
        }
        androidx.compose.ui.node.g gVarP = p(wVar.getLayoutNode(), b.f10864b);
        if (gVarP != null) {
            SemanticsConfiguration semanticsConfigurationF = gVarP.f();
            if (!(semanticsConfigurationF != null ? fr.t.c(n4.q.a(semanticsConfigurationF, c0Var.j()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.node.g p(androidx.compose.ui.node.g gVar, er.l<? super androidx.compose.ui.node.g, Boolean> lVar) {
        for (androidx.compose.ui.node.g gVarC0 = gVar.C0(); gVarC0 != null; gVarC0 = gVarC0.C0()) {
            if (lVar.b(gVarC0).booleanValue()) {
                return gVarC0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(n4.w wVar) {
        SemanticsConfiguration unmergedConfig = wVar.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        p4.a aVar = (p4.a) n4.q.a(unmergedConfig, c0Var.Q());
        n4.l lVar = (n4.l) n4.q.a(wVar.getUnmergedConfig(), c0Var.F());
        boolean z15 = aVar != null;
        if (((Boolean) n4.q.a(wVar.getUnmergedConfig(), c0Var.H())) != null) {
            if (!(lVar != null ? n4.l.m(lVar.getValue(), n4.l.INSTANCE.h()) : false)) {
                return true;
            }
        }
        return z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String r(n4.w wVar, Resources resources) {
        SemanticsConfiguration unmergedConfig = wVar.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        Object objA = n4.q.a(unmergedConfig, c0Var.J());
        p4.a aVar = (p4.a) n4.q.a(wVar.getUnmergedConfig(), c0Var.Q());
        n4.l lVar = (n4.l) n4.q.a(wVar.getUnmergedConfig(), c0Var.F());
        int iN = 0;
        if (aVar != null) {
            int i15 = a.f10863a[aVar.ordinal()];
            if (i15 == 1) {
                if ((lVar == null ? false : n4.l.m(lVar.getValue(), n4.l.INSTANCE.g())) && objA == null) {
                    objA = resources.getString(f3.q.f58805p);
                }
            } else if (i15 == 2) {
                if ((lVar == null ? false : n4.l.m(lVar.getValue(), n4.l.INSTANCE.g())) && objA == null) {
                    objA = resources.getString(f3.q.f58804o);
                }
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                if (objA == null) {
                    objA = resources.getString(f3.q.f58797h);
                }
            }
        }
        Boolean bool = (Boolean) n4.q.a(wVar.getUnmergedConfig(), c0Var.H());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(lVar == null ? false : n4.l.m(lVar.getValue(), n4.l.INSTANCE.h())) && objA == null) {
                objA = zBooleanValue ? resources.getString(f3.q.f58802m) : resources.getString(f3.q.f58799j);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) n4.q.a(wVar.getUnmergedConfig(), c0Var.E());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.a()) {
                if (objA == null) {
                    lr.e<Float> eVarC = progressBarRangeInfo.c();
                    float current = ((eVarC.h().floatValue() - eVarC.e().floatValue()) > 0.0f ? 1 : ((eVarC.h().floatValue() - eVarC.e().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - eVarC.e().floatValue()) / (eVarC.h().floatValue() - eVarC.e().floatValue());
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (!(current == 0.0f)) {
                        iN = (current == 1.0f ? 1 : 0) != 0 ? 100 : lr.m.n(Math.round(current * 100), 1, 99);
                    }
                    objA = resources.getString(f3.q.f58808s, Integer.valueOf(iN));
                }
            } else if (objA == null) {
                objA = resources.getString(f3.q.f58796g);
            }
        }
        if (wVar.getUnmergedConfig().g(c0Var.g())) {
            objA = m(wVar, resources);
        }
        return (String) objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q4.e s(n4.w wVar) {
        SemanticsConfiguration unmergedConfig = wVar.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        q4.e eVar = (q4.e) n4.q.a(unmergedConfig, c0Var.g());
        List list = (List) n4.q.a(wVar.getUnmergedConfig(), c0Var.L());
        return eVar == null ? list != null ? (q4.e) pq.v.n0(list) : null : eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(n4.w wVar) {
        return wVar.r().getLayoutDirection() == c5.t.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(n4.w wVar, Resources resources) {
        List list = (List) n4.q.a(wVar.getUnmergedConfig(), n4.c0.f131174a.d());
        return !n4.b0.g(wVar) && (wVar.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || (wVar.D() && ((list != null ? (String) pq.v.n0(list) : null) != null || s(wVar) != null || r(wVar, resources) != null || q(wVar))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(n4.w wVar, SemanticsConfiguration semanticsConfiguration) {
        Iterator<Map.Entry<? extends n4.h0<?>, ? extends Object>> it = semanticsConfiguration.iterator();
        while (it.hasNext()) {
            if (!wVar.p().g(it.next().getKey())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(r0.q<n4.y> qVar, r0.h0 h0Var, r0.h0 h0Var2, Resources resources) {
        h0Var.j();
        h0Var2.j();
        n4.y yVarB = qVar.b(-1);
        n4.w semanticsNode = yVarB != null ? yVarB.getSemanticsNode() : null;
        List<n4.w> listF = n4.m0.f(semanticsNode, new c(qVar), new d(resources), pq.v.e(semanticsNode));
        int iP = pq.v.p(listF);
        int i15 = 1;
        if (1 > iP) {
            return;
        }
        while (true) {
            int id5 = listF.get(i15 - 1).getId();
            int id6 = listF.get(i15).getId();
            h0Var.u(id5, id6);
            h0Var2.u(id6, id5);
            if (i15 == iP) {
                return;
            } else {
                i15++;
            }
        }
    }
}
