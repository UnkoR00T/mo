package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;
import rb.e;

/* JADX INFO: loaded from: classes3.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SidecarDeviceState f13730b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f13732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SidecarInterface.SidecarCallback f13733e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f13729a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<IBinder, SidecarWindowLayoutInfo> f13731c = new WeakHashMap();

    DistinctElementSidecarCallback(e eVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f13732d = eVar;
        this.f13733e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f13729a) {
            try {
                if (this.f13732d.e(this.f13730b, sidecarDeviceState)) {
                    return;
                }
                this.f13730b = sidecarDeviceState;
                this.f13733e.onDeviceStateChanged(sidecarDeviceState);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f13729a) {
            try {
                if (this.f13732d.h(this.f13731c.get(iBinder), sidecarWindowLayoutInfo)) {
                    return;
                }
                this.f13731c.put(iBinder, sidecarWindowLayoutInfo);
                this.f13733e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
