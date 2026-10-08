package hc4;

import java.util.concurrent.CancellationException;
import mx.Label;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lhc4/k;", "Lbc4/k;", "Lbc4/b;", "checkFileSizeUseCase", "Lcc4/a;", "pickPhotoFileContentFromCameraUseCase", "Lmx/c;", "labelProvider", "<init>", "(Lbc4/b;Lcc4/a;Lmx/c;)V", "Ldx/b$c;", "e", "()Ldx/b$c;", "Lbc4/k$a;", "params", "Ldx/i;", "Ldx/b;", "Lbc4/k$b;", "d", "(Lbc4/k$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbc4/b;", "b", "Lcc4/a;", "c", "Lmx/c;", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements bc4.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bc4.b checkFileSizeUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cc4.a pickPhotoFileContentFromCameraUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f83470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f83471e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f83473g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f83471e = obj;
            this.f83473g |= PKIFailureInfo.systemUnavail;
            return k.this.c(null, this);
        }
    }

    public k(bc4.b bVar, cc4.a aVar, mx.c cVar) {
        this.checkFileSizeUseCase = bVar;
        this.pickPhotoFileContentFromCameraUseCase = aVar;
        this.labelProvider = cVar;
    }

    private final dx.b.Business e() {
        return new dx.b.Business(zb4.b.ALLOWED_FILES_NUMBER_EXCEEDED, null, this.labelProvider.c(xb4.a.f217915m), Label.INSTANCE.c(), null, this.labelProvider.c(xb4.a.f217904b), null, 82, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(bc4.k.Params params, tq.e<? super dx.i<? extends dx.b, bc4.k.Result>> eVar) throws Throwable {
        a aVar;
        Object objB;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f83473g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f83473g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f83471e;
        Object objE = uq.b.e();
        int i16 = aVar.f83473g;
        if (i16 == 0) {
            u.b(objC);
            cc4.a aVar2 = this.pickPhotoFileContentFromCameraUseCase;
            cc4.a.Params params2 = new cc4.a.Params(params.getFileName(), params.getDefaultImageMaxSideOverride(), params.getDefaultImageQualityOverride(), params.c());
            aVar.f83470d = params;
            aVar.f83473g = 1;
            objC = aVar2.c(params2, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (bc4.k.Params) aVar.f83470d;
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        cc4.a.Result result = (cc4.a.Result) ((dx.i.Right) iVar).b();
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar3 = new ex.a();
                    Float sizeInBytes = result.getSizeInBytes();
                    if (sizeInBytes == null) {
                        aVar3.b(new dx.b.Business(null, null, this.labelProvider.c(xb4.a.f217926x), null, null, this.labelProvider.c(xb4.a.f217904b), null, 91, null));
                        throw new oq.g();
                    }
                    float fFloatValue = sizeInBytes.floatValue();
                    Float maxPhotoSizeInBytes = params.getMaxPhotoSizeInBytes();
                    if (maxPhotoSizeInBytes != null) {
                        aVar3.a(this.checkFileSizeUseCase.a(new bc4.b.Params(fFloatValue, maxPhotoSizeInBytes.floatValue())));
                    }
                    if (!params.getIsMaxFilesCountExceeded()) {
                        return new dx.i.Right(new bc4.k.Result(new wx.i.Image(new FilePickerMetadata(params.getFileName(), result.getExtension(), fFloatValue, result.getUri()), result.getFileContent())));
                    }
                    aVar3.b(e());
                    throw new oq.g();
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
