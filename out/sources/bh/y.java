package bh;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f19478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private w f19479c;

    /* synthetic */ y(String str, x xVar) {
        w wVar = new w();
        this.f19478b = wVar;
        this.f19479c = wVar;
        str.getClass();
        this.f19477a = str;
    }

    public final y a(String str, Object obj) {
        w wVar = new w();
        this.f19479c.f19475c = wVar;
        this.f19479c = wVar;
        wVar.f19474b = obj;
        wVar.f19473a = str;
        return this;
    }

    public final String toString() {
        StringBuilder sb5 = new StringBuilder(32);
        sb5.append(this.f19477a);
        sb5.append('{');
        w wVar = this.f19478b.f19475c;
        String str = "";
        while (wVar != null) {
            Object obj = wVar.f19474b;
            sb5.append(str);
            String str2 = wVar.f19473a;
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
            wVar = wVar.f19475c;
            str = ", ";
        }
        sb5.append('}');
        return sb5.toString();
    }
}
