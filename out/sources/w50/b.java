package w50;

import p071kotlin.Metadata;
import q4.e;
import v4.TransformedText;
import v4.e1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lw50/b;", "Lv4/e1;", "Lw50/a;", "maskType", "<init>", "(Lw50/a;)V", "Lq4/e;", "text", "Lv4/c1;", "a", "(Lq4/e;)Lv4/c1;", "b", "Lw50/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements e1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a maskType;

    public b(a aVar) {
        this.maskType = aVar;
    }

    @Override // v4.e1
    public TransformedText a(e text) {
        return new TransformedText(new e(this.maskType.k(text), null, 2, null), this.maskType);
    }
}
