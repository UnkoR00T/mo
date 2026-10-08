package eh;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final we f51269b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private we f51270c;

    /* synthetic */ xe(String str, ue ueVar) {
        we weVar = new we(null);
        this.f51269b = weVar;
        this.f51270c = weVar;
        this.f51268a = str;
    }

    private final xe e(String str, Object obj) {
        ve veVar = new ve(null);
        this.f51270c.f51222c = veVar;
        this.f51270c = veVar;
        veVar.f51221b = obj;
        veVar.f51220a = str;
        return this;
    }

    public final xe a(String str, float f15) {
        e(str, String.valueOf(f15));
        return this;
    }

    public final xe b(String str, int i15) {
        e(str, String.valueOf(i15));
        return this;
    }

    public final xe c(String str, Object obj) {
        we weVar = new we(null);
        this.f51270c.f51222c = weVar;
        this.f51270c = weVar;
        weVar.f51221b = obj;
        weVar.f51220a = str;
        return this;
    }

    public final xe d(String str, boolean z15) {
        e("trackingEnabled", String.valueOf(z15));
        return this;
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder(32);
        sb5.append(this.f51268a);
        sb5.append('{');
        we weVar = this.f51269b.f51222c;
        String str = "";
        while (weVar != null) {
            Object obj = weVar.f51221b;
            sb5.append(str);
            String str2 = weVar.f51220a;
            if (str2 != null) {
                sb5.append(str2);
                sb5.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb5.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb5.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            weVar = weVar.f51222c;
            str = ", ";
        }
        sb5.append('}');
        return sb5.toString();
    }
}
