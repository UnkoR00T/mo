package PRN;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import v.g3;
import v.w1;
import v.x1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0002\u0015\u0017B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\"\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u0006\""}, d2 = {"LPRN/b0;", "Lv/w1;", "", "cameraIdString", "Lv/g3;", "cameraQuirks", "<init>", "(Ljava/lang/String;Lv/g3;)V", "Lv/x1;", "d", "()Lv/x1;", "e", "", "quality", "f", "(I)Lv/x1;", "c", "profiles", "", "g", "(Lv/x1;)Z", "a", "(I)Z", "b", "Ljava/lang/String;", "Lv/g3;", "Z", "hasValidCameraId", "I", "cameraId", "", "Ljava/util/Map;", "mEncoderProfilesCache", "h", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b0 implements w1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String cameraIdString;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g3 cameraQuirks;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean hasValidCameraId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int cameraId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, x1> mEncoderProfilesCache = new LinkedHashMap();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LPRN/b0$a;", "", "<init>", "()V", "", "cameraId", "", "quality", "Landroid/media/EncoderProfiles;", "a", "(Ljava/lang/String;I)Landroid/media/EncoderProfiles;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f609a = new a();

        private a() {
        }

        public final EncoderProfiles a(String cameraId, int quality) {
            return CamcorderProfile.getAll(cameraId, quality);
        }
    }

    public b0(String str, g3 g3Var) {
        boolean z15;
        int i15;
        this.cameraIdString = str;
        this.cameraQuirks = g3Var;
        try {
            i15 = Integer.parseInt(str);
            z15 = true;
        } catch (NumberFormatException unused) {
            o.e1.o("EncoderProfilesProviderAdapter", "Camera id is not an integer:  " + this.cameraIdString + ", unable to create EncoderProfilesProviderAdapter.");
            z15 = false;
            i15 = -1;
        }
        this.hasValidCameraId = z15;
        this.cameraId = i15;
    }

    private final x1 c(int quality) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.cameraId, quality);
        } catch (RuntimeException e15) {
            o.e1.p("EncoderProfilesProviderAdapter", "Unable to get CamcorderProfile by quality: " + quality, e15);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return w.a.a(camcorderProfile);
        }
        return null;
    }

    private final x1 d() {
        Iterator<Integer> it = w1.f202898b.iterator();
        while (it.hasNext()) {
            x1 x1VarB = b(it.next().intValue());
            if (x1VarB != null) {
                return x1VarB;
            }
        }
        return null;
    }

    private final x1 e() {
        for (int iP = pq.v.p(w1.f202898b); -1 < iP; iP--) {
            x1 x1VarB = b(w1.f202898b.get(iP).intValue());
            if (x1VarB != null) {
                return x1VarB;
            }
        }
        return null;
    }

    private final x1 f(int quality) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles encoderProfilesA = a.f609a.a(this.cameraIdString, quality);
            if (encoderProfilesA == null) {
                return null;
            }
            if (b.g.f15546a.c(InvalidVideoProfilesQuirk.class) != null) {
                o.e1.a("EncoderProfilesProviderAdapter", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return w.a.b(encoderProfilesA);
                } catch (NullPointerException e15) {
                    o.e1.p("EncoderProfilesProviderAdapter", "Failed to create EncoderProfilesProxy, EncoderProfiles might contain invalid video profiles. Use CamcorderProfile instead.", e15);
                }
            }
        }
        return c(quality);
    }

    private final boolean g(x1 profiles) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.cameraQuirks.b(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List<x1.c> listB = profiles.b();
        if (listB.isEmpty()) {
            return true;
        }
        return camcorderProfileResolutionQuirk.e().contains(listB.get(0).k());
    }

    @Override // v.w1
    public boolean a(int quality) {
        return this.hasValidCameraId && b(quality) != null;
    }

    @Override // v.w1
    public x1 b(int quality) {
        x1 x1VarE = null;
        if (!this.hasValidCameraId || !CamcorderProfile.hasProfile(this.cameraId, quality)) {
            return null;
        }
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(quality))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(quality));
        }
        x1 x1VarF = f(quality);
        if (x1VarF != null && !g(x1VarF)) {
            if (quality == 0) {
                x1VarE = e();
            } else if (quality == 1) {
                x1VarE = d();
            }
            x1VarF = x1VarE;
        }
        this.mEncoderProfilesCache.put(Integer.valueOf(quality), x1VarF);
        return x1VarF;
    }
}
