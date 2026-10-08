package org.bouncycastle.its.jcajce;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes5.dex */
class ClassUtil {
    private static final Class gcmSpecClass = loadClass(ClassUtil.class, "javax.crypto.spec.GCMParameterSpec");

    ClassUtil() {
    }

    public static AlgorithmParameterSpec getGCMSpec(final byte[] bArr, final int i15) {
        if (gcmSpecClass != null) {
            try {
                return (AlgorithmParameterSpec) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.its.jcajce.ClassUtil.1
                    @Override // java.security.PrivilegedAction
                    public Object run() {
                        try {
                            return ClassUtil.gcmSpecClass.getConstructor(Integer.TYPE, byte[].class).newInstance(Integers.valueOf(i15), bArr);
                        } catch (NoSuchMethodException e15) {
                            throw new IllegalStateException("no matching constructor: " + e15.getMessage());
                        } catch (Exception e16) {
                            throw new IllegalStateException("constructor failed" + e16.getMessage());
                        }
                    }
                });
            } catch (IllegalStateException unused) {
            }
        }
        return new AEADParameterSpec(bArr, i15);
    }

    static Class loadClass(Class cls, final String str) {
        try {
            ClassLoader classLoader = cls.getClassLoader();
            return classLoader != null ? classLoader.loadClass(str) : (Class) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.its.jcajce.ClassUtil.2
                @Override // java.security.PrivilegedAction
                public Object run() {
                    try {
                        return Class.forName(str);
                    } catch (Exception unused) {
                        return null;
                    }
                }
            });
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
