package ez1;

import iy.b0;
import iy.c0;
import mx.Label;
import mx.b;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\b\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "postalCode", "city", "Liy/b0;", "street", "buildingNumber", "apartmentNumber", "Lmx/a;", "a", "(Ljava/lang/String;Ljava/lang/String;Liy/b0;Liy/b0;Liy/b0;)Lmx/a;", "electoralregister_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final Label a(String str, String str2, b0 b0Var, b0 b0Var2, b0 b0Var3) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append(" ");
        sb5.append(str2);
        sb5.append(", ");
        if (b0Var != null) {
            sb5.append(c0.e(b0Var) + ' ');
        }
        sb5.append(b0Var2 != null ? c0.e(b0Var2) : null);
        if (b0Var3 != null) {
            sb5.append('/' + c0.e(b0Var3));
        }
        return b.b(sb5.toString(), "fullAddress");
    }
}
