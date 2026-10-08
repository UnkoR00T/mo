package h7;

import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001:\u0002\u000b\tB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H ¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lh7/d;", "", "", "Lh7/b;", "cubics", "<init>", "(Ljava/util/List;)V", "Lh7/g;", "f", "b", "(Lh7/g;)Lh7/d;", "a", "Ljava/util/List;", "()Ljava/util/List;", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<h7.b> cubics;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\n\u0010\b\u001a\u00060\u0005j\u0002`\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R!\u0010\u0007\u001a\u00060\u0005j\u0002`\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R!\u0010\b\u001a\u00060\u0005j\u0002`\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001d"}, d2 = {"Lh7/d$a;", "Lh7/d;", "", "Lh7/b;", "cubics", "Lr0/g;", "Landroidx/graphics/shapes/Point;", "vertex", "roundedCenter", "", "convex", "<init>", "(Ljava/util/List;JJZLfr/k;)V", "Lh7/g;", "f", "b", "(Lh7/g;)Lh7/d;", "", "toString", "()Ljava/lang/String;", "J", "getVertex-1ufDz9w", "()J", "c", "getRoundedCenter-1ufDz9w", "d", "Z", "getConvex", "()Z", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long vertex;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final long center;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean convex;

        public /* synthetic */ a(List list, long j15, long j16, boolean z15, fr.k kVar) {
            this(list, j15, j16, z15);
        }

        @Override // h7.d
        public d b(g f15) {
            List listC = v.c();
            int size = a().size();
            for (int i15 = 0; i15 < size; i15++) {
                listC.add(a().get(i15).n(f15));
            }
            return new a(v.a(listC), f.m(this.vertex, f15), f.m(this.center, f15), this.convex, null);
        }

        public String toString() {
            return "Corner: vertex=" + ((Object) r0.g.f(this.vertex)) + ", center=" + ((Object) r0.g.f(this.center)) + ", convex=" + this.convex;
        }

        private a(List<? extends h7.b> list, long j15, long j16, boolean z15) {
            super(list);
            this.vertex = j15;
            this.center = j16;
            this.convex = z15;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lh7/d$b;", "Lh7/d;", "", "Lh7/b;", "cubics", "<init>", "(Ljava/util/List;)V", "Lh7/g;", "f", "c", "(Lh7/g;)Lh7/d$b;", "", "toString", "()Ljava/lang/String;", "graphics-shapes_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b extends d {
        public b(List<? extends h7.b> list) {
            super(list);
        }

        @Override // h7.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(g f15) {
            List listC = v.c();
            int size = a().size();
            for (int i15 = 0; i15 < size; i15++) {
                listC.add(a().get(i15).n(f15));
            }
            return new b(v.a(listC));
        }

        public String toString() {
            return "Edge";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(List<? extends h7.b> list) {
        this.cubics = list;
    }

    public final List<h7.b> a() {
        return this.cubics;
    }

    public abstract d b(g f15);
}
