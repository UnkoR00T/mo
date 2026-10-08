package org.conscrypt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class DuckTypedHpkeSpi implements HpkeSpi {
    private final Object delegate;
    private final Map<String, Method> methods = new HashMap();

    private DuckTypedHpkeSpi(Object obj) throws NoSuchMethodException {
        this.delegate = obj;
        Class<?> cls = obj.getClass();
        for (Method method : HpkeSpi.class.getMethods()) {
            if (!method.isSynthetic() && !method.getName().equals("engineInitSenderForTesting")) {
                Method method2 = cls.getMethod(method.getName(), method.getParameterTypes());
                Class<?> returnType = method2.getReturnType();
                Class<?> returnType2 = method.getReturnType();
                if (!returnType2.isAssignableFrom(returnType)) {
                    throw new NoSuchMethodException(method2 + " return value (" + returnType + ") incompatible with target return value (" + returnType2 + ")");
                }
                this.methods.put(method2.getName(), method2);
            }
        }
    }

    private Object invoke(String str, Object... objArr) throws InvocationTargetException {
        Method method = this.methods.get(str);
        if (method == null) {
            throw new IllegalStateException("DuckTypedHpkSpi internal error");
        }
        try {
            return method.invoke(this.delegate, objArr);
        } catch (IllegalAccessException e15) {
            throw new IllegalStateException("DuckTypedHpkSpi internal error", e15);
        } catch (InvocationTargetException e16) {
            if (e16.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e16.getCause());
            }
            throw e16;
        }
    }

    private Object invokeNoChecked(String str, Object... objArr) {
        try {
            return invoke(str, objArr);
        } catch (InvocationTargetException e15) {
            throw new IllegalStateException(e15.getCause());
        }
    }

    private Object invokeWithPossibleGeneralSecurity(String str, Object... objArr) throws GeneralSecurityException {
        try {
            return invoke(str, objArr);
        } catch (InvocationTargetException e15) {
            Throwable cause = e15.getCause();
            if (cause instanceof GeneralSecurityException) {
                throw ((GeneralSecurityException) cause);
            }
            throw new IllegalStateException(cause);
        }
    }

    private void invokeWithPossibleInvalidKey(String str, Object... objArr) throws InvalidKeyException {
        try {
            invoke(str, objArr);
        } catch (InvocationTargetException e15) {
            Throwable cause = e15.getCause();
            if (!(cause instanceof InvalidKeyException)) {
                throw new IllegalStateException(cause);
            }
            throw ((InvalidKeyException) cause);
        }
    }

    public static DuckTypedHpkeSpi newInstance(Object obj) {
        try {
            return new DuckTypedHpkeSpi(obj);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // org.conscrypt.HpkeSpi
    public byte[] engineExport(int i15, byte[] bArr) {
        return (byte[]) invokeNoChecked("engineExport", Integer.valueOf(i15), bArr);
    }

    @Override // org.conscrypt.HpkeSpi
    public void engineInitRecipient(byte[] bArr, PrivateKey privateKey, byte[] bArr2, PublicKey publicKey, byte[] bArr3, byte[] bArr4) throws InvalidKeyException {
        invokeWithPossibleInvalidKey("engineInitRecipient", bArr, privateKey, bArr2, publicKey, bArr3, bArr4);
    }

    @Override // org.conscrypt.HpkeSpi
    public void engineInitSender(PublicKey publicKey, byte[] bArr, PrivateKey privateKey, byte[] bArr2, byte[] bArr3) throws InvalidKeyException {
        invokeWithPossibleInvalidKey("engineInitSender", publicKey, bArr, privateKey, bArr2, bArr3);
    }

    @Override // org.conscrypt.HpkeSpi
    public void engineInitSenderForTesting(PublicKey publicKey, byte[] bArr, PrivateKey privateKey, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws InvalidKeyException {
        if (!this.methods.containsKey("engineInitSenderForTesting")) {
            throw new UnsupportedOperationException("engineInitSenderForTesting is not supported by the delegate");
        }
        invokeWithPossibleInvalidKey("engineInitSenderForTesting", publicKey, bArr, privateKey, bArr2, bArr3, bArr4);
    }

    @Override // org.conscrypt.HpkeSpi
    public byte[] engineOpen(byte[] bArr, byte[] bArr2) {
        return (byte[]) invokeWithPossibleGeneralSecurity("engineOpen", bArr, bArr2);
    }

    @Override // org.conscrypt.HpkeSpi
    public byte[] engineSeal(byte[] bArr, byte[] bArr2) {
        return (byte[]) invokeNoChecked("engineSeal", bArr, bArr2);
    }

    public Object getDelegate() {
        return this.delegate;
    }

    @Override // org.conscrypt.HpkeSpi
    public byte[] getEncapsulated() {
        return (byte[]) invokeNoChecked("getEncapsulated", new Object[0]);
    }
}
