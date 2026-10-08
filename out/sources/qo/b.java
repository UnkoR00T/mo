package qo;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Map<Integer, String> f167551a = new HashMap(250);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Map<String, Integer> f167552b = new HashMap(250);

    protected void a(int i15, String str) {
        this.f167551a.put(Integer.valueOf(i15), str);
        this.f167552b.put(str, Integer.valueOf(i15));
    }

    public Map<Integer, String> b() {
        return Collections.unmodifiableMap(this.f167551a);
    }

    public String c(int i15) {
        String str = this.f167551a.get(Integer.valueOf(i15));
        return str != null ? str : ".notdef";
    }
}
