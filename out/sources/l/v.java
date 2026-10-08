package l;

import android.hardware.camera2.CaptureResult;
import h.q0;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004*\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "Landroid/hardware/camera2/CaptureResult$Key;", "", "", "Lkotlin/Function1;", "Lh/q0;", "", "b", "(Ljava/util/Map;)Ler/l;", "camera-camera2-pipe"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v {
    public static final er.l<q0, Boolean> b(final Map<CaptureResult.Key<?>, ? extends List<? extends Object>> map) {
        return new er.l() { // from class: l.u
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(v.c(map, (q0) obj));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Map map, q0 q0Var) {
        for (Map.Entry entry : map.entrySet()) {
            CaptureResult.Key key = (CaptureResult.Key) entry.getKey();
            if (!pq.v.c0((List) entry.getValue(), q0Var.I(key))) {
                return false;
            }
        }
        return true;
    }
}
