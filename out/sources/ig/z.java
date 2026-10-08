package ig;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class z implements c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f92293a;

    z(e eVar) {
        Objects.requireNonNull(eVar);
        this.f92293a = eVar;
    }

    @Override // ig.c.a
    public final void a(boolean z15) {
        Boolean boolValueOf = Boolean.valueOf(z15);
        e eVar = this.f92293a;
        eVar.f().sendMessage(eVar.f().obtainMessage(1, boolValueOf));
    }
}
