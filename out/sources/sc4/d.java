package sc4;

import fk0.BECategoryEditionAlert;
import fk0.BECompanyActivityCategories;
import fk0.BECompanyActivityCategory;
import fk0.BECompanyAddresses;
import fk0.BECompanyCategory;
import fk0.BECompanyData;
import fk0.BECompanyDataAlert;
import fk0.BECompanyDetails;
import fk0.BECompanyInfo;
import fk0.BECompanyOwner;
import fk0.BECompanyPrintout;
import fk0.BECompanySuspensionOptions;
import fk0.BEElectronicDeliveryNonPublicSupplier;
import fk0.BEElectronicDeliveryNonPublicSuppliers;
import fk0.BELink;
import fk0.BESocialInsuranceFund;
import fk0.BESocialInsuranceFunds;
import fk0.BETaxOffice;
import fk0.BETaxOffices;
import fk0.c0;
import fk0.i0;
import fk0.j0;
import fk0.u;
import fk0.z;
import hb1.BECompanyPkdCode;
import hb1.TaxOffices;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ld1.CompanyPkdCode;
import ld1.KrusOfficeModel;
import ld1.TaxOfficeModel;
import ma1.Certificate;
import ma1.CompanyAddresses;
import ma1.CompanyCategory;
import ma1.CompanyCategoryEditionAlert;
import ma1.CompanyData;
import ma1.CompanyInfo;
import ma1.CompanyInfoAlert;
import ma1.CompanyLink;
import ma1.CompanyOwner;
import ma1.j;
import ma1.r;
import na1.CompanySuspensionOptions;
import oq.p;
import p071kotlin.Metadata;
import pd1.NonPublicSupplier;
import pq.v;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020$H\u0002¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010*\u001a\u00020)*\u00020(H\u0002¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010.\u001a\u00020-*\u00020,H\u0002¢\u0006\u0004\b.\u0010/\u001a\u0013\u00102\u001a\u000201*\u000200H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00106\u001a\u000205*\u000204H\u0002¢\u0006\u0004\b6\u00107\u001a\u0013\u0010:\u001a\u000209*\u000208H\u0002¢\u0006\u0004\b:\u0010;\u001a\u0013\u0010>\u001a\u00020=*\u00020<H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0013\u0010B\u001a\u00020A*\u00020@H\u0002¢\u0006\u0004\bB\u0010C\u001a\u0013\u0010F\u001a\u00020E*\u00020DH\u0002¢\u0006\u0004\bF\u0010G\u001a\u0013\u0010J\u001a\u00020I*\u00020HH\u0002¢\u0006\u0004\bJ\u0010K\u001a\u0013\u0010N\u001a\u00020M*\u00020LH\u0002¢\u0006\u0004\bN\u0010O\u001a\u0019\u0010S\u001a\b\u0012\u0004\u0012\u00020R0Q*\u00020PH\u0002¢\u0006\u0004\bS\u0010T\u001a\u0019\u0010W\u001a\b\u0012\u0004\u0012\u00020V0Q*\u00020UH\u0002¢\u0006\u0004\bW\u0010X¨\u0006Y"}, d2 = {"Lfk0/c0;", "Lma1/j;", "v", "(Lfk0/c0;)Lma1/j;", "Lfk0/b0;", "Lma1/g;", "s", "(Lfk0/b0;)Lma1/g;", "Lfk0/i0;", "Lma1/p;", "y", "(Lfk0/i0;)Lma1/p;", "Lfk0/e0;", "Lma1/m;", "x", "(Lfk0/e0;)Lma1/m;", "Lfk0/w;", "Lma1/c;", "o", "(Lfk0/w;)Lma1/c;", "Lfk0/v;", "Lma1/b;", "n", "(Lfk0/v;)Lma1/b;", "Lfk0/p;", "Lma1/d;", "p", "(Lfk0/p;)Lma1/d;", "Lfk0/u;", "Lma1/r;", "z", "(Lfk0/u;)Lma1/r;", "Lfk0/z;", "Lma1/i;", "u", "(Lfk0/z;)Lma1/i;", "Lfk0/q0;", "Lma1/k;", "w", "(Lfk0/q0;)Lma1/k;", "Lfk0/y;", "Lma1/h;", "t", "(Lfk0/y;)Lma1/h;", "Lfk0/x;", "Lma1/e;", "q", "(Lfk0/x;)Lma1/e;", "Lfk0/j0;", "Lna1/a;", "A", "(Lfk0/j0;)Lna1/a;", "Lfk0/k0;", "Lna1/b;", "B", "(Lfk0/k0;)Lna1/b;", "Lfk0/a0;", "Lma1/f;", "r", "(Lfk0/a0;)Lma1/f;", "Lfk0/f0;", "Lma1/a;", "m", "(Lfk0/f0;)Lma1/a;", "Lfk0/t;", "Lld1/g;", "k", "(Lfk0/t;)Lld1/g;", "Lfk0/s;", "Lhb1/b;", "g", "(Lfk0/s;)Lhb1/b;", "Lfk0/j1;", "Lld1/r;", "l", "(Lfk0/j1;)Lld1/r;", "Lfk0/k1;", "Lhb1/j;", "h", "(Lfk0/k1;)Lhb1/j;", "Lfk0/f1;", "", "Lld1/i;", "j", "(Lfk0/f1;)Ljava/util/List;", "Lfk0/n0;", "Lpd1/a;", "i", "(Lfk0/n0;)Ljava/util/List;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f180194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f180195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f180196d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int[] f180197e;

        static {
            int[] iArr = new int[c0.values().length];
            try {
                iArr[c0.COMPANY_EXISTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c0.COMPANY_APPLICATION_ORDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c0.COMPANY_APPLICATION_REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c0.COMPANY_APPLICATION_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c0.COMPANY_UNAVAILABLE_BECAUSE_OF_AGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c0.COMPANY_UNAVAILABLE_BECAUSE_OF_MISSING_TRUSTED_PROFILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c0.COMPANY_UNAVAILABLE_BECAUSE_OF_UNSUPPORTED_MAIN_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c0.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f180193a = iArr;
            int[] iArr2 = new int[i0.values().length];
            try {
                iArr2[i0.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[i0.SUSPENDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[i0.PENDING_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[i0.PARTNERSHIP_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[i0.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            f180194b = iArr2;
            int[] iArr3 = new int[u.values().length];
            try {
                iArr3[u.EDITION_2007.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[u.EDITION_2025.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[u.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            f180195c = iArr3;
            int[] iArr4 = new int[z.values().length];
            try {
                iArr4[z.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[z.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[z.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[z.SUCCESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[z.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused21) {
            }
            f180196d = iArr4;
            int[] iArr5 = new int[j0.values().length];
            try {
                iArr5[j0.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[j0.RESUME_WITH_DATA_ADJUSTMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[j0.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[j0.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            f180197e = iArr5;
        }
    }

    private static final na1.a A(j0 j0Var) {
        int i15 = a.f180197e[j0Var.ordinal()];
        if (i15 == 1) {
            return na1.a.SUSPEND;
        }
        if (i15 == 2) {
            return na1.a.RESUME_WITH_DATA_ADJUSTMENT;
        }
        if (i15 == 3) {
            return na1.a.NONE;
        }
        if (i15 == 4) {
            return na1.a.UNKNOWN;
        }
        throw new p();
    }

    private static final CompanySuspensionOptions B(BECompanySuspensionOptions bECompanySuspensionOptions) {
        return new CompanySuspensionOptions(A(bECompanySuspensionOptions.getAvailableAction()), bECompanySuspensionOptions.getActionBlocked(), bECompanySuspensionOptions.getMinSuspensionDays());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BECompanyPkdCode g(BECompanyActivityCategories bECompanyActivityCategories) {
        List<BECompanyActivityCategory> listA = bECompanyActivityCategories.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(k((BECompanyActivityCategory) it.next()));
        }
        return new BECompanyPkdCode(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxOffices h(BETaxOffices bETaxOffices) {
        List<BETaxOffice> listA = bETaxOffices.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(l((BETaxOffice) it.next()));
        }
        return new TaxOffices(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<NonPublicSupplier> i(BEElectronicDeliveryNonPublicSuppliers bEElectronicDeliveryNonPublicSuppliers) {
        List<BEElectronicDeliveryNonPublicSupplier> listA = bEElectronicDeliveryNonPublicSuppliers.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new NonPublicSupplier(((BEElectronicDeliveryNonPublicSupplier) it.next()).getName()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KrusOfficeModel> j(BESocialInsuranceFunds bESocialInsuranceFunds) {
        List<BESocialInsuranceFund> listA = bESocialInsuranceFunds.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        for (BESocialInsuranceFund bESocialInsuranceFund : listA) {
            arrayList.add(new KrusOfficeModel(bESocialInsuranceFund.getBuildingNumber(), bESocialInsuranceFund.getCity(), bESocialInsuranceFund.getDescription(), bESocialInsuranceFund.getName(), bESocialInsuranceFund.getPostalCode(), bESocialInsuranceFund.getStreetName()));
        }
        return arrayList;
    }

    private static final CompanyPkdCode k(BECompanyActivityCategory bECompanyActivityCategory) {
        return new CompanyPkdCode(bECompanyActivityCategory.getCode(), bECompanyActivityCategory.getName(), bECompanyActivityCategory.getDescription(), bECompanyActivityCategory.getSectionCode());
    }

    private static final TaxOfficeModel l(BETaxOffice bETaxOffice) {
        return new TaxOfficeModel(bETaxOffice.getBuildingNumber(), bETaxOffice.getCity(), bETaxOffice.getName(), bETaxOffice.getPostalCode(), bETaxOffice.getStreetName(), bETaxOffice.getHeadName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Certificate m(BECompanyPrintout bECompanyPrintout) {
        return new Certificate(bECompanyPrintout.getDocumentBase64());
    }

    private static final CompanyAddresses n(BECompanyAddresses bECompanyAddresses) {
        return new CompanyAddresses(bECompanyAddresses.getCorrespondenceAddress(), bECompanyAddresses.getElectronicDeliveryAddressV2(), bECompanyAddresses.getMainAddress(), bECompanyAddresses.a());
    }

    private static final CompanyCategory o(BECompanyCategory bECompanyCategory) {
        return new CompanyCategory(bECompanyCategory.getCode(), bECompanyCategory.getName());
    }

    private static final CompanyCategoryEditionAlert p(BECategoryEditionAlert bECategoryEditionAlert) {
        return new CompanyCategoryEditionAlert(bECategoryEditionAlert.getLinkName(), bECategoryEditionAlert.getMessage(), bECategoryEditionAlert.getUrl());
    }

    private static final CompanyData q(BECompanyData bECompanyData) {
        CompanyCategory companyCategoryO;
        CompanyCategoryEditionAlert companyCategoryEditionAlert;
        String companyName = bECompanyData.getCompanyName();
        ma1.p pVarY = y(bECompanyData.getCompanyStatus());
        String companyStatusDescription = bECompanyData.getCompanyStatusDescription();
        String entryId = bECompanyData.getEntryId();
        boolean hasNoEmail = bECompanyData.getHasNoEmail();
        CompanyOwner companyOwnerX = x(bECompanyData.getOwner());
        List<BECompanyCategory> listP = bECompanyData.p();
        ArrayList arrayList = new ArrayList(v.y(listP, 10));
        Iterator<T> it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(o((BECompanyCategory) it.next()));
        }
        String categoryLabelPostfix = bECompanyData.getCategoryLabelPostfix();
        String startDate = bECompanyData.getStartDate();
        CompanyAddresses companyAddressesN = n(bECompanyData.getAddresses());
        String regon = bECompanyData.getRegon();
        String nip = bECompanyData.getNip();
        String email = bECompanyData.getEmail();
        String websiteUrl = bECompanyData.getWebsiteUrl();
        String phoneNumber = bECompanyData.getPhoneNumber();
        BECompanyCategory mainCategory = bECompanyData.getMainCategory();
        if (mainCategory != null) {
            companyCategoryO = o(mainCategory);
            companyCategoryEditionAlert = null;
        } else {
            companyCategoryO = null;
            companyCategoryEditionAlert = null;
        }
        String suspensionFromDate = bECompanyData.getSuspensionFromDate();
        CompanyCategoryEditionAlert companyCategoryEditionAlert2 = companyCategoryEditionAlert;
        String suspensionToDate = bECompanyData.getSuspensionToDate();
        String resumptionDate = bECompanyData.getResumptionDate();
        CompanyCategoryEditionAlert companyCategoryEditionAlertP = companyCategoryEditionAlert2;
        String endDate = bECompanyData.getEndDate();
        BECategoryEditionAlert categoryEditionAlert = bECompanyData.getCategoryEditionAlert();
        if (categoryEditionAlert != null) {
            companyCategoryEditionAlertP = p(categoryEditionAlert);
        }
        r rVarZ = z(bECompanyData.getCategoryEdition());
        String companyAbbreviatedName = bECompanyData.getCompanyAbbreviatedName();
        List<BECompanyDataAlert> listM = bECompanyData.m();
        ArrayList arrayList2 = new ArrayList(v.y(listM, 10));
        Iterator<T> it4 = listM.iterator();
        while (it4.hasNext()) {
            arrayList2.add(t((BECompanyDataAlert) it4.next()));
        }
        return new CompanyData(companyName, pVarY, companyStatusDescription, entryId, hasNoEmail, companyOwnerX, arrayList, categoryLabelPostfix, startDate, companyAddressesN, regon, nip, email, websiteUrl, phoneNumber, companyCategoryO, suspensionFromDate, suspensionToDate, resumptionDate, endDate, companyCategoryEditionAlertP, rVarZ, companyAbbreviatedName, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ma1.f r(BECompanyDetails bECompanyDetails) {
        CompanyInfo companyInfoS = s(bECompanyDetails.getInfo());
        boolean ownerAdult = bECompanyDetails.getOwnerAdult();
        BECompanyData companyData = bECompanyDetails.getCompanyData();
        CompanyData companyDataQ = companyData != null ? q(companyData) : null;
        BECompanySuspensionOptions suspensionOptions = bECompanyDetails.getSuspensionOptions();
        return new ma1.f(companyInfoS, ownerAdult, companyDataQ, suspensionOptions != null ? B(suspensionOptions) : null);
    }

    private static final CompanyInfo s(BECompanyInfo bECompanyInfo) {
        return new CompanyInfo(v(bECompanyInfo.getStatus()), bECompanyInfo.getTitle(), bECompanyInfo.getMessage());
    }

    private static final CompanyInfoAlert t(BECompanyDataAlert bECompanyDataAlert) {
        String message = bECompanyDataAlert.getMessage();
        ma1.i iVarU = u(bECompanyDataAlert.getType());
        BELink link = bECompanyDataAlert.getLink();
        return new CompanyInfoAlert(message, iVarU, link != null ? w(link) : null);
    }

    private static final ma1.i u(z zVar) {
        int i15 = a.f180196d[zVar.ordinal()];
        if (i15 == 1) {
            return ma1.i.INFO;
        }
        if (i15 == 2) {
            return ma1.i.WARNING;
        }
        if (i15 == 3) {
            return ma1.i.ERROR;
        }
        if (i15 == 4) {
            return ma1.i.SUCCESS;
        }
        if (i15 == 5) {
            return ma1.i.UNKNOWN;
        }
        throw new p();
    }

    private static final j v(c0 c0Var) {
        switch (a.f180193a[c0Var.ordinal()]) {
            case 1:
                return j.COMPANY_EXISTS;
            case 2:
                return j.COMPANY_APPLICATION_ORDERED;
            case 3:
                return j.COMPANY_APPLICATION_REJECTED;
            case 4:
                return j.COMPANY_APPLICATION_AVAILABLE;
            case 5:
                return j.COMPANY_UNAVAILABLE_BECAUSE_OF_AGE;
            case 6:
                return j.COMPANY_UNAVAILABLE_BECAUSE_OF_MISSING_TRUSTED_PROFILE;
            case 7:
                return j.COMPANY_UNAVAILABLE_BECAUSE_OF_UNSUPPORTED_MAIN_DOCUMENT;
            case 8:
                return j.UNKNOWN;
            default:
                throw new p();
        }
    }

    private static final CompanyLink w(BELink bELink) {
        return new CompanyLink(bELink.getName(), bELink.getUrl());
    }

    private static final CompanyOwner x(BECompanyOwner bECompanyOwner) {
        return new CompanyOwner(bECompanyOwner.getFirstName(), bECompanyOwner.getLastName(), bECompanyOwner.getPesel());
    }

    private static final ma1.p y(i0 i0Var) {
        int i15 = a.f180194b[i0Var.ordinal()];
        if (i15 == 1) {
            return ma1.p.ACTIVE;
        }
        if (i15 == 2) {
            return ma1.p.SUSPENDED;
        }
        if (i15 == 3) {
            return ma1.p.PENDING_START;
        }
        if (i15 == 4) {
            return ma1.p.PARTNERSHIP_ONLY;
        }
        if (i15 == 5) {
            return ma1.p.UNKNOWN;
        }
        throw new p();
    }

    private static final r z(u uVar) {
        int i15 = a.f180195c[uVar.ordinal()];
        if (i15 == 1) {
            return r.EDITION_2007;
        }
        if (i15 == 2) {
            return r.EDITION_2025;
        }
        if (i15 == 3) {
            return r.UNKNOWN;
        }
        throw new p();
    }
}
