package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lf3/m$b;", "prev", "next", "", "c", "(Lf3/m$b;Lf3/m$b;)I", "Lf3/m$c;", "T", "Lg4/l0;", "node", "Loq/i0;", "e", "(Lg4/l0;Lf3/m$c;)V", "Lf3/m;", "Ln2/c;", "result", "stack", "d", "(Lf3/m;Ln2/c;Ln2/c;)Ln2/c;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q0 {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/m$b;", "element", "", "c", "(Lf3/m$b;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<f3.m.b, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n2.c<f3.m.b> f70383b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(n2.c<f3.m.b> cVar) {
            super(1);
            this.f70383b = cVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(f3.m.b bVar) {
            this.f70383b.d(bVar);
            return Boolean.TRUE;
        }
    }

    public static final int c(f3.m.b bVar, f3.m.b bVar2) {
        if (fr.t.c(bVar, bVar2)) {
            return 2;
        }
        return f3.b.a(bVar, bVar2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final n2.c<f3.m.b> d(f3.m mVar, n2.c<f3.m.b> cVar, n2.c<f3.m> cVar2) {
        cVar2.d(mVar);
        a aVar = null;
        while (cVar2.getSize() != 0) {
            f3.m mVarV = cVar2.v(cVar2.getSize() - 1);
            if (mVarV instanceof f3.g) {
                f3.g gVar = (f3.g) mVarV;
                cVar2.d(gVar.getInner());
                cVar2.d(gVar.getOuter());
            } else if (mVarV instanceof f3.m.b) {
                cVar.d(mVarV);
            } else {
                if (aVar == null) {
                    aVar = new a(cVar);
                }
                mVarV.d(aVar);
                aVar = aVar;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends f3.m.c> void e(l0<T> l0Var, f3.m.c cVar) {
        l0Var.update(cVar);
    }
}
