package f1;

import java.util.List;
import p056h1.p1;
import p071kotlin.Metadata;
import p143z0.h2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf1/y0;", "state", "Lz0/h2;", "scrollScope", "Lh1/p1;", "a", "(Lf1/y0;Lz0/h2;)Lh1/p1;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s0 {

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006\u001a"}, d2 = {"f1/s0$a", "Lh1/p1;", "Lz0/h2;", "", "index", "offset", "Loq/i0;", "c", "(II)V", "targetIndex", "targetOffset", "f", "(II)I", "", "pixels", "d", "(F)F", "h", "()I", "firstVisibleItemIndex", "g", "firstVisibleItemScrollOffset", "b", "lastVisibleItemIndex", "a", "itemCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p1, h2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ h2 f54850a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y0 f54851b;

        a(h2 h2Var, y0 y0Var) {
            this.f54851b = y0Var;
            this.f54850a = h2Var;
        }

        @Override // p056h1.p1
        public int a() {
            return this.f54851b.C().getTotalItemsCount();
        }

        @Override // p056h1.p1
        public int b() {
            q qVar = (q) pq.v.z0(this.f54851b.C().j());
            if (qVar != null) {
                return qVar.getIndex();
            }
            return 0;
        }

        @Override // p056h1.p1
        public void c(int index, int offset) {
            this.f54851b.V(index, offset, true);
        }

        @Override // p143z0.h2
        public float d(float pixels) {
            return this.f54850a.d(pixels);
        }

        @Override // p056h1.p1
        public int f(int targetIndex, int targetOffset) {
            q qVar;
            b0 b0VarC = this.f54851b.C();
            int iA = 0;
            if (b0VarC.j().isEmpty()) {
                return 0;
            }
            int iH = h();
            if (targetIndex > b() || iH > targetIndex) {
                iA = (c0.a(b0VarC) * (targetIndex - h())) - g();
            } else {
                List<q> listJ = b0VarC.j();
                int size = listJ.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        qVar = null;
                        break;
                    }
                    qVar = listJ.get(i15);
                    if (qVar.getIndex() == targetIndex) {
                        break;
                    }
                    i15++;
                }
                q qVar2 = qVar;
                if (qVar2 != null) {
                    iA = qVar2.getOffset();
                }
            }
            return iA + targetOffset;
        }

        @Override // p056h1.p1
        public int g() {
            return this.f54851b.y();
        }

        @Override // p056h1.p1
        public int h() {
            return this.f54851b.x();
        }
    }

    public static final p1 a(y0 y0Var, h2 h2Var) {
        return new a(h2Var, y0Var);
    }
}
