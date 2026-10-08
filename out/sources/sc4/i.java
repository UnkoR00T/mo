package sc4;

import fk0.BEApplicationElectronicDelivery;
import fk0.BEApplicationKrusInput;
import fk0.BEApplicationTaxOfficeInput;
import fk0.BENonPublicSupplierInput;
import fk0.BEPublicSupplierInput;
import jb1.ElectronicDeliveryInput;
import jb1.KrusInput;
import jb1.NonPublicSupplierInput;
import jb1.PublicSupplierInput;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljb1/j;", "Lfk0/y0;", "e", "(Ljb1/j;)Lfk0/y0;", "Ljb1/m;", "Lfk0/a1;", "f", "(Ljb1/m;)Lfk0/a1;", "Ljb1/g;", "Lfk0/i;", "b", "(Ljb1/g;)Lfk0/i;", "Ljb1/i$b;", "Lfk0/m;", "d", "(Ljb1/i$b;)Lfk0/m;", "Ljb1/i$a;", "Lfk0/h;", "a", "(Ljb1/i$a;)Lfk0/h;", "Ljb1/i;", "Lfk0/k;", "c", "(Ljb1/i;)Lfk0/k;", "mObywatel_prodRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180233a;

        static {
            int[] iArr = new int[KrusInput.a.values().length];
            try {
                iArr[KrusInput.a.ALREADY_DECLARED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KrusInput.a.ATTACHED_DECLARATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KrusInput.a.WILL_BE_DECLARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KrusInput.a.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f180233a = iArr;
        }
    }

    public static final fk0.h a(KrusInput.a aVar) {
        int i15 = a.f180233a[aVar.ordinal()];
        if (i15 == 1) {
            return fk0.h.ALREADY_DECLARED;
        }
        if (i15 == 2) {
            return fk0.h.ATTACHED_DECLARATION;
        }
        if (i15 == 3) {
            return fk0.h.WILL_BE_DECLARED;
        }
        if (i15 == 4) {
            return fk0.h.UNKNOWN;
        }
        throw new p();
    }

    public static final BEApplicationElectronicDelivery b(ElectronicDeliveryInput electronicDeliveryInput) {
        NonPublicSupplierInput nonPublicSupplierInput = electronicDeliveryInput.getNonPublicSupplierInput();
        BENonPublicSupplierInput bENonPublicSupplierInputE = nonPublicSupplierInput != null ? e(nonPublicSupplierInput) : null;
        PublicSupplierInput publicSupplierInput = electronicDeliveryInput.getPublicSupplierInput();
        return new BEApplicationElectronicDelivery(bENonPublicSupplierInputE, publicSupplierInput != null ? f(publicSupplierInput) : null);
    }

    public static final BEApplicationKrusInput c(KrusInput krusInput) {
        boolean conductedNonAgriculturalBusiness = krusInput.getConductedNonAgriculturalBusiness();
        boolean farmer = krusInput.getFarmer();
        boolean insuranceContinued = krusInput.getInsuranceContinued();
        String name = krusInput.getName();
        Boolean incomeTaxExceeded = krusInput.getIncomeTaxExceeded();
        KrusInput.a incomeTaxExceededDeclarationType = krusInput.getIncomeTaxExceededDeclarationType();
        fk0.h hVarA = incomeTaxExceededDeclarationType != null ? a(incomeTaxExceededDeclarationType) : null;
        KrusInput.TaxOfficeInput taxOffice = krusInput.getTaxOffice();
        return new BEApplicationKrusInput(conductedNonAgriculturalBusiness, farmer, insuranceContinued, name, incomeTaxExceeded, hVarA, taxOffice != null ? d(taxOffice) : null);
    }

    public static final BEApplicationTaxOfficeInput d(KrusInput.TaxOfficeInput taxOfficeInput) {
        return new BEApplicationTaxOfficeInput(taxOfficeInput.getBuildingNumber(), taxOfficeInput.getCity(), taxOfficeInput.getName(), taxOfficeInput.getPostalCode(), taxOfficeInput.getStreetName());
    }

    private static final BENonPublicSupplierInput e(NonPublicSupplierInput nonPublicSupplierInput) {
        return new BENonPublicSupplierInput(nonPublicSupplierInput.getElectronicDeliveryAddress(), nonPublicSupplierInput.getName());
    }

    private static final BEPublicSupplierInput f(PublicSupplierInput publicSupplierInput) {
        return new BEPublicSupplierInput(publicSupplierInput.getEmail());
    }
}
