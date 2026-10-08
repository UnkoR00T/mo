package ae2;

import er.p;
import java.util.List;
import java.util.concurrent.CancellationException;
import ju.p0;
import ju.q0;
import ju.w0;
import o04.FileName;
import oq.i0;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import vy.Axis;
import vy.Coordinates;
import vy.OrientationAngle;
import zd2.ImageAttachments;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lae2/d;", "Lae2/c;", "Lbc4/k;", "pickPhotoFromCameraWithSizeValidationUseCase", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "Luy/a;", "accelerometerManager", "Luy/e;", "gyroscopeManager", "Luy/f;", "orientationManager", "Lxx/a;", "exifDataManager", "<init>", "(Lbc4/k;Lez/e;Lez/a;Luy/a;Luy/e;Luy/f;Lxx/a;)V", "Lae2/c$a;", "params", "Ldx/i;", "Ldx/b;", "Lae2/c$b;", "k", "(Lae2/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbc4/k;", "b", "Lez/e;", "c", "Lez/a;", "d", "Luy/a;", "e", "Luy/e;", "f", "Luy/f;", "g", "Lxx/a;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bc4.k pickPhotoFromCameraWithSizeValidationUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final uy.a accelerometerManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final uy.e gyroscopeManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final uy.f orientationManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xx.a exifDataManager;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5501e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5502f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5503g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f5504h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f5505j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f5506k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f5507l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f5508m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f5509n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5511q;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5509n = obj;
            this.f5511q |= PKIFailureInfo.systemUnavail;
            return d.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lae2/c$b;", "<anonymous>", "(Lju/p0;)Lae2/c$b;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super ae2.c.Result>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5512e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5513f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5514g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5515h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5516j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5517k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f5518l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f5519m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5520n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f5521p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5522q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private /* synthetic */ Object f5523r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ ex.b<dx.b> f5524s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ d f5525t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final /* synthetic */ ae2.c.Params f5526v;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lvy/b;", "<anonymous>", "(Lju/p0;)Lvy/b;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements p<p0, tq.e<? super Axis>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f5527e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f5528f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f5528f = dVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f5527e;
                if (i15 == 0) {
                    u.b(obj);
                    uy.a aVar = this.f5528f.accelerometerManager;
                    this.f5527e = 1;
                    obj = aVar.a(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return ((dx.i) obj).a();
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super Axis> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f5528f, eVar);
            }
        }

        /* JADX INFO: renamed from: ae2.d$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lvy/b;", "<anonymous>", "(Lju/p0;)Lvy/b;"}, k = 3, mv = {2, 2, 0})
        static final class C0115b extends vq.k implements p<p0, tq.e<? super Axis>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f5529e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f5530f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0115b(d dVar, tq.e<? super C0115b> eVar) {
                super(2, eVar);
                this.f5530f = dVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f5529e;
                if (i15 == 0) {
                    u.b(obj);
                    uy.e eVar = this.f5530f.gyroscopeManager;
                    this.f5529e = 1;
                    obj = eVar.a(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return ((dx.i) obj).a();
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super Axis> eVar) {
                return ((C0115b) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C0115b(this.f5530f, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lvy/c;", "<anonymous>", "(Lju/p0;)Lvy/c;"}, k = 3, mv = {2, 2, 0})
        static final class c extends vq.k implements p<p0, tq.e<? super Coordinates>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f5531e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f5532f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ wx.i.Image f5533g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(d dVar, wx.i.Image image, tq.e<? super c> eVar) {
                super(2, eVar);
                this.f5532f = dVar;
                this.f5533g = image;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f5531e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                xx.a aVar = this.f5532f.exifDataManager;
                byte[] bytes = this.f5533g.getFileContent().getBytes();
                this.f5531e = 1;
                Object objF = aVar.f(bytes, this);
                return objF == objE ? objE : objF;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super Coordinates> eVar) {
                return ((c) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new c(this.f5532f, this.f5533g, eVar);
            }
        }

        /* JADX INFO: renamed from: ae2.d$b$d, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lvy/k;", "<anonymous>", "(Lju/p0;)Lvy/k;"}, k = 3, mv = {2, 2, 0})
        static final class C0116d extends vq.k implements p<p0, tq.e<? super OrientationAngle>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f5534e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f5535f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0116d(d dVar, tq.e<? super C0116d> eVar) {
                super(2, eVar);
                this.f5535f = dVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f5534e;
                if (i15 == 0) {
                    u.b(obj);
                    uy.f fVar = this.f5535f.orientationManager;
                    this.f5534e = 1;
                    obj = fVar.b(this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return ((dx.i) obj).a();
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super OrientationAngle> eVar) {
                return ((C0116d) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C0116d(this.f5535f, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ex.b<? super dx.b> bVar, d dVar, ae2.c.Params params, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f5524s = bVar;
            this.f5525t = dVar;
            this.f5526v = params;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x021c  */
        /* JADX WARN: Code duplicated, block: B:31:0x0253  */
        /* JADX WARN: Code duplicated, block: B:35:0x0292  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List listQ;
            Object objC;
            w0 w0Var;
            ex.b<dx.b> bVar;
            w0 w0Var2;
            w0 w0Var3;
            wx.i.Image imageFile;
            Object objI;
            FileName fileName;
            w0 w0Var4;
            w0 w0Var5;
            w0 w0Var6;
            w0 w0Var7;
            List list;
            Axis axis;
            Object objI2;
            w0 w0Var8;
            w0 w0Var9;
            w0 w0Var10;
            Axis axis2;
            Axis axis3;
            Object objI3;
            w0 w0Var11;
            w0 w0Var12;
            FileName fileName2;
            Axis axis4;
            Axis axis5;
            Coordinates coordinates;
            Object objI4;
            Axis axis6;
            Coordinates coordinates2;
            Axis axis7;
            FileName fileName3;
            p0 p0Var = (p0) this.f5523r;
            Object objE = uq.b.e();
            int i15 = this.f5522q;
            if (i15 == 0) {
                u.b(obj);
                listQ = v.q(xx.b.DateTime, xx.b.GPS, xx.b.DIMENSION);
                w0 w0VarB = ju.k.b(p0Var, null, null, new a(this.f5525t, null), 3, null);
                w0 w0VarB2 = ju.k.b(p0Var, null, null, new C0115b(this.f5525t, null), 3, null);
                w0 w0VarB3 = ju.k.b(p0Var, null, null, new C0116d(this.f5525t, null), 3, null);
                ex.b<dx.b> bVar2 = this.f5524s;
                bc4.k kVar = this.f5525t.pickPhotoFromCameraWithSizeValidationUseCase;
                bc4.k.Params params = new bc4.k.Params(this.f5525t.dateFormatter.d(new fz.b.LocalDateTime(this.f5525t.currentTimeProvider.i()), fz.c.NO_SPACES), this.f5526v.getDefaultImageMaxSideOverride(), this.f5526v.getDefaultImageQualityOverride(), null, false, listQ, 16, null);
                this.f5523r = p0Var;
                this.f5512e = vq.j.a(listQ);
                this.f5513f = w0VarB;
                this.f5514g = w0VarB2;
                this.f5515h = w0VarB3;
                this.f5516j = bVar2;
                this.f5522q = 1;
                objC = kVar.c(params, this);
                if (objC != objE) {
                    w0Var = w0VarB3;
                    bVar = bVar2;
                    w0Var2 = w0VarB2;
                    w0Var3 = w0VarB;
                }
                return objE;
            }
            if (i15 == 1) {
                bVar = (ex.b) this.f5516j;
                w0 w0Var13 = (w0) this.f5515h;
                w0 w0Var14 = (w0) this.f5514g;
                w0 w0Var15 = (w0) this.f5513f;
                List list2 = (List) this.f5512e;
                u.b(obj);
                w0Var = w0Var13;
                w0Var2 = w0Var14;
                w0Var3 = w0Var15;
                listQ = list2;
                objC = obj;
            } else {
                if (i15 == 2) {
                    FileName fileName4 = (FileName) this.f5518l;
                    w0 w0Var16 = (w0) this.f5517k;
                    wx.i.Image image = (wx.i.Image) this.f5516j;
                    w0Var5 = (w0) this.f5515h;
                    w0Var6 = (w0) this.f5514g;
                    w0Var7 = (w0) this.f5513f;
                    list = (List) this.f5512e;
                    u.b(obj);
                    fileName = fileName4;
                    w0Var4 = w0Var16;
                    imageFile = image;
                    objI = obj;
                    axis = (Axis) objI;
                    this.f5523r = vq.j.a(p0Var);
                    this.f5512e = vq.j.a(list);
                    this.f5513f = vq.j.a(w0Var7);
                    this.f5514g = vq.j.a(w0Var6);
                    this.f5515h = w0Var5;
                    this.f5516j = imageFile;
                    this.f5517k = w0Var4;
                    this.f5518l = fileName;
                    this.f5519m = axis;
                    this.f5522q = 3;
                    objI2 = w0Var6.I(this);
                    if (objI2 != objE) {
                        w0Var8 = w0Var6;
                        w0Var9 = w0Var5;
                        w0Var10 = w0Var4;
                        axis2 = axis;
                        axis3 = (Axis) objI2;
                        this.f5523r = vq.j.a(p0Var);
                        this.f5512e = vq.j.a(list);
                        this.f5513f = vq.j.a(w0Var7);
                        this.f5514g = vq.j.a(w0Var8);
                        this.f5515h = w0Var9;
                        this.f5516j = imageFile;
                        this.f5517k = vq.j.a(w0Var10);
                        this.f5518l = fileName;
                        this.f5519m = axis2;
                        this.f5520n = axis3;
                        this.f5522q = 4;
                        objI3 = w0Var10.I(this);
                        if (objI3 != objE) {
                            w0Var11 = w0Var9;
                            w0Var12 = w0Var10;
                            fileName2 = fileName;
                            axis4 = axis2;
                            axis5 = axis3;
                            coordinates = (Coordinates) objI3;
                            this.f5523r = vq.j.a(p0Var);
                            this.f5512e = vq.j.a(list);
                            this.f5513f = vq.j.a(w0Var7);
                            this.f5514g = vq.j.a(w0Var8);
                            this.f5515h = vq.j.a(w0Var11);
                            this.f5516j = imageFile;
                            this.f5517k = vq.j.a(w0Var12);
                            this.f5518l = fileName2;
                            this.f5519m = axis4;
                            this.f5520n = axis5;
                            this.f5521p = coordinates;
                            this.f5522q = 5;
                            objI4 = w0Var11.I(this);
                            if (objI4 != objE) {
                                axis6 = axis5;
                                coordinates2 = coordinates;
                                axis7 = axis4;
                                fileName3 = fileName2;
                            }
                        }
                    }
                    return objE;
                }
                if (i15 == 3) {
                    axis2 = (Axis) this.f5519m;
                    fileName = (FileName) this.f5518l;
                    w0 w0Var17 = (w0) this.f5517k;
                    wx.i.Image image2 = (wx.i.Image) this.f5516j;
                    w0Var9 = (w0) this.f5515h;
                    w0Var8 = (w0) this.f5514g;
                    w0Var7 = (w0) this.f5513f;
                    list = (List) this.f5512e;
                    u.b(obj);
                    objI2 = obj;
                    imageFile = image2;
                    w0Var10 = w0Var17;
                    axis3 = (Axis) objI2;
                    this.f5523r = vq.j.a(p0Var);
                    this.f5512e = vq.j.a(list);
                    this.f5513f = vq.j.a(w0Var7);
                    this.f5514g = vq.j.a(w0Var8);
                    this.f5515h = w0Var9;
                    this.f5516j = imageFile;
                    this.f5517k = vq.j.a(w0Var10);
                    this.f5518l = fileName;
                    this.f5519m = axis2;
                    this.f5520n = axis3;
                    this.f5522q = 4;
                    objI3 = w0Var10.I(this);
                    if (objI3 != objE) {
                        w0Var11 = w0Var9;
                        w0Var12 = w0Var10;
                        fileName2 = fileName;
                        axis4 = axis2;
                        axis5 = axis3;
                        coordinates = (Coordinates) objI3;
                        this.f5523r = vq.j.a(p0Var);
                        this.f5512e = vq.j.a(list);
                        this.f5513f = vq.j.a(w0Var7);
                        this.f5514g = vq.j.a(w0Var8);
                        this.f5515h = vq.j.a(w0Var11);
                        this.f5516j = imageFile;
                        this.f5517k = vq.j.a(w0Var12);
                        this.f5518l = fileName2;
                        this.f5519m = axis4;
                        this.f5520n = axis5;
                        this.f5521p = coordinates;
                        this.f5522q = 5;
                        objI4 = w0Var11.I(this);
                        if (objI4 != objE) {
                            axis6 = axis5;
                            coordinates2 = coordinates;
                            axis7 = axis4;
                            fileName3 = fileName2;
                        }
                    }
                    return objE;
                }
                if (i15 == 4) {
                    axis5 = (Axis) this.f5520n;
                    axis4 = (Axis) this.f5519m;
                    FileName fileName5 = (FileName) this.f5518l;
                    w0 w0Var18 = (w0) this.f5517k;
                    wx.i.Image image3 = (wx.i.Image) this.f5516j;
                    w0Var11 = (w0) this.f5515h;
                    w0Var8 = (w0) this.f5514g;
                    w0Var7 = (w0) this.f5513f;
                    list = (List) this.f5512e;
                    u.b(obj);
                    imageFile = image3;
                    w0Var12 = w0Var18;
                    fileName2 = fileName5;
                    objI3 = obj;
                    coordinates = (Coordinates) objI3;
                    this.f5523r = vq.j.a(p0Var);
                    this.f5512e = vq.j.a(list);
                    this.f5513f = vq.j.a(w0Var7);
                    this.f5514g = vq.j.a(w0Var8);
                    this.f5515h = vq.j.a(w0Var11);
                    this.f5516j = imageFile;
                    this.f5517k = vq.j.a(w0Var12);
                    this.f5518l = fileName2;
                    this.f5519m = axis4;
                    this.f5520n = axis5;
                    this.f5521p = coordinates;
                    this.f5522q = 5;
                    objI4 = w0Var11.I(this);
                    if (objI4 != objE) {
                        axis6 = axis5;
                        coordinates2 = coordinates;
                        axis7 = axis4;
                        fileName3 = fileName2;
                    }
                    return objE;
                }
                if (i15 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Coordinates coordinates3 = (Coordinates) this.f5521p;
                Axis axis8 = (Axis) this.f5520n;
                Axis axis9 = (Axis) this.f5519m;
                fileName3 = (FileName) this.f5518l;
                wx.i.Image image4 = (wx.i.Image) this.f5516j;
                u.b(obj);
                coordinates2 = coordinates3;
                axis6 = axis8;
                imageFile = image4;
                objI4 = obj;
                axis7 = axis9;
            }
            return new ae2.c.Result(y.a(imageFile, new ImageAttachments(fileName3, axis7, null, null, axis6, null, coordinates2, (OrientationAngle) objI4)));
            imageFile = ((bc4.k.Result) bVar.a((dx.i) objC)).getImageFile();
            w0 w0VarB4 = ju.k.b(p0Var, null, null, new c(this.f5525t, imageFile, null), 3, null);
            FileName fileName6 = new FileName(imageFile.getMetadata().getName(), imageFile.getMetadata().getExtension());
            this.f5523r = vq.j.a(p0Var);
            this.f5512e = vq.j.a(listQ);
            this.f5513f = vq.j.a(w0Var3);
            this.f5514g = w0Var2;
            this.f5515h = w0Var;
            this.f5516j = imageFile;
            this.f5517k = w0VarB4;
            this.f5518l = fileName6;
            this.f5522q = 2;
            objI = w0Var3.I(this);
            if (objI != objE) {
                fileName = fileName6;
                w0Var4 = w0VarB4;
                w0Var5 = w0Var;
                w0Var6 = w0Var2;
                w0Var7 = w0Var3;
                list = listQ;
                axis = (Axis) objI;
                this.f5523r = vq.j.a(p0Var);
                this.f5512e = vq.j.a(list);
                this.f5513f = vq.j.a(w0Var7);
                this.f5514g = vq.j.a(w0Var6);
                this.f5515h = w0Var5;
                this.f5516j = imageFile;
                this.f5517k = w0Var4;
                this.f5518l = fileName;
                this.f5519m = axis;
                this.f5522q = 3;
                objI2 = w0Var6.I(this);
                if (objI2 != objE) {
                    w0Var8 = w0Var6;
                    w0Var9 = w0Var5;
                    w0Var10 = w0Var4;
                    axis2 = axis;
                    axis3 = (Axis) objI2;
                    this.f5523r = vq.j.a(p0Var);
                    this.f5512e = vq.j.a(list);
                    this.f5513f = vq.j.a(w0Var7);
                    this.f5514g = vq.j.a(w0Var8);
                    this.f5515h = w0Var9;
                    this.f5516j = imageFile;
                    this.f5517k = vq.j.a(w0Var10);
                    this.f5518l = fileName;
                    this.f5519m = axis2;
                    this.f5520n = axis3;
                    this.f5522q = 4;
                    objI3 = w0Var10.I(this);
                    if (objI3 != objE) {
                        w0Var11 = w0Var9;
                        w0Var12 = w0Var10;
                        fileName2 = fileName;
                        axis4 = axis2;
                        axis5 = axis3;
                        coordinates = (Coordinates) objI3;
                        this.f5523r = vq.j.a(p0Var);
                        this.f5512e = vq.j.a(list);
                        this.f5513f = vq.j.a(w0Var7);
                        this.f5514g = vq.j.a(w0Var8);
                        this.f5515h = vq.j.a(w0Var11);
                        this.f5516j = imageFile;
                        this.f5517k = vq.j.a(w0Var12);
                        this.f5518l = fileName2;
                        this.f5519m = axis4;
                        this.f5520n = axis5;
                        this.f5521p = coordinates;
                        this.f5522q = 5;
                        objI4 = w0Var11.I(this);
                        if (objI4 != objE) {
                            axis6 = axis5;
                            coordinates2 = coordinates;
                            axis7 = axis4;
                            fileName3 = fileName2;
                            return new ae2.c.Result(y.a(imageFile, new ImageAttachments(fileName3, axis7, null, null, axis6, null, coordinates2, (OrientationAngle) objI4)));
                        }
                    }
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super ae2.c.Result> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f5524s, this.f5525t, this.f5526v, eVar);
            bVar.f5523r = obj;
            return bVar;
        }
    }

    public d(bc4.k kVar, ez.e eVar, ez.a aVar, uy.a aVar2, uy.e eVar2, uy.f fVar, xx.a aVar3) {
        this.pickPhotoFromCameraWithSizeValidationUseCase = kVar;
        this.dateFormatter = eVar;
        this.currentTimeProvider = aVar;
        this.accelerometerManager = aVar2;
        this.gyroscopeManager = eVar2;
        this.orientationManager = fVar;
        this.exifDataManager = aVar3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [ae2.c$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Object c(c.Params params, tq.e<? super dx.i<? extends dx.b, c.Result>> eVar) throws Throwable {
        a aVar;
        Object objB;
        ex.c e15;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f5511q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f5511q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f5509n;
        Object objE = uq.b.e();
        int i16 = aVar.f5511q;
        try {
            try {
                if (i16 == 0) {
                    u.b(obj);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        ex.a aVar2 = new ex.a();
                        b bVar = new b(aVar2, this, params, null);
                        aVar.f5500d = vq.j.a(params);
                        aVar.f5501e = jVarA;
                        aVar.f5502f = vq.j.a(aVar2);
                        aVar.f5503g = vq.j.a(aVar2);
                        aVar.f5504h = 0;
                        aVar.f5505j = 0;
                        aVar.f5506k = 0;
                        aVar.f5507l = 0;
                        aVar.f5508m = 0;
                        aVar.f5511q = 1;
                        Object objE2 = q0.e(bVar, aVar);
                        if (objE2 == objE) {
                            return objE;
                        }
                        obj = objE2;
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    } catch (Exception e18) {
                        e = e18;
                        params = jVarA;
                        px.f fVar = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(params));
                        dx.i iVarA = params.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                    } catch (ex.c e19) {
                        e15 = e19;
                        return new dx.i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e25) {
                        throw e25;
                    }
                }
                return new dx.i.Right((c.Result) obj);
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }
}
