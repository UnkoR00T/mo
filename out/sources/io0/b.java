package io0;

import eo0.CountryDictionary;
import eo0.EpuapApplicationType;
import eo0.ForwardDetails;
import eo0.RecipientAddress;
import eo0.SearchAddressRequest;
import eo0.SearchRequest;
import eo0.b0;
import eo0.r0;
import eo0.v0;
import eo0.y;
import iy.c0;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo0.AdditionalInformationDtoDto;
import jo0.AddressRequestDtoDto;
import jo0.ApplicationTypeDtoDto;
import jo0.BaeSearchRequestDto;
import jo0.CountryDtoDto;
import jo0.DocumentBodyDtoDto;
import jo0.DocumentDataDtoDto;
import jo0.DocumentDescriptionDtoDto;
import jo0.EpuapAttachmentDtoDto;
import jo0.EpuapSendMessageRequestDto;
import jo0.ForwardDetailsDtoDto;
import jo0.InstitutionAddressDtoDto;
import jo0.InstitutionDtoDto;
import jo0.OfficialIdDto;
import jo0.PersonDtoDto;
import jo0.k;
import jo0.o1;
import jo0.r1;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0011\u001a\u00020\u0010*\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001d\u001a\u00020\u001c*\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Leo0/w0;", "", "pageId", "Ljo0/r;", "d", "(Leo0/w0;Ljava/lang/String;)Ljo0/r;", "Leo0/v0;", "", "Ljo0/r1;", "b", "(Leo0/v0;)Ljava/util/List;", "Leo0/s0;", "Ljo0/f;", "a", "(Leo0/s0;)Ljava/util/List;", "Leo0/r0;", "Ljo0/c1;", "g", "(Leo0/r0;)Ljo0/c1;", "Leo0/l;", "Ljo0/w;", "e", "(Leo0/l;)Ljo0/w;", "Leo0/b0;", "Ljo0/q0;", "f", "(Leo0/b0;)Ljo0/q0;", "Leo0/a0;", "Ljo0/k;", "c", "(Leo0/a0;)Ljo0/k;", "electronicdeliveryservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f96028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f96029b;

        static {
            int[] iArr = new int[v0.values().length];
            try {
                iArr[v0.PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v0.BAILIFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f96028a = iArr;
            int[] iArr2 = new int[EpuapApplicationType.a.values().length];
            try {
                iArr2[EpuapApplicationType.a.APPLICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[EpuapApplicationType.a.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EpuapApplicationType.a.COMPLAINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EpuapApplicationType.a.APPEAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EpuapApplicationType.a.CLAIM.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EpuapApplicationType.a.INFORMATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EpuapApplicationType.a.NOTIFICATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EpuapApplicationType.a.OPINION.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EpuapApplicationType.a.DECISION.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EpuapApplicationType.a.RESOLUTION.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[EpuapApplicationType.a.CALL.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[EpuapApplicationType.a.CERTIFICATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[EpuapApplicationType.a.OTHER.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[EpuapApplicationType.a.UNKNOWN.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            f96029b = iArr2;
        }
    }

    public static final List<AddressRequestDtoDto> a(SearchAddressRequest searchAddressRequest) {
        String buildingNumber = searchAddressRequest.getBuildingNumber();
        String flatNumber = searchAddressRequest.getFlatNumber();
        String city = searchAddressRequest.getCity();
        String countryCode = searchAddressRequest.getCountryCode();
        String postalCode = searchAddressRequest.getPostalCode();
        String street = searchAddressRequest.getStreet();
        CountryDictionary country = searchAddressRequest.getCountry();
        return v.e(new AddressRequestDtoDto(null, buildingNumber, city, country != null ? e(country) : null, countryCode, flatNumber, postalCode, street, 1, null));
    }

    public static final List<r1> b(v0 v0Var) {
        int i15 = a.f96028a[v0Var.ordinal()];
        if (i15 == 1) {
            return v.q(r1.COMPANY, r1.ORGANISATION, r1.PUBLIC_INSTITUTION);
        }
        if (i15 == 2) {
            return v.e(r1.COURT_ENFORCEMENT_OFFICER);
        }
        throw new p();
    }

    public static final k c(EpuapApplicationType epuapApplicationType) throws ParseException {
        EpuapApplicationType.a code = epuapApplicationType != null ? epuapApplicationType.getCode() : null;
        switch (code == null ? -1 : a.f96029b[code.ordinal()]) {
            case -1:
            case 14:
                throw new ParseException("ApplicationType is unknown", 0);
            case 0:
            default:
                throw new p();
            case 1:
                return k.APPLICATION;
            case 2:
                return k.REQUEST;
            case 3:
                return k.COMPLAINT;
            case 4:
                return k.APPEAL;
            case 5:
                return k.CLAIM;
            case 6:
                return k.INFORMATION;
            case 7:
                return k.NOTIFICATION;
            case 8:
                return k.OPINION;
            case 9:
                return k.DECISION;
            case 10:
                return k.RESOLUTION;
            case 11:
                return k.CALL;
            case 12:
                return k.CERTIFICATE;
            case 13:
                return k.OTHER;
        }
    }

    public static final BaeSearchRequestDto d(SearchRequest searchRequest, String str) {
        List<r1> listB = b(searchRequest.getCategory());
        SearchAddressRequest address = searchRequest.getAddress();
        ArrayList arrayList = null;
        List<AddressRequestDtoDto> listA = address != null ? a(address) : null;
        String entityName = searchRequest.getEntityName();
        String name = searchRequest.getName();
        String surname = searchRequest.getSurname();
        List<r0> listE = searchRequest.e();
        if (listE != null) {
            List<r0> list = listE;
            arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((r0) it.next()));
            }
        }
        return new BaeSearchRequestDto(listB, listA, entityName, name, arrayList, str, surname);
    }

    public static final CountryDtoDto e(CountryDictionary countryDictionary) {
        return new CountryDtoDto(countryDictionary.getCountryCode(), countryDictionary.getName(), countryDictionary.getName());
    }

    public static final EpuapSendMessageRequestDto f(b0 b0Var) {
        ApplicationTypeDtoDto applicationTypeDtoDto = new ApplicationTypeDtoDto(c(b0Var.getDocumentBody().getEpuapApplicationType()), b0Var.getDocumentBody().getApplicationName());
        String title = b0Var.getDocumentBody().getTitle();
        b0.AddressData addressData = b0Var.getDocumentBody().getAddressData();
        ForwardDetailsDtoDto forwardDetailsDtoDto = null;
        AdditionalInformationDtoDto additionalInformationDtoDto = addressData != null ? new AdditionalInformationDtoDto(addressData.getBuildingNumber(), addressData.getCity(), addressData.getCommunity(), addressData.getCounty(), addressData.getPostalCode(), addressData.getProvince(), addressData.getApartmentNumber(), addressData.getStreet()) : null;
        List<b0.Attachment> listC = b0Var.getDocumentBody().c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        for (b0.Attachment attachment : listC) {
            arrayList.add(new EpuapAttachmentDtoDto(attachment.getId(), attachment.getFileName()));
        }
        DocumentBodyDtoDto documentBodyDtoDto = new DocumentBodyDtoDto(applicationTypeDtoDto, title, additionalInformationDtoDto, arrayList, b0Var.getDocumentBody().getText());
        String fullName = b0Var.getDocumentData().getTo().getFullName();
        RecipientAddress address = b0Var.getDocumentData().getTo().getAddress();
        DocumentDataDtoDto documentDataDtoDto = new DocumentDataDtoDto(new InstitutionDtoDto(fullName, address != null ? new InstitutionAddressDtoDto(address.getBuildingNumber(), address.getLocality(), address.getFlatNumber(), address.getPostalCode(), address.getStreet()) : new InstitutionAddressDtoDto(null, null, null, null, null, 31, null)), new PersonDtoDto(c0.e(b0Var.getDocumentData().getFrom().getEmail()), c0.e(b0Var.getDocumentData().getFrom().getPhone())));
        String correlationId = b0Var.getCorrelationId();
        if (correlationId == null) {
            correlationId = null;
        }
        DocumentDescriptionDtoDto documentDescriptionDtoDto = new DocumentDescriptionDtoDto(correlationId, null, 2, null);
        String mailboxAddress = b0Var.getMailboxAddress();
        ForwardDetails forwardDetails = b0Var.getForwardDetails();
        if (forwardDetails != null) {
            List<y> listA = forwardDetails.a();
            ArrayList arrayList2 = new ArrayList(v.y(listA, 10));
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                arrayList2.add(((y) it.next()).getValue());
            }
            forwardDetailsDtoDto = new ForwardDetailsDtoDto(arrayList2, forwardDetails.getDirectoryId(), forwardDetails.getMessageId());
        }
        return new EpuapSendMessageRequestDto(documentBodyDtoDto, mailboxAddress, documentDataDtoDto, documentDescriptionDtoDto, forwardDetailsDtoDto);
    }

    public static final OfficialIdDto g(r0 r0Var) {
        o1 o1Var;
        String registryId = r0Var.getRegistryId();
        if (r0Var instanceof r0.Pesel) {
            o1Var = o1.PESEL;
        } else if (r0Var instanceof r0.Regon) {
            o1Var = o1.REGON;
        } else if (r0Var instanceof r0.Krs) {
            o1Var = o1.KRS;
        } else if (r0Var instanceof r0.Nip) {
            o1Var = o1.NIP;
        } else if (r0Var instanceof r0.Ue) {
            o1Var = o1.UE;
        } else if (r0Var instanceof r0.KppId) {
            o1Var = o1.KPP_ID;
        } else {
            if (!(r0Var instanceof r0.Unknown)) {
                throw new p();
            }
            o1Var = o1.UNKNOWN;
        }
        return new OfficialIdDto(registryId, o1Var);
    }
}
