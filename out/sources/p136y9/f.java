package p136y9;

import android.os.Bundle;
import fr.t;
import p071kotlin.Metadata;
import ua.c;
import ua.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ly9/f;", "Ly9/l1;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "Loq/i0;", "l", "(Landroid/os/Bundle;Ljava/lang/String;Z)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Boolean;", "k", "(Ljava/lang/String;)Ljava/lang/Boolean;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f extends l1<Boolean> {
    public f() {
        super(false);
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: b */
    public String getName() {
        return "boolean";
    }

    @Override // p136y9.l1
    public /* bridge */ /* synthetic */ void g(Bundle bundle, String str, Boolean bool) {
        l(bundle, str, bool.booleanValue());
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Boolean a(Bundle bundle, String key) {
        Bundle bundleA = c.a(bundle);
        if (!c.b(bundleA, key) || c.w(bundleA, key)) {
            return null;
        }
        return Boolean.valueOf(c.e(bundleA, key));
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Boolean e(String value) {
        boolean z15;
        if (t.c(value, "true")) {
            z15 = true;
        } else {
            if (!t.c(value, "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z15 = false;
        }
        return Boolean.valueOf(z15);
    }

    public void l(Bundle bundle, String key, boolean value) {
        k.c(k.a(bundle), key, value);
    }
}
