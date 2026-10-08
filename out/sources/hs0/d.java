package hs0;

import ge4.x;
import ie4.s;
import ie4.t;
import java.util.List;
import js0.UserCardDto;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lhs0/d;", "", "", "cardTokenId", "Lge4/x;", "Loq/i0;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "onlyActive", "", "Ljs0/f1;", "d", "(Ljava/lang/Boolean;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    @ie4.b("payment/mobile/api/cards/{cardTokenId}")
    Object c(@s("cardTokenId") String str, tq.e<? super x<i0>> eVar);

    @ie4.f("payment/mobile/api/cards")
    Object d(@t("onlyActive") Boolean bool, tq.e<? super x<List<UserCardDto>>> eVar);
}
