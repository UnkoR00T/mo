package e10;

import android.security.keystore.KeyInfo;
import iy.f0;
import iy.s;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import oq.p;
import p071kotlin.Metadata;
import ry.DomainKeyInfo;
import y00.c0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u00102\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0012J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 ¨\u0006!"}, d2 = {"Le10/l;", "Liy/s;", "Ly00/c0;", "securityExceptionParser", "Lpx/d;", "remoteLogger", "<init>", "(Ly00/c0;Lpx/d;)V", "Lry/d;", "domainKeyInfo", "Loq/i0;", "f", "(Lry/d;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ldx/i$b;", "Ldx/b;", "(Ljava/lang/Exception;)Ldx/i$b;", "Ljava/security/PrivateKey;", "privateKey", "", "report", "Ldx/i;", "b", "(Ljava/security/PrivateKey;ZLtq/e;)Ljava/lang/Object;", "Ljavax/crypto/SecretKey;", "secretKey", "d", "(Ljavax/crypto/SecretKey;ZLtq/e;)Ljava/lang/Object;", "a", "Ly00/c0;", "Lpx/d;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    public l(c0 c0Var, px.d dVar) {
        this.securityExceptionParser = c0Var;
        this.remoteLogger = dVar;
    }

    private final dx.i.Left<? extends dx.b> e(Exception e15) {
        dx.i<Exception, dx.b> iVarA = this.securityExceptionParser.a(e15);
        if (iVarA instanceof dx.i.Left) {
            return new dx.i.Left<>(new dx.b.Generic(e15));
        }
        if (iVarA instanceof dx.i.Right) {
            return new dx.i.Left<>(((dx.i.Right) iVarA).b());
        }
        throw new p();
    }

    private final void f(DomainKeyInfo domainKeyInfo) {
        this.remoteLogger.u6("KeyInfo:\n- security level: " + domainKeyInfo.getKeySecurityLevel() + '\n', px.c.a(this));
    }

    @Override // iy.s
    public Object b(PrivateKey privateKey, boolean z15, tq.e<? super dx.i<? extends dx.b, DomainKeyInfo>> eVar) {
        try {
            DomainKeyInfo domainKeyInfoA = k.a((KeyInfo) KeyFactory.getInstance(privateKey.getAlgorithm(), f0.ANDROID_KEY_STORE.getAlias()).getKeySpec(privateKey, KeyInfo.class));
            if (z15) {
                f(domainKeyInfoA);
            }
            return new dx.i.Right(domainKeyInfoA);
        } catch (IllegalArgumentException e15) {
            return e(e15);
        } catch (NullPointerException e16) {
            return e(e16);
        } catch (NoSuchAlgorithmException e17) {
            return e(e17);
        } catch (NoSuchProviderException e18) {
            return e(e18);
        } catch (InvalidKeySpecException e19) {
            return e(e19);
        }
    }

    @Override // iy.s
    public Object d(SecretKey secretKey, boolean z15, tq.e<? super dx.i<? extends dx.b, DomainKeyInfo>> eVar) {
        try {
            DomainKeyInfo domainKeyInfoA = k.a((KeyInfo) SecretKeyFactory.getInstance(secretKey.getAlgorithm(), f0.ANDROID_KEY_STORE.getAlias()).getKeySpec(secretKey, KeyInfo.class));
            if (z15) {
                f(domainKeyInfoA);
            }
            return new dx.i.Right(domainKeyInfoA);
        } catch (ClassCastException e15) {
            return e(e15);
        } catch (IllegalArgumentException e16) {
            return e(e16);
        } catch (NullPointerException e17) {
            return e(e17);
        } catch (NoSuchAlgorithmException e18) {
            return e(e18);
        } catch (NoSuchProviderException e19) {
            return e(e19);
        } catch (InvalidKeySpecException e25) {
            return e(e25);
        }
    }
}
