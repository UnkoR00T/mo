package yv;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyv/b;", "Lyv/a;", "", "name", "", "isToken", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "b", "Z", "a", "()Z", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class b extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isToken;

    public b(String str, boolean z15) {
        super(str);
        this.isToken = z15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsToken() {
        return this.isToken;
    }

    @Override // yv.a
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Markdown:" + super.getName();
    }

    public /* synthetic */ b(String str, boolean z15, int i15, k kVar) {
        this(str, (i15 & 2) != 0 ? false : z15);
    }
}
