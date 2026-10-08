package r02;

import android.graphics.Bitmap;
import dx.i;
import dx.j;
import fr.t;
import fu.r;
import java.io.File;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001c¨\u0006\u001e"}, d2 = {"Lr02/b;", "", "Lr02/b$b;", "Lzz/a;", "Laz/f;", "fileManager", "Lmx/c;", "labelProvider", "Lb00/c;", "imageConverter", "Lqx/a;", "imagePropertiesProvider", "<init>", "(Laz/f;Lmx/c;Lb00/c;Lqx/a;)V", "Ldx/b$c;", "f", "()Ldx/b$c;", "params", "Ldx/i;", "Ldx/b;", "d", "(Lr02/b$b;Ltq/e;)Ljava/lang/Object;", "a", "Laz/f;", "b", "Lmx/c;", "c", "Lb00/c;", "Lqx/a;", "e", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f170111f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final az.f fileManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final qx.a imagePropertiesProvider;

    /* JADX INFO: renamed from: r02.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lr02/b$b;", "Lgz/b$a;", "Lwx/e;", "metadata", "<init>", "(Lwx/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/e;", "()Lwx/e;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f170116b = FilePickerMetadata.f215692f;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilePickerMetadata metadata;

        public Params(FilePickerMetadata filePickerMetadata) {
            this.metadata = filePickerMetadata;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FilePickerMetadata getMetadata() {
            return this.metadata;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.metadata, ((Params) other).metadata);
        }

        public int hashCode() {
            return this.metadata.hashCode();
        }

        public String toString() {
            return "Params(metadata=" + this.metadata + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f170118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170121g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f170122h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f170123j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f170124k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f170125l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f170126m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f170127n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f170128p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f170129q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f170131s;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f170129q = obj;
            this.f170131s |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(az.f fVar, mx.c cVar, b00.c cVar2, qx.a aVar) {
        this.fileManager = fVar;
        this.labelProvider = cVar;
        this.imageConverter = cVar2;
        this.imagePropertiesProvider = aVar;
    }

    private static final zz.a.Regular e(Params params, File file, String str) {
        return new zz.a.Regular(params.getMetadata(), file, str);
    }

    private final dx.b.Business f() {
        return new dx.b.Business(zb4.b.FILE_DATA_ERROR, null, this.labelProvider.c(e02.a.D0), null, null, this.labelProvider.c(e02.a.f46550j), null, 90, null);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0142 A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:41:0x0138, B:43:0x0142, B:54:0x015f, B:44:0x014c, B:58:0x0172, B:61:0x0181, B:24:0x007d, B:27:0x0095), top: B:76:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x014c A[Catch: Exception -> 0x004a, c -> 0x004d, CancellationException -> 0x0050, TRY_LEAVE, TryCatch #3 {Exception -> 0x004a, blocks: (B:13:0x0045, B:41:0x0138, B:43:0x0142, B:54:0x015f, B:44:0x014c, B:58:0x0172, B:61:0x0181, B:24:0x007d, B:27:0x0095), top: B:76:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public Object d(Params params, tq.e<? super i<? extends dx.b, ? extends zz.a>> eVar) throws Throwable {
        c cVar;
        Object objB;
        String str;
        int i15;
        int i16;
        int i17;
        Params params2;
        ex.b bVar;
        ex.b bVar2;
        ex.b bVar3;
        j<dx.b> jVar;
        int i18;
        int i19;
        Object objE;
        File file;
        Params params3;
        Bitmap bitmap;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i25 = cVar.f170131s;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f170131s = i25 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f170129q;
        Object objE2 = uq.b.e();
        int i26 = cVar.f170131s;
        ?? r15 = 2;
        try {
            try {
                try {
                    try {
                        if (i26 == 0) {
                            u.b(obj);
                            j<dx.b> jVarA = xw.c.f221622a.a();
                            ex.a aVar = new ex.a();
                            String strI = this.fileManager.i(params.getMetadata().getUri());
                            az.f fVar = this.fileManager;
                            String uri = params.getMetadata().getUri();
                            cVar.f170118d = params;
                            cVar.f170119e = jVarA;
                            cVar.f170120f = vq.j.a(aVar);
                            cVar.f170121g = vq.j.a(aVar);
                            cVar.f170122h = strI;
                            cVar.f170123j = aVar;
                            cVar.f170124k = 0;
                            cVar.f170125l = 0;
                            cVar.f170126m = 0;
                            cVar.f170127n = 0;
                            cVar.f170128p = 0;
                            cVar.f170131s = 1;
                            Object objN = fVar.n(uri, cVar);
                            if (objN != objE2) {
                                str = strI;
                                obj = objN;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                params2 = params;
                                bVar = aVar;
                                bVar2 = bVar;
                                bVar3 = bVar2;
                                jVar = jVarA;
                                i18 = 0;
                                i19 = 0;
                            }
                            return objE2;
                        }
                        if (i26 == 1) {
                            int i27 = cVar.f170128p;
                            int i28 = cVar.f170127n;
                            int i29 = cVar.f170126m;
                            int i35 = cVar.f170125l;
                            int i36 = cVar.f170124k;
                            ex.b bVar4 = (ex.b) cVar.f170123j;
                            String str2 = (String) cVar.f170122h;
                            bVar2 = (ex.b) cVar.f170121g;
                            bVar3 = (ex.b) cVar.f170120f;
                            j<dx.b> jVar2 = (j) cVar.f170119e;
                            params2 = (Params) cVar.f170118d;
                            u.b(obj);
                            i18 = i27;
                            str = str2;
                            bVar = bVar4;
                            i19 = i36;
                            i17 = i35;
                            i16 = i29;
                            i15 = i28;
                            jVar = jVar2;
                        } else {
                            if (i26 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            file = (File) cVar.f170123j;
                            str = (String) cVar.f170122h;
                            params3 = (Params) cVar.f170118d;
                            u.b(obj);
                        }
                        bitmap = (Bitmap) ((i) obj).a();
                        if (bitmap != null) {
                            objE = new zz.a.Image(params3.getMetadata(), file, str, bitmap);
                        } else {
                            objE = e(params3, file, str);
                        }
                        return new i.Right(objE);
                        Object objA = ((i) obj).a();
                        if (objA == null) {
                            bVar.b(f());
                            throw new oq.g();
                        }
                        File file2 = (File) objA;
                        if (str != null) {
                            ex.b bVar5 = bVar2;
                            ex.b bVar6 = bVar3;
                            if (r.V(str, "image/", false, 2, null)) {
                                b00.c cVar2 = this.imageConverter;
                                int thumbnailMaxSide = this.imagePropertiesProvider.getThumbnailMaxSide();
                                cVar.f170118d = params2;
                                cVar.f170119e = jVar;
                                cVar.f170120f = vq.j.a(bVar6);
                                cVar.f170121g = vq.j.a(bVar5);
                                cVar.f170122h = str;
                                cVar.f170123j = file2;
                                cVar.f170124k = i19;
                                cVar.f170125l = i17;
                                cVar.f170126m = i16;
                                cVar.f170127n = i15;
                                cVar.f170128p = i18;
                                cVar.f170131s = 2;
                                Object objK = cVar2.k(file2, thumbnailMaxSide, cVar);
                                if (objK != objE2) {
                                    file = file2;
                                    obj = objK;
                                    params3 = params2;
                                    bitmap = (Bitmap) ((i) obj).a();
                                    if (bitmap != null) {
                                        objE = new zz.a.Image(params3.getMetadata(), file, str, bitmap);
                                    } else {
                                        objE = e(params3, file, str);
                                    }
                                }
                                return objE2;
                            }
                            return new i.Right(objE);
                        }
                        objE = e(params2, file2, str);
                        return new i.Right(objE);
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        r15 = jVar;
                        px.f fVar2 = px.f.f163100a;
                        String message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(r15));
                        i iVarA = r15.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (!(iVarA instanceof i.Right)) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } catch (CancellationException e18) {
                    throw e18;
                }
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
