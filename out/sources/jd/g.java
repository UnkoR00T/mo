package jd;

import c5.s;
import fr.w;
import g4.z;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Ljd/g;", "Lf3/m$c;", "Lg4/z;", "", "width", "height", "<init>", "(II)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "r", "I", "getWidth", "()I", "o3", "(I)V", "s", "getHeight", "n3", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class g extends f3.m.c implements z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private int height;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends w implements er.l<a2.a, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a2 f101792b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(a2 a2Var) {
            super(1);
            this.f101792b = a2Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
            c(aVar);
            return i0.f148189a;
        }

        public final void c(a2.a aVar) {
            a2.a.I(aVar, this.f101792b, 0, 0, 0.0f, 4, null);
        }
    }

    public g(int i15, int i16) {
        this.width = i15;
        this.height = i16;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        long jA;
        long jD = c5.c.d(j15, s.a(this.width, this.height));
        if (c5.b.k(j15) != Integer.MAX_VALUE || c5.b.l(j15) == Integer.MAX_VALUE) {
            jA = (c5.b.l(j15) != Integer.MAX_VALUE || c5.b.k(j15) == Integer.MAX_VALUE) ? c5.c.a(c5.r.g(jD), c5.r.g(jD), c5.r.f(jD), c5.r.f(jD)) : c5.c.a((c5.r.f(jD) * this.width) / this.height, (c5.r.f(jD) * this.width) / this.height, c5.r.f(jD), c5.r.f(jD));
        } else {
            jA = c5.c.a(c5.r.g(jD), c5.r.g(jD), (c5.r.g(jD) * this.height) / this.width, (c5.r.g(jD) * this.height) / this.width);
        }
        a2 a2VarO0 = v0Var.o0(jA);
        return y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new a(a2VarO0), 4, null);
    }

    public final void n3(int i15) {
        this.height = i15;
    }

    public final void o3(int i15) {
        this.width = i15;
    }
}
