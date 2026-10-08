package androidx.camera.camera2.compat.quirk;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import v.c3;
import v.d3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/camera/camera2/compat/quirk/b;", "", "<init>", "()V", "Lv/d3;", "quirkSettings", "", "Lv/c3;", "a", "(Lv/d3;)Ljava/util/List;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9208a = new b();

    private b() {
    }

    public final List<c3> a(d3 quirkSettings) {
        ArrayList arrayList = new ArrayList();
        if (quirkSettings.a(PixelJpegRSupportedQuirk.class, PixelJpegRSupportedQuirk.INSTANCE.a())) {
            arrayList.add(new PixelJpegRSupportedQuirk());
        }
        if (quirkSettings.a(CloseCameraDeviceOnCameraGraphCloseQuirk.class, CloseCameraDeviceOnCameraGraphCloseQuirk.INSTANCE.a())) {
            arrayList.add(new CloseCameraDeviceOnCameraGraphCloseQuirk());
        }
        if (quirkSettings.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.INSTANCE.a())) {
            arrayList.add(new CrashWhenTakingPhotoWithAutoFlashAEModeQuirk());
        }
        if (quirkSettings.a(ControlZoomRatioRangeAssertionErrorQuirk.class, ControlZoomRatioRangeAssertionErrorQuirk.INSTANCE.a())) {
            arrayList.add(new ControlZoomRatioRangeAssertionErrorQuirk());
        }
        if (quirkSettings.a(DisableAbortCapturesOnStopQuirk.class, DisableAbortCapturesOnStopQuirk.INSTANCE.a())) {
            arrayList.add(new DisableAbortCapturesOnStopQuirk());
        }
        if (quirkSettings.a(DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, DisableAbortCapturesOnStopWithSessionProcessorQuirk.INSTANCE.a())) {
            arrayList.add(new DisableAbortCapturesOnStopWithSessionProcessorQuirk());
        }
        if (quirkSettings.a(FlashAvailabilityBufferUnderflowQuirk.class, FlashAvailabilityBufferUnderflowQuirk.INSTANCE.a())) {
            arrayList.add(new FlashAvailabilityBufferUnderflowQuirk());
        }
        if (quirkSettings.a(ImageCapturePixelHDRPlusQuirk.class, ImageCapturePixelHDRPlusQuirk.INSTANCE.a())) {
            arrayList.add(new ImageCapturePixelHDRPlusQuirk());
        }
        if (quirkSettings.a(InvalidVideoProfilesQuirk.class, InvalidVideoProfilesQuirk.INSTANCE.k())) {
            arrayList.add(new InvalidVideoProfilesQuirk());
        }
        if (quirkSettings.a(ExcludedSupportedSizesQuirk.class, ExcludedSupportedSizesQuirk.INSTANCE.a())) {
            arrayList.add(new ExcludedSupportedSizesQuirk());
        }
        if (quirkSettings.a(ExtraCroppingQuirk.class, ExtraCroppingQuirk.INSTANCE.a())) {
            arrayList.add(new ExtraCroppingQuirk());
        }
        if (quirkSettings.a(ExtraSupportedOutputSizeQuirk.class, ExtraSupportedOutputSizeQuirk.INSTANCE.a())) {
            arrayList.add(new ExtraSupportedOutputSizeQuirk());
        }
        if (quirkSettings.a(ExtraSupportedSurfaceCombinationsQuirk.class, ExtraSupportedSurfaceCombinationsQuirk.INSTANCE.d())) {
            arrayList.add(new ExtraSupportedSurfaceCombinationsQuirk());
        }
        if (quirkSettings.a(Nexus4AndroidLTargetAspectRatioQuirk.class, Nexus4AndroidLTargetAspectRatioQuirk.INSTANCE.a())) {
            arrayList.add(new Nexus4AndroidLTargetAspectRatioQuirk());
        }
        if (quirkSettings.a(PreviewPixelHDRnetQuirk.class, PreviewPixelHDRnetQuirk.INSTANCE.a())) {
            arrayList.add(new PreviewPixelHDRnetQuirk());
        }
        if (quirkSettings.a(RepeatingStreamConstraintForVideoRecordingQuirk.class, RepeatingStreamConstraintForVideoRecordingQuirk.INSTANCE.a())) {
            arrayList.add(new RepeatingStreamConstraintForVideoRecordingQuirk());
        }
        if (quirkSettings.a(StillCaptureFlashStopRepeatingQuirk.class, StillCaptureFlashStopRepeatingQuirk.INSTANCE.a())) {
            arrayList.add(new StillCaptureFlashStopRepeatingQuirk());
        }
        if (quirkSettings.a(TorchIsClosedAfterImageCapturingQuirk.class, TorchIsClosedAfterImageCapturingQuirk.INSTANCE.a())) {
            arrayList.add(new TorchIsClosedAfterImageCapturingQuirk());
        }
        if (quirkSettings.a(SurfaceOrderQuirk.class, SurfaceOrderQuirk.INSTANCE.a())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (quirkSettings.a(CaptureSessionOnClosedNotCalledQuirk.class, CaptureSessionOnClosedNotCalledQuirk.INSTANCE.a())) {
            arrayList.add(new CaptureSessionOnClosedNotCalledQuirk());
        }
        if (quirkSettings.a(ZslDisablerQuirk.class, ZslDisablerQuirk.INSTANCE.d())) {
            arrayList.add(new ZslDisablerQuirk());
        }
        if (quirkSettings.a(SmallDisplaySizeQuirk.class, SmallDisplaySizeQuirk.INSTANCE.a())) {
            arrayList.add(new SmallDisplaySizeQuirk());
        }
        if (quirkSettings.a(PreviewUnderExposureQuirk.class, PreviewUnderExposureQuirk.c())) {
            arrayList.add(PreviewUnderExposureQuirk.f9182b);
        }
        return arrayList;
    }
}
