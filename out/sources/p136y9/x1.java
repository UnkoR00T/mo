package p136y9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.n;
import pq.v;
import ua.c;
import ua.k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\f\u001a\u00020\u000b2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u00032\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ,\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\u00032\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0017\u001a\u00020\u00162\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Ly9/x1;", "Ly9/g;", "", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "key", "value", "Loq/i0;", "p", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "m", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "n", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "o", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "r", "(Ljava/util/List;Ljava/util/List;)Z", "q", "(Ljava/util/List;)Ljava/util/List;", "l", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x1 extends g<List<? extends String>> {
    public x1() {
        super(true);
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: b */
    public String getName() {
        return "List<String>";
    }

    @Override // p136y9.g
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<String> j() {
        return v.n();
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public List<String> a(Bundle bundle, String key) {
        Bundle bundleA = c.a(bundle);
        if (!c.b(bundleA, key) || c.w(bundleA, key)) {
            return null;
        }
        return n.n1(c.s(bundleA, key));
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public List<String> e(String value) {
        return v.e(value);
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public List<String> f(String value, List<String> previousValue) {
        List<String> listL0;
        return (previousValue == null || (listL0 = v.L0(previousValue, e(value))) == null) ? e(value) : listL0;
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void g(Bundle bundle, String key, List<String> value) {
        Bundle bundleA = k.a(bundle);
        if (value != null) {
            k.q(bundleA, key, (String[]) value.toArray(new String[0]));
        } else {
            k.k(bundleA, key);
        }
    }

    @Override // p136y9.g
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<String> k(List<String> value) {
        if (value == null) {
            return v.n();
        }
        List<String> list = value;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(o1.c(o1.f225471a, (String) it.next(), null, 2, null));
        }
        return arrayList;
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean i(List<String> value, List<String> other) {
        return n.d(value != null ? (String[]) value.toArray(new String[0]) : null, other != null ? (String[]) other.toArray(new String[0]) : null);
    }
}
