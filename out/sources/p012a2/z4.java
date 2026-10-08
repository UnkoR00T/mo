package p012a2;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f3.q;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"La2/y4;", "string", "", "a", "(ILm2/r;I)Ljava/lang/String;", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class z4 {
    public static final String a(int i15, r rVar, int i16) {
        String string;
        if (t.k()) {
            t.o(-726638443, i16, -1, "androidx.compose.material.getString (Strings.android.kt:25)");
        }
        rVar.N(AndroidCompositionLocals_androidKt.b());
        Resources resources = ((Context) rVar.N(AndroidCompositionLocals_androidKt.c())).getResources();
        y4.Companion companion = y4.INSTANCE;
        if (y4.j(i15, companion.e())) {
            string = resources.getString(q.f58798i);
        } else if (y4.j(i15, companion.a())) {
            string = resources.getString(q.f58791b);
        } else if (y4.j(i15, companion.b())) {
            string = resources.getString(q.f58792c);
        } else if (y4.j(i15, companion.c())) {
            string = resources.getString(q.f58793d);
        } else if (y4.j(i15, companion.d())) {
            string = resources.getString(q.f58795f);
        } else if (y4.j(i15, companion.g())) {
            string = resources.getString(q.f58801l);
        } else if (y4.j(i15, companion.f())) {
            string = resources.getString(q.f58800k);
        } else {
            string = y4.j(i15, companion.h()) ? resources.getString(o3.f1852a) : "";
        }
        if (t.k()) {
            t.n();
        }
        return string;
    }
}
