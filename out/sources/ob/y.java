package ob;

import android.app.Activity;
import android.content.Context;
import j6.f1;
import java.util.ArrayList;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lob/y;", "Lob/x;", "Lsb/k;", "densityCompatHelper", "<init>", "(Lsb/k;)V", "Landroid/content/Context;", "context", "Lob/v;", "a", "(Landroid/content/Context;)Lob/v;", "Landroid/app/Activity;", "activity", "b", "(Landroid/app/Activity;)Lob/v;", "Lsb/k;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "c", "Ljava/util/ArrayList;", "getInsetsTypeMasks$window_release", "()Ljava/util/ArrayList;", "insetsTypeMasks", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class y implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sb.k densityCompatHelper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Integer> insetsTypeMasks;

    public y(sb.k kVar) {
        this.densityCompatHelper = kVar;
        this.insetsTypeMasks = pq.v.g(Integer.valueOf(f1.p.h()), Integer.valueOf(f1.p.g()), Integer.valueOf(f1.p.b()), Integer.valueOf(f1.p.d()), Integer.valueOf(f1.p.j()), Integer.valueOf(f1.p.f()), Integer.valueOf(f1.p.k()), Integer.valueOf(f1.p.c()));
    }

    @Override // ob.x
    public WindowMetrics a(Context context) {
        return sb.p.INSTANCE.a().a(context, this.densityCompatHelper);
    }

    public WindowMetrics b(Activity activity) {
        return sb.p.INSTANCE.a().b(activity, this.densityCompatHelper);
    }

    public /* synthetic */ y(sb.k kVar, int i15, fr.k kVar2) {
        this((i15 & 1) != 0 ? sb.k.INSTANCE.a() : kVar);
    }
}
