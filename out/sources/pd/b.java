package pd;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import fd.a0;
import id.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import od.o;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import rd.j;
import td.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements hd.e, id.a.b, md.f {
    private Paint A;
    float B;
    BlurMaskFilter C;
    gd.a D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Path f156908a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix f156909b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f156910c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Paint f156911d = new gd.a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Paint f156912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Paint f156913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Paint f156914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Paint f156915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final RectF f156916i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final RectF f156917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RectF f156918k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final RectF f156919l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final RectF f156920m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f156921n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final Matrix f156922o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    final a0 f156923p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final e f156924q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private id.h f156925r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private id.d f156926s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b f156927t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b f156928u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List<b> f156929v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final List<id.a<?, ?>> f156930w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s f156931x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f156932y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f156933z;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f156934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f156935b;

        static {
            int[] iArr = new int[od.i.a.values().length];
            f156935b = iArr;
            try {
                iArr[od.i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f156935b[od.i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f156935b[od.i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f156935b[od.i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f156934a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f156934a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f156934a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f156934a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f156934a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f156934a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f156934a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    b(a0 a0Var, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f156912e = new gd.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f156913f = new gd.a(1, mode2);
        gd.a aVar = new gd.a(1);
        this.f156914g = aVar;
        this.f156915h = new gd.a(PorterDuff.Mode.CLEAR);
        this.f156916i = new RectF();
        this.f156917j = new RectF();
        this.f156918k = new RectF();
        this.f156919l = new RectF();
        this.f156920m = new RectF();
        this.f156922o = new Matrix();
        this.f156930w = new ArrayList();
        this.f156932y = true;
        this.B = 0.0f;
        this.f156923p = a0Var;
        this.f156924q = eVar;
        this.f156921n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        s sVarB = eVar.x().b();
        this.f156931x = sVarB;
        sVarB.e(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            id.h hVar = new id.h(eVar.h());
            this.f156925r = hVar;
            Iterator<id.a<o, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (id.a<Integer, Integer> aVar2 : this.f156925r.c()) {
                j(aVar2);
                aVar2.a(this);
            }
        }
        O();
    }

    private void D(RectF rectF, Matrix matrix) {
        this.f156918k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f156925r.b().size();
            for (int i15 = 0; i15 < size; i15++) {
                od.i iVar = this.f156925r.b().get(i15);
                Path pathH = this.f156925r.a().get(i15).h();
                if (pathH != null) {
                    this.f156908a.set(pathH);
                    this.f156908a.transform(matrix);
                    int i16 = a.f156935b[iVar.a().ordinal()];
                    if (i16 == 1 || i16 == 2) {
                        return;
                    }
                    if ((i16 == 3 || i16 == 4) && iVar.d()) {
                        return;
                    }
                    this.f156908a.computeBounds(this.f156920m, false);
                    if (i15 == 0) {
                        this.f156918k.set(this.f156920m);
                    } else {
                        RectF rectF2 = this.f156918k;
                        rectF2.set(Math.min(rectF2.left, this.f156920m.left), Math.min(this.f156918k.top, this.f156920m.top), Math.max(this.f156918k.right, this.f156920m.right), Math.max(this.f156918k.bottom, this.f156920m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f156918k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void E(RectF rectF, Matrix matrix) {
        if (C() && this.f156924q.i() != e.b.INVERT) {
            this.f156919l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f156927t.f(this.f156919l, matrix, true);
            if (rectF.intersect(this.f156919l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void F() {
        this.f156923p.invalidateSelf();
    }

    private void G(float f15) {
        this.f156923p.A().n().a(this.f156924q.j(), f15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(boolean z15) {
        if (z15 != this.f156932y) {
            this.f156932y = z15;
            F();
        }
    }

    private void O() {
        if (this.f156924q.f().isEmpty()) {
            N(true);
            return;
        }
        id.d dVar = new id.d(this.f156924q.f());
        this.f156926s = dVar;
        dVar.m();
        this.f156926s.a(new id.a.b() { // from class: pd.a
            @Override // id.a.b
            public final void a() {
                b bVar = this.f156907a;
                bVar.N(bVar.f156926s.r() == 1.0f);
            }
        });
        N(this.f156926s.h().floatValue() == 1.0f);
        j(this.f156926s);
    }

    private void k(Canvas canvas, Matrix matrix, id.a<o, Path> aVar, id.a<Integer, Integer> aVar2) {
        this.f156908a.set(aVar.h());
        this.f156908a.transform(matrix);
        this.f156911d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f156908a, this.f156911d);
    }

    private void l(Canvas canvas, Matrix matrix, id.a<o, Path> aVar, id.a<Integer, Integer> aVar2) {
        m.m(canvas, this.f156916i, this.f156912e);
        this.f156908a.set(aVar.h());
        this.f156908a.transform(matrix);
        this.f156911d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f156908a, this.f156911d);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, id.a<o, Path> aVar, id.a<Integer, Integer> aVar2) {
        m.m(canvas, this.f156916i, this.f156911d);
        canvas.drawRect(this.f156916i, this.f156911d);
        this.f156908a.set(aVar.h());
        this.f156908a.transform(matrix);
        this.f156911d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f156908a, this.f156913f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, id.a<o, Path> aVar, id.a<Integer, Integer> aVar2) {
        m.m(canvas, this.f156916i, this.f156912e);
        canvas.drawRect(this.f156916i, this.f156911d);
        this.f156913f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f156908a.set(aVar.h());
        this.f156908a.transform(matrix);
        canvas.drawPath(this.f156908a, this.f156913f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix, id.a<o, Path> aVar, id.a<Integer, Integer> aVar2) {
        m.m(canvas, this.f156916i, this.f156913f);
        canvas.drawRect(this.f156916i, this.f156911d);
        this.f156913f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f156908a.set(aVar.h());
        this.f156908a.transform(matrix);
        canvas.drawPath(this.f156908a, this.f156913f);
        canvas.restore();
    }

    private void p(Canvas canvas, Matrix matrix) {
        if (fd.e.h()) {
            fd.e.b("Layer#saveLayer");
        }
        m.n(canvas, this.f156916i, this.f156912e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (fd.e.h()) {
            fd.e.c("Layer#saveLayer");
        }
        for (int i15 = 0; i15 < this.f156925r.b().size(); i15++) {
            od.i iVar = this.f156925r.b().get(i15);
            id.a<o, Path> aVar = this.f156925r.a().get(i15);
            id.a<Integer, Integer> aVar2 = this.f156925r.c().get(i15);
            int i16 = a.f156935b[iVar.a().ordinal()];
            if (i16 != 1) {
                if (i16 == 2) {
                    if (i15 == 0) {
                        this.f156911d.setColor(-16777216);
                        this.f156911d.setAlpha(GF2Field.MASK);
                        canvas.drawRect(this.f156916i, this.f156911d);
                    }
                    if (iVar.d()) {
                        o(canvas, matrix, aVar, aVar2);
                    } else {
                        q(canvas, matrix, aVar);
                    }
                } else if (i16 != 3) {
                    if (i16 == 4) {
                        if (iVar.d()) {
                            m(canvas, matrix, aVar, aVar2);
                        } else {
                            k(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    n(canvas, matrix, aVar, aVar2);
                } else {
                    l(canvas, matrix, aVar, aVar2);
                }
            } else if (r()) {
                this.f156911d.setAlpha(GF2Field.MASK);
                canvas.drawRect(this.f156916i, this.f156911d);
            }
        }
        if (fd.e.h()) {
            fd.e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (fd.e.h()) {
            fd.e.c("Layer#restoreLayer");
        }
    }

    private void q(Canvas canvas, Matrix matrix, id.a<o, Path> aVar) {
        this.f156908a.set(aVar.h());
        this.f156908a.transform(matrix);
        canvas.drawPath(this.f156908a, this.f156913f);
    }

    private boolean r() {
        if (this.f156925r.a().isEmpty()) {
            return false;
        }
        for (int i15 = 0; i15 < this.f156925r.b().size(); i15++) {
            if (this.f156925r.b().get(i15).a() != od.i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        if (this.f156929v != null) {
            return;
        }
        if (this.f156928u == null) {
            this.f156929v = Collections.EMPTY_LIST;
            return;
        }
        this.f156929v = new ArrayList();
        for (b bVar = this.f156928u; bVar != null; bVar = bVar.f156928u) {
            this.f156929v.add(bVar);
        }
    }

    private void t(Canvas canvas) {
        if (fd.e.h()) {
            fd.e.b("Layer#clearLayer");
        }
        RectF rectF = this.f156916i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f156915h);
        if (fd.e.h()) {
            fd.e.c("Layer#clearLayer");
        }
    }

    static b v(c cVar, e eVar, a0 a0Var, fd.f fVar) {
        switch (a.f156934a[eVar.g().ordinal()]) {
            case 1:
                return new g(a0Var, eVar, cVar, fVar);
            case 2:
                return new c(a0Var, eVar, fVar.o(eVar.n()), fVar);
            case 3:
                return new h(a0Var, eVar);
            case 4:
                return new d(a0Var, eVar);
            case 5:
                return new f(a0Var, eVar);
            case 6:
                return new i(a0Var, eVar);
            default:
                td.e.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    e A() {
        return this.f156924q;
    }

    boolean B() {
        id.h hVar = this.f156925r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    boolean C() {
        return this.f156927t != null;
    }

    public void H(id.a<?, ?> aVar) {
        this.f156930w.remove(aVar);
    }

    void I(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
    }

    void J(b bVar) {
        this.f156927t = bVar;
    }

    void K(boolean z15) {
        if (z15 && this.A == null) {
            this.A = new gd.a();
        }
        this.f156933z = z15;
    }

    void L(b bVar) {
        this.f156928u = bVar;
    }

    void M(float f15) {
        if (fd.e.h()) {
            fd.e.b("BaseLayer#setProgress");
            fd.e.b("BaseLayer#setProgress.transform");
        }
        this.f156931x.m(f15);
        if (fd.e.h()) {
            fd.e.c("BaseLayer#setProgress.transform");
        }
        if (this.f156925r != null) {
            if (fd.e.h()) {
                fd.e.b("BaseLayer#setProgress.mask");
            }
            for (int i15 = 0; i15 < this.f156925r.a().size(); i15++) {
                this.f156925r.a().get(i15).n(f15);
            }
            if (fd.e.h()) {
                fd.e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f156926s != null) {
            if (fd.e.h()) {
                fd.e.b("BaseLayer#setProgress.inout");
            }
            this.f156926s.n(f15);
            if (fd.e.h()) {
                fd.e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f156927t != null) {
            if (fd.e.h()) {
                fd.e.b("BaseLayer#setProgress.matte");
            }
            this.f156927t.M(f15);
            if (fd.e.h()) {
                fd.e.c("BaseLayer#setProgress.matte");
            }
        }
        if (fd.e.h()) {
            fd.e.b("BaseLayer#setProgress.animations." + this.f156930w.size());
        }
        for (int i16 = 0; i16 < this.f156930w.size(); i16++) {
            this.f156930w.get(i16).n(f15);
        }
        if (fd.e.h()) {
            fd.e.c("BaseLayer#setProgress.animations." + this.f156930w.size());
            fd.e.c("BaseLayer#setProgress");
        }
    }

    @Override // id.a.b
    public void a() {
        F();
    }

    @Override // hd.c
    public void b(List<hd.c> list, List<hd.c> list2) {
    }

    @Override // md.f
    public void c(md.e eVar, int i15, List<md.e> list, md.e eVar2) {
        b bVar = this.f156927t;
        if (bVar != null) {
            md.e eVarA = eVar2.a(bVar.getName());
            if (eVar.c(this.f156927t.getName(), i15)) {
                list.add(eVarA.i(this.f156927t));
            }
            if (eVar.g(this.f156927t.getName(), i15) && eVar.h(getName(), i15)) {
                this.f156927t.I(eVar, eVar.e(this.f156927t.getName(), i15) + i15, list, eVarA);
            }
        }
        if (eVar.g(getName(), i15)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i15)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i15)) {
                I(eVar, i15 + eVar.e(getName(), i15), list, eVar2);
            }
        }
    }

    @Override // hd.e
    public void d(Canvas canvas, Matrix matrix, int i15, td.b bVar) {
        Paint paint;
        Integer numH;
        fd.e.b(this.f156921n);
        if (!this.f156932y || this.f156924q.y()) {
            fd.e.c(this.f156921n);
            return;
        }
        s();
        if (fd.e.h()) {
            fd.e.b("Layer#parentMatrix");
        }
        this.f156909b.reset();
        this.f156909b.set(matrix);
        for (int size = this.f156929v.size() - 1; size >= 0; size--) {
            this.f156909b.preConcat(this.f156929v.get(size).f156931x.i());
        }
        if (fd.e.h()) {
            fd.e.c("Layer#parentMatrix");
        }
        id.a<?, Integer> aVarK = this.f156931x.k();
        int iIntValue = (int) ((((i15 / 255.0f) * ((aVarK == null || (numH = aVarK.h()) == null) ? 100 : numH.intValue())) / 100.0f) * 255.0f);
        if (!C() && !B() && w() == od.h.NORMAL) {
            this.f156909b.preConcat(this.f156931x.i());
            if (fd.e.h()) {
                fd.e.b("Layer#drawLayer");
            }
            u(canvas, this.f156909b, iIntValue, bVar);
            if (fd.e.h()) {
                fd.e.c("Layer#drawLayer");
            }
            G(fd.e.c(this.f156921n));
            return;
        }
        if (fd.e.h()) {
            fd.e.b("Layer#computeBounds");
        }
        f(this.f156916i, this.f156909b, false);
        E(this.f156916i, matrix);
        this.f156909b.preConcat(this.f156931x.i());
        D(this.f156916i, this.f156909b);
        this.f156917j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f156910c);
        if (!this.f156910c.isIdentity()) {
            Matrix matrix2 = this.f156910c;
            matrix2.invert(matrix2);
            this.f156910c.mapRect(this.f156917j);
        }
        if (!this.f156916i.intersect(this.f156917j)) {
            this.f156916i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (fd.e.h()) {
            fd.e.c("Layer#computeBounds");
        }
        if (this.f156916i.width() >= 1.0f && this.f156916i.height() >= 1.0f) {
            if (fd.e.h()) {
                fd.e.b("Layer#saveLayer");
            }
            this.f156911d.setAlpha(GF2Field.MASK);
            x5.i.b(this.f156911d, w().e());
            m.m(canvas, this.f156916i, this.f156911d);
            if (fd.e.h()) {
                fd.e.c("Layer#saveLayer");
            }
            if (w() != od.h.MULTIPLY) {
                t(canvas);
            } else if (Build.VERSION.SDK_INT < 29) {
                if (this.D == null) {
                    gd.a aVar = new gd.a();
                    this.D = aVar;
                    aVar.setColor(-1);
                }
                RectF rectF = this.f156916i;
                canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.D);
            }
            if (fd.e.h()) {
                fd.e.b("Layer#drawLayer");
            }
            u(canvas, this.f156909b, iIntValue, bVar);
            if (fd.e.h()) {
                fd.e.c("Layer#drawLayer");
            }
            if (B()) {
                p(canvas, this.f156909b);
            }
            if (C()) {
                if (fd.e.h()) {
                    fd.e.b("Layer#drawMatte");
                    fd.e.b("Layer#saveLayer");
                }
                m.n(canvas, this.f156916i, this.f156914g, 19);
                if (fd.e.h()) {
                    fd.e.c("Layer#saveLayer");
                }
                t(canvas);
                this.f156927t.d(canvas, matrix, i15, null);
                if (fd.e.h()) {
                    fd.e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (fd.e.h()) {
                    fd.e.c("Layer#restoreLayer");
                    fd.e.c("Layer#drawMatte");
                }
            }
            if (fd.e.h()) {
                fd.e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (fd.e.h()) {
                fd.e.c("Layer#restoreLayer");
            }
        }
        if (this.f156933z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f156916i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.f156916i, this.A);
        }
        G(fd.e.c(this.f156921n));
    }

    @Override // hd.e
    public void f(RectF rectF, Matrix matrix, boolean z15) {
        this.f156916i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f156922o.set(matrix);
        if (z15) {
            List<b> list = this.f156929v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f156922o.preConcat(this.f156929v.get(size).f156931x.i());
                }
            } else {
                b bVar = this.f156928u;
                if (bVar != null) {
                    this.f156922o.preConcat(bVar.f156931x.i());
                }
            }
        }
        this.f156922o.preConcat(this.f156931x.i());
    }

    @Override // md.f
    public <T> void g(T t15, ud.c<T> cVar) {
        this.f156931x.f(t15, cVar);
    }

    @Override // hd.c
    public String getName() {
        return this.f156924q.j();
    }

    public void j(id.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f156930w.add(aVar);
    }

    abstract void u(Canvas canvas, Matrix matrix, int i15, td.b bVar);

    public od.h w() {
        return this.f156924q.a();
    }

    public od.a x() {
        return this.f156924q.b();
    }

    public BlurMaskFilter y(float f15) {
        if (this.B == f15) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f15 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f15;
        return blurMaskFilter;
    }

    public j z() {
        return this.f156924q.d();
    }
}
