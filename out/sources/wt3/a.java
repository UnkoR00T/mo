package wt3;

import bh0.BETerytDetail;
import p071kotlin.Metadata;
import st3.AddressTerytDetail;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbh0/a;", "Lst3/l;", "a", "(Lbh0/a;)Lst3/l;", "Lst3/l$a;", "Lbh0/a$b;", "b", "(Ljava/lang/String;)Ljava/lang/String;", "addressform_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final AddressTerytDetail a(BETerytDetail bETerytDetail) {
        return new AddressTerytDetail(AddressTerytDetail.a.a(bETerytDetail.getId()), bETerytDetail.getName(), bETerytDetail.getDescription(), null);
    }

    public static final String b(String str) {
        return BETerytDetail.b.a(str);
    }
}
