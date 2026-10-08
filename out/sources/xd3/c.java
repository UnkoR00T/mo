package xd3;

import o04.FileName;
import o04.FileToDownload;
import o04.UploadedFile;
import p071kotlin.Metadata;
import sv0.Download;
import sv0.Uploader;
import sv0.VehicleCollisionFileName;
import sv0.VehicleCollisionFileToDownload;
import sv0.VehicleCollisionUploadedFile;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\f*\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0014\u001a\u00020\u0013*\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lsv0/q0;", "Lo04/b$b;", "c", "(Lsv0/q0;)Lo04/b$b;", "Lsv0/p0;", "Lo04/b$a;", "b", "(Lsv0/p0;)Lo04/b$a;", "Lo04/f;", "Lsv0/t0;", "f", "(Lo04/f;)Lsv0/t0;", "Lo04/a;", "Lsv0/o0;", "e", "(Lo04/a;)Lsv0/o0;", "a", "(Lsv0/o0;)Lo04/a;", "Lsv0/r0;", "Lo04/d;", "d", "(Lsv0/r0;)Lo04/d;", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final FileName a(VehicleCollisionFileName vehicleCollisionFileName) {
        return new FileName(vehicleCollisionFileName.getName(), vehicleCollisionFileName.getExtension());
    }

    public static final o04.b.Download b(Download download) {
        return new o04.b.Download(download.getFileEncryptionKey(), download.getDomainCertificate(), null);
    }

    public static final o04.b.Uploader c(Uploader uploader) {
        return new o04.b.Uploader(uploader.getUrl(), uploader.getJwtToken(), uploader.getExpiredDate(), uploader.getFileEncryptionKey(), uploader.getDomainCertificate(), null);
    }

    public static final FileToDownload d(VehicleCollisionFileToDownload vehicleCollisionFileToDownload) {
        return new FileToDownload(vehicleCollisionFileToDownload.getUrl(), a(vehicleCollisionFileToDownload.getFileName()), vehicleCollisionFileToDownload.getFileEncryptionIV(), vehicleCollisionFileToDownload.getAccessToken(), null);
    }

    public static final VehicleCollisionFileName e(FileName fileName) {
        return new VehicleCollisionFileName(fileName.getName(), fileName.getExtension());
    }

    public static final VehicleCollisionUploadedFile f(UploadedFile uploadedFile) {
        return new VehicleCollisionUploadedFile(e(uploadedFile.getFileName()), uploadedFile.getEncryptionIV(), null);
    }
}
