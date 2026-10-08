package q7;

import androidx.p016lifecycle.h;
import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.y0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aS\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/t0;", "VM", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/y0;", "viewModelStoreOwner", "", "key", "Landroidx/lifecycle/w0$c;", "factory", "Lp7/a;", "extras", "a", "(Ljava/lang/Class;Landroidx/lifecycle/y0;Ljava/lang/String;Landroidx/lifecycle/w0$c;Lp7/a;Lm2/r;II)Landroidx/lifecycle/t0;", "lifecycle-viewmodel-compose"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/lifecycle/viewmodel/compose/ViewModelKt")
final /* synthetic */ class f {
    public static final <VM extends t0> VM a(Class<VM> cls, y0 y0Var, String str, w0.c cVar, CreationExtras creationExtras, r rVar, int i15, int i16) {
        if ((i16 & 2) != 0 && (y0Var = b.f165175a.c(rVar, 6)) == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if ((i16 & 4) != 0) {
            str = null;
        }
        if ((i16 & 8) != 0) {
            cVar = null;
        }
        if ((i16 & 16) != 0) {
            creationExtras = y0Var instanceof h ? ((h) y0Var).x() : CreationExtras.b.f153222c;
        }
        if (t.k()) {
            t.o(-1566358618, i15, -1, "androidx.lifecycle.viewmodel.compose.viewModel (ViewModel.android.kt:118)");
        }
        VM vm4 = (VM) d.a(y0Var, dr.a.e(cls), str, cVar, creationExtras);
        if (t.k()) {
            t.n();
        }
        return vm4;
    }
}
