package p136y9;

import android.os.Bundle;
import p071kotlin.Metadata;
import ua.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u001a;\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001aE\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"T", "Ly9/l1;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "a", "(Ly9/l1;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "b", "(Ly9/l1;Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "navigation-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m1 {
    public static final <T> T a(l1<T> l1Var, Bundle bundle, String str, String str2) {
        T tE = l1Var.e(str2);
        l1Var.g(bundle, str, tE);
        return tE;
    }

    public static final <T> T b(l1<T> l1Var, Bundle bundle, String str, String str2, T t15) {
        if (!c.b(c.a(bundle), str)) {
            throw new IllegalArgumentException("There is no previous value in this savedState.");
        }
        if (str2 == null) {
            return t15;
        }
        T tF = l1Var.f(str2, t15);
        l1Var.g(bundle, str, tF);
        return tF;
    }
}
