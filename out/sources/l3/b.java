package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000bR$\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ll3/b;", "Ll3/h;", "Ll3/g;", "requestedFocusDirection", "<init>", "(ILfr/k;)V", "Loq/i0;", "a", "()V", "I", "b", "()I", "", "value", "Z", "c", "()Z", "isCanceled", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int requestedFocusDirection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isCanceled;

    public /* synthetic */ b(int i15, fr.k kVar) {
        this(i15);
    }

    @Override // l3.h
    public void a() {
        this.isCanceled = true;
    }

    @Override // l3.h
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getRequestedFocusDirection() {
        return this.requestedFocusDirection;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsCanceled() {
        return this.isCanceled;
    }

    private b(int i15) {
        this.requestedFocusDirection = i15;
    }
}
