package f;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import fr.t;
import h.p;
import h.v;
import h.x;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.List;
import o.c1;
import o.e1;
import p071kotlin.Metadata;
import pq.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf/a;", "", "<init>", "()V", "Lh/p;", "cameraDevices", "", "", "availableCameraIds", "a", "(Lh/p;Ljava/util/List;)Ljava/util/List;", "cameraId", "", "b", "(Ljava/lang/String;Lh/p;)Z", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f54456a = new a();

    private a() {
    }

    public static final List<String> a(p cameraDevices, List<String> availableCameraIds) {
        ArrayList arrayList = new ArrayList();
        for (String str : availableCameraIds) {
            if (t.c(str, com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1) || t.c(str, "1")) {
                arrayList.add(str);
            } else if (b(str, cameraDevices)) {
                arrayList.add(str);
            } else {
                e.c cVar = e.c.f45719a;
                if (e1.f("CXCP")) {
                    String unused = e.c.TRUNCATED_TAG;
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(String cameraId, p cameraDevices) throws c1 {
        if (t.c(Build.FINGERPRINT, "robolectric")) {
            e.c cVar = e.c.f45719a;
            if (!e1.f("CXCP")) {
                return true;
            }
            String unused = e.c.TRUNCATED_TAG;
            return true;
        }
        try {
            x xVarH = p.h(cameraDevices, v.b(cameraId), null, 2, null);
            if (xVarH == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int[] iArr = (int[]) xVarH.J(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                return n.d0(iArr, 0);
            }
            return false;
        } catch (CameraAccessException e15) {
            e.c cVar2 = e.c.f45719a;
            if (e1.g("CXCP")) {
                c2.f(e.c.TRUNCATED_TAG, "Error while accessing metadata for cameraID: " + cameraId, e15);
            }
            throw new c1(e15);
        }
    }
}
