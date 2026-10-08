package p036e4;

import c5.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Le4/o2;", "Le4/a2$a;", "", "parentWidth", "Lc5/t;", "parentLayoutDirection", "", "density", "fontScale", "<init>", "(ILc5/t;FF)V", "b", "I", "n", "()I", "c", "Lc5/t;", "k", "()Lc5/t;", "d", "F", "getDensity", "()F", "e", "i2", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o2 extends a2.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int parentWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t parentLayoutDirection;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float density;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float fontScale;

    public o2(int i15, t tVar, float f15, float f16) {
        this.parentWidth = i15;
        this.parentLayoutDirection = tVar;
        this.density = f15;
        this.fontScale = f16;
    }

    @Override // e4.a2.a, c5.d
    public float getDensity() {
        return this.density;
    }

    @Override // e4.a2.a, c5.l
    /* JADX INFO: renamed from: i2, reason: from getter */
    public float getFontScale() {
        return this.fontScale;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.a2.a
    /* JADX INFO: renamed from: k, reason: from getter */
    public t getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // e4.a2.a
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getParentWidth() {
        return this.parentWidth;
    }
}
