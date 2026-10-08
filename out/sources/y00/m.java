package y00;

import java.security.spec.MGF1ParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0004\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"Ljavax/crypto/spec/OAEPParameterSpec;", "a", "Ljavax/crypto/spec/OAEPParameterSpec;", "()Ljavax/crypto/spec/OAEPParameterSpec;", "rsaOAEPParameterSpec", "security_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final OAEPParameterSpec f222818a = new OAEPParameterSpec(XMSSKeyParameters.SHA_256, "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);

    public static final OAEPParameterSpec a() {
        return f222818a;
    }
}
