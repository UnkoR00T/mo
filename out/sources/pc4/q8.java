package pc4;

import al0.ChildData;
import cv0.BEApplicant;
import cv0.BEContact;
import cv0.BECountry;
import cv0.BEPersonalData;
import cv0.BEPhoneContactDetails;
import cv0.BEPlace;
import cv0.BEProfile;
import cv0.BEStage;
import cv0.BESubProfile;
import cv0.BETravel;
import cv0.BETravelRequestModel;
import cv0.BEWarning;
import cv0.BEWarningLevel;
import ga3.Stage;
import ht0.BEPlaceDetails;
import ht0.BEPlaceSuggestion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import v93.Contact;
import v93.Country;
import v93.Profile;
import v93.SubProfile;
import v93.Warning;
import v93.WarningLevel;
import vy.Coordinates;
import xi0.ContactDetail;
import xi0.ContactDetailAdditionalValue;
import xi0.ContactDetails;
import z93.Applicant;
import z93.PhoneContactDetails;
import z93.Place;
import z93.PlaceDetails;
import z93.PlaceSuggestion;
import z93.Travel;
import z93.TravelChildData;
import z93.TravelContactDetail;
import z93.TravelContactDetailAdditionalValue;
import z93.TravelContactDetails;
import z93.TravelPersonalData;
import z93.TravelRequestModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0011\u0010&\u001a\u00020%*\u00020$¢\u0006\u0004\b&\u0010'\u001a\u0011\u0010*\u001a\u00020)*\u00020(¢\u0006\u0004\b*\u0010\u0017\u001a\u0011\u0010-\u001a\u00020,*\u00020+¢\u0006\u0004\b-\u0010.\u001a\u0011\u00101\u001a\u000200*\u00020/¢\u0006\u0004\b1\u00102\u001a\u0011\u00105\u001a\u000204*\u000203¢\u0006\u0004\b5\u00106\u001a\u0011\u00109\u001a\u000208*\u000207¢\u0006\u0004\b9\u0010:\u001a\u0011\u0010=\u001a\u00020<*\u00020;¢\u0006\u0004\b=\u0010>\u001a\u0011\u0010A\u001a\u00020@*\u00020?¢\u0006\u0004\bA\u0010B\u001a\u0011\u0010E\u001a\u00020D*\u00020C¢\u0006\u0004\bE\u0010F\u001a\u0011\u0010I\u001a\u00020H*\u00020G¢\u0006\u0004\bI\u0010J\u001a\u0011\u0010M\u001a\u00020L*\u00020K¢\u0006\u0004\bM\u0010N\u001a\u0011\u0010Q\u001a\u00020P*\u00020O¢\u0006\u0004\bQ\u0010R\u001a\u0011\u0010U\u001a\u00020T*\u00020S¢\u0006\u0004\bU\u0010V\u001a\u0011\u0010Y\u001a\u00020X*\u00020W¢\u0006\u0004\bY\u0010Z\u001a\u0011\u0010]\u001a\u00020\\*\u00020[¢\u0006\u0004\b]\u0010^\u001a\u0011\u0010a\u001a\u00020`*\u00020_¢\u0006\u0004\ba\u0010b\u001a\u0011\u0010e\u001a\u00020d*\u00020c¢\u0006\u0004\be\u0010f\u001a\u0011\u0010g\u001a\u00020\f*\u00020\r¢\u0006\u0004\bg\u0010h\u001a\u0011\u0010i\u001a\u00020 *\u00020!¢\u0006\u0004\bi\u0010j\u001a\u0011\u0010k\u001a\u00020$*\u00020%¢\u0006\u0004\bk\u0010l\u001a\u0011\u0010m\u001a\u00020\u0014*\u00020\u0015¢\u0006\u0004\bm\u0010\u0017\u001a\u0011\u0010n\u001a\u000203*\u000204¢\u0006\u0004\bn\u0010o\u001a\u0011\u0010p\u001a\u000207*\u000208¢\u0006\u0004\bp\u0010q\u001a\u0011\u0010t\u001a\u00020s*\u00020r¢\u0006\u0004\bt\u0010u\u001a\u0011\u0010v\u001a\u00020(*\u00020)¢\u0006\u0004\bv\u0010\u0017\u001a\u0011\u0010y\u001a\u00020x*\u00020w¢\u0006\u0004\by\u0010\u0017¨\u0006z"}, d2 = {"Lcv0/s;", "Lv93/m;", "r", "(Lcv0/s;)Lv93/m;", "Lcv0/t;", "Lv93/n;", "s", "(Lcv0/t;)Lv93/n;", "Lcv0/r;", "Lv93/l;", "q", "(Lcv0/r;)Lv93/l;", "Lcv0/a;", "Lz93/a;", "t", "(Lcv0/a;)Lz93/a;", "Lcv0/d;", "Lv93/c;", "m", "(Lcv0/d;)Lv93/c;", "Lcv0/q;", "Lz93/s;", "I", "(Ljava/lang/String;)Ljava/lang/String;", "Lcv0/n;", "Lz93/i;", "y", "(Lcv0/n;)Lz93/i;", "Lcv0/p;", "Lz93/r;", "G", "(Lcv0/p;)Lz93/r;", "Lcv0/g;", "Lz93/b;", "u", "(Lcv0/g;)Lz93/b;", "Lcv0/h;", "Lz93/c;", "v", "(Lcv0/h;)Lz93/c;", "Lht0/b;", "Lz93/e;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Lht0/a;", "Lz93/d;", "w", "(Lht0/a;)Lz93/d;", "Lht0/c;", "Lz93/g;", "x", "(Lht0/c;)Lz93/g;", "Lcv0/k;", "Lga3/c;", "j", "(Lcv0/k;)Lga3/c;", "Lcv0/f;", "Lz93/p;", "F", "(Lcv0/f;)Lz93/p;", "Lcv0/j;", "Lv93/j;", "o", "(Lcv0/j;)Lv93/j;", "Lcv0/l;", "Lv93/k;", "p", "(Lcv0/l;)Lv93/k;", "Lcv0/i;", "Lv93/i;", "n", "(Lcv0/i;)Lv93/i;", "Lcv0/b;", "Lv93/a;", "k", "(Lcv0/b;)Lv93/a;", "Lcv0/c;", "Lv93/b;", "l", "(Lcv0/c;)Lv93/b;", "Lxi0/d;", "Lz93/n;", ip.a.f96138c, "(Lxi0/d;)Lz93/n;", "Lxi0/c;", "Lz93/m;", "C", "(Lxi0/c;)Lz93/m;", "Lxi0/b;", "Lz93/l;", "B", "(Lxi0/b;)Lz93/l;", "Lxi0/a;", "Lz93/k;", "A", "(Lxi0/a;)Lz93/k;", "Lxi0/e;", "Lz93/o;", "E", "(Lxi0/e;)Lz93/o;", "Lal0/u;", "Lz93/j;", "z", "(Lal0/u;)Lz93/j;", "a", "(Lz93/a;)Lcv0/a;", "c", "(Lz93/b;)Lcv0/g;", "d", "(Lz93/c;)Lcv0/h;", "i", "g", "(Lga3/c;)Lcv0/k;", "b", "(Lz93/p;)Lcv0/f;", "Lz93/q;", "Lcv0/o;", "h", "(Lz93/q;)Lcv0/o;", "e", "Lz93/h;", "Lht0/d;", "f", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class q8 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f155648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f155649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f155650c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f155651d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f155652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f155653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f155654g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ int[] f155655h;

        static {
            int[] iArr = new int[BEWarningLevel.a.values().length];
            try {
                iArr[BEWarningLevel.a.LEVEL_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BEWarningLevel.a.LEVEL_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BEWarningLevel.a.LEVEL_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BEWarningLevel.a.LEVEL_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BEWarningLevel.a.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f155648a = iArr;
            int[] iArr2 = new int[cv0.t.values().length];
            try {
                iArr2[cv0.t.COUNTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[cv0.t.REGION.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f155649b = iArr2;
            int[] iArr3 = new int[cv0.p.values().length];
            try {
                iArr3[cv0.p.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[cv0.p.PLANNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[cv0.p.STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f155650c = iArr3;
            int[] iArr4 = new int[cv0.j.values().length];
            try {
                iArr4[cv0.j.SAFETY.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[cv0.j.TRAVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[cv0.j.HEALTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[cv0.j.LAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[cv0.j.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused15) {
            }
            f155651d = iArr4;
            int[] iArr5 = new int[BEContact.a.values().length];
            try {
                iArr5[BEContact.a.LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[BEContact.a.PHONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[BEContact.a.EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[BEContact.a.URL.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[BEContact.a.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            f155652e = iArr5;
            int[] iArr6 = new int[cv0.c.values().length];
            try {
                iArr6[cv0.c.FACILITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[cv0.c.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            f155653f = iArr6;
            int[] iArr7 = new int[xi0.d.values().length];
            try {
                iArr7[xi0.d.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[xi0.d.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr7[xi0.d.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            f155654g = iArr7;
            int[] iArr8 = new int[xi0.c.values().length];
            try {
                iArr8[xi0.c.IN_REGISTRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr8[xi0.c.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr8[xi0.c.NO_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr8[xi0.c.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused29) {
            }
            f155655h = iArr8;
        }
    }

    public static final TravelContactDetail A(ContactDetail contactDetail) {
        iy.b0 value = contactDetail.getValue();
        z93.n nVarD = D(contactDetail.getType());
        z93.m mVarC = C(contactDetail.getStatus());
        List<ContactDetailAdditionalValue> listA = contactDetail.a();
        ArrayList arrayList = new ArrayList(pq.v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(B((ContactDetailAdditionalValue) it.next()));
        }
        return new TravelContactDetail(value, nVarD, mVarC, arrayList);
    }

    public static final TravelContactDetailAdditionalValue B(ContactDetailAdditionalValue contactDetailAdditionalValue) {
        return new TravelContactDetailAdditionalValue(contactDetailAdditionalValue.getKey(), contactDetailAdditionalValue.getValue());
    }

    public static final z93.m C(xi0.c cVar) {
        int i15 = a.f155655h[cVar.ordinal()];
        if (i15 == 1) {
            return z93.m.IN_REGISTRY;
        }
        if (i15 == 2) {
            return z93.m.PENDING;
        }
        if (i15 == 3) {
            return z93.m.NO_DATA;
        }
        if (i15 == 4) {
            return z93.m.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final z93.n D(xi0.d dVar) {
        int i15 = a.f155654g[dVar.ordinal()];
        if (i15 == 1) {
            return z93.n.PHONE;
        }
        if (i15 == 2) {
            return z93.n.EMAIL;
        }
        if (i15 == 3) {
            return z93.n.UNKNOWN;
        }
        throw new oq.p();
    }

    public static final TravelContactDetails E(ContactDetails contactDetails) {
        List<ContactDetail> listB = contactDetails.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(A((ContactDetail) it.next()));
        }
        return new TravelContactDetails(arrayList);
    }

    public static final TravelPersonalData F(BEPersonalData bEPersonalData) {
        return new TravelPersonalData(bEPersonalData.getFirstName(), bEPersonalData.getPesel(), bEPersonalData.getSurname(), null);
    }

    public static final z93.r G(cv0.p pVar) {
        int i15 = a.f155650c[pVar.ordinal()];
        if (i15 == 1) {
            return z93.r.FINISHED;
        }
        if (i15 == 2) {
            return z93.r.PLANNED;
        }
        if (i15 == 3) {
            return z93.r.STARTED;
        }
        throw new oq.p();
    }

    public static final String H(String str) {
        return z93.e.a(str);
    }

    public static final String I(String str) {
        return z93.s.b(str);
    }

    public static final BEApplicant a(Applicant applicant) {
        String firstName = applicant.getFirstName();
        String surname = applicant.getSurname();
        iy.b0 pesel = applicant.getPesel();
        boolean isParticipant = applicant.getIsParticipant();
        String email = applicant.getEmail();
        PhoneContactDetails phone = applicant.getPhone();
        return new BEApplicant(firstName, surname, pesel, isParticipant, email, phone != null ? c(phone) : null, null);
    }

    public static final BEPersonalData b(TravelPersonalData travelPersonalData) {
        return new BEPersonalData(travelPersonalData.getFirstName(), travelPersonalData.getPesel(), travelPersonalData.getSurname(), null);
    }

    public static final BEPhoneContactDetails c(PhoneContactDetails phoneContactDetails) {
        return new BEPhoneContactDetails(phoneContactDetails.getPhoneNumber(), phoneContactDetails.getPrefix());
    }

    public static final BEPlace d(Place place) {
        Place.AdministrationDivision administrativeDivisions = place.getAdministrativeDivisions();
        BEPlace.AdministrationDivision administrationDivision = new BEPlace.AdministrationDivision(administrativeDivisions != null ? administrativeDivisions.getDivision1() : null, administrativeDivisions != null ? administrativeDivisions.getDivision2() : null);
        Coordinates coordinates = place.getCoordinates();
        String countryIso = place.getCountryIso();
        String fullAddress = place.getFullAddress();
        String countryName = place.getCountryName();
        Place.Identifiers identifiers = place.getIdentifiers();
        return new BEPlace(administrationDivision, coordinates, countryIso, fullAddress, countryName, new BEPlace.Identifiers(identifiers != null ? identifiers.getPlaceId() : null, identifiers != null ? identifiers.getPlaceIdAdministrativeDivision1() : null, identifiers != null ? identifiers.getPlaceIdAdministrativeDivision2() : null, identifiers != null ? identifiers.getPlaceIdCity() : null, identifiers != null ? identifiers.getPlaceIdCountry() : null));
    }

    public static final String e(String str) {
        return ht0.b.a(str);
    }

    public static final String f(String str) {
        return ht0.d.a(str);
    }

    public static final BEStage g(Stage stage) {
        return new BEStage(stage.getDateRange(), d(stage.getPlace()));
    }

    public static final BETravelRequestModel h(TravelRequestModel travelRequestModel) {
        BEApplicant bEApplicantA = a(travelRequestModel.getApplicant());
        List<Stage> listC = travelRequestModel.c();
        ArrayList arrayList = new ArrayList(pq.v.y(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(g((Stage) it.next()));
        }
        List<TravelPersonalData> listB = travelRequestModel.b();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList2.add(b((TravelPersonalData) it4.next()));
        }
        return new BETravelRequestModel(bEApplicantA, arrayList, arrayList2);
    }

    public static final String i(String str) {
        return cv0.q.a(str);
    }

    public static final Stage j(BEStage bEStage) {
        return new Stage(bEStage.getDateRange(), v(bEStage.getPlace()));
    }

    public static final Contact k(BEContact bEContact) {
        Contact.EnumC5364a enumC5364a;
        String name = bEContact.getName();
        String value = bEContact.getValue();
        int i15 = a.f155652e[bEContact.getType().ordinal()];
        if (i15 == 1) {
            enumC5364a = Contact.EnumC5364a.LOCATION;
        } else if (i15 == 2) {
            enumC5364a = Contact.EnumC5364a.PHONE;
        } else if (i15 == 3) {
            enumC5364a = Contact.EnumC5364a.EMAIL;
        } else if (i15 == 4) {
            enumC5364a = Contact.EnumC5364a.URL;
        } else {
            if (i15 != 5) {
                throw new oq.p();
            }
            enumC5364a = Contact.EnumC5364a.OTHER;
        }
        return new Contact(name, value, enumC5364a);
    }

    public static final v93.b l(cv0.c cVar) {
        int i15 = a.f155653f[cVar.ordinal()];
        if (i15 == 1) {
            return v93.b.FACILITY;
        }
        if (i15 == 2) {
            return v93.b.CONTACT;
        }
        throw new oq.p();
    }

    public static final Country m(BECountry bECountry) {
        return new Country(bECountry.getIsoCode(), bECountry.getName(), bECountry.getIsSubscribed(), r(bECountry.getWarningLevel()));
    }

    public static final Profile n(BEProfile bEProfile) {
        String title = bEProfile.getTitle();
        v93.j jVarO = o(bEProfile.getType());
        String content = bEProfile.getContent();
        List<BESubProfile> listB = bEProfile.b();
        ArrayList arrayList = new ArrayList(pq.v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(p((BESubProfile) it.next()));
        }
        return new Profile(title, jVarO, content, arrayList, bEProfile.getSummary());
    }

    public static final v93.j o(cv0.j jVar) {
        int i15 = a.f155651d[jVar.ordinal()];
        if (i15 == 1) {
            return v93.j.SAFETY;
        }
        if (i15 == 2) {
            return v93.j.TRAVEL;
        }
        if (i15 == 3) {
            return v93.j.HEALTH;
        }
        if (i15 == 4) {
            return v93.j.LAW;
        }
        if (i15 == 5) {
            return v93.j.OTHER;
        }
        throw new oq.p();
    }

    public static final SubProfile p(BESubProfile bESubProfile) {
        return new SubProfile(bESubProfile.getTitle(), bESubProfile.getDescription());
    }

    public static final Warning q(BEWarning bEWarning) {
        return new Warning(s(bEWarning.getType()), bEWarning.getDescription(), r(bEWarning.getWarningLevel()));
    }

    public static final WarningLevel r(BEWarningLevel bEWarningLevel) {
        WarningLevel.a aVar;
        String description = bEWarningLevel.getDescription();
        int i15 = a.f155648a[bEWarningLevel.getType().ordinal()];
        if (i15 == 1) {
            aVar = WarningLevel.a.LEVEL_1;
        } else if (i15 == 2) {
            aVar = WarningLevel.a.LEVEL_2;
        } else if (i15 == 3) {
            aVar = WarningLevel.a.LEVEL_3;
        } else if (i15 == 4) {
            aVar = WarningLevel.a.LEVEL_4;
        } else {
            if (i15 != 5) {
                throw new oq.p();
            }
            aVar = WarningLevel.a.UNKNOWN;
        }
        return new WarningLevel(description, aVar);
    }

    public static final v93.n s(cv0.t tVar) {
        int i15 = a.f155649b[tVar.ordinal()];
        if (i15 == 1) {
            return v93.n.COUNTRY;
        }
        if (i15 == 2) {
            return v93.n.REGION;
        }
        throw new oq.p();
    }

    public static final Applicant t(BEApplicant bEApplicant) {
        String firstName = bEApplicant.getFirstName();
        String surname = bEApplicant.getSurname();
        iy.b0 pesel = bEApplicant.getPesel();
        boolean isParticipant = bEApplicant.getIsParticipant();
        String email = bEApplicant.getEmail();
        BEPhoneContactDetails phone = bEApplicant.getPhone();
        return new Applicant(firstName, surname, pesel, isParticipant, email, phone != null ? u(phone) : null, null);
    }

    private static final PhoneContactDetails u(BEPhoneContactDetails bEPhoneContactDetails) {
        return new PhoneContactDetails(bEPhoneContactDetails.getPhoneNumber(), bEPhoneContactDetails.getPrefix());
    }

    public static final Place v(BEPlace bEPlace) {
        BEPlace.AdministrationDivision administrativeDivisions = bEPlace.getAdministrativeDivisions();
        Place.AdministrationDivision administrationDivision = new Place.AdministrationDivision(administrativeDivisions != null ? administrativeDivisions.getDivision1() : null, administrativeDivisions != null ? administrativeDivisions.getDivision2() : null);
        Coordinates coordinates = bEPlace.getCoordinates();
        String countryIso = bEPlace.getCountryIso();
        String fullAddress = bEPlace.getFullAddress();
        String countryName = bEPlace.getCountryName();
        BEPlace.Identifiers identifiers = bEPlace.getIdentifiers();
        return new Place(administrationDivision, coordinates, countryIso, fullAddress, countryName, new Place.Identifiers(identifiers != null ? identifiers.getPlaceId() : null, identifiers != null ? identifiers.getPlaceIdAdministrativeDivision1() : null, identifiers != null ? identifiers.getPlaceIdAdministrativeDivision2() : null, identifiers != null ? identifiers.getPlaceIdCity() : null, identifiers != null ? identifiers.getPlaceIdCountry() : null));
    }

    public static final PlaceDetails w(BEPlaceDetails bEPlaceDetails) {
        Coordinates coordinates = bEPlaceDetails.getCoordinates();
        String fullAddress = bEPlaceDetails.getFullAddress();
        String strH = H(bEPlaceDetails.getPlaceId());
        BEPlaceDetails.AdministrativeDivision administrativeDivision = bEPlaceDetails.getAdministrativeDivision();
        return new PlaceDetails(coordinates, fullAddress, strH, new PlaceDetails.AdministrativeDivision(administrativeDivision != null ? administrativeDivision.getDivision1() : null, administrativeDivision != null ? administrativeDivision.getDivision2() : null), bEPlaceDetails.getCountryIso(), bEPlaceDetails.getCountryName(), null);
    }

    public static final PlaceSuggestion x(BEPlaceSuggestion bEPlaceSuggestion) {
        return new PlaceSuggestion(H(bEPlaceSuggestion.getPlaceId()), bEPlaceSuggestion.getFullAddress(), null);
    }

    public static final Travel y(BETravel bETravel) {
        String strI = I(bETravel.getUuid());
        Applicant applicantT = t(bETravel.getApplicant());
        String destination = bETravel.getDestination();
        fz.e.LocalDate dateRange = bETravel.getDateRange();
        List<BEStage> listD = bETravel.d();
        ArrayList arrayList = new ArrayList(pq.v.y(listD, 10));
        Iterator<T> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(j((BEStage) it.next()));
        }
        List<BEPersonalData> listE = bETravel.e();
        ArrayList arrayList2 = new ArrayList(pq.v.y(listE, 10));
        Iterator<T> it4 = listE.iterator();
        while (it4.hasNext()) {
            arrayList2.add(F((BEPersonalData) it4.next()));
        }
        return new Travel(strI, applicantT, destination, dateRange, arrayList, arrayList2, null);
    }

    public static final TravelChildData z(ChildData childData) {
        return new TravelChildData(childData.getChildId(), childData.getFirstName(), childData.getPesel(), childData.getSurname(), childData.getSecondName(), null);
    }
}
