package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n4.AccessibilityAction;
import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a#\u0010\f\u001a\u0004\u0018\u00010\t*\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "configuration", "Lq4/t3;", "c", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Lq4/t3;", "", "b", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Ljava/lang/Float;", "", "Landroidx/compose/ui/platform/n2;", "", "id", "a", "(Ljava/util/List;I)Landroidx/compose/ui/platform/n2;", "Ln4/l;", "", "e", "(I)Ljava/lang/String;", "Landroidx/compose/ui/platform/p0;", "Landroid/view/View;", "d", "(Landroidx/compose/ui/platform/p0;I)Landroid/view/View;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p2 {
    public static final n2 a(List<n2> list, int i15) {
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            if (list.get(i16).getSemanticsNodeId() == i15) {
                return list.get(i16);
            }
        }
        return null;
    }

    @SuppressLint({"PrimitiveInCollection"})
    public static final Float b(SemanticsConfiguration semanticsConfiguration) {
        er.l lVar;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) n4.q.a(semanticsConfiguration, n4.p.f131279a.h());
        if (accessibilityAction == null || (lVar = (er.l) accessibilityAction.a()) == null || !((Boolean) lVar.b(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final TextLayoutResult c(SemanticsConfiguration semanticsConfiguration) {
        er.l lVar;
        ArrayList arrayList = new ArrayList();
        AccessibilityAction accessibilityAction = (AccessibilityAction) n4.q.a(semanticsConfiguration, n4.p.f131279a.i());
        if (accessibilityAction == null || (lVar = (er.l) accessibilityAction.a()) == null || !((Boolean) lVar.b(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final View d(p0 p0Var, int i15) {
        Object next;
        Iterator<T> it = p0Var.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((androidx.compose.ui.node.g) ((Map.Entry) next).getKey()).getSemanticsId() != i15);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (androidx.compose.ui.viewinterop.b) entry.getValue();
        }
        return null;
    }

    public static final String e(int i15) {
        n4.l.Companion companion = n4.l.INSTANCE;
        if (n4.l.m(i15, companion.a())) {
            return "android.widget.Button";
        }
        if (n4.l.m(i15, companion.c())) {
            return "android.widget.CheckBox";
        }
        if (n4.l.m(i15, companion.f())) {
            return "android.widget.RadioButton";
        }
        if (n4.l.m(i15, companion.e())) {
            return "android.widget.ImageView";
        }
        if (n4.l.m(i15, companion.d())) {
            return "android.widget.Spinner";
        }
        if (n4.l.m(i15, companion.i())) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
