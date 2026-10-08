package gg1;

import af1.PkdCodeMainSelectionContractData;
import bg1.CompanyShortNameContractData;
import de1.KrusData;
import de1.SocialInsuranceQuestions;
import fr.t;
import iy.c0;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jb1.ElectronicDeliveryInput;
import jb1.InsuranceInput;
import jb1.KrusInput;
import jb1.NonPublicSupplierInput;
import jb1.PublicSupplierInput;
import ld1.CompanyApplicationAddress;
import ld1.CompanyApplicationCitizenData;
import ld1.CompanyPkdCode;
import ld1.KrusOfficeModel;
import ld1.StatementAttachment;
import ld1.TaxOfficeModel;
import ma1.CompanyCategory;
import ma1.CompanyData;
import ma1.s;
import oq.p;
import p071kotlin.Metadata;
import pf1.CompanyManagementApplication;
import pf1.ContactDetailsEmail;
import pf1.SuspensionApplicantDetails;
import pf1.SuspensionCompanyDetails;
import pf1.SuspensionManagementDetails;
import pq.v;
import qf1.SuspensionPeriod;
import qg1.CompanySuspensionWizardData;
import rd1.CreatePublicAddressData;
import rd1.EdorAddressData;
import rd1.NotPublicAddressData;
import st3.AddressTerytDetail;
import xe1.PkdCodeContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u00013B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u0004\u0018\u00010\u0011*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0\u00032\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010'\u001a\u00020&*\u00020$2\u0006\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u0004\u0018\u00010)*\u00020\u000fH\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010/\u001a\u0004\u0018\u00010.2\b\u0010-\u001a\u0004\u0018\u00010,H\u0002¢\u0006\u0004\b/\u00100J$\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0010\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lgg1/a;", "Lxw/f;", "Lgg1/a$a;", "Ldx/i;", "Ldx/b;", "Lpf1/a;", "Lez/c;", "dateConverter", "<init>", "(Lez/c;)V", "Lrd1/b;", "edorAddressData", "Ljb1/g;", "i", "(Lrd1/b;)Ldx/i;", "Lma1/e;", "params", "", "mainActivityCategoryCode", "", "Lma1/c;", "c", "(Lma1/e;Lgg1/a$a;Ljava/lang/String;)Ljava/util/List;", "m", "(Lma1/e;Lgg1/a$a;)Ljava/lang/String;", "Lhb1/c;", "Lld1/c;", "e", "(Lhb1/c;)Lld1/c;", "Llb1/a;", "socialInsurance", "Lde1/e;", "krusData", "Ljb1/h;", "l", "(Llb1/a;Lde1/e;)Ldx/i;", "Ljg1/d;", "companyData", "Lpf1/f;", "q", "(Ljg1/d;Lma1/e;)Lpf1/f;", "Lpf1/c;", "h", "(Lma1/e;)Lpf1/c;", "Ltf1/b;", "contractData", "Lpf1/b;", "f", "(Ltf1/b;)Lpf1/b;", "r", "(Lgg1/a$a;)Ldx/i;", "a", "Lez/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements xw.f<Params, dx.i<? extends dx.b, ? extends CompanyManagementApplication>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: gg1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgg1/a$a;", "", "Lqg1/a;", "data", "Lld1/n;", "attachment", "<init>", "(Lqg1/a;Lld1/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqg1/a;", "b", "()Lqg1/a;", "Lld1/n;", "()Lld1/n;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CompanySuspensionWizardData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatementAttachment attachment;

        public Params(CompanySuspensionWizardData companySuspensionWizardData, StatementAttachment statementAttachment) {
            this.data = companySuspensionWizardData;
            this.attachment = statementAttachment;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StatementAttachment getAttachment() {
            return this.attachment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CompanySuspensionWizardData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.data, params.data) && t.c(this.attachment, params.attachment);
        }

        public int hashCode() {
            int iHashCode = this.data.hashCode() * 31;
            StatementAttachment statementAttachment = this.attachment;
            return iHashCode + (statementAttachment == null ? 0 : statementAttachment.hashCode());
        }

        public String toString() {
            return "Params(data=" + this.data + ", attachment=" + this.attachment + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f72845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f72846c;

        static {
            int[] iArr = new int[rd1.c.values().length];
            try {
                iArr[rd1.c.CREATE_NEW_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rd1.c.OWN_NOT_PUBLIC_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rd1.c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f72844a = iArr;
            int[] iArr2 = new int[de1.c.values().length];
            try {
                iArr2[de1.c.SUBMITTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[de1.c.ATTACH_AS_ATTACHMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[de1.c.SUBMIT_LATER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[de1.c.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f72845b = iArr2;
            int[] iArr3 = new int[lb1.a.values().length];
            try {
                iArr3[lb1.a.KRUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[lb1.a.ZUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[lb1.a.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f72846c = iArr3;
        }
    }

    public a(ez.c cVar) {
        this.dateConverter = cVar;
    }

    private final List<CompanyCategory> c(CompanyData companyData, Params params, String str) {
        List<CompanyCategory> listL;
        List<CompanyPkdCode> listA;
        PkdCodeContractData pkdCodeContractData = params.getData().getPkdCodeContractData();
        if (pkdCodeContractData == null || (listA = pkdCodeContractData.a()) == null) {
            listL = companyData.l();
        } else {
            List<CompanyPkdCode> list = listA;
            listL = new ArrayList<>(v.y(list, 10));
            for (CompanyPkdCode companyPkdCode : list) {
                listL.add(new CompanyCategory(companyPkdCode.getCode(), companyPkdCode.getName()));
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listL) {
            if (!t.c(((CompanyCategory) obj).getCode(), str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final CompanyApplicationAddress e(hb1.c cVar) {
        hb1.a aVarA = cVar != null ? hb1.d.a(cVar) : null;
        if (aVarA instanceof hb1.a.BackendAddress) {
            hb1.a.BackendAddress backendAddress = (hb1.a.BackendAddress) aVarA;
            String houseNumber = backendAddress.getAddress().getHouseNumber();
            String str = houseNumber == null ? "" : houseNumber;
            String city = backendAddress.getAddress().getCity();
            String str2 = city == null ? "" : city;
            String commune = backendAddress.getAddress().getCommune();
            String str3 = commune == null ? "" : commune;
            String county = backendAddress.getAddress().getCounty();
            String str4 = county == null ? "" : county;
            String postalCode = backendAddress.getAddress().getPostalCode();
            String str5 = postalCode == null ? "" : postalCode;
            String simc = backendAddress.getAddress().getSimc();
            String terc = backendAddress.getAddress().getTerc();
            String voivodeship = backendAddress.getAddress().getVoivodeship();
            return new CompanyApplicationAddress(str, str2, str3, str4, str5, simc, terc, voivodeship == null ? "" : voivodeship, backendAddress.getAddress().getApartmentNumber(), backendAddress.getAddress().getStreetName(), backendAddress.getAddress().getStreetPrefix(), backendAddress.getAddress().getUlic());
        }
        if (!(aVarA instanceof hb1.a.TerytAddress)) {
            if (aVarA == null) {
                return null;
            }
            throw new p();
        }
        hb1.a.TerytAddress terytAddress = (hb1.a.TerytAddress) aVarA;
        String buildingNumber = terytAddress.getAddress().getBuildingNumber();
        String name = terytAddress.getAddress().getCity().getName();
        String name2 = terytAddress.getAddress().getCommunity().getName();
        String name3 = terytAddress.getAddress().getCounty().getName();
        String postalCode2 = terytAddress.getAddress().getPostalCode();
        String strB = st3.c.b(terytAddress.getAddress());
        String strC = st3.c.c(terytAddress.getAddress());
        String name4 = terytAddress.getAddress().getProvince().getName();
        String apartmentNumber = terytAddress.getAddress().getApartmentNumber();
        AddressTerytDetail street = terytAddress.getAddress().getStreet();
        String name5 = street != null ? street.getName() : null;
        AddressTerytDetail street2 = terytAddress.getAddress().getStreet();
        String description = street2 != null ? street2.getDescription() : null;
        AddressTerytDetail street3 = terytAddress.getAddress().getStreet();
        return new CompanyApplicationAddress(buildingNumber, name, name2, name3, postalCode2, strB, strC, name4, apartmentNumber, name5, description, street3 != null ? street3.getId() : null);
    }

    private final ContactDetailsEmail f(tf1.b contractData) {
        if (contractData instanceof tf1.b.a) {
            tf1.b.a aVar = (tf1.b.a) contractData;
            return new ContactDetailsEmail(false, Boolean.valueOf(aVar.getCeidgConsent()), c0.e(aVar.getEmail()));
        }
        if (contractData instanceof tf1.b.C4950b) {
            return new ContactDetailsEmail(true, null, null);
        }
        return null;
    }

    private final pf1.c h(CompanyData companyData) {
        String suspensionFromDate = companyData.getSuspensionFromDate();
        LocalDate localDateO = suspensionFromDate != null ? this.dateConverter.o(suspensionFromDate, fz.c.DOTTED) : null;
        String resumptionDate = companyData.getResumptionDate();
        LocalDate localDateO2 = resumptionDate != null ? this.dateConverter.o(resumptionDate, fz.c.DOTTED) : null;
        pf1.c cVar = new pf1.c(localDateO, localDateO2);
        if (localDateO == null && localDateO2 == null) {
            return null;
        }
        return cVar;
    }

    private final dx.i<dx.b, ElectronicDeliveryInput> i(EdorAddressData edorAddressData) {
        Object objB;
        ElectronicDeliveryInput electronicDeliveryInput;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    rd1.c selection = edorAddressData.getSelection();
                    int i15 = selection == null ? -1 : b.f72844a[selection.ordinal()];
                    if (i15 != -1) {
                        if (i15 == 1) {
                            CreatePublicAddressData createPublicAddressData = edorAddressData.getCreatePublicAddressData();
                            String email = createPublicAddressData != null ? createPublicAddressData.getEmail() : null;
                            if (email == null) {
                                aVar.b(new dx.b.Generic(new NullPointerException("createPublicAddressData is null")));
                                throw new oq.g();
                            }
                            electronicDeliveryInput = new ElectronicDeliveryInput(null, new PublicSupplierInput(email));
                        } else if (i15 == 2) {
                            NotPublicAddressData notPublicAddressData = edorAddressData.getNotPublicAddressData();
                            String address = notPublicAddressData != null ? notPublicAddressData.getAddress() : null;
                            if (address == null) {
                                aVar.b(new dx.b.Generic(new NullPointerException("notPublicAddressData is null")));
                                throw new oq.g();
                            }
                            NotPublicAddressData notPublicAddressData2 = edorAddressData.getNotPublicAddressData();
                            String providerShortcut = notPublicAddressData2 != null ? notPublicAddressData2.getProviderShortcut() : null;
                            if (providerShortcut == null) {
                                aVar.b(new dx.b.Generic(new NullPointerException("providerShortcut is null")));
                                throw new oq.g();
                            }
                            electronicDeliveryInput = new ElectronicDeliveryInput(new NonPublicSupplierInput(address, providerShortcut), null);
                        } else if (i15 != 3) {
                            throw new p();
                        }
                        return new dx.i.Right(electronicDeliveryInput);
                    }
                    aVar.b(new dx.b.Generic(new NullPointerException("electronicDeliveryAddress is null")));
                    throw new oq.g();
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, InsuranceInput> l(lb1.a socialInsurance, KrusData krusData) {
        Object objB;
        KrusInput.a aVar;
        InsuranceInput insuranceInput;
        KrusInput.a aVar2;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar3 = new ex.a();
                    int i15 = b.f72846c[socialInsurance.ordinal()];
                    if (i15 != 1) {
                        if (i15 != 2) {
                            if (i15 != 3) {
                                throw new p();
                            }
                            aVar3.b(new dx.b.Generic(new NullPointerException("socialInsurance selection is NONE")));
                            throw new oq.g();
                        }
                        insuranceInput = new InsuranceInput(null, null);
                    } else {
                        if (krusData == null) {
                            aVar3.b(new dx.b.Generic(new NullPointerException("krusData is null")));
                            throw new oq.g();
                        }
                        SocialInsuranceQuestions socialInsuranceQuestions = krusData.getSocialInsuranceQuestions();
                        de1.g thirdAnswer = socialInsuranceQuestions != null ? socialInsuranceQuestions.getThirdAnswer() : null;
                        de1.g gVar = de1.g.YES;
                        boolean z15 = thirdAnswer == gVar;
                        SocialInsuranceQuestions socialInsuranceQuestions2 = krusData.getSocialInsuranceQuestions();
                        boolean z16 = (socialInsuranceQuestions2 != null ? socialInsuranceQuestions2.getSecondAnswer() : null) == gVar;
                        SocialInsuranceQuestions socialInsuranceQuestions3 = krusData.getSocialInsuranceQuestions();
                        boolean z17 = (socialInsuranceQuestions3 != null ? socialInsuranceQuestions3.getFirstAnswer() : null) == gVar;
                        KrusOfficeModel krusOffice = krusData.getKrusOffice();
                        String name = krusOffice != null ? krusOffice.getName() : null;
                        if (name == null) {
                            aVar3.b(new dx.b.Generic(new NullPointerException("krusOffice name is null")));
                            throw new oq.g();
                        }
                        Boolean boolValueOf = Boolean.valueOf(krusData.getIncomeTaxExceededInfo() == de1.d.EXCEEDED);
                        de1.c incomeTaxExceededCertificateInfoAnswer = krusData.getIncomeTaxExceededCertificateInfoAnswer();
                        int i16 = incomeTaxExceededCertificateInfoAnswer == null ? -1 : b.f72845b[incomeTaxExceededCertificateInfoAnswer.ordinal()];
                        if (i16 == -1) {
                            aVar = null;
                        } else {
                            if (i16 == 1) {
                                aVar2 = KrusInput.a.ALREADY_DECLARED;
                            } else if (i16 == 2) {
                                aVar2 = KrusInput.a.ATTACHED_DECLARATION;
                            } else if (i16 == 3) {
                                aVar2 = KrusInput.a.WILL_BE_DECLARED;
                            } else {
                                if (i16 != 4) {
                                    throw new p();
                                }
                                aVar = null;
                            }
                            aVar = aVar2;
                        }
                        TaxOfficeModel taxOffice = krusData.getTaxOffice();
                        insuranceInput = new InsuranceInput(new KrusInput(z15, z16, z17, name, boolValueOf, aVar, taxOffice != null ? new KrusInput.TaxOfficeInput(taxOffice.getBuildingNumber(), taxOffice.getCity(), taxOffice.getName(), taxOffice.getPostalCode(), taxOffice.getStreetName()) : null), null);
                    }
                    return new dx.i.Right(insuranceInput);
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
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
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private final String m(CompanyData companyData, Params params) {
        CompanyPkdCode selectedPkdCode;
        String code;
        PkdCodeMainSelectionContractData pkdCodeMainSelectionContractData = params.getData().getPkdCodeMainSelectionContractData();
        if (pkdCodeMainSelectionContractData != null && (selectedPkdCode = pkdCodeMainSelectionContractData.getSelectedPkdCode()) != null && (code = selectedPkdCode.getCode()) != null) {
            return code;
        }
        CompanyCategory mainCategory = companyData.getMainCategory();
        if (mainCategory != null) {
            return mainCategory.getCode();
        }
        return null;
    }

    private final SuspensionManagementDetails q(jg1.d dVar, CompanyData companyData) {
        SuspensionPeriod suspensionPeriod;
        if (dVar instanceof jg1.d.Suspension) {
            suspensionPeriod = ((jg1.d.Suspension) dVar).getSuspensionPeriod();
        } else {
            if (!(dVar instanceof jg1.d.Resumption)) {
                throw new p();
            }
            suspensionPeriod = new SuspensionPeriod(((jg1.d.Resumption) dVar).getResumptionDate().getStartResumptionDate(), null);
        }
        return new SuspensionManagementDetails(suspensionPeriod, h(companyData));
    }

    @Override // er.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public dx.i<dx.b, CompanyManagementApplication> b(Params params) {
        Object objB;
        ArrayList arrayList;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    CompanyData companyData = params.getData().getCompanyDetailsContractData().getCompanyData();
                    if (companyData == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("companyData is null")));
                        throw new oq.g();
                    }
                    CompanyApplicationCitizenData citizenData = params.getData().getSuspensionPeriod().getKnownUserDataModel().getCitizenData();
                    hb1.c homeAddress = params.getData().getHomeAddressContractData().getHomeAddress();
                    boolean zA = s.a(companyData.getCategoryEdition());
                    String strM = m(companyData, params);
                    ez.c cVar = this.dateConverter;
                    String birthDate = citizenData.getBirthDate();
                    if (birthDate == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("birthDate is null")));
                        throw new oq.g();
                    }
                    LocalDate localDateO = cVar.o(birthDate, fz.c.DOTTED);
                    if (localDateO == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("birthDate parsing failed")));
                        throw new oq.g();
                    }
                    String firstName = citizenData.getFirstName();
                    String gender = citizenData.getGender();
                    if (gender == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("gender is null")));
                        throw new oq.g();
                    }
                    String pesel = citizenData.getPesel();
                    CompanyApplicationAddress companyApplicationAddressE = e(homeAddress);
                    if (companyApplicationAddressE == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("residentialAddress is null")));
                        throw new oq.g();
                    }
                    SuspensionApplicantDetails suspensionApplicantDetails = new SuspensionApplicantDetails(localDateO, firstName, gender, companyData.getNip(), pesel, companyData.getRegon(), companyApplicationAddressE, citizenData.getSurname(), citizenData.getSecondName());
                    SuspensionManagementDetails suspensionManagementDetailsQ = q(params.getData().getSuspensionPeriod(), companyData);
                    String headName = params.getData().getTaxOfficeContractData().getOffice().getHeadName();
                    String entryId = companyData.getEntryId();
                    String name = companyData.getName();
                    InsuranceInput insuranceInput = (InsuranceInput) aVar.a(l(params.getData().getSocialInsuranceSelectionContractData().getSelectedInsurance(), params.getData().getKrusData()));
                    String companyAbbreviatedName = companyData.getCompanyAbbreviatedName();
                    if (companyAbbreviatedName == null) {
                        CompanyShortNameContractData companyShortNameContractData = params.getData().getCompanyShortNameContractData();
                        companyAbbreviatedName = companyShortNameContractData != null ? companyShortNameContractData.getShortName() : null;
                        if (companyAbbreviatedName == null) {
                            aVar.b(new dx.b.Generic(new NullPointerException("abbreviatedName is null")));
                            throw new oq.g();
                        }
                    }
                    String str = companyAbbreviatedName;
                    List<CompanyCategory> listC = c(companyData, params, strM);
                    if (!zA) {
                        listC = null;
                    }
                    if (listC != null) {
                        List<CompanyCategory> list = listC;
                        ArrayList arrayList2 = new ArrayList(v.y(list, 10));
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((CompanyCategory) it.next()).getCode());
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    EdorAddressData edorAddressData = params.getData().getEdorAddressData();
                    SuspensionCompanyDetails suspensionCompanyDetails = new SuspensionCompanyDetails(headName, entryId, name, insuranceInput, str, arrayList, edorAddressData != null ? (ElectronicDeliveryInput) aVar.a(i(edorAddressData)) : null, zA ? strM : null, f(params.getData().getContactInfoContractData()));
                    List listR = v.r(params.getAttachment());
                    KrusData krusData = params.getData().getKrusData();
                    return new dx.i.Right(new CompanyManagementApplication(suspensionApplicantDetails, suspensionManagementDetailsQ, suspensionCompanyDetails, (krusData != null ? krusData.getIncomeTaxExceededCertificateInfoAnswer() : null) == de1.c.ATTACH_AS_ATTACHMENT ? listR : null));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
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
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }
}
