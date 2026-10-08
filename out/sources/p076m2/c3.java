package p076m2;

import er.l;
import fr.t;
import n2.b;
import p071kotlin.Metadata;
import r0.a1;
import r0.q0;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\r\u001a\u0004\u0018\u00010\u00062\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\u00020\u000f2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R(\u0010\u0019\u001a\u0016\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0004\u0012\u00020\u00060\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018¨\u0006\u001b"}, d2 = {"Lm2/c3;", "", "<init>", "()V", "Lm2/o2;", "content", "Lm2/d3;", "nestedContent", "Loq/i0;", "b", "(Lm2/o2;Lm2/d3;)V", "c", "key", "e", "(Lm2/o2;)Lm2/d3;", "", "d", "(Lm2/o2;)Z", "Lm2/s2;", "reference", "f", "(Lm2/s2;)V", "Ln2/b;", "a", "Lr0/t0;", "contentMap", "containerMap", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, Object> contentMap = b.e(null, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, Object> containerMap = b.e(null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(s2 s2Var, d3 d3Var) {
        return t.c(d3Var.getContainer(), s2Var);
    }

    public final void b(o2<Object> content, d3 nestedContent) {
        b.a(this.contentMap, content, nestedContent);
        b.a(this.containerMap, nestedContent.getContainer(), content);
    }

    public final void c() {
        b.c(this.contentMap);
        b.c(this.containerMap);
    }

    public final boolean d(o2<Object> key) {
        return b.f(this.contentMap, key);
    }

    public final d3 e(o2<Object> key) {
        d3 d3Var = (d3) b.m(this.contentMap, key);
        if (b.j(this.contentMap)) {
            b.c(this.containerMap);
        }
        return d3Var;
    }

    public final void f(final s2 reference) {
        Object objE = this.containerMap.e(reference);
        if (objE != null) {
            if (!(objE instanceof q0)) {
                b.n(this.contentMap, (o2) objE, new l() { // from class: m2.b3
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(c3.g(reference, (d3) obj));
                    }
                });
                return;
            }
            a1 a1Var = (a1) objE;
            Object[] objArr = a1Var.content;
            int i15 = a1Var._size;
            for (int i16 = 0; i16 < i15; i16++) {
                b.n(this.contentMap, (o2) objArr[i16], new l() { // from class: m2.b3
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(c3.g(reference, (d3) obj));
                    }
                });
            }
        }
    }
}
