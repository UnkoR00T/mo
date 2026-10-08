package p036e4;

import p071kotlin.Metadata;
import pq.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\f\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\t\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u001a"}, d2 = {"Le4/s;", "Le4/c2;", "", "rulers", "<init>", "([Le4/c2;)V", "", "toString", "()Ljava/lang/String;", "b", "[Le4/c2;", "Le4/x2;", "c", "Le4/x2;", "a", "()Le4/x2;", "left", "Le4/r;", "d", "Le4/r;", "()Le4/r;", "top", "e", "right", "f", "bottom", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class s implements c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c2[] rulers;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x2 left;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r top;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final x2 right;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final r bottom;

    public s(c2[] c2VarArr) {
        this.rulers = c2VarArr;
        x2.Companion companion = x2.INSTANCE;
        int length = c2VarArr.length;
        x2[] x2VarArr = new x2[length];
        for (int i15 = 0; i15 < length; i15++) {
            x2VarArr[i15] = this.rulers[i15].getLeft();
        }
        this.left = companion.b(x2VarArr);
        r.Companion companion2 = r.INSTANCE;
        int length2 = this.rulers.length;
        r[] rVarArr = new r[length2];
        for (int i16 = 0; i16 < length2; i16++) {
            rVarArr[i16] = this.rulers[i16].getTop();
        }
        this.top = companion2.a(rVarArr);
        x2.Companion companion3 = x2.INSTANCE;
        int length3 = this.rulers.length;
        x2[] x2VarArr2 = new x2[length3];
        for (int i17 = 0; i17 < length3; i17++) {
            x2VarArr2[i17] = this.rulers[i17].getRight();
        }
        this.right = companion3.c(x2VarArr2);
        r.Companion companion4 = r.INSTANCE;
        int length4 = this.rulers.length;
        r[] rVarArr2 = new r[length4];
        for (int i18 = 0; i18 < length4; i18++) {
            rVarArr2[i18] = this.rulers[i18].getBottom();
        }
        this.bottom = companion4.b(rVarArr2);
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
        return n.L0(this.rulers, null, "innermostOf(", ")", 0, null, null, 57, null);
    }
}
