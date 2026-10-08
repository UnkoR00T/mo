package f7;

import androidx.fragment.app.o;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf7/a;", "Lf7/g;", "Landroidx/fragment/app/o;", "fragment", "", "previousFragmentId", "<init>", "(Landroidx/fragment/app/o;Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getPreviousFragmentId", "()Ljava/lang/String;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String previousFragmentId;

    public a(o oVar, String str) {
        super(oVar, "Attempting to reuse fragment " + oVar + " with previous ID " + str);
        this.previousFragmentId = str;
    }
}
