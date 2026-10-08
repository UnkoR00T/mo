package ee1;

import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\u0001\u0010\t¨\u0006\u000b"}, d2 = {"Lxw/a;", "a", "F", "b", "()F", "ATTACHMENTS_FILES_MAX_SIZE", "", "Lwx/d;", "Ljava/util/Set;", "()Ljava/util/Set;", "ALLOWED_FORMATS", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f49610a = xw.a.b(2500000.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<wx.d> f49611b;

    static {
        wx.d.Companion companion = wx.d.INSTANCE;
        f49611b = e1.i(wx.d.j0(companion.J()), wx.d.j0(companion.v()), wx.d.j0(companion.u()), wx.d.j0(companion.K()), wx.d.j0(companion.q()), wx.d.j0(companion.r()));
    }

    public static final Set<wx.d> a() {
        return f49611b;
    }

    public static final float b() {
        return f49610a;
    }
}
