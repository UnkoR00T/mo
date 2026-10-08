package p1;

import er.l;
import fr.k;
import p071kotlin.Metadata;
import q1.TextContextMenuData;
import q1.f;
import r0.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0003R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R&\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0016"}, d2 = {"Lp1/a;", "", "<init>", "()V", "Lq1/c;", "c", "()Lq1/c;", "Lkotlin/Function1;", "Lq1/b;", "", "filter", "Loq/i0;", "b", "(Ler/l;)V", "component", "a", "(Lq1/b;)V", "d", "Lr0/q0;", "Lr0/q0;", "components", "filters", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q0<q1.b> components;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q0<l<q1.b, Boolean>> filters;

    public a() {
        int i15 = 0;
        int i16 = 1;
        k kVar = null;
        this.components = new q0<>(i15, i16, kVar);
        this.filters = new q0<>(i15, i16, kVar);
    }

    public final void a(q1.b component) {
        this.components.n(component);
    }

    public final void b(l<? super q1.b, Boolean> filter) {
        this.filters.n(filter);
    }

    public final TextContextMenuData c() {
        q0 q0Var = new q0(0, 1, false ? 1 : 0);
        q0<q1.b> q0Var2 = this.components;
        Object[] objArr = q0Var2.content;
        int i15 = q0Var2._size;
        int i16 = 0;
        boolean z15 = true;
        q1.b bVar = null;
        while (i16 < i15) {
            q1.b bVar2 = (q1.b) objArr[i16];
            if (!z15 || bVar2 != f.f163564b) {
                if (b.a(bVar2) && b.a(bVar)) {
                    z15 = false;
                } else {
                    if (!b.a(bVar2)) {
                        q0<l<q1.b, Boolean>> q0Var3 = this.filters;
                        Object[] objArr2 = q0Var3.content;
                        int i17 = q0Var3._size;
                        int i18 = 0;
                        while (true) {
                            if (i18 < i17) {
                                if (((Boolean) ((l) objArr2[i18]).b(bVar2)).booleanValue()) {
                                    i18++;
                                } else {
                                    z15 = false;
                                }
                            }
                        }
                    }
                    q0Var.n(bVar2);
                    z15 = false;
                    bVar = bVar2;
                }
            }
            i16++;
            z15 = z15;
        }
        if (b.a((q1.b) (q0Var.g() ? null : q0Var.content[q0Var._size - 1]))) {
            q0Var.B(q0Var._size - 1);
        }
        return new TextContextMenuData(q0Var.s());
    }

    public final void d() {
        this.components.n(f.f163564b);
    }
}
