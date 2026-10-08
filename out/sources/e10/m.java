package e10;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import oq.p;
import org.bouncycastle.pqc.crypto.xmss.XMSSKeyParameters;
import p071kotlin.Metadata;
import pq.v;
import py.KeyStoreKeySpec;
import py.n;
import py.o;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le10/m;", "Lxw/f;", "Lpy/j;", "Landroid/security/keystore/KeyGenParameterSpec;", "Ljx/g;", "systemInfo", "<init>", "(Ljx/g;)V", "spec", "c", "(Lpy/j;)Landroid/security/keystore/KeyGenParameterSpec;", "a", "Ljx/g;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements xw.f<KeyStoreKeySpec, KeyGenParameterSpec> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jx.g systemInfo;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f46817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f46818c;

        static {
            int[] iArr = new int[py.h.values().length];
            try {
                iArr[py.h.SIGN_AND_VERIFY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[py.h.ENCRYPT_AND_DECRYPT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[py.h.WRAP_AND_UNWRAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[py.h.PURPOSE_AGREE_KEY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f46816a = iArr;
            int[] iArr2 = new int[py.g.values().length];
            try {
                iArr2[py.g.DEVICE_CREDENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[py.g.STRONG_BIOMETRIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[py.g.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f46817b = iArr2;
            int[] iArr3 = new int[py.f.values().length];
            try {
                iArr3[py.f.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[py.f.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[py.f.SYSTEM_DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f46818c = iArr3;
        }
    }

    public m(jx.g gVar) {
        this.systemInfo = gVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public KeyGenParameterSpec b(KeyStoreKeySpec spec) {
        int i15;
        String alias = spec.getAlias();
        List<py.h> listI = spec.i();
        ArrayList arrayList = new ArrayList(v.y(listI, 10));
        Iterator<T> it = listI.iterator();
        while (true) {
            int i16 = 3;
            if (!it.hasNext()) {
                Iterator it4 = arrayList.iterator();
                if (!it4.hasNext()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object next = it4.next();
                while (it4.hasNext()) {
                    next = Integer.valueOf(((Number) next).intValue() | ((Number) it4.next()).intValue());
                }
                KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder(alias, ((Number) next).intValue());
                iy.h algorithm = spec.getAlgorithm();
                if (algorithm instanceof iy.h.c.b) {
                    builder.setBlockModes("ECB").setKeySize(n.STRENGTH_2048.getModulusBits()).setDigests(XMSSKeyParameters.SHA_256, XMSSKeyParameters.SHA_512).setEncryptionPaddings("OAEPPadding");
                } else if (algorithm instanceof iy.h.c.C2299c) {
                    builder.setBlockModes("ECB").setKeySize(n.STRENGTH_2048.getModulusBits()).setDigests("NONE").setEncryptionPaddings("PKCS1Padding");
                } else if (algorithm instanceof iy.h.b.a) {
                    iy.h.b.a aVar = (iy.h.b.a) algorithm;
                    KeyGenParameterSpec.Builder digests = builder.setAlgorithmParameterSpec(new ECGenParameterSpec(aVar.getTransformation())).setDigests(XMSSKeyParameters.SHA_256, XMSSKeyParameters.SHA_512);
                    byte[] bArrB = aVar.b();
                    if (bArrB != null) {
                        digests.setAttestationChallenge(bArrB);
                    }
                } else {
                    if (algorithm instanceof iy.h.c.Other) {
                        throw new IllegalArgumentException("Not supported " + spec);
                    }
                    if (!(algorithm instanceof iy.h.a.b)) {
                        if (!(algorithm instanceof iy.h.a.c) && !(algorithm instanceof iy.h.a.C2298a)) {
                            throw new p();
                        }
                        throw new IllegalArgumentException("Not supported " + spec);
                    }
                    builder.setBlockModes("GCM").setKeySize(256).setEncryptionPaddings("NoPadding");
                }
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 28 && this.systemInfo.u() && (spec.getType() != py.g.STRONG_BIOMETRIC || !this.systemInfo.t() || !(spec.getAlgorithm() instanceof iy.h.a.b))) {
                    builder.setIsStrongBoxBacked(spec.getStrongBox() != o.DISABLED);
                }
                builder.setRandomizedEncryptionRequired(spec.getKsRandomizer());
                py.g type = spec.getType();
                py.g gVar = py.g.NONE;
                builder.setUserAuthenticationRequired(type != gVar);
                if (spec.getType() != gVar) {
                    if (i17 >= 30) {
                        int iMax = Math.max(spec.getTimeout(), 0);
                        int i18 = a.f46817b[spec.getType().ordinal()];
                        if (i18 == 1) {
                            i15 = 1;
                        } else if (i18 != 2) {
                            i15 = i18 != 3 ? 0 : 3;
                        } else {
                            i15 = 2;
                        }
                        builder.setUserAuthenticationParameters(iMax, i15);
                    } else {
                        builder.setUserAuthenticationValidityDurationSeconds(spec.getTimeout());
                    }
                }
                int i19 = a.f46818c[spec.getInvalidatedByBiometricEnrollment().ordinal()];
                if (i19 == 1) {
                    builder.setInvalidatedByBiometricEnrollment(true);
                } else if (i19 == 2) {
                    builder.setInvalidatedByBiometricEnrollment(false);
                } else {
                    if (i19 != 3) {
                        throw new p();
                    }
                    i0 i0Var = i0.f148189a;
                }
                return builder.build();
            }
            int i25 = a.f46816a[((py.h) it.next()).ordinal()];
            if (i25 == 1) {
                i16 = 12;
            } else if (i25 == 2) {
                continue;
            } else if (i25 == 3) {
                i16 = 32;
            } else {
                if (i25 != 4) {
                    throw new p();
                }
                i16 = 64;
            }
            arrayList.add(Integer.valueOf(i16));
        }
    }
}
