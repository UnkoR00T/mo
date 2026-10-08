package dh0;

import fh0.TerytDetailsResponse;
import ge4.x;
import ie4.f;
import ie4.s;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Ldh0/b;", "", "", "voivodeshipId", "countyId", "communityId", "Lge4/x;", "Lfh0/f;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "e", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "cityId", "c", "a", "(Ltq/e;)Ljava/lang/Object;", "addressservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @f("address/mobile/api/teryt/voivodeships")
    Object a(e<? super x<TerytDetailsResponse>> eVar);

    @f("address/mobile/api/teryt/voivodeships/{voivodeshipId}/counties")
    Object b(@s("voivodeshipId") String str, e<? super x<TerytDetailsResponse>> eVar);

    @f("address/mobile/api/teryt/streets/{cityId}")
    Object c(@s("cityId") String str, e<? super x<TerytDetailsResponse>> eVar);

    @f("address/mobile/api/teryt/voivodeships/{voivodeshipId}/counties/{countyId}/communities/{communityId}/cities")
    Object d(@s("voivodeshipId") String str, @s("countyId") String str2, @s("communityId") String str3, e<? super x<TerytDetailsResponse>> eVar);

    @f("address/mobile/api/teryt/voivodeships/{voivodeshipId}/counties/{countyId}/communities")
    Object e(@s("voivodeshipId") String str, @s("countyId") String str2, e<? super x<TerytDetailsResponse>> eVar);
}
