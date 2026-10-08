package f3;

import g4.z;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f3.w, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0006¨\u0006\u0017"}, d2 = {"Lf3/w;", "Lg4/z;", "Lf3/m$c;", "", "zIndex", "<init>", "(F)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "", "toString", "()Ljava/lang/String;", "r", "F", "n3", "()F", "o3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ZIndexModifier extends m.c implements z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private float zIndex;

    /* JADX INFO: renamed from: f3.w$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f58831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ZIndexModifier f58832c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a2 a2Var, ZIndexModifier zIndexModifier) {
            super(1);
            this.f58831b = a2Var;
            this.f58832c = zIndexModifier;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            aVar.y(this.f58831b, 0, 0, this.f58832c.getZIndex());
        }
    }

    public ZIndexModifier(float f15) {
        this.zIndex = f15;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        a2 a2VarO0 = v0Var.o0(j15);
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new a(a2VarO0, this), 4, null);
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final void o3(float f15) {
        this.zIndex = f15;
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.zIndex + ')';
    }
}
