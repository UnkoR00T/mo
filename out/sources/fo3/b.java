package fo3;

import co3.QrCodeData;
import co3.SecondDocument;
import co3.VerificationDecryptedData;
import dn0.VerificationResponse;
import dx.i;
import java.util.List;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lfo3/b;", "", "Ldn0/d;", "verificationResponse", "Ldx/i;", "Ldx/b;", "Lco3/r;", "c", "(Ldn0/d;Ltq/e;)Ljava/lang/Object;", "", "Lrq0/b;", "a", "()Ljava/util/List;", "Lco3/e;", "qrCodeData", "", "mainDocument", "", "mainScope", "expireDateTime", "Lco3/j;", "secondDocument", "schemaId", "b", "(Lco3/e;Ljava/lang/String;ILjava/lang/String;Lco3/j;Ljava/lang/String;)Ljava/lang/String;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    List<rq0.b> a();

    String b(QrCodeData qrCodeData, String mainDocument, int mainScope, String expireDateTime, SecondDocument secondDocument, String schemaId);

    Object c(VerificationResponse verificationResponse, e<? super i<? extends dx.b, VerificationDecryptedData>> eVar);
}
