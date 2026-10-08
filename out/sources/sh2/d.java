package sh2;

import android.content.Context;
import android.content.SharedPreferences;
import java.security.SecureRandom;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lsh2/d;", "", "<init>", "()V", "", "a", "()[B", "", "string", "c", "(Ljava/lang/String;)[B", "Landroid/content/Context;", "context", "variable", "", "defValue", "b", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Boolean;)Z", "value", "Loq/i0;", "d", "(Landroid/content/Context;Ljava/lang/String;Z)V", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f181716a = new d();

    private d() {
    }

    public static final byte[] a() {
        byte[] bArr = new byte[8];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static final boolean b(Context context, String variable, Boolean defValue) {
        return context.getSharedPreferences("MyPrefsFile", 0).getBoolean(variable, defValue.booleanValue());
    }

    public static final byte[] c(String string) {
        int length = string.length() / 2;
        byte[] bArr = new byte[length];
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = i15 * 2;
            bArr[i15] = (byte) Integer.parseInt(string.substring(i16, i16 + 2), 16);
        }
        return bArr;
    }

    public static final void d(Context context, String variable, boolean value) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("MyPrefsFile", 0).edit();
        editorEdit.putBoolean(variable, value);
        editorEdit.apply();
    }
}
