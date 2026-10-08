package nr0;

import fr0.BEAsyncDocumentGenerationResponse;
import or0.AsyncUpdateDocumentResponseDto;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lor0/i;", "Lfr0/c;", "a", "(Lor0/i;)Lfr0/c;", "offlinedocumentsservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final BEAsyncDocumentGenerationResponse a(AsyncUpdateDocumentResponseDto asyncUpdateDocumentResponseDto) {
        return new BEAsyncDocumentGenerationResponse(asyncUpdateDocumentResponseDto.getTaskId(), v.e(b.a(asyncUpdateDocumentResponseDto.getDocumentToGenerateDto())));
    }
}
