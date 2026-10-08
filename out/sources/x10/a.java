package x10;

import android.text.TextUtils;
import dz.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lx10/a;", "Ldz/c;", "<init>", "()V", "", "postcode", "a", "(Ljava/lang/String;)Ljava/lang/String;", "textformatter_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements c {
    @Override // dz.c
    public String a(String postcode) {
        if (!TextUtils.isDigitsOnly(postcode) || postcode.length() != 5) {
            return postcode;
        }
        return postcode.substring(0, 2) + '-' + postcode.substring(2, 5);
    }
}
