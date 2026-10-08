package hc4;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ju.p0;
import ju.q0;
import mx.Label;
import oq.i0;
import oq.r;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import wx.FileContent;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J(\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014*\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0012*\b\u0012\u0004\u0012\u00020\u00130\u00122\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u0015H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b$\u0010#J#\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b*\u0010#J*\u0010/\u001a\u0014\u0012\u0004\u0012\u00020.\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00120-2\u0006\u0010,\u001a\u00020+H\u0096B¢\u0006\u0004\b/\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010;R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010<¨\u0006="}, d2 = {"Lhc4/i;", "Lbc4/j;", "Lbc4/l;", "pickPhotoFromGalleryUseCase", "Lbc4/c;", "checkFileSizesUC", "Lb00/l;", "mediaPickerManager", "Laz/f;", "fileDataManager", "Lmx/c;", "labelProvider", "Lxx/a;", "exifDataManager", "Lbc4/o;", "rotateImageUC", "<init>", "(Lbc4/l;Lbc4/c;Lb00/l;Laz/f;Lmx/c;Lxx/a;Lbc4/o;)V", "", "Landroid/net/Uri;", "", "Lxw/a;", "m", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "urisToSizeMap", "Lwx/i$a;", "l", "(Ljava/util/List;Ljava/util/Map;Ltq/e;)Ljava/lang/Object;", "uri", "size", "h", "(Landroid/net/Uri;Lxw/a;Ltq/e;)Ljava/lang/Object;", "Ldx/i$b;", "Ldx/b$c;", "f", "()Ldx/i$b;", "g", "", "Lwx/d;", "allowedExtensions", "i", "(Ljava/util/Set;)Ldx/i$b;", "k", "Lbc4/j$a;", "params", "Ldx/i;", "Ldx/b;", "j", "(Lbc4/j$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbc4/l;", "b", "Lbc4/c;", "c", "Lb00/l;", "d", "Laz/f;", "e", "Lmx/c;", "Lxx/a;", "Lbc4/o;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements bc4.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bc4.l pickPhotoFromGalleryUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final bc4.c checkFileSizesUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b00.l mediaPickerManager;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final az.f fileDataManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xx.a exifDataManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final bc4.o rotateImageUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f83404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83407g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f83408h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f83409j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f83410k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f83412m;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f83410k = obj;
            this.f83412m |= PKIFailureInfo.systemUnavail;
            return i.this.h(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<wx.d, CharSequence> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f83413a = new b();

        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ CharSequence b(wx.d dVar) {
            return c(dVar.getValue());
        }

        public final CharSequence c(String str) {
            return '.' + str;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f83414d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f83415e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f83416f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f83417g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f83418h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f83419j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f83420k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f83421l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f83422m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f83424p;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f83422m = obj;
            this.f83424p |= PKIFailureInfo.systemUnavail;
            return i.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Lwx/i$a;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<p0, tq.e<? super List<? extends wx.i.Image>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83425e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f83426f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<Uri> f83427g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ i f83428h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Map<Uri, xw.a> f83429j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Lwx/i$a;", "<anonymous>", "(Lju/p0;)Lwx/i$a;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super wx.i.Image>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f83430e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ i f83431f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Uri f83432g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ Map<Uri, xw.a> f83433h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(i iVar, Uri uri, Map<Uri, xw.a> map, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f83431f = iVar;
                this.f83432g = uri;
                this.f83433h = map;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f83430e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                i iVar = this.f83431f;
                Uri uri = this.f83432g;
                xw.a aVar = this.f83433h.get(uri);
                this.f83430e = 1;
                Object objH = iVar.h(uri, aVar, this);
                return objH == objE ? objE : objH;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super wx.i.Image> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f83431f, this.f83432g, this.f83433h, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Uri> list, i iVar, Map<Uri, xw.a> map, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f83427g = list;
            this.f83428h = iVar;
            this.f83429j = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f83426f;
            Object objE = uq.b.e();
            int i15 = this.f83425e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            List<Uri> list = this.f83427g;
            i iVar = this.f83428h;
            Map<Uri, xw.a> map = this.f83429j;
            ArrayList arrayList = new ArrayList(v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ju.k.b(p0Var, null, null, new a(iVar, (Uri) it.next(), map, null), 3, null));
            }
            this.f83426f = vq.j.a(p0Var);
            this.f83425e = 1;
            Object objA = ju.f.a(arrayList, this);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super List<wx.i.Image>> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = new d(this.f83427g, this.f83428h, this.f83429j, eVar);
            dVar.f83426f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "", "Landroid/net/Uri;", "Lxw/a;", "<anonymous>", "(Lju/p0;)Ljava/util/Map;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super Map<Uri, ? extends xw.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f83434e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f83435f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<Uri> f83436g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ i f83437h;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Loq/r;", "Landroid/net/Uri;", "Lxw/a;", "<anonymous>", "(Lju/p0;)Loq/r;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super r<? extends Uri, ? extends xw.a>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f83438e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f83439f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Uri f83440g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ i f83441h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Uri uri, i iVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f83440g = uri;
                this.f83441h = iVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Uri uri;
                Object objE = uq.b.e();
                int i15 = this.f83439f;
                if (i15 == 0) {
                    u.b(obj);
                    Uri uri2 = this.f83440g;
                    az.f fVar = this.f83441h.fileDataManager;
                    String string = this.f83440g.toString();
                    this.f83438e = uri2;
                    this.f83439f = 1;
                    Object objK = fVar.k(string, this);
                    if (objK == objE) {
                        return objE;
                    }
                    uri = uri2;
                    obj = objK;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    uri = (Uri) this.f83438e;
                    u.b(obj);
                }
                Float f15 = (Float) obj;
                return y.a(uri, f15 != null ? xw.a.a(xw.a.b(f15.floatValue())) : null);
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super r<? extends Uri, xw.a>> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f83440g, this.f83441h, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(List<? extends Uri> list, i iVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f83436g = list;
            this.f83437h = iVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f83435f;
            Object objE = uq.b.e();
            int i15 = this.f83434e;
            if (i15 == 0) {
                u.b(obj);
                List<Uri> list = this.f83436g;
                i iVar = this.f83437h;
                ArrayList arrayList = new ArrayList(v.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(ju.k.b(p0Var, null, null, new a((Uri) it.next(), iVar, null), 3, null));
                }
                this.f83435f = vq.j.a(p0Var);
                this.f83434e = 1;
                obj = ju.f.a(arrayList, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return v0.s((Iterable) obj);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Map<Uri, xw.a>> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(this.f83436g, this.f83437h, eVar);
            eVar2.f83435f = obj;
            return eVar2;
        }
    }

    public i(bc4.l lVar, bc4.c cVar, b00.l lVar2, az.f fVar, mx.c cVar2, xx.a aVar, bc4.o oVar) {
        this.pickPhotoFromGalleryUseCase = lVar;
        this.checkFileSizesUC = cVar;
        this.mediaPickerManager = lVar2;
        this.fileDataManager = fVar;
        this.labelProvider = cVar2;
        this.exifDataManager = aVar;
        this.rotateImageUC = oVar;
    }

    private final dx.i.Left<dx.b.Business> f() {
        return new dx.i.Left<>(new dx.b.Business(zb4.b.FILE_ALREADY_PICKED, null, this.labelProvider.c(xb4.a.f217907e), this.labelProvider.c(xb4.a.f217906d), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null));
    }

    private final dx.i.Left<dx.b.Business> g() {
        return new dx.i.Left<>(new dx.b.Business(null, null, this.labelProvider.c(xb4.a.f217919q), null, null, this.labelProvider.c(xb4.a.f217904b), null, 91, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x0104  */
    /* JADX WARN: Code duplicated, block: B:42:0x0112  */
    /* JADX WARN: Code duplicated, block: B:46:0x013e  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:60:0x016b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0170  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object h(Uri uri, xw.a aVar, tq.e<? super wx.i.Image> eVar) throws Throwable {
        a aVar2;
        xw.a aVar3;
        Uri uri2;
        xw.a aVar4;
        Uri uri3;
        dx.i iVar;
        int i15;
        Integer num;
        Object objC;
        Integer num2;
        int i16;
        xw.a aVar5;
        byte[] bArr;
        Object objF;
        byte[] bArr2;
        Uri uri4;
        String str;
        String text;
        float value;
        if (eVar instanceof a) {
            aVar2 = (a) eVar;
            int i17 = aVar2.f83412m;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                aVar2.f83412m = i17 - PKIFailureInfo.systemUnavail;
            } else {
                aVar2 = new a(eVar);
            }
        } else {
            aVar2 = new a(eVar);
        }
        Object objM = aVar2.f83410k;
        Object objE = uq.b.e();
        int i18 = aVar2.f83412m;
        if (i18 == 0) {
            u.b(objM);
            az.f fVar = this.fileDataManager;
            String string = uri.toString();
            aVar2.f83404d = uri;
            aVar3 = aVar;
            aVar2.f83405e = aVar3;
            aVar2.f83412m = 1;
            objM = fVar.m(string, aVar2);
            if (objM != objE) {
                uri2 = uri;
            }
            return objE;
        }
        if (i18 == 1) {
            xw.a aVar6 = (xw.a) aVar2.f83405e;
            uri2 = (Uri) aVar2.f83404d;
            u.b(objM);
            aVar3 = aVar6;
        } else {
            if (i18 == 2) {
                i15 = aVar2.f83409j;
                iVar = (dx.i) aVar2.f83406f;
                aVar4 = (xw.a) aVar2.f83405e;
                uri3 = (Uri) aVar2.f83404d;
                u.b(objM);
                num = (Integer) objM;
                bc4.o oVar = this.rotateImageUC;
                bc4.o.Params params = new bc4.o.Params(num != null ? num.intValue() : 0, (byte[]) ((dx.i.Right) iVar).b());
                aVar2.f83404d = uri3;
                aVar2.f83405e = aVar4;
                aVar2.f83406f = iVar;
                aVar2.f83407g = vq.j.a(num);
                aVar2.f83409j = i15;
                aVar2.f83412m = 3;
                objC = oVar.c(params, aVar2);
                if (objC != objE) {
                    num2 = num;
                    objM = objC;
                    i16 = i15;
                    aVar5 = aVar4;
                    bArr = (byte[]) ((dx.i) objM).a();
                    if (bArr == null) {
                        bArr = (byte[]) ((dx.i.Right) iVar).b();
                    }
                    az.f fVar2 = this.fileDataManager;
                    String string2 = uri3.toString();
                    aVar2.f83404d = uri3;
                    aVar2.f83405e = aVar5;
                    aVar2.f83406f = vq.j.a(iVar);
                    aVar2.f83407g = bArr;
                    aVar2.f83408h = vq.j.a(num2);
                    aVar2.f83409j = i16;
                    aVar2.f83412m = 4;
                    objF = fVar2.f(string2, aVar2);
                    if (objF != objE) {
                        bArr2 = bArr;
                        objM = objF;
                        uri4 = uri3;
                    }
                }
                return objE;
            }
            if (i18 == 3) {
                int i19 = aVar2.f83409j;
                Integer num3 = (Integer) aVar2.f83407g;
                dx.i iVar2 = (dx.i) aVar2.f83406f;
                xw.a aVar7 = (xw.a) aVar2.f83405e;
                Uri uri5 = (Uri) aVar2.f83404d;
                u.b(objM);
                i16 = i19;
                aVar5 = aVar7;
                iVar = iVar2;
                num2 = num3;
                uri3 = uri5;
                bArr = (byte[]) ((dx.i) objM).a();
                if (bArr == null) {
                    bArr = (byte[]) ((dx.i.Right) iVar).b();
                }
                az.f fVar3 = this.fileDataManager;
                String string3 = uri3.toString();
                aVar2.f83404d = uri3;
                aVar2.f83405e = aVar5;
                aVar2.f83406f = vq.j.a(iVar);
                aVar2.f83407g = bArr;
                aVar2.f83408h = vq.j.a(num2);
                aVar2.f83409j = i16;
                aVar2.f83412m = 4;
                objF = fVar3.f(string3, aVar2);
                if (objF != objE) {
                    bArr2 = bArr;
                    objM = objF;
                    uri4 = uri3;
                }
                return objE;
            }
            if (i18 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr2 = (byte[]) aVar2.f83407g;
            aVar5 = (xw.a) aVar2.f83405e;
            uri4 = (Uri) aVar2.f83404d;
            u.b(objM);
        }
        str = (String) objM;
        if (str != null || (text = fu.r.s1(str, ".", null, 2, null)) == null) {
            text = this.labelProvider.c(xb4.a.f217918p).getText();
        }
        String strI1 = str != null ? fu.r.i1(str, ".", "") : null;
        String str2 = strI1 != null ? strI1 : "";
        if (aVar5 != null) {
            value = aVar5.getValue();
        } else {
            value = 0.0f;
        }
        return new wx.i.Image(new FilePickerMetadata(text, str2, value, uri4.toString()), new FileContent(bArr2));
        dx.i iVar3 = (dx.i) objM;
        if (iVar3 instanceof dx.i.Left) {
            return null;
        }
        if (!(iVar3 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        xx.a aVar8 = this.exifDataManager;
        String string4 = uri2.toString();
        aVar2.f83404d = uri2;
        aVar2.f83405e = aVar3;
        aVar2.f83406f = iVar3;
        aVar2.f83409j = 0;
        aVar2.f83412m = 2;
        Object objB = aVar8.b(string4, aVar2);
        if (objB != objE) {
            aVar4 = aVar3;
            uri3 = uri2;
            iVar = iVar3;
            objM = objB;
            i15 = 0;
            num = (Integer) objM;
            bc4.o oVar2 = this.rotateImageUC;
            bc4.o.Params params2 = new bc4.o.Params(num != null ? num.intValue() : 0, (byte[]) ((dx.i.Right) iVar).b());
            aVar2.f83404d = uri3;
            aVar2.f83405e = aVar4;
            aVar2.f83406f = iVar;
            aVar2.f83407g = vq.j.a(num);
            aVar2.f83409j = i15;
            aVar2.f83412m = 3;
            objC = oVar2.c(params2, aVar2);
            if (objC != objE) {
                num2 = num;
                objM = objC;
                i16 = i15;
                aVar5 = aVar4;
                bArr = (byte[]) ((dx.i) objM).a();
                if (bArr == null) {
                    bArr = (byte[]) ((dx.i.Right) iVar).b();
                }
                az.f fVar4 = this.fileDataManager;
                String string5 = uri3.toString();
                aVar2.f83404d = uri3;
                aVar2.f83405e = aVar5;
                aVar2.f83406f = vq.j.a(iVar);
                aVar2.f83407g = bArr;
                aVar2.f83408h = vq.j.a(num2);
                aVar2.f83409j = i16;
                aVar2.f83412m = 4;
                objF = fVar4.f(string5, aVar2);
                if (objF != objE) {
                    bArr2 = bArr;
                    objM = objF;
                    uri4 = uri3;
                    str = (String) objM;
                    if (str != null) {
                        text = this.labelProvider.c(xb4.a.f217918p).getText();
                    } else {
                        text = this.labelProvider.c(xb4.a.f217918p).getText();
                    }
                    if (str != null) {
                    }
                    if (strI1 != null) {
                    }
                    if (aVar5 != null) {
                        value = aVar5.getValue();
                    } else {
                        value = 0.0f;
                    }
                    return new wx.i.Image(new FilePickerMetadata(text, str2, value, uri4.toString()), new FileContent(bArr2));
                }
            }
        }
        return objE;
    }

    private final dx.i.Left<dx.b.Business> i(Set<wx.d> allowedExtensions) {
        return new dx.i.Left<>(new dx.b.Business(null, null, this.labelProvider.c(xb4.a.f217909g), this.labelProvider.e(xb4.a.f217916n, v.v0(allowedExtensions, null, null, null, 0, null, b.f83413a, 31, null)), null, this.labelProvider.c(xb4.a.f217904b), null, 83, null));
    }

    private final dx.i.Left<dx.b.Business> k() {
        return new dx.i.Left<>(new dx.b.Business(zb4.b.ALLOWED_FILES_NUMBER_EXCEEDED, null, this.labelProvider.c(xb4.a.f217915m), Label.INSTANCE.c(), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null));
    }

    private final Object l(List<? extends Uri> list, Map<Uri, xw.a> map, tq.e<? super List<wx.i.Image>> eVar) {
        return q0.e(new d(list, this, map, null), eVar);
    }

    private final Object m(List<? extends Uri> list, tq.e<? super Map<Uri, xw.a>> eVar) {
        return q0.e(new e(list, this, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:87:0x01e9  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012d, code lost:
    
        if (r14 == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0211, code lost:
    
        if (r14 == r1) goto L91;
     */
    @Override // gz.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(bc4.j.Params r13, tq.e<? super dx.i<? extends dx.b, ? extends java.util.List<wx.i.Image>>> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hc4.i.c(bc4.j$a, tq.e):java.lang.Object");
    }
}
