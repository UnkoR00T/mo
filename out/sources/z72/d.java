package z72;

import fu.r;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz72/c;", "Liy/b0;", "a", "(Lz72/c;)Liy/b0;", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final b0 a(UserDocumentData userDocumentData) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(c0.e(userDocumentData.getFirstName()));
        sb5.append(' ');
        String str = c0.e(userDocumentData.getSecondName()) + ' ';
        if (r.t0(str)) {
            str = "";
        }
        sb5.append(str);
        sb5.append(c0.e(userDocumentData.getLastName()));
        return c0.g(sb5.toString());
    }
}
