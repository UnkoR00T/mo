package yu0;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import cv0.BEApplicant;
import cv0.BEContact;
import cv0.BECountry;
import cv0.BECountryDetails;
import cv0.BEPersonalData;
import cv0.BEPhoneContactDetails;
import cv0.BEPlace;
import cv0.BEProfile;
import cv0.BEStage;
import cv0.BESubProfile;
import cv0.BESubscriptionConfig;
import cv0.BETravel;
import cv0.BETravelRequestModel;
import cv0.BEWarning;
import cv0.BEWarningLevel;
import cv0.c;
import cv0.j;
import cv0.q;
import cv0.t;
import dx.b;
import ex.d;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import lr.m;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import vy.Coordinates;
import xw.g;
import zu0.AdministrativeAreaDto;
import zu0.ApplicantDto;
import zu0.ContactDto;
import zu0.ContactInfoDto;
import zu0.CoordinatesDto;
import zu0.CountryDetailsResponse;
import zu0.CountryDto;
import zu0.GoogleMapsIdentifierDto;
import zu0.PhoneContactDetailsDto;
import zu0.ProfileDto;
import zu0.SubProfileDto;
import zu0.SubscriptionConfigDto;
import zu0.TravelDataDto;
import zu0.TravelDto;
import zu0.TravelInitResponse;
import zu0.TravelListDto;
import zu0.TravelPlaceDetailsDto;
import zu0.TravelRequest;
import zu0.TravelRequestApplicantDto;
import zu0.TravelStageDto;
import zu0.TravellerDto;
import zu0.TravelsV2Response;
import zu0.WarningDto;
import zu0.WarningLevelDto;
import zu0.e;
import zu0.e0;
import zu0.f;
import zu0.f0;
import zu0.n;
import zu0.z;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000È\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011*\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001b0\u0011*\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001f\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001f0\u0011*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\u001a\u0015\u0010$\u001a\u0004\u0018\u00010#*\u00020\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010(\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0013\u0010,\u001a\u00020+*\u00020*H\u0002¢\u0006\u0004\b,\u0010-\u001a\u0013\u00100\u001a\u00020/*\u00020.H\u0002¢\u0006\u0004\b0\u00101\u001a\u0013\u00104\u001a\u000203*\u000202H\u0002¢\u0006\u0004\b4\u00105\u001a\u0013\u00108\u001a\u000207*\u000206H\u0002¢\u0006\u0004\b8\u00109\u001a\u0011\u0010<\u001a\u00020;*\u00020:¢\u0006\u0004\b<\u0010=\u001a\u0013\u0010@\u001a\u00020?*\u00020>H\u0002¢\u0006\u0004\b@\u0010A\u001a\u0013\u0010D\u001a\u00020C*\u00020BH\u0002¢\u0006\u0004\bD\u0010E\u001a\u0013\u0010H\u001a\u00020G*\u00020FH\u0002¢\u0006\u0004\bH\u0010I\u001a\u0015\u0010L\u001a\u00020K*\u0004\u0018\u00010JH\u0002¢\u0006\u0004\bL\u0010M\u001a\u0013\u0010P\u001a\u00020O*\u00020NH\u0002¢\u0006\u0004\bP\u0010Q\u001a\u0013\u0010T\u001a\u00020S*\u00020RH\u0002¢\u0006\u0004\bT\u0010U\u001a\u0013\u0010W\u001a\u00020V*\u00020\u0001H\u0002¢\u0006\u0004\bW\u0010X\u001a\u0013\u0010[\u001a\u00020Z*\u00020YH\u0002¢\u0006\u0004\b[\u0010\\\u001a#\u0010b\u001a\u0014\u0012\u0004\u0012\u00020_\u0012\n\u0012\b\u0012\u0004\u0012\u00020a0`0^*\u00020]¢\u0006\u0004\bb\u0010c\u001a9\u0010f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010^\"\u0004\b\u0000\u0010d\"\u0004\b\u0001\u0010e*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u00010^H\u0002¢\u0006\u0004\bf\u0010g\u001a\u0015\u0010i\u001a\u0004\u0018\u00010_*\u00020hH\u0002¢\u0006\u0004\bi\u0010j\u001a\u0013\u0010l\u001a\u00020a*\u00020kH\u0002¢\u0006\u0004\bl\u0010m\u001a\u0013\u0010n\u001a\u00020Y*\u00020ZH\u0002¢\u0006\u0004\bn\u0010o\u001a\u0013\u0010q\u001a\u00020>*\u00020pH\u0002¢\u0006\u0004\bq\u0010r\u001a\u0013\u0010s\u001a\u00020B*\u00020CH\u0002¢\u0006\u0004\bs\u0010t\u001a\u0013\u0010u\u001a\u00020F*\u00020GH\u0002¢\u0006\u0004\bu\u0010v\u001a\u0013\u0010w\u001a\u00020J*\u00020KH\u0002¢\u0006\u0004\bw\u0010x\u001a\u0013\u0010y\u001a\u00020N*\u00020OH\u0002¢\u0006\u0004\by\u0010z\u001a\u0013\u0010{\u001a\u00020\u0001*\u00020VH\u0002¢\u0006\u0004\b{\u0010|¨\u0006}"}, d2 = {"Lzu0/s;", "Lcv0/f;", "g", "(Lzu0/s;)Lcv0/f;", "Lzu0/e0;", "Lcv0/s$a;", "s", "(Lzu0/e0;)Lcv0/s$a;", "Lzu0/d0;", "Lcv0/s;", "t", "(Lzu0/d0;)Lcv0/s;", "Lzu0/i;", "Lcv0/d;", "f", "(Lzu0/i;)Lcv0/d;", "Lzu0/f0;", "Ldx/i;", "Ldx/b;", "Lcv0/t;", "w", "(Lzu0/f0;)Ldx/i;", "Lzu0/p;", "Lcv0/m;", "p", "(Lzu0/p;)Lcv0/m;", "Lzu0/h;", "Lcv0/e;", "u", "(Lzu0/h;)Ldx/i;", "Lzu0/c0;", "Lcv0/r;", "v", "(Lzu0/c0;)Ldx/i;", "Lzu0/e;", "Lcv0/c;", "e", "(Lzu0/e;)Lcv0/c;", "Lzu0/c;", "Lcv0/b;", "d", "(Lzu0/c;)Lcv0/b;", "Lzu0/f;", "Lcv0/b$a;", "c", "(Lzu0/f;)Lcv0/b$a;", "Lzu0/m;", "Lcv0/i;", "l", "(Lzu0/m;)Lcv0/i;", "Lzu0/n;", "Lcv0/j;", "m", "(Lzu0/n;)Lcv0/j;", "Lzu0/o;", "Lcv0/l;", "o", "(Lzu0/o;)Lcv0/l;", "Lcv0/o;", "Lzu0/v;", "E", "(Lcv0/o;)Lzu0/v;", "Lcv0/a;", "Lzu0/w;", "F", "(Lcv0/a;)Lzu0/w;", "Lcv0/k;", "Lzu0/x;", "G", "(Lcv0/k;)Lzu0/x;", "Lcv0/h;", "Lzu0/u;", ip.a.f96138c, "(Lcv0/h;)Lzu0/u;", "Lcv0/h$a;", "Lzu0/a;", "z", "(Lcv0/h$a;)Lzu0/a;", "Lvy/c;", "Lzu0/g;", "A", "(Lvy/c;)Lzu0/g;", "Lcv0/h$b;", "Lzu0/k;", "B", "(Lcv0/h$b;)Lzu0/k;", "Lzu0/a0;", i.f37087n, "(Lcv0/f;)Lzu0/a0;", "Lcv0/g;", "Lzu0/l;", "C", "(Lcv0/g;)Lzu0/l;", "Lzu0/b0;", "", "Lcv0/p;", "", "Lcv0/n;", "x", "(Lzu0/b0;)Ljava/util/Map;", "K", "V", "a", "(Ljava/util/Map;)Ljava/util/Map;", "Lzu0/z;", "r", "(Lzu0/z;)Lcv0/p;", "Lzu0/q;", "q", "(Lzu0/q;)Lcv0/n;", "i", "(Lzu0/l;)Lcv0/g;", "Lzu0/b;", "b", "(Lzu0/b;)Lcv0/a;", "n", "(Lzu0/x;)Lcv0/k;", "k", "(Lzu0/u;)Lcv0/h;", "j", "(Lzu0/a;)Lcv0/h$a;", "y", "(Lzu0/g;)Lvy/c;", "h", "(Lzu0/a0;)Lcv0/f;", "travelabroadservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: yu0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C6163a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f229542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f229543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f229544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f229545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f229546e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f229547f;

        static {
            int[] iArr = new int[e0.values().length];
            try {
                iArr[e0.LEVEL_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.LEVEL_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.LEVEL_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.LEVEL_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f229542a = iArr;
            int[] iArr2 = new int[f0.values().length];
            try {
                iArr2[f0.COUNTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[f0.REGION.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[f0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            f229543b = iArr2;
            int[] iArr3 = new int[e.values().length];
            try {
                iArr3[e.FACILITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[e.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[e.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            f229544c = iArr3;
            int[] iArr4 = new int[f.values().length];
            try {
                iArr4[f.LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[f.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[f.PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[f.URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[f.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[f.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            f229545d = iArr4;
            int[] iArr5 = new int[n.values().length];
            try {
                iArr5[n.SAFETY.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[n.TRAVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[n.HEALTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[n.LAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr5[n.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[n.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            f229546e = iArr5;
            int[] iArr6 = new int[z.values().length];
            try {
                iArr6[z.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[z.PLANNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr6[z.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr6[z.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused27) {
            }
            f229547f = iArr6;
        }
    }

    private static final CoordinatesDto A(Coordinates coordinates) {
        return new CoordinatesDto(coordinates.getLatitude(), coordinates.getLongitude());
    }

    private static final GoogleMapsIdentifierDto B(BEPlace.Identifiers identifiers) {
        return new GoogleMapsIdentifierDto(identifiers.getPlaceIdAdministrativeDivision1(), identifiers.getPlaceIdAdministrativeDivision2(), identifiers.getPlaceIdCity(), identifiers.getPlaceIdCountry());
    }

    private static final PhoneContactDetailsDto C(BEPhoneContactDetails bEPhoneContactDetails) {
        return new PhoneContactDetailsDto(bEPhoneContactDetails.getPhoneNumber(), bEPhoneContactDetails.getPrefix());
    }

    private static final TravelPlaceDetailsDto D(BEPlace bEPlace) {
        AdministrativeAreaDto administrativeAreaDtoZ = z(bEPlace.getAdministrativeDivisions());
        CoordinatesDto coordinatesDtoA = A(bEPlace.getCoordinates());
        String countryIso = bEPlace.getCountryIso();
        String fullAddress = bEPlace.getFullAddress();
        String countryName = bEPlace.getCountryName();
        BEPlace.Identifiers identifiers = bEPlace.getIdentifiers();
        GoogleMapsIdentifierDto googleMapsIdentifierDtoB = identifiers != null ? B(identifiers) : null;
        BEPlace.Identifiers identifiers2 = bEPlace.getIdentifiers();
        return new TravelPlaceDetailsDto(coordinatesDtoA, administrativeAreaDtoZ, countryIso, countryName, fullAddress, googleMapsIdentifierDtoB, identifiers2 != null ? identifiers2.getPlaceId() : null);
    }

    public static final TravelRequest E(BETravelRequestModel bETravelRequestModel) {
        TravelRequestApplicantDto travelRequestApplicantDtoF = F(bETravelRequestModel.getApplicant());
        List<BEStage> listC = bETravelRequestModel.c();
        ArrayList arrayList = new ArrayList(v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(G((BEStage) it.next()));
        }
        List<BEPersonalData> listB = bETravelRequestModel.b();
        ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList2.add(H((BEPersonalData) it4.next()));
        }
        return new TravelRequest(travelRequestApplicantDtoF, new TravelDto(arrayList, arrayList2));
    }

    private static final TravelRequestApplicantDto F(BEApplicant bEApplicant) {
        boolean isParticipant = bEApplicant.getIsParticipant();
        String email = bEApplicant.getEmail();
        BEPhoneContactDetails phone = bEApplicant.getPhone();
        return new TravelRequestApplicantDto(isParticipant, email, phone != null ? C(phone) : null);
    }

    private static final TravelStageDto G(BEStage bEStage) {
        return new TravelStageDto(bEStage.getDateRange().getEnd(), D(bEStage.getPlace()), bEStage.getDateRange().getStart());
    }

    private static final TravellerDto H(BEPersonalData bEPersonalData) {
        return new TravellerDto(bEPersonalData.getSurname(), bEPersonalData.getFirstName(), c0.e(bEPersonalData.getPesel()));
    }

    private static final <K, V> Map<K, V> a(Map<K, ? extends V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, ? extends V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    private static final BEApplicant b(ApplicantDto applicantDto) {
        String name = applicantDto.getName();
        String lastName = applicantDto.getLastName();
        b0 b0VarC = g.c(c0.g(applicantDto.getPesel()));
        boolean isParticipant = applicantDto.getIsParticipant();
        String email = applicantDto.getEmail();
        PhoneContactDetailsDto phone = applicantDto.getPhone();
        return new BEApplicant(name, lastName, b0VarC, isParticipant, email, phone != null ? i(phone) : null, null);
    }

    private static final BEContact.a c(f fVar) {
        switch (C6163a.f229545d[fVar.ordinal()]) {
            case 1:
                return BEContact.a.LOCATION;
            case 2:
                return BEContact.a.EMAIL;
            case 3:
                return BEContact.a.PHONE;
            case 4:
                return BEContact.a.URL;
            case 5:
            case 6:
                return BEContact.a.OTHER;
            default:
                throw new p();
        }
    }

    private static final BEContact d(ContactDto contactDto) {
        ContactInfoDto contactInfo = contactDto.getContactInfo();
        return new BEContact(contactInfo.getName(), contactInfo.getValue(), c(contactInfo.getValueType()));
    }

    private static final c e(e eVar) {
        int i15 = C6163a.f229544c[eVar.ordinal()];
        if (i15 == 1) {
            return c.FACILITY;
        }
        if (i15 == 2) {
            return c.CONTACT;
        }
        if (i15 == 3) {
            return null;
        }
        throw new p();
    }

    public static final BECountry f(CountryDto countryDto) {
        return new BECountry(countryDto.getIsoCode(), countryDto.getName(), countryDto.getSubscribed(), t(countryDto.getWarningLevel()));
    }

    public static final BEPersonalData g(TravelInitResponse travelInitResponse) {
        return new BEPersonalData(travelInitResponse.getFirstName(), g.c(c0.g(travelInitResponse.getPesel())), travelInitResponse.getSurname(), null);
    }

    private static final BEPersonalData h(TravellerDto travellerDto) {
        return new BEPersonalData(travellerDto.getName(), g.c(c0.g(travellerDto.getPesel())), travellerDto.getLastName(), null);
    }

    private static final BEPhoneContactDetails i(PhoneContactDetailsDto phoneContactDetailsDto) {
        return new BEPhoneContactDetails(phoneContactDetailsDto.getPhoneNumber(), phoneContactDetailsDto.getPrefix());
    }

    private static final BEPlace.AdministrationDivision j(AdministrativeAreaDto administrativeAreaDto) {
        return new BEPlace.AdministrationDivision(administrativeAreaDto.getAdministrativeDivision1(), administrativeAreaDto.getAdministrativeDivision2());
    }

    private static final BEPlace k(TravelPlaceDetailsDto travelPlaceDetailsDto) {
        AdministrativeAreaDto administrativeDivision = travelPlaceDetailsDto.getAdministrativeDivision();
        BEPlace.AdministrationDivision administrationDivisionJ = administrativeDivision != null ? j(administrativeDivision) : null;
        Coordinates coordinatesY = y(travelPlaceDetailsDto.getCoordinates());
        String countryIso = travelPlaceDetailsDto.getCountryIso();
        String fullAddress = travelPlaceDetailsDto.getFullAddress();
        String countryName = travelPlaceDetailsDto.getCountryName();
        String placeId = travelPlaceDetailsDto.getPlaceId();
        GoogleMapsIdentifierDto googleMapsIdentifier = travelPlaceDetailsDto.getGoogleMapsIdentifier();
        String placeIdAdministrativeDivision1 = googleMapsIdentifier != null ? googleMapsIdentifier.getPlaceIdAdministrativeDivision1() : null;
        GoogleMapsIdentifierDto googleMapsIdentifier2 = travelPlaceDetailsDto.getGoogleMapsIdentifier();
        String placeIdAdministrativeDivision2 = googleMapsIdentifier2 != null ? googleMapsIdentifier2.getPlaceIdAdministrativeDivision2() : null;
        GoogleMapsIdentifierDto googleMapsIdentifier3 = travelPlaceDetailsDto.getGoogleMapsIdentifier();
        String placeIdCity = googleMapsIdentifier3 != null ? googleMapsIdentifier3.getPlaceIdCity() : null;
        GoogleMapsIdentifierDto googleMapsIdentifier4 = travelPlaceDetailsDto.getGoogleMapsIdentifier();
        return new BEPlace(administrationDivisionJ, coordinatesY, countryIso, fullAddress, countryName, new BEPlace.Identifiers(placeId, placeIdAdministrativeDivision1, placeIdAdministrativeDivision2, placeIdCity, googleMapsIdentifier4 != null ? googleMapsIdentifier4.getPlaceIdCountry() : null));
    }

    private static final BEProfile l(ProfileDto profileDto) {
        String title = profileDto.getTitle();
        j jVarM = m(profileDto.getType());
        String content = profileDto.getContent();
        List<SubProfileDto> listB = profileDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(o((SubProfileDto) it.next()));
        }
        return new BEProfile(title, jVarM, content, arrayList, profileDto.getSummary());
    }

    private static final j m(n nVar) {
        switch (C6163a.f229546e[nVar.ordinal()]) {
            case 1:
                return j.SAFETY;
            case 2:
                return j.TRAVEL;
            case 3:
                return j.HEALTH;
            case 4:
                return j.LAW;
            case 5:
            case 6:
                return j.OTHER;
            default:
                throw new p();
        }
    }

    private static final BEStage n(TravelStageDto travelStageDto) {
        return new BEStage(new fz.e.LocalDate(travelStageDto.getStartDate(), travelStageDto.getEndDate()), k(travelStageDto.getPlaceDetails()));
    }

    private static final BESubProfile o(SubProfileDto subProfileDto) {
        return new BESubProfile(subProfileDto.getTitle(), subProfileDto.getDescription());
    }

    private static final BESubscriptionConfig p(SubscriptionConfigDto subscriptionConfigDto) {
        return new BESubscriptionConfig(subscriptionConfigDto.getExpiryMonths(), subscriptionConfigDto.getMaxCount());
    }

    private static final BETravel q(TravelDataDto travelDataDto) {
        List listN;
        String strA = q.a(travelDataDto.getUuid());
        BEApplicant bEApplicantB = b(travelDataDto.getApplicant());
        String destination = travelDataDto.getDestination();
        fz.e.LocalDate localDate = new fz.e.LocalDate(travelDataDto.getTravelTime().getStartDate(), travelDataDto.getTravelTime().getEndDate());
        List<TravelStageDto> listB = travelDataDto.getTravelData().b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(n((TravelStageDto) it.next()));
        }
        List<TravellerDto> listA = travelDataDto.getTravelData().a();
        if (listA != null) {
            List<TravellerDto> list = listA;
            listN = new ArrayList(v.y(list, 10));
            Iterator<T> it4 = list.iterator();
            while (it4.hasNext()) {
                listN.add(h((TravellerDto) it4.next()));
            }
        } else {
            listN = null;
        }
        if (listN == null) {
            listN = v.n();
        }
        return new BETravel(strA, bEApplicantB, destination, localDate, arrayList, listN, null);
    }

    private static final cv0.p r(z zVar) {
        int i15 = C6163a.f229547f[zVar.ordinal()];
        if (i15 == 1) {
            return cv0.p.STARTED;
        }
        if (i15 == 2) {
            return cv0.p.PLANNED;
        }
        if (i15 == 3) {
            return cv0.p.FINISHED;
        }
        if (i15 == 4) {
            return null;
        }
        throw new p();
    }

    public static final BEWarningLevel.a s(e0 e0Var) {
        int i15 = C6163a.f229542a[e0Var.ordinal()];
        if (i15 == 1) {
            return BEWarningLevel.a.LEVEL_1;
        }
        if (i15 == 2) {
            return BEWarningLevel.a.LEVEL_2;
        }
        if (i15 == 3) {
            return BEWarningLevel.a.LEVEL_3;
        }
        if (i15 == 4) {
            return BEWarningLevel.a.LEVEL_4;
        }
        if (i15 == 5) {
            return BEWarningLevel.a.UNKNOWN;
        }
        throw new p();
    }

    public static final BEWarningLevel t(WarningLevelDto warningLevelDto) {
        return new BEWarningLevel(warningLevelDto.getDescription(), s(warningLevelDto.getType()));
    }

    public static final dx.i<b, BECountryDetails> u(CountryDetailsResponse countryDetailsResponse) {
        Object objB;
        dx.j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BESubscriptionConfig bESubscriptionConfigP = p(countryDetailsResponse.getConfig());
                    String isoCode = countryDetailsResponse.getIsoCode();
                    String name = countryDetailsResponse.getName();
                    List<WarningDto> listI = countryDetailsResponse.i();
                    ArrayList arrayList = new ArrayList(v.y(listI, 10));
                    Iterator<T> it = listI.iterator();
                    while (it.hasNext()) {
                        arrayList.add((BEWarning) aVar.a(v((WarningDto) it.next())));
                    }
                    String flag = countryDetailsResponse.getFlag();
                    String map = countryDetailsResponse.getMap();
                    LocalDate updatedDate = countryDetailsResponse.getUpdatedDate();
                    List<ContactDto> listB = countryDetailsResponse.b();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Object obj : listB) {
                        c cVarE = e(((ContactDto) obj).getType());
                        Object arrayList2 = linkedHashMap.get(cVarE);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            linkedHashMap.put(cVarE, arrayList2);
                        }
                        ((List) arrayList2).add(d((ContactDto) obj));
                    }
                    Map mapA = a(linkedHashMap);
                    List<ProfileDto> listG = countryDetailsResponse.g();
                    ArrayList arrayList3 = new ArrayList(v.y(listG, 10));
                    Iterator<T> it4 = listG.iterator();
                    while (it4.hasNext()) {
                        arrayList3.add(l((ProfileDto) it4.next()));
                    }
                    return new dx.i.Right(new BECountryDetails(bESubscriptionConfigP, isoCode, name, arrayList, flag, map, updatedDate, mapA, arrayList3));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private static final dx.i<b, BEWarning> v(WarningDto warningDto) {
        Object objB;
        dx.j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    return new dx.i.Right(new BEWarning((t) new ex.a().a(w(warningDto.getType())), warningDto.getDescription(), t(warningDto.getWarningLevel())));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final dx.i<b, t> w(f0 f0Var) {
        Object objB;
        t tVar;
        dx.j<b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = C6163a.f229543b[f0Var.ordinal()];
                    if (i15 == 1) {
                        tVar = t.COUNTRY;
                    } else {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            aVar.b(new b.Generic(new IllegalStateException("WarningTypeDto is UNKNOWN")));
                            throw new oq.g();
                        }
                        tVar = t.REGION;
                    }
                    return new dx.i.Right(tVar);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    public static final Map<cv0.p, List<BETravel>> x(TravelsV2Response travelsV2Response) {
        Map<cv0.p, List<BETravel>> mapA;
        List<TravelListDto> listA = travelsV2Response.a();
        if (listA != null) {
            List<TravelListDto> list = listA;
            LinkedHashMap linkedHashMap = new LinkedHashMap(m.e(v0.e(v.y(list, 10)), 16));
            for (TravelListDto travelListDto : list) {
                cv0.p pVarR = r(travelListDto.getType());
                List<TravelDataDto> listA2 = travelListDto.a();
                ArrayList arrayList = new ArrayList(v.y(listA2, 10));
                Iterator<T> it = listA2.iterator();
                while (it.hasNext()) {
                    arrayList.add(q((TravelDataDto) it.next()));
                }
                linkedHashMap.put(pVarR, arrayList);
            }
            mapA = a(linkedHashMap);
        } else {
            mapA = null;
        }
        return mapA == null ? v0.i() : mapA;
    }

    private static final Coordinates y(CoordinatesDto coordinatesDto) {
        return new Coordinates(coordinatesDto.getLatitude(), coordinatesDto.getLongitude());
    }

    private static final AdministrativeAreaDto z(BEPlace.AdministrationDivision administrationDivision) {
        return new AdministrativeAreaDto(administrationDivision != null ? administrationDivision.getDivision1() : null, administrationDivision != null ? administrationDivision.getDivision2() : null);
    }
}
