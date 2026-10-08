package g4;

import m3.MutableRect;
import n3.v2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H&¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H&¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\tH&¢\u0006\u0004\b\"\u0010#J9\u0010(\u001a\u00020\u00042\u001a\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00040$2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&H&¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b.\u0010-R\u0014\u00101\u001a\u00020*8&X¦\u0004¢\u0006\u0006\u001a\u0004\b/\u00100ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00062À\u0006\u0001"}, d2 = {"Lg4/a1;", "", "Ln3/v2;", "scope", "Loq/i0;", "f", "(Ln3/v2;)V", "Lm3/e;", "position", "", "g", "(J)Z", "Lc5/n;", "j", "(J)V", "Lc5/r;", "size", "e", "Ln3/h1;", "canvas", "Lq3/c;", "parentLayer", "l", "(Ln3/h1;Lq3/c;)V", "k", "()V", "invalidate", "destroy", "point", "inverse", "d", "(JZ)J", "Lm3/c;", "rect", "c", "(Lm3/c;Z)V", "Lkotlin/Function2;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "h", "(Ler/p;Ler/a;)V", "Ln3/g2;", "matrix", "b", "([F)V", "i", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a1 {
    void b(float[] matrix);

    void c(MutableRect rect, boolean inverse);

    long d(long point, boolean inverse);

    void destroy();

    void e(long size);

    void f(v2 scope);

    boolean g(long position);

    /* JADX INFO: renamed from: getUnderlyingMatrix-sQKQjiQ */
    float[] mo27getUnderlyingMatrixsQKQjiQ();

    void h(er.p<? super n3.h1, ? super q3.c, oq.i0> drawBlock, er.a<oq.i0> invalidateParentLayer);

    void i(float[] matrix);

    void invalidate();

    void j(long position);

    void k();

    void l(n3.h1 canvas, q3.c parentLayer);
}
