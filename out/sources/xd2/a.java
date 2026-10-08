package xd2;

import a14.y;
import ae2.h;
import ae2.i;
import ae2.j;
import bc4.k;
import bc4.n;
import bc4.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017JG\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010$J'\u0010+\u001a\u00020*2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\rH\u0007¢\u0006\u0004\b+\u0010,J\u001f\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0007¢\u0006\u0004\b2\u00103¨\u00064"}, d2 = {"Lxd2/a;", "", "<init>", "()V", "Laq0/f;", "beReportIncidentUC", "Lae2/j;", "uploadIncidentPhotosUC", "Lae2/g;", "d", "(Laq0/f;Lae2/j;)Lae2/g;", "Lxx/a;", "exifDataManager", "Lae2/a;", "a", "(Lxx/a;)Lae2/a;", "Lp04/b;", "uploadFileToCloudUC", "Laq0/b;", "beGetReportIncidentTypesUC", "Lez/a;", "currentTimeProvider", "f", "(Lp04/b;Laq0/b;Lez/a;)Lae2/j;", "Lez/e;", "dateFormatter", "Lbc4/k;", "pickPhotoFromCameraWithSizeValidationUseCase", "Luy/a;", "accelerometerManager", "Luy/e;", "gyroscopeManager", "Luy/f;", "orientationManager", "Lae2/c;", "b", "(Lez/e;Lez/a;Lbc4/k;Luy/a;Luy/e;Luy/f;Lxx/a;)Lae2/c;", "Lbc4/n;", "pickPhotoFromGalleryUseCase", "Lbc4/p;", "transformPickedImageUC", "copyExifDataForIncidentPhotoUC", "Lae2/e;", "c", "(Lbc4/n;Lbc4/p;Lae2/a;)Lae2/e;", "Li14/d;", "isGpsEnabledUseCase", "La14/y;", "requestPermissionUseCase", "Lae2/i;", "e", "(Li14/d;La14/y;)Lae2/i;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f218052a = new a();

    private a() {
    }

    public final ae2.a a(xx.a exifDataManager) {
        return new ae2.b(exifDataManager);
    }

    public final ae2.c b(ez.e dateFormatter, ez.a currentTimeProvider, k pickPhotoFromCameraWithSizeValidationUseCase, uy.a accelerometerManager, uy.e gyroscopeManager, uy.f orientationManager, xx.a exifDataManager) {
        return new ae2.d(pickPhotoFromCameraWithSizeValidationUseCase, dateFormatter, currentTimeProvider, accelerometerManager, gyroscopeManager, orientationManager, exifDataManager);
    }

    public final ae2.e c(n pickPhotoFromGalleryUseCase, p transformPickedImageUC, ae2.a copyExifDataForIncidentPhotoUC) {
        return new ae2.f(pickPhotoFromGalleryUseCase, transformPickedImageUC, copyExifDataForIncidentPhotoUC);
    }

    public final ae2.g d(aq0.f beReportIncidentUC, j uploadIncidentPhotosUC) {
        return new h(beReportIncidentUC, uploadIncidentPhotosUC);
    }

    public final i e(i14.d isGpsEnabledUseCase, y requestPermissionUseCase) {
        return new i(isGpsEnabledUseCase, requestPermissionUseCase);
    }

    public final j f(p04.b uploadFileToCloudUC, aq0.b beGetReportIncidentTypesUC, ez.a currentTimeProvider) {
        return new ae2.k(uploadFileToCloudUC, beGetReportIncidentTypesUC, currentTimeProvider);
    }
}
