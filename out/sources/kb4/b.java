package kb4;

import jb4.PayloadErrorData;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llb4/a;", "Ljb4/f;", "a", "(Llb4/a;)Ljb4/f;", "error_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class b {
    public static final PayloadErrorData a(lb4.a aVar) {
        if (aVar instanceof lb4.a.NewPayloadErrorDto) {
            lb4.a.NewPayloadErrorDto newPayloadErrorDto = (lb4.a.NewPayloadErrorDto) aVar;
            String businessCode = newPayloadErrorDto.getBusinessCode();
            if (businessCode == null) {
                businessCode = newPayloadErrorDto.getCode();
            }
            return new PayloadErrorData(businessCode, newPayloadErrorDto.getTitle(), newPayloadErrorDto.getMessage(), newPayloadErrorDto.getAction());
        }
        if (aVar instanceof lb4.a.OldPayloadErrorDtoV1) {
            lb4.a.OldPayloadErrorDtoV1 oldPayloadErrorDtoV1 = (lb4.a.OldPayloadErrorDtoV1) aVar;
            Integer errorCode = oldPayloadErrorDtoV1.getErrorCode();
            return new PayloadErrorData(errorCode != null ? String.valueOf(errorCode.intValue()) : null, null, oldPayloadErrorDtoV1.getError(), null);
        }
        if (!(aVar instanceof lb4.a.OldPayloadErrorDtoV2)) {
            throw new p();
        }
        lb4.a.OldPayloadErrorDtoV2 oldPayloadErrorDtoV2 = (lb4.a.OldPayloadErrorDtoV2) aVar;
        Integer code = oldPayloadErrorDtoV2.getCode();
        return new PayloadErrorData(code != null ? String.valueOf(code.intValue()) : null, null, oldPayloadErrorDtoV2.getDescription(), null);
    }
}
