package k6;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f108690a;

    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q f108691a;

        a(q qVar) {
            this.f108691a = qVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i15) {
            p pVarB = this.f108691a.b(i15);
            if (pVarB == null) {
                return null;
            }
            return pVarB.e1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i15) {
            List<p> listC = this.f108691a.c(str, i15);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i16 = 0; i16 < size; i16++) {
                arrayList.add(listC.get(i16).e1());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i15) {
            p pVarD = this.f108691a.d(i15);
            if (pVarD == null) {
                return null;
            }
            return pVarD.e1();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i15, int i16, Bundle bundle) {
            return this.f108691a.f(i15, i16, bundle);
        }
    }

    static class b extends a {
        b(q qVar) {
            super(qVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i15, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f108691a.a(i15, p.f1(accessibilityNodeInfo), str, bundle);
        }
    }

    public q() {
        this.f108690a = new b(this);
    }

    public void a(int i15, p pVar, String str, Bundle bundle) {
    }

    public p b(int i15) {
        return null;
    }

    public List<p> c(String str, int i15) {
        return null;
    }

    public p d(int i15) {
        return null;
    }

    public Object e() {
        return this.f108690a;
    }

    public boolean f(int i15, int i16, Bundle bundle) {
        return false;
    }

    public q(Object obj) {
        this.f108690a = obj;
    }
}
