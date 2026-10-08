package bs;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends y implements qs.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Field f21267a;

    public w(Field field) {
        this.f21267a = field;
    }

    @Override // qs.n
    public boolean M() {
        return U().isEnumConstant();
    }

    @Override // qs.n
    public boolean R() {
        return false;
    }

    @Override // bs.y
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public Field U() {
        return this.f21267a;
    }

    @Override // qs.n
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public e0 getType() {
        return e0.f21231a.a(U().getGenericType());
    }
}
