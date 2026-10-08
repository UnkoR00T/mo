package ka0;

import mu.b0;
import mu.i;
import mu.p0;
import mu.r0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"Lka0/b;", "Lka0/a;", "<init>", "()V", "", "enabled", "Loq/i0;", "a", "(Z)V", "Lmu/b0;", "Lmu/b0;", "_isSchoolEnabled", "Lmu/p0;", "b", "Lmu/p0;", "()Lmu/p0;", "isSchoolEnabled", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<Boolean> _isSchoolEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0<Boolean> isSchoolEnabled;

    public b() {
        b0<Boolean> b0VarA = r0.a(null);
        this._isSchoolEnabled = b0VarA;
        this.isSchoolEnabled = i.b(b0VarA);
    }

    @Override // ka0.a
    public void a(boolean enabled) {
        b0<Boolean> b0Var = this._isSchoolEnabled;
        while (!b0Var.s(b0Var.getValue(), Boolean.valueOf(enabled))) {
        }
    }

    @Override // ka0.a
    public p0<Boolean> b() {
        return this.isSchoolEnabled;
    }
}
