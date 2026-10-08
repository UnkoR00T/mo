package j7;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.y0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/y0;", "viewModelStoreOwner", "Landroidx/lifecycle/w0$c;", "a", "(Landroidx/lifecycle/y0;Lm2/r;I)Landroidx/lifecycle/w0$c;", "hilt-lifecycle-viewmodel-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a {
    public static final w0.c a(y0 y0Var, r rVar, int i15) {
        w0.c cVarA;
        if (t.k()) {
            t.o(461998650, i15, -1, "androidx.hilt.lifecycle.viewmodel.compose.createHiltViewModelFactory (HiltViewModel.kt:83)");
        }
        if (y0Var instanceof h) {
            rVar.X(-1968186822);
            cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), ((h) y0Var).w());
            rVar.R();
        } else {
            rVar.X(-1968008324);
            rVar.R();
            cVarA = null;
        }
        if (t.k()) {
            t.n();
        }
        return cVarA;
    }
}
