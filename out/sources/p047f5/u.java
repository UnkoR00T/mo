package p047f5;

import c5.h;
import j5.c;
import j5.f;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00022\u00020\u0003B\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0018"}, d2 = {"Lf5/u;", "Lf5/t$a;", "", "Lf5/t;", "Lc5/h;", "value", "", "valueSymbol", "<init>", "(Lc5/h;Ljava/lang/String;)V", "(Ljava/lang/String;)V", "Lj5/c;", "a", "()Lj5/c;", "Lf5/v;", "b", "Lf5/v;", "c", "getMin$constraintlayout_compose_release", "()Lf5/v;", "min", "d", "getMax$constraintlayout_compose_release", "max", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u implements t.a, t {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v valueSymbol;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final v min;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v max;

    /* JADX WARN: Multi-variable type inference failed */
    private u(h hVar, String str) {
        this.valueSymbol = new v(hVar, str, "base", null);
        this.min = new v(0 == true ? 1 : 0, 0 == true ? 1 : 0, "min", 0 == true ? 1 : 0);
        this.max = new v(0 == true ? 1 : 0, 0 == true ? 1 : 0, "max", 0 == true ? 1 : 0);
    }

    public final c a() {
        if (this.min.b() && this.max.b()) {
            return this.valueSymbol.a();
        }
        f fVar = new f(new char[0]);
        if (!this.min.b()) {
            fVar.j0("min", this.min.a());
        }
        if (!this.max.b()) {
            fVar.j0("max", this.max.a());
        }
        fVar.j0("value", this.valueSymbol.a());
        return fVar;
    }

    public u(String str) {
        this(null, str);
    }
}
