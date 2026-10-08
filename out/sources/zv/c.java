package zv;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\t\u0010\u000fR.\u0010\u0017\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0010\u0010\u0016¨\u0006\u0018"}, d2 = {"Lzv/c;", "Lzv/a;", "Lyv/a;", "type", "", "startOffset", "endOffset", "<init>", "(Lyv/a;II)V", "a", "Lyv/a;", "getType", "()Lyv/a;", "b", "I", "()I", "c", "<set-?>", "d", "Lzv/a;", "getParent", "()Lzv/a;", "(Lzv/a;)V", "parent", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yv.a type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startOffset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int endOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a parent;

    public c(yv.a aVar, int i15, int i16) {
        this.type = aVar;
        this.startOffset = i15;
        this.endOffset = i16;
    }

    @Override // zv.a
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getEndOffset() {
        return this.endOffset;
    }

    @Override // zv.a
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getStartOffset() {
        return this.startOffset;
    }

    public final void c(a aVar) {
        this.parent = aVar;
    }

    @Override // zv.a
    public final a getParent() {
        return this.parent;
    }

    @Override // zv.a
    public yv.a getType() {
        return this.type;
    }
}
