package ii2;

import java.security.GeneralSecurityException;
import org.bouncycastle.operator.OperatorException;

/* JADX INFO: loaded from: classes8.dex */
public final class b {
    public static RuntimeException a(OperatorException operatorException) {
        if (operatorException.getCause() instanceof GeneralSecurityException) {
            return new e((GeneralSecurityException) operatorException.getCause());
        }
        return operatorException.getCause() instanceof e ? (e) operatorException.getCause() : new c("Failed to set up security operations.", operatorException);
    }
}
