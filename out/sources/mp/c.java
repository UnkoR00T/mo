package mp;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c implements hp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Map<Integer, String> f127340a = new HashMap(250);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Map<String, Integer> f127341b = new HashMap(250);

    public static c e(bp.i iVar) {
        if (bp.i.f20751g8.equals(iVar)) {
            return h.f127354d;
        }
        if (bp.i.J9.equals(iVar)) {
            return k.f127358d;
        }
        if (bp.i.f20870s5.equals(iVar)) {
            return g.f127352d;
        }
        if (bp.i.f20859r5.equals(iVar)) {
            return e.f127348d;
        }
        return null;
    }

    protected void a(int i15, String str) {
        this.f127340a.put(Integer.valueOf(i15), str);
        if (this.f127341b.containsKey(str)) {
            return;
        }
        this.f127341b.put(str, Integer.valueOf(i15));
    }

    public boolean b(String str) {
        return this.f127341b.containsKey(str);
    }

    public Map<Integer, String> c() {
        return Collections.unmodifiableMap(this.f127340a);
    }

    public abstract String d();

    public String f(int i15) {
        String str = this.f127340a.get(Integer.valueOf(i15));
        return str != null ? str : ".notdef";
    }

    public Map<String, Integer> g() {
        return Collections.unmodifiableMap(this.f127341b);
    }

    protected void h(int i15, String str) {
        Integer num;
        String str2 = this.f127340a.get(Integer.valueOf(i15));
        if (str2 != null && (num = this.f127341b.get(str2)) != null && num.intValue() == i15) {
            this.f127341b.remove(str2);
        }
        this.f127341b.put(str, Integer.valueOf(i15));
        this.f127340a.put(Integer.valueOf(i15), str);
    }
}
