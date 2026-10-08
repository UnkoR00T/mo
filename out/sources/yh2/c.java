package yh2;

import k34.DeputyCardDataModel;
import k34.DeputyCardModel;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lyh2/b;", "Lk34/e;", "b", "(Lyh2/b;)Lk34/e;", "Lyh2/a;", "Lk34/d;", "a", "(Lyh2/a;)Lk34/d;", "legacy_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final DeputyCardDataModel a(DeputyCardData deputyCardData) {
        return new DeputyCardDataModel(deputyCardData.getFirstName(), deputyCardData.getSecondName(), deputyCardData.getLastName(), deputyCardData.getNumber(), deputyCardData.getNumberOfSeymCadency(), deputyCardData.getReleaseDate());
    }

    public static final DeputyCardModel b(DeputyCardWrapped deputyCardWrapped) {
        return new DeputyCardModel(xh2.b.a(deputyCardWrapped.getDataHeader()), a(deputyCardWrapped.getDataContainer()));
    }
}
