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
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\t2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0018\u001a\u00020\u00172\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Ly9/m;", "Ly9/g;", "", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "bundle", "", "key", "value", "Loq/i0;", "p", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/util/List;)V", "m", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;", "n", "(Ljava/lang/String;)Ljava/util/List;", "previousValue", "o", "(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", "other", "", "r", "(Ljava/util/List;Ljava/util/List;)Z", "q", "(Ljava/util/List;)Ljava/util/List;", "l", "()Ljava/util/List;", "b", "()Ljava/lang/String;", "name", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class m extends g<List<? extends Integer>> {
    public m() {
        super(true);
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: b */
    public String getName() {
        return "List<Int>";
    }

    @Override // p136y9.g
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<Integer> j() {
        return v.n();
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public List<Integer> a(Bundle bundle, String key) {
        Bundle bundleA = c.a(bundle);
        if (!c.b(bundleA, key) || c.w(bundleA, key)) {
            return null;
        }
        return n.l1(c.k(bundleA, key));
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public List<Integer> e(String value) {
        return v.e(l1.f225450d.e(value));
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public List<Integer> f(String value, List<Integer> previousValue) {
        List<Integer> listL0;
        return (previousValue == null || (listL0 = v.L0(previousValue, e(value))) == null) ? e(value) : listL0;
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void g(Bundle bundle, String key, List<Integer> value) {
        if (value != null) {
            k.h(k.a(bundle), key, v.e1(value));
        }
    }

    @Override // p136y9.g
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public List<String> k(List<Integer> value) {
        if (value == null) {
            return v.n();
        }
        List<Integer> list = value;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        return arrayList;
    }

    @Override // p136y9.l1
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public boolean i(List<Integer> value, List<Integer> other) {
        return n.d(value != null ? (Integer[]) value.toArray(new Integer[0]) : null, other != null ? (Integer[]) other.toArray(new Integer[0]) : null);
    }
}
