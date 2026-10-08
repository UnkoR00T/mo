package ms0;

import dx.i;
import java.util.List;
import p071kotlin.Metadata;
import zr0.BECommitmentType;
import zr0.BECreateStampDutyRequest;
import zr0.BEInstitution;
import zr0.BEStampDuty;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\n\u0010\u000bJ<\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\b0\u00062\u0006\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lms0/f;", "", "", "commitmentTypeName", "", "pageNumber", "Ldx/i;", "Ldx/b;", "", "Lzr0/a;", "b", "(Ljava/lang/String;ILtq/e;)Ljava/lang/Object;", "commitmentTypeCode", "city", "Lzr0/c;", "a", "(Ljava/lang/String;Ljava/lang/String;ILtq/e;)Ljava/lang/Object;", "Lzr0/b;", "createStampDutyRequest", "Lzr0/e;", "c", "(Lzr0/b;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {
    Object a(String str, String str2, int i15, tq.e<? super i<? extends dx.b, ? extends List<BEInstitution>>> eVar);

    Object b(String str, int i15, tq.e<? super i<? extends dx.b, ? extends List<BECommitmentType>>> eVar);

    Object c(BECreateStampDutyRequest bECreateStampDutyRequest, tq.e<? super i<? extends dx.b, BEStampDuty>> eVar);
}
