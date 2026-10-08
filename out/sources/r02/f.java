package r02;

import bc4.q;
import dx.i;
import dx.j;
import fr.t;
import java.util.concurrent.CancellationException;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FilePickerMetadata;
import zb4.FileSizeLimit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0015B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001c"}, d2 = {"Lr02/f;", "", "Lr02/f$a;", "Lr02/f$b;", "Lbc4/q;", "validatePickedFilesSize", "Lcc4/a;", "pickPhotoFileContentFromCameraUseCase", "Lr02/b;", "createFileHandlerUC", "Lmx/c;", "labelProvider", "<init>", "(Lbc4/q;Lcc4/a;Lr02/b;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lr02/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbc4/q;", "b", "Lcc4/a;", "c", "Lr02/b;", "Ldx/b$c;", "Ldx/b$c;", "unknownError", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q validatePickedFilesSize;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cc4.a pickPhotoFileContentFromCameraUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b createFileHandlerUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business unknownError;

    /* JADX INFO: renamed from: r02.f$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Lr02/f$a;", "Lgz/b$a;", "", "fileName", "", "maxPhotoSizeInBytes", "Lzb4/a;", "allFilesSizeLimit", "<init>", "(Ljava/lang/String;FLzb4/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "F", "c", "()F", "Lzb4/a;", "()Lzb4/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fileName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final float maxPhotoSizeInBytes;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final FileSizeLimit allFilesSizeLimit;

        public Params(String str, float f15, FileSizeLimit fileSizeLimit) {
            this.fileName = str;
            this.maxPhotoSizeInBytes = f15;
            this.allFilesSizeLimit = fileSizeLimit;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FileSizeLimit getAllFilesSizeLimit() {
            return this.allFilesSizeLimit;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final float getMaxPhotoSizeInBytes() {
            return this.maxPhotoSizeInBytes;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.fileName, params.fileName) && Float.compare(this.maxPhotoSizeInBytes, params.maxPhotoSizeInBytes) == 0 && t.c(this.allFilesSizeLimit, params.allFilesSizeLimit);
        }

        public int hashCode() {
            return (((this.fileName.hashCode() * 31) + Float.hashCode(this.maxPhotoSizeInBytes)) * 31) + this.allFilesSizeLimit.hashCode();
        }

        public String toString() {
            return "Params(fileName=" + this.fileName + ", maxPhotoSizeInBytes=" + this.maxPhotoSizeInBytes + ", allFilesSizeLimit=" + this.allFilesSizeLimit + ')';
        }
    }

    /* JADX INFO: renamed from: r02.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lr02/f$b;", "", "Lzz/a;", "imageFile", "<init>", "(Lzz/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lzz/a;", "()Lzz/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final zz.a imageFile;

        public Result(zz.a aVar) {
            this.imageFile = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final zz.a getImageFile() {
            return this.imageFile;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && t.c(this.imageFile, ((Result) other).imageFile);
        }

        public int hashCode() {
            return this.imageFile.hashCode();
        }

        public String toString() {
            return "Result(imageFile=" + this.imageFile + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f170205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170207f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170208g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f170209h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f170210j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f170211k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f170212l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f170213m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f170214n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f170215p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f170216q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f170217r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f170218s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f170219t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        float f170220v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f170221w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f170223y;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f170221w = obj;
            this.f170223y |= PKIFailureInfo.systemUnavail;
            return f.this.d(null, this);
        }
    }

    public f(q qVar, cc4.a aVar, b bVar, mx.c cVar) {
        this.validatePickedFilesSize = qVar;
        this.pickPhotoFileContentFromCameraUseCase = aVar;
        this.createFileHandlerUC = bVar;
        this.unknownError = new dx.b.Business(null, null, cVar.c(e02.a.D0), null, null, cVar.c(e02.a.f46550j), null, 91, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    public Object d(Params params, tq.e<? super i<? extends dx.b, Result>> eVar) throws Throwable {
        c cVar;
        Exception exc;
        ?? r15;
        Object objB;
        ex.c cVar2;
        ex.b bVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f170223y;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f170223y = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f170221w;
        Object objE = uq.b.e();
        int i16 = cVar.f170223y;
        try {
            try {
                if (i16 == 0) {
                    u.b(objC);
                    cc4.a aVar = this.pickPhotoFileContentFromCameraUseCase;
                    cc4.a.Params params2 = new cc4.a.Params(params.getFileName(), null, null, null, 8, null);
                    cVar.f170205d = params;
                    cVar.f170223y = 1;
                    objC = aVar.c(params2, cVar);
                    if (objC != objE) {
                    }
                    return objE;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = (ex.b) cVar.f170212l;
                    try {
                        u.b(objC);
                        return new i.Right(new Result((zz.a) bVar.a((i) objC)));
                    } catch (ex.c e15) {
                        cVar2 = e15;
                        return new i.Left((dx.b) ex.d.a(cVar2));
                    } catch (CancellationException e16) {
                        throw e16;
                    }
                }
                params = (Params) cVar.f170205d;
                u.b(objC);
                i iVar = (i) objC;
                if (iVar instanceof i.Left) {
                    return iVar;
                }
                if (!(iVar instanceof i.Right)) {
                    throw new p();
                }
                cc4.a.Result result = (cc4.a.Result) ((i.Right) iVar).b();
                j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar2 = new ex.a();
                    Float sizeInBytes = result.getSizeInBytes();
                    if (sizeInBytes == null) {
                        aVar2.b(this.unknownError);
                        throw new oq.g();
                    }
                    float fFloatValue = sizeInBytes.floatValue();
                    aVar2.a(this.validatePickedFilesSize.a(new q.Params(params.getAllFilesSizeLimit(), new FileSizeLimit(fFloatValue, params.getMaxPhotoSizeInBytes()))));
                    FilePickerMetadata filePickerMetadata = new FilePickerMetadata(params.getFileName(), result.getExtension(), fFloatValue, result.getUri());
                    b bVar2 = this.createFileHandlerUC;
                    b.Params params3 = new b.Params(filePickerMetadata);
                    cVar.f170205d = vq.j.a(params);
                    cVar.f170206e = vq.j.a(iVar);
                    cVar.f170207f = vq.j.a(result);
                    cVar.f170208g = jVarA;
                    cVar.f170209h = vq.j.a(aVar2);
                    cVar.f170210j = vq.j.a(aVar2);
                    cVar.f170211k = vq.j.a(filePickerMetadata);
                    cVar.f170212l = aVar2;
                    cVar.f170213m = 0;
                    cVar.f170214n = 0;
                    cVar.f170215p = 0;
                    cVar.f170216q = 0;
                    cVar.f170217r = 0;
                    cVar.f170218s = 0;
                    cVar.f170219t = 0;
                    cVar.f170220v = fFloatValue;
                    cVar.f170223y = 2;
                    objC = bVar2.d(params3, cVar);
                    if (objC != objE) {
                        bVar = aVar2;
                        return new i.Right(new Result((zz.a) bVar.a((i) objC)));
                    }
                    return objE;
                } catch (ex.c e17) {
                    cVar2 = e17;
                    return new i.Left((dx.b) ex.d.a(cVar2));
                } catch (CancellationException e18) {
                    throw e18;
                } catch (Exception e19) {
                    exc = e19;
                    r15 = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = exc.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, exc, px.c.a(r15));
                    i iVarA = r15.a(exc);
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
            } catch (Exception e25) {
                exc = e25;
                r15 = objE;
            }
        } catch (CancellationException e26) {
            throw e26;
        }
    }
}
