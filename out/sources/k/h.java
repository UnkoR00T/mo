package k;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import h.ConcurrentCameraGraphs;
import h.c1;
import h.e1;
import h.k1;
import h.o1;
import h.q1;
import h.x0;
import h.y0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000f0\u000e2\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J+\u0010\u0019\u001a\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010!\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"R\u001a\u0010(\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lk/h;", "", "<init>", "()V", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "name", "", "parameters", "Loq/i0;", "c", "(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/util/Map;)V", "", "Loq/r;", "i", "(Ljava/util/Map;)Ljava/util/List;", "key", "h", "(Ljava/lang/Object;)Ljava/lang/String;", "value", "j", "", "limit", "e", "(Ljava/util/Map;I)Ljava/lang/String;", "Lh/x;", "metadata", "Lh/s$b;", "graphConfig", "Lh/s;", "cameraGraph", "d", "(Lh/x;Lh/s$b;Lh/s;)Ljava/lang/String;", "Lk/w;", "b", "Lk/w;", "g", "()Lk/w;", "systemTimeSource", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f107050a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final w systemTimeSource = new w();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t15, T t16) {
            return sq.a.e((String) ((oq.r) t15).c(), (String) ((oq.r) t16).c());
        }
    }

    private h() {
    }

    private final void c(StringBuilder builder, String name, Map<?, ? extends Object> parameters) {
        if (parameters.isEmpty()) {
            builder.append(name + ": (None)\n");
            return;
        }
        builder.append(name + '\n');
        Iterator<T> it = f107050a.i(parameters).iterator();
        while (it.hasNext()) {
            oq.r rVar = (oq.r) it.next();
            builder.append("  " + fu.r.C0((String) rVar.c(), 50, ' ') + ' ' + ((String) rVar.d()) + '\n');
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence f(oq.r rVar) {
        return ((String) rVar.c()) + '=' + ((String) rVar.d());
    }

    private final String h(Object key) {
        if (key instanceof CameraCharacteristics.Key) {
            return ((CameraCharacteristics.Key) key).getName();
        }
        if (key instanceof CaptureRequest.Key) {
            return ((CaptureRequest.Key) key).getName();
        }
        return key instanceof CaptureResult.Key ? ((CaptureResult.Key) key).getName() : String.valueOf(key);
    }

    private final List<oq.r<String, String>> i(Map<?, ? extends Object> parameters) {
        ArrayList arrayList = new ArrayList(parameters.size());
        for (Map.Entry<?, ? extends Object> entry : parameters.entrySet()) {
            h hVar = f107050a;
            arrayList.add(oq.y.a(hVar.h(entry.getKey()), hVar.j(entry.getValue())));
        }
        return pq.v.U0(arrayList, new a());
    }

    private final String j(Object value) {
        return value instanceof Object[] ? pq.n.L0((Object[]) value, null, "[", "]", 0, null, new er.l() { // from class: k.g
            @Override // er.l
            public final Object b(Object obj) {
                return h.k(obj);
            }
        }, 25, null) : String.valueOf(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence k(Object obj) {
        return f107050a.j(obj);
    }

    public final String d(h.x metadata, h.s.b graphConfig, h.s cameraGraph) {
        String str;
        ConcurrentCameraGraphs concurrentCameraGraphs = graphConfig.getConcurrentCameraGraphs();
        Set<h.v> setB = concurrentCameraGraphs != null ? concurrentCameraGraphs.b() : null;
        Integer num = (Integer) metadata.J(CameraCharacteristics.LENS_FACING);
        String str2 = "External";
        String str3 = "Unknown";
        if (num != null && num.intValue() == 0) {
            str = "Front";
        } else if (num != null && num.intValue() == 1) {
            str = "Back";
        } else {
            str = (num != null && num.intValue() == 2) ? "External" : "Unknown";
        }
        Integer num2 = (Integer) metadata.J(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num2 != null && num2.intValue() == 0) {
            str2 = "Limited";
        } else if (num2 != null && num2.intValue() == 1) {
            str2 = "Full";
        } else if (num2 != null && num2.intValue() == 2) {
            str2 = "Legacy";
        } else if (num2 != null && num2.intValue() == 3) {
            str2 = "Level 3";
        } else if (num2 == null || num2.intValue() != 4) {
            str2 = "Unknown";
        }
        int sessionMode = graphConfig.getSessionMode();
        h.s.e.Companion companion = h.s.e.INSTANCE;
        if (h.s.e.f(sessionMode, companion.c())) {
            str3 = "High Speed";
        } else if (h.s.e.f(sessionMode, companion.d())) {
            str3 = com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.P0;
        } else if (h.s.e.f(sessionMode, companion.b())) {
            str3 = "Extension";
        }
        int[] iArr = (int[]) metadata.J(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        String str4 = (iArr == null || !pq.n.d0(iArr, 11)) ? "Physical" : "Logical";
        StringBuilder sb5 = new StringBuilder();
        sb5.append(cameraGraph + " (Camera " + graphConfig.getCamera() + ")\n");
        if (setB != null) {
            sb5.append("  Concurrent: " + setB + '\n');
        }
        sb5.append("  Facing:    " + str + " (" + str4 + ", " + str2 + ")\n");
        StringBuilder sb6 = new StringBuilder();
        sb6.append("  Mode:      ");
        sb6.append(str3);
        sb6.append('\n');
        sb5.append(sb6.toString());
        sb5.append("Outputs:\n");
        Iterator<h.c0> it = cameraGraph.G().G().iterator();
        while (it.hasNext()) {
            int i15 = 0;
            for (Object obj : it.next().b()) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    pq.v.x();
                }
                e1 e1Var = (e1) obj;
                sb5.append("  ");
                sb5.append(fu.r.C0(i15 == 0 ? q1.f(e1Var.j().getId()) : "", 12, ' '));
                sb5.append(fu.r.C0(c1.f(e1Var.getId()), 12, ' '));
                sb5.append(fu.r.C0(e1Var.getSize().toString(), 12, ' '));
                sb5.append(fu.r.C0(o1.g(e1Var.getFormat()), 16, ' '));
                e1.c mirrorMode = e1Var.getMirrorMode();
                if (mirrorMode != null) {
                    sb5.append(" [" + ((Object) e1.c.g(mirrorMode.getValue())) + ']');
                }
                e1Var.c();
                e1.b dynamicRangeProfile = e1Var.getDynamicRangeProfile();
                if (dynamicRangeProfile != null) {
                    sb5.append(" [" + ((Object) e1.b.g(dynamicRangeProfile.getValue())) + ']');
                }
                e1.f streamUseCase = e1Var.getStreamUseCase();
                if (streamUseCase != null) {
                    sb5.append(" [" + ((Object) e1.f.i(streamUseCase.getValue())) + ']');
                }
                e1.g streamUseHint = e1Var.getStreamUseHint();
                if (streamUseHint != null) {
                    sb5.append(" [" + ((Object) e1.g.h(streamUseHint.getValue())) + ']');
                }
                if (!h.v.d(e1Var.getCamera(), graphConfig.getCamera())) {
                    sb5.append(" [");
                    sb5.append(h.v.a(e1Var.getCamera()));
                    sb5.append("]");
                }
                sb5.append("\n");
                i15 = i16;
            }
        }
        if (!cameraGraph.G().b().isEmpty()) {
            sb5.append("Inputs:\n");
            for (x0 x0Var : cameraGraph.G().b()) {
                sb5.append(" ");
                sb5.append(fu.r.C0(y0.b(x0Var.getId()), 12, ' '));
                sb5.append(fu.r.C0(o1.i(x0Var.getFormat()), 12, ' '));
                sb5.append(fu.r.C0(String.valueOf(x0Var.getMaxImages()), 12, ' '));
                sb5.append("\n");
            }
        }
        sb5.append("Session Template: " + k1.e(graphConfig.getSessionTemplate()) + '\n');
        h hVar = f107050a;
        hVar.c(sb5, "Session Parameters", graphConfig.p());
        sb5.append("Default Template: " + k1.e(graphConfig.getDefaultTemplate()) + '\n');
        hVar.c(sb5, "Default Parameters", graphConfig.f());
        hVar.c(sb5, "Required Parameters", graphConfig.m());
        return sb5.toString();
    }

    public final String e(Map<?, ? extends Object> parameters, int limit) {
        return pq.v.v0(i(parameters), null, "{", "}", limit, null, new er.l() { // from class: k.f
            @Override // er.l
            public final Object b(Object obj) {
                return h.f((oq.r) obj);
            }
        }, 17, null);
    }

    public final w g() {
        return systemTimeSource;
    }
}
