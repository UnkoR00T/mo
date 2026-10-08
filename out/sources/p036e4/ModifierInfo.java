package p036e4;

import f3.m;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: e4.b1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Le4/b1;", "", "Lf3/m;", "modifier", "Le4/b0;", "coordinates", "extra", "<init>", "(Lf3/m;Le4/b0;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "Lf3/m;", "()Lf3/m;", "b", "Le4/b0;", "getCoordinates", "()Le4/b0;", "c", "Ljava/lang/Object;", "getExtra", "()Ljava/lang/Object;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ModifierInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m modifier;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0 coordinates;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object extra;

    public ModifierInfo(m mVar, b0 b0Var, Object obj) {
        this.modifier = mVar;
        this.coordinates = b0Var;
        this.extra = obj;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final m getModifier() {
        return this.modifier;
    }

    public String toString() {
        return "ModifierInfo(" + this.modifier + ", " + this.coordinates + ", " + this.extra + ')';
    }
}
