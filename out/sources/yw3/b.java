package yw3;

import mu.p0;
import mu.r0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\n\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyw3/b;", "Lyw3/a;", "", "isFaceValidInitialValue", "<init>", "(Z)V", "isFaceValid", "Loq/i0;", "b", "Lmu/b0;", "a", "Lmu/b0;", "_isFaceValid", "Lmu/p0;", "Lmu/p0;", "()Lmu/p0;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<Boolean> _isFaceValid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0<Boolean> isFaceValid;

    public b(boolean z15) {
        mu.b0<Boolean> b0VarA = r0.a(Boolean.valueOf(z15));
        this._isFaceValid = b0VarA;
        this.isFaceValid = mu.i.b(b0VarA);
    }

    @Override // yw3.a
    public p0<Boolean> a() {
        return this.isFaceValid;
    }

    public void b(boolean isFaceValid) {
        Boolean value;
        mu.b0<Boolean> b0Var = this._isFaceValid;
        do {
            value = b0Var.getValue();
            value.getClass();
        } while (!b0Var.s(value, Boolean.valueOf(isFaceValid)));
    }

    public /* synthetic */ b(boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? false : z15);
    }
}
