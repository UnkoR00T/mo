package p036e4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\b\u0010\u000f¨\u0006\u0013"}, d2 = {"Le4/a3;", "Le4/z2;", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "getName", "Le4/c2;", "c", "Le4/c2;", "a", "()Le4/c2;", "current", "d", "maximum", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a3 implements z2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c2 current;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c2 maximum;

    public a3(String str) {
        this.name = str;
        this.current = e2.a(str);
        this.maximum = e2.a(str + " maximum");
    }

    @Override // p036e4.z2
    /* JADX INFO: renamed from: a, reason: from getter */
    public c2 getCurrent() {
        return this.current;
    }

    @Override // p036e4.z2
    /* JADX INFO: renamed from: b, reason: from getter */
    public c2 getMaximum() {
        return this.maximum;
    }

    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getName() {
        return this.name;
    }
}
