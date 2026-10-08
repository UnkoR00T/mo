package g;

import android.hardware.camera2.CaptureRequest;
import java.util.LinkedHashMap;
import java.util.Map;
import o.e0;
import p071kotlin.Metadata;
import v.p1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\b\u001a\u00020\u0007*\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\t\"\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lo/e0;", "Lg/c;", "b", "(Lo/e0;)Lg/c;", "", "", "parameters", "Loq/i0;", "a", "(Lg/c;Ljava/util/Map;)V", "Lv/p1$a;", "Lv/p1$a;", "getOPTION_CAPTURE_REQUEST_CONFIGURATOR", "()Lv/p1$a;", "OPTION_CAPTURE_REQUEST_CONFIGURATOR", "camera-camera2"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p1.a<c> f69011a = p1.a.a("camerax.core.appConfig.captureRequestConfigurator", c.class);

    public static final void a(c cVar, Map<Object, ? extends Object> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Object, ? extends Object> entry : map.entrySet()) {
            if (entry.getKey() instanceof CaptureRequest.Key) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        cVar.a(linkedHashMap);
    }

    public static final c b(e0 e0Var) {
        return (c) e0Var.getConfig().f(f69011a, null);
    }
}
