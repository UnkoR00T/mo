package w;

import android.media.CamcorderProfile;
import java.util.ArrayList;
import java.util.List;
import v.x1;

/* JADX INFO: loaded from: classes.dex */
class d {
    public static x1 a(CamcorderProfile camcorderProfile) {
        return x1.b.h(camcorderProfile.duration, camcorderProfile.fileFormat, b(camcorderProfile), c(camcorderProfile));
    }

    private static List<x1.a> b(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i15 = camcorderProfile.audioCodec;
        arrayList.add(x1.a.a(i15, x1.g(i15), camcorderProfile.audioBitRate, camcorderProfile.audioSampleRate, camcorderProfile.audioChannels, x1.c(camcorderProfile.audioCodec)));
        return arrayList;
    }

    private static List<x1.c> c(CamcorderProfile camcorderProfile) {
        ArrayList arrayList = new ArrayList();
        int i15 = camcorderProfile.videoCodec;
        arrayList.add(x1.c.a(i15, x1.d(i15), camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
        return arrayList;
    }
}
