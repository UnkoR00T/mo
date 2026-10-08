package p036e4;

import java.util.ArrayList;
import java.util.Arrays;
import p071kotlin.Metadata;
import pq.n;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\tR\u001f\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\n\u0010\u0015¨\u0006\u0019"}, d2 = {"Le4/t;", "Le4/z2;", "", "name", "", "rulers", "<init>", "(Ljava/lang/String;[Le4/z2;)V", "toString", "()Ljava/lang/String;", "b", "Ljava/lang/String;", "getName", "c", "[Le4/z2;", "getRulers", "()[Le4/z2;", "Le4/c2;", "d", "Le4/c2;", "a", "()Le4/c2;", "current", "e", "maximum", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class t implements z2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z2[] rulers;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c2 current;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c2 maximum;

    public t(String str, z2[] z2VarArr) {
        this.name = str;
        this.rulers = z2VarArr;
        c2.Companion companion = c2.INSTANCE;
        ArrayList arrayList = new ArrayList(z2VarArr.length);
        for (z2 z2Var : z2VarArr) {
            arrayList.add(z2Var.getCurrent());
        }
        c2[] c2VarArr = (c2[]) arrayList.toArray(new c2[0]);
        this.current = e2.b(companion, (c2[]) Arrays.copyOf(c2VarArr, c2VarArr.length));
        c2.Companion companion2 = c2.INSTANCE;
        z2[] z2VarArr2 = this.rulers;
        ArrayList arrayList2 = new ArrayList(z2VarArr2.length);
        for (z2 z2Var2 : z2VarArr2) {
            arrayList2.add(z2Var2.getMaximum());
        }
        c2[] c2VarArr2 = (c2[]) arrayList2.toArray(new c2[0]);
        this.maximum = e2.b(companion2, (c2[]) Arrays.copyOf(c2VarArr2, c2VarArr2.length));
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

    public String toString() {
        String str = this.name;
        return str == null ? n.L0(this.rulers, null, "innermostOf(", ")", 0, null, null, 57, null) : str;
    }
}
