package p136y9;

import android.os.Bundle;
import fr.t;
import p071kotlin.Metadata;
import ua.c;
import ua.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\r\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Ly9/y1;", "Ly9/l1;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "key", "value", "Loq/i0;", "l", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V", "j", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;", "k", "(Ljava/lang/String;)Ljava/lang/String;", "m", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y1 extends l1<String> {
    public y1() {
        super(true);
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: b */
    public String getName() {
        return "string";
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String a(Bundle bundle, String key) {
        Bundle bundleA = c.a(bundle);
        if (!c.b(bundleA, key) || c.w(bundleA, key)) {
            return null;
        }
        return c.r(bundleA, key);
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public String e(String value) {
        if (t.c(value, "null")) {
            return null;
        }
        return value;
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void g(Bundle bundle, String key, String value) {
        Bundle bundleA = k.a(bundle);
        if (value != null) {
            k.p(bundleA, key, value);
        } else {
            k.k(bundleA, key);
        }
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public String h(String value) {
        String strC;
        return (value == null || (strC = o1.c(o1.f225471a, value, null, 2, null)) == null) ? "null" : strC;
    }
}
