package ou2;

import bu2.CompanyDetails;
import mx.Label;
import mx.b;
import mx.c;
import oq.p;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\b\u001a\u00020\u0004*\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbu2/a;", "companyIdType", "Lmx/c;", "labelProvider", "Lmx/a;", "b", "(Lbu2/a;Lmx/c;)Lmx/a;", "Lbu2/b;", "a", "(Lbu2/b;)Lmx/a;", "peselrestrictionverification_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: ou2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C3694a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150167a;

        static {
            int[] iArr = new int[bu2.a.values().length];
            try {
                iArr[bu2.a.NIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[bu2.a.KRS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[bu2.a.REGON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f150167a = iArr;
        }
    }

    public static final Label a(CompanyDetails companyDetails) {
        String str = companyDetails.getPostalCode() + ' ' + companyDetails.getCity() + ',';
        String street = companyDetails.getStreet();
        if (street.length() <= 0) {
            street = null;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(companyDetails.getBuildingNumber());
        String str2 = companyDetails.getApartmentNumber().length() > 0 ? '/' + companyDetails.getApartmentNumber() : null;
        if (str2 == null) {
            str2 = "";
        }
        sb5.append(str2);
        return b.b(v.v0(v.s(str, street, sb5.toString()), " ", null, null, 0, null, null, 62, null), "addressLabel");
    }

    public static final Label b(bu2.a aVar, c cVar) {
        int i15 = C3694a.f150167a[aVar.ordinal()];
        if (i15 == 1) {
            return cVar.c(ut2.a.f201414m);
        }
        if (i15 == 2) {
            return cVar.c(ut2.a.f201408j);
        }
        if (i15 == 3) {
            return cVar.c(ut2.a.f201422q);
        }
        throw new p();
    }
}
