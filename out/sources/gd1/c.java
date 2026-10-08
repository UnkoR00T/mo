package gd1;

import de1.KrusData;
import de1.SocialInsuranceQuestions;
import fr.t;
import hb1.CompanyNameForm;
import hb1.PostOfficeBoxData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jb1.AccountingInput;
import jb1.ApplicantDetails;
import jb1.CompanyApplication;
import jb1.CompanyDetails;
import jb1.ContactDetailsInput;
import jb1.CorrespondenceInput;
import jb1.ElectronicDeliveryInput;
import jb1.InsuranceInput;
import jb1.KrusInput;
import jb1.NonPublicSupplierInput;
import jb1.PostOfficeBoxAddress;
import jb1.PublicSupplierInput;
import jb1.ZusInput;
import jd1.OpenCompanyWizardData;
import lc1.CorrespondenceAddressSelectionContractData;
import ld1.CompanyApplicationAddress;
import ld1.CompanyPkdCode;
import ld1.KnownUserDataModel;
import ld1.KrusOfficeModel;
import ld1.StatementAttachment;
import ld1.TaxOfficeModel;
import lf1.TaxOfficeContractData;
import oc1.CorrespondencePostOfficeBoxContractData;
import p071kotlin.Metadata;
import pq.v;
import rd1.CreatePublicAddressData;
import rd1.EdorAddressData;
import rd1.NotPublicAddressData;
import sb1.AccountingDocumentAddressSelectionContractData;
import st3.AddressTerytDetail;
import tc1.IncomeTaxFormSelectionContractData;
import wb1.AccountingDocumentSelectionContractData;
import zb1.BusinessAddressSelectionContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u00012B\u0011\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00120\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001e0\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J)\u0010(\u001a\u00020'2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u001b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010.J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010/\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lgd1/c;", "Lxw/f;", "Lgd1/c$a;", "Ldx/i;", "Ldx/b;", "Ljb1/c;", "Lez/c;", "dateConverter", "<init>", "(Lez/c;)V", "Lsb1/b;", "accountingAddressData", "Llf1/b;", "taxOfficeContractData", "Ltc1/b;", "incomeTaxFormSelectionContractData", "Lwb1/b;", "accountingDocumentSelectionContractData", "Ljb1/a;", "c", "(Lsb1/b;Llf1/b;Ltc1/b;Lwb1/b;)Ldx/i;", "Lrd1/b;", "edorAddressData", "Ljb1/g;", "h", "(Lrd1/b;)Ldx/i;", "Ljava/time/LocalDate;", "zusPaymentStart", "Lde1/e;", "krusData", "Ljb1/h;", "i", "(Ljava/time/LocalDate;Lde1/e;)Ldx/i;", "Llc1/b;", "correspondenceAddressSelectionContractData", "Loc1/b;", "postOfficeBoxContractData", "Lld1/h;", "knownUserDataModel", "Ljb1/f;", "f", "(Llc1/b;Loc1/b;Lld1/h;)Ljb1/f;", "Lhb1/c;", "companyApplicationAddressObject", "Lld1/c;", "e", "(Lhb1/c;)Lld1/c;", "params", "l", "(Lgd1/c$a;)Ldx/i;", "a", "Lez/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements xw.f<Params, dx.i<? extends dx.b, ? extends CompanyApplication>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: gd1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgd1/c$a;", "", "Ljd1/a;", "data", "Lld1/n;", "attachment", "<init>", "(Ljd1/a;Lld1/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljd1/a;", "b", "()Ljd1/a;", "Lld1/n;", "()Lld1/n;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OpenCompanyWizardData data;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final StatementAttachment attachment;

        public Params(OpenCompanyWizardData openCompanyWizardData, StatementAttachment statementAttachment) {
            this.data = openCompanyWizardData;
            this.attachment = statementAttachment;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final StatementAttachment getAttachment() {
            return this.attachment;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final OpenCompanyWizardData getData() {
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
        public static final /* synthetic */ int[] f71933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f71934b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f71935c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f71936d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f71937e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int[] f71938f;

        static {
            int[] iArr = new int[kb1.a.values().length];
            try {
                iArr[kb1.a.BUSINESS_ADDRESS_AVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71933a = iArr;
            int[] iArr2 = new int[sc1.q.a.values().length];
            try {
                iArr2[sc1.q.a.GENERAL_TAX.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[sc1.q.a.FLAT_TAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[sc1.q.a.LUMP_TAX.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[sc1.q.a.NOT_DECLARED_YET.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[sc1.q.a.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            f71934b = iArr2;
            int[] iArr3 = new int[rd1.c.values().length];
            try {
                iArr3[rd1.c.CREATE_NEW_ADDRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[rd1.c.OWN_NOT_PUBLIC_ADDRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[rd1.c.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f71935c = iArr3;
            int[] iArr4 = new int[de1.g.values().length];
            try {
                iArr4[de1.g.YES.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            f71936d = iArr4;
            int[] iArr5 = new int[de1.d.values().length];
            try {
                iArr5[de1.d.EXCEEDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            f71937e = iArr5;
            int[] iArr6 = new int[de1.c.values().length];
            try {
                iArr6[de1.c.SUBMITTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr6[de1.c.ATTACH_AS_ATTACHMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr6[de1.c.SUBMIT_LATER.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[de1.c.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            f71938f = iArr6;
        }
    }

    public c(ez.c cVar) {
        this.dateConverter = cVar;
    }

    private final dx.i<dx.b, AccountingInput> c(AccountingDocumentAddressSelectionContractData accountingAddressData, TaxOfficeContractData taxOfficeContractData, IncomeTaxFormSelectionContractData incomeTaxFormSelectionContractData, AccountingDocumentSelectionContractData accountingDocumentSelectionContractData) {
        Object objB;
        jb1.n nVar;
        String accountingOfficeName;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    String nipNumber = null;
                    CompanyApplicationAddress companyApplicationAddressE = e(accountingAddressData != null ? accountingAddressData.getAccountingDocumentAddress() : null);
                    if (companyApplicationAddressE == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("documentationStorageAddress is null")));
                        throw new oq.g();
                    }
                    String headName = taxOfficeContractData.getOffice().getHeadName();
                    int i15 = b.f71934b[incomeTaxFormSelectionContractData.getIncomeTaxForm().ordinal()];
                    if (i15 == 1) {
                        nVar = jb1.n.ON_GENERAL_TERMS;
                    } else if (i15 == 2) {
                        nVar = jb1.n.FLAT;
                    } else if (i15 == 3) {
                        nVar = jb1.n.LUMP_SUM_FROM_RECORDED_REVENUES;
                    } else if (i15 == 4) {
                        nVar = jb1.n.NOT_DEFINED;
                    } else {
                        if (i15 != 5) {
                            throw new oq.p();
                        }
                        nVar = jb1.n.UNKNOWN;
                    }
                    jb1.n nVar2 = nVar;
                    ib1.b accountingDocumentPlace = accountingDocumentSelectionContractData.getAccountingDocumentPlace();
                    if (accountingDocumentPlace instanceof ib1.b.AccountingOffice) {
                        accountingOfficeName = ((ib1.b.AccountingOffice) accountingDocumentPlace).getAccountingOfficeName();
                    } else {
                        if (!t.c(accountingDocumentPlace, ib1.b.C2150b.f90722b)) {
                            throw new oq.p();
                        }
                        accountingOfficeName = null;
                    }
                    ib1.b accountingDocumentPlace2 = accountingDocumentSelectionContractData.getAccountingDocumentPlace();
                    if (accountingDocumentPlace2 instanceof ib1.b.AccountingOffice) {
                        nipNumber = ((ib1.b.AccountingOffice) accountingDocumentPlace2).getNipNumber();
                    } else if (!t.c(accountingDocumentPlace2, ib1.b.C2150b.f90722b)) {
                        throw new oq.p();
                    }
                    return new dx.i.Right(new AccountingInput(companyApplicationAddressE, headName, nVar2, accountingOfficeName, nipNumber));
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
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private final CompanyApplicationAddress e(hb1.c companyApplicationAddressObject) {
        hb1.a aVarA = companyApplicationAddressObject != null ? hb1.d.a(companyApplicationAddressObject) : null;
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
            throw new oq.p();
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

    private final CorrespondenceInput f(CorrespondenceAddressSelectionContractData correspondenceAddressSelectionContractData, CorrespondencePostOfficeBoxContractData postOfficeBoxContractData, KnownUserDataModel knownUserDataModel) {
        PostOfficeBoxData postOfficeBoxData;
        hb1.c correspondenceAddress = correspondenceAddressSelectionContractData.getCorrespondenceAddress();
        PostOfficeBoxAddress postOfficeBoxAddress = null;
        CompanyApplicationAddress companyApplicationAddressE = correspondenceAddress != null ? e(correspondenceAddress) : null;
        if (postOfficeBoxContractData != null && (postOfficeBoxData = postOfficeBoxContractData.getPostOfficeBoxData()) != null) {
            postOfficeBoxAddress = new PostOfficeBoxAddress(postOfficeBoxData.getCity(), postOfficeBoxData.getBoxNumber(), postOfficeBoxData.getPostalCode(), postOfficeBoxData.getPostOfficeName());
        }
        return new CorrespondenceInput(companyApplicationAddressE, postOfficeBoxAddress, ld1.f.a(knownUserDataModel.getCitizenData()));
    }

    private final dx.i<dx.b, ElectronicDeliveryInput> h(EdorAddressData edorAddressData) {
        Object objB;
        ElectronicDeliveryInput electronicDeliveryInput;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    rd1.c selection = edorAddressData.getSelection();
                    int i15 = selection == null ? -1 : b.f71935c[selection.ordinal()];
                    if (i15 != -1) {
                        if (i15 == 1) {
                            CreatePublicAddressData createPublicAddressData = edorAddressData.getCreatePublicAddressData();
                            String email = createPublicAddressData != null ? createPublicAddressData.getEmail() : null;
                            if (email == null) {
                                aVar.b(new dx.b.Generic(new NullPointerException("electronicDeliveryAddress - createPublicAddressData is null")));
                                throw new oq.g();
                            }
                            electronicDeliveryInput = new ElectronicDeliveryInput(null, new PublicSupplierInput(email));
                        } else if (i15 == 2) {
                            NotPublicAddressData notPublicAddressData = edorAddressData.getNotPublicAddressData();
                            String address = notPublicAddressData != null ? notPublicAddressData.getAddress() : null;
                            if (address == null) {
                                aVar.b(new dx.b.Generic(new NullPointerException("electronicDeliveryAddress - notPublicAddressData is null")));
                                throw new oq.g();
                            }
                            NotPublicAddressData notPublicAddressData2 = edorAddressData.getNotPublicAddressData();
                            String providerShortcut = notPublicAddressData2 != null ? notPublicAddressData2.getProviderShortcut() : null;
                            if (providerShortcut == null) {
                                aVar.b(new dx.b.Generic(new NullPointerException("electronicDeliveryAddress - notPublicAddressData is null")));
                                throw new oq.g();
                            }
                            electronicDeliveryInput = new ElectronicDeliveryInput(new NonPublicSupplierInput(address, providerShortcut), null);
                        } else if (i15 != 3) {
                            throw new oq.p();
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
                            throw new oq.p();
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

    private final dx.i<dx.b, InsuranceInput> i(LocalDate zusPaymentStart, KrusData krusData) {
        Object objB;
        InsuranceInput insuranceInput;
        KrusInput.a aVar;
        KrusInput.a aVar2;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar3 = new ex.a();
                    boolean z15 = krusData != null;
                    if (z15) {
                        SocialInsuranceQuestions socialInsuranceQuestions = krusData.getSocialInsuranceQuestions();
                        de1.g thirdAnswer = socialInsuranceQuestions != null ? socialInsuranceQuestions.getThirdAnswer() : null;
                        boolean z16 = (thirdAnswer == null ? -1 : b.f71936d[thirdAnswer.ordinal()]) == 1;
                        SocialInsuranceQuestions socialInsuranceQuestions2 = krusData.getSocialInsuranceQuestions();
                        de1.g secondAnswer = socialInsuranceQuestions2 != null ? socialInsuranceQuestions2.getSecondAnswer() : null;
                        boolean z17 = (secondAnswer == null ? -1 : b.f71936d[secondAnswer.ordinal()]) == 1;
                        SocialInsuranceQuestions socialInsuranceQuestions3 = krusData.getSocialInsuranceQuestions();
                        de1.g firstAnswer = socialInsuranceQuestions3 != null ? socialInsuranceQuestions3.getFirstAnswer() : null;
                        boolean z18 = (firstAnswer == null ? -1 : b.f71936d[firstAnswer.ordinal()]) == 1;
                        KrusOfficeModel krusOffice = krusData.getKrusOffice();
                        String name = krusOffice != null ? krusOffice.getName() : null;
                        if (name == null) {
                            aVar3.b(new dx.b.Generic(new NullPointerException("krusOffice name is null")));
                            throw new oq.g();
                        }
                        de1.d incomeTaxExceededInfo = krusData.getIncomeTaxExceededInfo();
                        Boolean boolValueOf = Boolean.valueOf((incomeTaxExceededInfo == null ? -1 : b.f71937e[incomeTaxExceededInfo.ordinal()]) == 1);
                        de1.c incomeTaxExceededCertificateInfoAnswer = krusData.getIncomeTaxExceededCertificateInfoAnswer();
                        int i15 = incomeTaxExceededCertificateInfoAnswer == null ? -1 : b.f71938f[incomeTaxExceededCertificateInfoAnswer.ordinal()];
                        if (i15 == -1) {
                            aVar = null;
                        } else {
                            if (i15 == 1) {
                                aVar2 = KrusInput.a.ALREADY_DECLARED;
                            } else if (i15 == 2) {
                                aVar2 = KrusInput.a.ATTACHED_DECLARATION;
                            } else if (i15 == 3) {
                                aVar2 = KrusInput.a.WILL_BE_DECLARED;
                            } else {
                                if (i15 != 4) {
                                    throw new oq.p();
                                }
                                aVar = null;
                            }
                            aVar = aVar2;
                        }
                        TaxOfficeModel taxOffice = krusData.getTaxOffice();
                        insuranceInput = new InsuranceInput(new KrusInput(z16, z17, z18, name, boolValueOf, aVar, taxOffice != null ? new KrusInput.TaxOfficeInput(taxOffice.getBuildingNumber(), taxOffice.getCity(), taxOffice.getName(), taxOffice.getPostalCode(), taxOffice.getStreetName()) : null), null);
                    } else {
                        if (z15) {
                            throw new oq.p();
                        }
                        insuranceInput = new InsuranceInput(null, new ZusInput(zusPaymentStart));
                    }
                    return new dx.i.Right(insuranceInput);
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
                            throw new oq.p();
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

    @Override // er.l
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public dx.i<dx.b, CompanyApplication> b(Params params) {
        Object objB;
        BusinessAddressSelectionContractData businessAddressSelectionContractData;
        hb1.c businessAddress;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    CompanyNameForm companyNameForm = params.getData().getCompanyNameContractData().getCompanyNameForm();
                    if (companyNameForm == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("companyNameForm is null")));
                        throw new oq.g();
                    }
                    ez.c cVar = this.dateConverter;
                    String birthDate = params.getData().getKnownUserData().getCitizenData().getBirthDate();
                    if (birthDate == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("birthDate is null")));
                        throw new oq.g();
                    }
                    LocalDate localDateO = cVar.o(birthDate, fz.c.DOTTED);
                    if (localDateO == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("parsing string to local date birthDate is null")));
                        throw new oq.g();
                    }
                    String birthPlace = params.getData().getKnownUserData().getCitizenData().getBirthPlace();
                    if (birthPlace == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("birthPlace is null")));
                        throw new oq.g();
                    }
                    String firstName = params.getData().getKnownUserData().getCitizenData().getFirstName();
                    String gender = params.getData().getKnownUserData().getCitizenData().getGender();
                    if (gender == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("gender is null")));
                        throw new oq.g();
                    }
                    String mIdCardNumber = params.getData().getKnownUserData().getMIdCardNumber();
                    String pesel = params.getData().getKnownUserData().getCitizenData().getPesel();
                    CompanyApplicationAddress companyApplicationAddressE = e(params.getData().getHomeAddressContractData().getHomeAddress());
                    if (companyApplicationAddressE == null) {
                        aVar.b(new dx.b.Generic(new NullPointerException("residentialAddress is null")));
                        throw new oq.g();
                    }
                    ApplicantDetails applicantDetails = new ApplicantDetails(localDateO, birthPlace, firstName, gender, mIdCardNumber, pesel, companyApplicationAddressE, params.getData().getKnownUserData().getCitizenData().getSurname(), params.getData().getKnownUserData().getCitizenData().getFamilyName(), params.getData().getKnownUserData().getCitizenData().getFatherName(), params.getData().getKnownUserData().getCitizenData().getMotherName(), params.getData().getKnownUserData().getCitizenData().getSecondName());
                    String shortName = companyNameForm.getShortName();
                    AccountingInput accountingInput = (AccountingInput) aVar.a(c(params.getData().getAccountingDocumentAddressSelectionContractData(), params.getData().getTaxOfficeContractData(), params.getData().getIncomeTaxFormSelectionContractData(), params.getData().getAccountingDocumentSelectionContractData()));
                    List<CompanyPkdCode> listA = params.getData().getPkdCodeContractData().a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listA) {
                        if (!t.c((CompanyPkdCode) obj, params.getData().getPkdCodeMainSelectionContractData().getSelectedPkdCode())) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((CompanyPkdCode) it.next()).getCode());
                    }
                    LocalDate launchDateFrom = companyNameForm.getLaunchDateFrom();
                    ContactDetailsInput contactDetailsInput = new ContactDetailsInput(params.getData().getContactInfoContractData().getEmail(), params.getData().getContactInfoContractData().getPhoneNumber(), params.getData().getContactInfoContractData().getWebsiteUrl(), params.getData().getContactInfoContractData().getCeidgConsent(), params.getData().getContactInfoContractData().getPublishEmailConsent(), params.getData().getContactInfoContractData().getPublishPhoneNumberConsent(), params.getData().getContactInfoContractData().getPublishWebAddressConsent());
                    CorrespondenceInput correspondenceInputF = f(params.getData().getCorrespondenceAddressSelectionContractData(), params.getData().getPostOfficeBoxContractData(), params.getData().getKnownUserData());
                    ElectronicDeliveryInput electronicDeliveryInput = (ElectronicDeliveryInput) aVar.a(h(params.getData().getEdorAddressData()));
                    String fullName = companyNameForm.getFullName();
                    LocalDate launchDateFrom2 = companyNameForm.getLaunchDateFrom();
                    KrusData krusData = params.getData().getKrusData();
                    if (params.getData().getSocialInsuranceSelectionContractData().getSelectedInsurance() != lb1.a.KRUS) {
                        krusData = null;
                    }
                    CompanyDetails companyDetails = new CompanyDetails(shortName, accountingInput, arrayList2, launchDateFrom, contactDetailsInput, correspondenceInputF, electronicDeliveryInput, fullName, (InsuranceInput) aVar.a(i(launchDateFrom2, krusData)), params.getData().getPkdCodeMainSelectionContractData().getSelectedPkdCode().getCode(), Integer.parseInt(companyNameForm.getNumberOfEmployees()), (b.f71933a[params.getData().getBusinessAddressAvailabilityContractData().getBusinessAddressAvailabilityAnswer().ordinal()] != 1 || (businessAddressSelectionContractData = params.getData().getBusinessAddressSelectionContractData()) == null || (businessAddress = businessAddressSelectionContractData.getBusinessAddress()) == null) ? null : e(businessAddress));
                    StatementAttachment attachment = params.getAttachment();
                    List listE = attachment != null ? v.e(attachment) : null;
                    KrusData krusData2 = params.getData().getKrusData();
                    if ((krusData2 != null ? krusData2.getIncomeTaxExceededCertificateInfoAnswer() : null) != de1.c.ATTACH_AS_ATTACHMENT) {
                        listE = null;
                    }
                    return new dx.i.Right(new CompanyApplication(applicantDetails, companyDetails, listE, params.getData().getIsCompanyNewContactEnabled()));
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
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }
}
