package n3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r"}, d2 = {"Ln3/i2;", "", "<init>", "()V", "Lm3/g;", "a", "()Lm3/g;", "bounds", "b", "c", "Ln3/i2$a;", "Ln3/i2$b;", "Ln3/i2$c;", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i2 {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000b¨\u0006\r"}, d2 = {"Ln3/i2$a;", "Ln3/i2;", "Ln3/m2;", "path", "<init>", "(Ln3/m2;)V", "a", "Ln3/m2;", "b", "()Ln3/m2;", "Lm3/g;", "()Lm3/g;", "bounds", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends i2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m2 path;

        public a(m2 m2Var) {
            super(null);
            this.path = m2Var;
        }

        @Override // n3.i2
        /* JADX INFO: renamed from: a */
        public m3.g getRect() {
            return this.path.getBounds();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final m2 getPath() {
            return this.path;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0013"}, d2 = {"Ln3/i2$b;", "Ln3/i2;", "Lm3/g;", "rect", "<init>", "(Lm3/g;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lm3/g;", "b", "()Lm3/g;", "bounds", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends i2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m3.g rect;

        public b(m3.g gVar) {
            super(null);
            this.rect = gVar;
        }

        @Override // n3.i2
        /* JADX INFO: renamed from: a, reason: from getter */
        public m3.g getRect() {
            return this.rect;
        }

        public final m3.g b() {
            return this.rect;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof b) && fr.t.c(this.rect, ((b) other).rect);
        }

        public int hashCode() {
            return this.rect.hashCode();
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001a"}, d2 = {"Ln3/i2$c;", "Ln3/i2;", "Lm3/i;", "roundRect", "<init>", "(Lm3/i;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lm3/i;", "b", "()Lm3/i;", "Ln3/m2;", "Ln3/m2;", "c", "()Ln3/m2;", "roundRectPath", "Lm3/g;", "()Lm3/g;", "bounds", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends i2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final m3.i roundRect;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final m2 roundRectPath;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(m3.i iVar) {
            super(0 == true ? 1 : 0);
            m2 m2Var = null;
            this.roundRect = iVar;
            if (!m3.j.h(iVar)) {
                m2 m2VarA = u0.a();
                m2.o(m2VarA, iVar, null, 2, null);
                m2Var = m2VarA;
            }
            this.roundRectPath = m2Var;
        }

        @Override // n3.i2
        /* JADX INFO: renamed from: a */
        public m3.g getRect() {
            return m3.j.f(this.roundRect);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final m3.i getRoundRect() {
            return this.roundRect;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final m2 getRoundRectPath() {
            return this.roundRectPath;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && fr.t.c(this.roundRect, ((c) other).roundRect);
        }

        public int hashCode() {
            return this.roundRect.hashCode();
        }
    }

    public /* synthetic */ i2(fr.k kVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract m3.g getRect();

    private i2() {
    }
}
