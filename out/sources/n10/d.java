package n10;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ln10/d;", "", "<init>", "()V", "", "encryptedValue", "Ln10/b;", "a", "([B)Ln10/b;", "encryptedData", "b", "(Ln10/b;)[B", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {
    public final EncryptedDataField a(byte[] encryptedValue) {
        if (encryptedValue != null) {
            return new EncryptedDataField(encryptedValue);
        }
        return null;
    }

    public final byte[] b(EncryptedDataField encryptedData) {
        if (encryptedData != null) {
            return encryptedData.getContent();
        }
        return null;
    }
}
