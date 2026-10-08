package r73;

import fr.t;
import hz.g;
import iy.b0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lr73/b;", "Lgz/a;", "Lp73/a;", "Lhz/b;", "Lr73/a;", "validator", "<init>", "(Lr73/a;)V", "params", "b", "(Liy/b0;)Lhz/b;", "a", "Lr73/a;", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.a<p73.a, hz.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a validator;

    public b(a aVar) {
        this.validator = aVar;
    }

    public hz.b b(b0 params) {
        g gVarA = this.validator.a(params);
        if (gVarA instanceof g.Invalid) {
            return new hz.b.Invalid(((g.Invalid) gVarA).b().getErrorMessage());
        }
        if (t.c(gVarA, g.b.f86853b)) {
            return hz.b.d.f86848c;
        }
        throw new p();
    }
}
