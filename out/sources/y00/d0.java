package y00;

import android.security.keystore.KeyPermanentlyInvalidatedException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\t\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ly00/d0;", "Ly00/c0;", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ldx/i;", "Ldx/b;", "a", "(Ljava/lang/Exception;)Ldx/i;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 implements c0 {
    @Override // dx.j
    public dx.i<Exception, dx.b> a(Exception e15) {
        boolean z15;
        if (e15 instanceof KeyPermanentlyInvalidatedException) {
            return new dx.i.Right(dx.b.j.c.f45087a);
        }
        return ((e15 instanceof NoSuchAlgorithmException) || (e15 instanceof NoSuchPaddingException) || ((z15 = e15 instanceof InvalidAlgorithmParameterException)) || (e15 instanceof GeneralSecurityException) || (e15 instanceof IndexOutOfBoundsException) || (e15 instanceof BadPaddingException) || (e15 instanceof IllegalBlockSizeException) || (e15 instanceof NullPointerException) || (e15 instanceof InvalidKeyException) || (e15 instanceof InvalidKeySpecException) || z15 || (e15 instanceof IllegalStateException) || (e15 instanceof IllegalArgumentException)) ? new dx.i.Right(new dx.b.Generic(e15)) : new dx.i.Left(e15);
    }
}
