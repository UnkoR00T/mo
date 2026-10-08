package mr0;

import ge4.x;
import ie4.o;
import ie4.t;
import java.util.Set;
import or0.AsyncDocumentGenerationResponseDto;
import or0.LoadRefugeeKidDataOutputDtoDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lmr0/g;", "", "", "", "kidsPesel", "Lge4/x;", "Lor0/c;", "a", "(Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "Lor0/v0;", "b", "(Ltq/e;)Ljava/lang/Object;", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {
    @o("offline-document/mobile/api/documents/refugee/kids/async-generate")
    Object a(@t("kids-pesel") Set<String> set, tq.e<? super x<AsyncDocumentGenerationResponseDto>> eVar);

    @o("offline-document/mobile/api/documents/refugee/kids/load-personal-info")
    Object b(tq.e<? super x<LoadRefugeeKidDataOutputDtoDto>> eVar);
}
