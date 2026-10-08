package f;

import android.hardware.camera2.CameraCharacteristics;
import fr.t;
import h.l0;
import h.p;
import h.v;
import h.x;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.c1;
import o.e1;
import o.q;
import o.s;
import p071kotlin.Metadata;
import v.m0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lf/b;", "", "a", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ;\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lf/b$a;", "", "<init>", "()V", "Lh/p;", "cameraDevices", "", "lensFacingInteger", "", "a", "(Lh/p;Ljava/lang/Integer;)Ljava/lang/String;", "Ld/a;", "cameraAppComponent", "Lo/s;", "availableCamerasSelector", "", "cameraIdList", "Lb0/m;", "streamSpecsCalculator", "b", "(Ld/a;Lo/s;Ljava/util/List;Lb0/m;)Ljava/util/List;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        private final String a(p cameraDevices, Integer lensFacingInteger) {
            if (lensFacingInteger == null) {
                return null;
            }
            try {
                if (lensFacingInteger.intValue() == 1) {
                    x xVarH = p.h(cameraDevices, v.b(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1), null, 2, null);
                    if (xVarH == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Integer num = (Integer) xVarH.J(CameraCharacteristics.LENS_FACING);
                    if (num != null && num.intValue() == 1) {
                        return "1";
                    }
                } else if (lensFacingInteger.intValue() == 0) {
                    x xVarH2 = p.h(cameraDevices, v.b("1"), null, 2, null);
                    if (xVarH2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    Integer num2 = (Integer) xVarH2.J(CameraCharacteristics.LENS_FACING);
                    if (num2 != null && num2.intValue() == 0) {
                        return com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1;
                    }
                }
            } catch (l0 unused) {
                e.c cVar = e.c.f45719a;
                if (e1.g("CXCP")) {
                    c2.e(e.c.TRUNCATED_TAG, "Received Do Not Disturb exception while deciding camera id to skip. Please turn off Do Not Disturb mode");
                }
            }
            return null;
        }

        public final List<String> b(d.a cameraAppComponent, s availableCamerasSelector, List<String> cameraIdList, b0.m streamSpecsCalculator) {
            String strA;
            try {
                ArrayList arrayList = new ArrayList();
                p pVarB = cameraAppComponent.b();
                if (availableCamerasSelector == null) {
                    return cameraIdList;
                }
                try {
                    strA = a(pVarB, availableCamerasSelector.d());
                } catch (IllegalStateException unused) {
                    e.c cVar = e.c.f45719a;
                    if (e1.f("CXCP")) {
                        String unused2 = e.c.TRUNCATED_TAG;
                    }
                    strA = null;
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : cameraIdList) {
                    if (!t.c(str, strA)) {
                        arrayList2.add(cameraAppComponent.c().b(new d.m(v.b(str), null)).a(streamSpecsCalculator).build().a().o());
                    }
                }
                Iterator<q> it = availableCamerasSelector.b(arrayList2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((m0) it.next()).i());
                }
                return arrayList;
            } catch (IllegalStateException e15) {
                e.c cVar2 = e.c.f45719a;
                if (e1.g("CXCP")) {
                    c2.f(e.c.TRUNCATED_TAG, "Error while accessing info about cameras.", e15);
                }
                throw new c1(e15);
            }
        }

        private Companion() {
        }
    }
}
