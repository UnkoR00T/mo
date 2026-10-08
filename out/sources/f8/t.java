package f8;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Boolean f60034a;

    private static final class a {
        public static int a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i15, int i16, double d15) {
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
            if (supportedPerformancePoints == null || supportedPerformancePoints.isEmpty()) {
                return 0;
            }
            r.a();
            int iC = c(supportedPerformancePoints, q.a(i15, i16, (int) d15));
            if (iC == 1 && t.f60034a == null) {
                Boolean unused = t.f60034a = Boolean.valueOf(d());
                if (t.f60034a.booleanValue()) {
                    return 0;
                }
            }
            return iC;
        }

        private static int b(boolean z15) {
            MediaCodecInfo.VideoCapabilities videoCapabilities;
            List<MediaCodecInfo.VideoCapabilities.PerformancePoint> supportedPerformancePoints;
            try {
                t7.p pVarQ = new t7.p.b().A0("video/avc").Q();
                if (pVarQ.f188381p != null) {
                    List<p> listM = d0.m(y.f60076a, pVarQ, z15, false);
                    for (int i15 = 0; i15 < listM.size(); i15++) {
                        if (listM.get(i15).f60022d != null && (videoCapabilities = listM.get(i15).f60022d.getVideoCapabilities()) != null && (supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints()) != null && !supportedPerformancePoints.isEmpty()) {
                            r.a();
                            return c(supportedPerformancePoints, q.a(1280, 720, 60));
                        }
                    }
                }
            } catch (d0.c unused) {
            }
            return 0;
        }

        private static int c(List<MediaCodecInfo.VideoCapabilities.PerformancePoint> list, MediaCodecInfo.VideoCapabilities.PerformancePoint performancePoint) {
            for (int i15 = 0; i15 < list.size(); i15++) {
                if (s.a(list.get(i15)).covers(performancePoint)) {
                    return 2;
                }
            }
            return 1;
        }

        private static boolean d() {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 37) {
                return false;
            }
            int iB = b(true);
            if (i15 >= 35) {
                return iB == 1;
            }
            return b(false) != 2 || iB == 1;
        }
    }

    public static int c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i15, int i16, double d15) {
        if (Build.VERSION.SDK_INT < 29) {
            return 0;
        }
        Boolean bool = f60034a;
        if (bool == null || !bool.booleanValue()) {
            return a.a(videoCapabilities, i15, i16, d15);
        }
        return 0;
    }
}
