package p036e4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001b\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\f\u001a\u0004\b\b\u0010\u000e\"\u0004\b\u001a\u0010\u0010R\"\u0010\u001e\u001a\u00020\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u001d\u0010\u0017¨\u0006\u001f"}, d2 = {"Le4/d2;", "Le4/c2;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "Le4/x2;", "c", "Le4/x2;", "a", "()Le4/x2;", "setLeft", "(Le4/x2;)V", "left", "Le4/r;", "d", "Le4/r;", "()Le4/r;", "setTop", "(Le4/r;)V", "top", "e", "setRight", "right", "f", "setBottom", "bottom", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d2 implements c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private x2 left = new x2();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private r top = new r();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private x2 right = new x2();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private r bottom = new r();

    public d2(String str) {
        this.name = str;
    }

    @Override // p036e4.c2
    /* JADX INFO: renamed from: a, reason: from getter */
    public x2 getLeft() {
        return this.left;
    }

    @Override // p036e4.c2
    /* JADX INFO: renamed from: b, reason: from getter */
    public x2 getRight() {
        return this.right;
    }

    @Override // p036e4.c2
    /* JADX INFO: renamed from: c, reason: from getter */
    public r getTop() {
        return this.top;
    }

    @Override // p036e4.c2
    /* JADX INFO: renamed from: d, reason: from getter */
    public r getBottom() {
        return this.bottom;
    }

    public String toString() {
        if (this.name == null) {
            return super.toString();
        }
        return "RectRulers(" + this.name + ')';
    }
}
