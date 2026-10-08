package mr0;

import ge4.x;
import ie4.s;
import ie4.t;
import java.util.Set;
import oq.i0;
import or0.DocumentAndCertificateStatusesDtoDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007JX\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lmr0/e;", "", "", "documentId", "Lge4/x;", "Loq/i0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "documentIds", "serialNumbers", "vehicleIds", "", "hasVehiclesWithoutId", "Lor0/l;", "a", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/lang/Boolean;Ltq/e;)Ljava/lang/Object;", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    @ie4.f("offline-document/mobile/api/documents/statuses/v2")
    Object a(@t("document-ids") Set<String> set, @t("serial-numbers") Set<String> set2, @t("vehicle-ids") Set<String> set3, @t("hasVehiclesWithoutId") Boolean bool, tq.e<? super x<DocumentAndCertificateStatusesDtoDto>> eVar);

    @ie4.b("offline-document/mobile/api/documents/{documentId}")
    Object b(@s("documentId") String str, tq.e<? super x<i0>> eVar);
}
