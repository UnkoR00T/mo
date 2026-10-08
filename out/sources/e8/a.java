package e8;

import a8.a3;
import android.content.Context;
import android.graphics.Point;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import t7.w;
import t7.x;
import w7.o0;
import z7.h;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h<z7.f, e, c> implements e8.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Context f48325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f48326p;

    /* JADX INFO: renamed from: e8.a$a, reason: collision with other inner class name */
    class C1119a extends e {
        C1119a() {
        }

        @Override // z7.g
        public void w() {
            a.this.u(this);
        }
    }

    public static final class b implements e8.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f48328a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f48329b = -1;

        public b(Context context) {
            this.f48328a = (Context) p.q(context);
        }

        @Override // e8.b.a
        public int a(t7.p pVar) {
            String str = pVar.f188381p;
            if (str == null || !w.i(str)) {
                return a3.y(0);
            }
            return o0.w0(pVar.f188381p) ? a3.y(4) : a3.y(1);
        }

        @Override // e8.b.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a(this.f48328a, this.f48329b, null);
        }
    }

    /* synthetic */ a(Context context, int i15, C1119a c1119a) {
        this(context, i15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z7.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c l(Throwable th4) {
        return new c("Unexpected decode error", th4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z7.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c m(z7.f fVar, e eVar, boolean z15) {
        ByteBuffer byteBuffer = (ByteBuffer) p.q(fVar.f233228d);
        p.w(byteBuffer.hasArray());
        p.d(byteBuffer.arrayOffset() == 0);
        try {
            int iMax = this.f48326p;
            if (iMax == -1) {
                Context context = this.f48325o;
                if (context != null) {
                    Point pointR = o0.R(context);
                    int i15 = pointR.x;
                    int i16 = pointR.y;
                    t7.p pVar = fVar.f233226b;
                    if (pVar != null) {
                        int i17 = pVar.O;
                        if (i17 != -1) {
                            i15 *= i17;
                        }
                        int i18 = pVar.P;
                        if (i18 != -1) {
                            i16 *= i18;
                        }
                    }
                    iMax = (Math.max(i15, i16) * 2) - 1;
                } else {
                    iMax = PKIFailureInfo.certConfirmed;
                }
            }
            eVar.f48331e = y7.c.a(byteBuffer.array(), byteBuffer.remaining(), null, iMax);
            eVar.f233236b = fVar.f233230f;
            return null;
        } catch (x e15) {
            return new c("Could not decode image data with BitmapFactory.", e15);
        } catch (IOException e16) {
            return new c(e16);
        }
    }

    @Override // z7.h, z7.d, e8.b
    public /* bridge */ /* synthetic */ e a() {
        return (e) super.a();
    }

    @Override // z7.h
    protected z7.f j() {
        return new z7.f(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // z7.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public e k() {
        return new C1119a();
    }

    private a(Context context, int i15) {
        super(new z7.f[1], new e[1]);
        this.f48325o = context;
        this.f48326p = i15;
    }
}
