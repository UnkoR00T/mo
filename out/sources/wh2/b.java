package wh2;

import k34.AdvocateCardDataModel;
import k34.AdvocateDataModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwh2/c;", "Lk34/b;", "b", "(Lwh2/c;)Lk34/b;", "Lwh2/a;", "Lk34/a;", "a", "(Lwh2/a;)Lk34/a;", "legacy_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final AdvocateCardDataModel a(AdvocateCardData advocateCardData) {
        return new AdvocateCardDataModel(advocateCardData.getNumber(), advocateCardData.getMemberInstitution(), advocateCardData.getReleaseDate(), advocateCardData.getExpiredData(), advocateCardData.getPermissionType());
    }

    public static final AdvocateDataModel b(AdvocateData advocateData) {
        return new AdvocateDataModel(a(advocateData.getDataContainer()), xh2.b.a(advocateData.getDataHeader()));
    }
}
