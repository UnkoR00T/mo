package hv0;

import fv.e0;
import ge4.x;
import ie4.f;
import ie4.s;
import jv0.GetDiplomaDocumentsToDownloadResponse;
import jv0.b;
import jv0.c;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lhv0/a;", "", "", "diplomaUuid", "Ljv0/c;", "diplomaType", "Ljv0/b;", "diplomaSubtype", "Lge4/x;", "Lfv/e0;", "b", "(Ljava/lang/String;Ljv0/c;Ljv0/b;Ltq/e;)Ljava/lang/Object;", "Ljv0/d;", "a", "(Ljava/lang/String;Ljv0/c;Ltq/e;)Ljava/lang/Object;", "universityservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("university/mobile/api/electronic-diplomas/to-download/{diplomaType}/{diplomaUuid}")
    Object a(@s("diplomaUuid") String str, @s("diplomaType") c cVar, e<? super x<GetDiplomaDocumentsToDownloadResponse>> eVar);

    @f("university/mobile/api/electronic-diplomas/download/{diplomaType}/{diplomaSubtype}/{diplomaUuid}")
    Object b(@s("diplomaUuid") String str, @s("diplomaType") c cVar, @s("diplomaSubtype") b bVar, e<? super x<e0>> eVar);
}
