package nr0;

import gr0.DocumentDynamicSection;
import gr0.DocumentSchema;
import gr0.DocumentSchemaAttribute;
import gr0.DynamicDocumentSchemaContainer;
import gr0.DynamicDocumentVerificationSchema;
import gr0.s;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import or0.DocumentDynamicSectionDtoDto;
import or0.DocumentSchemaAttributeDtoDto;
import or0.DocumentSchemaLabelDto;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.be.offlinedocumentsservice.data.model.DynamicDocumentSchemaContainerDto;
import pl.gov.coi.mobywatel.be.offlinedocumentsservice.data.model.DynamicDocumentVerificationSchemaDto;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\b*\u00020\t¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/data/model/DynamicDocumentVerificationSchemaDto;", "Lgr0/u;", "c", "(Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/data/model/DynamicDocumentVerificationSchemaDto;)Lgr0/u;", "Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/data/model/DynamicDocumentSchemaContainerDto;", "Lgr0/t;", "b", "(Lpl/gov/coi/mobywatel/be/offlinedocumentsservice/data/model/DynamicDocumentSchemaContainerDto;)Lgr0/t;", "Lor0/q;", "Lgr0/g;", "a", "(Lor0/q;)Lgr0/g;", "d", "(Lgr0/g;)Lor0/q;", "Lgr0/s;", "Lor0/v;", "e", "(Lgr0/s;)Lor0/v;", "offlinedocumentsservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class f {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137849a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.DATE_TIME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.NUMBER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s.ENUM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s.MULTILINE_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s.UNKNOWN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f137849a = iArr;
        }
    }

    public static final DocumentDynamicSection a(DocumentDynamicSectionDtoDto documentDynamicSectionDtoDto) {
        List<String> listC = documentDynamicSectionDtoDto.c();
        if (listC == null) {
            listC = v.n();
        }
        List<String> listA = documentDynamicSectionDtoDto.a();
        List<String> listB = documentDynamicSectionDtoDto.b();
        if (listB == null) {
            listB = v.n();
        }
        return new DocumentDynamicSection(listC, listA, listB);
    }

    public static final DynamicDocumentSchemaContainer b(DynamicDocumentSchemaContainerDto dynamicDocumentSchemaContainerDto) {
        String documentId = dynamicDocumentSchemaContainerDto.getDocumentId();
        DocumentSchema documentSchemaF = d.f(dynamicDocumentSchemaContainerDto.getSchema());
        LocalDate expirationDate = dynamicDocumentSchemaContainerDto.getExpirationDate();
        return new DynamicDocumentSchemaContainer(documentId, documentSchemaF, expirationDate != null ? new fz.b.LocalDate(expirationDate) : null);
    }

    public static final DynamicDocumentVerificationSchema c(DynamicDocumentVerificationSchemaDto dynamicDocumentVerificationSchemaDto) {
        List listN;
        String schemaId = dynamicDocumentVerificationSchemaDto.getSchemaId();
        String schemaVersion = dynamicDocumentVerificationSchemaDto.getSchemaVersion();
        String documentName = dynamicDocumentVerificationSchemaDto.getDocumentName();
        List<DocumentSchemaLabelDto> title = dynamicDocumentVerificationSchemaDto.getTitle();
        ArrayList arrayList = new ArrayList(v.y(title, 10));
        Iterator<T> it = title.iterator();
        while (it.hasNext()) {
            arrayList.add(d.m((DocumentSchemaLabelDto) it.next()));
        }
        DocumentSchemaAttribute documentSchemaAttributeG = d.g(dynamicDocumentVerificationSchemaDto.getExpirationDate());
        List<DocumentSchemaAttributeDtoDto> attributes = dynamicDocumentVerificationSchemaDto.getAttributes();
        if (attributes != null) {
            List<DocumentSchemaAttributeDtoDto> list = attributes;
            listN = new ArrayList(v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                listN.add(d.g((DocumentSchemaAttributeDtoDto) it4.next()));
            }
        } else {
            listN = v.n();
        }
        return new DynamicDocumentVerificationSchema(schemaId, schemaVersion, documentName, arrayList, documentSchemaAttributeG, listN);
    }

    public static final DocumentDynamicSectionDtoDto d(DocumentDynamicSection documentDynamicSection) {
        return new DocumentDynamicSectionDtoDto(documentDynamicSection.a(), documentDynamicSection.b(), documentDynamicSection.c());
    }

    public static final or0.v e(s sVar) {
        switch (a.f137849a[sVar.ordinal()]) {
            case 1:
                return or0.v.TEXT;
            case 2:
                return or0.v.NAME;
            case 3:
                return or0.v.DATE;
            case 4:
                return or0.v.DATE_TIME;
            case 5:
                return or0.v.NUMBER;
            case 6:
                return or0.v.NOTE;
            case 7:
                return or0.v.ENUM;
            case 8:
                return or0.v.BOOLEAN;
            case 9:
                return or0.v.MULTILINE_TEXT;
            case 10:
                return or0.v.UNKNOWN;
            default:
                throw new p();
        }
    }
}
