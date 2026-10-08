package i;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.StreamGraph;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Li/s;", "Li/y2;", "Lk/z;", "threads", "Lh/s$b;", "graphConfig", "Ll/x;", "streamGraph", "<init>", "(Lk/z;Lh/s$b;Ll/x;)V", "Li/m2;", "cameraDevice", "", "Lh/q1;", "Landroid/view/Surface;", "surfaces", "Li/a3;", "captureSessionState", "Li/y2$a;", "a", "(Li/m2;Ljava/util/Map;Li/a3;)Li/y2$a;", "Lk/z;", "b", "Lh/s$b;", "c", "Ll/x;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements y2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.z threads;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.s.b graphConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StreamGraph streamGraph;

    public s(k.z zVar, h.s.b bVar, StreamGraph streamGraph) {
        this.threads = zVar;
        this.graphConfig = bVar;
        this.streamGraph = streamGraph;
    }

    @Override // i.y2
    public y2.a a(m2 cameraDevice, Map<h.q1, ? extends Surface> surfaces, a3 captureSessionState) throws Exception {
        int sessionMode;
        int i15;
        ArrayList arrayList;
        a3 a3Var;
        int sessionMode2 = this.graphConfig.getSessionMode();
        h.s.e.Companion companion = h.s.e.INSTANCE;
        if (h.s.e.f(sessionMode2, companion.d())) {
            i15 = 0;
        } else {
            if (h.s.e.f(sessionMode2, companion.c())) {
                sessionMode = 1;
            } else {
                if (h.s.e.f(sessionMode2, companion.b())) {
                    throw new IllegalArgumentException("Unsupported session mode: " + ((Object) h.s.e.h(this.graphConfig.getSessionMode())));
                }
                sessionMode = this.graphConfig.getSessionMode();
            }
            i15 = sessionMode;
        }
        OutputConfigurations outputConfigurationsB = z2.b(this.graphConfig, this.streamGraph, surfaces);
        if (outputConfigurationsB.a().isEmpty()) {
            if (k.k.f107055a.d()) {
                io.sentry.android.core.c2.g("CXCP", "Failed to create OutputConfigurations for " + this.graphConfig);
            }
            captureSessionState.a();
            return y2.a.C2056a.f87638a;
        }
        List<h.x0.a> listK = this.graphConfig.k();
        if (listK != null) {
            List<h.x0.a> list = listK;
            arrayList = new ArrayList(pq.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                h.e1.a aVar = (h.e1.a) pq.v.P0(((h.x0.a) it.next()).getStream().b());
                arrayList.add(new InputConfigData(aVar.getSize().getWidth(), aVar.getSize().getHeight(), aVar.getFormat()));
            }
        } else {
            arrayList = null;
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                if (((InputConfigData) it4.next()).getFormat() != ((InputConfigData) arrayList2.get(0)).getFormat()) {
                    throw new IllegalStateException("All InputStream.Config objects must have the same format for multi resolution");
                }
            }
        }
        if (cameraDevice.t0(new z3(i15, arrayList2, outputConfigurationsB.a(), this.threads.h(), captureSessionState, this.graphConfig.getSessionTemplate(), this.graphConfig.p(), this.graphConfig.getSessionColorSpace(), null))) {
            return new y2.a.Success(outputConfigurationsB.b(), outputConfigurationsB.c());
        }
        if (k.k.f107055a.d()) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Failed to create capture session from ");
            sb5.append(cameraDevice);
            sb5.append(" for ");
            a3Var = captureSessionState;
            sb5.append(a3Var);
            sb5.append('!');
            io.sentry.android.core.c2.g("CXCP", sb5.toString());
        } else {
            a3Var = captureSessionState;
        }
        a3Var.a();
        return y2.a.C2056a.f87638a;
    }
}
