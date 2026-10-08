package uv0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0013\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Luv0/s;", "", "", "isEmpty", "<init>", "(Z)V", "a", "Z", "()Z", "Luv0/h;", "Luv0/i;", "Luv0/p;", "Luv0/u;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isEmpty;

    public /* synthetic */ s(boolean z15, fr.k kVar) {
        this(z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsEmpty() {
        return this.isEmpty;
    }

    private s(boolean z15) {
        this.isEmpty = z15;
    }

    public /* synthetic */ s(boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? false : z15, null);
    }
}
