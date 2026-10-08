package rj0;

import dx.i;
import p071kotlin.Metadata;
import zi0.InternetAddressPoints;
import zi0.InternetAvailableOperators;
import zi0.InternetDemandRequest;
import zi0.InternetDemandResponse;
import zi0.InternetSpeedDictionary;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JH\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0016\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lrj0/e;", "", "Ldx/i;", "Ldx/b;", "Lzi0/h;", "b", "(Ltq/e;)Ljava/lang/Object;", "", "communityId", "cityId", "buildingNumber", "streetId", "apartmentNumber", "Lzi0/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "addressPointId", "Lzi0/c;", "c", "(JLjava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lzi0/d;", "internetDemandRequest", "Lzi0/e;", "d", "(Lzi0/d;Ltq/e;)Ljava/lang/Object;", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    Object a(String str, String str2, String str3, String str4, String str5, tq.e<? super i<? extends dx.b, InternetAddressPoints>> eVar);

    Object b(tq.e<? super i<? extends dx.b, InternetSpeedDictionary>> eVar);

    Object c(long j15, String str, tq.e<? super i<? extends dx.b, InternetAvailableOperators>> eVar);

    Object d(InternetDemandRequest internetDemandRequest, tq.e<? super i<? extends dx.b, InternetDemandResponse>> eVar);
}
