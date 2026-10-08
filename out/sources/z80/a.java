package z80;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lt3.DocumentAndCertificateStatusResponse;
import lt3.DocumentDto;
import lt3.FeatureStatusDto;
import lt3.JuniorSettingsDto;
import lt3.SchoolCardDocumentToGenerateDto;
import lt3.StartActivationResponseDto;
import lt3.UpdateSchoolCardDocumentResponse;
import lt3.c;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import x80.BEDocumentStatus;
import x80.BEDocumentsStatusesResponse;
import x80.BEJuniorFeature;
import x80.BEJuniorSettings;
import x80.SchoolCardDocumentToGenerate;
import x80.StartActivationResponse;
import x80.UpdateSchoolCardDocument;
import x80.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Llt3/i;", "Lx80/g;", "f", "(Llt3/i;)Lx80/g;", "Llt3/a;", "Lx80/b;", "a", "(Llt3/a;)Lx80/b;", "Llt3/c;", "Lx80/e;", "d", "(Llt3/c;)Lx80/e;", "Llt3/k;", "Lx80/h;", "g", "(Llt3/k;)Lx80/h;", "Llt3/g;", "Lx80/f;", "e", "(Llt3/g;)Lx80/f;", "Llt3/f;", "Lx80/d;", "c", "(Llt3/f;)Lx80/d;", "Llt3/e;", "Lx80/c;", "b", "(Llt3/e;)Lx80/c;", "juniorservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: z80.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C6276a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f233323a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.TO_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f233323a = iArr;
        }
    }

    public static final BEDocumentsStatusesResponse a(DocumentAndCertificateStatusResponse documentAndCertificateStatusResponse) {
        List<DocumentDto> listA = documentAndCertificateStatusResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (DocumentDto documentDto : listA) {
            arrayList.add(new BEDocumentStatus(documentDto.getId(), d(documentDto.getStatus()), documentDto.getUpdateRequired()));
        }
        return new BEDocumentsStatusesResponse(arrayList);
    }

    public static final BEJuniorFeature b(FeatureStatusDto featureStatusDto) {
        return new BEJuniorFeature(featureStatusDto.getType(), featureStatusDto.getActive());
    }

    public static final BEJuniorSettings c(JuniorSettingsDto juniorSettingsDto) {
        List<FeatureStatusDto> listA = juniorSettingsDto.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(b((FeatureStatusDto) it.next()));
        }
        return new BEJuniorSettings(arrayList, juniorSettingsDto.getSchool(), juniorSettingsDto.getServerCurrentTime());
    }

    public static final e d(c cVar) {
        int i15 = C6276a.f233323a[cVar.ordinal()];
        if (i15 == 1) {
            return e.ACTIVE;
        }
        if (i15 == 2) {
            return e.INACTIVE;
        }
        if (i15 == 3) {
            return e.TO_UPDATE;
        }
        if (i15 == 4) {
            return e.INACTIVE;
        }
        throw new p();
    }

    public static final SchoolCardDocumentToGenerate e(SchoolCardDocumentToGenerateDto schoolCardDocumentToGenerateDto) {
        return new SchoolCardDocumentToGenerate(schoolCardDocumentToGenerateDto.getAsyncDownloadTerminationInterval(), schoolCardDocumentToGenerateDto.getDocumentId(), schoolCardDocumentToGenerateDto.getTaskId());
    }

    public static final StartActivationResponse f(StartActivationResponseDto startActivationResponseDto) {
        return new StartActivationResponse(startActivationResponseDto.getAuthenticationToken());
    }

    public static final UpdateSchoolCardDocument g(UpdateSchoolCardDocumentResponse updateSchoolCardDocumentResponse) {
        return new UpdateSchoolCardDocument(e(updateSchoolCardDocumentResponse.getDocumentToGenerate()));
    }
}
