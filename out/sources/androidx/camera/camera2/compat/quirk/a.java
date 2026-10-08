package androidx.camera.camera2.compat.quirk;

import a.u;
import e.c;
import h.x;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import o.e1;
import oq.k;
import oq.l;
import p071kotlin.Metadata;
import v.d3;
import v.e3;
import v.g3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u001b\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0012"}, d2 = {"Landroidx/camera/camera2/compat/quirk/a;", "", "Lh/x;", "cameraMetadata", "La/u;", "streamConfigurationMapCompat", "<init>", "(Lh/x;La/u;)V", "a", "Lh/x;", "b", "La/u;", "Lv/g3;", "c", "Loq/k;", "()Lv/g3;", "quirks", "d", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x cameraMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u streamConfigurationMapCompat;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k quirks = l.a(new er.a() { // from class: b.c
        @Override // er.a
        public final Object a() {
            return androidx.camera.camera2.compat.quirk.a.c(this.f15544a);
        }
    });

    public a(x xVar, u uVar) {
        this.cameraMetadata = xVar;
        this.streamConfigurationMapCompat = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g3 c(a aVar) {
        d3 d3VarA = e3.b().a();
        ArrayList arrayList = new ArrayList();
        x xVar = aVar.cameraMetadata;
        if (xVar == null) {
            c cVar = c.f45719a;
            if (e1.g("CXCP")) {
                c2.e(c.TRUNCATED_TAG, "Failed to enable quirks: camera metadata injection failed");
            }
            return new g3(arrayList);
        }
        if (d3VarA.a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.INSTANCE.a(xVar))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(aVar.cameraMetadata));
        }
        if (d3VarA.a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.INSTANCE.a(aVar.cameraMetadata))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (d3VarA.a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.INSTANCE.a(aVar.cameraMetadata))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (d3VarA.a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.INSTANCE.a(aVar.cameraMetadata))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(aVar.streamConfigurationMapCompat));
        }
        if (d3VarA.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.INSTANCE.b(aVar.cameraMetadata))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (d3VarA.a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.INSTANCE.a())) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (d3VarA.a(CloseCaptureSessionOnVideoQuirk.class, CloseCaptureSessionOnVideoQuirk.INSTANCE.a())) {
            arrayList.add(new CloseCaptureSessionOnVideoQuirk());
        }
        if (d3VarA.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.INSTANCE.a(aVar.cameraMetadata))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (d3VarA.a(FinalizeSessionOnCloseQuirk.class, FinalizeSessionOnCloseQuirk.INSTANCE.b())) {
            arrayList.add(new FinalizeSessionOnCloseQuirk());
        }
        if (d3VarA.a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.INSTANCE.b(aVar.cameraMetadata))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (d3VarA.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.INSTANCE.a(aVar.cameraMetadata))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (d3VarA.a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.INSTANCE.a(aVar.cameraMetadata))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (d3VarA.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.INSTANCE.b(aVar.cameraMetadata))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (d3VarA.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.INSTANCE.a(aVar.cameraMetadata))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (d3VarA.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.INSTANCE.a())) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        JpegCaptureDownsizingQuirk jpegCaptureDownsizingQuirk = JpegCaptureDownsizingQuirk.f9170b;
        if (d3VarA.a(JpegCaptureDownsizingQuirk.class, jpegCaptureDownsizingQuirk.c(aVar.cameraMetadata))) {
            arrayList.add(jpegCaptureDownsizingQuirk);
        }
        if (d3VarA.a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.INSTANCE.a(aVar.cameraMetadata))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (d3VarA.a(TextureViewIsClosedQuirk.class, TextureViewIsClosedQuirk.INSTANCE.a(aVar.cameraMetadata))) {
            arrayList.add(new TextureViewIsClosedQuirk());
        }
        if (d3VarA.a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.INSTANCE.c(aVar.cameraMetadata))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(aVar.cameraMetadata));
        }
        if (d3VarA.a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.INSTANCE.a())) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (d3VarA.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.INSTANCE.a())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (d3VarA.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.INSTANCE.a())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (d3VarA.a(QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class, QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.INSTANCE.a(aVar.cameraMetadata))) {
            arrayList.add(new QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk());
        }
        if (d3VarA.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.INSTANCE.f())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (d3VarA.a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.INSTANCE.a(aVar.cameraMetadata))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (d3VarA.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.INSTANCE.a())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        if (d3VarA.a(AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.INSTANCE.b())) {
            arrayList.add(new AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk());
        }
        if (d3VarA.a(UltraWideFlashCaptureUnderexposureQuirk.class, UltraWideFlashCaptureUnderexposureQuirk.INSTANCE.b(aVar.cameraMetadata))) {
            arrayList.add(new UltraWideFlashCaptureUnderexposureQuirk());
        }
        g3 g3Var = new g3(arrayList);
        e1.a("CameraQuirks", "camera2 CameraQuirks = " + g3.d(g3Var));
        return g3Var;
    }

    public final g3 b() {
        return (g3) this.quirks.getValue();
    }
}
