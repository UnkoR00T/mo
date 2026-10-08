package v;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface l3 {

    public interface a {
    }

    void a();

    default Set<Integer> b() {
        return Collections.EMPTY_SET;
    }

    default void c(a aVar) {
    }

    default Map<Integer, List<Size>> d(Size size) {
        return Collections.EMPTY_MAP;
    }

    default List<Pair<CameraCharacteristics.Key, Object>> e() {
        return Collections.EMPTY_LIST;
    }

    default Pair<Integer, Integer> f() {
        return Pair.create(0, 0);
    }

    default Range<Float> g() {
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        for (Pair<CameraCharacteristics.Key, Object> pair : e()) {
            if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) {
                return (Range) pair.second;
            }
        }
        return null;
    }

    j3 h(o.q qVar, a3 a3Var);

    default int[] i() {
        for (Pair<CameraCharacteristics.Key, Object> pair : e()) {
            if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                return (int[]) pair.second;
            }
        }
        return null;
    }
}
