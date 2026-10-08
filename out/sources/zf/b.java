package zf;

import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f234968a;

    public b(Resources resources) {
        this.f234968a = (Resources) bg.a.b(resources);
    }

    private String b(nf.b bVar) {
        throw null;
    }

    private String c(nf.b bVar) {
        throw null;
    }

    private String d(nf.b bVar) {
        throw null;
    }

    private String e(nf.b bVar) {
        String strJ = j(f(bVar), h(bVar));
        return TextUtils.isEmpty(strJ) ? d(bVar) : strJ;
    }

    private String f(nf.b bVar) {
        throw null;
    }

    private String g(nf.b bVar) {
        throw null;
    }

    private String h(nf.b bVar) {
        throw null;
    }

    private static int i(nf.b bVar) {
        throw null;
    }

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f234968a.getString(d.f234970a, string, str);
            }
        }
        return string;
    }

    @Override // zf.f
    public String a(nf.b bVar) {
        String strJ;
        int i15 = i(bVar);
        if (i15 == 2) {
            strJ = j(h(bVar), g(bVar), c(bVar));
        } else {
            strJ = i15 == 1 ? j(e(bVar), b(bVar), c(bVar)) : e(bVar);
        }
        return strJ.length() == 0 ? this.f234968a.getString(d.f234973d) : strJ;
    }
}
