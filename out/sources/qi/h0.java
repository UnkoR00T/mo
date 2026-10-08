package qi;

import android.annotation.SuppressLint;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.sd;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f166685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f166686b = new HashMap();

    @SuppressLint({"UseSparseArrays"})
    public h0(int i15) {
        this.f166685a = i15;
    }

    public final synchronized void a(long j15) {
        this.f166686b.remove(Long.valueOf(j15));
    }

    public final synchronized boolean b(Object obj, long j15) {
        if (this.f166686b.size() != this.f166685a) {
            this.f166686b.put(Long.valueOf(j15), obj);
            return true;
        }
        sd.f30625b.c(this, "Buffer is full. Drop frame " + j15, new Object[0]);
        return false;
    }
}
