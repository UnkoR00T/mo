package ci2;

import k34.PensionerCardDataModel;
import k34.PensionerCardDocumentData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lci2/c;", "Lk34/x;", "b", "(Lci2/c;)Lk34/x;", "Lci2/a;", "Lk34/w;", "a", "(Lci2/a;)Lk34/w;", "legacy_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final PensionerCardDataModel a(PensionerCardData pensionerCardData) {
        return new PensionerCardDataModel(pensionerCardData.getNumber(), pensionerCardData.getFirstName(), pensionerCardData.getSecondName(), pensionerCardData.getLastName(), pensionerCardData.getPesel(), pensionerCardData.getType(), pensionerCardData.getExpiredData(), pensionerCardData.getDepartment());
    }

    public static final PensionerCardDocumentData b(PensionerData pensionerData) {
        return new PensionerCardDocumentData(a(pensionerData.getDataContainer()), xh2.b.a(pensionerData.getDataHeader()), null, null, 12, null);
    }
}
