package zh2;

import k34.FamilyCardDataModel;
import k34.FamilyDataModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lzh2/c;", "Lk34/r;", "b", "(Lzh2/c;)Lk34/r;", "Lzh2/a;", "Lk34/q;", "a", "(Lzh2/a;)Lk34/q;", "legacy_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final FamilyCardDataModel a(FamilyCardData familyCardData) {
        return new FamilyCardDataModel(familyCardData.getCardRelation(), familyCardData.getHolderType(), familyCardData.getFirstName(), familyCardData.getSecondName(), familyCardData.getLastName(), familyCardData.getP(), familyCardData.getIcn(), familyCardData.getNumber(), familyCardData.getED(), familyCardData.getId(), null, null, 3072, null);
    }

    public static final FamilyDataModel b(FamilyData familyData) {
        return new FamilyDataModel(a(familyData.getDataContainer()), xh2.b.a(familyData.getDataHeader()));
    }
}
