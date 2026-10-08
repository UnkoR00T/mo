package w;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import o.e1;
import v.x1;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static x1 a(CamcorderProfile camcorderProfile) {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 31) {
            e1.o("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i15 + "instead. CamcorderProfile is deprecated on API 31.");
        }
        return d.a(camcorderProfile);
    }

    public static x1 b(EncoderProfiles encoderProfiles) {
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33) {
            return c.a(encoderProfiles);
        }
        if (i15 >= 31) {
            return b.a(encoderProfiles);
        }
        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i15 + ". Version 31 or higher required.");
    }
}
