package e10;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.WrappedKeyEntry;
import iy.f0;
import iy.t;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.concurrent.CancellationException;
import oq.i0;
import p071kotlin.Metadata;
import py.KeyStoreKeySpec;
import py.o;
import ry.p;
import y00.c0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160\u00102\u0006\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Le10/f;", "Lpy/l;", "Liy/t;", "keyStoreProvider", "Ly00/c0;", "parser", "Le10/m;", "keyStoreKeySpecMapper", "<init>", "(Liy/t;Ly00/c0;Le10/m;)V", "", "keyAlias", "", "derEncodedKey", "Lpy/j;", "wrappingKeySpec", "Ldx/i;", "Ldx/b;", "Loq/i0;", "b", "(Ljava/lang/String;[BLpy/j;)Ldx/i;", "wrappedKeyAlias", "Lry/p;", "a", "(Ljava/lang/String;)Ldx/i;", "Liy/t;", "Ly00/c0;", "c", "Le10/m;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements py.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t keyStoreProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 parser;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m keyStoreKeySpecMapper;

    public f(t tVar, c0 c0Var, m mVar) {
        this.keyStoreProvider = tVar;
        this.parser = c0Var;
        this.keyStoreKeySpecMapper = mVar;
    }

    @Override // py.l
    public dx.i<dx.b, p> a(String wrappedKeyAlias) {
        Object objB;
        dx.i left;
        c0 c0Var = this.parser;
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = Build.VERSION.SDK_INT;
                    if (i15 >= 28) {
                        px.f fVar = px.f.f163100a;
                        fVar.b("Exporting, wrappedKeyAlias: " + wrappedKeyAlias, px.c.a(aVar));
                        WrappedKeyEntry wrappedKeyEntryA = e.a(((KeyStore) aVar.a(t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null))).getEntry(wrappedKeyAlias, null));
                        fVar.b("Exported: " + wrappedKeyEntryA, px.c.a(aVar));
                        String wrappingKeyAlias = wrappedKeyEntryA.getWrappingKeyAlias();
                        byte[] wrappedKeyBytes = wrappedKeyEntryA.getWrappedKeyBytes();
                        String transformation = wrappedKeyEntryA.getTransformation();
                        iy.h.c other = iy.h.c.b.f97755b;
                        if (!fr.t.c(transformation, other.getTransformation())) {
                            other = iy.h.c.C2299c.f97756b;
                            if (!fr.t.c(transformation, other.getTransformation())) {
                                other = new iy.h.c.Other(wrappedKeyEntryA.getTransformation());
                            }
                        }
                        left = new dx.i.Right(new p(wrappedKeyAlias, wrappingKeyAlias, wrappedKeyBytes, other));
                    } else {
                        left = new dx.i.Left(new dx.b.SystemBuild(i15, 28));
                    }
                    return new dx.i.Right((p) aVar.a(left));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar2 = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar2.d(message, e18, px.c.a(c0Var));
            dx.i<Exception, dx.b> iVarA = c0Var.a(e18);
            if (iVarA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
            } else {
                if (!(iVarA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVarA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    @Override // py.l
    public dx.i<dx.b, i0> b(String keyAlias, byte[] derEncodedKey, KeyStoreKeySpec wrappingKeySpec) {
        Object objB;
        c0 c0Var = this.parser;
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = Build.VERSION.SDK_INT;
                    if (i15 >= 28) {
                        try {
                            KeyStore keyStore = (KeyStore) aVar.a(t.a(this.keyStoreProvider, f0.ANDROID_KEY_STORE, null, null, 6, null));
                            KeyGenParameterSpec keyGenParameterSpecB = this.keyStoreKeySpecMapper.b(wrappingKeySpec);
                            d.a();
                            WrappedKeyEntry wrappedKeyEntryA = c.a(derEncodedKey, wrappingKeySpec.getAlias(), wrappingKeySpec.getAlgorithm().getTransformation(), keyGenParameterSpecB);
                            px.f.f163100a.b("Importing:\nkeyAlias: " + keyAlias + "\nderEncodedKey: " + derEncodedKey + "\nwrapSpec: " + wrappingKeySpec, px.c.a(aVar));
                            keyStore.setEntry(keyAlias, wrappedKeyEntryA, null);
                            i0 i0Var = i0.f148189a;
                        } catch (ProviderException e15) {
                            if (wrappingKeySpec.getStrongBox() == o.PREFERRED) {
                                b(keyAlias, derEncodedKey, KeyStoreKeySpec.b(wrappingKeySpec, null, null, 0, null, null, o.DISABLED, false, null, 223, null));
                            } else {
                                new dx.i.Left(new dx.b.Generic(e15));
                            }
                        }
                    } else {
                        new dx.b.SystemBuild(i15, 28);
                    }
                    return new dx.i.Right(i0.f148189a);
                } catch (CancellationException e16) {
                    throw e16;
                }
            } catch (ex.c e17) {
                return new dx.i.Left((dx.b) ex.d.a(e17));
            } catch (CancellationException e18) {
                throw e18;
            }
        } catch (Exception e19) {
            px.f fVar = px.f.f163100a;
            String message = e19.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e19, px.c.a(c0Var));
            dx.i<Exception, dx.b> iVarA = c0Var.a(e19);
            if (iVarA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
            } else {
                if (!(iVarA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVarA).b();
            }
            return new dx.i.Left(objB);
        }
    }
}
