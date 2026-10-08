package a4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"La4/s0;", "Lkotlin/Function1;", "", "Loq/i0;", "<init>", "()V", "disallowIntercept", "c", "(Z)V", "La4/l0;", "a", "La4/l0;", "getPointerInteropFilter$ui", "()La4/l0;", "e", "(La4/l0;)V", "pointerInteropFilter", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 implements er.l<Boolean, oq.i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private l0 pointerInteropFilter;

    @Override // er.l
    public /* bridge */ /* synthetic */ oq.i0 b(Boolean bool) {
        c(bool.booleanValue());
        return oq.i0.f148189a;
    }

    public void c(boolean disallowIntercept) {
        l0 l0Var = this.pointerInteropFilter;
        if (l0Var != null) {
            l0Var.m(disallowIntercept);
        }
    }

    public final void e(l0 l0Var) {
        this.pointerInteropFilter = l0Var;
    }
}
