package p060i1;

import lr.m;
import p056h1.p1;
import p071kotlin.Metadata;
import p143z0.h2;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li1/i1;", "state", "Lz0/h2;", "scrollScope", "Lh1/p1;", "a", "(Li1/i1;Lz0/h2;)Lh1/p1;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"i1/z0$a", "Lh1/p1;", "Lz0/h2;", "", "index", "offset", "Loq/i0;", "c", "(II)V", "targetIndex", "targetOffset", "f", "(II)I", "", "pixels", "d", "(F)F", "h", "()I", "firstVisibleItemIndex", "g", "firstVisibleItemScrollOffset", "b", "lastVisibleItemIndex", "a", "itemCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p1, h2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ h2 f88097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i1 f88098b;

        a(h2 h2Var, i1 i1Var) {
            this.f88098b = i1Var;
            this.f88097a = h2Var;
        }

        @Override // p056h1.p1
        public int a() {
            return this.f88098b.N();
        }

        @Override // p056h1.p1
        public int b() {
            return ((o) v.x0(this.f88098b.I().j())).getIndex();
        }

        @Override // p056h1.p1
        public void c(int index, int offset) {
            float fP = this.f88098b.P();
            this.f88098b.w0(index, fP != 0.0f ? offset / fP : 0.0f, true);
        }

        @Override // p143z0.h2
        public float d(float pixels) {
            return this.f88097a.d(pixels);
        }

        @Override // p056h1.p1
        public int f(int targetIndex, int targetOffset) {
            return (int) (m.o(y0.a(this.f88098b) + ((long) hr.a.d((((targetIndex - this.f88098b.A()) * this.f88098b.P()) - (this.f88098b.B() * this.f88098b.P())) + targetOffset)), this.f88098b.getMinScrollOffset(), this.f88098b.getMaxScrollOffset()) - y0.a(this.f88098b));
        }

        @Override // p056h1.p1
        public int g() {
            return this.f88098b.getFirstVisiblePageOffset();
        }

        @Override // p056h1.p1
        public int h() {
            return this.f88098b.getFirstVisiblePage();
        }
    }

    public static final p1 a(i1 i1Var, h2 h2Var) {
        return new a(h2Var, i1Var);
    }
}
