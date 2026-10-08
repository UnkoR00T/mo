package p056h1;

import er.l;
import f3.m;
import g4.g;
import g4.l0;
import ju.x;
import ju.z;
import o4.f;
import oq.i0;
import p036e4.n1;
import p071kotlin.Metadata;
import uq.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\u00052\n\u0010\n\u001a\u00060\u0002R\u00020\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0018\u00010\u0002R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lh1/e;", "Lg4/l0;", "Lh1/e$a;", "<init>", "()V", "Loq/i0;", "r", "(Ltq/e;)Ljava/lang/Object;", "p", "()Lh1/e$a;", "node", "q", "(Lh1/e$a;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lh1/e$a;", "attachedNode", "Lju/x;", "e", "Lju/x;", "lock", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends l0<a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a attachedNode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private x<i0> lock;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lh1/e$a;", "Lf3/m$c;", "<init>", "(Lh1/e;)V", "Loq/i0;", "W2", "()V", "o3", "X2", "Lg4/g$a;", "r", "Lg4/g$a;", "handle", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends m.c {

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private g.a handle;

        public a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 p3(a aVar, e eVar, f fVar) {
            g.a aVar2 = aVar.handle;
            if (aVar2 != null) {
                aVar2.a();
            }
            aVar.handle = null;
            x xVar = eVar.lock;
            if (xVar != null) {
                xVar.d0(i0.f148189a);
            }
            eVar.lock = null;
            return i0.f148189a;
        }

        @Override // f3.m.c
        public void W2() {
            e.this.attachedNode = this;
            if (e.this.lock != null) {
                o3();
            }
        }

        @Override // f3.m.c
        public void X2() {
            if (e.this.attachedNode == this) {
                e.this.attachedNode = null;
            }
            g.a aVar = this.handle;
            if (aVar != null) {
                aVar.a();
            }
            this.handle = null;
        }

        public final void o3() {
            final e eVar = e.this;
            this.handle = n1.a(this, 0L, 0L, new l() { // from class: h1.d
                @Override // er.l
                public final Object b(Object obj) {
                    return e.a.p3(this.f79346a, eVar, (f) obj);
                }
            });
        }
    }

    public boolean equals(Object other) {
        return other == this;
    }

    public int hashCode() {
        return 234;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public a create() {
        return new a();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void update(a node) {
    }

    public final Object r(tq.e<? super i0> eVar) {
        x<i0> xVarC = this.lock;
        if (xVarC == null) {
            xVarC = z.c(null, 1, null);
            this.lock = xVarC;
            a aVar = this.attachedNode;
            if (aVar != null && aVar.getIsAttached()) {
                aVar.o3();
            }
        }
        Object objI = xVarC.I(eVar);
        return objI == b.e() ? objI : i0.f148189a;
    }
}
