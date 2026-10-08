package ig;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f92282a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f92283b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z15, Status status) {
        HashMap map;
        HashMap map2;
        Map map3 = this.f92282a;
        synchronized (map3) {
            map = new HashMap(map3);
        }
        Map map4 = this.f92283b;
        synchronized (map4) {
            map2 = new HashMap(map4);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z15 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).c(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z15 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((vh.m) entry2.getKey()).d(new hg.b(status));
            }
        }
    }

    final void a(BasePendingResult basePendingResult, boolean z15) {
        this.f92282a.put(basePendingResult, Boolean.valueOf(z15));
        basePendingResult.a(new m1(this, basePendingResult));
    }

    final void b(vh.m mVar, boolean z15) {
        this.f92283b.put(mVar, Boolean.valueOf(z15));
        mVar.a().c(new n1(this, mVar));
    }

    final boolean c() {
        return (this.f92282a.isEmpty() && this.f92283b.isEmpty()) ? false : true;
    }

    public final void d() {
        h(false, e.f92155r);
    }

    final void e(int i15, String str) {
        StringBuilder sb5 = new StringBuilder("The connection to Google Play services was lost");
        if (i15 == 1) {
            sb5.append(" due to service disconnection.");
        } else if (i15 == 3) {
            sb5.append(" due to dead object exception.");
        }
        if (str != null) {
            sb5.append(" Last reason for disconnect: ");
            sb5.append(str);
        }
        h(true, new Status(20, sb5.toString()));
    }

    final /* synthetic */ Map f() {
        return this.f92282a;
    }

    final /* synthetic */ Map g() {
        return this.f92283b;
    }
}
