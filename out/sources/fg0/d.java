package fg0;

import bg0.FamilyCardScope;
import bg0.FamilyDataContainer;
import cg0.Address;
import cg0.School;
import cg0.SchoolCardDataContainer;
import cg0.SchoolCardScope;
import dg0.UutCardScope;
import dg0.UutDataContainer;
import dx.i;
import dx.j;
import hg0.DocumentEntity;
import iy.b0;
import iy.c0;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.p;
import p071kotlin.Metadata;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.CertificateStatusEntity;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.DocumentEntityStatus;
import pl.gov.coi.mjunior.technical.containers.data.database.entities.DocumentEntityType;
import pq.v;
import px.f;
import qt3.JuniorSchoolCardDataContainer;
import qt3.JuniorSchoolCardScope;
import qt3.MnemonicHeaderContainer;
import qt3.StatusChangedReasonContainer;
import qt3.UutScope;
import vf0.Document;
import x80.e;
import xf0.CategoryContainer;
import xf0.DrivingLicenceDataContainer;
import xf0.DrivingLicenceScope;
import xf0.MnemonicHeaderContainerDL;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\b\u001a\u00020\u0007*\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\f\u001a\u00020\u000b*\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\n*\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0011\u001a\u00020\n*\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0015\u001a\u00020\u0014*\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0019\u001a\u00020\u0018*\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001d\u001a\u00020\u001c*\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0011\u0010!\u001a\u00020 *\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a\u0011\u0010%\u001a\u00020$*\u00020#¢\u0006\u0004\b%\u0010&\u001a\u0011\u0010)\u001a\u00020(*\u00020'¢\u0006\u0004\b)\u0010*\u001a\u001d\u0010/\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0,*\u00020+¢\u0006\u0004\b/\u00100\u001a\u001d\u00102\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u0002010,*\u00020\u001b¢\u0006\u0004\b2\u00103\u001a\u001d\u00106\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u0002050,*\u000204¢\u0006\u0004\b6\u00107\u001a\u001d\u0010:\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u0002090,*\u000208¢\u0006\u0004\b:\u0010;\u001a\u0011\u0010>\u001a\u00020=*\u00020<¢\u0006\u0004\b>\u0010?\u001a\u001d\u0010B\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020A0,*\u00020@¢\u0006\u0004\bB\u0010C\u001a\u001d\u0010F\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020E0,*\u00020D¢\u0006\u0004\bF\u0010G\u001a\u001d\u0010J\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020I0,*\u00020H¢\u0006\u0004\bJ\u0010K\u001a\u0011\u0010N\u001a\u00020M*\u00020L¢\u0006\u0004\bN\u0010O\"\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010Q¨\u0006S"}, d2 = {"Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;", "Lwf0/a;", "r", "(Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;)Lwf0/a;", "u", "(Lwf0/a;)Lpl/gov/coi/mjunior/technical/containers/data/database/entities/CertificateStatusEntity;", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityType;", "Lvf0/d;", "e", "(Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityType;)Lvf0/d;", "Lvf0/c;", "Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;", "b", "(Lvf0/c;)Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;", "c", "(Lpl/gov/coi/mjunior/technical/containers/data/database/entities/DocumentEntityStatus;)Lvf0/c;", "Lx80/e;", "d", "(Lx80/e;)Lvf0/c;", "Lhg0/c;", "Lvf0/a;", "a", "(Lhg0/c;)Lvf0/a;", "Lqt3/a0;", "Lcg0/e;", "i", "(Lqt3/a0;)Lcg0/e;", "Lqt3/f0;", "Lvf0/f;", "q", "(Lqt3/f0;)Lvf0/f;", "Lqt3/z;", "Lcg0/c;", "h", "(Lqt3/z;)Lcg0/c;", "Lqt3/n0;", "Lcg0/b;", "g", "(Lqt3/n0;)Lcg0/b;", "Lqt3/a;", "Lcg0/a;", "f", "(Lqt3/a;)Lcg0/a;", "Lqt3/w;", "Ldx/i;", "Ldx/b;", "Lxf0/e;", "m", "(Lqt3/w;)Ldx/i;", "Lxf0/f;", "t", "(Lqt3/f0;)Ldx/i;", "Lqt3/v;", "Lxf0/b;", "l", "(Lqt3/v;)Ldx/i;", "Lqt3/c;", "Lxf0/a;", "k", "(Lqt3/c;)Ldx/i;", "Lqt3/o0;", "Lxf0/g;", "s", "(Lqt3/o0;)Lxf0/g;", "Lqt3/x;", "Lbg0/c;", "n", "(Lqt3/x;)Ldx/i;", "Lqt3/y;", "Lbg0/d;", "o", "(Lqt3/y;)Ldx/i;", "Lqt3/q0;", "Ldg0/c;", "p", "(Lqt3/q0;)Ldx/i;", "Lqt3/p0;", "Ldg0/d;", "j", "(Lqt3/p0;)Ldg0/d;", "Ldx/b$e;", "Ldx/b$e;", "incompleteDataError", "containers_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final dx.b.Generic f62740a = new dx.b.Generic(new IllegalArgumentException("Incomplete data"));

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f62741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f62742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f62743c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f62744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f62745e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f62746f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int[] f62747g;

        static {
            int[] iArr = new int[CertificateStatusEntity.values().length];
            try {
                iArr[CertificateStatusEntity.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CertificateStatusEntity.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CertificateStatusEntity.NOT_ACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f62741a = iArr;
            int[] iArr2 = new int[wf0.a.values().length];
            try {
                iArr2[wf0.a.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[wf0.a.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[wf0.a.NOT_ACTIVATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f62742b = iArr2;
            int[] iArr3 = new int[vf0.d.values().length];
            try {
                iArr3[vf0.d.SCHOOL_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[vf0.d.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[vf0.d.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[vf0.d.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            f62743c = iArr3;
            int[] iArr4 = new int[DocumentEntityType.values().length];
            try {
                iArr4[DocumentEntityType.SCHOOL_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DocumentEntityType.DRIVER_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[DocumentEntityType.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[DocumentEntityType.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[DocumentEntityType.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            f62744d = iArr4;
            int[] iArr5 = new int[vf0.c.values().length];
            try {
                iArr5[vf0.c.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[vf0.c.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[vf0.c.TO_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            f62745e = iArr5;
            int[] iArr6 = new int[DocumentEntityStatus.values().length];
            try {
                iArr6[DocumentEntityStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr6[DocumentEntityStatus.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr6[DocumentEntityStatus.TO_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            f62746f = iArr6;
            int[] iArr7 = new int[e.values().length];
            try {
                iArr7[e.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr7[e.INACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr7[e.TO_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            f62747g = iArr7;
        }
    }

    public static final Document a(DocumentEntity documentEntity) {
        vf0.c cVarC = c(documentEntity.h());
        return new Document(documentEntity.getDocumentId(), e(documentEntity.getType()), cVarC, documentEntity.getParentId() != null);
    }

    public static final DocumentEntityStatus b(vf0.c cVar) {
        int i15 = a.f62745e[cVar.ordinal()];
        if (i15 == 1) {
            return DocumentEntityStatus.ACTIVE;
        }
        if (i15 == 2) {
            return DocumentEntityStatus.INACTIVE;
        }
        if (i15 == 3) {
            return DocumentEntityStatus.TO_UPDATE;
        }
        throw new p();
    }

    public static final vf0.c c(DocumentEntityStatus documentEntityStatus) {
        int i15 = a.f62746f[documentEntityStatus.ordinal()];
        if (i15 == 1) {
            return vf0.c.ACTIVE;
        }
        if (i15 == 2) {
            return vf0.c.INACTIVE;
        }
        if (i15 == 3) {
            return vf0.c.TO_UPDATE;
        }
        throw new p();
    }

    public static final vf0.c d(e eVar) {
        int i15 = a.f62747g[eVar.ordinal()];
        if (i15 == 1) {
            return vf0.c.ACTIVE;
        }
        if (i15 == 2) {
            return vf0.c.INACTIVE;
        }
        if (i15 == 3) {
            return vf0.c.TO_UPDATE;
        }
        throw new p();
    }

    public static final vf0.d e(DocumentEntityType documentEntityType) {
        int i15 = a.f62744d[documentEntityType.ordinal()];
        if (i15 == 1) {
            return vf0.d.SCHOOL_CARD;
        }
        if (i15 == 2) {
            return vf0.d.DRIVING_LICENCE;
        }
        if (i15 == 3) {
            return vf0.d.FAMILY_CARD;
        }
        if (i15 == 4) {
            return vf0.d.UUT_CARD;
        }
        if (i15 == 5) {
            return vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD;
        }
        throw new p();
    }

    public static final Address f(qt3.Address address) {
        return new Address(address.getZipCode(), address.getPostOffice(), address.getCity(), address.getStreet(), address.getBuildingNumber(), address.getFlatNumber());
    }

    public static final School g(qt3.School school) {
        return new School(school.getRspo(), school.getName(), school.getHeadmasterFirstName(), school.getHeadmasterLastName(), f(school.getAddress()), school.getPhoneNumber());
    }

    public static final SchoolCardDataContainer h(JuniorSchoolCardDataContainer juniorSchoolCardDataContainer) {
        return new SchoolCardDataContainer(juniorSchoolCardDataContainer.getPicture(), juniorSchoolCardDataContainer.getTechnicalId(), juniorSchoolCardDataContainer.getNumber(), juniorSchoolCardDataContainer.getDisability(), juniorSchoolCardDataContainer.getFirstName(), juniorSchoolCardDataContainer.getLastName(), juniorSchoolCardDataContainer.getPesel(), juniorSchoolCardDataContainer.getDateOfBirth(), juniorSchoolCardDataContainer.getIssueDate(), juniorSchoolCardDataContainer.getExpirationDate(), g(juniorSchoolCardDataContainer.getSchool()), juniorSchoolCardDataContainer.getSecondName());
    }

    public static final SchoolCardScope i(JuniorSchoolCardScope juniorSchoolCardScope) {
        return new SchoolCardScope(q(juniorSchoolCardScope.getDh()), h(juniorSchoolCardScope.getContainer()));
    }

    public static final UutDataContainer j(qt3.UutDataContainer uutDataContainer) {
        return new UutDataContainer(uutDataContainer.getOt(), uutDataContainer.getCh(), uutDataContainer.getSr(), uutDataContainer.getNo(), uutDataContainer.getN(), uutDataContainer.getTi(), uutDataContainer.getOc(), uutDataContainer.getKl(), uutDataContainer.getST(), uutDataContainer.getCC(), uutDataContainer.getID(), uutDataContainer.getED(), uutDataContainer.getQrC(), uutDataContainer.getS(), uutDataContainer.getSu(), uutDataContainer.getP(), uutDataContainer.getAD(), uutDataContainer.getADi());
    }

    public static final i<dx.b, CategoryContainer> k(qt3.CategoryContainer categoryContainer) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String cn4 = categoryContainer.getCN();
                    if (cn4 == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    LocalDate frd = categoryContainer.getFRD();
                    if (frd == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    List<String> listE = categoryContainer.e();
                    LocalDate ed5 = categoryContainer.getED();
                    if (ed5 != null) {
                        return new i.Right(new CategoryContainer(cn4, frd, listE, ed5, categoryContainer.getCS()));
                    }
                    aVar.b(f62740a);
                    throw new g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, DrivingLicenceDataContainer> l(qt3.DrivingLicenceDataContainer drivingLicenceDataContainer) {
        Object objB;
        ArrayList arrayList;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String name = drivingLicenceDataContainer.getName();
                    if (name == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    String surname = drivingLicenceDataContainer.getSurname();
                    if (surname == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    LocalDate birthday = drivingLicenceDataContainer.getBirthday();
                    if (birthday == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    String birthplace = drivingLicenceDataContainer.getBirthplace();
                    if (birthplace == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    String ds4 = drivingLicenceDataContainer.getDS();
                    if (ds4 == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    String dsc = drivingLicenceDataContainer.getDSC();
                    String ldId = drivingLicenceDataContainer.getLdId();
                    if (ldId == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    String pn4 = drivingLicenceDataContainer.getPn();
                    if (pn4 == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    LocalDate rd5 = drivingLicenceDataContainer.getRD();
                    if (rd5 == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    List<String> listK = drivingLicenceDataContainer.k();
                    List<qt3.CategoryContainer> listC = drivingLicenceDataContainer.c();
                    if (listC == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    List<qt3.CategoryContainer> list = listC;
                    ArrayList arrayList2 = new ArrayList(v.y(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        i<dx.b, CategoryContainer> iVarK = k((qt3.CategoryContainer) it.next());
                        if (iVarK instanceof i.Left) {
                            aVar.b((dx.b) ((i.Left) iVarK).b());
                            throw new g();
                        }
                        if (!(iVarK instanceof i.Right)) {
                            throw new p();
                        }
                        arrayList2.add((CategoryContainer) ((i.Right) iVarK).b());
                    }
                    String secondName = drivingLicenceDataContainer.getSecondName();
                    List<StatusChangedReasonContainer> listN = drivingLicenceDataContainer.n();
                    if (listN != null) {
                        List<StatusChangedReasonContainer> list2 = listN;
                        arrayList = new ArrayList(v.y(list2, 10));
                        Iterator<T> it4 = list2.iterator();
                        while (it4.hasNext()) {
                            arrayList.add(s((StatusChangedReasonContainer) it4.next()));
                        }
                    } else {
                        arrayList = null;
                    }
                    LocalDate ed5 = drivingLicenceDataContainer.getED();
                    if (ed5 != null) {
                        return new i.Right(new DrivingLicenceDataContainer(name, surname, birthday, birthplace, ds4, dsc, ldId, pn4, rd5, listK, arrayList2, secondName, arrayList, ed5));
                    }
                    aVar.b(f62740a);
                    throw new g();
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, DrivingLicenceScope> m(qt3.DrivingLicenceScope drivingLicenceScope) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    i<dx.b, MnemonicHeaderContainerDL> iVarT = t(drivingLicenceScope.getDh());
                    if (iVarT instanceof i.Left) {
                        aVar.b((dx.b) ((i.Left) iVarT).b());
                        throw new g();
                    }
                    if (!(iVarT instanceof i.Right)) {
                        throw new p();
                    }
                    MnemonicHeaderContainerDL mnemonicHeaderContainerDL = (MnemonicHeaderContainerDL) ((i.Right) iVarT).b();
                    i<dx.b, DrivingLicenceDataContainer> iVarL = l(drivingLicenceScope.getDc());
                    if (iVarL instanceof i.Left) {
                        aVar.b((dx.b) ((i.Left) iVarL).b());
                        throw new g();
                    }
                    if (iVarL instanceof i.Right) {
                        return new i.Right(new DrivingLicenceScope(mnemonicHeaderContainerDL, (DrivingLicenceDataContainer) ((i.Right) iVarL).b()));
                    }
                    throw new p();
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, FamilyCardScope> n(qt3.FamilyCardScope familyCardScope) {
        Object objB;
        i<dx.b, FamilyDataContainer> iVarO;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    MnemonicHeaderContainer dh4 = familyCardScope.getDh();
                    FamilyDataContainer familyDataContainerA = null;
                    vf0.MnemonicHeaderContainer mnemonicHeaderContainerQ = dh4 != null ? q(dh4) : null;
                    qt3.FamilyDataContainer dc5 = familyCardScope.getDc();
                    if (dc5 != null && (iVarO = o(dc5)) != null) {
                        familyDataContainerA = iVarO.a();
                    }
                    boolean z15 = (familyDataContainerA == null || mnemonicHeaderContainerQ == null) ? false : true;
                    if (z15) {
                        return new i.Right(new FamilyCardScope(mnemonicHeaderContainerQ, familyDataContainerA));
                    }
                    if (z15) {
                        throw new p();
                    }
                    aVar.b(f62740a);
                    throw new g();
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final i<dx.b, FamilyDataContainer> o(qt3.FamilyDataContainer familyDataContainer) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String ot4 = familyDataContainer.getOt();
                    if (ot4 == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    String ch4 = familyDataContainer.getCh();
                    if (ch4 == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    String n15 = familyDataContainer.getN();
                    if (n15 == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    String s15 = familyDataContainer.getS();
                    String su4 = familyDataContainer.getSu();
                    if (su4 == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    String p15 = familyDataContainer.getP();
                    String icn = familyDataContainer.getIcn();
                    String no4 = familyDataContainer.getNo();
                    if (no4 != null) {
                        return new i.Right(new FamilyDataContainer(ot4, ch4, n15, s15, su4, p15, icn, no4, familyDataContainer.getED()));
                    }
                    aVar.b(f62740a);
                    throw new g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final i<dx.b, UutCardScope> p(UutScope uutScope) {
        Object objB;
        vf0.MnemonicHeaderContainer mnemonicHeaderContainerQ;
        UutDataContainer uutDataContainerJ;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    MnemonicHeaderContainer dh4 = uutScope.getDh();
                    if (dh4 == null || (mnemonicHeaderContainerQ = q(dh4)) == null) {
                        aVar.b(f62740a);
                        throw new g();
                    }
                    qt3.UutDataContainer dc5 = uutScope.getDc();
                    if (dc5 != null && (uutDataContainerJ = j(dc5)) != null) {
                        return new i.Right(new UutCardScope(mnemonicHeaderContainerQ, uutDataContainerJ));
                    }
                    aVar.b(f62740a);
                    throw new g();
                } catch (Exception e15) {
                    f fVar = f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    public static final vf0.MnemonicHeaderContainer q(MnemonicHeaderContainer mnemonicHeaderContainer) {
        return new vf0.MnemonicHeaderContainer(mnemonicHeaderContainer.getTp(), mnemonicHeaderContainer.getVer(), mnemonicHeaderContainer.getDn(), mnemonicHeaderContainer.getSn(), mnemonicHeaderContainer.getIsr(), mnemonicHeaderContainer.getTs(), mnemonicHeaderContainer.getIid(), mnemonicHeaderContainer.getPe(), mnemonicHeaderContainer.getStp(), mnemonicHeaderContainer.getRId(), mnemonicHeaderContainer.getIn(), mnemonicHeaderContainer.getId());
    }

    public static final wf0.a r(CertificateStatusEntity certificateStatusEntity) {
        int i15 = a.f62741a[certificateStatusEntity.ordinal()];
        if (i15 == 1) {
            return wf0.a.ACTIVE;
        }
        if (i15 == 2) {
            return wf0.a.INACTIVE;
        }
        if (i15 == 3) {
            return wf0.a.NOT_ACTIVATED;
        }
        throw new p();
    }

    public static final xf0.StatusChangedReasonContainer s(StatusChangedReasonContainer statusChangedReasonContainer) {
        return new xf0.StatusChangedReasonContainer(statusChangedReasonContainer.getCSC(), statusChangedReasonContainer.getCSD());
    }

    public static final i<dx.b, MnemonicHeaderContainerDL> t(MnemonicHeaderContainer mnemonicHeaderContainer) {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int tp4 = mnemonicHeaderContainer.getTp();
                    Integer stp = mnemonicHeaderContainer.getStp();
                    int ver = mnemonicHeaderContainer.getVer();
                    String dn4 = mnemonicHeaderContainer.getDn();
                    String sn4 = mnemonicHeaderContainer.getSn();
                    String isr = mnemonicHeaderContainer.getIsr();
                    OffsetDateTime ts4 = mnemonicHeaderContainer.getTs();
                    String rId = mnemonicHeaderContainer.getRId();
                    String iid = mnemonicHeaderContainer.getIid();
                    b0 b0VarG = c0.g(mnemonicHeaderContainer.getPe());
                    Integer in4 = mnemonicHeaderContainer.getIn();
                    String id5 = mnemonicHeaderContainer.getId();
                    if (id5 != null) {
                        return new i.Right(new MnemonicHeaderContainerDL(tp4, stp, ver, dn4, sn4, isr, ts4, rId, iid, b0VarG, in4, id5));
                    }
                    aVar.b(f62740a);
                    throw new g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }

    public static final CertificateStatusEntity u(wf0.a aVar) {
        int i15 = a.f62742b[aVar.ordinal()];
        if (i15 == 1) {
            return CertificateStatusEntity.ACTIVE;
        }
        if (i15 == 2) {
            return CertificateStatusEntity.INACTIVE;
        }
        if (i15 == 3) {
            return CertificateStatusEntity.NOT_ACTIVATED;
        }
        throw new p();
    }
}
