package p10;

import dx.i;
import java.util.List;
import oa.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lp10/e;", "", "Loa/u;", "T", "Ljava/lang/Class;", "databaseClass", "", "converters", "Lra/b;", "migrations", "Lo10/b;", "name", "Ldx/i;", "Ldx/b;", "b", "(Ljava/lang/Class;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)Ldx/i;", "Loq/i0;", "a", "(Ljava/lang/String;)V", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    void a(String name);

    <T extends u> i<dx.b, T> b(Class<T> databaseClass, List<? extends Object> converters, List<? extends ra.b> migrations, String name);
}
