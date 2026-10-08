package ei2;

import k34.RailwayCardDataModel;
import k34.RailwayCardDocumentData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lei2/c;", "Lk34/z;", "c", "(Lei2/c;)Lk34/z;", "Lei2/a;", "Lk34/y;", "b", "(Lei2/a;)Lk34/y;", "", "category", "Lk34/y$a;", "a", "(Ljava/lang/String;)Lk34/y$a;", "legacy_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final RailwayCardDataModel.a a(String str) {
        switch (str.hashCode()) {
            case -2146078827:
                if (str.equals("dziecko")) {
                    return RailwayCardDataModel.a.CHILD;
                }
                break;
            case -1982602147:
                if (str.equals("rencista II pakiet")) {
                    return RailwayCardDataModel.a.ANNUITY_II_PACKAGE;
                }
                break;
            case -1200565642:
                if (str.equals("rencista I pakiet")) {
                    return RailwayCardDataModel.a.ANNUITY_I_PACKAGE;
                }
                break;
            case -1155266006:
                if (str.equals("stypendysta")) {
                    return RailwayCardDataModel.a.SCHOLAR;
                }
                break;
            case -1067469659:
                if (str.equals("emeryt I pakiet")) {
                    return RailwayCardDataModel.a.PENSIONER_I_PACKAGE;
                }
                break;
            case -625559548:
                if (str.equals("pracownik")) {
                    return RailwayCardDataModel.a.WORKER;
                }
                break;
            case 1480690838:
                if (str.equals("współmałżonek")) {
                    return RailwayCardDataModel.a.SPOUSE;
                }
                break;
            case 2143373326:
                if (str.equals("emeryt II pakiet")) {
                    return RailwayCardDataModel.a.PENSIONER_II_PACKAGE;
                }
                break;
        }
        return RailwayCardDataModel.a.UNKNOWN;
    }

    public static final RailwayCardDataModel b(RailwayCardData railwayCardData) {
        return new RailwayCardDataModel(railwayCardData.getCardRelation(), railwayCardData.getHolderType(), railwayCardData.getBatch(), railwayCardData.getNumber(), railwayCardData.getFirstName(), railwayCardData.getSecondName(), railwayCardData.getLastName(), railwayCardData.pesel, railwayCardData.employer, a(railwayCardData.ouCategory), railwayCardData.trainClass, railwayCardData.annotation, railwayCardData.concession, railwayCardData.status, railwayCardData.employerCode, railwayCardData.validFrom, railwayCardData.expiryDate, railwayCardData.qrCode, railwayCardData.getId());
    }

    public static final RailwayCardDocumentData c(RailwayCardWrapped railwayCardWrapped) {
        return new RailwayCardDocumentData(xh2.b.a(railwayCardWrapped.getDataHeader()), b(railwayCardWrapped.getDataContainer()), null, null, 12, null);
    }
}
