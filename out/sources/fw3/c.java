package fw3;

import fr.t;
import fx.Rectangle;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lfw3/c;", "Lgz/a;", "Lfw3/c$a;", "Lvx/a;", "Lux/b;", "detectedFaceTransformer", "<init>", "(Lux/b;)V", "params", "b", "(Lfw3/c$a;)Lvx/a;", "a", "Lux/b;", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.a<Params, vx.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ux.b detectedFaceTransformer;

    /* JADX INFO: renamed from: fw3.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lfw3/c$a;", "Lgz/b$a;", "Lvx/a;", "result", "Lfx/e;", "container", "", "shouldMirrorPoints", "isFillScaleType", "<init>", "(Lvx/a;Lfx/e;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lvx/a;", "b", "()Lvx/a;", "Lfx/e;", "()Lfx/e;", "c", "Z", "()Z", "d", "identityphoto_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final vx.a result;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Rectangle container;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldMirrorPoints;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFillScaleType;

        public Params(vx.a aVar, Rectangle rectangle, boolean z15, boolean z16) {
            this.result = aVar;
            this.container = rectangle;
            this.shouldMirrorPoints = z15;
            this.isFillScaleType = z16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Rectangle getContainer() {
            return this.container;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final vx.a getResult() {
            return this.result;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getShouldMirrorPoints() {
            return this.shouldMirrorPoints;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getIsFillScaleType() {
            return this.isFillScaleType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.result, params.result) && t.c(this.container, params.container) && this.shouldMirrorPoints == params.shouldMirrorPoints && this.isFillScaleType == params.isFillScaleType;
        }

        public int hashCode() {
            return (((((this.result.hashCode() * 31) + this.container.hashCode()) * 31) + Boolean.hashCode(this.shouldMirrorPoints)) * 31) + Boolean.hashCode(this.isFillScaleType);
        }

        public String toString() {
            return "Params(result=" + this.result + ", container=" + this.container + ", shouldMirrorPoints=" + this.shouldMirrorPoints + ", isFillScaleType=" + this.isFillScaleType + ')';
        }
    }

    public c(ux.b bVar) {
        this.detectedFaceTransformer = bVar;
    }

    public vx.a b(Params params) {
        vx.a result = params.getResult();
        if (result instanceof vx.a.Success) {
            return ((vx.a.Success) params.getResult()).a(this.detectedFaceTransformer.a(((vx.a.Success) params.getResult()).getFace(), params.getShouldMirrorPoints(), params.getContainer(), ((vx.a.Success) params.getResult()).getFaceContainer(), params.getIsFillScaleType()), params.getContainer());
        }
        if (result instanceof vx.a.InterfaceC5477a) {
            return params.getResult();
        }
        throw new p();
    }
}
