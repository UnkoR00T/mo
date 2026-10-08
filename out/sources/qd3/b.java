package qd3;

import iy.c0;
import oq.p;
import p071kotlin.Metadata;
import rd3.FileNameDto;
import rd3.StoredFileDto;
import rd3.StoredMetadataDto;
import rd3.UploadedFileDto;
import sv0.VehicleCollisionFileName;
import sv0.VehicleCollisionUploadedFile;
import wx.StoredMetadata;
import wx.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0004*\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\f*\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0010*\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lwx/k;", "Lrd3/c;", "f", "(Lwx/k;)Lrd3/c;", "Lwx/l;", "Lrd3/d;", "g", "(Lwx/l;)Lrd3/d;", "c", "(Lrd3/c;)Lwx/k;", "d", "(Lrd3/d;)Lwx/l;", "Lsv0/t0;", "Lrd3/e;", "h", "(Lsv0/t0;)Lrd3/e;", "Lsv0/o0;", "Lrd3/a;", "e", "(Lsv0/o0;)Lrd3/a;", "b", "(Lrd3/e;)Lsv0/t0;", "a", "(Lrd3/a;)Lsv0/o0;", "vehiclecollision_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f166146b;

        static {
            int[] iArr = new int[rd3.b.values().length];
            try {
                iArr[rd3.b.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rd3.b.Regular.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166145a = iArr;
            int[] iArr2 = new int[StoredFileDto.a.values().length];
            try {
                iArr2[StoredFileDto.a.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StoredFileDto.a.Regular.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f166146b = iArr2;
        }
    }

    public static final VehicleCollisionFileName a(FileNameDto fileNameDto) {
        return new VehicleCollisionFileName(fileNameDto.getName(), fileNameDto.getExtension());
    }

    public static final VehicleCollisionUploadedFile b(UploadedFileDto uploadedFileDto) {
        return new VehicleCollisionUploadedFile(a(uploadedFileDto.getFileName()), ry.a.b(c0.g(uploadedFileDto.getEncryptionIV())), null);
    }

    public static final k c(StoredFileDto storedFileDto) {
        int i15 = a.f166146b[storedFileDto.getType().ordinal()];
        if (i15 == 1) {
            return new k.Image(d(storedFileDto.getMetadata()));
        }
        if (i15 == 2) {
            return new k.Regular(d(storedFileDto.getMetadata()));
        }
        throw new p();
    }

    public static final StoredMetadata d(StoredMetadataDto storedMetadataDto) {
        return new StoredMetadata(storedMetadataDto.getName(), storedMetadataDto.getExtension(), storedMetadataDto.getSizeInBytes());
    }

    public static final FileNameDto e(VehicleCollisionFileName vehicleCollisionFileName) {
        return new FileNameDto(vehicleCollisionFileName.getName(), vehicleCollisionFileName.getExtension());
    }

    public static final StoredFileDto f(k kVar) {
        StoredFileDto.a aVar;
        if (kVar instanceof k.Image) {
            aVar = StoredFileDto.a.Image;
        } else {
            if (!(kVar instanceof k.Regular)) {
                throw new p();
            }
            aVar = StoredFileDto.a.Regular;
        }
        return new StoredFileDto(aVar, g(kVar.getMetadata()));
    }

    public static final StoredMetadataDto g(StoredMetadata storedMetadata) {
        return new StoredMetadataDto(storedMetadata.getName(), storedMetadata.getExtension(), storedMetadata.getSizeInBytes());
    }

    public static final UploadedFileDto h(VehicleCollisionUploadedFile vehicleCollisionUploadedFile) {
        return new UploadedFileDto(e(vehicleCollisionUploadedFile.getFileName()), c0.e(vehicleCollisionUploadedFile.getEncryptionIV()));
    }
}
